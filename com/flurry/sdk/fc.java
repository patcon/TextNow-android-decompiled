package com.flurry.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;

public class fc
{
  public static int a(int paramInt)
  {
    DisplayMetrics localDisplayMetrics = c();
    return Math.round(paramInt / localDisplayMetrics.density);
  }

  @SuppressLint({"NewApi"})
  public static Point a()
  {
    Display localDisplay = ((WindowManager)do.a().b().getSystemService("window")).getDefaultDisplay();
    Point localPoint = new Point();
    if (Build.VERSION.SDK_INT >= 17)
    {
      localDisplay.getRealSize(localPoint);
      return localPoint;
    }
    if (Build.VERSION.SDK_INT >= 14)
      try
      {
        Method localMethod = Display.class.getMethod("getRawHeight", new Class[0]);
        localPoint.x = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(localDisplay, new Object[0])).intValue();
        localPoint.y = ((Integer)localMethod.invoke(localDisplay, new Object[0])).intValue();
        return localPoint;
      }
      catch (Throwable localThrowable)
      {
        localDisplay.getSize(localPoint);
        return localPoint;
      }
    if (Build.VERSION.SDK_INT >= 13)
    {
      localDisplay.getSize(localPoint);
      return localPoint;
    }
    localPoint.x = localDisplay.getWidth();
    localPoint.y = localDisplay.getHeight();
    return localPoint;
  }

  public static int b(int paramInt)
  {
    DisplayMetrics localDisplayMetrics = c();
    return Math.round(paramInt * localDisplayMetrics.density);
  }

  public static DisplayMetrics b()
  {
    Display localDisplay = ((WindowManager)do.a().b().getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }

  @SuppressLint({"NewApi"})
  public static DisplayMetrics c()
  {
    Display localDisplay = ((WindowManager)do.a().b().getSystemService("window")).getDefaultDisplay();
    if (Build.VERSION.SDK_INT >= 17)
    {
      DisplayMetrics localDisplayMetrics1 = new DisplayMetrics();
      localDisplay.getRealMetrics(localDisplayMetrics1);
      return localDisplayMetrics1;
    }
    if (Build.VERSION.SDK_INT >= 14)
      try
      {
        DisplayMetrics localDisplayMetrics2 = new DisplayMetrics();
        Display.class.getMethod("getRealMetrics", new Class[0]).invoke(localDisplay, new Object[] { localDisplayMetrics2 });
        return localDisplayMetrics2;
      }
      catch (Exception localException)
      {
      }
    return b();
  }

  public static Pair<Integer, Integer> c(int paramInt)
  {
    int i = g();
    int j = h();
    switch (paramInt)
    {
    default:
      return Pair.create(Integer.valueOf(i), Integer.valueOf(j));
    case 2:
    }
    return Pair.create(Integer.valueOf(j), Integer.valueOf(i));
  }

  public static float d()
  {
    return c().density;
  }

  public static int e()
  {
    return a().x;
  }

  public static int f()
  {
    return a().y;
  }

  public static int g()
  {
    return a(e());
  }

  public static int h()
  {
    return a(f());
  }

  public static int i()
  {
    Point localPoint = a();
    if (localPoint.x == localPoint.y)
      return 3;
    if (localPoint.x < localPoint.y)
      return 1;
    return 2;
  }

  public static Pair<Integer, Integer> j()
  {
    return Pair.create(Integer.valueOf(g()), Integer.valueOf(h()));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fc
 * JD-Core Version:    0.6.2
 */