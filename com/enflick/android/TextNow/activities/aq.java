package com.enflick.android.TextNow.activities;

import android.os.AsyncTask;
import textnow.q.b;

final class aq extends AsyncTask<Void, Void, Boolean>
{
  private boolean b;

  public aq(WelcomeActivity paramWelcomeActivity, boolean paramBoolean)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.aq
 * JD-Core Version:    0.6.2
 */