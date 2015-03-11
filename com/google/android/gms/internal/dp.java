package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

public final class dp
{
  public static em a(Context paramContext, ds paramds, dp.a parama)
  {
    if (paramds.kQ.sz)
      return b(paramContext, paramds, parama);
    return c(paramContext, paramds, parama);
  }

  private static em b(Context paramContext, ds paramds, dp.a parama)
  {
    eu.z("Fetching ad response from local ad request service.");
    dq.a locala = new dq.a(paramContext, paramds, parama);
    locala.start();
    return locala;
  }

  private static em c(Context paramContext, ds paramds, dp.a parama)
  {
    eu.z("Fetching ad response from remote ad request service.");
    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext) != 0)
    {
      eu.D("Failed to connect to remote ad request service.");
      return null;
    }
    return new dq.b(paramContext, paramds, parama);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dp
 * JD-Core Version:    0.6.2
 */