package com.google.android.gms.cast;

import java.util.HashMap;
import java.util.Map;

class MediaMetadata$a
{
  private final Map<String, String> Fr = new HashMap();
  private final Map<String, String> Fs = new HashMap();
  private final Map<String, Integer> Ft = new HashMap();

  public a a(String paramString1, String paramString2, int paramInt)
  {
    this.Fr.put(paramString1, paramString2);
    this.Fs.put(paramString2, paramString1);
    this.Ft.put(paramString1, Integer.valueOf(paramInt));
    return this;
  }

  public String aA(String paramString)
  {
    return (String)this.Fs.get(paramString);
  }

  public int aB(String paramString)
  {
    Integer localInteger = (Integer)this.Ft.get(paramString);
    if (localInteger != null)
      return localInteger.intValue();
    return 0;
  }

  public String az(String paramString)
  {
    return (String)this.Fr.get(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.MediaMetadata.a
 * JD-Core Version:    0.6.2
 */