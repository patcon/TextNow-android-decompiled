package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class UiLifecycleHelper$ActiveSessionBroadcastReceiver extends BroadcastReceiver
{
  private UiLifecycleHelper$ActiveSessionBroadcastReceiver(UiLifecycleHelper paramUiLifecycleHelper)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("com.facebook.sdk.ACTIVE_SESSION_SET".equals(paramIntent.getAction()))
    {
      Session localSession2 = Session.getActiveSession();
      if ((localSession2 != null) && (UiLifecycleHelper.access$100(this.this$0) != null))
        localSession2.addCallback(UiLifecycleHelper.access$100(this.this$0));
    }
    Session localSession1;
    do
    {
      do
        return;
      while (!"com.facebook.sdk.ACTIVE_SESSION_UNSET".equals(paramIntent.getAction()));
      localSession1 = Session.getActiveSession();
    }
    while ((localSession1 == null) || (UiLifecycleHelper.access$100(this.this$0) == null));
    localSession1.removeCallback(UiLifecycleHelper.access$100(this.this$0));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.UiLifecycleHelper.ActiveSessionBroadcastReceiver
 * JD-Core Version:    0.6.2
 */