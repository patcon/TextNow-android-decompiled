package android.support.v7.widget;

import android.database.DataSetObserver;

final class ae extends DataSetObserver
{
  private ae(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void onChanged()
  {
    if (this.a.b())
      this.a.c();
  }

  public final void onInvalidated()
  {
    this.a.a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ae
 * JD-Core Version:    0.6.2
 */