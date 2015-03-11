package android.support.v4.view;

import android.database.DataSetObserver;

final class al extends DataSetObserver
  implements by, bz
{
  private int b;

  private al(PagerTitleStrip paramPagerTitleStrip)
  {
  }

  public final void a(int paramInt)
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

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (paramFloat > 0.5F)
      paramInt1++;
    this.a.a(paramInt1, paramFloat, false);
  }

  public final void a(ak paramak1, ak paramak2)
  {
    this.a.a(paramak1, paramak2);
  }

  public final void b(int paramInt)
  {
    this.b = paramInt;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.al
 * JD-Core Version:    0.6.2
 */