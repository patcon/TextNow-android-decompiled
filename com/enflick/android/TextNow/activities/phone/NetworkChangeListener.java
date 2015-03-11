package com.enflick.android.TextNow.activities.phone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import textnow.z.u;

public class NetworkChangeListener extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (localNetworkInfo != null)
      new StringBuilder().append("Detected network change! isConnected: ").append(localNetworkInfo.isConnected()).toString();
    if (new u(paramContext).l())
      h.f();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.NetworkChangeListener
 * JD-Core Version:    0.6.2
 */