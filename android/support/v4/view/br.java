package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import textnow.f.r;

final class br extends a
{
  br(ViewPager paramViewPager)
  {
  }

  private boolean b()
  {
    return (ViewPager.a(this.b) != null) && (ViewPager.a(this.b).a() > 1);
  }

  public final void a(View paramView, textnow.f.a parama)
  {
    super.a(paramView, parama);
    parama.b(ViewPager.class.getName());
    parama.i(b());
    if (this.b.canScrollHorizontally(1))
      parama.a(4096);
    if (this.b.canScrollHorizontally(-1))
      parama.a(8192);
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
    r localr = r.a();
    localr.a(b());
    if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.a(this.b) != null))
    {
      localr.a(ViewPager.a(this.b).a());
      localr.b(ViewPager.b(this.b));
      localr.c(ViewPager.b(this.b));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.br
 * JD-Core Version:    0.6.2
 */