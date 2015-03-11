package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class ak
{
  private DataSetObservable a = new DataSetObservable();

  public Parcelable a()
  {
    return null;
  }

  public Object a(ViewGroup paramViewGroup, int paramInt)
  {
    throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
  }

  public final void a(DataSetObserver paramDataSetObserver)
  {
    this.a.registerObserver(paramDataSetObserver);
  }

  public void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
  }

  public void a(ViewGroup paramViewGroup)
  {
  }

  public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException("Required method destroyItem was not overridden");
  }

  public abstract boolean a(View paramView, Object paramObject);

  public abstract int b();

  public CharSequence b(int paramInt)
  {
    return null;
  }

  public final void b(DataSetObserver paramDataSetObserver)
  {
    this.a.unregisterObserver(paramDataSetObserver);
  }

  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ak
 * JD-Core Version:    0.6.2
 */