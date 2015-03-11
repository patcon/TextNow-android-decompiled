package android.support.v4.widget;

import android.view.animation.AnimationUtils;

final class b
{
  private int a;
  private int b;
  private float c;
  private float d;
  private long e = -9223372036854775808L;
  private long f = 0L;
  private int g = 0;
  private int h = 0;
  private long i = -1L;
  private float j;
  private int k;

  private float a(long paramLong)
  {
    if (paramLong < this.e)
      return 0.0F;
    if ((this.i < 0L) || (paramLong < this.i))
      return 0.5F * a.a((float)(paramLong - this.e) / this.a, 0.0F, 1.0F);
    long l = paramLong - this.i;
    return 1.0F - this.j + this.j * a.a((float)l / this.k, 0.0F, 1.0F);
  }

  public final void a()
  {
    this.e = AnimationUtils.currentAnimationTimeMillis();
    this.i = -1L;
    this.f = this.e;
    this.j = 0.5F;
    this.g = 0;
    this.h = 0;
  }

  public final void a(float paramFloat1, float paramFloat2)
  {
    this.c = paramFloat1;
    this.d = paramFloat2;
  }

  public final void a(int paramInt)
  {
    this.a = paramInt;
  }

  public final void b()
  {
    long l = AnimationUtils.currentAnimationTimeMillis();
    this.k = a.a((int)(l - this.e), 0, this.b);
    this.j = a(l);
    this.i = l;
  }

  public final void b(int paramInt)
  {
    this.b = paramInt;
  }

  public final boolean c()
  {
    return (this.i > 0L) && (AnimationUtils.currentAnimationTimeMillis() > this.i + this.k);
  }

  public final void d()
  {
    if (this.f == 0L)
      throw new RuntimeException("Cannot compute scroll delta before calling start()");
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    float f1 = a(l1);
    float f2 = f1 * (-4.0F * f1) + f1 * 4.0F;
    long l2 = l1 - this.f;
    this.f = l1;
    this.g = ((int)(f2 * (float)l2 * this.c));
    this.h = ((int)(f2 * (float)l2 * this.d));
  }

  public final int e()
  {
    return (int)(this.c / Math.abs(this.c));
  }

  public final int f()
  {
    return (int)(this.d / Math.abs(this.d));
  }

  public final int g()
  {
    return this.g;
  }

  public final int h()
  {
    return this.h;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.b
 * JD-Core Version:    0.6.2
 */