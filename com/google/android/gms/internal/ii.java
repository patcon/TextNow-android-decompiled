package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

public final class ii
{
  private static Pattern Hu = null;

  public static boolean F(Context paramContext)
  {
    return paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch");
  }

  public static int aB(int paramInt)
  {
    return paramInt / 1000;
  }

  public static int aC(int paramInt)
  {
    return paramInt % 1000 / 100;
  }

  public static boolean aD(int paramInt)
  {
    return aC(paramInt) == 3;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ii
 * JD-Core Version:    0.6.2
 */