package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class hk$a
{
  private final List<String> GJ;
  private final Object GK;

  private hk$a(Object paramObject)
  {
    this.GK = hm.f(paramObject);
    this.GJ = new ArrayList();
  }

  public final a a(String paramString, Object paramObject)
  {
    this.GJ.add((String)hm.f(paramString) + "=" + String.valueOf(paramObject));
    return this;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100).append(this.GK.getClass().getSimpleName()).append('{');
    int i = this.GJ.size();
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append((String)this.GJ.get(j));
      if (j < i - 1)
        localStringBuilder.append(", ");
    }
    return '}';
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hk.a
 * JD-Core Version:    0.6.2
 */