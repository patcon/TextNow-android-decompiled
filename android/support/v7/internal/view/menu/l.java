package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import textnow.g.h;

public final class l
  implements aa, AdapterView.OnItemClickListener
{
  Context a;
  LayoutInflater b;
  n c;
  ExpandedMenuView d;
  int e;
  int f;
  m g;
  private int h;
  private ab i;

  public l(int paramInt1, int paramInt2)
  {
    this.f = paramInt1;
    this.e = paramInt2;
  }

  public final ac a(ViewGroup paramViewGroup)
  {
    if (this.g == null)
      this.g = new m(this);
    if (!this.g.isEmpty())
    {
      if (this.d == null)
      {
        this.d = ((ExpandedMenuView)this.b.inflate(h.k, paramViewGroup, false));
        this.d.setAdapter(this.g);
        this.d.setOnItemClickListener(this);
      }
      return this.d;
    }
    return null;
  }

  public final ListAdapter a()
  {
    if (this.g == null)
      this.g = new m(this);
    return this.g;
  }

  public final void a(Context paramContext, n paramn)
  {
    if (this.e != 0)
    {
      this.a = new ContextThemeWrapper(paramContext, this.e);
      this.b = LayoutInflater.from(this.a);
    }
    while (true)
    {
      this.c = paramn;
      if (this.g != null)
        this.g.notifyDataSetChanged();
      return;
      if (this.a != null)
      {
        this.a = paramContext;
        if (this.b == null)
          this.b = LayoutInflater.from(this.a);
      }
    }
  }

  public final void a(ab paramab)
  {
    this.i = paramab;
  }

  public final void a(n paramn, boolean paramBoolean)
  {
    if (this.i != null)
      this.i.a(paramn, paramBoolean);
  }

  public final boolean a(ag paramag)
  {
    if (!paramag.hasVisibleItems())
      return false;
    new q(paramag).a(null);
    if (this.i != null)
      this.i.b(paramag);
    return true;
  }

  public final boolean b(r paramr)
  {
    return false;
  }

  public final boolean c(r paramr)
  {
    return false;
  }

  public final void d(boolean paramBoolean)
  {
    if (this.g != null)
      this.g.notifyDataSetChanged();
  }

  public final boolean h()
  {
    return false;
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.c.a(this.g.a(paramInt), 0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.l
 * JD-Core Version:    0.6.2
 */