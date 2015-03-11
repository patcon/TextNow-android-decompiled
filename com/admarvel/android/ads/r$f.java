package com.admarvel.android.ads;

import android.telephony.TelephonyManager;

class r$f
{
  static String a(TelephonyManager paramTelephonyManager)
  {
    switch (paramTelephonyManager.getNetworkType())
    {
    default:
      return "";
    case 13:
      return "lte";
    case 2:
      return "EDGE";
    case 1:
      return "GPRS";
    case 7:
      return "1xRTT";
    case 4:
      return "CDMA";
    case 14:
      return "EHRPD";
    case 5:
      return "EVDO_0";
    case 6:
      return "EVDO_A";
    case 12:
      return "EVDO_B";
    case 8:
      return "HSDPA";
    case 10:
      return "HSPA";
    case 9:
      return "HSUPA";
    case 11:
      return "IDEN";
    case 3:
    }
    return "UMTS";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.r.f
 * JD-Core Version:    0.6.2
 */