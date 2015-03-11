package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import textnow.f.e;

public final class bf extends a
{
  final RecyclerView b;
  final a c = new a()
  {
    public final void a(View paramAnonymousView, e paramAnonymouse)
    {
      super.a(paramAnonymousView, paramAnonymouse);
      if (bf.this.b.a() != null)
        bf.this.b.a().a(paramAnonymousView, paramAnonymouse);
    }

    public final boolean a(View paramAnonymousView, int paramAnonymousInt, Bundle paramAnonymousBundle)
    {
      if (super.a(paramAnonymousView, paramAnonymousInt, paramAnonymousBundle))
        return true;
      if (bf.this.b.a() != null)
        return bf.this.b.a().a(paramAnonymousView, paramAnonymousInt, paramAnonymousBundle);
      return false;
    }
  };

  public bf(RecyclerView paramRecyclerView)
  {
    this.b = paramRecyclerView;
  }

  public final void a(View paramView, e parame)
  {
    super.a(paramView, parame);
    parame.b(RecyclerView.class.getName());
    if (this.b.a() != null)
      this.b.a().a(parame);
  }

  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle))
      return true;
    if (this.b.a() != null)
      return this.b.a().a(paramInt, paramBundle);
    return false;
  }

  final a b()
  {
    return this.c;
  }

  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(RecyclerView.class.getName());
    if ((paramView instanceof RecyclerView))
    {
      RecyclerView localRecyclerView = (RecyclerView)paramView;
      if (localRecyclerView.a() != null)
        localRecyclerView.a().a(paramAccessibilityEvent);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bf
 * JD-Core Version:    0.6.2
 */