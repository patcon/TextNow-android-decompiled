package textnow.bk;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class k
{
  private final ThreadPoolExecutor a;
  private final j b;
  private final bu c = new bu();

  private k(int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, j paramj)
  {
    this.b = paramj;
    this.a = new l(this, paramInt1, paramInt2, paramLong, paramTimeUnit, this.b, (byte)0);
  }

  private void a(Runnable paramRunnable)
  {
    try
    {
      bq localbq = (bq)paramRunnable;
      if (!localbq.e())
        this.c.b(localbq);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(bq parambq)
  {
    try
    {
      if (!parambq.e())
      {
        this.c.a(parambq);
        this.a.execute(parambq);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(bw<?> parambw)
  {
    try
    {
      this.c.a(parambw);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void b(bq parambq)
  {
    try
    {
      this.c.c(parambq);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.k
 * JD-Core Version:    0.6.2
 */