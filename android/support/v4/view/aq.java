package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public final class aq
{
  static final ba a = new as();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new ar();
      return;
    }
    if (i >= 19)
    {
      a = new az();
      return;
    }
    if (i >= 17)
    {
      a = new ay();
      return;
    }
    if (i >= 16)
    {
      a = new ax();
      return;
    }
    if (i >= 14)
    {
      a = new aw();
      return;
    }
    if (i >= 11)
    {
      a = new av();
      return;
    }
    if (i >= 9)
    {
      a = new au();
      return;
    }
    if (i >= 7)
    {
      a = new at();
      return;
    }
  }

  public static int a(View paramView)
  {
    return a.a(paramView);
  }

  public static void a(View paramView, float paramFloat)
  {
    a.b(paramView, paramFloat);
  }

  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    a.a(paramView, paramInt, paramPaint);
  }

  public static void a(View paramView, Paint paramPaint)
  {
    a.a(paramView, paramPaint);
  }

  public static void a(View paramView, a parama)
  {
    a.a(paramView, parama);
  }

  public static void a(View paramView, Runnable paramRunnable)
  {
    a.a(paramView, paramRunnable);
  }

  public static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a.a(paramViewGroup, true);
  }

  public static boolean a(View paramView, int paramInt)
  {
    return a.a(paramView, paramInt);
  }

  public static void b(View paramView)
  {
    a.b(paramView);
  }

  public static void b(View paramView, float paramFloat)
  {
    a.c(paramView, paramFloat);
  }

  public static boolean b(View paramView, int paramInt)
  {
    return a.b(paramView, -1);
  }

  public static int c(View paramView)
  {
    return a.c(paramView);
  }

  public static void c(View paramView, float paramFloat)
  {
    a.a(paramView, paramFloat);
  }

  public static void c(View paramView, int paramInt)
  {
    a.c(paramView, paramInt);
  }

  public static int d(View paramView)
  {
    return a.d(paramView);
  }

  public static int e(View paramView)
  {
    return a.e(paramView);
  }

  public static ViewParent f(View paramView)
  {
    return a.f(paramView);
  }

  public static boolean g(View paramView)
  {
    return a.g(paramView);
  }

  public static float h(View paramView)
  {
    return a.h(paramView);
  }

  public static boolean i(View paramView)
  {
    return a.i(paramView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.aq
 * JD-Core Version:    0.6.2
 */