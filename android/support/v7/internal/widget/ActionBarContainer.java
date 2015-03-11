package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import textnow.g.g;
import textnow.g.l;
import textnow.h.a;

public class ActionBarContainer extends FrameLayout
{
  Drawable a;
  Drawable b;
  Drawable c;
  boolean d;
  boolean e;
  private boolean f;
  private View g;
  private View h;
  private View i;
  private int j;

  public ActionBarContainer(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject;
    boolean bool;
    if (a.a())
    {
      localObject = new e(this);
      setBackgroundDrawable((Drawable)localObject);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, l.a);
      this.a = localTypedArray.getDrawable(l.d);
      this.b = localTypedArray.getDrawable(l.f);
      this.j = localTypedArray.getDimensionPixelSize(l.l, -1);
      if (getId() == g.A)
      {
        this.d = true;
        this.c = localTypedArray.getDrawable(l.e);
      }
      localTypedArray.recycle();
      if (!this.d)
        break label147;
      if (this.c != null)
        break label141;
      bool = true;
    }
    while (true)
    {
      setWillNotDraw(bool);
      return;
      localObject = new d(this);
      break;
      label141: bool = false;
      continue;
      label147: if ((this.a == null) && (this.b == null))
        bool = true;
      else
        bool = false;
    }
  }

  private static boolean a(View paramView)
  {
    return (paramView == null) || (paramView.getVisibility() == 8) || (paramView.getMeasuredHeight() == 0);
  }

  private static int b(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    return paramView.getMeasuredHeight() + localLayoutParams.topMargin + localLayoutParams.bottomMargin;
  }

  public final View a()
  {
    return this.g;
  }

  public final void a(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.a != null)
    {
      this.a.setCallback(null);
      unscheduleDrawable(this.a);
    }
    this.a = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (this.h != null)
        this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
    }
    if (this.d)
      if (this.c != null);
    while (true)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.a != null) || (this.b != null))
        bool = false;
    }
  }

  public final void a(ac paramac)
  {
    if (this.g != null)
      removeView(this.g);
    this.g = paramac;
    if (paramac != null)
    {
      addView(paramac);
      ViewGroup.LayoutParams localLayoutParams = paramac.getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = -2;
      paramac.a(false);
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
    if (paramBoolean);
    for (int k = 393216; ; k = 262144)
    {
      setDescendantFocusability(k);
      return;
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.a != null) && (this.a.isStateful()))
      this.a.setState(getDrawableState());
    if ((this.b != null) && (this.b.isStateful()))
      this.b.setState(getDrawableState());
    if ((this.c != null) && (this.c.isStateful()))
      this.c.setState(getDrawableState());
  }

  public void jumpDrawablesToCurrentState()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      super.jumpDrawablesToCurrentState();
      if (this.a != null)
        this.a.jumpToCurrentState();
      if (this.b != null)
        this.b.jumpToCurrentState();
      if (this.c != null)
        this.c.jumpToCurrentState();
    }
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.h = findViewById(g.a);
    this.i = findViewById(g.f);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.f) || (super.onInterceptTouchEvent(paramMotionEvent));
  }

  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = true;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = this.g;
    boolean bool2;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      bool2 = bool1;
      if ((localView != null) && (localView.getVisibility() != 8))
      {
        int k = getMeasuredHeight();
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        localView.layout(paramInt1, k - localView.getMeasuredHeight() - localLayoutParams.bottomMargin, paramInt3, k - localLayoutParams.bottomMargin);
      }
      if (!this.d)
        break label147;
      if (this.c == null)
        break label333;
      this.c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
    while (true)
    {
      if (bool1)
        invalidate();
      return;
      bool2 = false;
      break;
      label147: if (this.a != null)
        if (this.h.getVisibility() == 0)
          this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
      label199: for (boolean bool3 = bool1; ; bool3 = false)
      {
        this.e = bool2;
        if ((bool2) && (this.b != null))
        {
          this.b.setBounds(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          break;
          if ((this.i != null) && (this.i.getVisibility() == 0))
          {
            this.a.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
            break label199;
          }
          this.a.setBounds(0, 0, 0, 0);
          break label199;
        }
        bool1 = bool3;
        break;
      }
      label333: bool1 = false;
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.h == null) && (View.MeasureSpec.getMode(paramInt2) == -2147483648) && (this.j >= 0))
      paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.j, View.MeasureSpec.getSize(paramInt2)), -2147483648);
    super.onMeasure(paramInt1, paramInt2);
    if (this.h == null);
    int k;
    do
    {
      return;
      k = View.MeasureSpec.getMode(paramInt2);
    }
    while ((this.g == null) || (this.g.getVisibility() == 8) || (k == 1073741824));
    int m;
    if (!a(this.h))
    {
      m = b(this.h);
      if (k != -2147483648)
        break label168;
    }
    label168: for (int n = View.MeasureSpec.getSize(paramInt2); ; n = 2147483647)
    {
      setMeasuredDimension(getMeasuredWidth(), Math.min(m + b(this.g), n));
      return;
      if (!a(this.i))
      {
        m = b(this.i);
        break;
      }
      m = 0;
      break;
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
      if (this.a != null)
        this.a.setVisible(bool, false);
      if (this.b != null)
        this.b.setVisible(bool, false);
      if (this.c != null)
        this.c.setVisible(bool, false);
      return;
    }
  }

  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return ((paramDrawable == this.a) && (!this.d)) || ((paramDrawable == this.b) && (this.e)) || ((paramDrawable == this.c) && (this.d)) || (super.verifyDrawable(paramDrawable));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarContainer
 * JD-Core Version:    0.6.2
 */