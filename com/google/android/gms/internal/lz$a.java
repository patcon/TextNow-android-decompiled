package com.google.android.gms.internal;

import java.io.IOException;

public class lz$a extends IOException
{
  lz$a(int paramInt1, int paramInt2)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + paramInt1 + " limit " + paramInt2 + ").");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lz.a
 * JD-Core Version:    0.6.2
 */