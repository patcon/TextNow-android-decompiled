package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.av;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.SpinnerAdapter;

abstract class AbsSpinnerCompat extends o<SpinnerAdapter>
{
  private DataSetObserver D;
  SpinnerAdapter a;
  int b;
  int c;
  int d = 0;
  int e = 0;
  int f = 0;
  int g = 0;
  final Rect h = new Rect();
  final c i = new c(this);

  AbsSpinnerCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setFocusable(true);
    setWillNotDraw(false);
  }

  final void a()
  {
    this.t = false;
    this.o = false;
    removeAllViewsInLayout();
    this.A = -1;
    this.B = -9223372036854775808L;
    b(-1);
    c(-1);
    invalidate();
  }

  public final void a(int paramInt)
  {
    c(paramInt);
    requestLayout();
    invalidate();
  }

  public void a(SpinnerAdapter paramSpinnerAdapter)
  {
    int j = -1;
    if (this.a != null)
    {
      this.a.unregisterDataSetObserver(this.D);
      a();
    }
    this.a = paramSpinnerAdapter;
    this.A = j;
    this.B = -9223372036854775808L;
    if (this.a != null)
    {
      this.z = this.y;
      this.y = this.a.getCount();
      e();
      this.D = new p(this);
      this.a.registerDataSetObserver(this.D);
      if (this.y > 0)
        j = 0;
      b(j);
      c(j);
      if (this.y == 0)
        g();
    }
    while (true)
    {
      requestLayout();
      return;
      e();
      a();
      g();
    }
  }

  public final View b()
  {
    if ((this.y > 0) && (this.w >= 0))
      return getChildAt(this.w - this.j);
    return null;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.LayoutParams(-1, -2);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j = View.MeasureSpec.getMode(paramInt1);
    int k = getPaddingLeft();
    int m = getPaddingTop();
    int n = getPaddingRight();
    int i1 = getPaddingBottom();
    Rect localRect1 = this.h;
    int i2;
    label70: int i3;
    label96: int i4;
    label122: int i8;
    int i7;
    int i6;
    if (k > this.d)
    {
      localRect1.left = k;
      Rect localRect2 = this.h;
      if (m <= this.e)
        break label410;
      i2 = m;
      localRect2.top = i2;
      Rect localRect3 = this.h;
      if (n <= this.f)
        break label419;
      i3 = n;
      localRect3.right = i3;
      Rect localRect4 = this.h;
      if (i1 <= this.g)
        break label428;
      i4 = i1;
      localRect4.bottom = i4;
      if (this.t)
        f();
      int i5 = this.u;
      if ((i5 < 0) || (this.a == null) || (i5 >= this.a.getCount()))
        break label437;
      View localView = this.i.a(i5);
      if (localView == null)
        localView = this.a.getView(i5, null, this);
      if (localView == null)
        break label437;
      this.i.a(i5, localView);
      if (localView.getLayoutParams() == null)
      {
        this.C = true;
        localView.setLayoutParams(generateDefaultLayoutParams());
        this.C = false;
      }
      measureChild(localView, paramInt1, paramInt2);
      i8 = localView.getMeasuredHeight() + this.h.top + this.h.bottom;
      i7 = localView.getMeasuredWidth() + this.h.left + this.h.right;
      i6 = 0;
    }
    while (true)
    {
      if (i6 != 0)
      {
        i8 = this.h.top + this.h.bottom;
        if (j == 0)
          i7 = this.h.left + this.h.right;
      }
      int i9 = Math.max(i8, getSuggestedMinimumHeight());
      int i10 = Math.max(i7, getSuggestedMinimumWidth());
      int i11 = av.a(i9, paramInt2, 0);
      setMeasuredDimension(av.a(i10, paramInt1, 0), i11);
      this.b = paramInt2;
      this.c = paramInt1;
      return;
      k = this.d;
      break;
      label410: i2 = this.e;
      break label70;
      label419: i3 = this.f;
      break label96;
      label428: i4 = this.g;
      break label122;
      label437: i6 = 1;
      i7 = 0;
      i8 = 0;
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AbsSpinnerCompat.SavedState localSavedState = (AbsSpinnerCompat.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.a >= 0L)
    {
      this.t = true;
      this.o = true;
      this.m = localSavedState.a;
      this.l = localSavedState.b;
      this.p = 0;
      requestLayout();
    }
  }

  public Parcelable onSaveInstanceState()
  {
    AbsSpinnerCompat.SavedState localSavedState = new AbsSpinnerCompat.SavedState(super.onSaveInstanceState());
    localSavedState.a = this.v;
    if (localSavedState.a >= 0L)
    {
      localSavedState.b = this.u;
      return localSavedState;
    }
    localSavedState.b = -1;
    return localSavedState;
  }

  public void requestLayout()
  {
    if (!this.C)
      super.requestLayout();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.AbsSpinnerCompat
 * JD-Core Version:    0.6.2
 */