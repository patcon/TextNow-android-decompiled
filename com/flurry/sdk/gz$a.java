package com.flurry.sdk;

import java.lang.ref.WeakReference;

class gz$a extends WeakReference<K>
{
  int a;

  gz$a(gz paramgz, Object paramObject)
  {
    super(paramObject, gz.a(paramgz));
    this.a = System.identityHashCode(paramObject);
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    a locala;
    do
    {
      return true;
      locala = (a)paramObject;
    }
    while (get() == locala.get());
    return false;
  }

  public int hashCode()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gz.a
 * JD-Core Version:    0.6.2
 */