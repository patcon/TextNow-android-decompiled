package com.google.android.gms.ads.identifier;

public final class AdvertisingIdClient$Info
{
  private final boolean kA;
  private final String kz;

  public AdvertisingIdClient$Info(String paramString, boolean paramBoolean)
  {
    this.kz = paramString;
    this.kA = paramBoolean;
  }

  public final String getId()
  {
    return this.kz;
  }

  public final boolean isLimitAdTrackingEnabled()
  {
    return this.kA;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.AdvertisingIdClient.Info
 * JD-Core Version:    0.6.2
 */