package com.mopub.mobileads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.VideoView;
import com.mopub.common.DownloadResponse;
import com.mopub.common.DownloadTask;
import com.mopub.common.DownloadTask.DownloadTaskListener;
import com.mopub.common.HttpClient;
import com.mopub.common.HttpResponses;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Drawables;
import com.mopub.mobileads.util.vast.VastCompanionAd;
import com.mopub.mobileads.util.vast.VastVideoConfiguration;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

public class VastVideoViewController extends BaseVideoViewController
  implements DownloadTask.DownloadTaskListener
{
  static final int DEFAULT_VIDEO_DURATION_FOR_CLOSE_BUTTON = 5000;
  private static final float FIRST_QUARTER_MARKER = 0.25F;
  static final int MAX_VIDEO_DURATION_FOR_CLOSE_BUTTON = 16000;
  private static final int MAX_VIDEO_RETRIES = 1;
  private static final float MID_POINT_MARKER = 0.5F;
  private static final int MOPUB_BROWSER_REQUEST_CODE = 1;
  private static final float THIRD_QUARTER_MARKER = 0.75F;
  static final String VAST_VIDEO_CONFIGURATION = "vast_video_configuration";
  private static final long VIDEO_PROGRESS_TIMER_CHECKER_DELAY = 50L;
  private static final int VIDEO_VIEW_FILE_PERMISSION_ERROR = -2147483648;
  private static final ThreadPoolExecutor sThreadPoolExecutor = new ThreadPoolExecutor(10, 50, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  private final View.OnTouchListener mClickThroughListener;
  private final ImageView mCompanionAdImageView;
  private final Handler mHandler = new Handler();
  private boolean mIsFirstMarkHit;
  private boolean mIsSecondMarkHit;
  private boolean mIsStartMarkHit;
  private boolean mIsThirdMarkHit;
  private boolean mIsVideoFinishedPlaying;
  private boolean mIsVideoProgressShouldBeChecked = false;
  private int mSeekerPositionOnPause = -1;
  private int mShowCloseButtonDelay = 5000;
  private boolean mShowCloseButtonEventFired;
  private final VastCompanionAd mVastCompanionAd;
  private final VastVideoConfiguration mVastVideoConfiguration;
  private final VastVideoToolbar mVastVideoToolbar;
  private final Runnable mVideoProgressCheckerRunnable;
  private int mVideoRetries = 0;
  private final VideoView mVideoView;

  VastVideoViewController(Context paramContext, Bundle paramBundle, long paramLong, BaseVideoViewController.BaseVideoViewControllerListener paramBaseVideoViewControllerListener)
  {
    super(paramContext, paramLong, paramBaseVideoViewControllerListener);
    Serializable localSerializable = paramBundle.getSerializable("vast_video_configuration");
    if ((localSerializable != null) && ((localSerializable instanceof VastVideoConfiguration)))
    {
      this.mVastVideoConfiguration = ((VastVideoConfiguration)localSerializable);
      if (this.mVastVideoConfiguration.getDiskMediaFileUrl() == null)
        throw new IllegalStateException("VastVideoConfiguration does not have a video disk path");
    }
    else
    {
      throw new IllegalStateException("VastVideoConfiguration is invalid");
    }
    this.mVastCompanionAd = this.mVastVideoConfiguration.getVastCompanionAd();
    this.mClickThroughListener = new View.OnTouchListener()
    {
      public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        if ((paramAnonymousMotionEvent.getAction() == 1) && (VastVideoViewController.this.shouldAllowClickThrough()))
          VastVideoViewController.this.handleClick(VastVideoViewController.this.mVastVideoConfiguration.getClickTrackers(), VastVideoViewController.this.mVastVideoConfiguration.getClickThroughUrl());
        return true;
      }
    };
    createVideoBackground(paramContext);
    this.mVideoView = createVideoView(paramContext);
    this.mVideoView.requestFocus();
    this.mVastVideoToolbar = createVastVideoToolBar(paramContext);
    getLayout().addView(this.mVastVideoToolbar);
    this.mCompanionAdImageView = createCompanionAdImageView(paramContext);
    HttpClient.makeTrackingHttpRequest(this.mVastVideoConfiguration.getImpressionTrackers(), paramContext);
    this.mVideoProgressCheckerRunnable = createVideoProgressCheckerRunnable();
  }

  private ImageView createCompanionAdImageView(Context paramContext)
  {
    RelativeLayout localRelativeLayout = new RelativeLayout(paramContext);
    localRelativeLayout.setGravity(17);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams.addRule(3, this.mVastVideoToolbar.getId());
    getLayout().addView(localRelativeLayout, localLayoutParams);
    ImageView localImageView = new ImageView(paramContext);
    localImageView.setVisibility(4);
    localRelativeLayout.addView(localImageView, new RelativeLayout.LayoutParams(-1, -1));
    return localImageView;
  }

  private VastVideoToolbar createVastVideoToolBar(Context paramContext)
  {
    VastVideoToolbar localVastVideoToolbar = new VastVideoToolbar(paramContext);
    localVastVideoToolbar.setCloseButtonOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        if (paramAnonymousMotionEvent.getAction() == 1)
          VastVideoViewController.this.getBaseVideoViewControllerListener().onFinish();
        return true;
      }
    });
    localVastVideoToolbar.setLearnMoreButtonOnTouchListener(this.mClickThroughListener);
    return localVastVideoToolbar;
  }

  private void createVideoBackground(Context paramContext)
  {
    GradientDrawable.Orientation localOrientation = GradientDrawable.Orientation.TOP_BOTTOM;
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = Color.argb(0, 0, 0, 0);
    arrayOfInt[1] = Color.argb(255, 0, 0, 0);
    GradientDrawable localGradientDrawable = new GradientDrawable(localOrientation, arrayOfInt);
    Drawable[] arrayOfDrawable = new Drawable[2];
    arrayOfDrawable[0] = Drawables.THATCHED_BACKGROUND.decodeImage(paramContext);
    arrayOfDrawable[1] = localGradientDrawable;
    LayerDrawable localLayerDrawable = new LayerDrawable(arrayOfDrawable);
    getLayout().setBackgroundDrawable(localLayerDrawable);
  }

  private Runnable createVideoProgressCheckerRunnable()
  {
    return new Runnable()
    {
      public void run()
      {
        float f1 = VastVideoViewController.this.mVideoView.getDuration();
        float f2 = VastVideoViewController.this.mVideoView.getCurrentPosition();
        if (f1 > 0.0F)
        {
          float f3 = f2 / f1;
          if ((!VastVideoViewController.this.mIsStartMarkHit) && (f2 >= 1000.0F))
          {
            VastVideoViewController.access$502(VastVideoViewController.this, true);
            HttpClient.makeTrackingHttpRequest(VastVideoViewController.this.mVastVideoConfiguration.getStartTrackers(), VastVideoViewController.this.getContext());
          }
          if ((!VastVideoViewController.this.mIsFirstMarkHit) && (f3 > 0.25F))
          {
            VastVideoViewController.access$602(VastVideoViewController.this, true);
            HttpClient.makeTrackingHttpRequest(VastVideoViewController.this.mVastVideoConfiguration.getFirstQuartileTrackers(), VastVideoViewController.this.getContext());
          }
          if ((!VastVideoViewController.this.mIsSecondMarkHit) && (f3 > 0.5F))
          {
            VastVideoViewController.access$702(VastVideoViewController.this, true);
            HttpClient.makeTrackingHttpRequest(VastVideoViewController.this.mVastVideoConfiguration.getMidpointTrackers(), VastVideoViewController.this.getContext());
          }
          if ((!VastVideoViewController.this.mIsThirdMarkHit) && (f3 > 0.75F))
          {
            VastVideoViewController.access$802(VastVideoViewController.this, true);
            HttpClient.makeTrackingHttpRequest(VastVideoViewController.this.mVastVideoConfiguration.getThirdQuartileTrackers(), VastVideoViewController.this.getContext());
          }
          if (VastVideoViewController.this.isLongVideo(VastVideoViewController.this.mVideoView.getDuration()))
            VastVideoViewController.this.mVastVideoToolbar.updateCountdownWidget(VastVideoViewController.this.mShowCloseButtonDelay - VastVideoViewController.this.mVideoView.getCurrentPosition());
          if (VastVideoViewController.this.shouldBeInteractable())
            VastVideoViewController.this.makeVideoInteractable();
        }
        VastVideoViewController.this.mVastVideoToolbar.updateDurationWidget(VastVideoViewController.this.mVideoView.getDuration() - VastVideoViewController.this.mVideoView.getCurrentPosition());
        if (VastVideoViewController.this.mIsVideoProgressShouldBeChecked)
          VastVideoViewController.this.mHandler.postDelayed(VastVideoViewController.this.mVideoProgressCheckerRunnable, 50L);
      }
    };
  }

  private VideoView createVideoView(final Context paramContext)
  {
    final VideoView localVideoView = new VideoView(paramContext);
    localVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
    {
      public void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
      {
        if (VastVideoViewController.this.mVideoView.getDuration() < 16000)
          VastVideoViewController.access$1002(VastVideoViewController.this, VastVideoViewController.this.mVideoView.getDuration());
      }
    });
    localVideoView.setOnTouchListener(this.mClickThroughListener);
    localVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
    {
      public void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
      {
        VastVideoViewController.this.stopProgressChecker();
        VastVideoViewController.this.makeVideoInteractable();
        VastVideoViewController.this.videoCompleted(false);
        HttpClient.makeTrackingHttpRequest(VastVideoViewController.this.mVastVideoConfiguration.getCompleteTrackers(), paramContext);
        VastVideoViewController.access$1802(VastVideoViewController.this, true);
        localVideoView.setVisibility(8);
        if (VastVideoViewController.this.mCompanionAdImageView.getDrawable() != null)
          VastVideoViewController.this.mCompanionAdImageView.setVisibility(0);
      }
    });
    localVideoView.setOnErrorListener(new MediaPlayer.OnErrorListener()
    {
      public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        if (VastVideoViewController.this.retryMediaPlayer(paramAnonymousMediaPlayer, paramAnonymousInt1, paramAnonymousInt2))
          return true;
        VastVideoViewController.this.stopProgressChecker();
        VastVideoViewController.this.makeVideoInteractable();
        VastVideoViewController.this.videoError(false);
        return false;
      }
    });
    localVideoView.setVideoPath(this.mVastVideoConfiguration.getDiskMediaFileUrl());
    return localVideoView;
  }

  private void downloadCompanionAd()
  {
    if (this.mVastCompanionAd != null);
    try
    {
      HttpGet localHttpGet = HttpClient.initializeHttpGet(this.mVastCompanionAd.getImageUrl(), getContext());
      AsyncTasks.safeExecuteOnExecutor(new DownloadTask(this), new HttpUriRequest[] { localHttpGet });
      return;
    }
    catch (Exception localException)
    {
      MoPubLog.d("Failed to download companion ad", localException);
    }
  }

  private void handleClick(List<String> paramList, String paramString)
  {
    HttpClient.makeTrackingHttpRequest(paramList, getContext());
    videoClicked();
    Bundle localBundle = new Bundle();
    localBundle.putString("URL", paramString);
    getBaseVideoViewControllerListener().onStartActivityForResult(MoPubBrowser.class, 1, localBundle);
  }

  private boolean isLongVideo(int paramInt)
  {
    return paramInt >= 16000;
  }

  private void makeVideoInteractable()
  {
    this.mShowCloseButtonEventFired = true;
    this.mVastVideoToolbar.makeInteractable();
  }

  private boolean shouldAllowClickThrough()
  {
    return this.mShowCloseButtonEventFired;
  }

  private boolean shouldBeInteractable()
  {
    return (!this.mShowCloseButtonEventFired) && (this.mVideoView.getCurrentPosition() > this.mShowCloseButtonDelay);
  }

  private void startProgressChecker()
  {
    if (!this.mIsVideoProgressShouldBeChecked)
    {
      this.mIsVideoProgressShouldBeChecked = true;
      this.mHandler.post(this.mVideoProgressCheckerRunnable);
    }
  }

  private void stopProgressChecker()
  {
    if (this.mIsVideoProgressShouldBeChecked)
    {
      this.mIsVideoProgressShouldBeChecked = false;
      this.mHandler.removeCallbacks(this.mVideoProgressCheckerRunnable);
    }
  }

  boolean backButtonEnabled()
  {
    return this.mShowCloseButtonEventFired;
  }

  @Deprecated
  ImageView getCompanionAdImageView()
  {
    return this.mCompanionAdImageView;
  }

  @Deprecated
  boolean getIsVideoProgressShouldBeChecked()
  {
    return this.mIsVideoProgressShouldBeChecked;
  }

  @Deprecated
  int getShowCloseButtonDelay()
  {
    return this.mShowCloseButtonDelay;
  }

  @Deprecated
  Runnable getVideoProgressCheckerRunnable()
  {
    return this.mVideoProgressCheckerRunnable;
  }

  @Deprecated
  int getVideoRetries()
  {
    return this.mVideoRetries;
  }

  VideoView getVideoView()
  {
    return this.mVideoView;
  }

  @Deprecated
  boolean isShowCloseButtonEventFired()
  {
    return this.mShowCloseButtonEventFired;
  }

  @Deprecated
  boolean isVideoFinishedPlaying()
  {
    return this.mIsVideoFinishedPlaying;
  }

  void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramInt2 == -1))
      getBaseVideoViewControllerListener().onFinish();
  }

  public void onComplete(String paramString, DownloadResponse paramDownloadResponse)
  {
    if ((paramDownloadResponse != null) && (paramDownloadResponse.getStatusCode() == 200))
    {
      Bitmap localBitmap = HttpResponses.asBitmap(paramDownloadResponse);
      if (localBitmap != null)
      {
        int i = Dips.dipsToIntPixels(localBitmap.getWidth(), getContext());
        int j = Dips.dipsToIntPixels(localBitmap.getHeight(), getContext());
        int k = this.mCompanionAdImageView.getMeasuredWidth();
        int m = this.mCompanionAdImageView.getMeasuredHeight();
        if ((i < k) && (j < m))
        {
          this.mCompanionAdImageView.getLayoutParams().width = i;
          this.mCompanionAdImageView.getLayoutParams().height = j;
        }
        this.mCompanionAdImageView.setImageBitmap(localBitmap);
        this.mCompanionAdImageView.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            if (VastVideoViewController.this.mVastCompanionAd != null)
              VastVideoViewController.this.handleClick(VastVideoViewController.this.mVastCompanionAd.getClickTrackers(), VastVideoViewController.this.mVastCompanionAd.getClickThroughUrl());
          }
        });
      }
    }
  }

  void onCreate()
  {
    super.onCreate();
    getBaseVideoViewControllerListener().onSetRequestedOrientation(0);
    broadcastAction("com.mopub.action.interstitial.show");
    downloadCompanionAd();
  }

  void onDestroy()
  {
    stopProgressChecker();
    broadcastAction("com.mopub.action.interstitial.dismiss");
  }

  void onPause()
  {
    stopProgressChecker();
    this.mSeekerPositionOnPause = this.mVideoView.getCurrentPosition();
    this.mVideoView.pause();
  }

  void onResume()
  {
    this.mVideoRetries = 0;
    startProgressChecker();
    this.mVideoView.seekTo(this.mSeekerPositionOnPause);
    if (!this.mIsVideoFinishedPlaying)
      this.mVideoView.start();
  }

  // ERROR //
  boolean retryMediaPlayer(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: invokestatic 555	com/mopub/common/util/VersionCode:currentApiLevel	()Lcom/mopub/common/util/VersionCode;
    //   3: getstatic 559	com/mopub/common/util/VersionCode:JELLY_BEAN	Lcom/mopub/common/util/VersionCode;
    //   6: invokevirtual 563	com/mopub/common/util/VersionCode:isBelow	(Lcom/mopub/common/util/VersionCode;)Z
    //   9: ifeq +130 -> 139
    //   12: iload_2
    //   13: iconst_1
    //   14: if_icmpne +125 -> 139
    //   17: iload_3
    //   18: ldc 31
    //   20: if_icmpne +119 -> 139
    //   23: aload_0
    //   24: getfield 97	com/mopub/mobileads/VastVideoViewController:mVideoRetries	I
    //   27: ifgt +112 -> 139
    //   30: aconst_null
    //   31: astore 4
    //   33: aload_1
    //   34: invokevirtual 568	android/media/MediaPlayer:reset	()V
    //   37: new 570	java/io/FileInputStream
    //   40: dup
    //   41: new 572	java/io/File
    //   44: dup
    //   45: aload_0
    //   46: getfield 107	com/mopub/mobileads/VastVideoViewController:mVastVideoConfiguration	Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;
    //   49: invokevirtual 111	com/mopub/mobileads/util/vast/VastVideoConfiguration:getDiskMediaFileUrl	()Ljava/lang/String;
    //   52: invokespecial 573	java/io/File:<init>	(Ljava/lang/String;)V
    //   55: invokespecial 576	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   58: astore 8
    //   60: aload_1
    //   61: aload 8
    //   63: invokevirtual 580	java/io/FileInputStream:getFD	()Ljava/io/FileDescriptor;
    //   66: invokevirtual 584	android/media/MediaPlayer:setDataSource	(Ljava/io/FileDescriptor;)V
    //   69: aload_1
    //   70: invokevirtual 587	android/media/MediaPlayer:prepareAsync	()V
    //   73: aload_0
    //   74: getfield 143	com/mopub/mobileads/VastVideoViewController:mVideoView	Landroid/widget/VideoView;
    //   77: invokevirtual 547	android/widget/VideoView:start	()V
    //   80: aload 8
    //   82: invokestatic 593	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   85: aload_0
    //   86: iconst_1
    //   87: aload_0
    //   88: getfield 97	com/mopub/mobileads/VastVideoViewController:mVideoRetries	I
    //   91: iadd
    //   92: putfield 97	com/mopub/mobileads/VastVideoViewController:mVideoRetries	I
    //   95: iconst_1
    //   96: ireturn
    //   97: astore 6
    //   99: aconst_null
    //   100: astore 7
    //   102: aload 7
    //   104: invokestatic 593	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   107: aload_0
    //   108: iconst_1
    //   109: aload_0
    //   110: getfield 97	com/mopub/mobileads/VastVideoViewController:mVideoRetries	I
    //   113: iadd
    //   114: putfield 97	com/mopub/mobileads/VastVideoViewController:mVideoRetries	I
    //   117: iconst_0
    //   118: ireturn
    //   119: astore 5
    //   121: aload 4
    //   123: invokestatic 593	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   126: aload_0
    //   127: iconst_1
    //   128: aload_0
    //   129: getfield 97	com/mopub/mobileads/VastVideoViewController:mVideoRetries	I
    //   132: iadd
    //   133: putfield 97	com/mopub/mobileads/VastVideoViewController:mVideoRetries	I
    //   136: aload 5
    //   138: athrow
    //   139: iconst_0
    //   140: ireturn
    //   141: astore 5
    //   143: aload 8
    //   145: astore 4
    //   147: goto -26 -> 121
    //   150: astore 9
    //   152: aload 8
    //   154: astore 7
    //   156: goto -54 -> 102
    //
    // Exception table:
    //   from	to	target	type
    //   33	60	97	java/lang/Exception
    //   33	60	119	finally
    //   60	80	141	finally
    //   60	80	150	java/lang/Exception
  }

  @Deprecated
  void setCloseButtonVisible(boolean paramBoolean)
  {
    this.mShowCloseButtonEventFired = paramBoolean;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.VastVideoViewController
 * JD-Core Version:    0.6.2
 */