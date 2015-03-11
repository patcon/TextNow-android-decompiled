package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.af;
import android.support.v4.view.av;
import android.support.v4.view.v;
import android.support.v4.view.z;
import android.support.v7.app.ActionBar.LayoutParams;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.w;
import android.support.v7.internal.widget.ab;
import android.support.v7.internal.widget.al;
import android.support.v7.internal.widget.ao;
import android.support.v7.internal.widget.ap;
import android.support.v7.internal.widget.ar;
import android.support.v7.internal.widget.u;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import textnow.g.b;
import textnow.g.l;
import textnow.k.e;

public class Toolbar extends ViewGroup
{
  private final int[] A = new int[2];
  private bq B;
  private final j C = new j()
  {
    public final boolean a(MenuItem paramAnonymousMenuItem)
    {
      if (Toolbar.a(Toolbar.this) != null)
        return Toolbar.a(Toolbar.this).a(paramAnonymousMenuItem);
      return false;
    }
  };
  private ap D;
  private ActionMenuPresenter E;
  private bp F;
  private w G;
  private android.support.v7.internal.view.menu.j H;
  private boolean I;
  private int J;
  private final Runnable K = new Runnable()
  {
    public final void run()
    {
      Toolbar.this.d();
    }
  };
  private final al L;
  View a;
  private ActionMenuView b;
  private TextView c;
  private TextView d;
  private ImageButton e;
  private ImageView f;
  private Drawable g;
  private ImageButton h;
  private Context i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private final ab s = new ab();
  private int t = 8388627;
  private CharSequence u;
  private CharSequence v;
  private int w;
  private int x;
  private boolean y;
  private final ArrayList<View> z = new ArrayList();

  public Toolbar(Context paramContext)
  {
    this(paramContext, null);
  }

  public Toolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.A);
  }

  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ao localao = ao.a(getContext(), paramAttributeSet, l.bI, paramInt, 0);
    this.k = localao.f(l.ce, 0);
    this.l = localao.f(l.bW, 0);
    this.t = localao.b(l.bJ, this.t);
    this.m = localao.b(l.bL, 48);
    int i2 = localao.c(l.cd, 0);
    this.r = i2;
    this.q = i2;
    this.p = i2;
    this.o = i2;
    int i3 = localao.c(l.cb, -1);
    if (i3 >= 0)
      this.o = i3;
    int i4 = localao.c(l.ca, -1);
    if (i4 >= 0)
      this.p = i4;
    int i5 = localao.c(l.cc, -1);
    if (i5 >= 0)
      this.q = i5;
    int i6 = localao.c(l.bZ, -1);
    if (i6 >= 0)
      this.r = i6;
    this.n = localao.d(l.bR, -1);
    int i7 = localao.c(l.bQ, -2147483648);
    int i8 = localao.c(l.bN, -2147483648);
    int i9 = localao.d(l.bO, 0);
    int i10 = localao.d(l.bP, 0);
    this.s.b(i9, i10);
    if ((i7 != -2147483648) || (i8 != -2147483648))
      this.s.a(i7, i8);
    this.g = localao.a(l.bM);
    CharSequence localCharSequence1 = localao.b(l.bY);
    if (!TextUtils.isEmpty(localCharSequence1))
      a(localCharSequence1);
    CharSequence localCharSequence2 = localao.b(l.bV);
    if (!TextUtils.isEmpty(localCharSequence2))
      b(localCharSequence2);
    this.i = getContext();
    a(localao.f(l.bU, 0));
    Drawable localDrawable = localao.a(l.bT);
    if (localDrawable != null)
      b(localDrawable);
    CharSequence localCharSequence3 = localao.b(l.bS);
    if (!TextUtils.isEmpty(localCharSequence3))
      c(localCharSequence3);
    this.J = localao.d(l.bK, 0);
    localao.b();
    this.L = localao.c();
  }

  private int a(View paramView, int paramInt)
  {
    Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)paramView.getLayoutParams();
    int i1 = paramView.getMeasuredHeight();
    int i2;
    int i4;
    int i5;
    int i6;
    int i7;
    int i9;
    if (paramInt > 0)
    {
      i2 = (i1 - paramInt) / 2;
      int i3 = 0x70 & localLayoutParams.a;
      switch (i3)
      {
      default:
        i3 = 0x70 & this.t;
      case 16:
      case 48:
      case 80:
      }
      switch (i3)
      {
      default:
        i4 = getPaddingTop();
        i5 = getPaddingBottom();
        i6 = getHeight();
        i7 = (i6 - i4 - i5 - i1) / 2;
        if (i7 < localLayoutParams.topMargin)
          i9 = localLayoutParams.topMargin;
        break;
      case 48:
      case 80:
      }
    }
    while (true)
    {
      return i9 + i4;
      i2 = 0;
      break;
      return getPaddingTop() - i2;
      return getHeight() - getPaddingBottom() - i1 - localLayoutParams.bottomMargin - i2;
      int i8 = i6 - i5 - i1 - i7 - i4;
      if (i8 < localLayoutParams.bottomMargin)
        i9 = Math.max(0, i7 - (localLayoutParams.bottomMargin - i8));
      else
        i9 = i7;
    }
  }

  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = localMarginLayoutParams.leftMargin - paramArrayOfInt[0];
    int i2 = localMarginLayoutParams.rightMargin - paramArrayOfInt[1];
    int i3 = Math.max(0, i1) + Math.max(0, i2);
    paramArrayOfInt[0] = Math.max(0, -i1);
    paramArrayOfInt[1] = Math.max(0, -i2);
    paramView.measure(getChildMeasureSpec(paramInt1, paramInt2 + (i3 + (getPaddingLeft() + getPaddingRight())), localMarginLayoutParams.width), getChildMeasureSpec(paramInt3, paramInt4 + (getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin), localMarginLayoutParams.height));
    return i3 + paramView.getMeasuredWidth();
  }

  private int a(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)paramView.getLayoutParams();
    int i1 = localLayoutParams.leftMargin - paramArrayOfInt[0];
    int i2 = paramInt1 + Math.max(0, i1);
    paramArrayOfInt[0] = Math.max(0, -i1);
    int i3 = a(paramView, paramInt2);
    int i4 = paramView.getMeasuredWidth();
    paramView.layout(i2, i3, i2 + i4, i3 + paramView.getMeasuredHeight());
    return i2 + (i4 + localLayoutParams.rightMargin);
  }

  private static Toolbar.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof Toolbar.LayoutParams))
      return new Toolbar.LayoutParams((Toolbar.LayoutParams)paramLayoutParams);
    if ((paramLayoutParams instanceof ActionBar.LayoutParams))
      return new Toolbar.LayoutParams((ActionBar.LayoutParams)paramLayoutParams);
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new Toolbar.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new Toolbar.LayoutParams(paramLayoutParams);
  }

  private void a(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    Toolbar.LayoutParams localLayoutParams1;
    if (localLayoutParams == null)
      localLayoutParams1 = n();
    while (true)
    {
      localLayoutParams1.b = 1;
      addView(paramView, localLayoutParams1);
      return;
      if (!checkLayoutParams(localLayoutParams))
        localLayoutParams1 = a(localLayoutParams);
      else
        localLayoutParams1 = (Toolbar.LayoutParams)localLayoutParams;
    }
  }

  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = getChildMeasureSpec(paramInt1, paramInt2 + (getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin), localMarginLayoutParams.width);
    int i2 = getChildMeasureSpec(paramInt3, 0 + (getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin), localMarginLayoutParams.height);
    int i3 = View.MeasureSpec.getMode(i2);
    if ((i3 != 1073741824) && (paramInt5 >= 0))
    {
      if (i3 != 0)
        paramInt5 = Math.min(View.MeasureSpec.getSize(i2), paramInt5);
      i2 = View.MeasureSpec.makeMeasureSpec(paramInt5, 1073741824);
    }
    paramView.measure(i1, i2);
  }

  private void a(List<View> paramList, int paramInt)
  {
    int i1 = 1;
    if (av.h(this) == i1);
    int i2;
    int i3;
    int i4;
    while (true)
    {
      i2 = getChildCount();
      i3 = android.support.v4.view.m.a(paramInt, av.h(this));
      paramList.clear();
      i4 = 0;
      if (i1 == 0)
        break;
      for (int i5 = i2 - 1; i5 >= 0; i5--)
      {
        View localView2 = getChildAt(i5);
        Toolbar.LayoutParams localLayoutParams2 = (Toolbar.LayoutParams)localView2.getLayoutParams();
        if ((localLayoutParams2.b == 0) && (b(localView2)) && (f(localLayoutParams2.a) == i3))
          paramList.add(localView2);
      }
      i1 = 0;
    }
    while (i4 < i2)
    {
      View localView1 = getChildAt(i4);
      Toolbar.LayoutParams localLayoutParams1 = (Toolbar.LayoutParams)localView1.getLayoutParams();
      if ((localLayoutParams1.b == 0) && (b(localView1)) && (f(localLayoutParams1.a) == i3))
        paramList.add(localView1);
      i4++;
    }
  }

  private int b(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)paramView.getLayoutParams();
    int i1 = localLayoutParams.rightMargin - paramArrayOfInt[1];
    int i2 = paramInt1 - Math.max(0, i1);
    paramArrayOfInt[1] = Math.max(0, -i1);
    int i3 = a(paramView, paramInt2);
    int i4 = paramView.getMeasuredWidth();
    paramView.layout(i2 - i4, i3, i2, i3 + paramView.getMeasuredHeight());
    return i2 - (i4 + localLayoutParams.leftMargin);
  }

  private boolean b(View paramView)
  {
    return (paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8);
  }

  private static int c(View paramView)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return v.a(localMarginLayoutParams) + v.b(localMarginLayoutParams);
  }

  private static int d(View paramView)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin;
  }

  private void e(View paramView)
  {
    if ((((Toolbar.LayoutParams)paramView.getLayoutParams()).b != 2) && (paramView != this.b))
      if (this.a == null)
        break label38;
    label38: for (int i1 = 8; ; i1 = 0)
    {
      paramView.setVisibility(i1);
      return;
    }
  }

  private int f(int paramInt)
  {
    int i1 = av.h(this);
    int i2 = 0x7 & android.support.v4.view.m.a(paramInt, i1);
    switch (i2)
    {
    case 2:
    case 4:
    default:
      if (i1 == 1)
        i2 = 5;
      break;
    case 1:
    case 3:
    case 5:
      return i2;
    }
    return 3;
  }

  protected static Toolbar.LayoutParams n()
  {
    return new Toolbar.LayoutParams(-2, -2);
  }

  private void p()
  {
    if (this.b == null)
    {
      this.b = new ActionMenuView(getContext());
      this.b.a(this.j);
      this.b.a(this.C);
      this.b.a(this.G, this.H);
      Toolbar.LayoutParams localLayoutParams = n();
      localLayoutParams.a = (0x800005 | 0x70 & this.m);
      this.b.setLayoutParams(localLayoutParams);
      a(this.b);
    }
  }

  private void q()
  {
    if (this.e == null)
    {
      this.e = new ImageButton(getContext(), null, b.z);
      Toolbar.LayoutParams localLayoutParams = n();
      localLayoutParams.a = (0x800003 | 0x70 & this.m);
      this.e.setLayoutParams(localLayoutParams);
    }
  }

  public final void a(int paramInt)
  {
    if (this.j != paramInt)
    {
      this.j = paramInt;
      if (paramInt == 0)
        this.i = getContext();
    }
    else
    {
      return;
    }
    this.i = new ContextThemeWrapper(getContext(), paramInt);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    this.s.a(paramInt1, paramInt2);
  }

  public final void a(Context paramContext, int paramInt)
  {
    this.k = paramInt;
    if (this.c != null)
      this.c.setTextAppearance(paramContext, paramInt);
  }

  public final void a(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      if (this.f == null)
        this.f = new ImageView(getContext());
      if (this.f.getParent() == null)
      {
        a(this.f);
        e(this.f);
      }
    }
    while (true)
    {
      if (this.f != null)
        this.f.setImageDrawable(paramDrawable);
      return;
      if ((this.f != null) && (this.f.getParent() != null))
        removeView(this.f);
    }
  }

  public final void a(i parami, ActionMenuPresenter paramActionMenuPresenter)
  {
    if ((parami == null) && (this.b == null));
    i locali;
    do
    {
      return;
      p();
      locali = this.b.d();
    }
    while (locali == parami);
    if (locali != null)
    {
      locali.b(this.E);
      locali.b(this.F);
    }
    if (this.F == null)
      this.F = new bp(this, (byte)0);
    paramActionMenuPresenter.d(true);
    if (parami != null)
    {
      parami.a(paramActionMenuPresenter, this.i);
      parami.a(this.F, this.i);
    }
    while (true)
    {
      this.b.a(this.j);
      this.b.a(paramActionMenuPresenter);
      this.E = paramActionMenuPresenter;
      return;
      paramActionMenuPresenter.a(this.i, null);
      this.F.a(this.i, null);
      paramActionMenuPresenter.b(true);
      this.F.b(true);
    }
  }

  public final void a(bq parambq)
  {
    this.B = parambq;
  }

  public final void a(View.OnClickListener paramOnClickListener)
  {
    q();
    this.e.setOnClickListener(paramOnClickListener);
  }

  public final void a(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.c == null)
      {
        Context localContext = getContext();
        this.c = new TextView(localContext);
        this.c.setSingleLine();
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        if (this.k != 0)
          this.c.setTextAppearance(localContext, this.k);
        if (this.w != 0)
          this.c.setTextColor(this.w);
      }
      if (this.c.getParent() == null)
      {
        a(this.c);
        e(this.c);
      }
    }
    while (true)
    {
      if (this.c != null)
        this.c.setText(paramCharSequence);
      this.u = paramCharSequence;
      return;
      if ((this.c != null) && (this.c.getParent() != null))
        removeView(this.c);
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.I = paramBoolean;
    requestLayout();
  }

  public final boolean a()
  {
    return (getVisibility() == 0) && (this.b != null) && (this.b.a());
  }

  public final void b(int paramInt)
  {
    this.w = paramInt;
    if (this.c != null)
      this.c.setTextColor(paramInt);
  }

  public final void b(Context paramContext, int paramInt)
  {
    this.l = paramInt;
    if (this.d != null)
      this.d.setTextAppearance(paramContext, paramInt);
  }

  public final void b(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      q();
      if (this.e.getParent() == null)
      {
        a(this.e);
        e(this.e);
      }
    }
    while (true)
    {
      if (this.e != null)
        this.e.setImageDrawable(paramDrawable);
      return;
      if ((this.e != null) && (this.e.getParent() != null))
        removeView(this.e);
    }
  }

  public final void b(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.d == null)
      {
        Context localContext = getContext();
        this.d = new TextView(localContext);
        this.d.setSingleLine();
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        if (this.l != 0)
          this.d.setTextAppearance(localContext, this.l);
        if (this.x != 0)
          this.d.setTextColor(this.x);
      }
      if (this.d.getParent() == null)
      {
        a(this.d);
        e(this.d);
      }
    }
    while (true)
    {
      if (this.d != null)
        this.d.setText(paramCharSequence);
      this.v = paramCharSequence;
      return;
      if ((this.d != null) && (this.d.getParent() != null))
        removeView(this.d);
    }
  }

  public final boolean b()
  {
    return (this.b != null) && (this.b.g());
  }

  public final void c(int paramInt)
  {
    this.x = paramInt;
    if (this.d != null)
      this.d.setTextColor(paramInt);
  }

  public final void c(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
      q();
    if (this.e != null)
      this.e.setContentDescription(paramCharSequence);
  }

  public final boolean c()
  {
    return (this.b != null) && (this.b.h());
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof Toolbar.LayoutParams));
  }

  public final void d(int paramInt)
  {
    if (paramInt != 0);
    for (CharSequence localCharSequence = getContext().getText(paramInt); ; localCharSequence = null)
    {
      c(localCharSequence);
      return;
    }
  }

  public final boolean d()
  {
    return (this.b != null) && (this.b.e());
  }

  public final void e(int paramInt)
  {
    new e(getContext()).inflate(2131755009, m());
  }

  public final boolean e()
  {
    return (this.b != null) && (this.b.f());
  }

  public final void f()
  {
    if (this.b != null)
      this.b.i();
  }

  public final boolean g()
  {
    return (this.F != null) && (this.F.b != null);
  }

  public final void h()
  {
    if (this.F == null);
    for (android.support.v7.internal.view.menu.m localm = null; ; localm = this.F.b)
    {
      if (localm != null)
        localm.collapseActionView();
      return;
    }
  }

  public final CharSequence i()
  {
    return this.u;
  }

  public final CharSequence j()
  {
    return this.v;
  }

  public final CharSequence k()
  {
    if (this.e != null)
      return this.e.getContentDescription();
    return null;
  }

  public final Drawable l()
  {
    if (this.e != null)
      return this.e.getDrawable();
    return null;
  }

  public final Menu m()
  {
    p();
    if (this.b.d() == null)
    {
      i locali = (i)this.b.c();
      if (this.F == null)
        this.F = new bp(this, (byte)0);
      this.b.b(true);
      locali.a(this.F, this.i);
    }
    return this.b.c();
  }

  public final u o()
  {
    if (this.D == null)
      this.D = new ap(this, true);
    return this.D;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.K);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int[] arrayOfInt;
    int i9;
    label84: int i10;
    int i11;
    if (av.h(this) == 1)
    {
      i1 = 1;
      i2 = getWidth();
      i3 = getHeight();
      i4 = getPaddingLeft();
      i5 = getPaddingRight();
      i6 = getPaddingTop();
      i7 = getPaddingBottom();
      i8 = i2 - i5;
      arrayOfInt = this.A;
      arrayOfInt[1] = 0;
      arrayOfInt[0] = 0;
      if (Build.VERSION.SDK_INT < 16)
        break label898;
      i9 = av.p(this);
      if (!b(this.e))
        break label1791;
      if (i1 == 0)
        break label907;
      i10 = b(this.e, i8, arrayOfInt, i9);
      i11 = i4;
    }
    while (true)
    {
      label120: int i12;
      label152: label184: int i13;
      label292: int i14;
      int i15;
      if (b(this.h))
      {
        if (i1 != 0)
          i10 = b(this.h, i10, arrayOfInt, i9);
      }
      else
      {
        if (b(this.b))
        {
          if (i1 == 0)
            break label949;
          i11 = a(this.b, i11, arrayOfInt, i9);
        }
        arrayOfInt[0] = Math.max(0, this.s.a() - i11);
        arrayOfInt[1] = Math.max(0, this.s.b() - (i2 - i5 - i10));
        i12 = Math.max(i11, this.s.a());
        i13 = Math.min(i10, i2 - i5 - this.s.b());
        if (b(this.a))
        {
          if (i1 == 0)
            break label968;
          i13 = b(this.a, i13, arrayOfInt, i9);
        }
        if (!b(this.f))
          break label1780;
        if (i1 == 0)
          break label987;
        i14 = b(this.f, i13, arrayOfInt, i9);
        i15 = i12;
      }
      while (true)
      {
        label328: boolean bool1 = b(this.c);
        boolean bool2 = b(this.d);
        int i16 = 0;
        if (bool1)
        {
          Toolbar.LayoutParams localLayoutParams9 = (Toolbar.LayoutParams)this.c.getLayoutParams();
          i16 = 0 + (localLayoutParams9.topMargin + this.c.getMeasuredHeight() + localLayoutParams9.bottomMargin);
        }
        Toolbar.LayoutParams localLayoutParams8;
        if (bool2)
          localLayoutParams8 = (Toolbar.LayoutParams)this.d.getLayoutParams();
        for (int i17 = i16 + (localLayoutParams8.topMargin + this.d.getMeasuredHeight() + localLayoutParams8.bottomMargin); ; i17 = i16)
        {
          TextView localTextView1;
          label453: TextView localTextView2;
          label464: Toolbar.LayoutParams localLayoutParams1;
          Toolbar.LayoutParams localLayoutParams2;
          int i18;
          label517: int i71;
          int i73;
          if ((bool1) || (bool2))
          {
            if (!bool1)
              break label1014;
            localTextView1 = this.c;
            if (!bool2)
              break label1023;
            localTextView2 = this.d;
            localLayoutParams1 = (Toolbar.LayoutParams)localTextView1.getLayoutParams();
            localLayoutParams2 = (Toolbar.LayoutParams)localTextView2.getLayoutParams();
            if (((!bool1) || (this.c.getMeasuredWidth() <= 0)) && ((!bool2) || (this.d.getMeasuredWidth() <= 0)))
              break label1032;
            i18 = 1;
            switch (0x70 & this.t)
            {
            default:
              i71 = (i3 - i6 - i7 - i17) / 2;
              if (i71 < localLayoutParams1.topMargin + this.q)
                i73 = localLayoutParams1.topMargin + this.q;
              break;
            case 48:
            case 80:
            }
          }
          label898: label1155: 
          while (true)
          {
            label594: int i19 = i6 + i73;
            label601: int i58;
            label617: int i60;
            int i70;
            if (i1 != 0)
              if (i18 != 0)
              {
                i58 = this.o;
                int i59 = i58 - arrayOfInt[1];
                i60 = i14 - Math.max(0, i59);
                arrayOfInt[1] = Math.max(0, -i59);
                if (!bool1)
                  break label1759;
                Toolbar.LayoutParams localLayoutParams7 = (Toolbar.LayoutParams)this.c.getLayoutParams();
                int i68 = i60 - this.c.getMeasuredWidth();
                int i69 = i19 + this.c.getMeasuredHeight();
                this.c.layout(i68, i19, i60, i69);
                i70 = i68 - this.p;
                i19 = i69 + localLayoutParams7.bottomMargin;
              }
            label907: label949: label968: label987: label1759: for (int i61 = i70; ; i61 = i60)
            {
              Toolbar.LayoutParams localLayoutParams6;
              int i67;
              if (bool2)
              {
                localLayoutParams6 = (Toolbar.LayoutParams)this.d.getLayoutParams();
                int i64 = i19 + localLayoutParams6.topMargin;
                int i65 = i60 - this.d.getMeasuredWidth();
                int i66 = i64 + this.d.getMeasuredHeight();
                this.d.layout(i65, i64, i60, i66);
                i67 = i60 - this.p;
              }
              for (int i62 = i67; ; i62 = i60)
              {
                if (i18 != 0);
                for (int i63 = Math.min(i61, i62); ; i63 = i60)
                {
                  i14 = i63;
                  a(this.z, 3);
                  int i25 = this.z.size();
                  int i26 = 0;
                  int i27 = i15;
                  label1014: label1023: int i20;
                  int i57;
                  int i22;
                  while (true)
                    if (i26 < i25)
                    {
                      i27 = a((View)this.z.get(i26), i27, arrayOfInt, i9);
                      i26++;
                      continue;
                      i1 = 0;
                      break;
                      i9 = this.J;
                      break label84;
                      i11 = a(this.e, i4, arrayOfInt, i9);
                      i10 = i8;
                      break label120;
                      i11 = a(this.h, i11, arrayOfInt, i9);
                      break label152;
                      i10 = b(this.b, i10, arrayOfInt, i9);
                      break label184;
                      i12 = a(this.a, i12, arrayOfInt, i9);
                      break label292;
                      int i74 = a(this.f, i12, arrayOfInt, i9);
                      i14 = i13;
                      i15 = i74;
                      break label328;
                      localTextView1 = this.d;
                      break label453;
                      localTextView2 = this.c;
                      break label464;
                      i18 = 0;
                      break label517;
                      i19 = getPaddingTop() + localLayoutParams1.topMargin + this.q;
                      break label601;
                      int i72 = i3 - i7 - i17 - i71 - i6;
                      if (i72 >= localLayoutParams1.bottomMargin + this.r)
                        break label1766;
                      i73 = Math.max(0, i71 - (localLayoutParams2.bottomMargin + this.r - i72));
                      break label594;
                      i19 = i3 - i7 - localLayoutParams2.bottomMargin - this.r - i17;
                      break label601;
                      i58 = 0;
                      break label617;
                      if (i18 != 0)
                      {
                        i20 = this.o;
                        int i21 = i20 - arrayOfInt[0];
                        i15 += Math.max(0, i21);
                        arrayOfInt[0] = Math.max(0, -i21);
                        if (!bool1)
                          break label1734;
                        Toolbar.LayoutParams localLayoutParams5 = (Toolbar.LayoutParams)this.c.getLayoutParams();
                        int i54 = i15 + this.c.getMeasuredWidth();
                        int i55 = i19 + this.c.getMeasuredHeight();
                        this.c.layout(i15, i19, i54, i55);
                        int i56 = i54 + this.p;
                        i57 = i55 + localLayoutParams5.bottomMargin;
                        i22 = i56;
                      }
                    }
                  for (int i23 = i57; ; i23 = i19)
                  {
                    Toolbar.LayoutParams localLayoutParams4;
                    int i53;
                    if (bool2)
                    {
                      localLayoutParams4 = (Toolbar.LayoutParams)this.d.getLayoutParams();
                      int i50 = i23 + localLayoutParams4.topMargin;
                      int i51 = i15 + this.d.getMeasuredWidth();
                      int i52 = i50 + this.d.getMeasuredHeight();
                      this.d.layout(i15, i50, i51, i52);
                      i53 = i51 + this.p;
                    }
                    for (int i24 = i53; ; i24 = i15)
                    {
                      if (i18 == 0)
                        break label1732;
                      i15 = Math.max(i22, i24);
                      break;
                      i20 = 0;
                      break label1155;
                      a(this.z, 5);
                      int i28 = this.z.size();
                      int i29 = 0;
                      int i49;
                      for (int i30 = i14; i29 < i28; i30 = i49)
                      {
                        i49 = b((View)this.z.get(i29), i30, arrayOfInt, i9);
                        i29++;
                      }
                      a(this.z, 1);
                      ArrayList localArrayList = this.z;
                      int i31 = arrayOfInt[0];
                      int i32 = arrayOfInt[1];
                      int i33 = localArrayList.size();
                      int i34 = i31;
                      int i35 = i32;
                      int i36 = 0;
                      int i48;
                      for (int i37 = 0; i36 < i33; i37 = i48)
                      {
                        View localView = (View)localArrayList.get(i36);
                        Toolbar.LayoutParams localLayoutParams3 = (Toolbar.LayoutParams)localView.getLayoutParams();
                        int i44 = localLayoutParams3.leftMargin - i34;
                        int i45 = localLayoutParams3.rightMargin - i35;
                        int i46 = Math.max(0, i44);
                        int i47 = Math.max(0, i45);
                        i34 = Math.max(0, -i44);
                        i35 = Math.max(0, -i45);
                        i48 = i37 + (i47 + (i46 + localView.getMeasuredWidth()));
                        i36++;
                      }
                      int i38 = i4 + (i2 - i4 - i5) / 2 - i37 / 2;
                      int i39 = i38 + i37;
                      if (i38 < i27)
                        i38 = i27;
                      while (true)
                      {
                        int i40 = this.z.size();
                        int i41 = 0;
                        int i43;
                        for (int i42 = i38; i41 < i40; i42 = i43)
                        {
                          i43 = a((View)this.z.get(i41), i42, arrayOfInt, i9);
                          i41++;
                        }
                        if (i39 > i30)
                          i38 -= i39 - i30;
                      }
                      this.z.clear();
                      return;
                    }
                    break;
                    i22 = i15;
                  }
                }
              }
            }
            label1032: label1732: label1734: label1766: i73 = i71;
          }
        }
        label1780: i14 = i13;
        i15 = i12;
      }
      label1791: i10 = i8;
      i11 = i4;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = this.A;
    int i1;
    int i2;
    int i3;
    int i31;
    int i4;
    if (ar.a(this))
    {
      i1 = 0;
      i2 = 1;
      if (!b(this.e))
        break label969;
      a(this.e, paramInt1, 0, paramInt2, 0, this.n);
      i3 = this.e.getMeasuredWidth() + c(this.e);
      i31 = Math.max(0, this.e.getMeasuredHeight() + d(this.e));
      i4 = ar.a(0, av.l(this.e));
    }
    for (int i5 = i31; ; i5 = 0)
    {
      if (b(this.h))
      {
        a(this.h, paramInt1, 0, paramInt2, 0, this.n);
        i3 = this.h.getMeasuredWidth() + c(this.h);
        i5 = Math.max(i5, this.h.getMeasuredHeight() + d(this.h));
        i4 = ar.a(i4, av.l(this.h));
      }
      int i6 = this.s.c();
      int i7 = 0 + Math.max(i6, i3);
      arrayOfInt[i2] = Math.max(0, i6 - i3);
      boolean bool1 = b(this.b);
      int i8 = 0;
      if (bool1)
      {
        a(this.b, paramInt1, i7, paramInt2, 0, this.n);
        i8 = this.b.getMeasuredWidth() + c(this.b);
        i5 = Math.max(i5, this.b.getMeasuredHeight() + d(this.b));
        i4 = ar.a(i4, av.l(this.b));
      }
      int i9 = this.s.d();
      int i10 = i7 + Math.max(i9, i8);
      arrayOfInt[i1] = Math.max(0, i9 - i8);
      if (b(this.a))
      {
        i10 += a(this.a, paramInt1, i10, paramInt2, 0, arrayOfInt);
        i5 = Math.max(i5, this.a.getMeasuredHeight() + d(this.a));
        i4 = ar.a(i4, av.l(this.a));
      }
      if (b(this.f))
      {
        i10 += a(this.f, paramInt1, i10, paramInt2, 0, arrayOfInt);
        i5 = Math.max(i5, this.f.getMeasuredHeight() + d(this.f));
        i4 = ar.a(i4, av.l(this.f));
      }
      int i11 = getChildCount();
      int i12 = 0;
      int i13 = i5;
      int i14 = i4;
      label484: int i30;
      int i28;
      if (i12 < i11)
      {
        View localView2 = getChildAt(i12);
        if ((((Toolbar.LayoutParams)localView2.getLayoutParams()).b != 0) || (!b(localView2)))
          break label958;
        i10 += a(localView2, paramInt1, i10, paramInt2, 0, arrayOfInt);
        i30 = Math.max(i13, localView2.getMeasuredHeight() + d(localView2));
        i28 = ar.a(i14, av.l(localView2));
      }
      for (int i29 = i30; ; i29 = i13)
      {
        i12++;
        i14 = i28;
        i13 = i29;
        break label484;
        i1 = 1;
        i2 = 0;
        break;
        int i15 = this.q + this.r;
        int i16 = this.o + this.p;
        boolean bool2 = b(this.c);
        int i17 = 0;
        int i18 = 0;
        if (bool2)
        {
          a(this.c, paramInt1, i10 + i16, paramInt2, i15, arrayOfInt);
          i18 = this.c.getMeasuredWidth() + c(this.c);
          i17 = this.c.getMeasuredHeight() + d(this.c);
          i14 = ar.a(i14, av.l(this.c));
        }
        if (b(this.d))
        {
          i18 = Math.max(i18, a(this.d, paramInt1, i10 + i16, paramInt2, i15 + i17, arrayOfInt));
          i17 += this.d.getMeasuredHeight() + d(this.d);
          i14 = ar.a(i14, av.l(this.d));
        }
        int i19 = i18 + i10;
        int i20 = Math.max(i13, i17);
        int i21 = i19 + (getPaddingLeft() + getPaddingRight());
        int i22 = i20 + (getPaddingTop() + getPaddingBottom());
        int i23 = av.a(Math.max(i21, getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & i14);
        int i24 = av.a(Math.max(i22, getSuggestedMinimumHeight()), paramInt2, i14 << 16);
        int i27;
        if (!this.I)
          i27 = 0;
        while (true)
        {
          if (i27 != 0)
            i24 = 0;
          setMeasuredDimension(i23, i24);
          return;
          int i25 = getChildCount();
          for (int i26 = 0; ; i26++)
          {
            if (i26 >= i25)
              break label952;
            View localView1 = getChildAt(i26);
            if ((b(localView1)) && (localView1.getMeasuredWidth() > 0) && (localView1.getMeasuredHeight() > 0))
            {
              i27 = 0;
              break;
            }
          }
          label952: i27 = 1;
        }
        label958: i28 = i14;
      }
      label969: i3 = 0;
      i4 = 0;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    Toolbar.SavedState localSavedState = (Toolbar.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (this.b != null);
    for (i locali = this.b.d(); ; locali = null)
    {
      if ((localSavedState.a != 0) && (this.F != null) && (locali != null))
      {
        MenuItem localMenuItem = locali.findItem(localSavedState.a);
        if (localMenuItem != null)
          z.b(localMenuItem);
      }
      if (localSavedState.b)
      {
        removeCallbacks(this.K);
        post(this.K);
      }
      return;
    }
  }

  public void onRtlPropertiesChanged(int paramInt)
  {
    int i1 = 1;
    if (Build.VERSION.SDK_INT >= 17)
      super.onRtlPropertiesChanged(paramInt);
    ab localab = this.s;
    if (paramInt == i1);
    while (true)
    {
      localab.a(i1);
      return;
      i1 = 0;
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    Toolbar.SavedState localSavedState = new Toolbar.SavedState(super.onSaveInstanceState());
    if ((this.F != null) && (this.F.b != null))
      localSavedState.a = this.F.b.getItemId();
    localSavedState.b = b();
    return localSavedState;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = af.a(paramMotionEvent);
    if (i1 == 0)
      this.y = false;
    if (!this.y)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i1 == 0) && (!bool))
        this.y = true;
    }
    if ((i1 == 1) || (i1 == 3))
      this.y = false;
    return true;
  }

  public void setMinimumHeight(int paramInt)
  {
    this.J = paramInt;
    super.setMinimumHeight(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.Toolbar
 * JD-Core Version:    0.6.2
 */