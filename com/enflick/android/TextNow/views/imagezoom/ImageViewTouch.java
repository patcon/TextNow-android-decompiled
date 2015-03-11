package com.enflick.android.TextNow.views.imagezoom;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ViewConfiguration;

public class ImageViewTouch extends ImageViewTouchBase
{
  protected ScaleGestureDetector a;
  protected GestureDetector b;
  protected int c;
  protected float d;
  protected int e;
  protected GestureDetector.OnGestureListener f;
  protected ScaleGestureDetector.OnScaleGestureListener g;
  protected boolean h = true;
  protected boolean i = true;
  protected boolean j = true;
  private d y;
  private e z;

  public ImageViewTouch(Context paramContext)
  {
    super(paramContext);
  }

  public ImageViewTouch(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ImageViewTouch(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static boolean a()
  {
    return true;
  }

  protected final float a(float paramFloat1, float paramFloat2)
  {
    if (this.e == 1)
    {
      if (paramFloat1 + 2.0F * this.d <= paramFloat2)
        return paramFloat1 + this.d;
      this.e = -1;
      return paramFloat2;
    }
    this.e = 1;
    return 1.0F;
  }

  protected final void a(float paramFloat)
  {
    new StringBuilder().append("onZoomAnimationCompleted. scale: ").append(paramFloat).append(", minZoom: ").append(f()).toString();
    if (paramFloat < f())
      c(f(), 50.0F);
  }

  protected final void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramContext, paramAttributeSet, paramInt);
    this.c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.f = new c(this);
    this.g = new f(this);
    this.a = new ScaleGestureDetector(getContext(), this.g);
    this.b = new GestureDetector(getContext(), this.f, null, true);
    this.e = 1;
  }

  protected final void a(Drawable paramDrawable, Matrix paramMatrix, float paramFloat1, float paramFloat2)
  {
    super.a(paramDrawable, paramMatrix, paramFloat1, paramFloat2);
    this.d = (e() / 3.0F);
  }

  public final boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    float f1 = paramMotionEvent2.getX() - paramMotionEvent1.getX();
    float f2 = paramMotionEvent2.getY() - paramMotionEvent1.getY();
    if ((Math.abs(paramFloat1) > 800.0F) || (Math.abs(paramFloat2) > 800.0F))
    {
      this.q = true;
      a(f1 / 2.0F, f2 / 2.0F, 300.0D);
      invalidate();
      return true;
    }
    return false;
  }

  public final boolean b()
  {
    return !d();
  }

  public final boolean b(float paramFloat1, float paramFloat2)
  {
    if (g() == 1.0F)
      return false;
    this.q = true;
    d(-paramFloat1, -paramFloat2);
    invalidate();
    return true;
  }

  public final boolean c()
  {
    return !d();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (d());
    do
    {
      return false;
      this.a.onTouchEvent(paramMotionEvent);
      if (!this.a.isInProgress())
        this.b.onTouchEvent(paramMotionEvent);
      switch (0xFF & paramMotionEvent.getAction())
      {
      default:
        return true;
      case 1:
      }
    }
    while (d());
    if (g() < f())
      c(f(), 50.0F);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.imagezoom.ImageViewTouch
 * JD-Core Version:    0.6.2
 */