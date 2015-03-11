package android.support.v7.internal.widget;

import android.util.SparseArray;
import android.view.View;

final class c
{
  private final SparseArray<View> b = new SparseArray();

  c(AbsSpinnerCompat paramAbsSpinnerCompat)
  {
  }

  final View a(int paramInt)
  {
    View localView = (View)this.b.get(paramInt);
    if (localView != null)
      this.b.delete(paramInt);
    return localView;
  }

  final void a()
  {
    SparseArray localSparseArray = this.b;
    int i = localSparseArray.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)localSparseArray.valueAt(j);
      if (localView != null)
        AbsSpinnerCompat.a(this.a, localView, true);
    }
    localSparseArray.clear();
  }

  public final void a(int paramInt, View paramView)
  {
    this.b.put(paramInt, paramView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.c
 * JD-Core Version:    0.6.2
 */