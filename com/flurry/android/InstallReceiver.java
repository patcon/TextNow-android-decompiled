package com.flurry.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.flurry.sdk.cy;
import com.flurry.sdk.eo;
import com.flurry.sdk.fe;

public final class InstallReceiver extends BroadcastReceiver
{
  static final String a = InstallReceiver.class.getSimpleName();

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    eo.a(4, a, "Received an Install nofication of " + paramIntent.getAction());
    String str = paramIntent.getExtras().getString("referrer");
    eo.a(4, a, "Received an Install referrer of " + str);
    if ((str == null) || (!"com.android.vending.INSTALL_REFERRER".equals(paramIntent.getAction())))
    {
      eo.a(5, a, "referrer is null");
      return;
    }
    if (!str.contains("="))
    {
      eo.a(4, a, "referrer is before decoding: " + str);
      str = fe.c(str);
      eo.a(4, a, "referrer is: " + str);
    }
    new cy(paramContext).a(str);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.android.InstallReceiver
 * JD-Core Version:    0.6.2
 */