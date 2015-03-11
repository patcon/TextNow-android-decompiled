package textnow.ax;

import android.graphics.Canvas;

public final class aa
{
  public boolean a = false;
  private at b;
  private int c;
  private int d;
  private long e;
  private boolean f;
  private float g;
  private float h;
  private float i;
  private float j;

  public aa(at paramat)
  {
    this.b = paramat;
    this.f = false;
    this.e = 0L;
  }

  private int a(as paramas, ah paramah, int paramInt)
  {
    int k = Math.round(paramah.a - this.b.c + paramInt - this.g + this.i);
    int m = Math.round(k + paramah.f);
    if (k < paramas.a() / -2.0F)
      paramInt += (int)(paramas.a() / -2.0F) - k;
    while (m <= paramas.a() / 2.0F)
      return paramInt;
    return paramInt + ((int)(paramas.a() / 2.0F) - m);
  }

  private void a(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.d = paramInt2;
    this.b.c = (this.c - this.g + this.i);
    this.b.d = (this.d - this.h + this.j);
  }

  private int b(as paramas, ah paramah, int paramInt)
  {
    int k = Math.round(paramah.b - this.b.d + paramInt - this.h + this.j);
    int m = Math.round(k + paramah.g);
    if (k < paramas.b() / -2.0F)
      paramInt += (int)(paramas.b() / -2.0F) - k;
    while (m <= paramas.b() / 2.0F)
      return paramInt;
    return paramInt + ((int)(paramas.b() / 2.0F) - m);
  }

  public final void a()
  {
    this.f = false;
    this.e = 0L;
    this.i = 0.0F;
    this.j = 0.0F;
    this.g = 0.0F;
    this.h = 0.0F;
    this.c = 0;
    this.d = 0;
    this.a = false;
    this.b.c = 0.0F;
    this.b.d = 0.0F;
  }

  public final void a(long paramLong)
  {
    if ((this.b instanceof bk))
    {
      ao localao = ((bk)this.b).h();
      this.e = ((paramLong + this.e) % localao.b());
    }
  }

  public final void a(as paramas)
  {
    paramas.a.save();
    if (this.f)
    {
      paramas.a.translate(-this.g, -this.h);
      paramas.a.translate(this.i, this.j);
      paramas.a.translate(this.c, this.d);
    }
    this.b.a(paramas, this.e);
    paramas.a.restore();
  }

  public final void a(as paramas, int paramInt1, int paramInt2)
  {
    ah localah = this.b.c(paramas, this.e);
    a(a(paramas, localah, paramInt1), b(paramas, localah, paramInt2));
  }

  public final void a(as paramas, int paramInt1, int paramInt2, long paramLong)
  {
    ah localah = this.b.c(paramas, paramLong);
    if (!this.f)
    {
      this.f = true;
      this.e = paramLong;
      this.g = localah.a;
      this.h = localah.b;
    }
    this.i = (localah.a - paramInt1);
    this.j = (localah.b - paramInt2);
    a(paramInt1, paramInt2);
  }

  public final at b()
  {
    return this.b;
  }

  public final void b(as paramas, int paramInt1, int paramInt2)
  {
    ah localah = this.b.c(paramas, this.e);
    a(a(paramas, localah, paramInt1), b(paramas, localah, paramInt2));
  }

  public final boolean c(as paramas, int paramInt1, int paramInt2)
  {
    ah localah = this.b.c(paramas, this.e);
    return (paramInt1 >= localah.a) && (paramInt2 >= localah.b) && (paramInt1 < localah.a + localah.f) && (paramInt2 < localah.b + localah.g);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.aa
 * JD-Core Version:    0.6.2
 */