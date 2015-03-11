package android.support.v4.widget;

import android.database.DataSetObserver;

final class h extends DataSetObserver
{
  private h(f paramf)
  {
  }

  public final void onChanged()
  {
    this.a.a = true;
    this.a.notifyDataSetChanged();
  }

  public final void onInvalidated()
  {
    this.a.a = false;
    this.a.notifyDataSetInvalidated();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.h
 * JD-Core Version:    0.6.2
 */