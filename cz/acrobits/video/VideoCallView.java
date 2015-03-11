package cz.acrobits.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.FrameLayout;
import cz.acrobits.ali.AndroidUtil;

public abstract class VideoCallView extends FrameLayout
  implements SurfaceHolder.Callback
{
  protected int[] mCache = null;
  protected String mCallId = null;
  protected boolean mHasSurface = false;
  protected boolean mPaused = false;
  protected Paint mPreviewPaint = new Paint(2);
  protected int mRotation = 0;
  protected int mStoppedVisibility;
  protected SurfaceView mSurfaceView;

  public VideoCallView(Context paramContext)
  {
    super(paramContext);
    create(paramContext);
  }

  public VideoCallView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    create(paramContext);
  }

  public VideoCallView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    create(paramContext);
  }

  private void create(Context paramContext)
  {
    boolean bool = true;
    this.mStoppedVisibility = getVisibility();
    if (this.mStoppedVisibility == 0)
    {
      this.mStoppedVisibility = 4;
      setVisibility(4);
    }
    this.mSurfaceView = new SurfaceView(paramContext);
    this.mSurfaceView.setZOrderMediaOverlay(bool);
    this.mSurfaceView.getHolder().addCallback(this);
    if (!this.mSurfaceView.getHolder().isCreating());
    while (true)
    {
      this.mHasSurface = bool;
      addView(this.mSurfaceView);
      return;
      bool = false;
    }
  }

  public static int getSurfaceRotation()
  {
    switch (((Activity)AndroidUtil.getContext()).getWindowManager().getDefaultDisplay().getRotation())
    {
    default:
      return 0;
    case 0:
      return 0;
    case 1:
      return 90;
    case 2:
      return 180;
    case 3:
    }
    return 270;
  }

  protected void doStart()
  {
    AndroidUtil.handler.postDelayed(new Runnable()
    {
      public void run()
      {
        VideoCallView.this.onStart();
      }
    }
    , 200L);
  }

  public native int getOrientation();

  public boolean isRunning()
  {
    return this.mCallId != null;
  }

  protected abstract void onRotationChanged();

  protected abstract void onStart();

  protected abstract void onStop();

  public abstract void refresh();

  public void start(String paramString)
  {
    if (isRunning())
      update(paramString);
    do
    {
      return;
      if (this.mRotation == 0)
        updateOrientation(getSurfaceRotation());
      setVisibility(0);
      this.mCallId = paramString;
    }
    while ((!this.mHasSurface) || (this.mPaused));
    doStart();
  }

  public void stop()
  {
    if (!isRunning())
      return;
    setVisibility(this.mStoppedVisibility);
    this.mCallId = null;
    if ((this.mHasSurface) && (!this.mPaused))
      onStop();
    this.mCache = null;
  }

  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramSurfaceHolder != this.mSurfaceView.getHolder()) || (!this.mHasSurface) || (!isRunning()) || (this.mPaused))
      return;
    refresh();
  }

  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    if ((paramSurfaceHolder != this.mSurfaceView.getHolder()) || (this.mHasSurface));
    do
    {
      return;
      this.mHasSurface = true;
    }
    while ((!isRunning()) || (this.mPaused));
    doStart();
  }

  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    if ((paramSurfaceHolder != this.mSurfaceView.getHolder()) || (!this.mHasSurface));
    do
    {
      return;
      this.mHasSurface = false;
    }
    while ((!isRunning()) || (this.mPaused));
    onStop();
  }

  public void update(String paramString)
  {
    if (!isRunning())
      throw new IllegalStateException("Cannot update VideoCallView that is not running");
    this.mCallId = paramString;
  }

  public native void updateOrientation(int paramInt);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.video.VideoCallView
 * JD-Core Version:    0.6.2
 */