package com.enflick.android.TextNow.activities;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

public final class am extends ak
{
  public final String c;
  private final String d;

  public am(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    super(2.0F, paramString1, paramString2);
    this.d = paramString3;
    this.c = paramString4;
  }

  public final Drawable a(Context paramContext)
  {
    return new ColorDrawable(Color.parseColor(this.d));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.am
 * JD-Core Version:    0.6.2
 */