package com.mopub.common;

public enum ClientMetadata$MoPubNetworkType
{
  private final int mId;

  static
  {
    ETHERNET = new MoPubNetworkType("ETHERNET", 1, 1);
    WIFI = new MoPubNetworkType("WIFI", 2, 2);
    MOBILE = new MoPubNetworkType("MOBILE", 3, 3);
    MoPubNetworkType[] arrayOfMoPubNetworkType = new MoPubNetworkType[4];
    arrayOfMoPubNetworkType[0] = UNKNOWN;
    arrayOfMoPubNetworkType[1] = ETHERNET;
    arrayOfMoPubNetworkType[2] = WIFI;
    arrayOfMoPubNetworkType[3] = MOBILE;
  }

  private ClientMetadata$MoPubNetworkType(int paramInt)
  {
    this.mId = paramInt;
  }

  private static MoPubNetworkType fromAndroidNetworkType(int paramInt)
  {
    switch (paramInt)
    {
    case 6:
    case 7:
    case 8:
    default:
      return UNKNOWN;
    case 9:
      return ETHERNET;
    case 1:
      return WIFI;
    case 0:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    return MOBILE;
  }

  public final String toString()
  {
    return Integer.toString(this.mId);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.ClientMetadata.MoPubNetworkType
 * JD-Core Version:    0.6.2
 */