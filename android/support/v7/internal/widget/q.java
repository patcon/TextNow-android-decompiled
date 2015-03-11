package android.support.v7.internal.widget;

final class q
  implements Runnable
{
  private q(l paraml)
  {
  }

  public final void run()
  {
    if (this.a.u)
    {
      if (this.a.c() != null)
        this.a.post(this);
      return;
    }
    l.b(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.q
 * JD-Core Version:    0.6.2
 */