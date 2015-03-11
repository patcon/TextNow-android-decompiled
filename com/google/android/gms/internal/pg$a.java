package com.google.android.gms.internal;

import java.io.IOException;

public class pg$a extends IOException
{
  pg$a(int paramInt1, int paramInt2)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + paramInt1 + " limit " + paramInt2 + ").");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pg.a
 * JD-Core Version:    0.6.2
 */