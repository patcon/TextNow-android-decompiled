package com.mopub.common.util;

import org.apache.http.conn.util.InetAddressUtils;

public enum DeviceUtils$IP
{
  static
  {
    IP[] arrayOfIP = new IP[2];
    arrayOfIP[0] = IPv4;
    arrayOfIP[1] = IPv6;
  }

  private boolean matches(String paramString)
  {
    switch (DeviceUtils.1.$SwitchMap$com$mopub$common$util$DeviceUtils$IP[ordinal()])
    {
    default:
      return false;
    case 1:
      return InetAddressUtils.isIPv4Address(paramString);
    case 2:
    }
    return InetAddressUtils.isIPv6Address(paramString);
  }

  private String toString(String paramString)
  {
    switch (DeviceUtils.1.$SwitchMap$com$mopub$common$util$DeviceUtils$IP[ordinal()])
    {
    default:
      paramString = null;
    case 1:
      return paramString;
    case 2:
    }
    return paramString.split("%")[0];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.DeviceUtils.IP
 * JD-Core Version:    0.6.2
 */