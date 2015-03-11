package textnow.ax;

import android.graphics.Canvas;
import com.tremorvideo.sdk.android.videoad.r;

public final class as
{
  Canvas a;
  ak b;
  float c;
  float d;
  float e;
  public float f = 1.0F;
  public boolean g = true;
  public float h = 1.0F;
  public float i = 1.0F;
  public boolean j = false;
  private float k;
  private float l;
  private float m;
  private float n;
  private float o;
  private float p;

  public final float a()
  {
    return this.k;
  }

  public final float a(av paramav)
  {
    if (paramav == av.b)
      return Math.min(this.h, this.i);
    if (paramav == av.c)
      return Math.max(this.h, this.i);
    return this.c;
  }

  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, av paramav, v paramv)
  {
    label61: float f3;
    float f4;
    if ((paramv == v.b) || (paramv == v.e) || (paramv == v.h))
    {
      paramFloat1 += paramFloat3 / 2.0F;
      if ((paramv != v.d) && (paramv != v.e) && (paramv != v.f))
        break label228;
      paramFloat2 += paramFloat4 / 2.0F;
      float f1 = paramFloat1 * this.d;
      float f2 = paramFloat2 * this.e;
      f3 = paramFloat3 * a(paramav);
      f4 = paramFloat4 * a(paramav);
      this.m = f1;
      this.n = f2;
      if ((paramv != v.b) && (paramv != v.e) && (paramv != v.h))
        break label260;
      this.m -= f3 / 2.0F;
      label147: if ((paramv != v.d) && (paramv != v.e) && (paramv != v.f))
        break label298;
    }
    label260: label298: for (this.n -= f4 / 2.0F; ; this.n -= f4)
      label228: 
      do
      {
        this.o = f3;
        this.p = f4;
        return;
        if ((paramv != v.c) && (paramv != v.f) && (paramv != v.i))
          break;
        paramFloat1 += paramFloat3;
        break;
        if ((paramv != v.g) && (paramv != v.h) && (paramv != v.i))
          break label61;
        paramFloat2 += paramFloat4;
        break label61;
        if ((paramv != v.c) && (paramv != v.f) && (paramv != v.i))
          break label147;
        this.m -= f3;
        break label147;
      }
      while ((paramv != v.g) && (paramv != v.h) && (paramv != v.i));
  }

  public final void a(Canvas paramCanvas)
  {
    this.j = true;
    try
    {
      this.a = paramCanvas;
      this.k = paramCanvas.getWidth();
      this.l = paramCanvas.getHeight();
      this.d = 1.0F;
      this.e = 1.0F;
      this.c = 1.0F;
      this.h = 1.0F;
      this.i = 1.0F;
      return;
    }
    catch (Exception localException)
    {
      r.a(localException);
    }
  }

  public final void a(ak paramak, Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    this.j = true;
    this.b = paramak;
    this.a = paramCanvas;
    this.k = paramCanvas.getWidth();
    this.l = paramCanvas.getHeight();
    this.d = (paramCanvas.getWidth() / paramInt1);
    this.e = (paramCanvas.getHeight() / paramInt2);
    int i1 = Math.max(paramCanvas.getWidth(), paramCanvas.getHeight());
    int i2 = Math.min(paramCanvas.getWidth(), paramCanvas.getHeight());
    this.h = (i1 / paramInt1);
    this.i = (i2 / paramInt2);
    this.c = Math.min(this.d, this.e);
  }

  public final float b()
  {
    return this.l;
  }

  public final float c()
  {
    return this.m;
  }

  public final float d()
  {
    return this.n;
  }

  public final float e()
  {
    return Math.max(1.0F, this.o);
  }

  public final float f()
  {
    return Math.max(1.0F, this.p);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.as
 * JD-Core Version:    0.6.2
 */