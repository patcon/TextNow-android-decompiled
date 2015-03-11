package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.support.v7.internal.view.menu.n;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import textnow.g.c;
import textnow.g.f;
import textnow.g.h;
import textnow.g.k;

public class ActionBarContextView extends a
{
  private CharSequence g;
  private CharSequence h;
  private View i;
  private View j;
  private LinearLayout k;
  private TextView l;
  private TextView m;
  private int n;
  private int o;
  private Drawable p;
  private boolean q;

  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, c.f);
  }

  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.f, paramInt, 0);
    setBackgroundDrawable(localTypedArray.getDrawable(3));
    this.n = localTypedArray.getResourceId(1, 0);
    this.o = localTypedArray.getResourceId(2, 0);
    this.f = localTypedArray.getLayoutDimension(0, 0);
    this.p = localTypedArray.getDrawable(4);
    localTypedArray.recycle();
  }

  public final void a(int paramInt)
  {
    this.f = paramInt;
  }

  public final void a(CharSequence paramCharSequence)
  {
    int i1 = 8;
    int i2 = 1;
    this.g = paramCharSequence;
    if (this.k == null)
    {
      LayoutInflater.from(getContext()).inflate(h.e, this);
      this.k = ((LinearLayout)getChildAt(-1 + getChildCount()));
      this.l = ((TextView)this.k.findViewById(f.g));
      this.m = ((TextView)this.k.findViewById(f.f));
      if (this.n != 0)
        this.l.setTextAppearance(getContext(), this.n);
      if (this.o != 0)
        this.m.setTextAppearance(getContext(), this.o);
    }
    this.l.setText(this.g);
    this.m.setText(this.h);
    int i3;
    label172: TextView localTextView;
    if (!TextUtils.isEmpty(this.g))
    {
      i3 = i2;
      if (TextUtils.isEmpty(this.h))
        break label240;
      localTextView = this.m;
      if (i2 == 0)
        break label245;
    }
    label240: label245: for (int i4 = 0; ; i4 = i1)
    {
      localTextView.setVisibility(i4);
      LinearLayout localLinearLayout = this.k;
      if ((i3 != 0) || (i2 != 0))
        i1 = 0;
      localLinearLayout.setVisibility(i1);
      if (this.k.getParent() == null)
        addView(this.k);
      return;
      i3 = 0;
      break;
      i2 = 0;
      break label172;
    }
  }

  public final void a(final textnow.i.a parama)
  {
    if (this.i == null)
    {
      this.i = LayoutInflater.from(getContext()).inflate(h.h, this, false);
      addView(this.i);
    }
    n localn;
    ViewGroup.LayoutParams localLayoutParams;
    while (true)
    {
      this.i.findViewById(f.j).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          parama.b();
        }
      });
      localn = (n)parama.a();
      if (this.b != null)
        this.b.d();
      this.b = new ActionMenuPresenter(getContext());
      this.b.b(true);
      localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
      if (this.d)
        break;
      localn.a(this.b);
      this.a = ((ActionMenuView)this.b.a(this));
      this.a.setBackgroundDrawable(null);
      addView(this.a, localLayoutParams);
      return;
      if (this.i.getParent() == null)
        addView(this.i);
    }
    this.b.a(getContext().getResources().getDisplayMetrics().widthPixels, true);
    this.b.a(2147483647);
    localLayoutParams.width = -1;
    localLayoutParams.height = this.f;
    localn.a(this.b);
    this.a = ((ActionMenuView)this.b.a(this));
    this.a.setBackgroundDrawable(this.p);
    this.c.addView(this.a, localLayoutParams);
  }

  public final void a(boolean paramBoolean)
  {
    ViewGroup.LayoutParams localLayoutParams;
    if (this.d != paramBoolean)
      if (this.b != null)
      {
        localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
        if (paramBoolean)
          break label94;
        this.a = ((ActionMenuView)this.b.a(this));
        this.a.setBackgroundDrawable(null);
        ViewGroup localViewGroup2 = (ViewGroup)this.a.getParent();
        if (localViewGroup2 != null)
          localViewGroup2.removeView(this.a);
        addView(this.a, localLayoutParams);
      }
    while (true)
    {
      super.a(paramBoolean);
      return;
      label94: this.b.a(getContext().getResources().getDisplayMetrics().widthPixels, true);
      this.b.a(2147483647);
      localLayoutParams.width = -1;
      localLayoutParams.height = this.f;
      this.a = ((ActionMenuView)this.b.a(this));
      this.a.setBackgroundDrawable(this.p);
      ViewGroup localViewGroup1 = (ViewGroup)this.a.getParent();
      if (localViewGroup1 != null)
        localViewGroup1.removeView(this.a);
      this.c.addView(this.a, localLayoutParams);
    }
  }

  public final boolean b()
  {
    if (this.b != null)
      return this.b.b();
    return false;
  }

  public final boolean d()
  {
    if (this.b != null)
      return this.b.c();
    return false;
  }

  public final boolean e()
  {
    if (this.b != null)
      return this.b.f();
    return false;
  }

  public final void g()
  {
    if (this.i == null)
      h();
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }

  public final void h()
  {
    removeAllViews();
    if (this.c != null)
      this.c.removeView(this.a);
    this.j = null;
    this.a = null;
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.b != null)
    {
      this.b.c();
      this.b.e();
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getPaddingLeft();
    int i2 = getPaddingTop();
    int i3 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    ViewGroup.MarginLayoutParams localMarginLayoutParams;
    int i6;
    if ((this.i != null) && (this.i.getVisibility() != 8))
    {
      localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.i.getLayoutParams();
      i6 = i1 + localMarginLayoutParams.leftMargin;
    }
    for (int i4 = i6 + b(this.i, i6, i2, i3) + localMarginLayoutParams.rightMargin; ; i4 = i1)
    {
      if ((this.k != null) && (this.j == null) && (this.k.getVisibility() != 8))
        i4 += b(this.k, i4, i2, i3);
      if (this.j != null)
        b(this.j, i4, i2, i3);
      int i5 = paramInt3 - paramInt1 - getPaddingRight();
      if (this.a != null)
        c(this.a, i5, i2, i3);
      return;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 1073741824;
    int i2 = 0;
    if (View.MeasureSpec.getMode(paramInt1) != i1)
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"FILL_PARENT\" (or fill_parent)");
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
    if (this.f > 0)
    {
      i4 = this.f;
      int i5 = getPaddingTop() + getPaddingBottom();
      i6 = i3 - getPaddingLeft() - getPaddingRight();
      i7 = i4 - i5;
      i8 = View.MeasureSpec.makeMeasureSpec(i7, -2147483648);
      if (this.i != null)
      {
        int i18 = a(this.i, i6, i8, 0);
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.i.getLayoutParams();
        i6 = i18 - (localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin);
      }
      if ((this.a != null) && (this.a.getParent() == this))
        i6 = a(this.a, i6, i8, 0);
      if ((this.k != null) && (this.j == null))
      {
        if (!this.q)
          break label510;
        int i14 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.k.measure(i14, i8);
        int i15 = this.k.getMeasuredWidth();
        if (i15 > i6)
          break label497;
        i16 = 1;
        if (i16 != 0)
          i6 -= i15;
        LinearLayout localLinearLayout = this.k;
        if (i16 == 0)
          break label503;
        i17 = 0;
        localLinearLayout.setVisibility(i17);
      }
      if (this.j != null)
      {
        ViewGroup.LayoutParams localLayoutParams = this.j.getLayoutParams();
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
        this.j.measure(View.MeasureSpec.makeMeasureSpec(i6, i12), View.MeasureSpec.makeMeasureSpec(i13, i1));
      }
      if (this.f > 0)
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
      label510: i6 = a(this.k, i6, i8, 0);
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarContextView
 * JD-Core Version:    0.6.2
 */