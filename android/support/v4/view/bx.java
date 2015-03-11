package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import textnow.f.e;
import textnow.f.x;

final class bx extends a
{
  bx(ViewPager paramViewPager)
  {
  }

  private boolean b()
  {
    return (ViewPager.a(this.b) != null) && (ViewPager.a(this.b).b() > 1);
  }

  public final void a(View paramView, e parame)
  {
    super.a(paramView, parame);
    parame.b(ViewPager.class.getName());
    parame.i(b());
    if (this.b.canScrollHorizontally(1))
      parame.a(4096);
    if (this.b.canScrollHorizontally(-1))
      parame.a(8192);
  }

  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle))
      return true;
    switch (paramInt)
    {
    default:
      return false;
    case 4096:
      if (this.b.canScrollHorizontally(1))
      {
        this.b.a(1 + ViewPager.b(this.b));
        return true;
      }
      return false;
    case 8192:
    }
    if (this.b.canScrollHorizontally(-1))
    {
      this.b.a(-1 + ViewPager.b(this.b));
      return true;
    }
    return false;
  }

  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(ViewPager.class.getName());
    x localx = x.a();
    localx.a(b());
    if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.a(this.b) != null))
    {
      localx.a(ViewPager.a(this.b).b());
      localx.b(ViewPager.b(this.b));
      localx.c(ViewPager.b(this.b));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.bx
 * JD-Core Version:    0.6.2
 */