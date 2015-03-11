package textnow.aq;

import java.util.concurrent.CountDownLatch;

public class a
  implements Runnable
{
  m a = null;
  CountDownLatch b = null;

  public a(m paramm, CountDownLatch paramCountDownLatch)
  {
    this.a = paramm;
    this.b = paramCountDownLatch;
  }

  public void run()
  {
    this.a.c();
    if (this.b != null)
      this.b.countDown();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aq.a
 * JD-Core Version:    0.6.2
 */