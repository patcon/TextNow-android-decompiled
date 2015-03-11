package android.support.v7.widget;

import android.view.View;

public abstract class az
{
  private int a;
  private RecyclerView b;
  private as c;
  private boolean d;
  private boolean e;
  private View f;
  private final ba g;

  private int b(View paramView)
  {
    return RecyclerView.c(paramView);
  }

  protected final void a()
  {
    if (!this.e)
      return;
    bb.d(this.b.f, -1);
    this.f = null;
    this.a = -1;
    this.d = false;
    this.e = false;
    as.a(this.c, this);
    this.c = null;
    this.b = null;
  }

  public final void a(int paramInt)
  {
    this.a = paramInt;
  }

  protected final void a(View paramView)
  {
    if (b(paramView) == this.a)
      this.f = paramView;
  }

  public final boolean b()
  {
    return this.d;
  }

  public final boolean c()
  {
    return this.e;
  }

  public final int d()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.az
 * JD-Core Version:    0.6.2
 */