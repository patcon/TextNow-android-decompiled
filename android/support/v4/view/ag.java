package android.support.v4.view;

import android.database.DataSetObserver;

final class ag extends DataSetObserver
  implements bs, bt
{
  private int b;

  private ag(PagerTitleStrip paramPagerTitleStrip)
  {
  }

  public final void a()
  {
    if (this.b == 0)
    {
      this.a.a(this.a.a.b(), this.a.a.a());
      boolean bool = PagerTitleStrip.a(this.a) < 0.0F;
      float f = 0.0F;
      if (!bool)
        f = PagerTitleStrip.a(this.a);
      this.a.a(this.a.a.b(), f, true);
    }
  }

  public final void a(int paramInt)
  {
    this.b = paramInt;
  }

  public final void a(int paramInt, float paramFloat)
  {
    if (paramFloat > 0.5F)
      paramInt++;
    this.a.a(paramInt, paramFloat, false);
  }

  public final void onChanged()
  {
    this.a.a(this.a.a.b(), this.a.a.a());
    boolean bool = PagerTitleStrip.a(this.a) < 0.0F;
    float f = 0.0F;
    if (!bool)
      f = PagerTitleStrip.a(this.a);
    this.a.a(this.a.a.b(), f, true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ag
 * JD-Core Version:    0.6.2
 */