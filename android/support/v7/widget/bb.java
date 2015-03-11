package android.support.v7.widget;

import android.util.SparseArray;
import textnow.e.a;

public final class bb
{
  a<be, ar> a = new a();
  a<be, ar> b = new a();
  a<Long, be> c = new a();
  int d = 0;
  private int e = -1;
  private SparseArray<Object> f;
  private int g = 0;
  private int h = 0;
  private boolean i = false;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;

  public final void a(be parambe)
  {
    this.a.remove(parambe);
    this.b.remove(parambe);
    a locala;
    if (this.c != null)
      locala = this.c;
    for (int m = -1 + locala.size(); ; m--)
      if (m >= 0)
      {
        if (parambe == locala.c(m))
          locala.d(m);
      }
      else
        return;
  }

  public final boolean a()
  {
    return this.j;
  }

  public final boolean b()
  {
    return this.l;
  }

  public final int c()
  {
    return this.e;
  }

  public final boolean d()
  {
    return this.e != -1;
  }

  public final int e()
  {
    if (this.j)
      return this.g - this.h;
    return this.d;
  }

  public final String toString()
  {
    return "State{mTargetPosition=" + this.e + ", mPreLayoutHolderMap=" + this.a + ", mPostLayoutHolderMap=" + this.b + ", mData=" + this.f + ", mItemCount=" + this.d + ", mPreviousLayoutItemCount=" + this.g + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.h + ", mStructureChanged=" + this.i + ", mInPreLayout=" + this.j + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bb
 * JD-Core Version:    0.6.2
 */