package com.flurry.sdk;

import java.io.DataInput;
import java.io.DataOutput;

public final class x
{
  private String a;
  private long b;
  private long c;
  private int d;
  private int e;
  private int f;
  private int g;

  public x()
  {
  }

  public x(DataInput paramDataInput)
  {
    this.a = paramDataInput.readUTF();
    this.b = paramDataInput.readLong();
    this.c = paramDataInput.readLong();
    this.d = paramDataInput.readInt();
    this.e = paramDataInput.readInt();
    this.f = paramDataInput.readInt();
    this.g = paramDataInput.readInt();
  }

  public x(String paramString, long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramString;
    this.b = paramLong1;
    this.c = paramLong2;
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramInt3;
    this.d = 0;
  }

  public final x a()
  {
    x localx = new x(b(), i(), h(), e(), f(), g());
    localx.d = c();
    return localx;
  }

  public final void a(int paramInt)
  {
    this.d = paramInt;
  }

  public final void a(DataOutput paramDataOutput)
  {
    paramDataOutput.writeUTF(this.a);
    paramDataOutput.writeLong(this.b);
    paramDataOutput.writeLong(this.c);
    paramDataOutput.writeInt(this.d);
    paramDataOutput.writeInt(this.e);
    paramDataOutput.writeInt(this.f);
    paramDataOutput.writeInt(this.g);
  }

  public final String b()
  {
    return this.a;
  }

  public final int c()
  {
    return this.d;
  }

  public final void d()
  {
    this.d = (1 + this.d);
  }

  public final int e()
  {
    return this.e;
  }

  public final int f()
  {
    return this.f;
  }

  public final int g()
  {
    return this.g;
  }

  public final long h()
  {
    return this.c;
  }

  public final long i()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.x
 * JD-Core Version:    0.6.2
 */