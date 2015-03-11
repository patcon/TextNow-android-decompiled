package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

final class d extends b
{
  public final Object a(final a parama)
  {
    return new h.1(new i()
    {
      public final Object a(View paramAnonymousView)
      {
        textnow.f.i locali = a.a(paramAnonymousView);
        if (locali != null)
          return locali.a();
        return null;
      }

      public final void a(View paramAnonymousView, int paramAnonymousInt)
      {
        a.a(paramAnonymousView, paramAnonymousInt);
      }

      public final void a(View paramAnonymousView, Object paramAnonymousObject)
      {
        parama.a(paramAnonymousView, new textnow.f.a(paramAnonymousObject));
      }

      public final boolean a(View paramAnonymousView, int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        return parama.a(paramAnonymousView, paramAnonymousInt, paramAnonymousBundle);
      }

      public final boolean a(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
      {
        return parama.b(paramAnonymousView, paramAnonymousAccessibilityEvent);
      }

      public final boolean a(ViewGroup paramAnonymousViewGroup, View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
      {
        return parama.a(paramAnonymousViewGroup, paramAnonymousView, paramAnonymousAccessibilityEvent);
      }

      public final void b(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
      {
        parama.d(paramAnonymousView, paramAnonymousAccessibilityEvent);
      }

      public final void c(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
      {
        a.c(paramAnonymousView, paramAnonymousAccessibilityEvent);
      }

      public final void d(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
      {
        a.a(paramAnonymousView, paramAnonymousAccessibilityEvent);
      }
    });
  }

  public final textnow.f.i a(Object paramObject, View paramView)
  {
    AccessibilityNodeProvider localAccessibilityNodeProvider = ((View.AccessibilityDelegate)paramObject).getAccessibilityNodeProvider(paramView);
    if (localAccessibilityNodeProvider != null)
      return new textnow.f.i(localAccessibilityNodeProvider);
    return null;
  }

  public final boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return ((View.AccessibilityDelegate)paramObject).performAccessibilityAction(paramView, paramInt, paramBundle);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.d
 * JD-Core Version:    0.6.2
 */