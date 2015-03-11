package textnow.k;

import android.database.DataSetObserver;

final class q extends DataSetObserver
{
  private q(p paramp)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.k.q
 * JD-Core Version:    0.6.2
 */