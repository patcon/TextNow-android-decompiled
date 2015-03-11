package com.admarvel.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

public class d
{
  public static float a(float paramFloat, Context paramContext)
  {
    return TypedValue.applyDimension(1, paramFloat, paramContext.getResources().getDisplayMetrics());
  }

  public static int b(float paramFloat, Context paramContext)
  {
    return (int)(0.5F + a(paramFloat, paramContext));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.d
 * JD-Core Version:    0.6.2
 */