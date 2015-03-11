package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.av;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import textnow.f.e;

final class an extends a
{
  private final Rect c = new Rect();

  an(SlidingPaneLayout paramSlidingPaneLayout)
  {
  }

  private boolean b(View paramView)
  {
    return this.b.d(paramView);
  }

  public final void a(View paramView, e parame)
  {
    e locale = e.a(parame);
    super.a(paramView, locale);
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
    parame.b(locale.c());
    locale.o();
    parame.b(SlidingPaneLayout.class.getName());
    parame.a(paramView);
    ViewParent localViewParent = av.i(paramView);
    if ((localViewParent instanceof View))
      parame.c((View)localViewParent);
    int i = this.b.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = this.b.getChildAt(j);
      if ((!b(localView)) && (localView.getVisibility() == 0))
      {
        av.c(localView, 1);
        parame.b(localView);
      }
    }
  }

  public final boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (!b(paramView))
      return super.a(paramViewGroup, paramView, paramAccessibilityEvent);
    return false;
  }

  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.an
 * JD-Core Version:    0.6.2
 */