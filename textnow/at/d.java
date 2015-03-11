package textnow.at;

import android.view.animation.Interpolator;
import java.util.ArrayList;

final class d extends j
{
  private float g;
  private float h;
  private float i;
  private boolean j = true;

  public d(h[] paramArrayOfh)
  {
    super(paramArrayOfh);
  }

  private d b()
  {
    ArrayList localArrayList = this.e;
    int k = this.e.size();
    h[] arrayOfh = new h[k];
    for (int m = 0; m < k; m++)
      arrayOfh[m] = ((h)((g)localArrayList.get(m)).d());
    return new d(arrayOfh);
  }

  public final Object a(float paramFloat)
  {
    return Float.valueOf(b(paramFloat));
  }

  public final float b(float paramFloat)
  {
    int k = 1;
    if (this.a == 2)
    {
      if (this.j)
      {
        this.j = false;
        this.g = ((h)this.e.get(0)).e();
        this.h = ((h)this.e.get(k)).e();
        this.i = (this.h - this.g);
      }
      if (this.d != null)
        paramFloat = this.d.getInterpolation(paramFloat);
      if (this.f == null)
        return this.g + paramFloat * this.i;
      return ((Number)this.f.a(paramFloat, Float.valueOf(this.g), Float.valueOf(this.h))).floatValue();
    }
    if (paramFloat <= 0.0F)
    {
      h localh4 = (h)this.e.get(0);
      h localh5 = (h)this.e.get(k);
      float f9 = localh4.e();
      float f10 = localh5.e();
      float f11 = localh4.b();
      float f12 = localh5.b();
      Interpolator localInterpolator3 = localh5.c();
      if (localInterpolator3 != null)
        paramFloat = localInterpolator3.getInterpolation(paramFloat);
      float f13 = (paramFloat - f11) / (f12 - f11);
      if (this.f == null)
        return f9 + f13 * (f10 - f9);
      return ((Number)this.f.a(f13, Float.valueOf(f9), Float.valueOf(f10))).floatValue();
    }
    if (paramFloat >= 1.0F)
    {
      h localh2 = (h)this.e.get(-2 + this.a);
      h localh3 = (h)this.e.get(-1 + this.a);
      float f4 = localh2.e();
      float f5 = localh3.e();
      float f6 = localh2.b();
      float f7 = localh3.b();
      Interpolator localInterpolator2 = localh3.c();
      if (localInterpolator2 != null)
        paramFloat = localInterpolator2.getInterpolation(paramFloat);
      float f8 = (paramFloat - f6) / (f7 - f6);
      if (this.f == null)
        return f4 + f8 * (f5 - f4);
      return ((Number)this.f.a(f8, Float.valueOf(f4), Float.valueOf(f5))).floatValue();
    }
    h localh1;
    for (Object localObject = (h)this.e.get(0); k < this.a; localObject = localh1)
    {
      localh1 = (h)this.e.get(k);
      if (paramFloat < localh1.b())
      {
        Interpolator localInterpolator1 = localh1.c();
        if (localInterpolator1 != null)
          paramFloat = localInterpolator1.getInterpolation(paramFloat);
        float f1 = (paramFloat - ((h)localObject).b()) / (localh1.b() - ((h)localObject).b());
        float f2 = ((h)localObject).e();
        float f3 = localh1.e();
        if (this.f == null)
          return f2 + f1 * (f3 - f2);
        return ((Number)this.f.a(f1, Float.valueOf(f2), Float.valueOf(f3))).floatValue();
      }
      k++;
    }
    return ((Number)((g)this.e.get(-1 + this.a)).a()).floatValue();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.at.d
 * JD-Core Version:    0.6.2
 */