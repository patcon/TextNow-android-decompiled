package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;

final class ab
{
  private final RectF a = new RectF();
  private final Paint b = new Paint();
  private final Paint c = new Paint();
  private final Drawable.Callback d;
  private float e = 0.0F;
  private float f = 0.0F;
  private float g = 0.0F;
  private float h = 5.0F;
  private float i = 2.5F;
  private int[] j;
  private int k;
  private float l;
  private float m;
  private float n;
  private boolean o;
  private Path p;
  private float q;
  private double r;
  private int s;
  private int t;
  private int u;
  private final Paint v = new Paint();
  private int w;

  public ab(Drawable.Callback paramCallback)
  {
    this.d = paramCallback;
    this.b.setStrokeCap(Paint.Cap.SQUARE);
    this.b.setAntiAlias(true);
    this.b.setStyle(Paint.Style.STROKE);
    this.c.setStyle(Paint.Style.FILL);
    this.c.setAntiAlias(true);
  }

  private void l()
  {
    this.d.invalidateDrawable(null);
  }

  public final void a()
  {
    this.k = ((1 + this.k) % this.j.length);
  }

  public final void a(double paramDouble)
  {
    this.r = paramDouble;
  }

  public final void a(float paramFloat)
  {
    this.h = paramFloat;
    this.b.setStrokeWidth(paramFloat);
    l();
  }

  public final void a(float paramFloat1, float paramFloat2)
  {
    this.s = ((int)paramFloat1);
    this.t = ((int)paramFloat2);
  }

  public final void a(int paramInt)
  {
    this.w = paramInt;
  }

  public final void a(int paramInt1, int paramInt2)
  {
    float f1 = Math.min(paramInt1, paramInt2);
    if ((this.r <= 0.0D) || (f1 < 0.0F));
    for (float f2 = (float)Math.ceil(this.h / 2.0F); ; f2 = (float)(f1 / 2.0F - this.r))
    {
      this.i = f2;
      return;
    }
  }

  public final void a(Canvas paramCanvas, Rect paramRect)
  {
    RectF localRectF = this.a;
    localRectF.set(paramRect);
    localRectF.inset(this.i, this.i);
    float f1 = 360.0F * (this.e + this.g);
    float f2 = 360.0F * (this.f + this.g) - f1;
    this.b.setColor(this.j[this.k]);
    paramCanvas.drawArc(localRectF, f1, f2, false, this.b);
    if (this.o)
    {
      if (this.p != null)
        break label354;
      this.p = new Path();
      this.p.setFillType(Path.FillType.EVEN_ODD);
    }
    while (true)
    {
      float f3 = (int)this.i / 2 * this.q;
      float f4 = (float)(this.r * Math.cos(0.0D) + paramRect.exactCenterX());
      float f5 = (float)(this.r * Math.sin(0.0D) + paramRect.exactCenterY());
      this.p.moveTo(0.0F, 0.0F);
      this.p.lineTo(this.s * this.q, 0.0F);
      this.p.lineTo(this.s * this.q / 2.0F, this.t * this.q);
      this.p.offset(f4 - f3, f5);
      this.p.close();
      this.c.setColor(this.j[this.k]);
      paramCanvas.rotate(f1 + f2 - 5.0F, paramRect.exactCenterX(), paramRect.exactCenterY());
      paramCanvas.drawPath(this.p, this.c);
      if (this.u < 255)
      {
        this.v.setColor(this.w);
        this.v.setAlpha(255 - this.u);
        paramCanvas.drawCircle(paramRect.exactCenterX(), paramRect.exactCenterY(), paramRect.width() / 2, this.v);
      }
      return;
      label354: this.p.reset();
    }
  }

  public final void a(ColorFilter paramColorFilter)
  {
    this.b.setColorFilter(paramColorFilter);
    l();
  }

  public final void a(boolean paramBoolean)
  {
    if (this.o != paramBoolean)
    {
      this.o = paramBoolean;
      l();
    }
  }

  public final void a(int[] paramArrayOfInt)
  {
    this.j = paramArrayOfInt;
    this.k = 0;
  }

  public final int b()
  {
    return this.u;
  }

  public final void b(float paramFloat)
  {
    this.e = paramFloat;
    l();
  }

  public final void b(int paramInt)
  {
    this.k = 0;
  }

  public final float c()
  {
    return this.h;
  }

  public final void c(float paramFloat)
  {
    this.f = paramFloat;
    l();
  }

  public final void c(int paramInt)
  {
    this.u = paramInt;
  }

  public final float d()
  {
    return this.e;
  }

  public final void d(float paramFloat)
  {
    this.g = paramFloat;
    l();
  }

  public final float e()
  {
    return this.l;
  }

  public final void e(float paramFloat)
  {
    if (paramFloat != this.q)
    {
      this.q = paramFloat;
      l();
    }
  }

  public final float f()
  {
    return this.m;
  }

  public final float g()
  {
    return this.f;
  }

  public final double h()
  {
    return this.r;
  }

  public final float i()
  {
    return this.n;
  }

  public final void j()
  {
    this.l = this.e;
    this.m = this.f;
    this.n = this.g;
  }

  public final void k()
  {
    this.l = 0.0F;
    this.m = 0.0F;
    this.n = 0.0F;
    b(0.0F);
    c(0.0F);
    d(0.0F);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.ab
 * JD-Core Version:    0.6.2
 */