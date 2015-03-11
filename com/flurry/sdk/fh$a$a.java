package com.flurry.sdk;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class fh$a$a extends FilterOutputStream
{
  private fh$a$a(fh.a parama, OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }

  public void close()
  {
    try
    {
      this.out.close();
      return;
    }
    catch (IOException localIOException)
    {
      fh.a.a(this.a, true);
    }
  }

  public void flush()
  {
    try
    {
      this.out.flush();
      return;
    }
    catch (IOException localIOException)
    {
      fh.a.a(this.a, true);
    }
  }

  public void write(int paramInt)
  {
    try
    {
      this.out.write(paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      fh.a.a(this.a, true);
    }
  }

  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      this.out.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    catch (IOException localIOException)
    {
      fh.a.a(this.a, true);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fh.a.a
 * JD-Core Version:    0.6.2
 */