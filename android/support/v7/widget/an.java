package android.support.v7.widget;

import java.util.ArrayList;

public abstract class an
{
  private ao a = null;
  private ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> b = new ArrayList();
  private long c = 120L;
  private long d = 120L;
  private long e = 250L;
  private long f = 250L;
  private boolean g = false;

  public abstract void a();

  final void a(ao paramao)
  {
    this.a = paramao;
  }

  public final void a(be parambe, boolean paramBoolean)
  {
    if (this.a != null)
      this.a.d(parambe);
  }

  public abstract boolean a(be parambe);

  public abstract boolean a(be parambe, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public abstract boolean a(be parambe1, be parambe2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public abstract boolean b();

  public abstract boolean b(be parambe);

  public abstract void c();

  public abstract void c(be parambe);

  public final long d()
  {
    return this.e;
  }

  public final void d(be parambe)
  {
    if (this.a != null)
      this.a.a(parambe);
  }

  public final long e()
  {
    return this.c;
  }

  public final void e(be parambe)
  {
    if (this.a != null)
      this.a.c(parambe);
  }

  public final long f()
  {
    return this.d;
  }

  public final void f(be parambe)
  {
    if (this.a != null)
      this.a.b(parambe);
  }

  public final long g()
  {
    return this.f;
  }

  public final boolean h()
  {
    return this.g;
  }

  public final void i()
  {
    int i = this.b.size();
    for (int j = 0; j < i; j++)
      this.b.get(j);
    this.b.clear();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.an
 * JD-Core Version:    0.6.2
 */