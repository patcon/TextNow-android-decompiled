package com.google.android.gms.ads.identifier;

public final class AdvertisingIdClient$Info
{
  private final String ln;
  private final boolean lo;

  public AdvertisingIdClient$Info(String paramString, boolean paramBoolean)
  {
    this.ln = paramString;
    this.lo = paramBoolean;
  }

  public final String getId()
  {
    return this.ln;
  }

  public final boolean isLimitAdTrackingEnabled()
  {
    return this.lo;
  }

  public final String toString()
  {
    return "{" + this.ln + "}" + this.lo;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.AdvertisingIdClient.Info
 * JD-Core Version:    0.6.2
 */