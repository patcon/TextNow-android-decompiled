package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.av;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import textnow.f.e;

final class k extends a
{
  private final Rect c = new Rect();

  k(DrawerLayout paramDrawerLayout)
  {
  }

  public final void a(View paramView, e parame)
  {
    e locale = e.a(parame);
    super.a(paramView, locale);
    parame.b(DrawerLayout.class.getName());
    parame.a(paramView);
    ViewParent localViewParent = av.i(paramView);
    if ((localViewParent instanceof View))
      parame.c((View)localViewParent);
    Rect localRect = this.c;
    locale.a(localRect);
    parame.b(localRect);
    locale.c(localRect);
    parame.d(localRect);
    parame.c(locale.f());
    parame.a(locale.l());
    parame.b(locale.m());
    parame.c(locale.n());
    parame.h(locale.k());
    parame.f(locale.i());
    parame.a(locale.d());
    parame.b(locale.e());
    parame.d(locale.g());
    parame.e(locale.h());
    parame.g(locale.j());
    parame.a(locale.b());
    locale.o();
    ViewGroup localViewGroup = (ViewGroup)paramView;
    int i = localViewGroup.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = localViewGroup.getChildAt(j);
      if (DrawerLayout.g(localView))
        parame.b(localView);
    }
  }

  public final boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (DrawerLayout.g(paramView))
      return super.a(paramViewGroup, paramView, paramAccessibilityEvent);
    return false;
  }

  public final boolean b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramAccessibilityEvent.getEventType() == 32)
    {
      List localList = paramAccessibilityEvent.getText();
      View localView = DrawerLayout.a(this.b);
      if (localView != null)
      {
        int i = this.b.c(localView);
        CharSequence localCharSequence = this.b.a(i);
        if (localCharSequence != null)
          localList.add(localCharSequence);
      }
      return true;
    }
    return super.b(paramView, paramAccessibilityEvent);
  }

  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(DrawerLayout.class.getName());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.k
 * JD-Core Version:    0.6.2
 */