package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

public final class g
  implements v, AdapterView.OnItemClickListener
{
  Context a;
  LayoutInflater b;
  i c;
  ExpandedMenuView d;
  int e;
  int f;
  h g;
  private int h;
  private w i;

  public g(int paramInt1, int paramInt2)
  {
    this.f = paramInt1;
    this.e = paramInt2;
  }

  public g(Context paramContext, int paramInt)
  {
    this(paramInt, 0);
    this.a = paramContext;
    this.b = LayoutInflater.from(this.a);
  }

  public final x a(ViewGroup paramViewGroup)
  {
    if (this.d == null)
    {
      this.d = ((ExpandedMenuView)this.b.inflate(textnow.g.i.g, paramViewGroup, false));
      if (this.g == null)
        this.g = new h(this);
      this.d.setAdapter(this.g);
      this.d.setOnItemClickListener(this);
    }
    return this.d;
  }

  public final ListAdapter a()
  {
    if (this.g == null)
      this.g = new h(this);
    return this.g;
  }

  public final void a(Context paramContext, i parami)
  {
    if (this.e != 0)
    {
      this.a = new ContextThemeWrapper(paramContext, this.e);
      this.b = LayoutInflater.from(this.a);
    }
    while (true)
    {
      this.c = parami;
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

  public final void a(i parami, boolean paramBoolean)
  {
    if (this.i != null)
      this.i.a(parami, paramBoolean);
  }

  public final void a(w paramw)
  {
    this.i = paramw;
  }

  public final boolean a(ab paramab)
  {
    if (!paramab.hasVisibleItems())
      return false;
    new l(paramab).a(null);
    if (this.i != null)
      this.i.a(paramab);
    return true;
  }

  public final void b(boolean paramBoolean)
  {
    if (this.g != null)
      this.g.notifyDataSetChanged();
  }

  public final boolean b()
  {
    return false;
  }

  public final boolean b(m paramm)
  {
    return false;
  }

  public final boolean c(m paramm)
  {
    return false;
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.c.a(this.g.a(paramInt), this, 0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.g
 * JD-Core Version:    0.6.2
 */