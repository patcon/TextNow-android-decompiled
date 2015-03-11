package textnow.m;

public final class j
{
  private j(i parami)
  {
  }

  private boolean b(Exception paramException)
  {
    synchronized (i.a(this.a))
    {
      if (i.b(this.a))
        return false;
      i.a(this.a, true);
      i.a(this.a, paramException);
      i.a(this.a).notifyAll();
      i.c(this.a);
      return true;
    }
  }

  private boolean b(TResult paramTResult)
  {
    synchronized (i.a(this.a))
    {
      if (i.b(this.a))
        return false;
      i.a(this.a, true);
      i.a(this.a, paramTResult);
      i.a(this.a).notifyAll();
      i.c(this.a);
      return true;
    }
  }

  private boolean c()
  {
    synchronized (i.a(this.a))
    {
      if (i.b(this.a))
        return false;
      i.a(this.a, true);
      i.b(this.a, true);
      i.a(this.a).notifyAll();
      i.c(this.a);
      return true;
    }
  }

  public final i<TResult> a()
  {
    return this.a;
  }

  public final void a(Exception paramException)
  {
    if (!b(paramException))
      throw new IllegalStateException("Cannot set the error on a completed task.");
  }

  public final void a(TResult paramTResult)
  {
    if (!b(paramTResult))
      throw new IllegalStateException("Cannot set the result of a completed task.");
  }

  public final void b()
  {
    if (!c())
      throw new IllegalStateException("Cannot cancel a completed task.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.m.j
 * JD-Core Version:    0.6.2
 */