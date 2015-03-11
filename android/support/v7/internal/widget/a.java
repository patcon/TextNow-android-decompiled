package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import textnow.g.b;
import textnow.g.c;
import textnow.g.d;
import textnow.g.k;

abstract class a extends ViewGroup
{
  protected ActionMenuView a;
  protected ActionMenuPresenter b;
  protected ActionBarContainer c;
  protected boolean d;
  protected boolean e;
  protected int f;

  a(Context paramContext)
  {
    super(paramContext);
  }

  a(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected static int a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), paramInt2);
    return Math.max(0, 0 + (paramInt1 - paramView.getMeasuredWidth()));
  }

  protected static int b(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    int k = paramInt2 + (paramInt3 - j) / 2;
    paramView.layout(paramInt1, k, paramInt1 + i, j + k);
    return i;
  }

  protected static int c(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    int k = paramInt2 + (paramInt3 - j) / 2;
    paramView.layout(paramInt1 - i, k, paramInt1, j + k);
    return i;
  }

  public int a()
  {
    return getVisibility();
  }

  public void a(int paramInt)
  {
    this.f = paramInt;
    requestLayout();
  }

  public void a(ActionBarContainer paramActionBarContainer)
  {
    this.c = paramActionBarContainer;
  }

  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public void b(int paramInt)
  {
    clearAnimation();
    Context localContext;
    if (paramInt != getVisibility())
    {
      localContext = getContext();
      if (paramInt != 0)
        break label75;
    }
    label75: for (int i = b.a; ; i = b.b)
    {
      Animation localAnimation = AnimationUtils.loadAnimation(localContext, i);
      startAnimation(localAnimation);
      setVisibility(paramInt);
      if ((this.c != null) && (this.a != null))
      {
        this.a.startAnimation(localAnimation);
        this.a.setVisibility(paramInt);
      }
      return;
    }
  }

  public void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  public boolean b()
  {
    if (this.b != null)
      return this.b.b();
    return false;
  }

  public void c()
  {
    post(new Runnable()
    {
      public final void run()
      {
        a.this.b();
      }
    });
  }

  public boolean d()
  {
    if (this.b != null)
      return this.b.c();
    return false;
  }

  public boolean e()
  {
    if (this.b != null)
      return this.b.f();
    return false;
  }

  public boolean f()
  {
    return (this.b != null) && (this.b.g());
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    TypedArray localTypedArray = getContext().obtainStyledAttributes(null, k.a, c.b, 0);
    a(localTypedArray.getLayoutDimension(1, 0));
    localTypedArray.recycle();
    if (this.e)
      a(getContext().getResources().getBoolean(d.e));
    if (this.b != null)
      this.b.a();
  }

  public void setVisibility(int paramInt)
  {
    if (paramInt != getVisibility())
      super.setVisibility(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.a
 * JD-Core Version:    0.6.2
 */