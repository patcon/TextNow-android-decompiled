package com.google.android.gms.internal;

public final class il
  implements ij
{
  private static il Hv;

  public static ij gb()
  {
    try
    {
      if (Hv == null)
        Hv = new il();
      il localil = Hv;
      return localil;
    }
    finally
    {
    }
  }

  public final long currentTimeMillis()
  {
    return System.currentTimeMillis();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.il
 * JD-Core Version:    0.6.2
 */