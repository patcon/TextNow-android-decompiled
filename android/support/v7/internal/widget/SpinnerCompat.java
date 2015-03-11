package android.support.v7.internal.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.av;
import android.support.v4.view.m;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.aa;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.SpinnerAdapter;
import textnow.g.l;

final class SpinnerCompat extends AbsSpinnerCompat
  implements DialogInterface.OnClickListener
{
  int D;
  private aa E;
  private aj F;
  private ah G;
  private int H;
  private boolean I;
  private Rect J = new Rect();
  private final al K;

  SpinnerCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, null, paramInt, -1);
  }

  private SpinnerCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    ao localao = ao.a(paramContext, paramAttributeSet, l.bg, paramInt1, 0);
    setBackgroundDrawable(localao.a(l.bh));
    switch (localao.a(l.bn, 0))
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      this.H = localao.a(l.bj, 17);
      this.F.a(localao.c(l.bm));
      this.I = localao.a(l.bl, false);
      localao.b();
      if (this.G != null)
      {
        this.F.a(this.G);
        this.G = null;
      }
      this.K = localao.c();
      return;
      this.F = new ag(this, (byte)0);
      continue;
      final ai localai = new ai(this, paramContext, paramAttributeSet, paramInt1);
      this.D = localao.e(l.bi, -2);
      localai.a(localao.a(l.bk));
      this.F = localai;
      this.E = new aa(this)
      {
        public final ListPopupWindow a()
        {
          return localai;
        }

        public final boolean b()
        {
          if (!SpinnerCompat.a(SpinnerCompat.this).b())
            SpinnerCompat.a(SpinnerCompat.this).c();
          return true;
        }
      };
    }
  }

  private View a(int paramInt, boolean paramBoolean)
  {
    if (!this.t)
    {
      View localView2 = this.i.a(paramInt);
      if (localView2 != null)
      {
        a(localView2, paramBoolean);
        return localView2;
      }
    }
    View localView1 = this.a.getView(paramInt, null, this);
    a(localView1, paramBoolean);
    return localView1;
  }

  private void a(View paramView, boolean paramBoolean)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
      localLayoutParams = generateDefaultLayoutParams();
    if (paramBoolean)
      addViewInLayout(paramView, 0, localLayoutParams);
    paramView.setSelected(hasFocus());
    if (this.I)
      paramView.setEnabled(isEnabled());
    int i = ViewGroup.getChildMeasureSpec(this.b, this.h.top + this.h.bottom, localLayoutParams.height);
    paramView.measure(ViewGroup.getChildMeasureSpec(this.c, this.h.left + this.h.right, localLayoutParams.width), i);
    int j = this.h.top + (getMeasuredHeight() - this.h.bottom - this.h.top - paramView.getMeasuredHeight()) / 2;
    int k = j + paramView.getMeasuredHeight();
    paramView.layout(0, j, 0 + paramView.getMeasuredWidth(), k);
  }

  public final void a(q paramq)
  {
    throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
  }

  public final void a(SpinnerAdapter paramSpinnerAdapter)
  {
    super.a(paramSpinnerAdapter);
    this.i.a();
    if ((getContext().getApplicationInfo().targetSdkVersion >= 21) && (paramSpinnerAdapter != null) && (paramSpinnerAdapter.getViewTypeCount() != 1))
      throw new IllegalArgumentException("Spinner adapter view type count must be 1");
    if (this.F != null)
    {
      this.F.a(new ah(paramSpinnerAdapter));
      return;
    }
    this.G = new ah(paramSpinnerAdapter);
  }

  final void b(q paramq)
  {
    super.a(paramq);
  }

  public final int getBaseline()
  {
    int i = -1;
    View localView;
    if (getChildCount() > 0)
      localView = getChildAt(0);
    while (true)
    {
      if (localView != null)
      {
        int k = localView.getBaseline();
        if (k >= 0)
          i = k + localView.getTop();
      }
      return i;
      SpinnerAdapter localSpinnerAdapter = this.a;
      localView = null;
      if (localSpinnerAdapter != null)
      {
        int j = this.a.getCount();
        localView = null;
        if (j > 0)
        {
          localView = a(0, false);
          this.i.a(0, localView);
        }
      }
    }
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    a(paramInt);
    paramDialogInterface.dismiss();
  }

  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.F != null) && (this.F.b()))
      this.F.a();
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.q = true;
    int i = this.h.left;
    int j = getRight() - getLeft() - this.h.left - this.h.right;
    if (this.t)
      f();
    if (this.y == 0)
    {
      a();
      this.q = false;
      return;
    }
    if (this.u >= 0)
      b(this.u);
    int k = getChildCount();
    c localc = this.i;
    int m = this.j;
    for (int n = 0; n < k; n++)
    {
      View localView2 = getChildAt(n);
      localc.a(m + n, localView2);
    }
    removeAllViewsInLayout();
    this.j = this.w;
    View localView1;
    int i1;
    if (this.a != null)
    {
      localView1 = a(this.w, true);
      i1 = localView1.getMeasuredWidth();
      int i2 = av.h(this);
      switch (0x7 & m.a(this.H, i2))
      {
      default:
      case 1:
      case 5:
      }
    }
    while (true)
    {
      localView1.offsetLeftAndRight(i);
      this.i.a();
      invalidate();
      g();
      this.t = false;
      this.o = false;
      c(this.w);
      break;
      i = i + j / 2 - i1 / 2;
      continue;
      i = i + j - i1;
    }
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    SpinnerAdapter localSpinnerAdapter;
    Drawable localDrawable;
    int j;
    if ((this.F != null) && (View.MeasureSpec.getMode(paramInt1) == -2147483648))
    {
      int i = getMeasuredWidth();
      localSpinnerAdapter = this.a;
      localDrawable = getBackground();
      j = 0;
      if (localSpinnerAdapter == null)
        setMeasuredDimension(Math.min(Math.max(i, j), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
    }
    else
    {
      return;
    }
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int n = Math.max(0, this.u);
    int i1 = Math.min(localSpinnerAdapter.getCount(), n + 15);
    int i2 = Math.max(0, n - (15 - (i1 - n)));
    View localView1 = null;
    int i3 = 0;
    int i4 = 0;
    label137: int i5;
    if (i2 < i1)
    {
      i5 = localSpinnerAdapter.getItemViewType(i2);
      if (i5 == i4)
        break label279;
    }
    for (View localView2 = null; ; localView2 = localView1)
    {
      localView1 = localSpinnerAdapter.getView(i2, localView2, this);
      if (localView1.getLayoutParams() == null)
        localView1.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      localView1.measure(k, m);
      i3 = Math.max(i3, localView1.getMeasuredWidth());
      i2++;
      i4 = i5;
      break label137;
      if (localDrawable != null)
      {
        localDrawable.getPadding(this.J);
        j = i3 + (this.J.left + this.J.right);
        break;
      }
      j = i3;
      break;
      label279: i5 = i4;
    }
  }

  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    SpinnerCompat.SavedState localSavedState = (SpinnerCompat.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.c)
    {
      ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
      if (localViewTreeObserver != null)
        localViewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
        {
          public final void onGlobalLayout()
          {
            if (!SpinnerCompat.a(SpinnerCompat.this).b())
              SpinnerCompat.a(SpinnerCompat.this).c();
            ViewTreeObserver localViewTreeObserver = SpinnerCompat.this.getViewTreeObserver();
            if (localViewTreeObserver != null)
              localViewTreeObserver.removeGlobalOnLayoutListener(this);
          }
        });
    }
  }

  public final Parcelable onSaveInstanceState()
  {
    SpinnerCompat.SavedState localSavedState = new SpinnerCompat.SavedState(super.onSaveInstanceState());
    if ((this.F != null) && (this.F.b()));
    for (boolean bool = true; ; bool = false)
    {
      localSavedState.c = bool;
      return localSavedState;
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.E != null) && (this.E.onTouch(this, paramMotionEvent)))
      return true;
    return super.onTouchEvent(paramMotionEvent);
  }

  public final boolean performClick()
  {
    boolean bool = super.performClick();
    if (!bool)
    {
      bool = true;
      if (!this.F.b())
        this.F.c();
    }
    return bool;
  }

  public final void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    if (this.I)
    {
      int i = getChildCount();
      for (int j = 0; j < i; j++)
        getChildAt(j).setEnabled(paramBoolean);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.SpinnerCompat
 * JD-Core Version:    0.6.2
 */