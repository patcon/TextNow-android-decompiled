package android.support.v7.internal.widget;

final class s
  implements Runnable
{
  private s(o paramo)
  {
  }

  public final void run()
  {
    if (this.a.t)
    {
      if (this.a.c() != null)
        this.a.post(this);
      return;
    }
    o.b(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.s
 * JD-Core Version:    0.6.2
 */