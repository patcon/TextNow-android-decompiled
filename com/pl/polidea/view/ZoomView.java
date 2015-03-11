package com.pl.polidea.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class ZoomView extends FrameLayout
{
  private float A;
  private final Matrix B = new Matrix();
  private final Paint C = new Paint();
  private Bitmap D;
  float a = 1.0F;
  float b = 2.0F;
  float c = 1.0F;
  float d;
  float e;
  float f;
  float g;
  a h;
  private boolean i;
  private boolean j = false;
  private int k = -16777216;
  private int l = -1;
  private String m;
  private float n = 10.0F;
  private int o = -1;
  private long p;
  private float q;
  private float r;
  private float s;
  private float t;
  private float u;
  private boolean v;
  private float w;
  private float x;
  private float y;
  private float z;

  public ZoomView(Context paramContext)
  {
    super(paramContext);
  }

  public ZoomView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.c = b(1.0F, paramFloat1, this.b);
    this.f = paramFloat2;
    this.g = paramFloat3;
    if (this.h != null);
  }

  private static float b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return Math.max(paramFloat1, Math.min(paramFloat2, paramFloat3));
  }

  private static float c(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (Math.abs(paramFloat2 - paramFloat1) >= paramFloat3)
      paramFloat2 = paramFloat1 + paramFloat3 * Math.signum(paramFloat2 - paramFloat1);
    return paramFloat2;
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    float f1 = c(this.a, this.c, 0.05F);
    this.a = (f1 + 0.2F * (this.c - f1));
    this.f = b(0.5F * getWidth() / this.c, this.f, getWidth() - 0.5F * getWidth() / this.c);
    this.g = b(0.5F * getHeight() / this.c, this.g, getHeight() - 0.5F * getHeight() / this.c);
    float f2 = c(this.d, this.f, 0.1F);
    this.d = (f2 + 0.35F * (this.f - f2));
    float f3 = c(this.e, this.g, 0.1F);
    this.e = (f3 + 0.35F * (this.g - f3));
    if (((this.a == this.c) || (this.h == null)) || ((Math.abs(this.a - this.c) > 1.0E-07F) || (Math.abs(this.d - this.f) > 1.0E-07F) || (Math.abs(this.e - this.g) > 1.0E-07F)));
    for (int i1 = 1; getChildCount() == 0; i1 = 0)
      return;
    this.B.setTranslate(0.5F * getWidth(), 0.5F * getHeight());
    this.B.preScale(this.a, this.a);
    this.B.preTranslate(-b(0.5F * getWidth() / this.a, this.d, getWidth() - 0.5F * getWidth() / this.a), -b(0.5F * getHeight() / this.a, this.e, getHeight() - 0.5F * getHeight() / this.a));
    View localView = getChildAt(0);
    this.B.preTranslate(localView.getLeft(), localView.getTop());
    if ((i1 != 0) && (this.D == null) && (isAnimationCacheEnabled()))
    {
      localView.setDrawingCacheEnabled(true);
      this.D = localView.getDrawingCache();
    }
    if ((i1 != 0) && (isAnimationCacheEnabled()) && (this.D != null))
    {
      this.C.setColor(-1);
      paramCanvas.drawBitmap(this.D, this.B, this.C);
    }
    while (true)
    {
      if (this.j)
      {
        if (this.l < 0)
          this.l = (getHeight() / 4);
        paramCanvas.translate(10.0F, 10.0F);
        this.C.setColor(0x80000000 | 0xFFFFFF & this.k);
        float f4 = this.l * getWidth() / getHeight();
        float f5 = this.l;
        paramCanvas.drawRect(0.0F, 0.0F, f4, f5, this.C);
        if ((this.m != null) && (this.m.length() > 0))
        {
          this.C.setTextSize(this.n);
          this.C.setColor(this.o);
          this.C.setAntiAlias(true);
          paramCanvas.drawText(this.m, 10.0F, 10.0F + this.n, this.C);
          this.C.setAntiAlias(false);
        }
        this.C.setColor(0x80000000 | 0xFFFFFF & this.k);
        float f6 = f4 * this.d / getWidth();
        float f7 = f5 * this.e / getHeight();
        paramCanvas.drawRect(f6 - 0.5F * f4 / this.a, f7 - 0.5F * f5 / this.a, f6 + f4 * 0.5F / this.a, f7 + 0.5F * f5 / this.a, this.C);
        paramCanvas.translate(-10.0F, -10.0F);
      }
      getRootView().invalidate();
      invalidate();
      return;
      this.D = null;
      paramCanvas.save();
      paramCanvas.concat(this.B);
      localView.draw(paramCanvas);
      paramCanvas.restore();
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1;
    float f2;
    float f4;
    float f6;
    float f8;
    float f9;
    float f10;
    float f11;
    if (paramMotionEvent.getPointerCount() == 1)
    {
      float f14 = paramMotionEvent.getX();
      float f15 = paramMotionEvent.getY();
      float f16 = this.l * getWidth() / getHeight();
      float f17 = this.l;
      if ((f14 >= 10.0F) && (f14 <= f16 + 10.0F) && (f15 >= 10.0F) && (f15 <= 10.0F + f17))
      {
        i1 = 1;
        if ((!this.j) || (this.c <= 1.0F) || (i1 == 0))
          break label407;
        float f25 = paramMotionEvent.getX();
        float f26 = paramMotionEvent.getY();
        float f27 = this.l * getWidth() / getHeight();
        float f28 = this.l;
        float f29 = (f25 - 10.0F) / f27 * getWidth();
        float f30 = (f26 - 10.0F) / f28 * getHeight();
        a(this.c, f29, f30);
      }
    }
    else if (paramMotionEvent.getPointerCount() == 2)
    {
      float f1 = paramMotionEvent.getX(0);
      f2 = f1 - this.x;
      this.x = f1;
      float f3 = paramMotionEvent.getY(0);
      f4 = f3 - this.y;
      this.y = f3;
      float f5 = paramMotionEvent.getX(1);
      f6 = f5 - this.z;
      this.z = f5;
      float f7 = paramMotionEvent.getY(1);
      f8 = f7 - this.A;
      this.A = f7;
      f9 = (float)Math.hypot(f5 - f1, f7 - f3);
      f10 = f9 - this.w;
      this.w = f9;
      f11 = Math.abs(f9 - this.u);
      Math.atan2(f7 - f3, f5 - f1);
      switch (paramMotionEvent.getAction())
      {
      case 1:
      default:
        label372: this.v = false;
      case 0:
      case 2:
      }
    }
    while (true)
    {
      paramMotionEvent.setAction(3);
      super.dispatchTouchEvent(paramMotionEvent);
      getRootView().invalidate();
      invalidate();
      return true;
      i1 = 0;
      break;
      label407: float f18 = paramMotionEvent.getX();
      float f19 = paramMotionEvent.getY();
      float f20 = f18 - this.q;
      float f21 = f19 - this.r;
      float f22 = (float)Math.hypot(f20, f21);
      float f23 = f18 - this.s;
      float f24 = f19 - this.t;
      this.s = f18;
      this.t = f19;
      switch (paramMotionEvent.getAction())
      {
      case 3:
      default:
      case 0:
      case 2:
      case 1:
      case 4:
      }
      while (true)
      {
        paramMotionEvent.setLocation(this.d + (f18 - 0.5F * getWidth()) / this.a, this.e + (f19 - 0.5F * getHeight()) / this.a);
        paramMotionEvent.getX();
        paramMotionEvent.getY();
        super.dispatchTouchEvent(paramMotionEvent);
        break;
        this.q = f18;
        this.r = f19;
        this.s = f18;
        this.t = f19;
        this.i = false;
        continue;
        if ((this.i) || ((this.c > 1.0F) && (f22 > 30.0F)))
        {
          if (!this.i)
          {
            this.i = true;
            paramMotionEvent.setAction(3);
            super.dispatchTouchEvent(paramMotionEvent);
          }
          this.f -= f23 / this.a;
          this.g -= f24 / this.a;
          break;
          if (f22 < 30.0F)
          {
            if (System.currentTimeMillis() - this.p < 500L)
            {
              if (this.c == 1.0F)
                a(this.b, f18, f19);
              while (true)
              {
                this.p = 0L;
                paramMotionEvent.setAction(3);
                super.dispatchTouchEvent(paramMotionEvent);
                break;
                a(1.0F, getWidth() / 2.0F, getHeight() / 2.0F);
              }
            }
            this.p = System.currentTimeMillis();
            performClick();
          }
        }
      }
      this.u = f9;
      break label372;
      if ((this.v) || (f11 > 30.0F))
      {
        this.v = true;
        float f12 = 0.5F * (f2 + f6);
        float f13 = 0.5F * (f4 + f8);
        a(Math.max(1.0F, f9 * this.a / (f9 - f10)), this.d - f12 / this.a, this.e - f13 / this.a);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.pl.polidea.view.ZoomView
 * JD-Core Version:    0.6.2
 */