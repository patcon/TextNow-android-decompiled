package com.google.android.gms.internal;

public class nz$e
{
  public static int ci(String paramString)
  {
    if (paramString.equals("person"))
      return 0;
    if (paramString.equals("page"))
      return 1;
    throw new IllegalArgumentException("Unknown objectType string: " + paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nz.e
 * JD-Core Version:    0.6.2
 */