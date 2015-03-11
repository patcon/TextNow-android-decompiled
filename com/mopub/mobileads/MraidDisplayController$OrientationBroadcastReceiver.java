package com.mopub.mobileads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

class MraidDisplayController$OrientationBroadcastReceiver extends BroadcastReceiver
{
  private Context mContext;
  private int mLastRotation;

  MraidDisplayController$OrientationBroadcastReceiver(MraidDisplayController paramMraidDisplayController)
  {
  }

  private boolean isRegistered()
  {
    return this.mContext != null;
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (!isRegistered());
    int i;
    do
    {
      do
        return;
      while (!paramIntent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED"));
      i = MraidDisplayController.access$700(this.this$0);
    }
    while (i == this.mLastRotation);
    this.mLastRotation = i;
    MraidDisplayController.access$800(this.this$0, this.mLastRotation);
  }

  public void register(Context paramContext)
  {
    this.mContext = paramContext;
    paramContext.registerReceiver(this, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
  }

  public void unregister()
  {
    this.mContext.unregisterReceiver(this);
    this.mContext = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidDisplayController.OrientationBroadcastReceiver
 * JD-Core Version:    0.6.2
 */