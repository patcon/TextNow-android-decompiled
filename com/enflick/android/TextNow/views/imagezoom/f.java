package com.enflick.android.TextNow.views.imagezoom;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

public final class f extends ScaleGestureDetector.SimpleOnScaleGestureListener
{
  protected boolean a = false;

  public f(ImageViewTouch paramImageViewTouch)
  {
  }

  public final boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    float f1 = paramScaleGestureDetector.getCurrentSpan() - paramScaleGestureDetector.getPreviousSpan();
    float f2 = this.b.g() * paramScaleGestureDetector.getScaleFactor();
    if (this.b.i)
    {
      if ((!this.a) || (f1 == 0.0F))
        break label114;
      this.b.q = true;
      f3 = Math.min(this.b.e(), Math.max(f2, this.b.f() - 0.1F));
      this.b.a(f3, paramScaleGestureDetector.getFocusX(), paramScaleGestureDetector.getFocusY());
      this.b.e = 1;
      this.b.invalidate();
    }
    label114: 
    while (this.a)
    {
      float f3;
      return true;
    }
    this.a = true;
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.imagezoom.f
 * JD-Core Version:    0.6.2
 */