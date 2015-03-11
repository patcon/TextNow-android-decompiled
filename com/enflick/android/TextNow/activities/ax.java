package com.enflick.android.TextNow.activities;

import android.os.AsyncTask;
import textnow.v.b;

final class ax extends AsyncTask<Void, Void, Boolean>
{
  private boolean b;

  public ax(WelcomeActivity paramWelcomeActivity, boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  private Boolean a()
  {
    if (this.b);
    try
    {
      Thread.sleep(1000L);
      label13: return Boolean.valueOf(b.b(this.a));
    }
    catch (InterruptedException localInterruptedException)
    {
      break label13;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ax
 * JD-Core Version:    0.6.2
 */