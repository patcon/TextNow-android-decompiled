package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ListPopupWindow;
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
import textnow.g.b;
import textnow.g.e;

public class t
  implements v, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  static final int a = textnow.g.i.l;
  boolean b;
  private final Context c;
  private final LayoutInflater d;
  private final i e;
  private final u f;
  private final boolean g;
  private final int h;
  private final int i;
  private View j;
  private ListPopupWindow k;
  private ViewTreeObserver l;
  private w m;
  private ViewGroup n;
  private boolean o;
  private int p;
  private int q = 0;

  private t(Context paramContext, i parami, View paramView)
  {
    this(paramContext, parami, paramView, false, b.u);
  }

  public t(Context paramContext, i parami, View paramView, boolean paramBoolean, int paramInt)
  {
    this.c = paramContext;
    this.d = LayoutInflater.from(paramContext);
    this.e = parami;
    this.f = new u(this, this.e);
    this.g = paramBoolean;
    this.i = paramInt;
    Resources localResources = paramContext.getResources();
    this.h = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(e.c));
    this.j = paramView;
    parami.a(this, paramContext);
  }

  public final void a()
  {
    if (!d())
      throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
  }

  public final void a(int paramInt)
  {
    this.q = 8388613;
  }

  public final void a(Context paramContext, i parami)
  {
  }

  public final void a(i parami, boolean paramBoolean)
  {
    if (parami != this.e);
    do
    {
      return;
      e();
    }
    while (this.m == null);
    this.m.a(parami, paramBoolean);
  }

  public final void a(w paramw)
  {
    this.m = paramw;
  }

  public final void a(View paramView)
  {
    this.j = paramView;
  }

  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public final boolean a(ab paramab)
  {
    t localt;
    int i2;
    if (paramab.hasVisibleItems())
    {
      localt = new t(this.c, paramab, this.j);
      localt.m = this.m;
      int i1 = paramab.size();
      i2 = 0;
      if (i2 >= i1)
        break label118;
      MenuItem localMenuItem = paramab.getItem(i2);
      if ((!localMenuItem.isVisible()) || (localMenuItem.getIcon() == null));
    }
    label118: for (boolean bool = true; ; bool = false)
    {
      localt.b = bool;
      if (localt.d())
      {
        if (this.m != null)
          this.m.a(paramab);
        return true;
        i2++;
        break;
      }
      return false;
    }
  }

  public final void b(boolean paramBoolean)
  {
    this.o = false;
    if (this.f != null)
      this.f.notifyDataSetChanged();
  }

  public final boolean b()
  {
    return false;
  }

  public final boolean b(m paramm)
  {
    return false;
  }

  public final ListPopupWindow c()
  {
    return this.k;
  }

  public final boolean c(m paramm)
  {
    return false;
  }

  public final boolean d()
  {
    int i1 = 0;
    this.k = new ListPopupWindow(this.c, null, this.i);
    this.k.a(this);
    this.k.a(this);
    this.k.a(this.f);
    this.k.a(true);
    View localView1 = this.j;
    int i6;
    View localView2;
    View localView3;
    label191: int i9;
    if (localView1 != null)
    {
      if (this.l == null);
      for (int i2 = 1; ; i2 = 0)
      {
        this.l = localView1.getViewTreeObserver();
        if (i2 != 0)
          this.l.addOnGlobalLayoutListener(this);
        this.k.a(localView1);
        this.k.b(this.q);
        if (!this.o)
        {
          u localu = this.f;
          int i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
          int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
          int i5 = localu.getCount();
          i6 = 0;
          int i7 = 0;
          localView2 = null;
          if (i6 < i5)
          {
            int i8 = localu.getItemViewType(i6);
            if (i8 == i7)
              break label331;
            i7 = i8;
            localView3 = null;
            if (this.n == null)
              this.n = new FrameLayout(this.c);
            localView2 = localu.getView(i6, localView3, this.n);
            localView2.measure(i3, i4);
            i9 = localView2.getMeasuredWidth();
            if (i9 < this.h)
              break;
            i1 = this.h;
          }
          this.p = i1;
          this.o = true;
        }
        this.k.c(this.p);
        this.k.d(2);
        this.k.c();
        this.k.g().setOnKeyListener(this);
        return true;
      }
    }
    return false;
    if (i9 > i1);
    while (true)
    {
      i6++;
      i1 = i9;
      break;
      label331: localView3 = localView2;
      break label191;
      i9 = i1;
    }
  }

  public final void e()
  {
    if (f())
      this.k.a();
  }

  public final boolean f()
  {
    return (this.k != null) && (this.k.b());
  }

  public void onDismiss()
  {
    this.k = null;
    this.e.close();
    if (this.l != null)
    {
      if (!this.l.isAlive())
        this.l = this.j.getViewTreeObserver();
      this.l.removeGlobalOnLayoutListener(this);
      this.l = null;
    }
  }

  public void onGlobalLayout()
  {
    if (f())
    {
      View localView = this.j;
      if ((localView != null) && (localView.isShown()))
        break label28;
      e();
    }
    label28: 
    while (!f())
      return;
    this.k.c();
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    u localu = this.f;
    u.a(localu).a(localu.a(paramInt), 0);
  }

  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      e();
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.t
 * JD-Core Version:    0.6.2
 */