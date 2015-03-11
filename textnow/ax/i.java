package textnow.ax;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;

public final class i extends at
{
  public i(ao paramao)
  {
    super(paramao);
  }

  public final void a(as paramas, long paramLong)
  {
  }

  public final ah b(as paramas, long paramLong)
  {
    au localau = a(paramLong);
    if (localau != null)
    {
      j localj1 = (j)localau.a;
      j localj2 = (j)localau.b;
      float f1 = localau.c;
      if (localj1.j)
      {
        float f2 = m.b(localj1.a, localj2.a, localj1.b, localj2.b, f1);
        float f3 = m.b(localj1.c, localj2.c, localj1.d, localj2.d, f1);
        float f4 = m.b(localj1.e, localj2.e, localj1.f, localj2.f, f1);
        float f5 = m.b(localj1.g, localj2.g, localj1.h, localj2.h, f1);
        PointF localPointF = t.a(f4, f5, this.e.a);
        paramas.a(f2 - localPointF.x, f3 - localPointF.y, f4, f5, this.n, this.e.a);
        float f6 = paramas.c();
        float f7 = paramas.d();
        float f8 = paramas.e();
        float f9 = paramas.f();
        if (this.e.a() != null)
        {
          ah localah = this.e.a().c(paramas, paramLong);
          float f10 = f6 + localah.a;
          float f11 = f7 + localah.b;
          Point localPoint = t.a(Math.round(localah.f), Math.round(localah.g), this.e.b);
          f6 = f10 + localPoint.x;
          f7 = f11 + localPoint.y;
        }
        RectF localRectF = a(paramas, paramLong, new RectF(f6, f7, f8 + f6, f9 + f7));
        return new ah(localRectF.left, localRectF.top, localRectF.width(), localRectF.height(), 1.0F, 1.0F, 0.0F);
      }
    }
    return ah.h;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.i
 * JD-Core Version:    0.6.2
 */