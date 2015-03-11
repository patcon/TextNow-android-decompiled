package textnow.ax;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

public class bk extends at
{
  ao u;

  public bk(ao paramao)
  {
    super(paramao);
  }

  protected long a(bl parambl, long paramLong)
  {
    if (this.u != null)
      return paramLong % this.u.b();
    int i = parambl.e;
    return paramLong % this.i.e().b(i).b();
  }

  protected ao a(bl parambl)
  {
    if (this.u != null)
      return this.u;
    int i = parambl.e;
    return this.i.e().b(i);
  }

  public final void a(as paramas, long paramLong)
  {
    if (!l());
    bl localbl1;
    bl localbl2;
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
      localbl1 = (bl)localau.a;
      localbl2 = (bl)localau.b;
      f1 = localau.c;
      this.m = localbl1.s;
    }
    while ((!d(localbl1.s)) || (localbl1.e == 255));
    ao localao = a(localbl1);
    long l = a(localbl1, paramLong);
    int i = m.a(localbl1.f, localbl2.f, localbl1.g, localbl2.g, f1);
    int j = m.a(localbl1.h, localbl2.h, localbl1.i, localbl2.i, f1);
    float f2 = m.b(localbl1.m, localbl2.m, localbl1.n, localbl2.n, f1);
    float f3 = m.b(localbl1.o, localbl2.o, localbl1.p, localbl2.p, f1);
    float f4 = m.b(localbl1.q, localbl2.q, localbl1.r, localbl2.r, f1);
    as localas = new as();
    localas.a(paramas.a);
    localas.f = paramas.f;
    localas.g = paramas.g;
    Rect localRect = localao.a(localas, l);
    int k = localRect.width();
    int m = localRect.height();
    PointF localPointF1 = t.a(k, m, this.e.a);
    float f5 = i;
    float f6 = j;
    float f7 = f2 * k;
    float f8 = f3 * m;
    if (this.e.a == v.e)
      localPointF1.set(0.0F, 0.0F);
    while (true)
    {
      paramas.a(f5, f6, 0.0F, 0.0F, this.n, this.e.a);
      float f9 = paramas.c();
      float f10 = paramas.d();
      float f11 = paramas.a(this.n);
      if (this.e.a() != null)
      {
        ah localah = this.e.a().c(paramas, paramLong);
        float f12 = f9 + Math.round(localah.a);
        float f13 = f10 + Math.round(localah.b);
        PointF localPointF3 = t.a(localah.f, localah.g, this.e.b);
        f9 = f12 + localPointF3.x;
        f10 = f13 + localPointF3.y;
      }
      PointF localPointF2 = t.a(f7, f8, this.e.a);
      localPointF2.set(0.0F, 0.0F);
      Canvas localCanvas = localas.a;
      localCanvas.save();
      localCanvas.translate(Math.round(f9), Math.round(f10));
      localCanvas.translate(Math.round(localPointF2.x), Math.round(localPointF2.y));
      localCanvas.rotate(f4);
      localCanvas.translate(-Math.round(localPointF2.x), -Math.round(localPointF2.y));
      localCanvas.scale(f2, f3);
      localCanvas.scale(f11, f11);
      localCanvas.translate(-localPointF1.x, -localPointF1.y);
      localao.a(localas, l, null);
      localCanvas.restore();
      return;
      localPointF1.x += localRect.left;
      localPointF1.y += localRect.top;
    }
  }

  public final ah b(as paramas, long paramLong)
  {
    au localau = a(paramLong);
    if (localau != null)
    {
      bl localbl1 = (bl)localau.a;
      bl localbl2 = (bl)localau.b;
      float f1 = localau.c;
      if (localbl1.e != 255)
      {
        ao localao = a(localbl1);
        long l = a(localbl1, paramLong);
        float f2 = m.b(localbl1.f, localbl2.f, localbl1.g, localbl2.g, f1);
        float f3 = m.b(localbl1.h, localbl2.h, localbl1.i, localbl2.i, f1);
        float f4 = m.b(localbl1.m, localbl2.m, localbl1.n, localbl2.n, f1);
        float f5 = m.b(localbl1.o, localbl2.o, localbl1.p, localbl2.p, f1);
        float f6 = m.b(localbl1.q, localbl2.q, localbl1.r, localbl2.r, f1);
        as localas = new as();
        localas.a(paramas.a);
        localas.f = paramas.f;
        localas.g = paramas.g;
        RectF localRectF = localao.b(localas, l);
        float f7 = localRectF.width();
        float f8 = localRectF.height();
        PointF localPointF1 = t.a(f7, f8, this.e.a);
        if (this.e.a == v.e)
          localPointF1.set(0.0F, 0.0F);
        while (true)
        {
          paramas.a(f2, f3, 0.0F, 0.0F, this.n, this.e.a);
          float f9 = paramas.c();
          float f10 = paramas.d();
          if (this.e.a() != null)
          {
            ah localah = this.e.a().c(paramas, paramLong);
            float f11 = f9 + Math.round(localah.a);
            float f12 = f10 + Math.round(localah.b);
            PointF localPointF3 = t.a(localah.f, localah.g, this.e.b);
            f9 = f11 + localPointF3.x;
            f10 = f12 + localPointF3.y;
          }
          PointF localPointF2 = t.a(f7, f8, this.e.a);
          if (this.e.a == v.e)
            localPointF2.set(0.0F, 0.0F);
          Matrix localMatrix = new Matrix();
          localMatrix.preTranslate(f9, f10);
          localMatrix.preTranslate(localPointF2.x, localPointF2.y);
          localMatrix.preScale(f4, f5);
          localMatrix.preTranslate(-localPointF2.x, -localPointF2.y);
          localMatrix.preScale(paramas.a(this.n), paramas.a(this.n));
          localMatrix.preTranslate(-localPointF1.x, -localPointF1.y);
          localMatrix.mapRect(localRectF);
          return new ah(localRectF.left, localRectF.top, localRectF.width(), localRectF.height(), f4, f5, f6);
          localPointF1.x += localRectF.left;
          localPointF1.y += localRectF.top;
        }
      }
    }
    return ah.h;
  }

  public void b()
  {
    super.b();
    this.u = null;
  }

  protected bl c()
  {
    return new bl(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.bk
 * JD-Core Version:    0.6.2
 */