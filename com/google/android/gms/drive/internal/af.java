package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.ly;
import com.google.android.gms.internal.lz;
import com.google.android.gms.internal.ma;
import com.google.android.gms.internal.me;
import java.util.List;

public final class af extends ma<af>
{
  public String Jt;
  public long Ju;
  public long Jv;
  public int versionCode;

  public af()
  {
    gs();
  }

  public static af g(byte[] paramArrayOfByte)
  {
    return (af)me.a(new af(), paramArrayOfByte);
  }

  public final void a(lz paramlz)
  {
    paramlz.p(1, this.versionCode);
    paramlz.b(2, this.Jt);
    paramlz.c(3, this.Ju);
    paramlz.c(4, this.Jv);
    super.a(paramlz);
  }

  protected final int c()
  {
    return super.c() + lz.r(1, this.versionCode) + lz.h(2, this.Jt) + lz.e(3, this.Ju) + lz.e(4, this.Jv);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    af localaf;
    do
    {
      return true;
      if (!(paramObject instanceof af))
        return false;
      localaf = (af)paramObject;
      if (this.versionCode != localaf.versionCode)
        return false;
      if (this.Jt == null)
      {
        if (localaf.Jt != null)
          return false;
      }
      else if (!this.Jt.equals(localaf.Jt))
        return false;
      if (this.Ju != localaf.Ju)
        return false;
      if (this.Jv != localaf.Jv)
        return false;
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break;
    }
    while ((localaf.amX == null) || (localaf.amX.isEmpty()));
    return false;
    return this.amX.equals(localaf.amX);
  }

  public final af gs()
  {
    this.versionCode = 1;
    this.Jt = "";
    this.Ju = -1L;
    this.Jv = -1L;
    this.amX = null;
    this.anb = -1;
    return this;
  }

  public final int hashCode()
  {
    int i = 31 * (527 + this.versionCode);
    int j;
    int k;
    int m;
    if (this.Jt == null)
    {
      j = 0;
      k = 31 * (31 * (31 * (j + i) + (int)(this.Ju ^ this.Ju >>> 32)) + (int)(this.Jv ^ this.Jv >>> 32));
      List localList = this.amX;
      m = 0;
      if (localList != null)
      {
        boolean bool = this.amX.isEmpty();
        m = 0;
        if (!bool)
          break label111;
      }
    }
    while (true)
    {
      return k + m;
      j = this.Jt.hashCode();
      break;
      label111: m = this.amX.hashCode();
    }
  }

  public final af m(ly paramly)
  {
    while (true)
    {
      int i = paramly.nB();
      switch (i)
      {
      default:
        if (a(paramly, i))
          continue;
      case 0:
        return this;
      case 8:
        this.versionCode = paramly.nE();
        break;
      case 18:
        this.Jt = paramly.readString();
        break;
      case 24:
        this.Ju = paramly.nH();
        break;
      case 32:
      }
      this.Jv = paramly.nH();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.af
 * JD-Core Version:    0.6.2
 */