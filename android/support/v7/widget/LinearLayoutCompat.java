package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.av;
import android.support.v4.view.m;
import android.support.v7.internal.widget.ao;
import android.support.v7.internal.widget.ar;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import textnow.g.l;

public class LinearLayoutCompat extends ViewGroup
{
  private boolean a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private float g;
  private boolean h;
  private int[] i;
  private int[] j;
  private Drawable k;
  private int l;
  private int m;
  private int n;
  private int o;

  public LinearLayoutCompat(Context paramContext)
  {
    this(paramContext, null);
  }

  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = bool1;
    this.b = -1;
    this.c = 0;
    this.e = 8388659;
    ao localao = ao.a(paramContext, paramAttributeSet, l.T, paramInt, 0);
    int i1 = localao.a(l.aa, -1);
    if ((i1 >= 0) && (this.d != i1))
    {
      this.d = i1;
      requestLayout();
    }
    int i2 = localao.a(l.Z, -1);
    if (i2 >= 0)
      b(i2);
    boolean bool2 = localao.a(l.X, bool1);
    if (!bool2)
      this.a = bool2;
    this.g = localao.a(l.ab, -1.0F);
    this.b = localao.a(l.Y, -1);
    this.h = localao.a(l.ae, false);
    Drawable localDrawable = localao.a(l.ac);
    if (localDrawable != this.k)
    {
      this.k = localDrawable;
      if (localDrawable == null)
        break label259;
      this.l = localDrawable.getIntrinsicWidth();
      this.m = localDrawable.getIntrinsicHeight();
      if (localDrawable != null)
        break label272;
    }
    while (true)
    {
      setWillNotDraw(bool1);
      requestLayout();
      this.n = localao.a(l.af, 0);
      this.o = localao.d(l.ad, 0);
      localao.b();
      return;
      label259: this.l = 0;
      this.m = 0;
      break;
      label272: bool1 = false;
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    for (int i2 = 0; i2 < paramInt1; i2++)
    {
      View localView = getChildAt(i2);
      if (localView.getVisibility() != 8)
      {
        LinearLayoutCompat.LayoutParams localLayoutParams = (LinearLayoutCompat.LayoutParams)localView.getLayoutParams();
        if (localLayoutParams.width == -1)
        {
          int i3 = localLayoutParams.height;
          localLayoutParams.height = localView.getMeasuredHeight();
          measureChildWithMargins(localView, i1, 0, paramInt2, 0);
          localLayoutParams.height = i3;
        }
      }
    }
  }

  private void a(Canvas paramCanvas, int paramInt)
  {
    this.k.setBounds(getPaddingLeft() + this.o, paramInt, getWidth() - getPaddingRight() - this.o, paramInt + this.m);
    this.k.draw(paramCanvas);
  }

  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  private boolean a(int paramInt)
  {
    if (paramInt == 0)
      if ((0x1 & this.n) == 0);
    do
    {
      return true;
      return false;
      if (paramInt != getChildCount())
        break;
    }
    while ((0x4 & this.n) != 0);
    return false;
    if ((0x2 & this.n) != 0)
      for (int i1 = paramInt - 1; ; i1--)
      {
        if (i1 < 0)
          break label74;
        if (getChildAt(i1).getVisibility() != 8)
          break;
      }
    return false;
    label74: return false;
  }

  private void b(int paramInt1, int paramInt2)
  {
    this.f = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 1;
    float f1 = 0.0F;
    int i6 = getChildCount();
    int i7 = View.MeasureSpec.getMode(paramInt1);
    int i8 = View.MeasureSpec.getMode(paramInt2);
    int i9 = 0;
    int i10 = 0;
    if ((this.i == null) || (this.j == null))
    {
      this.i = new int[4];
      this.j = new int[4];
    }
    int[] arrayOfInt1 = this.i;
    int[] arrayOfInt2 = this.j;
    arrayOfInt1[3] = -1;
    arrayOfInt1[2] = -1;
    arrayOfInt1[1] = -1;
    arrayOfInt1[0] = -1;
    arrayOfInt2[3] = -1;
    arrayOfInt2[2] = -1;
    arrayOfInt2[1] = -1;
    arrayOfInt2[0] = -1;
    boolean bool1 = this.a;
    boolean bool2 = this.h;
    if (i7 == 1073741824);
    int i12;
    int i13;
    View localView6;
    int i64;
    for (int i11 = 1; ; i11 = 0)
    {
      i12 = -2147483648;
      for (i13 = 0; ; i13 = i64 + 1)
      {
        if (i13 >= i6)
          break label900;
        localView6 = getChildAt(i13);
        if (localView6 != null)
          break;
        this.f = (0 + this.f);
        i64 = i13;
      }
    }
    LinearLayoutCompat.LayoutParams localLayoutParams4;
    float f7;
    label306: int i70;
    int i71;
    label335: int i60;
    int i72;
    label357: int i73;
    int i74;
    int i62;
    int i83;
    label428: int i76;
    int i77;
    label500: int i79;
    label519: float f6;
    int i57;
    int i59;
    int i56;
    int i61;
    int i58;
    int i55;
    if (localView6.getVisibility() != 8)
    {
      if (a(i13))
        this.f += this.l;
      localLayoutParams4 = (LinearLayoutCompat.LayoutParams)localView6.getLayoutParams();
      f7 = f1 + localLayoutParams4.g;
      if ((i7 == 1073741824) && (localLayoutParams4.width == 0) && (localLayoutParams4.g > 0.0F))
        if (i11 != 0)
        {
          this.f += localLayoutParams4.leftMargin + localLayoutParams4.rightMargin;
          if (!bool1)
            break label640;
          int i86 = View.MeasureSpec.makeMeasureSpec(0, 0);
          localView6.measure(i86, i86);
          i70 = i12;
          i71 = i10;
          if ((i8 == 1073741824) || (localLayoutParams4.height != -1))
            break label2320;
          i60 = 1;
          i72 = 1;
          i73 = localLayoutParams4.topMargin + localLayoutParams4.bottomMargin;
          i74 = i73 + localView6.getMeasuredHeight();
          int i75 = av.l(localView6);
          i62 = ar.a(i2, i75);
          if (bool1)
          {
            int i82 = localView6.getBaseline();
            if (i82 != -1)
            {
              if (localLayoutParams4.h >= 0)
                break label825;
              i83 = this.e;
              int i84 = (0xFFFFFFFE & (i83 & 0x70) >> 4) >> 1;
              arrayOfInt1[i84] = Math.max(arrayOfInt1[i84], i82);
              arrayOfInt2[i84] = Math.max(arrayOfInt2[i84], i74 - i82);
            }
          }
          i76 = Math.max(i1, i74);
          if ((i5 == 0) || (localLayoutParams4.height != -1))
            break label835;
          i77 = 1;
          if (localLayoutParams4.g <= 0.0F)
            break label848;
          if (i72 == 0)
            break label841;
          i79 = i73;
          int i80 = Math.max(i4, i79);
          f6 = f7;
          i57 = i77;
          i59 = i3;
          i56 = i71;
          i61 = i76;
          int i81 = i70;
          i58 = i80;
          i55 = i81;
        }
    }
    while (true)
    {
      int i63 = i13 + 0;
      i5 = i57;
      i4 = i58;
      i3 = i59;
      i2 = i62;
      i1 = i61;
      i12 = i55;
      i9 = i60;
      i64 = i63;
      f1 = f6;
      i10 = i56;
      break;
      int i85 = this.f;
      this.f = Math.max(i85, i85 + localLayoutParams4.leftMargin + localLayoutParams4.rightMargin);
      break label306;
      label640: i70 = i12;
      i71 = 1;
      break label335;
      int i65 = -2147483648;
      if ((localLayoutParams4.width == 0) && (localLayoutParams4.g > 0.0F))
      {
        i65 = 0;
        localLayoutParams4.width = -2;
      }
      int i66 = i65;
      int i67;
      label699: int i68;
      if (f7 == 0.0F)
      {
        i67 = this.f;
        a(localView6, paramInt1, i67, paramInt2, 0);
        if (i66 != -2147483648)
          localLayoutParams4.width = i66;
        i68 = localView6.getMeasuredWidth();
        if (i11 == 0)
          break label788;
        this.f += 0 + (i68 + localLayoutParams4.leftMargin + localLayoutParams4.rightMargin);
      }
      while (true)
        if (bool2)
        {
          i70 = Math.max(i68, i12);
          i71 = i10;
          break;
          i67 = 0;
          break label699;
          label788: int i69 = this.f;
          this.f = Math.max(i69, 0 + (i69 + i68 + localLayoutParams4.leftMargin + localLayoutParams4.rightMargin));
          continue;
          label825: i83 = localLayoutParams4.h;
          break label428;
          label835: i77 = 0;
          break label500;
          label841: i79 = i74;
          break label519;
          label848: if (i72 != 0);
          while (true)
          {
            int i78 = Math.max(i3, i73);
            f6 = f7;
            i57 = i77;
            i59 = i78;
            i56 = i71;
            i55 = i70;
            i58 = i4;
            i61 = i76;
            break;
            i73 = i74;
          }
          label900: if ((this.f > 0) && (a(i6)))
            this.f += this.l;
          int i14;
          if ((arrayOfInt1[1] != -1) || (arrayOfInt1[0] != -1) || (arrayOfInt1[2] != -1) || (arrayOfInt1[3] != -1))
            i14 = Math.max(arrayOfInt1[3], Math.max(arrayOfInt1[0], Math.max(arrayOfInt1[1], arrayOfInt1[2]))) + Math.max(arrayOfInt2[3], Math.max(arrayOfInt2[0], Math.max(arrayOfInt2[1], arrayOfInt2[2])));
          for (int i15 = Math.max(i1, i14); ; i15 = i1)
          {
            if ((bool2) && ((i7 == -2147483648) || (i7 == 0)))
            {
              this.f = 0;
              int i52 = 0;
              if (i52 < i6)
              {
                View localView5 = getChildAt(i52);
                int i54;
                if (localView5 == null)
                {
                  this.f = (0 + this.f);
                  i54 = i52;
                }
                while (true)
                {
                  i52 = i54 + 1;
                  break;
                  if (localView5.getVisibility() == 8)
                  {
                    i54 = i52 + 0;
                  }
                  else
                  {
                    LinearLayoutCompat.LayoutParams localLayoutParams3 = (LinearLayoutCompat.LayoutParams)localView5.getLayoutParams();
                    if (i11 != 0)
                    {
                      this.f += 0 + (i12 + localLayoutParams3.leftMargin + localLayoutParams3.rightMargin);
                      i54 = i52;
                    }
                    else
                    {
                      int i53 = this.f;
                      this.f = Math.max(i53, 0 + (i53 + i12 + localLayoutParams3.leftMargin + localLayoutParams3.rightMargin));
                      i54 = i52;
                    }
                  }
                }
              }
            }
            this.f += getPaddingLeft() + getPaddingRight();
            int i16 = av.a(Math.max(this.f, getSuggestedMinimumWidth()), paramInt1, 0);
            int i17 = (0xFFFFFF & i16) - this.f;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            View localView2;
            LinearLayoutCompat.LayoutParams localLayoutParams2;
            int i47;
            View localView3;
            label1489: int i35;
            float f4;
            int i34;
            label1527: int i37;
            label1560: label1579: int i39;
            int i41;
            label1620: int i43;
            label1646: int i45;
            label1678: float f2;
            int i30;
            int i32;
            int i31;
            int i33;
            int i29;
            if ((i10 != 0) || ((i17 != 0) && (f1 > 0.0F)))
            {
              if (this.g > 0.0F)
                f1 = this.g;
              arrayOfInt1[3] = -1;
              arrayOfInt1[2] = -1;
              arrayOfInt1[1] = -1;
              arrayOfInt1[0] = -1;
              arrayOfInt2[3] = -1;
              arrayOfInt2[2] = -1;
              arrayOfInt2[1] = -1;
              arrayOfInt2[0] = -1;
              this.f = 0;
              i18 = 0;
              i19 = i5;
              i20 = i3;
              i21 = -1;
              i22 = i2;
              if (i18 < i6)
              {
                localView2 = getChildAt(i18);
                if ((localView2 == null) || (localView2.getVisibility() == 8))
                  break label2287;
                localLayoutParams2 = (LinearLayoutCompat.LayoutParams)localView2.getLayoutParams();
                float f3 = localLayoutParams2.g;
                if (f3 <= 0.0F)
                  break label2272;
                i47 = (int)(f3 * i17 / f1);
                float f5 = f1 - f3;
                int i48 = i17 - i47;
                int i49 = getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom() + localLayoutParams2.topMargin + localLayoutParams2.bottomMargin, localLayoutParams2.height);
                if ((localLayoutParams2.width != 0) || (i7 != 1073741824))
                {
                  i47 += localView2.getMeasuredWidth();
                  if (i47 < 0)
                    i47 = 0;
                  localView3 = localView2;
                  localView3.measure(View.MeasureSpec.makeMeasureSpec(i47, 1073741824), i49);
                  i35 = ar.a(i22, 0xFF000000 & av.l(localView2));
                  f4 = f5;
                  i34 = i48;
                  if (i11 == 0)
                    break label1801;
                  this.f += 0 + (localView2.getMeasuredWidth() + localLayoutParams2.leftMargin + localLayoutParams2.rightMargin);
                  if ((i8 == 1073741824) || (localLayoutParams2.height != -1))
                    break label1841;
                  i37 = 1;
                  int i38 = localLayoutParams2.topMargin + localLayoutParams2.bottomMargin;
                  i39 = i38 + localView2.getMeasuredHeight();
                  int i40 = Math.max(i21, i39);
                  if (i37 == 0)
                    break label1847;
                  i41 = i38;
                  int i42 = Math.max(i20, i41);
                  if ((i19 == 0) || (localLayoutParams2.height != -1))
                    break label1854;
                  i43 = 1;
                  if (bool1)
                  {
                    int i44 = localView2.getBaseline();
                    if (i44 != -1)
                    {
                      if (localLayoutParams2.h >= 0)
                        break label1860;
                      i45 = this.e;
                      int i46 = (0xFFFFFFFE & (i45 & 0x70) >> 4) >> 1;
                      arrayOfInt1[i46] = Math.max(arrayOfInt1[i46], i44);
                      arrayOfInt2[i46] = Math.max(arrayOfInt2[i46], i39 - i44);
                    }
                  }
                  f2 = f4;
                  i30 = i42;
                  i32 = i35;
                  i31 = i43;
                  i33 = i40;
                  i29 = i34;
                }
              }
            }
            while (true)
            {
              i18++;
              i19 = i31;
              i20 = i30;
              i21 = i33;
              i22 = i32;
              f1 = f2;
              i17 = i29;
              break;
              if (i47 > 0)
              {
                localView3 = localView2;
                break label1489;
              }
              localView3 = localView2;
              i47 = 0;
              break label1489;
              label1801: int i36 = this.f;
              this.f = Math.max(i36, 0 + (i36 + localView2.getMeasuredWidth() + localLayoutParams2.leftMargin + localLayoutParams2.rightMargin));
              break label1560;
              label1841: i37 = 0;
              break label1579;
              label1847: i41 = i39;
              break label1620;
              label1854: i43 = 0;
              break label1646;
              label1860: i45 = localLayoutParams2.h;
              break label1678;
              this.f += getPaddingLeft() + getPaddingRight();
              if ((arrayOfInt1[1] != -1) || (arrayOfInt1[0] != -1) || (arrayOfInt1[2] != -1) || (arrayOfInt1[3] != -1))
                i21 = Math.max(i21, Math.max(arrayOfInt1[3], Math.max(arrayOfInt1[0], Math.max(arrayOfInt1[1], arrayOfInt1[2]))) + Math.max(arrayOfInt2[3], Math.max(arrayOfInt2[0], Math.max(arrayOfInt2[1], arrayOfInt2[2]))));
              int i23 = i20;
              i2 = i22;
              int i24 = i21;
              i5 = i19;
              while (true)
              {
                if ((i5 == 0) && (i8 != 1073741824));
                int i50;
                while (true)
                {
                  int i25 = Math.max(i23 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
                  setMeasuredDimension(i16 | 0xFF000000 & i2, av.a(i25, paramInt2, i2 << 16));
                  if (i9 != 0)
                  {
                    int i26 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    int i27 = 0;
                    while (i27 < i6)
                    {
                      View localView1 = getChildAt(i27);
                      if (localView1.getVisibility() != 8)
                      {
                        LinearLayoutCompat.LayoutParams localLayoutParams1 = (LinearLayoutCompat.LayoutParams)localView1.getLayoutParams();
                        if (localLayoutParams1.height == -1)
                        {
                          int i28 = localLayoutParams1.width;
                          localLayoutParams1.width = localView1.getMeasuredWidth();
                          measureChildWithMargins(localView1, paramInt1, 0, i26, 0);
                          localLayoutParams1.width = i28;
                        }
                      }
                      i27++;
                      continue;
                      i50 = Math.max(i3, i4);
                      if ((!bool2) || (i7 == 1073741824))
                        break label2261;
                      for (int i51 = 0; i51 < i6; i51++)
                      {
                        View localView4 = getChildAt(i51);
                        if ((localView4 != null) && (localView4.getVisibility() != 8) && (((LinearLayoutCompat.LayoutParams)localView4.getLayoutParams()).g > 0.0F))
                          localView4.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(localView4.getMeasuredHeight(), 1073741824));
                      }
                    }
                  }
                  return;
                  i23 = i24;
                }
                label2261: i23 = i50;
                i24 = i15;
              }
              label2272: i34 = i17;
              i35 = i22;
              f4 = f1;
              break label1527;
              label2287: f2 = f1;
              i29 = i17;
              i30 = i20;
              i31 = i19;
              i32 = i22;
              i33 = i21;
            }
          }
          label2320: i60 = i9;
          i72 = 0;
          break label357;
        }
      i70 = i12;
      i71 = i10;
      break label335;
      i55 = i12;
      i56 = i10;
      f6 = f1;
      i57 = i5;
      i58 = i4;
      i59 = i3;
      i60 = i9;
      i61 = i1;
      i62 = i2;
    }
  }

  private void b(Canvas paramCanvas, int paramInt)
  {
    this.k.setBounds(paramInt, getPaddingTop() + this.o, paramInt + this.l, getHeight() - getPaddingBottom() - this.o);
    this.k.draw(paramCanvas);
  }

  private static void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.layout(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
  }

  public LinearLayoutCompat.LayoutParams a(AttributeSet paramAttributeSet)
  {
    return new LinearLayoutCompat.LayoutParams(getContext(), paramAttributeSet);
  }

  protected LinearLayoutCompat.LayoutParams b(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new LinearLayoutCompat.LayoutParams(paramLayoutParams);
  }

  public final void b(int paramInt)
  {
    if (this.e != paramInt)
      if ((0x800007 & paramInt) != 0)
        break label44;
    label44: for (int i1 = 0x800003 | paramInt; ; i1 = paramInt)
    {
      if ((i1 & 0x70) == 0)
        i1 |= 48;
      this.e = i1;
      requestLayout();
      return;
    }
  }

  public final void c(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LinearLayoutCompat.LayoutParams;
  }

  public int getBaseline()
  {
    int i1 = -1;
    if (this.b < 0)
      i1 = super.getBaseline();
    View localView;
    int i2;
    do
    {
      return i1;
      if (getChildCount() <= this.b)
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
      localView = getChildAt(this.b);
      i2 = localView.getBaseline();
      if (i2 != i1)
        break;
    }
    while (this.b == 0);
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    int i3 = this.c;
    int i5;
    if (this.d == 1)
    {
      i5 = 0x70 & this.e;
      if (i5 == 48);
    }
    int i4;
    switch (i5)
    {
    default:
      i4 = i3;
    case 80:
    case 16:
    }
    while (true)
    {
      return i2 + (i4 + ((LinearLayoutCompat.LayoutParams)localView.getLayoutParams()).topMargin);
      i4 = getBottom() - getTop() - getPaddingBottom() - this.f;
      continue;
      i4 = i3 + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.f) / 2;
    }
  }

  protected LinearLayoutCompat.LayoutParams j()
  {
    if (this.d == 0)
      return new LinearLayoutCompat.LayoutParams(-2, -2);
    if (this.d == 1)
      return new LinearLayoutCompat.LayoutParams(-1, -2);
    return null;
  }

  public final int k()
  {
    return this.l;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.k == null);
    int i1;
    boolean bool;
    label266: 
    do
    {
      int i5;
      do
      {
        return;
        if (this.d != 1)
          break;
        i5 = getChildCount();
        for (int i6 = 0; i6 < i5; i6++)
        {
          View localView4 = getChildAt(i6);
          if ((localView4 != null) && (localView4.getVisibility() != 8) && (a(i6)))
          {
            LinearLayoutCompat.LayoutParams localLayoutParams4 = (LinearLayoutCompat.LayoutParams)localView4.getLayoutParams();
            a(paramCanvas, localView4.getTop() - localLayoutParams4.topMargin - this.m);
          }
        }
      }
      while (!a(i5));
      View localView3 = getChildAt(i5 - 1);
      if (localView3 == null);
      LinearLayoutCompat.LayoutParams localLayoutParams3;
      for (int i7 = getHeight() - getPaddingBottom() - this.m; ; i7 = localView3.getBottom() + localLayoutParams3.bottomMargin)
      {
        a(paramCanvas, i7);
        return;
        localLayoutParams3 = (LinearLayoutCompat.LayoutParams)localView3.getLayoutParams();
      }
      i1 = getChildCount();
      bool = ar.a(this);
      int i2 = 0;
      if (i2 < i1)
      {
        View localView2 = getChildAt(i2);
        LinearLayoutCompat.LayoutParams localLayoutParams2;
        if ((localView2 != null) && (localView2.getVisibility() != 8) && (a(i2)))
        {
          localLayoutParams2 = (LinearLayoutCompat.LayoutParams)localView2.getLayoutParams();
          if (!bool)
            break label266;
        }
        for (int i4 = localView2.getRight() + localLayoutParams2.rightMargin; ; i4 = localView2.getLeft() - localLayoutParams2.leftMargin - this.l)
        {
          b(paramCanvas, i4);
          i2++;
          break;
        }
      }
    }
    while (!a(i1));
    View localView1 = getChildAt(i1 - 1);
    int i3;
    if (localView1 == null)
      if (bool)
        i3 = getPaddingLeft();
    while (true)
    {
      b(paramCanvas, i3);
      return;
      i3 = getWidth() - getPaddingRight() - this.l;
      continue;
      LinearLayoutCompat.LayoutParams localLayoutParams1 = (LinearLayoutCompat.LayoutParams)localView1.getLayoutParams();
      if (bool)
        i3 = localView1.getLeft() - localLayoutParams1.leftMargin - this.l;
      else
        i3 = localView1.getRight() + localLayoutParams1.rightMargin;
    }
  }

  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }
  }

  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i23;
    int i25;
    int i26;
    int i29;
    int i30;
    int i31;
    int i32;
    label109: View localView2;
    int i33;
    if (this.d == 1)
    {
      i23 = getPaddingLeft();
      int i24 = paramInt3 - paramInt1;
      i25 = i24 - getPaddingRight();
      i26 = i24 - i23 - getPaddingRight();
      int i27 = getChildCount();
      int i28 = 0x70 & this.e;
      i29 = 0x800007 & this.e;
      switch (i28)
      {
      default:
        i30 = getPaddingTop();
        i31 = 0;
        i32 = i30;
        if (i31 < i27)
        {
          localView2 = getChildAt(i31);
          if (localView2 == null)
          {
            i32 += 0;
            i33 = i31;
          }
        }
        break;
      case 80:
      case 16:
      }
    }
    while (true)
    {
      i31 = i33 + 1;
      break label109;
      i30 = paramInt4 + getPaddingTop() - paramInt2 - this.f;
      break;
      i30 = getPaddingTop() + (paramInt4 - paramInt2 - this.f) / 2;
      break;
      if (localView2.getVisibility() != 8)
      {
        int i34 = localView2.getMeasuredWidth();
        int i35 = localView2.getMeasuredHeight();
        LinearLayoutCompat.LayoutParams localLayoutParams2 = (LinearLayoutCompat.LayoutParams)localView2.getLayoutParams();
        int i36 = localLayoutParams2.h;
        if (i36 < 0)
          i36 = i29;
        int i37;
        switch (0x7 & m.a(i36, av.h(this)))
        {
        default:
          i37 = i23 + localLayoutParams2.leftMargin;
        case 1:
        case 5:
        }
        while (true)
        {
          if (a(i31))
            i32 += this.m;
          int i38 = i32 + localLayoutParams2.topMargin;
          b(localView2, i37, i38 + 0, i34, i35);
          i32 = i38 + (0 + (i35 + localLayoutParams2.bottomMargin));
          i33 = i31 + 0;
          break;
          i37 = i23 + (i26 - i34) / 2 + localLayoutParams2.leftMargin - localLayoutParams2.rightMargin;
          continue;
          i37 = i25 - i34 - localLayoutParams2.rightMargin;
        }
        boolean bool1 = ar.a(this);
        int i1 = getPaddingTop();
        int i2 = paramInt4 - paramInt2;
        int i3 = i2 - getPaddingBottom();
        int i4 = i2 - i1 - getPaddingBottom();
        int i5 = getChildCount();
        int i6 = 0x800007 & this.e;
        int i7 = 0x70 & this.e;
        boolean bool2 = this.a;
        int[] arrayOfInt1 = this.i;
        int[] arrayOfInt2 = this.j;
        int i8;
        int i10;
        int i9;
        switch (m.a(i6, av.h(this)))
        {
        default:
          i8 = getPaddingLeft();
          if (bool1)
          {
            i10 = i5 - 1;
            i9 = -1;
          }
          break;
        case 5:
        case 1:
        }
        while (true)
        {
          int i11 = 0;
          label531: int i12;
          View localView1;
          int i13;
          if (i11 < i5)
          {
            i12 = i10 + i9 * i11;
            localView1 = getChildAt(i12);
            if (localView1 == null)
            {
              i8 += 0;
              i13 = i11;
            }
          }
          while (true)
          {
            i11 = i13 + 1;
            break label531;
            i8 = paramInt3 + getPaddingLeft() - paramInt1 - this.f;
            break;
            i8 = getPaddingLeft() + (paramInt3 - paramInt1 - this.f) / 2;
            break;
            if (localView1.getVisibility() != 8)
            {
              int i14 = localView1.getMeasuredWidth();
              int i15 = localView1.getMeasuredHeight();
              int i16 = -1;
              LinearLayoutCompat.LayoutParams localLayoutParams1 = (LinearLayoutCompat.LayoutParams)localView1.getLayoutParams();
              if ((bool2) && (localLayoutParams1.height != -1))
                i16 = localView1.getBaseline();
              int i17 = localLayoutParams1.h;
              if (i17 < 0)
                i17 = i7;
              int i19;
              switch (i17 & 0x70)
              {
              default:
                i19 = i1;
              case 48:
              case 16:
              case 80:
              }
              while (true)
              {
                label736: if (a(i12));
                int i18;
                for (int i20 = i8 + this.l; ; i20 = i8)
                {
                  int i21 = i20 + localLayoutParams1.leftMargin;
                  b(localView1, i21 + 0, i19, i14, i15);
                  i8 = i21 + (0 + (i14 + localLayoutParams1.rightMargin));
                  i13 = i11 + 0;
                  break;
                  i18 = i1 + localLayoutParams1.topMargin;
                  if (i16 == -1)
                    break label913;
                  i19 = i18 + (arrayOfInt1[1] - i16);
                  break label736;
                  i19 = i1 + (i4 - i15) / 2 + localLayoutParams1.topMargin - localLayoutParams1.bottomMargin;
                  break label736;
                  i18 = i3 - i15 - localLayoutParams1.bottomMargin;
                  if (i16 == -1)
                    break label913;
                  int i22 = localView1.getMeasuredHeight() - i16;
                  i19 = i18 - (arrayOfInt2[2] - i22);
                  break label736;
                  return;
                }
                label913: i19 = i18;
              }
            }
            i13 = i11;
          }
          i9 = 1;
          i10 = 0;
        }
      }
      i33 = i31;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    float f1;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    boolean bool;
    int i12;
    int i13;
    int i52;
    float f6;
    int i58;
    int i59;
    label229: int i48;
    int i60;
    label443: int i61;
    int i62;
    int i63;
    int i50;
    int i65;
    label507: int i67;
    label526: float f5;
    int i45;
    int i47;
    int i44;
    int i49;
    int i46;
    int i43;
    if (this.d == 1)
    {
      this.f = 0;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      i4 = 0;
      i5 = 1;
      f1 = 0.0F;
      i6 = getChildCount();
      i7 = View.MeasureSpec.getMode(paramInt1);
      i8 = View.MeasureSpec.getMode(paramInt2);
      i9 = 0;
      i10 = 0;
      int i11 = this.b;
      bool = this.h;
      i12 = -2147483648;
      i13 = 0;
      while (true)
        if (i13 < i6)
        {
          View localView5 = getChildAt(i13);
          if (localView5 == null)
          {
            this.f = (0 + this.f);
            i52 = i13;
            i13 = i52 + 1;
          }
          else
          {
            if (localView5.getVisibility() == 8)
              break label1609;
            if (a(i13))
              this.f += this.m;
            LinearLayoutCompat.LayoutParams localLayoutParams3 = (LinearLayoutCompat.LayoutParams)localView5.getLayoutParams();
            f6 = f1 + localLayoutParams3.g;
            if ((i8 == 1073741824) && (localLayoutParams3.height == 0) && (localLayoutParams3.g > 0.0F))
            {
              int i70 = this.f;
              this.f = Math.max(i70, i70 + localLayoutParams3.topMargin + localLayoutParams3.bottomMargin);
              i58 = i12;
              i59 = 1;
              if ((i11 >= 0) && (i11 == i13 + 1))
                this.c = this.f;
              if ((i13 < i11) && (localLayoutParams3.g > 0.0F))
                throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
            }
            else
            {
              int i53 = -2147483648;
              if ((localLayoutParams3.height == 0) && (localLayoutParams3.g > 0.0F))
              {
                i53 = 0;
                localLayoutParams3.height = -2;
              }
              int i54 = i53;
              if (f6 == 0.0F);
              for (int i55 = this.f; ; i55 = 0)
              {
                a(localView5, paramInt1, 0, paramInt2, i55);
                if (i54 != -2147483648)
                  localLayoutParams3.height = i54;
                int i56 = localView5.getMeasuredHeight();
                int i57 = this.f;
                this.f = Math.max(i57, 0 + (i57 + i56 + localLayoutParams3.topMargin + localLayoutParams3.bottomMargin));
                if (!bool)
                  break label1598;
                i58 = Math.max(i56, i12);
                i59 = i10;
                break;
              }
            }
            if ((i7 == 1073741824) || (localLayoutParams3.width != -1))
              break label1588;
            i48 = 1;
            i60 = 1;
            i61 = localLayoutParams3.leftMargin + localLayoutParams3.rightMargin;
            i62 = i61 + localView5.getMeasuredWidth();
            i63 = Math.max(i1, i62);
            int i64 = av.l(localView5);
            i50 = ar.a(i2, i64);
            if ((i5 != 0) && (localLayoutParams3.width == -1))
            {
              i65 = 1;
              if (localLayoutParams3.g <= 0.0F)
                break label628;
              if (i60 == 0)
                break label621;
              i67 = i61;
              int i68 = Math.max(i4, i67);
              f5 = f6;
              i45 = i65;
              i47 = i3;
              i44 = i59;
              i49 = i63;
              int i69 = i58;
              i46 = i68;
              i43 = i69;
            }
          }
        }
    }
    while (true)
    {
      int i51 = i13 + 0;
      i5 = i45;
      i4 = i46;
      i3 = i47;
      i2 = i50;
      i1 = i49;
      i12 = i43;
      i9 = i48;
      i52 = i51;
      f1 = f5;
      i10 = i44;
      break;
      i65 = 0;
      break label507;
      label621: i67 = i62;
      break label526;
      label628: if (i60 != 0);
      while (true)
      {
        int i66 = Math.max(i3, i61);
        f5 = f6;
        i45 = i65;
        i47 = i66;
        i44 = i59;
        i43 = i58;
        i46 = i4;
        i49 = i63;
        break;
        i61 = i62;
      }
      if ((this.f > 0) && (a(i6)))
        this.f += this.m;
      if ((bool) && ((i8 == -2147483648) || (i8 == 0)))
      {
        this.f = 0;
        int i40 = 0;
        if (i40 < i6)
        {
          View localView4 = getChildAt(i40);
          int i42;
          if (localView4 == null)
          {
            this.f = (0 + this.f);
            i42 = i40;
          }
          while (true)
          {
            i40 = i42 + 1;
            break;
            if (localView4.getVisibility() == 8)
            {
              i42 = i40 + 0;
            }
            else
            {
              LinearLayoutCompat.LayoutParams localLayoutParams2 = (LinearLayoutCompat.LayoutParams)localView4.getLayoutParams();
              int i41 = this.f;
              this.f = Math.max(i41, 0 + (i41 + i12 + localLayoutParams2.topMargin + localLayoutParams2.bottomMargin));
              i42 = i40;
            }
          }
        }
      }
      this.f += getPaddingTop() + getPaddingBottom();
      int i14 = av.a(Math.max(this.f, getSuggestedMinimumHeight()), paramInt2, 0);
      int i15 = (0xFFFFFF & i14) - this.f;
      int i16;
      int i17;
      int i18;
      int i19;
      int i20;
      View localView1;
      int i34;
      View localView2;
      label1094: int i26;
      int i27;
      float f2;
      label1136: int i28;
      int i29;
      int i31;
      label1187: label1192: int i23;
      label1218: int i24;
      int i25;
      if ((i10 != 0) || ((i15 != 0) && (f1 > 0.0F)))
      {
        if (this.g > 0.0F)
          f1 = this.g;
        this.f = 0;
        i16 = 0;
        i17 = i5;
        i18 = i3;
        i19 = i2;
        i20 = i1;
        if (i16 < i6)
        {
          localView1 = getChildAt(i16);
          if (localView1.getVisibility() == 8)
            break label1561;
          LinearLayoutCompat.LayoutParams localLayoutParams1 = (LinearLayoutCompat.LayoutParams)localView1.getLayoutParams();
          float f3 = localLayoutParams1.g;
          if (f3 <= 0.0F)
            break label1546;
          i34 = (int)(f3 * i15 / f1);
          float f4 = f1 - f3;
          int i35 = i15 - i34;
          int i36 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localLayoutParams1.leftMargin + localLayoutParams1.rightMargin, localLayoutParams1.width);
          if ((localLayoutParams1.height != 0) || (i8 != 1073741824))
          {
            i34 += localView1.getMeasuredHeight();
            if (i34 < 0)
              i34 = 0;
            localView2 = localView1;
            localView2.measure(i36, View.MeasureSpec.makeMeasureSpec(i34, 1073741824));
            int i37 = ar.a(i19, 0xFFFFFF00 & av.l(localView1));
            i26 = i35;
            i27 = i37;
            f2 = f4;
            i28 = localLayoutParams1.leftMargin + localLayoutParams1.rightMargin;
            i29 = i28 + localView1.getMeasuredWidth();
            int i30 = Math.max(i20, i29);
            if ((i7 == 1073741824) || (localLayoutParams1.width != -1))
              break label1315;
            i31 = 1;
            if (i31 == 0)
              break label1321;
            int i32 = Math.max(i18, i28);
            if ((i17 == 0) || (localLayoutParams1.width != -1))
              break label1328;
            i23 = 1;
            int i33 = this.f;
            this.f = Math.max(i33, 0 + (i33 + localView1.getMeasuredHeight() + localLayoutParams1.topMargin + localLayoutParams1.bottomMargin));
            i24 = i32;
            i25 = i30;
          }
        }
      }
      while (true)
      {
        i16++;
        i17 = i23;
        i18 = i24;
        i19 = i27;
        i20 = i25;
        i15 = i26;
        f1 = f2;
        break;
        if (i34 > 0)
        {
          localView2 = localView1;
          break label1094;
        }
        localView2 = localView1;
        i34 = 0;
        break label1094;
        label1315: i31 = 0;
        break label1187;
        label1321: i28 = i29;
        break label1192;
        label1328: i23 = 0;
        break label1218;
        this.f += getPaddingTop() + getPaddingBottom();
        int i21 = i18;
        i2 = i19;
        int i22 = i20;
        i5 = i17;
        while (true)
        {
          if ((i5 == 0) && (i7 != 1073741824));
          int i38;
          while (true)
          {
            setMeasuredDimension(av.a(Math.max(i21 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), paramInt1, i2), i14);
            if (i9 != 0)
              a(i6, paramInt2);
            return;
            i38 = Math.max(i3, i4);
            if ((!bool) || (i8 == 1073741824))
              break;
            for (int i39 = 0; i39 < i6; i39++)
            {
              View localView3 = getChildAt(i39);
              if ((localView3 != null) && (localView3.getVisibility() != 8) && (((LinearLayoutCompat.LayoutParams)localView3.getLayoutParams()).g > 0.0F))
                localView3.measure(View.MeasureSpec.makeMeasureSpec(localView3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
            }
            b(paramInt1, paramInt2);
            return;
            i21 = i22;
          }
          i21 = i38;
          i22 = i1;
        }
        label1546: f2 = f1;
        i26 = i15;
        i27 = i19;
        break label1136;
        label1561: f2 = f1;
        i23 = i17;
        i24 = i18;
        i25 = i20;
        i26 = i15;
        i27 = i19;
      }
      label1588: i48 = i9;
      i60 = 0;
      break label443;
      label1598: i58 = i12;
      i59 = i10;
      break label229;
      label1609: i43 = i12;
      i44 = i10;
      f5 = f1;
      i45 = i5;
      i46 = i4;
      i47 = i3;
      i48 = i9;
      i49 = i1;
      i50 = i2;
    }
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.LinearLayoutCompat
 * JD-Core Version:    0.6.2
 */