package com.flurry.sdk;

import java.util.Arrays;

public final class rm extends rz
{
  static final rm c = new rm(new byte[0]);
  final byte[] d;

  public rm(byte[] paramArrayOfByte)
  {
    this.d = paramArrayOfByte;
  }

  public static rm a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    if (paramArrayOfByte.length == 0)
      return c;
    return new rm(paramArrayOfByte);
  }

  public final void a(hf paramhf, jw paramjw)
  {
    paramhf.a(this.d);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this)
      bool = true;
    Class localClass1;
    Class localClass2;
    do
    {
      do
      {
        return bool;
        bool = false;
      }
      while (paramObject == null);
      localClass1 = paramObject.getClass();
      localClass2 = getClass();
      bool = false;
    }
    while (localClass1 != localClass2);
    return Arrays.equals(((rm)paramObject).d, this.d);
  }

  public final int hashCode()
  {
    if (this.d == null)
      return -1;
    return this.d.length;
  }

  public final String n()
  {
    return hb.a().a(this.d, false);
  }

  public final String toString()
  {
    return hb.a().a(this.d, true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.rm
 * JD-Core Version:    0.6.2
 */