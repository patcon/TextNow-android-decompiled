package textnow.p;

import android.database.DataSetObserver;

final class x extends DataSetObserver
{
  private x(w paramw)
  {
  }

  public final void onChanged()
  {
    this.a.notifyDataSetChanged();
  }

  public final void onInvalidated()
  {
    this.a.notifyDataSetInvalidated();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.x
 * JD-Core Version:    0.6.2
 */