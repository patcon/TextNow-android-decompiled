package android.support.v4.widget;

import android.database.DataSetObserver;

final class e extends DataSetObserver
{
  private e(c paramc)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.e
 * JD-Core Version:    0.6.2
 */