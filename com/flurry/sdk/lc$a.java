package com.flurry.sdk;

import java.util.ArrayList;
import java.util.HashMap;

public class lc$a
{
  private final ArrayList<lc.b> a = new ArrayList();
  private final HashMap<String, Integer> b = new HashMap();

  public lc a()
  {
    return new lc((lc.b[])this.a.toArray(new lc.b[this.a.size()]), this.b, null, null);
  }

  public void a(kt paramkt, String paramString)
  {
    Integer localInteger = Integer.valueOf(this.a.size());
    this.a.add(new lc.b(paramkt, paramString));
    this.b.put(paramkt.c(), localInteger);
    this.b.put(paramString, localInteger);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lc.a
 * JD-Core Version:    0.6.2
 */