package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import textnow.g.b;
import textnow.g.k;
import textnow.g.l;

abstract class t extends Drawable
{
  private static final float b = (float)Math.toRadians(45.0D);
  private final Paint a = new Paint();
  private final float c;
  private final float d;
  private final float e;
  private final float f;
  private final float g;
  private final boolean h;
  private final Path i = new Path();
  private final int j;
  private boolean k = false;
  private float l;

  t(Context paramContext)
  {
    TypedArray localTypedArray = paramContext.getTheme().obtainStyledAttributes(null, l.K, b.p, k.a);
    this.a.setAntiAlias(true);
    this.a.setColor(localTypedArray.getColor(l.M, 0));
    this.j = localTypedArray.getDimensionPixelSize(l.N, 0);
    this.e = localTypedArray.getDimension(l.L, 0.0F);
    this.d = localTypedArray.getDimension(l.S, 0.0F);
    this.c = localTypedArray.getDimension(l.R, 0.0F);
    this.g = localTypedArray.getDimension(l.O, 0.0F);
    this.h = localTypedArray.getBoolean(l.Q, true);
    this.f = localTypedArray.getDimension(l.P, 0.0F);
    localTypedArray.recycle();
    this.a.setStyle(Paint.Style.STROKE);
    this.a.setStrokeJoin(Paint.Join.ROUND);
    this.a.setStrokeCap(Paint.Cap.SQUARE);
    this.a.setStrokeWidth(this.c);
  }

  protected final void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }

  abstract boolean a();

  public final void b(float paramFloat)
  {
    this.l = paramFloat;
    invalidateSelf();
  }

  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    boolean bool = a();
    float f1 = this.e;
    float f2 = this.d;
    float f3 = f1 + this.l * (f2 - f1);
    float f4 = this.e;
    float f5 = this.f;
    float f6 = f4 + this.l * (f5 - f4);
    float f7 = this.c / 2.0F;
    float f8 = 0.0F + this.l * (f7 - 0.0F);
    float f9 = b;
    float f10 = 0.0F + this.l * (f9 - 0.0F);
    float f11;
    float f12;
    label118: int m;
    if (bool)
    {
      f11 = 0.0F;
      if (!bool)
        break label374;
      f12 = 180.0F;
      float f13 = f11 + this.l * (f12 - f11);
      float f14 = this.g + this.c;
      float f15 = f14 + this.l * (0.0F - f14);
      this.i.rewind();
      float f16 = -f6 / 2.0F;
      this.i.moveTo(f16 + f8, 0.0F);
      this.i.rLineTo(f6 - f8, 0.0F);
      float f17 = (float)Math.round(f3 * Math.cos(f10));
      float f18 = (float)Math.round(f3 * Math.sin(f10));
      this.i.moveTo(f16, f15);
      this.i.rLineTo(f17, f18);
      this.i.moveTo(f16, -f15);
      this.i.rLineTo(f17, -f18);
      this.i.moveTo(0.0F, 0.0F);
      this.i.close();
      paramCanvas.save();
      if (!this.h)
        break label386;
      if (!(bool ^ this.k))
        break label380;
      m = -1;
      label316: paramCanvas.rotate(f13 * m, localRect.centerX(), localRect.centerY());
    }
    while (true)
    {
      paramCanvas.translate(localRect.centerX(), localRect.centerY());
      paramCanvas.drawPath(this.i, this.a);
      paramCanvas.restore();
      return;
      f11 = -180.0F;
      break;
      label374: f12 = 0.0F;
      break label118;
      label380: m = 1;
      break label316;
      label386: if (bool)
        paramCanvas.rotate(180.0F, localRect.centerX(), localRect.centerY());
    }
  }

  public int getIntrinsicHeight()
  {
    return this.j;
  }

  public int getIntrinsicWidth()
  {
    return this.j;
  }

  public int getOpacity()
  {
    return -3;
  }

  public boolean isAutoMirrored()
  {
    return true;
  }

  public void setAlpha(int paramInt)
  {
    this.a.setAlpha(paramInt);
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.a.setColorFilter(paramColorFilter);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.t
 * JD-Core Version:    0.6.2
 */