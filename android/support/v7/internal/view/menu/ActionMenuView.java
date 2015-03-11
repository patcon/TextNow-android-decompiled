package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.internal.widget.LinearLayoutICS;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import textnow.g.c;
import textnow.g.k;

public class ActionMenuView extends LinearLayoutICS
  implements ac, p
{
  private n a;
  private boolean b;
  private ActionMenuPresenter c;
  private boolean d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;

  public ActionMenuView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    this.f = ((int)(56.0F * f1));
    this.g = ((int)(f1 * 4.0F));
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.a, c.b, 0);
    this.i = localTypedArray.getDimensionPixelSize(1, 0);
    localTypedArray.recycle();
  }

  static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ActionMenuView.LayoutParams localLayoutParams = (ActionMenuView.LayoutParams)paramView.getLayoutParams();
    int j = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    ActionMenuItemView localActionMenuItemView;
    int k;
    if ((paramView instanceof ActionMenuItemView))
    {
      localActionMenuItemView = (ActionMenuItemView)paramView;
      if ((localActionMenuItemView == null) || (!localActionMenuItemView.c()))
        break label182;
      k = 1;
      label54: if ((paramInt2 <= 0) || ((k != 0) && (paramInt2 < 2)))
        break label188;
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, -2147483648), j);
      int n = paramView.getMeasuredWidth();
      m = n / paramInt1;
      if (n % paramInt1 != 0)
        m++;
      if ((k == 0) || (m >= 2));
    }
    label182: label188: for (int m = 2; ; m = 0)
    {
      boolean bool1 = localLayoutParams.a;
      boolean bool2 = false;
      if (!bool1)
      {
        bool2 = false;
        if (k != 0)
          bool2 = true;
      }
      localLayoutParams.d = bool2;
      localLayoutParams.b = m;
      paramView.measure(View.MeasureSpec.makeMeasureSpec(m * paramInt1, 1073741824), j);
      return m;
      localActionMenuItemView = null;
      break;
      k = 0;
      break label54;
    }
  }

  private ActionMenuView.LayoutParams a(AttributeSet paramAttributeSet)
  {
    return new ActionMenuView.LayoutParams(getContext(), paramAttributeSet);
  }

  private static ActionMenuView.LayoutParams c()
  {
    ActionMenuView.LayoutParams localLayoutParams = new ActionMenuView.LayoutParams(-2, -2);
    localLayoutParams.gravity = 16;
    return localLayoutParams;
  }

  public final ActionMenuView.LayoutParams a()
  {
    ActionMenuView.LayoutParams localLayoutParams = c();
    localLayoutParams.a = true;
    return localLayoutParams;
  }

  protected final ActionMenuView.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ActionMenuView.LayoutParams))
    {
      ActionMenuView.LayoutParams localLayoutParams = new ActionMenuView.LayoutParams((ActionMenuView.LayoutParams)paramLayoutParams);
      if (localLayoutParams.gravity <= 0)
        localLayoutParams.gravity = 16;
      return localLayoutParams;
    }
    return c();
  }

  public final void a(ActionMenuPresenter paramActionMenuPresenter)
  {
    this.c = paramActionMenuPresenter;
  }

  public final void a(n paramn)
  {
    this.a = paramn;
  }

  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  protected final boolean a(int paramInt)
  {
    View localView1 = getChildAt(paramInt - 1);
    View localView2 = getChildAt(paramInt);
    int j = getChildCount();
    boolean bool1 = false;
    if (paramInt < j)
    {
      boolean bool2 = localView1 instanceof h;
      bool1 = false;
      if (bool2)
        bool1 = false | ((h)localView1).e();
    }
    if ((paramInt > 0) && ((localView2 instanceof h)))
      return bool1 | ((h)localView2).d();
    return bool1;
  }

  public final boolean a(r paramr)
  {
    return this.a.a(paramr, 0);
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (paramLayoutParams != null) && ((paramLayoutParams instanceof ActionMenuView.LayoutParams));
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    this.c.d(false);
    if ((this.c != null) && (this.c.f()))
    {
      this.c.c();
      this.c.b();
    }
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.c.d();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!this.d)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int j = getChildCount();
    int k = (paramInt2 + paramInt4) / 2;
    int m = b();
    int n = 0;
    int i1 = paramInt3 - paramInt1 - getPaddingRight() - getPaddingLeft();
    int i2 = 0;
    int i3 = 0;
    label64: View localView3;
    ActionMenuView.LayoutParams localLayoutParams2;
    int i19;
    int i21;
    int i20;
    if (i3 < j)
    {
      localView3 = getChildAt(i3);
      if (localView3.getVisibility() == 8)
        break label518;
      localLayoutParams2 = (ActionMenuView.LayoutParams)localView3.getLayoutParams();
      if (localLayoutParams2.a)
      {
        int i22 = localView3.getMeasuredWidth();
        if (a(i3))
          i22 += m;
        int i23 = localView3.getMeasuredHeight();
        int i24 = getWidth() - getPaddingRight() - localLayoutParams2.rightMargin;
        int i25 = i24 - i22;
        int i26 = k - i23 / 2;
        localView3.layout(i25, i26, i24, i23 + i26);
        i19 = i1 - i22;
        i21 = 1;
        i20 = n;
      }
    }
    while (true)
    {
      i3++;
      i2 = i21;
      n = i20;
      i1 = i19;
      break label64;
      i19 = i1 - (localView3.getMeasuredWidth() + localLayoutParams2.leftMargin + localLayoutParams2.rightMargin);
      a(i3);
      i20 = n + 1;
      i21 = i2;
      continue;
      if ((j == 1) && (i2 == 0))
      {
        View localView2 = getChildAt(0);
        int i15 = localView2.getMeasuredWidth();
        int i16 = localView2.getMeasuredHeight();
        int i17 = (paramInt3 - paramInt1) / 2 - i15 / 2;
        int i18 = k - i16 / 2;
        localView2.layout(i17, i18, i15 + i17, i16 + i18);
        return;
      }
      int i4;
      label342: int i6;
      label361: int i7;
      int i8;
      int i9;
      label378: ActionMenuView.LayoutParams localLayoutParams1;
      int i11;
      int i12;
      if (i2 != 0)
      {
        i4 = 0;
        int i5 = n - i4;
        if (i5 <= 0)
          break label505;
        i6 = i1 / i5;
        i7 = Math.max(0, i6);
        i8 = getPaddingLeft();
        i9 = 0;
        if (i9 < j)
        {
          View localView1 = getChildAt(i9);
          localLayoutParams1 = (ActionMenuView.LayoutParams)localView1.getLayoutParams();
          if ((localView1.getVisibility() == 8) || (localLayoutParams1.a))
            break label511;
          i11 = i8 + localLayoutParams1.leftMargin;
          i12 = localView1.getMeasuredWidth();
          int i13 = localView1.getMeasuredHeight();
          int i14 = k - i13 / 2;
          localView1.layout(i11, i14, i11 + i12, i13 + i14);
        }
      }
      label505: label511: for (int i10 = i11 + (i7 + (i12 + localLayoutParams1.rightMargin)); ; i10 = i8)
      {
        i9++;
        i8 = i10;
        break label378;
        break;
        i4 = 1;
        break label342;
        i6 = 0;
        break label361;
      }
      label518: i19 = i1;
      i20 = n;
      i21 = i2;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool1 = this.d;
    boolean bool2;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824)
    {
      bool2 = true;
      this.d = bool2;
      if (bool1 != this.d)
        this.e = 0;
      int j = View.MeasureSpec.getMode(paramInt1);
      if ((this.d) && (this.a != null) && (j != this.e))
      {
        this.e = j;
        this.a.b(true);
      }
      if (!this.d)
        break label1339;
      n = View.MeasureSpec.getMode(paramInt2);
      i1 = View.MeasureSpec.getSize(paramInt1);
      i2 = View.MeasureSpec.getSize(paramInt2);
      i3 = getPaddingLeft() + getPaddingRight();
      i4 = getPaddingTop() + getPaddingBottom();
      if (n != 1073741824)
        break label189;
    }
    int i6;
    int i7;
    int i8;
    label189: for (int i5 = View.MeasureSpec.makeMeasureSpec(i2 - i4, 1073741824); ; i5 = View.MeasureSpec.makeMeasureSpec(Math.min(this.i, i2 - i4), -2147483648))
    {
      i6 = i1 - i3;
      i7 = i6 / this.f;
      i8 = i6 % this.f;
      if (i7 != 0)
        break label211;
      setMeasuredDimension(i6, 0);
      return;
      bool2 = false;
      break;
    }
    label211: int i9 = this.f + i8 / i7;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    long l1 = 0L;
    int i15 = getChildCount();
    int i16 = 0;
    int i41;
    boolean bool4;
    label373: int i42;
    label391: int i44;
    int i45;
    label429: int i46;
    label440: int i47;
    int i49;
    int i38;
    int i39;
    int i37;
    int i40;
    long l6;
    if (i16 < i15)
    {
      View localView4 = getChildAt(i16);
      if (localView4.getVisibility() == 8)
        break label1486;
      boolean bool3 = localView4 instanceof ActionMenuItemView;
      i41 = i13 + 1;
      if (bool3)
        localView4.setPadding(this.g, 0, this.g, 0);
      ActionMenuView.LayoutParams localLayoutParams6 = (ActionMenuView.LayoutParams)localView4.getLayoutParams();
      localLayoutParams6.f = false;
      localLayoutParams6.c = 0;
      localLayoutParams6.b = 0;
      localLayoutParams6.d = false;
      localLayoutParams6.leftMargin = 0;
      localLayoutParams6.rightMargin = 0;
      if ((bool3) && (((ActionMenuItemView)localView4).c()))
      {
        bool4 = true;
        localLayoutParams6.e = bool4;
        if (!localLayoutParams6.a)
          break label539;
        i42 = 1;
        int i43 = a(localView4, i9, i42, i5, i4);
        i44 = Math.max(i11, i43);
        if (!localLayoutParams6.d)
          break label1479;
        i45 = i12 + 1;
        if (!localLayoutParams6.a)
          break label1472;
        i46 = 1;
        i47 = i7 - i43;
        int i48 = localView4.getMeasuredHeight();
        i49 = Math.max(i10, i48);
        if (i43 != 1)
          break label1437;
        long l8 = l1 | 1 << i16;
        i38 = i49;
        i39 = i47;
        i37 = i41;
        i14 = i46;
        i40 = i44;
        i12 = i45;
        l6 = l8;
      }
    }
    while (true)
    {
      i16++;
      i11 = i40;
      i10 = i38;
      i7 = i39;
      l1 = l6;
      i13 = i37;
      break;
      bool4 = false;
      break label373;
      label539: i42 = i7;
      break label391;
      int i17;
      int i18;
      long l2;
      int i19;
      int i28;
      long l4;
      int i29;
      int i30;
      label595: ActionMenuView.LayoutParams localLayoutParams5;
      int i36;
      int i35;
      if ((i14 != 0) && (i13 == 2))
      {
        i17 = 1;
        i18 = 0;
        l2 = l1;
        i19 = i7;
        if ((i12 <= 0) || (i19 <= 0))
          break label885;
        i28 = 2147483647;
        l4 = 0L;
        i29 = 0;
        i30 = 0;
        if (i30 >= i15)
          break label704;
        localLayoutParams5 = (ActionMenuView.LayoutParams)getChildAt(i30).getLayoutParams();
        if (!localLayoutParams5.d)
          break label1426;
        if (localLayoutParams5.b >= i28)
          break label671;
        i36 = localLayoutParams5.b;
        l4 = 1 << i30;
        i35 = 1;
      }
      label1048: 
      while (true)
      {
        i30++;
        i28 = i36;
        i29 = i35;
        break label595;
        i17 = 0;
        break;
        label671: if (localLayoutParams5.b == i28)
        {
          l4 |= 1 << i30;
          i35 = i29 + 1;
          i36 = i28;
          continue;
          label704: l2 |= l4;
          int i32;
          int i33;
          long l5;
          label735: View localView3;
          ActionMenuView.LayoutParams localLayoutParams4;
          int i34;
          if (i29 <= i19)
          {
            int i31 = i28 + 1;
            i32 = 0;
            i33 = i19;
            l5 = l2;
            if (i32 < i15)
            {
              localView3 = getChildAt(i32);
              localLayoutParams4 = (ActionMenuView.LayoutParams)localView3.getLayoutParams();
              if ((l4 & 1 << i32) == 0L)
              {
                if (localLayoutParams4.b != i31)
                  break label1419;
                l5 |= 1 << i32;
                i34 = i33;
              }
            }
          }
          while (true)
          {
            i32++;
            i33 = i34;
            break label735;
            if ((i17 != 0) && (localLayoutParams4.e) && (i33 == 1))
              localView3.setPadding(i9 + this.g, 0, this.g, 0);
            localLayoutParams4.b = (1 + localLayoutParams4.b);
            localLayoutParams4.f = true;
            i34 = i33 - 1;
            continue;
            l2 = l5;
            i18 = 1;
            i19 = i33;
            break;
            label885: long l3 = l2;
            int i20;
            float f1;
            float f2;
            int i25;
            int i26;
            int i21;
            label1055: ActionMenuView.LayoutParams localLayoutParams3;
            int i27;
            if ((i14 == 0) && (i13 == 1))
            {
              i20 = 1;
              if ((i19 <= 0) || (l3 == 0L))
                break label1408;
              int i24 = i13 - 1;
              if ((i19 >= i24) && (i20 == 0) && (i11 <= 1))
                break label1408;
              f1 = Long.bitCount(l3);
              if (i20 != 0)
                break label1401;
              if (((1L & l3) != 0L) && (!((ActionMenuView.LayoutParams)getChildAt(0).getLayoutParams()).e))
                f1 -= 0.5F;
              if (((l3 & 1 << i15 - 1) == 0L) || (((ActionMenuView.LayoutParams)getChildAt(i15 - 1).getLayoutParams()).e))
                break label1401;
              f2 = f1 - 0.5F;
              if (f2 <= 0.0F)
                break label1156;
              i25 = (int)(i19 * i9 / f2);
              i26 = 0;
              i21 = i18;
              if (i26 >= i15)
                break label1238;
              if ((l3 & 1 << i26) == 0L)
                break label1231;
              View localView2 = getChildAt(i26);
              localLayoutParams3 = (ActionMenuView.LayoutParams)localView2.getLayoutParams();
              if (!(localView2 instanceof ActionMenuItemView))
                break label1162;
              localLayoutParams3.c = i25;
              localLayoutParams3.f = true;
              if ((i26 == 0) && (!localLayoutParams3.e))
                localLayoutParams3.leftMargin = (-i25 / 2);
              i27 = 1;
            }
            while (true)
            {
              i26++;
              i21 = i27;
              break label1055;
              i20 = 0;
              break;
              i25 = 0;
              break label1048;
              if (localLayoutParams3.a)
              {
                localLayoutParams3.c = i25;
                localLayoutParams3.f = true;
                localLayoutParams3.rightMargin = (-i25 / 2);
                i27 = 1;
              }
              else
              {
                if (i26 != 0)
                  localLayoutParams3.leftMargin = (i25 / 2);
                if (i26 != i15 - 1)
                  localLayoutParams3.rightMargin = (i25 / 2);
                label1231: i27 = i21;
              }
            }
            label1238: for (int i22 = 0; ; i22 = i19)
            {
              if (i21 != 0)
                for (int i23 = 0; i23 < i15; i23++)
                {
                  View localView1 = getChildAt(i23);
                  ActionMenuView.LayoutParams localLayoutParams2 = (ActionMenuView.LayoutParams)localView1.getLayoutParams();
                  if (localLayoutParams2.f)
                    localView1.measure(View.MeasureSpec.makeMeasureSpec(i9 * localLayoutParams2.b + localLayoutParams2.c, 1073741824), i5);
                }
              if (n != 1073741824);
              while (true)
              {
                setMeasuredDimension(i6, i10);
                this.h = (i22 * i9);
                return;
                int k = getChildCount();
                for (int m = 0; m < k; m++)
                {
                  ActionMenuView.LayoutParams localLayoutParams1 = (ActionMenuView.LayoutParams)getChildAt(m).getLayoutParams();
                  localLayoutParams1.rightMargin = 0;
                  localLayoutParams1.leftMargin = 0;
                }
                super.onMeasure(paramInt1, paramInt2);
                return;
                i10 = i2;
              }
              label1401: f2 = f1;
              break;
              i21 = i18;
            }
            label1339: i34 = i33;
          }
        }
        else
        {
          i35 = i29;
          i36 = i28;
        }
      }
      label1156: label1162: label1419: label1426: label1437: i12 = i45;
      label1408: i40 = i44;
      long l7 = l1;
      i38 = i49;
      i39 = i47;
      i14 = i46;
      i37 = i41;
      l6 = l7;
      continue;
      label1472: i46 = i14;
      break label440;
      label1479: i45 = i12;
      break label429;
      label1486: i37 = i13;
      l6 = l1;
      i38 = i10;
      i39 = i7;
      i40 = i11;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ActionMenuView
 * JD-Core Version:    0.6.2
 */