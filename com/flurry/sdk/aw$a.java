package com.flurry.sdk;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class aw$a extends BufferedOutputStream
{
  private boolean a = false;

  private aw$a(OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }

  private boolean a()
  {
    return this.a;
  }

  public void close()
  {
    try
    {
      super.close();
      return;
    }
    catch (IOException localIOException)
    {
      this.a = true;
      throw localIOException;
    }
  }

  public void flush()
  {
    try
    {
      super.flush();
      return;
    }
    catch (IOException localIOException)
    {
      this.a = true;
      throw localIOException;
    }
  }

  public void write(int paramInt)
  {
    try
    {
      super.write(paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      this.a = true;
      throw localIOException;
    }
  }

  public void write(byte[] paramArrayOfByte)
  {
    try
    {
      super.write(paramArrayOfByte);
      return;
    }
    catch (IOException localIOException)
    {
      this.a = true;
      throw localIOException;
    }
  }

  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      super.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    catch (IOException localIOException)
    {
      this.a = true;
      throw localIOException;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.aw.a
 * JD-Core Version:    0.6.2
 */