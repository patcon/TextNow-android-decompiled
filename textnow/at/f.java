package textnow.at;

import android.view.animation.Interpolator;
import java.util.ArrayList;

final class f extends j
{
  private int g;
  private int h;
  private int i;
  private boolean j = true;

  public f(i[] paramArrayOfi)
  {
    super(paramArrayOfi);
  }

  private f b()
  {
    ArrayList localArrayList = this.e;
    int k = this.e.size();
    i[] arrayOfi = new i[k];
    for (int m = 0; m < k; m++)
      arrayOfi[m] = ((i)((g)localArrayList.get(m)).d());
    return new f(arrayOfi);
  }

  public final Object a(float paramFloat)
  {
    return Integer.valueOf(b(paramFloat));
  }

  public final int b(float paramFloat)
  {
    int k = 1;
    if (this.a == 2)
    {
      if (this.j)
      {
        this.j = false;
        this.g = ((i)this.e.get(0)).e();
        this.h = ((i)this.e.get(k)).e();
        this.i = (this.h - this.g);
      }
      if (this.d != null)
        paramFloat = this.d.getInterpolation(paramFloat);
      if (this.f == null)
        return this.g + (int)(paramFloat * this.i);
      return ((Number)this.f.a(paramFloat, Integer.valueOf(this.g), Integer.valueOf(this.h))).intValue();
    }
    if (paramFloat <= 0.0F)
    {
      i locali4 = (i)this.e.get(0);
      i locali5 = (i)this.e.get(k);
      int i3 = locali4.e();
      int i4 = locali5.e();
      float f5 = locali4.b();
      float f6 = locali5.b();
      Interpolator localInterpolator3 = locali5.c();
      if (localInterpolator3 != null)
        paramFloat = localInterpolator3.getInterpolation(paramFloat);
      float f7 = (paramFloat - f5) / (f6 - f5);
      if (this.f == null)
        return i3 + (int)(f7 * (i4 - i3));
      return ((Number)this.f.a(f7, Integer.valueOf(i3), Integer.valueOf(i4))).intValue();
    }
    if (paramFloat >= 1.0F)
    {
      i locali2 = (i)this.e.get(-2 + this.a);
      i locali3 = (i)this.e.get(-1 + this.a);
      int i1 = locali2.e();
      int i2 = locali3.e();
      float f2 = locali2.b();
      float f3 = locali3.b();
      Interpolator localInterpolator2 = locali3.c();
      if (localInterpolator2 != null)
        paramFloat = localInterpolator2.getInterpolation(paramFloat);
      float f4 = (paramFloat - f2) / (f3 - f2);
      if (this.f == null)
        return i1 + (int)(f4 * (i2 - i1));
      return ((Number)this.f.a(f4, Integer.valueOf(i1), Integer.valueOf(i2))).intValue();
    }
    i locali1;
    for (Object localObject = (i)this.e.get(0); k < this.a; localObject = locali1)
    {
      locali1 = (i)this.e.get(k);
      if (paramFloat < locali1.b())
      {
        Interpolator localInterpolator1 = locali1.c();
        if (localInterpolator1 != null)
          paramFloat = localInterpolator1.getInterpolation(paramFloat);
        float f1 = (paramFloat - ((i)localObject).b()) / (locali1.b() - ((i)localObject).b());
        int m = ((i)localObject).e();
        int n = locali1.e();
        if (this.f == null)
          return m + (int)(f1 * (n - m));
        return ((Number)this.f.a(f1, Integer.valueOf(m), Integer.valueOf(n))).intValue();
      }
      k++;
    }
    return ((Number)((g)this.e.get(-1 + this.a)).a()).intValue();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.at.f
 * JD-Core Version:    0.6.2
 */