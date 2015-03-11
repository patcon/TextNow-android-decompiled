package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.aq;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

final class h extends android.support.v4.view.a
{
  private final Rect c = new Rect();

  h(DrawerLayout paramDrawerLayout)
  {
  }

  public final void a(View paramView, textnow.f.a parama)
  {
    textnow.f.a locala = textnow.f.a.a(parama);
    super.a(paramView, locala);
    parama.b(DrawerLayout.class.getName());
    parama.a(paramView);
    ViewParent localViewParent = aq.f(paramView);
    if ((localViewParent instanceof View))
      parama.c((View)localViewParent);
    Rect localRect = this.c;
    locala.a(localRect);
    parama.b(localRect);
    locala.c(localRect);
    parama.d(localRect);
    parama.c(locala.f());
    parama.a(locala.l());
    parama.b(locala.m());
    parama.c(locala.n());
    parama.h(locala.k());
    parama.f(locala.i());
    parama.a(locala.d());
    parama.b(locala.e());
    parama.d(locala.g());
    parama.e(locala.h());
    parama.g(locala.j());
    parama.a(locala.b());
    locala.o();
    ViewGroup localViewGroup = (ViewGroup)paramView;
    int i = localViewGroup.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = localViewGroup.getChildAt(j);
      if (DrawerLayout.g(localView))
        parama.b(localView);
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.h
 * JD-Core Version:    0.6.2
 */