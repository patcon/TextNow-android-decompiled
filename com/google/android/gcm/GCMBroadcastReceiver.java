package com.google.android.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class GCMBroadcastReceiver extends BroadcastReceiver
{
  private static boolean a = false;

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    new StringBuilder().append("onReceive: ").append(paramIntent.getAction()).toString();
    if (!a)
    {
      a = true;
      String str2 = getClass().getName();
      if (!str2.equals(GCMBroadcastReceiver.class.getName()))
        a.a(str2);
    }
    String str1 = paramContext.getPackageName() + ".GCMIntentService";
    new StringBuilder().append("GCM IntentService class: ").append(str1).toString();
    GCMBaseIntentService.a(paramContext, paramIntent, str1);
    setResult(-1, null, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gcm.GCMBroadcastReceiver
 * JD-Core Version:    0.6.2
 */