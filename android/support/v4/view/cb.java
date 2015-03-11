package android.support.v4.view;

import android.database.DataSetObserver;

final class cb extends DataSetObserver
{
  private cb(ViewPager paramViewPager)
  {
  }

  public final void onChanged()
  {
    this.a.c();
  }

  public final void onInvalidated()
  {
    this.a.c();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.cb
 * JD-Core Version:    0.6.2
 */