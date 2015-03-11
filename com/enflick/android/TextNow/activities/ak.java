package com.enflick.android.TextNow.activities;

import android.content.Context;
import android.graphics.drawable.Drawable;

abstract class ak
  implements Comparable<ak>
{
  public final String a;
  public final String b;
  private final float c;

  public ak(float paramFloat, String paramString1, String paramString2)
  {
    this.c = paramFloat;
    this.a = paramString1;
    this.b = paramString2;
  }

  public int a(ak paramak)
  {
    float f = this.c - paramak.c;
    if (f < 0.0F)
      return -1;
    if (f > 0.0F)
      return 1;
    return this.a.compareTo(paramak.a);
  }

  public abstract Drawable a(Context paramContext);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ak
 * JD-Core Version:    0.6.2
 */