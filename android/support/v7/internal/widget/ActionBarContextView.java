package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.av;
import android.support.v4.view.cd;
import android.support.v4.view.cp;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import textnow.g.b;
import textnow.g.g;
import textnow.g.l;
import textnow.k.h;

public class ActionBarContextView extends a
  implements cp
{
  private CharSequence i;
  private CharSequence j;
  private View k;
  private View l;
  private LinearLayout m;
  private TextView n;
  private TextView o;
  private int p;
  private int q;
  private Drawable r;
  private boolean s;
  private int t;
  private h u;
  private boolean v;
  private int w;

  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.j);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ao localao = ao.a(paramContext, paramAttributeSet, l.y, paramInt, 0);
    setBackgroundDrawable(localao.a(l.z));
    this.p = localao.f(l.E, 0);
    this.q = localao.f(l.D, 0);
    this.g = localao.e(l.C, 0);
    this.r = localao.a(l.A);
    this.t = localao.f(l.B, textnow.g.i.d);
    localao.b();
  }

  private void g()
  {
    int i1 = 8;
    int i2 = 1;
    if (this.m == null)
    {
      LayoutInflater.from(getContext()).inflate(textnow.g.i.a, this);
      this.m = ((LinearLayout)getChildAt(-1 + getChildCount()));
      this.n = ((TextView)this.m.findViewById(g.e));
      this.o = ((TextView)this.m.findViewById(g.d));
      if (this.p != 0)
        this.n.setTextAppearance(getContext(), this.p);
      if (this.q != 0)
        this.o.setTextAppearance(getContext(), this.q);
    }
    this.n.setText(this.i);
    this.o.setText(this.j);
    int i3;
    label166: TextView localTextView;
    if (!TextUtils.isEmpty(this.i))
    {
      i3 = i2;
      if (TextUtils.isEmpty(this.j))
        break label232;
      localTextView = this.o;
      if (i2 == 0)
        break label237;
    }
    label232: label237: for (int i4 = 0; ; i4 = i1)
    {
      localTextView.setVisibility(i4);
      LinearLayout localLinearLayout = this.m;
      if ((i3 != 0) || (i2 != 0))
        i1 = 0;
      localLinearLayout.setVisibility(i1);
      if (this.m.getParent() == null)
        addView(this.m);
      return;
      i3 = 0;
      break;
      i2 = 0;
      break label166;
    }
  }

  private void h()
  {
    h localh = this.u;
    if (localh != null)
    {
      this.u = null;
      localh.b();
    }
  }

  public final void a(int paramInt)
  {
    this.g = paramInt;
  }

  public final void a(View paramView)
  {
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.i = paramCharSequence;
    g();
  }

  public final void a(final textnow.l.a parama)
  {
    android.support.v7.internal.view.menu.i locali;
    ViewGroup.LayoutParams localLayoutParams;
    if (this.k == null)
    {
      this.k = LayoutInflater.from(getContext()).inflate(this.t, this, false);
      addView(this.k);
      this.k.findViewById(g.i).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          parama.b();
        }
      });
      locali = (android.support.v7.internal.view.menu.i)parama.a();
      if (this.d != null)
        this.d.f();
      this.d = new ActionMenuPresenter(getContext());
      this.d.c(true);
      localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
      if (this.f)
        break label192;
      locali.a(this.d, this.b);
      this.c = ((ActionMenuView)this.d.a(this));
      this.c.setBackgroundDrawable(null);
      addView(this.c, localLayoutParams);
    }
    while (true)
    {
      this.v = true;
      return;
      if (this.k.getParent() != null)
        break;
      addView(this.k);
      break;
      label192: this.d.a(getContext().getResources().getDisplayMetrics().widthPixels, true);
      this.d.b(2147483647);
      localLayoutParams.width = -1;
      localLayoutParams.height = this.g;
      locali.a(this.d, this.b);
      this.c = ((ActionMenuView)this.d.a(this));
      this.c.setBackgroundDrawable(this.r);
      this.e.addView(this.c, localLayoutParams);
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean != this.s)
      requestLayout();
    this.s = paramBoolean;
  }

  public final boolean a()
  {
    if (this.d != null)
      return this.d.d();
    return false;
  }

  public final CharSequence b()
  {
    return this.i;
  }

  public final void b(View paramView)
  {
    if (this.w == 2)
      e();
    this.w = 0;
  }

  public final void b(CharSequence paramCharSequence)
  {
    this.j = paramCharSequence;
    g();
  }

  public final CharSequence c()
  {
    return this.j;
  }

  public final void c(View paramView)
  {
  }

  public final void d()
  {
    if (this.w == 2)
      return;
    if (this.k == null)
    {
      e();
      return;
    }
    h();
    this.w = 2;
    cd localcd = av.q(this.k).b(-this.k.getWidth() - ((ViewGroup.MarginLayoutParams)this.k.getLayoutParams()).leftMargin);
    localcd.a(200L);
    localcd.a(this);
    localcd.a(new DecelerateInterpolator());
    h localh = new h();
    localh.a(localcd);
    if (this.c != null)
      this.c.getChildCount();
    this.u = localh;
    this.u.a();
  }

  public final void d(View paramView)
  {
    if (this.l != null)
      removeView(this.l);
    this.l = paramView;
    if (this.m != null)
    {
      removeView(this.m);
      this.m = null;
    }
    if (paramView != null)
      addView(paramView);
    requestLayout();
  }

  public final void e()
  {
    h();
    removeAllViews();
    if (this.e != null)
      this.e.removeView(this.c);
    this.l = null;
    this.c = null;
    this.v = false;
  }

  public final boolean f()
  {
    return this.s;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.d != null)
    {
      this.d.e();
      this.d.g();
    }
  }

  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      if (paramAccessibilityEvent.getEventType() == 32)
      {
        paramAccessibilityEvent.setSource(this);
        paramAccessibilityEvent.setClassName(getClass().getName());
        paramAccessibilityEvent.setPackageName(getContext().getPackageName());
        paramAccessibilityEvent.setContentDescription(this.i);
      }
    }
    else
      return;
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = ar.a(this);
    int i1;
    int i2;
    int i3;
    ViewGroup.MarginLayoutParams localMarginLayoutParams;
    int i5;
    if (bool1)
    {
      i1 = paramInt3 - paramInt1 - getPaddingRight();
      i2 = getPaddingTop();
      i3 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
      if ((this.k == null) || (this.k.getVisibility() == 8))
        break label368;
      localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.k.getLayoutParams();
      if (!bool1)
        break label330;
      i5 = localMarginLayoutParams.rightMargin;
      label87: if (!bool1)
        break label340;
    }
    h localh;
    label330: label340: for (int i6 = localMarginLayoutParams.leftMargin; ; i6 = localMarginLayoutParams.rightMargin)
    {
      int i7 = a(i1, i5, bool1);
      i1 = a(i7 + a(this.k, i7, i2, i3, bool1), i6, bool1);
      if (!this.v)
        break label368;
      this.w = 1;
      av.a(this.k, -this.k.getWidth() - ((ViewGroup.MarginLayoutParams)this.k.getLayoutParams()).leftMargin);
      cd localcd1 = av.q(this.k).b(0.0F);
      localcd1.a(200L);
      localcd1.a(this);
      localcd1.a(new DecelerateInterpolator());
      localh = new h();
      localh.a(localcd1);
      if (this.c == null)
        break label350;
      int i8 = this.c.getChildCount();
      if (i8 <= 0)
        break label350;
      for (int i9 = i8 - 1; i9 >= 0; i9--)
      {
        View localView = this.c.getChildAt(i9);
        av.e(localView, 0.0F);
        cd localcd2 = av.q(localView).d(1.0F);
        localcd2.a(300L);
        localh.a(localcd2);
      }
      i1 = getPaddingLeft();
      break;
      i5 = localMarginLayoutParams.leftMargin;
      break label87;
    }
    label350: this.u = localh;
    this.u.a();
    this.v = false;
    label368: if ((this.m != null) && (this.l == null) && (this.m.getVisibility() != 8))
      i1 += a(this.m, i1, i2, i3, bool1);
    if (this.l != null)
      a(this.l, i1, i2, i3, bool1);
    int i4;
    ActionMenuView localActionMenuView;
    if (bool1)
    {
      i4 = getPaddingLeft();
      if (this.c != null)
      {
        localActionMenuView = this.c;
        if (bool1)
          break label498;
      }
    }
    label498: for (boolean bool2 = true; ; bool2 = false)
    {
      a(localActionMenuView, i4, i2, i3, bool2);
      return;
      i4 = paramInt3 - paramInt1 - getPaddingRight();
      break;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 1073741824;
    int i2 = 0;
    if (View.MeasureSpec.getMode(paramInt1) != i1)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
    if (View.MeasureSpec.getMode(paramInt2) == 0)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4;
    int i6;
    int i7;
    int i8;
    int i16;
    label302: int i17;
    label328: label335: int i12;
    label364: int i13;
    label394: label414: int i10;
    label450: int i11;
    if (this.g > 0)
    {
      i4 = this.g;
      int i5 = getPaddingTop() + getPaddingBottom();
      i6 = i3 - getPaddingLeft() - getPaddingRight();
      i7 = i4 - i5;
      i8 = View.MeasureSpec.makeMeasureSpec(i7, -2147483648);
      if (this.k != null)
      {
        int i18 = a(this.k, i6, i8, 0);
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.k.getLayoutParams();
        i6 = i18 - (localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin);
      }
      if ((this.c != null) && (this.c.getParent() == this))
        i6 = a(this.c, i6, i8, 0);
      if ((this.m != null) && (this.l == null))
      {
        if (!this.s)
          break label510;
        int i14 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.m.measure(i14, i8);
        int i15 = this.m.getMeasuredWidth();
        if (i15 > i6)
          break label497;
        i16 = 1;
        if (i16 != 0)
          i6 -= i15;
        LinearLayout localLinearLayout = this.m;
        if (i16 == 0)
          break label503;
        i17 = 0;
        localLinearLayout.setVisibility(i17);
      }
      if (this.l != null)
      {
        ViewGroup.LayoutParams localLayoutParams = this.l.getLayoutParams();
        if (localLayoutParams.width == -2)
          break label527;
        i12 = i1;
        if (localLayoutParams.width >= 0)
          i6 = Math.min(localLayoutParams.width, i6);
        if (localLayoutParams.height == -2)
          break label535;
        if (localLayoutParams.height < 0)
          break label542;
        i13 = Math.min(localLayoutParams.height, i7);
        this.l.measure(View.MeasureSpec.makeMeasureSpec(i6, i12), View.MeasureSpec.makeMeasureSpec(i13, i1));
      }
      if (this.g > 0)
        break label558;
      int i9 = getChildCount();
      i10 = 0;
      if (i2 >= i9)
        break label549;
      i11 = i5 + getChildAt(i2).getMeasuredHeight();
      if (i11 <= i10)
        break label567;
    }
    while (true)
    {
      i2++;
      i10 = i11;
      break label450;
      i4 = View.MeasureSpec.getSize(paramInt2);
      break;
      label497: i16 = 0;
      break label302;
      label503: i17 = 8;
      break label328;
      label510: i6 = a(this.m, i6, i8, 0);
      break label335;
      label527: i12 = -2147483648;
      break label364;
      label535: i1 = -2147483648;
      break label394;
      label542: i13 = i7;
      break label414;
      label549: setMeasuredDimension(i3, i10);
      return;
      label558: setMeasuredDimension(i3, i4);
      return;
      label567: i11 = i10;
    }
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarContextView
 * JD-Core Version:    0.6.2
 */