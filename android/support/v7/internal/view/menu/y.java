package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.widget.ListPopupWindow;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import textnow.g.c;
import textnow.g.e;
import textnow.g.h;

public class y
  implements aa, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  static final int b = h.p;
  private Context a;
  boolean c;
  private LayoutInflater d;
  private ListPopupWindow e;
  private n f;
  private int g;
  private View h;
  private boolean i;
  private ViewTreeObserver j;
  private z k;
  private ab l;
  private ViewGroup m;

  public y(Context paramContext, n paramn, View paramView, boolean paramBoolean)
  {
    this.a = paramContext;
    this.d = LayoutInflater.from(paramContext);
    this.f = paramn;
    this.i = paramBoolean;
    Resources localResources = paramContext.getResources();
    this.g = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(e.c));
    this.h = paramView;
    paramn.a(this);
  }

  public final void a(Context paramContext, n paramn)
  {
  }

  public final void a(ab paramab)
  {
    this.l = paramab;
  }

  public final void a(n paramn, boolean paramBoolean)
  {
    if (paramn != this.f);
    do
    {
      return;
      b();
    }
    while (this.l == null);
    this.l.a(paramn, paramBoolean);
  }

  public final boolean a()
  {
    int n = 0;
    this.e = new ListPopupWindow(this.a, null, c.k);
    this.e.a(this);
    this.e.a(this);
    this.k = new z(this, this.f);
    this.e.a(this.k);
    this.e.a(true);
    View localView1 = this.h;
    int i1;
    ListPopupWindow localListPopupWindow;
    z localz;
    int i2;
    int i3;
    int i5;
    View localView2;
    int i6;
    label162: int i7;
    if (localView1 != null)
      if (this.j == null)
      {
        i1 = 1;
        this.j = localView1.getViewTreeObserver();
        if (i1 != 0)
          this.j.addOnGlobalLayoutListener(this);
        this.e.a(localView1);
        localListPopupWindow = this.e;
        localz = this.k;
        i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i4 = localz.getCount();
        i5 = 0;
        localView2 = null;
        i6 = 0;
        if (i5 >= i4)
          break label265;
        i7 = localz.getItemViewType(i5);
        if (i7 == n)
          break label307;
      }
    for (View localView3 = null; ; localView3 = localView2)
    {
      if (this.m == null)
        this.m = new FrameLayout(this.a);
      localView2 = localz.getView(i5, localView3, this.m);
      localView2.measure(i2, i3);
      i6 = Math.max(i6, localView2.getMeasuredWidth());
      i5++;
      n = i7;
      break label162;
      i1 = 0;
      break;
      return false;
      label265: localListPopupWindow.d(Math.min(i6, this.g));
      this.e.e(2);
      this.e.c();
      this.e.h().setOnKeyListener(this);
      return true;
      label307: i7 = n;
    }
  }

  public final boolean a(ag paramag)
  {
    y localy;
    int i1;
    if (paramag.hasVisibleItems())
    {
      localy = new y(this.a, paramag, this.h, false);
      localy.l = this.l;
      int n = paramag.size();
      i1 = 0;
      if (i1 >= n)
        break label119;
      MenuItem localMenuItem = paramag.getItem(i1);
      if ((!localMenuItem.isVisible()) || (localMenuItem.getIcon() == null));
    }
    label119: for (boolean bool = true; ; bool = false)
    {
      localy.c = bool;
      if (localy.a())
      {
        if (this.l != null)
          this.l.b(paramag);
        return true;
        i1++;
        break;
      }
      return false;
    }
  }

  public final void b()
  {
    if (c())
      this.e.d();
  }

  public final boolean b(r paramr)
  {
    return false;
  }

  public final boolean c()
  {
    return (this.e != null) && (this.e.f());
  }

  public final boolean c(r paramr)
  {
    return false;
  }

  public final void d(boolean paramBoolean)
  {
    if (this.k != null)
      this.k.notifyDataSetChanged();
  }

  public final boolean h()
  {
    return false;
  }

  public void onDismiss()
  {
    this.e = null;
    this.f.close();
    if (this.j != null)
    {
      if (!this.j.isAlive())
        this.j = this.h.getViewTreeObserver();
      this.j.removeGlobalOnLayoutListener(this);
      this.j = null;
    }
  }

  public void onGlobalLayout()
  {
    if (c())
    {
      View localView = this.h;
      if ((localView != null) && (localView.isShown()))
        break label28;
      b();
    }
    label28: 
    while (!c())
      return;
    this.e.c();
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    z localz = this.k;
    z.a(localz).a(localz.a(paramInt), 0);
  }

  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      b();
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.y
 * JD-Core Version:    0.6.2
 */