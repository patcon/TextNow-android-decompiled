package com.enflick.android.TextNow.pullservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class PullAlarmReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    TNPullService.a(paramContext);
    paramContext.startService(new Intent(paramContext, TNPullService.class));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.pullservice.PullAlarmReceiver
 * JD-Core Version:    0.6.2
 */