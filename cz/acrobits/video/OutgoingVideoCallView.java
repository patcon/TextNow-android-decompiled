package cz.acrobits.video;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.WindowManager;
import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.libsoftphone.Instance.Video;

public class OutgoingVideoCallView extends VideoCallView
{
  public OutgoingVideoCallView(Context paramContext)
  {
    super(paramContext);
    create();
  }

  public OutgoingVideoCallView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    create();
  }

  public OutgoingVideoCallView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    create();
  }

  private void create()
  {
    this.mSurfaceView.setZOrderOnTop(true);
    this.mSurfaceView.getHolder().setType(3);
  }

  private native OutgoingVideoCallView.Size getPreviewSize();

  private native boolean isVideoCapturePrepared();

  private native void setPreviewDisplay();

  private native void startPreparedVideoCapture();

  private native void stopPreparedVideoCapture();

  protected void notifyVideoCapturePrepared()
  {
    AndroidUtil.handler.post(new Runnable()
    {
      public void run()
      {
        if ((OutgoingVideoCallView.this.isRunning()) && (OutgoingVideoCallView.this.mHasSurface))
          OutgoingVideoCallView.this.onStart();
      }
    });
  }

  protected native void onRotationChanged();

  protected void onStart()
  {
    if (!isVideoCapturePrepared())
      return;
    updateLayout();
    setVisibility(0);
    setPreviewDisplay();
  }

  protected void onStop()
  {
    stopPreparedVideoCapture();
    setVisibility(8);
    if ((!((Activity)getContext()).isFinishing()) && (isRunning()));
  }

  public void refresh()
  {
    startPreparedVideoCapture();
  }

  protected void resetViews()
  {
    boolean bool = true;
    if (isRunning())
      onStop();
    removeAllViews();
    this.mSurfaceView = new SurfaceView(getContext());
    this.mSurfaceView.setZOrderOnTop(bool);
    this.mSurfaceView.getHolder().setType(3);
    this.mSurfaceView.getHolder().addCallback(this);
    if (!this.mSurfaceView.getHolder().isCreating());
    while (true)
    {
      this.mHasSurface = bool;
      addView(this.mSurfaceView);
      updateLayout();
      if ((isRunning()) && (this.mHasSurface))
        doStart();
      return;
      bool = false;
    }
  }

  public void start(String paramString1, String paramString2)
  {
    Instance.Video.switchCamera(paramString2);
    super.start(paramString1);
  }

  protected void updateLayout()
  {
    OutgoingVideoCallView.Size localSize = getPreviewSize();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((Activity)getContext()).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    float f = Math.min(localDisplayMetrics.widthPixels / 4 / localSize.width, localDisplayMetrics.heightPixels / 4 / localSize.height);
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    localLayoutParams.width = ((int)(f * localSize.width));
    localLayoutParams.height = ((int)(f * localSize.height));
    getParent().requestLayout();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.video.OutgoingVideoCallView
 * JD-Core Version:    0.6.2
 */