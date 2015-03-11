package textnow.ax;

import android.graphics.Point;
import android.graphics.PointF;

public final class t
{
  v a;
  v b;
  at c;
  int d;
  u[] e;

  public t(at paramat)
  {
    this.c = paramat;
  }

  public static Point a(int paramInt1, int paramInt2, v paramv)
  {
    switch (1.a[paramv.ordinal()])
    {
    default:
      return new Point(0, 0);
    case 1:
      return new Point(0, 0);
    case 2:
      return new Point(paramInt1 / 2, 0);
    case 3:
      return new Point(paramInt1, 0);
    case 4:
      return new Point(0, paramInt2 / 2);
    case 5:
      return new Point(paramInt1 / 2, paramInt2 / 2);
    case 6:
      return new Point(paramInt1, paramInt2 / 2);
    case 7:
      return new Point(0, paramInt2);
    case 8:
      return new Point(paramInt1 / 2, paramInt2);
    case 9:
    }
    return new Point(paramInt1, paramInt2);
  }

  public static PointF a(float paramFloat1, float paramFloat2, v paramv)
  {
    switch (1.a[paramv.ordinal()])
    {
    default:
      return new PointF(0.0F, 0.0F);
    case 1:
      return new PointF(0.0F, 0.0F);
    case 2:
      return new PointF(paramFloat1 / 2.0F, 0.0F);
    case 3:
      return new PointF(paramFloat1, 0.0F);
    case 4:
      return new PointF(0.0F, paramFloat2 / 2.0F);
    case 5:
      return new PointF(paramFloat1 / 2.0F, paramFloat2 / 2.0F);
    case 6:
      return new PointF(paramFloat1, paramFloat2 / 2.0F);
    case 7:
      return new PointF(0.0F, paramFloat2);
    case 8:
      return new PointF(paramFloat1 / 2.0F, paramFloat2);
    case 9:
    }
    return new PointF(paramFloat1, paramFloat2);
  }

  public static PointF a(ah paramah, v paramv)
  {
    switch (1.a[paramv.ordinal()])
    {
    default:
      return new PointF(0.0F, 0.0F);
    case 1:
      return new PointF(paramah.a, paramah.b);
    case 2:
      return new PointF(paramah.a + paramah.f / 2.0F, paramah.b);
    case 3:
      return new PointF(paramah.a + paramah.f, paramah.b);
    case 4:
      return new PointF(paramah.a, paramah.b + paramah.g / 2.0F);
    case 5:
      return new PointF(paramah.a + paramah.f / 2.0F, paramah.b + paramah.g / 2.0F);
    case 6:
      return new PointF(paramah.a + paramah.f, paramah.b + paramah.g / 2.0F);
    case 7:
      return new PointF(paramah.a, paramah.b + paramah.g);
    case 8:
      return new PointF(paramah.a + paramah.f / 2.0F, paramah.b + paramah.g);
    case 9:
    }
    return new PointF(paramah.a + paramah.f, paramah.b + paramah.g);
  }

  public final at a()
  {
    if (this.d == 255)
      return null;
    return this.c.h().a(this.d);
  }

  public final v b()
  {
    return this.b;
  }

  public final v c()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.t
 * JD-Core Version:    0.6.2
 */