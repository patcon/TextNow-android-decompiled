package com.enflick.android.TextNow.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.q;

public final class n extends q
{
  private String[] a;
  private String[] b;
  private int[] c;
  private int d = 0;

  public n(android.support.v4.app.n paramn, String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt)
  {
    super(paramn);
    this.a = paramArrayOfString1;
    this.b = paramArrayOfString2;
    this.c = paramArrayOfInt;
    this.d = this.a.length;
  }

  public final Fragment a(int paramInt)
  {
    return o.a(this.c[paramInt], this.a[paramInt], this.b[paramInt]);
  }

  public final int b()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.n
 * JD-Core Version:    0.6.2
 */