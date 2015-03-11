package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hm;

public abstract class d
{
  protected final DataHolder DG;
  protected int EC;
  private int ED;

  public d(DataHolder paramDataHolder, int paramInt)
  {
    this.DG = ((DataHolder)hm.f(paramDataHolder));
    ac(paramInt);
  }

  protected void a(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    this.DG.a(paramString, this.EC, this.ED, paramCharArrayBuffer);
  }

  protected void ac(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.DG.getCount()));
    for (boolean bool = true; ; bool = false)
    {
      hm.A(bool);
      this.EC = paramInt;
      this.ED = this.DG.ae(this.EC);
      return;
    }
  }

  public boolean av(String paramString)
  {
    return this.DG.av(paramString);
  }

  protected Uri aw(String paramString)
  {
    return this.DG.g(paramString, this.EC, this.ED);
  }

  protected boolean ax(String paramString)
  {
    return this.DG.h(paramString, this.EC, this.ED);
  }

  protected int eV()
  {
    return this.EC;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof d;
    boolean bool2 = false;
    if (bool1)
    {
      d locald = (d)paramObject;
      boolean bool3 = hk.equal(Integer.valueOf(locald.EC), Integer.valueOf(this.EC));
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = hk.equal(Integer.valueOf(locald.ED), Integer.valueOf(this.ED));
        bool2 = false;
        if (bool4)
        {
          DataHolder localDataHolder1 = locald.DG;
          DataHolder localDataHolder2 = this.DG;
          bool2 = false;
          if (localDataHolder1 == localDataHolder2)
            bool2 = true;
        }
      }
    }
    return bool2;
  }

  protected boolean getBoolean(String paramString)
  {
    return this.DG.d(paramString, this.EC, this.ED);
  }

  protected byte[] getByteArray(String paramString)
  {
    return this.DG.f(paramString, this.EC, this.ED);
  }

  protected float getFloat(String paramString)
  {
    return this.DG.e(paramString, this.EC, this.ED);
  }

  protected int getInteger(String paramString)
  {
    return this.DG.b(paramString, this.EC, this.ED);
  }

  protected long getLong(String paramString)
  {
    return this.DG.a(paramString, this.EC, this.ED);
  }

  protected String getString(String paramString)
  {
    return this.DG.c(paramString, this.EC, this.ED);
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.EC);
    arrayOfObject[1] = Integer.valueOf(this.ED);
    arrayOfObject[2] = this.DG;
    return hk.hashCode(arrayOfObject);
  }

  public boolean isDataValid()
  {
    return !this.DG.isClosed();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.d
 * JD-Core Version:    0.6.2
 */