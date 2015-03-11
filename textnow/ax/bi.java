package textnow.ax;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;

public final class bi extends at
{
  Bitmap a;

  public bi(ao paramao)
  {
    super(paramao);
  }

  private Bitmap a(bj parambj)
  {
    if (this.a != null)
      return this.a;
    return this.i.e().r().a(parambj.n);
  }

  public final void a(as paramas, long paramLong)
  {
    if (!l());
    bj localbj1;
    bj localbj2;
    float f1;
    do
    {
      au localau;
      do
      {
        return;
        localau = a(paramLong);
      }
      while (localau == null);
      localbj1 = (bj)localau.a;
      localbj2 = (bj)localau.b;
      f1 = localau.c;
      this.m = localbj1.m;
    }
    while ((localbj1.n == -1) || (!d(localbj1.m)));
    int i = m.a(localbj1.i, localbj2.i, localbj1.j, localbj2.j, f1);
    int j = m.a(localbj1.k, localbj2.k, localbj1.l, localbj2.l, f1);
    float f2 = m.b(localbj1.a, localbj2.a, localbj1.b, localbj2.b, f1);
    float f3 = m.b(localbj1.c, localbj2.c, localbj1.d, localbj2.d, f1);
    float f4 = m.b(localbj1.e, localbj2.e, localbj1.f, localbj2.f, f1);
    float f5 = m.b(localbj1.g, localbj2.g, localbj1.h, localbj2.h, f1);
    Bitmap localBitmap = a(localbj1);
    float f6 = f2 * (localBitmap.getWidth() * paramas.f);
    float f7 = f3 * (localBitmap.getHeight() * paramas.f);
    PointF localPointF1 = t.a(f6, f7, this.e.a);
    int k = (int)(i - localPointF1.x);
    int m = (int)(j - localPointF1.y);
    paramas.a(k, m, f6, f7, this.n, this.e.a);
    float f8 = paramas.c();
    float f9 = paramas.d();
    float f10 = paramas.e();
    float f11 = paramas.f();
    if (this.e.a() != null)
    {
      ah localah = this.e.a().c(paramas, paramLong);
      float f18 = f8 + localah.a;
      float f19 = f9 + localah.b;
      PointF localPointF3 = t.a(localah.f, localah.g, this.e.b);
      f8 = f18 + localPointF3.x;
      f9 = f19 + localPointF3.y;
    }
    RectF localRectF = a(paramas, paramLong, new RectF(f8, f9, f10 + f8, f11 + f9));
    float f12 = localRectF.left;
    float f13 = localRectF.top;
    float f14 = localRectF.width();
    float f15 = localRectF.height();
    float f16 = f14 / localBitmap.getWidth();
    float f17 = f15 / localBitmap.getHeight();
    PointF localPointF2 = t.a(f14, f15, this.e.a);
    Paint localPaint = new Paint();
    localPaint.setAlpha(Math.round(255.0F * f5));
    localPaint.setFilterBitmap(true);
    Canvas localCanvas = paramas.a;
    localCanvas.save();
    localCanvas.translate(Math.round(f12), Math.round(f13));
    localCanvas.translate(Math.round(localPointF2.x), Math.round(localPointF2.y));
    localCanvas.rotate(f4);
    localCanvas.translate(-Math.round(localPointF2.x), -Math.round(localPointF2.y));
    localCanvas.scale(f16, f17);
    localCanvas.drawBitmap(localBitmap, 0.0F, 0.0F, localPaint);
    localCanvas.restore();
  }

  public final ah b(as paramas, long paramLong)
  {
    au localau = a(paramLong);
    if (localau != null)
    {
      bj localbj1 = (bj)localau.a;
      bj localbj2 = (bj)localau.b;
      float f1 = localau.c;
      if (localbj1.n != -1)
      {
        Bitmap localBitmap = a(localbj1);
        float f2 = m.b(localbj1.i, localbj2.i, localbj1.j, localbj2.j, f1);
        float f3 = m.b(localbj1.k, localbj2.k, localbj1.l, localbj2.l, f1);
        float f4 = m.b(localbj1.a, localbj2.a, localbj1.b, localbj2.b, f1);
        float f5 = m.b(localbj1.c, localbj2.c, localbj1.d, localbj2.d, f1);
        float f6 = m.b(localbj1.e, localbj2.e, localbj1.f, localbj2.f, f1);
        float f7 = f4 * localBitmap.getWidth() * paramas.f;
        float f8 = f5 * localBitmap.getHeight() * paramas.f;
        PointF localPointF = t.a(f7, f8, this.e.a);
        paramas.a(f2 - localPointF.x, f3 - localPointF.y, f7, f8, this.n, this.e.a);
        float f9 = paramas.c();
        float f10 = paramas.d();
        float f11 = paramas.e();
        float f12 = paramas.f();
        if (this.e.a() != null)
        {
          ah localah = this.e.a().c(paramas, paramLong);
          float f13 = f9 + Math.round(localah.a);
          float f14 = f10 + Math.round(localah.b);
          Point localPoint = t.a(Math.round(localah.f), Math.round(localah.g), this.e.b);
          f9 = f13 + localPoint.x;
          f10 = f14 + localPoint.y;
        }
        RectF localRectF = a(paramas, paramLong, new RectF(f9, f10, f11 + f9, f12 + f10));
        return new ah(localRectF.left, localRectF.top, localRectF.width(), localRectF.height(), f4, f5, f6);
      }
    }
    return ah.h;
  }

  public final void b()
  {
    super.b();
    this.a = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.bi
 * JD-Core Version:    0.6.2
 */