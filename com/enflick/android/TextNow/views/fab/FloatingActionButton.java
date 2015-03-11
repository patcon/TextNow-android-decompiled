package com.enflick.android.TextNow.views.fab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.ImageButton;
import textnow.av.a;

public class FloatingActionButton extends ImageButton
{
  private boolean a;
  private int b;
  private int c;
  private int d;
  private boolean e;
  private int f;
  private int g;
  private int h;
  private boolean i;
  private final Interpolator j = new AccelerateDecelerateInterpolator();

  public FloatingActionButton(Context paramContext)
  {
    this(paramContext, null);
  }

  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public FloatingActionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private Drawable a(int paramInt)
  {
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new OvalShape());
    localShapeDrawable.getPaint().setColor(paramInt);
    if ((this.e) && (!c()))
    {
      Resources localResources = getResources();
      if (this.f == 0);
      for (int k = 2130838034; ; k = 2130838035)
      {
        LayerDrawable localLayerDrawable = new LayerDrawable(new Drawable[] { localResources.getDrawable(k), localShapeDrawable });
        localLayerDrawable.setLayerInset(1, this.g, this.g, this.g, this.g);
        return localLayerDrawable;
      }
    }
    return localShapeDrawable;
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this.a = true;
    this.b = b(2131230878);
    this.c = b(2131230879);
    this.d = b(17170443);
    this.f = 0;
    this.e = true;
    this.h = getResources().getDimensionPixelOffset(2131165279);
    this.g = c(2131165278);
    TypedArray localTypedArray;
    if (paramAttributeSet != null)
    {
      localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, com.enflick.android.TextNow.b.l, 0, 0);
      if (localTypedArray == null);
    }
    StateListDrawable localStateListDrawable;
    while (true)
    {
      try
      {
        this.b = localTypedArray.getColor(1, b(2131230878));
        this.c = localTypedArray.getColor(0, b(2131230879));
        this.d = localTypedArray.getColor(2, b(17170443));
        this.e = localTypedArray.getBoolean(3, true);
        this.f = localTypedArray.getInt(4, 0);
        localTypedArray.recycle();
        localStateListDrawable = new StateListDrawable();
        localStateListDrawable.addState(new int[] { 16842919 }, a(this.c));
        localStateListDrawable.addState(new int[0], a(this.b));
        if (!c())
          break;
        boolean bool = this.e;
        f1 = 0.0F;
        if (bool)
        {
          if (getElevation() > 0.0F)
            f1 = getElevation();
        }
        else
        {
          setElevation(f1);
          int[][] arrayOfInt = { new int[0] };
          int[] arrayOfInt1 = new int[1];
          arrayOfInt1[0] = this.d;
          RippleDrawable localRippleDrawable = new RippleDrawable(new ColorStateList(arrayOfInt, arrayOfInt1), localStateListDrawable, null);
          setOutlineProvider(new ViewOutlineProvider()
          {
            public final void getOutline(View paramAnonymousView, Outline paramAnonymousOutline)
            {
              FloatingActionButton localFloatingActionButton = FloatingActionButton.this;
              if (FloatingActionButton.a(FloatingActionButton.this) == 0);
              for (int i = 2131165276; ; i = 2131165277)
              {
                int j = FloatingActionButton.a(localFloatingActionButton, i);
                paramAnonymousOutline.setOval(0, 0, j, j);
                return;
              }
            }
          });
          setClipToOutline(true);
          setBackground(localRippleDrawable);
          return;
        }
      }
      finally
      {
        localTypedArray.recycle();
      }
      float f1 = c(2131165280);
    }
    if (Build.VERSION.SDK_INT >= 16);
    for (int k = 1; k != 0; k = 0)
    {
      setBackground(localStateListDrawable);
      return;
    }
    setBackgroundDrawable(localStateListDrawable);
  }

  private void a(final boolean paramBoolean1, final boolean paramBoolean2, boolean paramBoolean3)
  {
    int k;
    if ((this.a != paramBoolean1) || (paramBoolean3))
    {
      this.a = paramBoolean1;
      k = getHeight();
      if ((k != 0) || (paramBoolean3))
        break label62;
      ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
      if (!localViewTreeObserver.isAlive())
        break label62;
      localViewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        public final boolean onPreDraw()
        {
          ViewTreeObserver localViewTreeObserver = FloatingActionButton.this.getViewTreeObserver();
          if (localViewTreeObserver.isAlive())
            localViewTreeObserver.removeOnPreDrawListener(this);
          FloatingActionButton.a(FloatingActionButton.this, paramBoolean1, paramBoolean2, true);
          return true;
        }
      });
    }
    label62: int n;
    label97: int i2;
    do
    {
      return;
      if (!paramBoolean1)
        break;
      n = 0;
      if (!paramBoolean2)
        break label160;
      textnow.av.b.a(this).a(this.j).a(200L).b(n);
      int i1 = Build.VERSION.SDK_INT;
      i2 = 0;
      if (i1 >= 11)
        i2 = 1;
    }
    while (i2 != 0);
    setClickable(paramBoolean1);
    return;
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams));
    for (int m = ((ViewGroup.MarginLayoutParams)localLayoutParams).bottomMargin; ; m = 0)
    {
      n = m + k;
      break;
      label160: a.c(this, n);
      break label97;
    }
  }

  private int b(int paramInt)
  {
    return getResources().getColor(paramInt);
  }

  private int c(int paramInt)
  {
    return getResources().getDimensionPixelSize(paramInt);
  }

  private static boolean c()
  {
    return Build.VERSION.SDK_INT >= 21;
  }

  public final void a()
  {
    a(true, true, false);
  }

  public final void a(AbsListView paramAbsListView)
  {
    b localb = new b(this, (byte)0);
    b.a(localb, null);
    localb.a(paramAbsListView);
    localb.a(this.h);
    paramAbsListView.setOnScrollListener(localb);
  }

  public final void b()
  {
    a(false, true, false);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.f == 0);
    for (int k = 2131165276; ; k = 2131165277)
    {
      int m = c(k);
      if ((this.e) && (!c()))
      {
        int n = m + 2 * this.g;
        if ((!this.i) && ((getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
        {
          ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)getLayoutParams();
          localMarginLayoutParams.setMargins(localMarginLayoutParams.leftMargin - this.g, localMarginLayoutParams.topMargin - this.g, localMarginLayoutParams.rightMargin - this.g, localMarginLayoutParams.bottomMargin - this.g);
          requestLayout();
          this.i = true;
        }
        m = n;
      }
      setMeasuredDimension(m, m);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.fab.FloatingActionButton
 * JD-Core Version:    0.6.2
 */