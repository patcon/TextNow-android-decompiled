package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TestReciever extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      Thread.sleep(2000L);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException.printStackTrace();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.TestReciever
 * JD-Core Version:    0.6.2
 */