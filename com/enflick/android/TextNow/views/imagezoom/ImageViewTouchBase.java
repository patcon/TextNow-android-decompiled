package com.enflick.android.TextNow.views.imagezoom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public abstract class ImageViewTouchBase extends ImageView
{
  private float a = -1.0F;
  private float b = -1.0F;
  private boolean c;
  private boolean d;
  private int e = -1;
  private int f = -1;
  private PointF g = new PointF();
  private boolean h;
  private boolean i;
  private h j;
  protected a k = new b();
  protected Matrix l = new Matrix();
  protected Matrix m = new Matrix();
  protected Matrix n;
  protected Handler o = new Handler();
  protected Runnable p = null;
  protected boolean q = false;
  protected final Matrix r = new Matrix();
  protected final float[] s = new float[9];
  protected g t = g.b;
  protected final int u = 200;
  protected RectF v = new RectF();
  protected RectF w = new RectF();
  protected RectF x = new RectF();
  private i y;

  public ImageViewTouchBase(Context paramContext)
  {
    this(paramContext, null);
  }

  public ImageViewTouchBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ImageViewTouchBase(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }

  private float a(Matrix paramMatrix, int paramInt)
  {
    paramMatrix.getValues(this.s);
    return this.s[paramInt];
  }

  private float a(g paramg)
  {
    if (paramg == g.b)
      return 1.0F;
    if (paramg == g.c)
      return Math.min(1.0F, 1.0F / a(this.l, 0));
    return 1.0F / a(this.l, 0);
  }

  private Matrix a()
  {
    return a(this.m);
  }

  private Matrix a(Matrix paramMatrix)
  {
    this.r.set(this.l);
    this.r.postConcat(paramMatrix);
    return this.r;
  }

  private void a(float paramFloat1, float paramFloat2)
  {
    if ((paramFloat1 != 0.0F) || (paramFloat2 != 0.0F))
    {
      new StringBuilder().append("postTranslate: ").append(paramFloat1).append("x").append(paramFloat2).toString();
      this.m.postTranslate(paramFloat1, paramFloat2);
      setImageMatrix(a());
    }
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.y != null);
  }

  private void a(Drawable paramDrawable)
  {
    new StringBuilder().append("scale: ").append(g()).append(", minScale: ").append(f()).toString();
    if (this.j != null);
  }

  private RectF b(Matrix paramMatrix)
  {
    Drawable localDrawable = getDrawable();
    if (localDrawable == null)
      return null;
    Matrix localMatrix = a(paramMatrix);
    this.v.set(0.0F, 0.0F, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    localMatrix.mapRect(this.v);
    return this.v;
  }

  private void b(float paramFloat)
  {
    new StringBuilder().append("zoomTo: ").append(paramFloat).toString();
    if (paramFloat > e())
      paramFloat = e();
    if (paramFloat < f())
      paramFloat = f();
    new StringBuilder().append("sanitized scale: ").append(paramFloat).toString();
    PointF localPointF = this.g;
    a(paramFloat, localPointF.x, localPointF.y);
  }

  protected final RectF a(Matrix paramMatrix, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (getDrawable() == null)
      return new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.w.set(0.0F, 0.0F, 0.0F, 0.0F);
    RectF localRectF = b(paramMatrix);
    float f1 = localRectF.height();
    float f2 = localRectF.width();
    int i2;
    float f3;
    if (paramBoolean2)
    {
      i2 = this.f;
      if (f1 < i2)
        f3 = (i2 - f1) / 2.0F - localRectF.top;
    }
    while (true)
    {
      int i1;
      float f4;
      if (paramBoolean1)
      {
        i1 = this.e;
        if (f2 < i1)
          f4 = (i1 - f2) / 2.0F - localRectF.left;
      }
      while (true)
      {
        this.w.set(f4, f3, 0.0F, 0.0F);
        return this.w;
        if (localRectF.top > 0.0F)
        {
          f3 = -localRectF.top;
          break;
        }
        if (localRectF.bottom >= i2)
          break label241;
        f3 = this.f - localRectF.bottom;
        break;
        if (localRectF.left > 0.0F)
          f4 = -localRectF.left;
        else if (localRectF.right < i1)
          f4 = i1 - localRectF.right;
        else
          f4 = 0.0F;
      }
      label241: f3 = 0.0F;
    }
  }

  protected final void a(double paramDouble1, double paramDouble2)
  {
    RectF localRectF1 = b(this.m);
    this.x.set((float)paramDouble1, (float)paramDouble2, 0.0F, 0.0F);
    RectF localRectF2 = this.x;
    if (localRectF1 != null)
    {
      if ((localRectF1.top >= 0.0F) && (localRectF1.bottom <= this.f))
        localRectF2.top = 0.0F;
      if ((localRectF1.left >= 0.0F) && (localRectF1.right <= this.e))
        localRectF2.left = 0.0F;
      if ((localRectF1.top + localRectF2.top >= 0.0F) && (localRectF1.bottom > this.f))
        localRectF2.top = ((int)(0.0F - localRectF1.top));
      if ((localRectF1.bottom + localRectF2.top <= 0 + this.f) && (localRectF1.top < 0.0F))
        localRectF2.top = ((int)(0 + this.f - localRectF1.bottom));
      if (localRectF1.left + localRectF2.left >= 0.0F)
        localRectF2.left = ((int)(0.0F - localRectF1.left));
      if (localRectF1.right + localRectF2.left <= 0 + this.e)
        localRectF2.left = ((int)(0 + this.e - localRectF1.right));
    }
    a(this.x.left, this.x.top);
    a(true, true);
  }

  protected void a(float paramFloat)
  {
  }

  protected final void a(float paramFloat1, float paramFloat2, double paramDouble)
  {
    final double d1 = paramFloat1;
    double d2 = paramFloat2;
    long l1 = System.currentTimeMillis();
    this.o.post(new Runnable()
    {
      double a = 0.0D;
      double b = 0.0D;

      public final void run()
      {
        long l = System.currentTimeMillis();
        double d1 = Math.min(this.c, l - d1);
        double d2 = ImageViewTouchBase.this.k.a(d1, 0.0D, this.e, this.c);
        double d3 = ImageViewTouchBase.this.k.a(d1, 0.0D, this.f, this.c);
        ImageViewTouchBase.this.a(d2 - this.a, d3 - this.b);
        this.a = d2;
        this.b = d3;
        if (d1 < this.c)
          ImageViewTouchBase.this.o.post(this);
        RectF localRectF;
        do
        {
          return;
          localRectF = ImageViewTouchBase.this.a(ImageViewTouchBase.this.m, true, true);
        }
        while ((localRectF.left == 0.0F) && (localRectF.top == 0.0F));
        ImageViewTouchBase.this.d(localRectF.left, localRectF.top);
      }
    });
  }

  protected final void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > e())
      paramFloat1 = e();
    float f1 = paramFloat1 / g();
    new StringBuilder().append("postScale: ").append(f1).append(", center: ").append(paramFloat2).append("x").append(paramFloat3).toString();
    this.m.postScale(f1, f1, paramFloat2, paramFloat3);
    setImageMatrix(a());
    g();
    a(true, true);
  }

  protected final void a(float paramFloat1, float paramFloat2, float paramFloat3, final float paramFloat4)
  {
    if (paramFloat1 > e())
      paramFloat1 = e();
    final long l1 = System.currentTimeMillis();
    final float f1 = g();
    float f2 = paramFloat1 - f1;
    Matrix localMatrix = new Matrix(this.m);
    localMatrix.postScale(paramFloat1, paramFloat1, paramFloat2, paramFloat3);
    RectF localRectF = a(localMatrix, true, true);
    final float f3 = paramFloat2 + paramFloat1 * localRectF.left;
    final float f4 = paramFloat3 + paramFloat1 * localRectF.top;
    this.o.post(new Runnable()
    {
      public final void run()
      {
        long l = System.currentTimeMillis();
        float f1 = Math.min(paramFloat4, (float)(l - l1));
        float f2 = (float)ImageViewTouchBase.this.k.b(f1, 0.0D, f1, paramFloat4);
        ImageViewTouchBase.this.a(f2 + f3, f4, this.f);
        if (f1 < paramFloat4)
        {
          ImageViewTouchBase.this.o.post(this);
          return;
        }
        ImageViewTouchBase.this.a(ImageViewTouchBase.this.g());
        ImageViewTouchBase.this.a(true, true);
      }
    });
  }

  protected void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    setScaleType(ImageView.ScaleType.MATRIX);
  }

  protected void a(Drawable paramDrawable, Matrix paramMatrix, float paramFloat1, float paramFloat2)
  {
    this.l.reset();
    if (paramDrawable != null)
    {
      new StringBuilder().append("size: ").append(paramDrawable.getIntrinsicWidth()).append("x").append(paramDrawable.getIntrinsicHeight()).toString();
      super.setImageDrawable(paramDrawable);
      if ((paramFloat1 == -1.0F) || (paramFloat2 == -1.0F))
        break label237;
      float f1 = Math.min(paramFloat1, paramFloat2);
      float f2 = Math.max(f1, paramFloat2);
      this.b = f1;
      this.a = f2;
      this.d = true;
      this.c = true;
      if ((this.t == g.b) || (this.t == g.c))
      {
        if (this.b >= 1.0F)
        {
          this.d = false;
          this.b = -1.0F;
        }
        if (this.a <= 1.0F)
        {
          this.c = true;
          this.a = -1.0F;
        }
      }
    }
    while (true)
    {
      if (paramMatrix != null)
        this.n = new Matrix(paramMatrix);
      new StringBuilder().append("mMinZoom: ").append(this.b).append(", mMaxZoom: ").append(this.a).toString();
      this.i = true;
      requestLayout();
      return;
      super.setImageDrawable(null);
      break;
      label237: this.b = -1.0F;
      this.a = -1.0F;
      this.d = false;
      this.c = false;
    }
  }

  protected final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (getDrawable() == null);
    RectF localRectF;
    do
    {
      return;
      localRectF = a(this.m, true, true);
    }
    while ((localRectF.left == 0.0F) && (localRectF.top == 0.0F));
    a(localRectF.left, localRectF.top);
  }

  public final void b(final Drawable paramDrawable, final Matrix paramMatrix, final float paramFloat1, final float paramFloat2)
  {
    if (getWidth() <= 0)
    {
      this.p = new Runnable()
      {
        public final void run()
        {
          ImageViewTouchBase.this.b(paramDrawable, paramMatrix, paramFloat1, paramFloat2);
        }
      };
      return;
    }
    a(paramDrawable, paramMatrix, paramFloat1, paramFloat2);
  }

  public final void c(float paramFloat1, float paramFloat2)
  {
    PointF localPointF = this.g;
    a(paramFloat1, localPointF.x, localPointF.y, 50.0F);
  }

  public final void d(float paramFloat1, float paramFloat2)
  {
    a(paramFloat1, paramFloat2);
  }

  public final boolean d()
  {
    return this.i;
  }

  public final float e()
  {
    Drawable localDrawable;
    float f1;
    if (this.a == -1.0F)
    {
      localDrawable = getDrawable();
      if (localDrawable != null)
        break label31;
      f1 = 1.0F;
    }
    while (true)
    {
      this.a = f1;
      return this.a;
      label31: f1 = 8.0F * Math.max(localDrawable.getIntrinsicWidth() / this.e, localDrawable.getIntrinsicHeight() / this.f);
      new StringBuilder().append("computeMaxZoom: ").append(f1).toString();
    }
  }

  public final float f()
  {
    new StringBuilder().append("getMinScale, mMinZoom: ").append(this.b).toString();
    if (this.b == -1.0F)
      this.b = 1.0F;
    new StringBuilder().append("mMinZoom: ").append(this.b).toString();
    return this.b;
  }

  public final float g()
  {
    return a(this.m, 0);
  }

  @SuppressLint({"Override"})
  public float getRotation()
  {
    return 0.0F;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    new StringBuilder().append("onLayout: ").append(paramBoolean).append(", bitmapChanged: ").append(this.i).append(", scaleChanged: ").append(this.h).toString();
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i1 = 0;
    int i2 = 0;
    if (paramBoolean)
    {
      int i3 = this.e;
      int i4 = this.f;
      this.e = (paramInt3 - paramInt1);
      this.f = (paramInt4 - paramInt2);
      i2 = this.e - i3;
      i1 = this.f - i4;
      this.g.x = (this.e / 2.0F);
      this.g.y = (this.f / 2.0F);
    }
    Runnable localRunnable = this.p;
    if (localRunnable != null)
    {
      this.p = null;
      localRunnable.run();
    }
    Drawable localDrawable = getDrawable();
    float f1;
    float f2;
    float f3;
    float f4;
    Matrix localMatrix;
    float f5;
    float f6;
    float f7;
    float f8;
    float f14;
    float f15;
    if (localDrawable != null)
      if ((paramBoolean) || (this.h) || (this.i))
      {
        if (this.i)
        {
          this.l.reset();
          if (!this.d)
            this.b = -1.0F;
          if (!this.c)
            this.a = -1.0F;
        }
        f1 = a(this.t);
        f2 = a(this.l, 0);
        f3 = g();
        f4 = Math.min(1.0F, 1.0F / f2);
        localMatrix = this.l;
        f5 = this.e;
        f6 = this.f;
        new StringBuilder().append("getProperBaseMatrix. view: ").append(f5).append("x").append(f6).toString();
        f7 = localDrawable.getIntrinsicWidth();
        f8 = localDrawable.getIntrinsicHeight();
        localMatrix.reset();
        if ((f7 <= f5) && (f8 <= f6))
          break label884;
        float f9 = Math.min(f5 / f7, f6 / f8);
        localMatrix.postScale(f9, f9);
        localMatrix.postTranslate((f5 - f7 * f9) / 2.0F, (f6 - f8 * f9) / 2.0F);
        float f10 = a(localMatrix, 0);
        float f11 = a(localMatrix, 4);
        float f12 = a(localMatrix, 2);
        float f13 = a(localMatrix, 5);
        new StringBuilder().append("matrix: { x: ").append(f12).append(", y: ").append(f13).append(", scalex: ").append(f10).append(", scaley: ").append(f11).append(" }").toString();
        f14 = a(this.l, 0);
        new StringBuilder().append("old matrix scale: ").append(f2).toString();
        new StringBuilder().append("new matrix scale: ").append(f14).toString();
        new StringBuilder().append("old min scale: ").append(f4).toString();
        new StringBuilder().append("old scale: ").append(f3).toString();
        if ((!this.i) && (!this.h))
          break label958;
        new StringBuilder().append("display type: ").append(this.t).toString();
        new StringBuilder().append("newMatrix: ").append(this.n).toString();
        if (this.n == null)
          break label938;
        this.m.set(this.n);
        this.n = null;
        f15 = g();
        label698: setImageMatrix(a());
        if (f15 != g())
        {
          new StringBuilder().append("scale != getScale: ").append(f15).append(" != ").append(g()).toString();
          b(f15);
        }
      }
    label1053: 
    while (true)
    {
      this.q = false;
      if ((f15 > e()) || (f15 < f()))
        b(f15);
      a(true, true);
      if (this.i)
        a(localDrawable);
      if ((paramBoolean) || (this.i) || (this.h))
        a(paramInt1, paramInt2, paramInt3, paramInt4);
      if (this.h)
        this.h = false;
      if (this.i)
        this.i = false;
      new StringBuilder().append("new scale: ").append(g()).toString();
      return;
      label884: float f16 = Math.min(f5 / f7, f6 / f8);
      localMatrix.postScale(f16, f16);
      localMatrix.postTranslate((f5 - f7 * f16) / 2.0F, (f6 - f8 * f16) / 2.0F);
      break;
      label938: this.m.reset();
      f15 = a(this.t);
      break label698;
      label958: if (paramBoolean)
      {
        if (!this.d)
          this.b = -1.0F;
        if (!this.c)
          this.a = -1.0F;
        setImageMatrix(a());
        a(-i2, -i1);
        if (!this.q)
        {
          f15 = a(this.t);
          new StringBuilder().append("!userScaled. scale=").append(f15).toString();
          b(f15);
          new StringBuilder().append("old min scale: ").append(f1).toString();
          new StringBuilder().append("old scale: ").append(f3).toString();
          new StringBuilder().append("new scale: ").append(f15).toString();
        }
        else
        {
          if (Math.abs(f3 - f4) > 0.001D);
          for (f15 = f3 * (f2 / f14); ; f15 = 1.0F)
          {
            new StringBuilder().append("userScaled. scale=").append(f15).toString();
            b(f15);
            break label1053;
            if (this.i)
              a(localDrawable);
            if ((paramBoolean) || (this.i) || (this.h))
              a(paramInt1, paramInt2, paramInt3, paramInt4);
            if (this.i)
              this.i = false;
            if (!this.h)
              break;
            this.h = false;
            return;
          }
        }
      }
      else
      {
        f15 = 1.0F;
      }
    }
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      b(new textnow.ad.a(paramBitmap), null, -1.0F, -1.0F);
      return;
    }
    b(null, null, -1.0F, -1.0F);
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    b(paramDrawable, null, -1.0F, -1.0F);
  }

  public void setImageMatrix(Matrix paramMatrix)
  {
    Matrix localMatrix = getImageMatrix();
    if (((paramMatrix != null) || (localMatrix.isIdentity())) && (paramMatrix != null))
      localMatrix.equals(paramMatrix);
    super.setImageMatrix(paramMatrix);
  }

  public void setImageResource(int paramInt)
  {
    setImageDrawable(getContext().getResources().getDrawable(paramInt));
  }

  public void setScaleType(ImageView.ScaleType paramScaleType)
  {
    if (paramScaleType == ImageView.ScaleType.MATRIX)
      super.setScaleType(paramScaleType);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.imagezoom.ImageViewTouchBase
 * JD-Core Version:    0.6.2
 */