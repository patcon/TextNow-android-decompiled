package com.flurry.sdk;

import java.io.DataInput;
import java.io.DataOutput;

public class aq
{
  String a;
  ay b;
  long c;
  long d;
  ar e;
  long f;
  long g;

  public aq(DataInput paramDataInput)
  {
    this.a = paramDataInput.readUTF();
    this.b = ay.a(paramDataInput.readInt());
    this.c = paramDataInput.readLong();
    this.d = paramDataInput.readLong();
    this.e = ar.a(paramDataInput.readInt());
    this.f = paramDataInput.readLong();
    this.g = paramDataInput.readLong();
  }

  public aq(String paramString, ay paramay, long paramLong)
  {
    this.a = paramString;
    this.b = paramay;
    this.c = System.currentTimeMillis();
    this.d = System.currentTimeMillis();
    this.e = ar.a;
    this.f = paramLong;
    this.g = -1L;
  }

  public String a()
  {
    return this.a;
  }

  public void a(long paramLong)
  {
    try
    {
      this.g = paramLong;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(ar paramar)
  {
    try
    {
      this.e = paramar;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(DataOutput paramDataOutput)
  {
    paramDataOutput.writeUTF(this.a);
    paramDataOutput.writeInt(this.b.a());
    paramDataOutput.writeLong(this.c);
    paramDataOutput.writeLong(this.d);
    paramDataOutput.writeInt(this.e.a());
    paramDataOutput.writeLong(this.f);
    paramDataOutput.writeLong(this.g);
  }

  public ar b()
  {
    try
    {
      ar localar = this.e;
      return localar;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public long c()
  {
    return this.f;
  }

  public boolean d()
  {
    return (this.f > 0L) && (System.currentTimeMillis() > this.f);
  }

  public void e()
  {
    try
    {
      this.d = System.currentTimeMillis();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public long f()
  {
    return this.c;
  }

  public String toString()
  {
    return "url: " + this.a + ", type:" + this.b + ", creation:" + this.c + ", accessed:" + this.d + ", status: " + this.e + ", expiration: " + this.f + ", size: " + this.g;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.aq
 * JD-Core Version:    0.6.2
 */