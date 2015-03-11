package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

@ez
public final class cf
{
  public static void a(Context paramContext, cf.b paramb)
  {
    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext) != 0)
    {
      paramb.a(bn.bs());
      return;
    }
    new cf.a(paramContext, paramb);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cf
 * JD-Core Version:    0.6.2
 */