package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import textnow.f.i;

public class a
{
  private static final c b;
  private static final Object c;
  final Object a = b.a(this);

  static
  {
    if (Build.VERSION.SDK_INT >= 16)
      b = new d();
    while (true)
    {
      c = b.a();
      return;
      if (Build.VERSION.SDK_INT >= 14)
        b = new b();
      else
        b = new e();
    }
  }

  public static i a(View paramView)
  {
    return b.a(c, paramView);
  }

  public static void a(View paramView, int paramInt)
  {
    b.a(c, paramView, paramInt);
  }

  public static void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.d(c, paramView, paramAccessibilityEvent);
  }

  public static void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.c(c, paramView, paramAccessibilityEvent);
  }

  final Object a()
  {
    return this.a;
  }

  public void a(View paramView, textnow.f.a parama)
  {
    b.a(c, paramView, parama);
  }

  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return b.a(c, paramView, paramInt, paramBundle);
  }

  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return b.a(c, paramViewGroup, paramView, paramAccessibilityEvent);
  }

  public boolean b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return b.a(c, paramView, paramAccessibilityEvent);
  }

  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.b(c, paramView, paramAccessibilityEvent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.a
 * JD-Core Version:    0.6.2
 */