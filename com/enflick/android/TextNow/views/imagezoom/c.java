package com.enflick.android.TextNow.views.imagezoom;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

public final class c extends GestureDetector.SimpleOnGestureListener
{
  public c(ImageViewTouch paramImageViewTouch)
  {
  }

  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    new StringBuilder().append("onDoubleTap. double tap enabled? ").append(this.a.h).toString();
    if (this.a.h)
    {
      this.a.q = true;
      float f1 = this.a.g();
      float f2 = this.a.a(f1, this.a.e());
      float f3 = Math.min(this.a.e(), Math.max(f2, this.a.f()));
      this.a.a(f3, paramMotionEvent.getX(), paramMotionEvent.getY(), 200.0F);
      this.a.invalidate();
    }
    if (ImageViewTouch.b(this.a) != null)
      ImageViewTouch.b(this.a);
    return super.onDoubleTap(paramMotionEvent);
  }

  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    return this.a.b();
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (!this.a.j);
    while ((paramMotionEvent1.getPointerCount() > 1) || (paramMotionEvent2.getPointerCount() > 1) || (this.a.a.isInProgress()) || (this.a.g() == 1.0F))
      return false;
    return this.a.a(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
  }

  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    if ((this.a.isLongClickable()) && (!this.a.a.isInProgress()))
    {
      this.a.setPressed(true);
      this.a.performLongClick();
    }
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (!this.a.j);
    while ((paramMotionEvent1 == null) || (paramMotionEvent2 == null) || (paramMotionEvent1.getPointerCount() > 1) || (paramMotionEvent2.getPointerCount() > 1) || (this.a.a.isInProgress()))
      return false;
    return this.a.b(paramFloat1, paramFloat2);
  }

  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    if (ImageViewTouch.a(this.a) != null)
      ImageViewTouch.a(this.a);
    return ImageViewTouch.a();
  }

  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return this.a.c();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.imagezoom.c
 * JD-Core Version:    0.6.2
 */