package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import textnow.f.e;
import textnow.f.o;

abstract interface c
{
  public abstract Object a();

  public abstract Object a(a parama);

  public abstract o a(Object paramObject, View paramView);

  public abstract void a(Object paramObject, View paramView, int paramInt);

  public abstract void a(Object paramObject, View paramView, e parame);

  public abstract boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle);

  public abstract boolean a(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent);

  public abstract boolean a(Object paramObject, ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent);

  public abstract void b(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent);

  public abstract void c(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent);

  public abstract void d(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.c
 * JD-Core Version:    0.6.2
 */