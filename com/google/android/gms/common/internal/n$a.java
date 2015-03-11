package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

public final class n$a
{
  private final List<String> Mg;
  private final Object Mh;

  private n$a(Object paramObject)
  {
    this.Mh = o.i(paramObject);
    this.Mg = new ArrayList();
  }

  public final a a(String paramString, Object paramObject)
  {
    this.Mg.add((String)o.i(paramString) + "=" + String.valueOf(paramObject));
    return this;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100).append(this.Mh.getClass().getSimpleName()).append('{');
    int i = this.Mg.size();
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append((String)this.Mg.get(j));
      if (j < i - 1)
        localStringBuilder.append(", ");
    }
    return '}';
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.n.a
 * JD-Core Version:    0.6.2
 */