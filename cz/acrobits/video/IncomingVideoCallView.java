package cz.acrobits.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import cz.acrobits.ali.AndroidUtil;

public class IncomingVideoCallView extends VideoCallView
  implements Runnable
{
  public static final int REFRESH_DELAY = 67;
  private int mHeight;
  private IncomingVideoCallView.IncomingVideoListener mIncomingVideoListener = null;
  private int mLastFrame;
  private int mSessionId;
  private int mWidth;

  public IncomingVideoCallView(Context paramContext)
  {
    super(paramContext);
  }

  public IncomingVideoCallView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public IncomingVideoCallView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public Drawable getBackground()
  {
    Drawable localDrawable = super.getBackground();
    if (localDrawable != null)
      return localDrawable;
    View localView = (View)getParent();
    if (localView == null)
      return null;
    return localView.getBackground();
  }

  public native boolean isVideoRunning();

  protected void onRotationChanged()
  {
    if (isRunning())
      requestFrameUpdate();
  }

  protected void onStart()
  {
    AndroidUtil.handler.postDelayed(this, 67L);
    update(this.mCallId);
  }

  protected void onStop()
  {
    AndroidUtil.handler.removeCallbacks(this);
  }

  public void refresh()
  {
    this.mWidth = -1;
    this.mHeight = -1;
    requestFrameUpdate();
  }

  public void refreshBackground()
  {
    SurfaceHolder localSurfaceHolder = this.mSurfaceView.getHolder();
    Canvas localCanvas = localSurfaceHolder.lockCanvas();
    if (localCanvas == null)
      return;
    refreshBackground(localCanvas);
    localSurfaceHolder.unlockCanvasAndPost(localCanvas);
  }

  protected void refreshBackground(Canvas paramCanvas)
  {
    Drawable localDrawable = getBackground();
    if (localDrawable != null)
      localDrawable.draw(paramCanvas);
  }

  protected native void requestFrameUpdate();

  protected native void requestSessionId();

  public void reset()
  {
    this.mSurfaceView = new SurfaceView(getContext());
    this.mSurfaceView.getHolder().addCallback(this);
    if (!this.mSurfaceView.getHolder().isCreating());
    for (boolean bool = true; ; bool = false)
    {
      this.mHasSurface = bool;
      removeAllViews();
      addView(this.mSurfaceView);
      return;
    }
  }

  public void run()
  {
    if (!isRunning());
    do
    {
      return;
      AndroidUtil.handler.postDelayed(this, 67L);
    }
    while (!this.mHasSurface);
    requestFrameUpdate();
  }

  public void setIncomingVideoListener(IncomingVideoCallView.IncomingVideoListener paramIncomingVideoListener)
  {
    this.mIncomingVideoListener = paramIncomingVideoListener;
  }

  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    super.surfaceCreated(paramSurfaceHolder);
    if (this.mHasSurface)
      refreshBackground();
  }

  public void update(String paramString)
  {
    super.update(paramString);
    this.mLastFrame = 0;
    this.mWidth = -1;
    this.mHeight = -1;
    requestSessionId();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.video.IncomingVideoCallView
 * JD-Core Version:    0.6.2
 */