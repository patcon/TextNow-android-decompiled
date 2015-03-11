package com.mopub.mobileads;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.VideoView;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Drawables;

public class MraidVideoViewController extends BaseVideoViewController
{
  private static final float CLOSE_BUTTON_PADDING = 8.0F;
  private static final float CLOSE_BUTTON_SIZE = 50.0F;
  private int mButtonPadding;
  private int mButtonSize;
  private ImageButton mCloseButton;
  private final VideoView mVideoView;

  MraidVideoViewController(Context paramContext, Bundle paramBundle, long paramLong, BaseVideoViewController.BaseVideoViewControllerListener paramBaseVideoViewControllerListener)
  {
    super(paramContext, paramLong, paramBaseVideoViewControllerListener);
    this.mVideoView = new VideoView(paramContext);
    this.mVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
    {
      public void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
      {
        MraidVideoViewController.this.mCloseButton.setVisibility(0);
        MraidVideoViewController.this.videoCompleted(true);
      }
    });
    this.mVideoView.setOnErrorListener(new MediaPlayer.OnErrorListener()
    {
      public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        MraidVideoViewController.this.mCloseButton.setVisibility(0);
        MraidVideoViewController.this.videoError(false);
        return false;
      }
    });
    this.mVideoView.setVideoPath(paramBundle.getString("video_url"));
  }

  private void createInterstitialCloseButton()
  {
    this.mCloseButton = new ImageButton(getContext());
    StateListDrawable localStateListDrawable = new StateListDrawable();
    localStateListDrawable.addState(new int[] { -16842919 }, Drawables.INTERSTITIAL_CLOSE_BUTTON_NORMAL.decodeImage(getContext()));
    localStateListDrawable.addState(new int[] { 16842919 }, Drawables.INTERSTITIAL_CLOSE_BUTTON_PRESSED.decodeImage(getContext()));
    this.mCloseButton.setImageDrawable(localStateListDrawable);
    this.mCloseButton.setBackgroundDrawable(null);
    this.mCloseButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        MraidVideoViewController.this.getBaseVideoViewControllerListener().onFinish();
      }
    });
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(this.mButtonSize, this.mButtonSize);
    localLayoutParams.addRule(11);
    localLayoutParams.setMargins(this.mButtonPadding, 0, this.mButtonPadding, 0);
    getLayout().addView(this.mCloseButton, localLayoutParams);
  }

  VideoView getVideoView()
  {
    return this.mVideoView;
  }

  void onCreate()
  {
    super.onCreate();
    this.mButtonSize = Dips.asIntPixels(50.0F, getContext());
    this.mButtonPadding = Dips.asIntPixels(8.0F, getContext());
    createInterstitialCloseButton();
    this.mCloseButton.setVisibility(8);
    this.mVideoView.start();
  }

  void onDestroy()
  {
  }

  void onPause()
  {
  }

  void onResume()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidVideoViewController
 * JD-Core Version:    0.6.2
 */