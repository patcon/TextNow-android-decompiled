package com.admarvel.android.ads;

import com.admarvel.android.util.Logging;

class m$v
  implements Runnable
{
  private final String b;

  public m$v(m paramm, String paramString)
  {
    this.b = paramString;
  }

  public void run()
  {
    if (!m.j(this.a))
    {
      Logging.log("onPagFinished is not  called after delay" + Constants.WAIT_FOR_ON_PAGE_FINISHED);
      m.a(this.a, this.b);
      this.a.e();
      this.a.d();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.v
 * JD-Core Version:    0.6.2
 */