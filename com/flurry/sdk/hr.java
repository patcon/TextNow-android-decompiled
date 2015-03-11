package com.flurry.sdk;

import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public final class hr
{
  protected final ie a;
  protected final InputStream b;
  protected final byte[] c;
  protected int d;
  protected boolean e = true;
  protected int f = 0;
  private int g;
  private int h;
  private final boolean i;

  public hr(ie paramie, InputStream paramInputStream)
  {
    this.a = paramie;
    this.b = paramInputStream;
    this.c = paramie.e();
    this.g = 0;
    this.h = 0;
    this.d = 0;
    this.i = true;
  }

  private void a(String paramString)
  {
    throw new CharConversionException("Unsupported UCS-4 endianness (" + paramString + ") detected");
  }

  private boolean b(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 65279:
    case -131072:
    case 65534:
    case -16842752:
    }
    int j;
    while (true)
    {
      j = paramInt >>> 16;
      if (j != 65279)
        break;
      this.g = (2 + this.g);
      this.f = 2;
      this.e = true;
      return true;
      this.e = true;
      this.g = (4 + this.g);
      this.f = 4;
      return true;
      this.g = (4 + this.g);
      this.f = 4;
      this.e = false;
      return true;
      a("2143");
      a("3412");
    }
    if (j == 65534)
    {
      this.g = (2 + this.g);
      this.f = 2;
      this.e = false;
      return true;
    }
    if (paramInt >>> 8 == 15711167)
    {
      this.g = (3 + this.g);
      this.f = 1;
      this.e = true;
      return true;
    }
    return false;
  }

  private boolean c(int paramInt)
  {
    if (paramInt >> 8 == 0)
      this.e = true;
    while (true)
    {
      this.f = 4;
      boolean bool = true;
      int j;
      do
      {
        return bool;
        if ((0xFFFFFF & paramInt) == 0)
        {
          this.e = false;
          break;
        }
        if ((0xFF00FFFF & paramInt) == 0)
        {
          a("3412");
          break;
        }
        j = 0xFFFF00FF & paramInt;
        bool = false;
      }
      while (j != 0);
      a("2143");
    }
  }

  private boolean d(int paramInt)
  {
    if ((0xFF00 & paramInt) == 0);
    for (this.e = true; ; this.e = false)
    {
      this.f = 2;
      boolean bool = true;
      int j;
      do
      {
        return bool;
        j = paramInt & 0xFF;
        bool = false;
      }
      while (j != 0);
    }
  }

  public final hc a()
  {
    int j = 1;
    int k;
    hc localhc;
    if (a(4))
    {
      k = this.c[this.g] << 24 | (0xFF & this.c[(1 + this.g)]) << 16 | (0xFF & this.c[(2 + this.g)]) << 8 | 0xFF & this.c[(3 + this.g)];
      if (b(k))
      {
        if (j != 0)
          break label177;
        localhc = hc.a;
      }
    }
    while (true)
    {
      this.a.a(localhc);
      return localhc;
      if ((c(k)) || (d(k >>> 16)))
        break;
      do
      {
        j = 0;
        break;
      }
      while ((!a(2)) || (!d((0xFF & this.c[this.g]) << 8 | 0xFF & this.c[(1 + this.g)])));
      break;
      label177: switch (this.f)
      {
      case 3:
      default:
        throw new RuntimeException("Internal error");
      case 1:
        localhc = hc.a;
        break;
      case 2:
        if (this.e)
          localhc = hc.b;
        else
          localhc = hc.c;
        break;
      case 4:
        if (this.e)
          localhc = hc.d;
        else
          localhc = hc.e;
        break;
      }
    }
  }

  public final hj a(int paramInt, hn paramhn, sa paramsa, sb paramsb)
  {
    hc localhc = a();
    boolean bool1 = hj.a.j.a(paramInt);
    boolean bool2 = hj.a.i.a(paramInt);
    if ((localhc == hc.a) && (bool1))
    {
      sa localsa = paramsa.a(bool1, bool2);
      return new ia(this.a, paramInt, this.b, paramhn, localsa, this.c, this.g, this.h, this.i);
    }
    return new hy(this.a, paramInt, b(), paramhn, paramsb.a(bool1, bool2));
  }

  protected final boolean a(int paramInt)
  {
    int k;
    for (int j = this.h - this.g; j < paramInt; j = k + j)
    {
      if (this.b == null);
      for (k = -1; k <= 0; k = this.b.read(this.c, this.h, this.c.length - this.h))
        return false;
      this.h = (k + this.h);
    }
    return true;
  }

  public final Reader b()
  {
    hc localhc = this.a.b();
    switch (1.a[localhc.ordinal()])
    {
    default:
      throw new RuntimeException("Internal error");
    case 1:
    case 2:
      return new in(this.a, this.b, this.c, this.g, this.h, this.a.b().b());
    case 3:
    case 4:
    case 5:
    }
    InputStream localInputStream = this.b;
    Object localObject;
    if (localInputStream == null)
      localObject = new ByteArrayInputStream(this.c, this.g, this.h);
    while (true)
    {
      return new InputStreamReader((InputStream)localObject, localhc.a());
      if (this.g < this.h)
        localObject = new ih(this.a, localInputStream, this.c, this.g, this.h);
      else
        localObject = localInputStream;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hr
 * JD-Core Version:    0.6.2
 */