package com.google.android.gms.cast;

import java.util.HashMap;
import java.util.Map;

class MediaMetadata$a
{
  private final Map<String, String> AG = new HashMap();
  private final Map<String, String> AH = new HashMap();
  private final Map<String, Integer> AI = new HashMap();

  public a a(String paramString1, String paramString2, int paramInt)
  {
    this.AG.put(paramString1, paramString2);
    this.AH.put(paramString2, paramString1);
    this.AI.put(paramString1, Integer.valueOf(paramInt));
    return this;
  }

  public String ae(String paramString)
  {
    return (String)this.AG.get(paramString);
  }

  public String af(String paramString)
  {
    return (String)this.AH.get(paramString);
  }

  public int ag(String paramString)
  {
    Integer localInteger = (Integer)this.AI.get(paramString);
    if (localInteger != null)
      return localInteger.intValue();
    return 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.MediaMetadata.a
 * JD-Core Version:    0.6.2
 */