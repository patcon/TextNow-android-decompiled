package com.admarvel.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;

public enum AdMarvelBitmapDrawableUtils$a
{
  private final String p;
  private BitmapDrawable q;
  private int r;

  static
  {
    a[] arrayOfa = new a[15];
    arrayOfa[0] = a;
    arrayOfa[1] = b;
    arrayOfa[2] = c;
    arrayOfa[3] = d;
    arrayOfa[4] = e;
    arrayOfa[5] = f;
    arrayOfa[6] = g;
    arrayOfa[7] = h;
    arrayOfa[8] = i;
    arrayOfa[9] = j;
    arrayOfa[10] = k;
    arrayOfa[11] = l;
    arrayOfa[12] = m;
    arrayOfa[13] = n;
    arrayOfa[14] = o;
  }

  private AdMarvelBitmapDrawableUtils$a(String paramString)
  {
    this.p = paramString;
  }

  private byte[] a(String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    int i1 = arrayOfString.length;
    byte[] arrayOfByte = new byte[i1];
    for (int i2 = 0; i2 < i1; i2++)
      arrayOfByte[i2] = Byte.parseByte(arrayOfString[i2]);
    this.r = arrayOfByte.length;
    return arrayOfByte;
  }

  public final BitmapDrawable a(Context paramContext)
  {
    if (this.q == null)
    {
      int i1 = d.b(paramContext.getResources().getDisplayMetrics().xdpi, paramContext);
      this.q = new BitmapDrawable(BitmapFactory.decodeByteArray(a(this.p), 0, this.r));
      this.q.setTargetDensity(i1);
    }
    return this.q;
  }

  public final BitmapDrawable a(Context paramContext, String paramString)
  {
    if (paramString == null)
      return null;
    if (this.q == null)
    {
      int i1 = d.b(paramContext.getResources().getDisplayMetrics().xdpi, paramContext);
      this.q = new BitmapDrawable(BitmapFactory.decodeByteArray(a(paramString), 0, this.r));
      this.q.setTargetDensity(i1);
    }
    return this.q;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.AdMarvelBitmapDrawableUtils.a
 * JD-Core Version:    0.6.2
 */