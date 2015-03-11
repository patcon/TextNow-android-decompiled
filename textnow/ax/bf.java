package textnow.ax;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;

public final class bf extends at
{
  public bf(ao paramao)
  {
    super(paramao);
  }

  public final void a(as paramas, long paramLong)
  {
    if (!l());
    bg localbg1;
    bg localbg2;
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
      localbg1 = (bg)localau.a;
      localbg2 = (bg)localau.b;
      f1 = localau.c;
      this.m = localbg1.r;
    }
    while (!d(localbg1.r));
    float f2 = m.b(localbg1.b, localbg2.b, localbg1.c, localbg2.c, f1);
    float f3 = m.b(localbg1.d, localbg2.d, localbg1.e, localbg2.e, f1);
    float f4 = m.b(localbg1.f, localbg2.f, localbg1.g, localbg2.g, f1);
    float f5 = m.b(localbg1.h, localbg2.h, localbg1.i, localbg2.i, f1);
    int i = m.a(localbg1.j, localbg2.j, localbg1.k, localbg2.k, f1);
    int j = m.a(localbg1.l, localbg2.l, localbg1.m, localbg2.m, f1);
    int k = m.a(localbg1.n, localbg2.n, localbg1.o, localbg2.o, f1);
    int m = m.a(localbg1.p, localbg2.p, localbg1.q, localbg2.q, f1);
    bh localbh = bh.values()[localbg1.a];
    Canvas localCanvas = paramas.a;
    localCanvas.save();
    PointF localPointF = t.a(f4, f5, this.e.a);
    paramas.a(f2 - localPointF.x, f3 - localPointF.y, f4, f5, this.n, this.e.a);
    float f6 = paramas.c();
    float f7 = paramas.d();
    float f8 = paramas.e();
    float f9 = paramas.f();
    if (this.e.a() != null)
    {
      ah localah = this.e.a().c(paramas, paramLong);
      float f14 = f6 + localah.a;
      float f15 = f7 + localah.b;
      Point localPoint = t.a(Math.round(localah.f), Math.round(localah.g), this.e.b);
      f6 = f14 + localPoint.x;
      f7 = f15 + localPoint.y;
    }
    RectF localRectF = a(paramas, paramLong, new RectF(f6, f7, f8 + f6, f9 + f7));
    float f10 = localRectF.left;
    float f11 = localRectF.top;
    float f12 = localRectF.width();
    float f13 = localRectF.height();
    localCanvas.translate(Math.round(f10), Math.round(f11));
    Paint localPaint = new Paint();
    localPaint.setColor(Color.argb(m, i, j, k));
    if (localbh == bh.a)
      localCanvas.drawRect(0.0F, 0.0F, Math.round(f12), Math.round(f13), localPaint);
    int n;
    int i1;
    while (true)
    {
      localCanvas.restore();
      return;
      if (localbh == bh.b)
      {
        localPaint.setAntiAlias(true);
        localCanvas.drawOval(new RectF(0.0F, 0.0F, Math.round(f12), Math.round(f13)), localPaint);
      }
      else
      {
        n = 1;
        if (localbh != bh.c)
          break;
        i1 = 1;
        localPaint.setStyle(Paint.Style.STROKE);
        localPaint.setStrokeWidth(i1);
        int i2 = (int)Math.floor(i1 / 2.0D);
        int i3 = (int)Math.round(i1 / 2.0D);
        localCanvas.drawRect(i2, i2, Math.round(f12 - i3), Math.round(f13 - i3), localPaint);
      }
    }
    if (localbh == bh.d)
      n = 10;
    while (true)
    {
      i1 = Math.max(0, Math.round(paramas.a(this.n) * n));
      break;
      if (localbh == bh.e)
        n = 25;
    }
  }

  public final ah b(as paramas, long paramLong)
  {
    au localau = a(paramLong);
    if (localau != null)
    {
      bg localbg1 = (bg)localau.a;
      bg localbg2 = (bg)localau.b;
      float f1 = localau.c;
      float f2 = m.b(localbg1.b, localbg2.b, localbg1.c, localbg2.c, f1);
      float f3 = m.b(localbg1.d, localbg2.d, localbg1.e, localbg2.e, f1);
      float f4 = m.b(localbg1.f, localbg2.f, localbg1.g, localbg2.g, f1);
      float f5 = m.b(localbg1.h, localbg2.h, localbg1.i, localbg2.i, f1);
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
      return new ah(localRectF.left, localRectF.top, localRectF.right - localRectF.left, localRectF.bottom - localRectF.top, 1.0F, 1.0F, 0.0F);
    }
    return ah.h;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.bf
 * JD-Core Version:    0.6.2
 */