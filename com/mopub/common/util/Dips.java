package com.mopub.common.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class Dips
{
  public static float asFloatPixels(float paramFloat, Context paramContext)
  {
    return TypedValue.applyDimension(1, paramFloat, paramContext.getResources().getDisplayMetrics());
  }

  public static int asIntPixels(float paramFloat, Context paramContext)
  {
    return (int)(0.5F + asFloatPixels(paramFloat, paramContext));
  }

  public static float dipsToFloatPixels(float paramFloat, Context paramContext)
  {
    return paramFloat * getDensity(paramContext);
  }

  public static int dipsToIntPixels(float paramFloat, Context paramContext)
  {
    return (int)(0.5F + dipsToFloatPixels(paramFloat, paramContext));
  }

  private static float getDensity(Context paramContext)
  {
    return paramContext.getResources().getDisplayMetrics().density;
  }

  public static float pixelsToFloatDips(float paramFloat, Context paramContext)
  {
    return paramFloat / getDensity(paramContext);
  }

  public static int pixelsToIntDips(float paramFloat, Context paramContext)
  {
    return (int)(0.5F + pixelsToFloatDips(paramFloat, paramContext));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.Dips
 * JD-Core Version:    0.6.2
 */