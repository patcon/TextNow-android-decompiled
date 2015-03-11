package android.support.v7.widget;

final class ap
  implements ao
{
  private ap(RecyclerView paramRecyclerView)
  {
  }

  public final void a(be parambe)
  {
    parambe.a(true);
    RecyclerView.e(this.a, parambe.a);
    RecyclerView.d(this.a, parambe.a, false);
  }

  public final void b(be parambe)
  {
    parambe.a(true);
    if (parambe.n())
      RecyclerView.e(this.a, parambe.a);
  }

  public final void c(be parambe)
  {
    parambe.a(true);
    if (parambe.n())
      RecyclerView.e(this.a, parambe.a);
  }

  public final void d(be parambe)
  {
    parambe.a(true);
    if ((parambe.g != null) && (parambe.h == null))
    {
      parambe.g = null;
      parambe.a(-65, be.a(parambe));
    }
    parambe.h = null;
    if (parambe.n())
      RecyclerView.e(this.a, parambe.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ap
 * JD-Core Version:    0.6.2
 */