package android.support.v4.widget;

import android.content.res.Resources;
import android.support.v4.view.af;
import android.support.v4.view.av;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

public abstract class a
  implements View.OnTouchListener
{
  private static final int r = ViewConfiguration.getTapTimeout();
  private final b a = new b();
  private final Interpolator b = new AccelerateInterpolator();
  private final View c;
  private Runnable d;
  private float[] e = { 0.0F, 0.0F };
  private float[] f = { 3.4028235E+38F, 3.4028235E+38F };
  private int g;
  private int h;
  private float[] i = { 0.0F, 0.0F };
  private float[] j = { 0.0F, 0.0F };
  private float[] k = { 3.4028235E+38F, 3.4028235E+38F };
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private boolean p;
  private boolean q;

  public a(View paramView)
  {
    this.c = paramView;
    DisplayMetrics localDisplayMetrics = Resources.getSystem().getDisplayMetrics();
    int i1 = (int)(0.5F + 1575.0F * localDisplayMetrics.density);
    int i2 = (int)(0.5F + 315.0F * localDisplayMetrics.density);
    float f1 = i1;
    float f2 = i1;
    this.k[0] = (f1 / 1000.0F);
    this.k[1] = (f2 / 1000.0F);
    float f3 = i2;
    float f4 = i2;
    this.j[0] = (f3 / 1000.0F);
    this.j[1] = (f4 / 1000.0F);
    this.g = 1;
    this.f[0] = 3.4028235E+38F;
    this.f[1] = 3.4028235E+38F;
    this.e[0] = 0.2F;
    this.e[1] = 0.2F;
    this.i[0] = 0.001F;
    this.i[1] = 0.001F;
    this.h = r;
    this.a.a(500);
    this.a.b(500);
  }

  private float a(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 == 0.0F);
    do
    {
      do
      {
        do
        {
          return 0.0F;
          switch (this.g)
          {
          default:
            return 0.0F;
          case 0:
          case 1:
          case 2:
          }
        }
        while (paramFloat1 >= paramFloat2);
        if (paramFloat1 >= 0.0F)
          return 1.0F - paramFloat1 / paramFloat2;
      }
      while ((!this.o) || (this.g != 1));
      return 1.0F;
    }
    while (paramFloat1 >= 0.0F);
    return paramFloat1 / -paramFloat2;
  }

  private float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = this.e[paramInt];
    float f2 = this.f[paramInt];
    float f3 = b(f1 * paramFloat2, 0.0F, f2);
    float f4 = a(paramFloat1, f3);
    float f5 = a(paramFloat2 - paramFloat1, f3) - f4;
    float f11;
    if (f5 < 0.0F)
      f11 = -this.b.getInterpolation(-f5);
    for (float f6 = b(f11, -1.0F, 1.0F); ; f6 = 0.0F)
    {
      if (f6 != 0.0F)
        break label121;
      return 0.0F;
      if (f5 > 0.0F)
      {
        f11 = this.b.getInterpolation(f5);
        break;
      }
    }
    label121: float f7 = this.i[paramInt];
    float f8 = this.j[paramInt];
    float f9 = this.k[paramInt];
    float f10 = f7 * paramFloat3;
    if (f6 > 0.0F)
      return b(f6 * f10, f8, f9);
    return -b(f10 * -f6, f8, f9);
  }

  private boolean a()
  {
    b localb = this.a;
    int i1 = localb.f();
    int i2 = localb.e();
    if ((i1 == 0) || (!b(i1)))
    {
      if (i2 != 0);
      return false;
    }
    return true;
  }

  private static float b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > paramFloat3)
      return paramFloat3;
    if (paramFloat1 < paramFloat2)
      return paramFloat2;
    return paramFloat1;
  }

  private void b()
  {
    if (this.m)
    {
      this.o = false;
      return;
    }
    this.a.b();
  }

  public final a a(boolean paramBoolean)
  {
    if ((this.p) && (!paramBoolean))
      b();
    this.p = paramBoolean;
    return this;
  }

  public abstract void a(int paramInt);

  public abstract boolean b(int paramInt);

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (!this.p);
    while (true)
    {
      return false;
      switch (af.a(paramMotionEvent))
      {
      default:
      case 0:
      case 2:
      case 1:
      case 3:
      }
      while ((this.q) && (this.o))
      {
        return true;
        this.n = true;
        this.l = false;
        float f1 = a(0, paramMotionEvent.getX(), paramView.getWidth(), this.c.getWidth());
        float f2 = a(1, paramMotionEvent.getY(), paramView.getHeight(), this.c.getHeight());
        this.a.a(f1, f2);
        if ((!this.o) && (a()))
        {
          if (this.d == null)
            this.d = new c(this, (byte)0);
          this.o = true;
          this.m = true;
          if ((!this.l) && (this.h > 0))
            av.a(this.c, this.d, this.h);
          while (true)
          {
            this.l = true;
            break;
            this.d.run();
          }
          b();
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.a
 * JD-Core Version:    0.6.2
 */