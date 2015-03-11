package com.enflick.android.TextNow.activities;

import android.content.Context;
import android.graphics.drawable.Drawable;

abstract class ar
  implements Comparable<ar>
{
  public final String a;
  public final String b;
  private final float c;
  private String d;
  private aq e;

  public ar(String paramString1, float paramFloat, String paramString2, String paramString3, aq paramaq)
  {
    this.c = paramFloat;
    this.a = paramString2;
    this.b = paramString3;
    this.e = paramaq;
    this.d = paramString1;
  }

  public int a(ar paramar)
  {
    float f = this.c - paramar.c;
    if (f < 0.0F)
      return -1;
    if (f > 0.0F)
      return 1;
    return this.d.compareTo(paramar.d);
  }

  public abstract Drawable a(Context paramContext);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ar
 * JD-Core Version:    0.6.2
 */