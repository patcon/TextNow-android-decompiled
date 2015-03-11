package com.flurry.sdk;

import java.nio.ByteBuffer;

public abstract class gc extends gi
{
  public void a()
  {
  }

  public void a(int paramInt)
  {
    c(paramInt);
  }

  public void a(long paramLong)
  {
    if (paramLong > 0L)
      b(paramLong);
  }

  public void a(gy paramgy)
  {
    a(paramgy.a(), 0, paramgy.b());
  }

  public void a(String paramString)
  {
    if (paramString.length() == 0)
    {
      g();
      return;
    }
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    c(arrayOfByte.length);
    b(arrayOfByte, 0, arrayOfByte.length);
  }

  public void a(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = i + paramByteBuffer.arrayOffset();
    int k = paramByteBuffer.limit() - i;
    a(paramByteBuffer.array(), j, k);
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
    {
      g();
      return;
    }
    c(paramInt2);
    b(paramArrayOfByte, paramInt1, paramInt2);
  }

  public void b()
  {
  }

  public void b(int paramInt)
  {
    c(paramInt);
  }

  public void c()
  {
  }

  public void d()
  {
    g();
  }

  public void e()
  {
  }

  public void f()
  {
    g();
  }

  protected abstract void g();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gc
 * JD-Core Version:    0.6.2
 */