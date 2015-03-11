package com.flurry.sdk;

import java.io.Flushable;
import java.nio.ByteBuffer;

public abstract class gi
  implements Flushable
{
  public abstract void a();

  public abstract void a(double paramDouble);

  public abstract void a(float paramFloat);

  public abstract void a(int paramInt);

  public abstract void a(long paramLong);

  public abstract void a(gy paramgy);

  public void a(CharSequence paramCharSequence)
  {
    if ((paramCharSequence instanceof gy))
    {
      a((gy)paramCharSequence);
      return;
    }
    a(paramCharSequence.toString());
  }

  public void a(String paramString)
  {
    a(new gy(paramString));
  }

  public abstract void a(ByteBuffer paramByteBuffer);

  public abstract void a(boolean paramBoolean);

  public void a(byte[] paramArrayOfByte)
  {
    a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public abstract void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public abstract void b();

  public abstract void b(int paramInt);

  public abstract void b(long paramLong);

  public void b(byte[] paramArrayOfByte)
  {
    b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public abstract void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public abstract void c();

  public abstract void c(int paramInt);

  public abstract void d();

  public abstract void e();

  public abstract void f();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gi
 * JD-Core Version:    0.6.2
 */