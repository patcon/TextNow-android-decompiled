package com.google.android.gms.internal;

public class ks$e
{
  public static int bA(String paramString)
  {
    if (paramString.equals("person"))
      return 0;
    if (paramString.equals("page"))
      return 1;
    throw new IllegalArgumentException("Unknown objectType string: " + paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ks.e
 * JD-Core Version:    0.6.2
 */