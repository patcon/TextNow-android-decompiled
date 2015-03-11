package textnow.i;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.app.k;
import android.support.v4.view.av;
import android.support.v4.view.cd;
import android.support.v4.view.cp;
import android.support.v4.view.cq;
import android.support.v4.view.cr;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.OnMenuVisibilityListener;
import android.support.v7.internal.app.WindowDecorActionBar.TabImpl;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.ac;
import android.support.v7.internal.widget.f;
import android.support.v7.internal.widget.u;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import textnow.g.g;
import textnow.g.l;
import textnow.k.h;

public class b extends ActionBar
  implements f
{
  private static final boolean i;
  private int A = 0;
  private boolean B = true;
  private boolean C;
  private boolean D;
  private boolean E;
  private boolean F = true;
  private h G;
  private boolean H;
  c a;
  textnow.l.a b;
  textnow.l.b c;
  boolean d;
  final cp e = new cq()
  {
    public final void b(View paramAnonymousView)
    {
      if ((b.a(b.this)) && (b.b(b.this) != null))
      {
        av.b(b.b(b.this), 0.0F);
        av.b(b.c(b.this), 0.0F);
      }
      if ((b.d(b.this) != null) && (b.e(b.this) == 1))
        b.d(b.this).setVisibility(8);
      b.c(b.this).setVisibility(8);
      b.c(b.this).a(false);
      b.a(b.this, null);
      b.this.f();
      if (b.f(b.this) != null)
        av.t(b.f(b.this));
    }
  };
  final cp f = new cq()
  {
    public final void b(View paramAnonymousView)
    {
      b.a(b.this, null);
      b.c(b.this).requestLayout();
    }
  };
  final cr g = new cr()
  {
    public final void a()
    {
      ((View)b.c(b.this).getParent()).invalidate();
    }
  };
  private Context j;
  private Context k;
  private k l;
  private ActionBarOverlayLayout m;
  private ActionBarContainer n;
  private u o;
  private ActionBarContextView p;
  private ActionBarContainer q;
  private View r;
  private ac s;
  private ArrayList<WindowDecorActionBar.TabImpl> t = new ArrayList();
  private int u = -1;
  private boolean v;
  private boolean w;
  private ArrayList<ActionBar.OnMenuVisibilityListener> x = new ArrayList();
  private int y;
  private boolean z;

  static
  {
    boolean bool1 = true;
    boolean bool2;
    if (!b.class.desiredAssertionStatus())
    {
      bool2 = bool1;
      h = bool2;
      if (Build.VERSION.SDK_INT < 14)
        break label34;
    }
    while (true)
    {
      i = bool1;
      return;
      bool2 = false;
      break;
      label34: bool1 = false;
    }
  }

  public b(android.support.v7.app.b paramb, boolean paramBoolean)
  {
    this.l = paramb;
    View localView1 = paramb.getWindow().getDecorView();
    this.m = ((ActionBarOverlayLayout)localView1.findViewById(g.k));
    if (this.m != null)
      this.m.a(this);
    View localView2 = localView1.findViewById(g.a);
    if ((localView2 instanceof u));
    for (u localu = (u)localView2; ; localu = ((Toolbar)localView2).o())
    {
      this.o = localu;
      this.p = ((ActionBarContextView)localView1.findViewById(g.f));
      this.n = ((ActionBarContainer)localView1.findViewById(g.c));
      this.q = ((ActionBarContainer)localView1.findViewById(g.A));
      if ((this.o != null) && (this.p != null) && (this.n != null))
        break label310;
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
      if (!(localView2 instanceof Toolbar))
        break;
    }
    throw new IllegalStateException("Can't make a decor toolbar out of " + localView2.getClass().getSimpleName());
    label310: this.j = this.o.b();
    this.y = 0;
    if ((0x4 & this.o.l()) != 0);
    TypedArray localTypedArray;
    for (int i1 = 1; ; i1 = 0)
    {
      if (i1 != 0)
        this.v = true;
      textnow.k.a locala = textnow.k.a.a(this.j);
      if ((!locala.f()) && (i1 != 0));
      i(locala.d());
      localTypedArray = this.j.obtainStyledAttributes(null, l.a, textnow.g.b.c, 0);
      if (!localTypedArray.getBoolean(l.m, false))
        break label464;
      if (this.m.a())
        break;
      throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }
    this.d = true;
    this.m.b(true);
    label464: int i2 = localTypedArray.getDimensionPixelSize(l.k, 0);
    if (i2 != 0)
    {
      float f1 = i2;
      av.f(this.n, f1);
      if (this.q != null)
        av.f(this.q, f1);
    }
    localTypedArray.recycle();
    if (!paramBoolean)
      this.r = localView1.findViewById(16908290);
  }

  private void a(int paramInt1, int paramInt2)
  {
    int i1 = this.o.l();
    if ((paramInt2 & 0x4) != 0)
      this.v = true;
    this.o.a(paramInt1 & paramInt2 | i1 & (paramInt2 ^ 0xFFFFFFFF));
  }

  private static boolean b(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean3);
    while ((!paramBoolean1) && (!paramBoolean2))
      return true;
    return false;
  }

  private void i(boolean paramBoolean)
  {
    boolean bool1 = true;
    this.z = paramBoolean;
    boolean bool2;
    label50: label83: boolean bool3;
    label103: ActionBarOverlayLayout localActionBarOverlayLayout;
    if (!this.z)
    {
      this.o.a(null);
      this.n.a(this.s);
      if (this.o.m() != 2)
        break label160;
      bool2 = bool1;
      if (this.s != null)
      {
        if (!bool2)
          break label165;
        this.s.setVisibility(0);
        if (this.m != null)
          av.t(this.m);
      }
      u localu = this.o;
      if ((this.z) || (!bool2))
        break label177;
      bool3 = bool1;
      localu.a(bool3);
      localActionBarOverlayLayout = this.m;
      if ((this.z) || (!bool2))
        break label183;
    }
    while (true)
    {
      localActionBarOverlayLayout.a(bool1);
      return;
      this.n.a(null);
      this.o.a(this.s);
      break;
      label160: bool2 = false;
      break label50;
      label165: this.s.setVisibility(8);
      break label83;
      label177: bool3 = false;
      break label103;
      label183: bool1 = false;
    }
  }

  private void j(boolean paramBoolean)
  {
    if (b(this.C, this.D, this.E))
      if (!this.F)
      {
        this.F = true;
        if (this.G != null)
          this.G.b();
        this.n.setVisibility(0);
        if ((this.A != 0) || (!i) || ((!this.H) && (!paramBoolean)))
          break label336;
        av.b(this.n, 0.0F);
        f2 = -this.n.getHeight();
        if (paramBoolean)
        {
          arrayOfInt2 = new int[] { 0, 0 };
          this.n.getLocationInWindow(arrayOfInt2);
          f2 -= arrayOfInt2[1];
        }
        av.b(this.n, f2);
        localh2 = new h();
        localcd2 = av.q(this.n).c(0.0F);
        localcd2.a(this.g);
        localh2.a(localcd2);
        if ((this.B) && (this.r != null))
        {
          av.b(this.r, f2);
          localh2.a(av.q(this.r).c(0.0F));
        }
        if ((this.q != null) && (this.y == 1))
        {
          av.b(this.q, this.q.getHeight());
          this.q.setVisibility(0);
          localh2.a(av.q(this.q).c(0.0F));
        }
        localh2.a(AnimationUtils.loadInterpolator(this.j, 17432582));
        localh2.a(250L);
        localh2.a(this.f);
        this.G = localh2;
        localh2.a();
        if (this.m != null)
          av.t(this.m);
      }
    label336: 
    while (!this.F)
      while (true)
      {
        float f2;
        int[] arrayOfInt2;
        h localh2;
        cd localcd2;
        return;
        av.c(this.n, 1.0F);
        av.b(this.n, 0.0F);
        if ((this.B) && (this.r != null))
          av.b(this.r, 0.0F);
        if ((this.q != null) && (this.y == 1))
        {
          av.c(this.q, 1.0F);
          av.b(this.q, 0.0F);
          this.q.setVisibility(0);
        }
        this.f.b(null);
      }
    this.F = false;
    if (this.G != null)
      this.G.b();
    if ((this.A == 0) && (i) && ((this.H) || (paramBoolean)))
    {
      av.c(this.n, 1.0F);
      this.n.a(true);
      h localh1 = new h();
      float f1 = -this.n.getHeight();
      if (paramBoolean)
      {
        int[] arrayOfInt1 = { 0, 0 };
        this.n.getLocationInWindow(arrayOfInt1);
        f1 -= arrayOfInt1[1];
      }
      cd localcd1 = av.q(this.n).c(f1);
      localcd1.a(this.g);
      localh1.a(localcd1);
      if ((this.B) && (this.r != null))
        localh1.a(av.q(this.r).c(f1));
      if ((this.q != null) && (this.q.getVisibility() == 0))
      {
        av.c(this.q, 1.0F);
        localh1.a(av.q(this.q).c(this.q.getHeight()));
      }
      localh1.a(AnimationUtils.loadInterpolator(this.j, 17432581));
      localh1.a(250L);
      localh1.a(this.e);
      this.G = localh1;
      localh1.a();
      return;
    }
    this.e.b(null);
  }

  public final int a()
  {
    return this.o.l();
  }

  public final textnow.l.a a(textnow.l.b paramb)
  {
    if (this.a != null)
      this.a.b();
    this.m.b(false);
    this.p.e();
    c localc = new c(this, paramb);
    if (localc.d())
    {
      localc.c();
      this.p.a(localc);
      h(true);
      if ((this.q != null) && (this.y == 1) && (this.q.getVisibility() != 0))
      {
        this.q.setVisibility(0);
        if (this.m != null)
          av.t(this.m);
      }
      this.p.sendAccessibilityEvent(32);
      this.a = localc;
      return localc;
    }
    return null;
  }

  public final void a(int paramInt)
  {
    a(this.j.getString(paramInt));
  }

  public final void a(Drawable paramDrawable)
  {
    this.n.a(paramDrawable);
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.o.b(paramCharSequence);
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i1 = 2; ; i1 = 0)
    {
      a(i1, 2);
      return;
    }
  }

  public final void b()
  {
    if (!this.C)
    {
      this.C = true;
      j(false);
    }
  }

  public final void b(int paramInt)
  {
    this.o.c(paramInt);
  }

  public final void b(Drawable paramDrawable)
  {
    this.o.a(paramDrawable);
  }

  public final void b(CharSequence paramCharSequence)
  {
    this.o.c(paramCharSequence);
  }

  public final void b(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i1 = 4; ; i1 = 0)
    {
      a(i1, 4);
      return;
    }
  }

  public final Context c()
  {
    int i1;
    if (this.k == null)
    {
      TypedValue localTypedValue = new TypedValue();
      this.j.getTheme().resolveAttribute(textnow.g.b.g, localTypedValue, true);
      i1 = localTypedValue.resourceId;
      if (i1 == 0)
        break label61;
    }
    label61: for (this.k = new ContextThemeWrapper(this.j, i1); ; this.k = this.j)
      return this.k;
  }

  public final void c(int paramInt)
  {
    this.A = paramInt;
  }

  public final void c(CharSequence paramCharSequence)
  {
    this.o.a(paramCharSequence);
  }

  public final void c(boolean paramBoolean)
  {
  }

  public final void d()
  {
    i(textnow.k.a.a(this.j).d());
  }

  public final void d(boolean paramBoolean)
  {
    if (!this.v)
      b(paramBoolean);
  }

  public final void e(boolean paramBoolean)
  {
    this.H = paramBoolean;
    if ((!paramBoolean) && (this.G != null))
      this.G.b();
  }

  public final boolean e()
  {
    if ((this.o != null) && (this.o.c()))
    {
      this.o.d();
      return true;
    }
    return false;
  }

  final void f()
  {
    if (this.c != null)
    {
      this.c.a(this.b);
      this.b = null;
      this.c = null;
    }
  }

  public final void f(boolean paramBoolean)
  {
    if (paramBoolean == this.w);
    while (true)
    {
      return;
      this.w = paramBoolean;
      int i1 = this.x.size();
      for (int i2 = 0; i2 < i1; i2++)
        this.x.get(i2);
    }
  }

  public final void g()
  {
    if (this.D)
    {
      this.D = false;
      j(true);
    }
  }

  public final void g(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }

  public final void h()
  {
    if (!this.D)
    {
      this.D = true;
      j(true);
    }
  }

  public final void h(boolean paramBoolean)
  {
    int i1;
    label48: ActionBarContextView localActionBarContextView;
    int i2;
    if (paramBoolean)
    {
      if (!this.E)
      {
        this.E = true;
        if (this.m != null)
          ActionBarOverlayLayout.b();
        j(false);
      }
      u localu = this.o;
      if (!paramBoolean)
        break label111;
      i1 = 8;
      localu.b(i1);
      localActionBarContextView = this.p;
      i2 = 0;
      if (!paramBoolean)
        break label116;
    }
    while (true)
    {
      localActionBarContextView.b(i2);
      return;
      if (!this.E)
        break;
      this.E = false;
      if (this.m != null)
        ActionBarOverlayLayout.b();
      j(false);
      break;
      label111: i1 = 0;
      break label48;
      label116: i2 = 8;
    }
  }

  public final void i()
  {
    if (this.G != null)
    {
      this.G.b();
      this.G = null;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.i.b
 * JD-Core Version:    0.6.2
 */