package com.facebook.internal;

public class Utility$FetchedAppSettings
{
  private boolean supportsAttribution;
  private boolean supportsImplicitLogging;

  private Utility$FetchedAppSettings(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.supportsAttribution = paramBoolean1;
    this.supportsImplicitLogging = paramBoolean2;
  }

  public boolean supportsAttribution()
  {
    return this.supportsAttribution;
  }

  public boolean supportsImplicitLogging()
  {
    return this.supportsImplicitLogging;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.internal.Utility.FetchedAppSettings
 * JD-Core Version:    0.6.2
 */