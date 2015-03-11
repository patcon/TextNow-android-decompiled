package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.ViewGroup;

public abstract class af
{
  private DataSetObservable a = new DataSetObservable();

  public abstract int a();

  public final void a(DataSetObserver paramDataSetObserver)
  {
    this.a.registerObserver(paramDataSetObserver);
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException("Required method destroyItem was not overridden");
  }

  public final void b(DataSetObserver paramDataSetObserver)
  {
    this.a.unregisterObserver(paramDataSetObserver);
  }

  public abstract boolean b();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.af
 * JD-Core Version:    0.6.2
 */