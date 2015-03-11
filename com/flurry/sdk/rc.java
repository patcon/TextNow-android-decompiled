package com.flurry.sdk;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class rc<K, V> extends LinkedHashMap<K, V>
{
  protected final int a;

  public rc(int paramInt1, int paramInt2)
  {
    super(paramInt1, 0.8F, true);
    this.a = paramInt2;
  }

  protected boolean removeEldestEntry(Map.Entry<K, V> paramEntry)
  {
    return size() > this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.rc
 * JD-Core Version:    0.6.2
 */