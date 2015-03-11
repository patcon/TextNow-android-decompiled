package android.support.v4.content;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

final class b extends p<Void, Void, D>
  implements Runnable
{
  D a;
  boolean b;
  private CountDownLatch e = new CountDownLatch(1);

  b(a parama)
  {
  }

  protected final void a()
  {
    try
    {
      this.c.a(this, this.a);
      return;
    }
    finally
    {
      this.e.countDown();
    }
  }

  protected final void a(D paramD)
  {
    while (true)
    {
      a locala;
      try
      {
        locala = this.c;
        if (locala.a != this)
        {
          locala.a(this, paramD);
          return;
        }
        if (locala.isAbandoned())
        {
          locala.a(paramD);
          continue;
        }
      }
      finally
      {
        this.e.countDown();
      }
      locala.commitContentChanged();
      locala.d = SystemClock.uptimeMillis();
      locala.a = null;
      locala.deliverResult(paramD);
    }
  }

  public final void run()
  {
    this.b = false;
    this.c.b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.content.b
 * JD-Core Version:    0.6.2
 */