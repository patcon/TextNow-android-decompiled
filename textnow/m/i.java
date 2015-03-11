package textnow.m;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class i<TResult>
{
  public static final ExecutorService a = f.a();
  public static final Executor b = a.b();
  private static final Executor c = f.b();
  private final Object d = new Object();
  private boolean e;
  private boolean f;
  private TResult g;
  private Exception h;
  private List<h<TResult, Void>> i = new ArrayList();

  public static <TResult> i<TResult> a(Exception paramException)
  {
    j localj = a();
    localj.a(paramException);
    return localj.a;
  }

  public static <TResult> i<TResult> a(TResult paramTResult)
  {
    j localj = a();
    localj.a(paramTResult);
    return localj.a;
  }

  private <TContinuationResult> i<TContinuationResult> a(final h<TResult, TContinuationResult> paramh, final Executor paramExecutor)
  {
    final j localj = a();
    synchronized (this.d)
    {
      boolean bool = g();
      if (!bool)
        this.i.add(new h()
        {
        });
      if (bool)
        c(localj, paramh, this, paramExecutor);
      return localj.a;
    }
  }

  public static <TResult> i<TResult>.j a()
  {
    i locali = new i();
    locali.getClass();
    return new j(locali, (byte)0);
  }

  private <TContinuationResult> i<TContinuationResult> b(final h<TResult, i<TContinuationResult>> paramh, final Executor paramExecutor)
  {
    final j localj = a();
    synchronized (this.d)
    {
      boolean bool = g();
      if (!bool)
        this.i.add(new h()
        {
        });
      if (bool)
        d(localj, paramh, this, paramExecutor);
      return localj.a;
    }
  }

  private static <TContinuationResult, TResult> void c(final i<TContinuationResult>.j parami, h<TResult, TContinuationResult> paramh, final i<TResult> parami1, Executor paramExecutor)
  {
    paramExecutor.execute(new Runnable()
    {
      public final void run()
      {
        try
        {
          Object localObject = i.this.then(parami1);
          parami.a(localObject);
          return;
        }
        catch (Exception localException)
        {
          parami.a(localException);
        }
      }
    });
  }

  private static <TContinuationResult, TResult> void d(final i<TContinuationResult>.j parami, h<TResult, i<TContinuationResult>> paramh, final i<TResult> parami1, Executor paramExecutor)
  {
    paramExecutor.execute(new Runnable()
    {
      public final void run()
      {
        try
        {
          i locali = (i)i.this.then(parami1);
          if (locali == null)
          {
            parami.a(null);
            return;
          }
          locali.a(new h()
          {
          });
          return;
        }
        catch (Exception localException)
        {
          parami.a(localException);
        }
      }
    });
  }

  public static <TResult> i<TResult> f()
  {
    j localj = a();
    localj.b();
    return localj.a;
  }

  private boolean g()
  {
    synchronized (this.d)
    {
      boolean bool = this.e;
      return bool;
    }
  }

  public final <TContinuationResult> i<TContinuationResult> a(h<TResult, TContinuationResult> paramh)
  {
    return a(paramh, c);
  }

  public final <TContinuationResult> i<TContinuationResult> b(final h<TResult, TContinuationResult> paramh)
  {
    Executor localExecutor = c;
    return b(new h()
    {
    }
    , localExecutor);
  }

  public final boolean b()
  {
    synchronized (this.d)
    {
      boolean bool = this.f;
      return bool;
    }
  }

  public final boolean c()
  {
    synchronized (this.d)
    {
      if (this.h != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  public final TResult d()
  {
    synchronized (this.d)
    {
      Object localObject3 = this.g;
      return localObject3;
    }
  }

  public final Exception e()
  {
    synchronized (this.d)
    {
      Exception localException = this.h;
      return localException;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.m.i
 * JD-Core Version:    0.6.2
 */