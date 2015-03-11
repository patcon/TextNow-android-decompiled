package com.stripe;

public abstract class Stripe
{
  public static final String LIVE_API_BASE = "https://api.stripe.com";
  public static final String VERSION = "1.12.0";
  private static String apiBase = "https://api.stripe.com";
  public static String apiKey;
  public static String apiVersion;

  public static String getApiBase()
  {
    return apiBase;
  }

  public static void overrideApiBase(String paramString)
  {
    apiBase = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.Stripe
 * JD-Core Version:    0.6.2
 */