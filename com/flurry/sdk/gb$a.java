package com.flurry.sdk;

class gb$a
{
  boolean a = false;
  private final gb b;
  private byte[] c;
  private int d;
  private int e;

  private gb$a(gb paramgb)
  {
    this.b = paramgb;
  }

  void a()
  {
    this.c = gb.a(this.b);
    this.d = gb.b(this.b);
    this.e = gb.c(this.b);
    this.a = true;
  }

  void a(int paramInt)
  {
    if (this.a)
    {
      this.d = paramInt;
      return;
    }
    gb.a(this.b, paramInt);
  }

  void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.a)
    {
      this.c = paramArrayOfByte;
      this.e = (paramInt1 + paramInt2);
      this.d = paramInt1;
      return;
    }
    gb.a(this.b, paramArrayOfByte);
    gb.b(this.b, paramInt1 + paramInt2);
    gb.a(this.b, paramInt1);
    gb.c(this.b, paramInt1);
  }

  int b()
  {
    if (this.a)
      return this.d;
    return gb.b(this.b);
  }

  void b(int paramInt)
  {
    if (this.a)
    {
      this.e = paramInt;
      return;
    }
    gb.b(this.b, paramInt);
  }

  int c()
  {
    if (this.a)
      return this.e;
    return gb.c(this.b);
  }

  byte[] d()
  {
    if (this.a)
      return this.c;
    return gb.a(this.b);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gb.a
 * JD-Core Version:    0.6.2
 */