package com.flurry.sdk;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

final class fn$r extends LinkedHashMap<String, String>
{
  private Set<String> a;

  public fn$r(Set<String> paramSet)
  {
    super(1);
    this.a = paramSet;
  }

  public final void a(hf paramhf)
  {
    Iterator localIterator = entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      paramhf.a((String)localEntry.getKey(), (String)localEntry.getValue());
    }
  }

  public final void a(String paramString1, String paramString2)
  {
    if (this.a.contains(paramString1))
      throw new fk("Can't set reserved property: " + paramString1);
    if (paramString2 == null)
      throw new fk("Can't set a property to null: " + paramString1);
    String str = (String)get(paramString1);
    if (str == null)
      put(paramString1, paramString2);
    while (str.equals(paramString2))
      return;
    throw new fk("Can't overwrite property: " + paramString1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.r
 * JD-Core Version:    0.6.2
 */