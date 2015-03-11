package com.flurry.sdk;

import java.io.OutputStream;

class gd$b extends gd.a
{
  private final OutputStream a;

  private gd$b(OutputStream paramOutputStream)
  {
    this.a = paramOutputStream;
  }

  protected void a()
  {
    this.a.flush();
  }

  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gd.b
 * JD-Core Version:    0.6.2
 */