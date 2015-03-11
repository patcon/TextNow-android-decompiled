package com.flurry.sdk;

import java.util.TimerTask;

class dm$a extends TimerTask
{
  private dm.b b;

  dm$a(dm paramdm, dm.b paramb)
  {
    this.b = paramb;
  }

  public void run()
  {
    this.a.a();
    if (this.b != null)
      this.b.q();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.dm.a
 * JD-Core Version:    0.6.2
 */