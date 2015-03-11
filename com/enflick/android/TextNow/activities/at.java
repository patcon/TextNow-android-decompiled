package com.enflick.android.TextNow.activities;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

public final class at extends ar
{
  public final String c;
  private final String d;

  public at(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, aq paramaq)
  {
    super(paramString1, 2.0F, paramString2, paramString3, paramaq);
    this.d = paramString4;
    this.c = paramString5;
  }

  public final Drawable a(Context paramContext)
  {
    return new ColorDrawable(Color.parseColor(this.d));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.at
 * JD-Core Version:    0.6.2
 */