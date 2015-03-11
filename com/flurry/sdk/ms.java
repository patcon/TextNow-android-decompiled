package com.flurry.sdk;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class ms
  implements Iterable<mr>
{
  protected LinkedHashMap<mz, mr> a;

  public final mr a(String paramString, Class<?>[] paramArrayOfClass)
  {
    if (this.a == null)
      return null;
    return (mr)this.a.get(new mz(paramString, paramArrayOfClass));
  }

  public final mr a(Method paramMethod)
  {
    if (this.a != null)
      return (mr)this.a.remove(new mz(paramMethod));
    return null;
  }

  public final void a(mr parammr)
  {
    if (this.a == null)
      this.a = new LinkedHashMap();
    this.a.put(new mz(parammr.e()), parammr);
  }

  public final boolean a()
  {
    return (this.a == null) || (this.a.size() == 0);
  }

  public final mr b(Method paramMethod)
  {
    if (this.a == null)
      return null;
    return (mr)this.a.get(new mz(paramMethod));
  }

  public final Iterator<mr> iterator()
  {
    if (this.a != null)
      return this.a.values().iterator();
    return Collections.emptyList().iterator();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ms
 * JD-Core Version:    0.6.2
 */