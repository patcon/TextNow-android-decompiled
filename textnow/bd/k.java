package textnow.bd;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class k
{
  private final ThreadPoolExecutor a;
  private final j b;
  private final bs c = new bs();

  private k(int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, j paramj)
  {
    this.b = paramj;
    this.a = new l(this, paramInt1, paramInt2, paramLong, paramTimeUnit, this.b, (byte)0);
  }

  private void a(Runnable paramRunnable)
  {
    try
    {
      bo localbo = (bo)paramRunnable;
      if (!localbo.e())
        this.c.b(localbo);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(bo parambo)
  {
    try
    {
      if (!parambo.e())
      {
        this.c.a(parambo);
        this.a.execute(parambo);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(bu<?> parambu)
  {
    try
    {
      this.c.a(parambu);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void b(bo parambo)
  {
    try
    {
      this.c.c(parambo);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.k
 * JD-Core Version:    0.6.2
 */