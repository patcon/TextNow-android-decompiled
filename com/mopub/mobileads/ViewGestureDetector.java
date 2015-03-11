package com.mopub.mobileads;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.mopub.common.logging.MoPubLog;

public class ViewGestureDetector extends GestureDetector
{
  private AdAlertGestureListener mAdAlertGestureListener;
  private ViewGestureDetector.UserClickListener mUserClickListener;
  private final View mView;

  private ViewGestureDetector(Context paramContext, View paramView, AdAlertGestureListener paramAdAlertGestureListener)
  {
    super(paramContext, paramAdAlertGestureListener);
    this.mAdAlertGestureListener = paramAdAlertGestureListener;
    this.mView = paramView;
    setIsLongpressEnabled(false);
  }

  public ViewGestureDetector(Context paramContext, View paramView, AdConfiguration paramAdConfiguration)
  {
    this(paramContext, paramView, new AdAlertGestureListener(paramView, paramAdConfiguration));
  }

  private boolean isMotionEventInView(MotionEvent paramMotionEvent, View paramView)
  {
    if ((paramMotionEvent == null) || (paramView == null));
    float f1;
    float f2;
    do
    {
      return false;
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
    }
    while ((f1 < 0.0F) || (f1 > paramView.getWidth()) || (f2 < 0.0F) || (f2 > paramView.getHeight()));
    return true;
  }

  void resetAdFlaggingGesture()
  {
    this.mAdAlertGestureListener.reset();
  }

  void sendTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default:
      return;
    case 1:
      if (this.mUserClickListener != null)
        this.mUserClickListener.onUserClick();
      while (true)
      {
        this.mAdAlertGestureListener.finishGestureDetection();
        return;
        MoPubLog.d("View's onUserClick() is not registered.");
      }
    case 0:
      onTouchEvent(paramMotionEvent);
      return;
    case 2:
    }
    if (isMotionEventInView(paramMotionEvent, this.mView))
    {
      onTouchEvent(paramMotionEvent);
      return;
    }
    resetAdFlaggingGesture();
  }

  @Deprecated
  void setAdAlertGestureListener(AdAlertGestureListener paramAdAlertGestureListener)
  {
    this.mAdAlertGestureListener = paramAdAlertGestureListener;
  }

  void setUserClickListener(ViewGestureDetector.UserClickListener paramUserClickListener)
  {
    this.mUserClickListener = paramUserClickListener;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.ViewGestureDetector
 * JD-Core Version:    0.6.2
 */