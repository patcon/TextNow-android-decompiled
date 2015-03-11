package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.av;
import android.support.v4.view.cd;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import textnow.g.l;
import textnow.k.h;

abstract class a extends ViewGroup
{
  private static final Interpolator i = new DecelerateInterpolator();
  protected final b a = new b(this);
  protected final Context b;
  protected ActionMenuView c;
  protected ActionMenuPresenter d;
  protected ViewGroup e;
  protected boolean f;
  protected int g;
  protected cd h;

  a(Context paramContext)
  {
    this(paramContext, null);
  }

  a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedValue localTypedValue = new TypedValue();
    if ((paramContext.getTheme().resolveAttribute(textnow.g.b.a, localTypedValue, true)) && (localTypedValue.resourceId != 0))
    {
      this.b = new ContextThemeWrapper(paramContext, localTypedValue.resourceId);
      return;
    }
    this.b = paramContext;
  }

  protected static int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean)
      return paramInt1 - paramInt2;
    return paramInt1 + paramInt2;
  }

  protected static int a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), paramInt2);
    return Math.max(0, 0 + (paramInt1 - paramView.getMeasuredWidth()));
  }

  protected static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int j = paramView.getMeasuredWidth();
    int k = paramView.getMeasuredHeight();
    int m = paramInt2 + (paramInt3 - k) / 2;
    if (paramBoolean)
      paramView.layout(paramInt1 - j, m, paramInt1, k + m);
    while (true)
    {
      if (paramBoolean)
        j = -j;
      return j;
      paramView.layout(paramInt1, m, paramInt1 + j, k + m);
    }
  }

  public void a(int paramInt)
  {
    this.g = paramInt;
    requestLayout();
  }

  public boolean a()
  {
    if (this.d != null)
      return this.d.d();
    return false;
  }

  public void b(int paramInt)
  {
    if (this.h != null)
      this.h.a();
    if (paramInt == 0)
    {
      if (getVisibility() != 0)
      {
        av.c(this, 0.0F);
        if ((this.e != null) && (this.c != null))
          av.c(this.c, 0.0F);
      }
      cd localcd3 = av.q(this).a(1.0F);
      localcd3.a(200L);
      localcd3.a(i);
      if ((this.e != null) && (this.c != null))
      {
        h localh2 = new h();
        cd localcd4 = av.q(this.c).a(1.0F);
        localcd4.a(200L);
        localh2.a(this.a.a(localcd3, paramInt));
        localh2.a(localcd3).a(localcd4);
        localh2.a();
        return;
      }
      localcd3.a(this.a.a(localcd3, paramInt));
      localcd3.b();
      return;
    }
    cd localcd1 = av.q(this).a(0.0F);
    localcd1.a(200L);
    localcd1.a(i);
    if ((this.e != null) && (this.c != null))
    {
      h localh1 = new h();
      cd localcd2 = av.q(this.c).a(0.0F);
      localcd2.a(200L);
      localh1.a(this.a.a(localcd1, paramInt));
      localh1.a(localcd1).a(localcd2);
      localh1.a();
      return;
    }
    localcd1.a(this.a.a(localcd1, paramInt));
    localcd1.b();
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8)
      super.onConfigurationChanged(paramConfiguration);
    TypedArray localTypedArray = getContext().obtainStyledAttributes(null, l.a, textnow.g.b.c, 0);
    a(localTypedArray.getLayoutDimension(l.l, 0));
    localTypedArray.recycle();
    if (this.d != null)
      this.d.c();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.a
 * JD-Core Version:    0.6.2
 */