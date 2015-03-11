package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class gj$a extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.intent.action.USER_PRESENT".equals(paramIntent.getAction()))
      gj.w(true);
    while (!"android.intent.action.SCREEN_OFF".equals(paramIntent.getAction()))
      return;
    gj.w(false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gj.a
 * JD-Core Version:    0.6.2
 */