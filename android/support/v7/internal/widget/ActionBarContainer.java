package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import textnow.g.f;
import textnow.g.k;

public class ActionBarContainer extends FrameLayout
{
  private boolean a;
  private View b;
  private ActionBarView c;
  private Drawable d;
  private Drawable e;
  private Drawable f;
  private boolean g;
  private boolean h;

  public ActionBarContainer(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBackgroundDrawable(null);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.a);
    this.d = localTypedArray.getDrawable(10);
    this.e = localTypedArray.getDrawable(11);
    if (getId() == f.D)
    {
      this.g = bool;
      this.f = localTypedArray.getDrawable(12);
    }
    localTypedArray.recycle();
    if (this.g)
      if (this.f != null);
    while (true)
    {
      setWillNotDraw(bool);
      return;
      bool = false;
      continue;
      if ((this.d != null) || (this.e != null))
        bool = false;
    }
  }

  public final void a(ScrollingTabContainerView paramScrollingTabContainerView)
  {
    if (this.b != null)
      removeView(this.b);
    this.b = paramScrollingTabContainerView;
    if (paramScrollingTabContainerView != null)
    {
      addView(paramScrollingTabContainerView);
      ViewGroup.LayoutParams localLayoutParams = paramScrollingTabContainerView.getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = -2;
      paramScrollingTabContainerView.a(false);
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.d != null) && (this.d.isStateful()))
      this.d.setState(getDrawableState());
    if ((this.e != null) && (this.e.isStateful()))
      this.e.setState(getDrawableState());
    if ((this.f != null) && (this.f.isStateful()))
      this.f.setState(getDrawableState());
  }

  public void onDraw(Canvas paramCanvas)
  {
    if ((getWidth() == 0) || (getHeight() == 0));
    do
    {
      do
      {
        return;
        if (!this.g)
          break;
      }
      while (this.f == null);
      this.f.draw(paramCanvas);
      return;
      if (this.d != null)
        this.d.draw(paramCanvas);
    }
    while ((this.e == null) || (!this.h));
    this.e.draw(paramCanvas);
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((ActionBarView)findViewById(f.a));
  }

  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.a) || (super.onInterceptTouchEvent(paramMotionEvent));
  }

  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = true;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i;
    if ((this.b != null) && (this.b.getVisibility() != 8))
      i = bool1;
    int j;
    int k;
    while ((this.b != null) && (this.b.getVisibility() != 8))
    {
      j = getMeasuredHeight();
      k = this.b.getMeasuredHeight();
      if ((0x2 & this.c.n()) != 0)
        break label199;
      int m = getChildCount();
      int n = 0;
      while (true)
        if (n < m)
        {
          View localView = getChildAt(n);
          if ((localView != this.b) && (!this.c.o()))
            localView.offsetTopAndBottom(k);
          n++;
          continue;
          i = 0;
          break;
        }
      this.b.layout(paramInt1, 0, paramInt3, k);
    }
    if (this.g)
    {
      if (this.f == null)
        break label353;
      this.f.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
    while (true)
    {
      if (bool1)
        invalidate();
      return;
      label199: this.b.layout(paramInt1, j - k, paramInt3, j);
      break;
      if (this.d != null)
        this.d.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
      for (boolean bool2 = bool1; ; bool2 = false)
      {
        boolean bool3 = false;
        if (i != 0)
        {
          Drawable localDrawable = this.e;
          bool3 = false;
          if (localDrawable != null)
            bool3 = bool1;
        }
        this.h = bool3;
        if (bool3)
        {
          this.e.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
          break;
        }
        bool1 = bool2;
        break;
      }
      label353: bool1 = false;
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.c == null);
    while (true)
    {
      return;
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.c.getLayoutParams();
      if (this.c.o());
      for (int i = 0; (this.b != null) && (this.b.getVisibility() != 8) && (View.MeasureSpec.getMode(paramInt2) == -2147483648); i = this.c.getMeasuredHeight() + localLayoutParams.topMargin + localLayoutParams.bottomMargin)
      {
        int j = View.MeasureSpec.getSize(paramInt2);
        setMeasuredDimension(getMeasuredWidth(), Math.min(i + this.b.getMeasuredHeight(), j));
        return;
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      if (this.d != null)
        this.d.setVisible(bool, false);
      if (this.e != null)
        this.e.setVisible(bool, false);
      if (this.f != null)
        this.f.setVisible(bool, false);
      return;
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return ((paramDrawable == this.d) && (!this.g)) || ((paramDrawable == this.e) && (this.h)) || ((paramDrawable == this.f) && (this.g)) || (super.verifyDrawable(paramDrawable));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarContainer
 * JD-Core Version:    0.6.2
 */