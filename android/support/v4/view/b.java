package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

class b extends e
{
  public final Object a()
  {
    return new View.AccessibilityDelegate();
  }

  public Object a(final a parama)
  {
    return new f.1(new g()
    {
      public final void a(View paramAnonymousView, int paramAnonymousInt)
      {
        a.a(paramAnonymousView, paramAnonymousInt);
      }

      public final void a(View paramAnonymousView, Object paramAnonymousObject)
      {
        parama.a(paramAnonymousView, new textnow.f.e(paramAnonymousObject));
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

  public final void a(Object paramObject, View paramView, int paramInt)
  {
    ((View.AccessibilityDelegate)paramObject).sendAccessibilityEvent(paramView, paramInt);
  }

  public final void a(Object paramObject, View paramView, textnow.f.e parame)
  {
    Object localObject = parame.a();
    ((View.AccessibilityDelegate)paramObject).onInitializeAccessibilityNodeInfo(paramView, (AccessibilityNodeInfo)localObject);
  }

  public final boolean a(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return ((View.AccessibilityDelegate)paramObject).dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }

  public final boolean a(Object paramObject, ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return ((View.AccessibilityDelegate)paramObject).onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }

  public final void b(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ((View.AccessibilityDelegate)paramObject).onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }

  public final void c(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ((View.AccessibilityDelegate)paramObject).onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }

  public final void d(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ((View.AccessibilityDelegate)paramObject).sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.b
 * JD-Core Version:    0.6.2
 */