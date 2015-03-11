package com.google.android.gms.common.internal;

import java.util.Arrays;

public final class n
{
  public static boolean equal(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }

  public static n.a h(Object paramObject)
  {
    return new n.a(paramObject, null);
  }

  public static int hashCode(Object[] paramArrayOfObject)
  {
    return Arrays.hashCode(paramArrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.n
 * JD-Core Version:    0.6.2
 */