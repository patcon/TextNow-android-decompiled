package android.support.v7.internal.widget;

import android.database.DataSetObserver;

final class u extends DataSetObserver
{
  private u(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void onChanged()
  {
    if (this.a.f())
      this.a.c();
  }

  public final void onInvalidated()
  {
    this.a.d();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.u
 * JD-Core Version:    0.6.2
 */