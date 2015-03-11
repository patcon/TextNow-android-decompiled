package com.admarvel.android.ads;

import android.telephony.TelephonyManager;

class r$h
{
  static String a(TelephonyManager paramTelephonyManager)
  {
    switch (paramTelephonyManager.getNetworkType())
    {
    default:
      return "";
    case 2:
      return "EDGE";
    case 1:
      return "GPRS";
    case 7:
      return "1xRTT";
    case 4:
      return "CDMA";
    case 5:
      return "EVDO_0";
    case 6:
      return "EVDO_A";
    case 3:
    }
    return "UMTS";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.r.h
 * JD-Core Version:    0.6.2
 */