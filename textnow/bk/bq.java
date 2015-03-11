package textnow.bk;

abstract class bq
  implements Runnable
{
  private volatile boolean a = false;

  public abstract int a();

  public abstract bw<?> b();

  public abstract void d();

  public final boolean e()
  {
    try
    {
      boolean bool = this.a;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void f()
  {
    try
    {
      this.a = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void run()
  {
    if (!e())
      d();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.bq
 * JD-Core Version:    0.6.2
 */