package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.j;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import textnow.g.e;
import textnow.g.i;
import textnow.g.l;

public class ActivityChooserView extends ViewGroup
{
  j a;
  private final m b;
  private final n c;
  private final LinearLayoutCompat d;
  private final Drawable e;
  private final FrameLayout f;
  private final ImageView g;
  private final FrameLayout h;
  private final ImageView i;
  private final int j;
  private final DataSetObserver k = new DataSetObserver()
  {
    public final void onChanged()
    {
      super.onChanged();
      ActivityChooserView.a(ActivityChooserView.this).notifyDataSetChanged();
    }

    public final void onInvalidated()
    {
      super.onInvalidated();
      ActivityChooserView.a(ActivityChooserView.this).notifyDataSetInvalidated();
    }
  };
  private final ViewTreeObserver.OnGlobalLayoutListener l = new ViewTreeObserver.OnGlobalLayoutListener()
  {
    public final void onGlobalLayout()
    {
      if (ActivityChooserView.this.b())
      {
        if (ActivityChooserView.this.isShown())
          break label31;
        ActivityChooserView.b(ActivityChooserView.this).a();
      }
      label31: 
      do
      {
        return;
        ActivityChooserView.b(ActivityChooserView.this).c();
      }
      while (ActivityChooserView.this.a == null);
      ActivityChooserView.this.a.a(true);
    }
  };
  private ListPopupWindow m;
  private PopupWindow.OnDismissListener n;
  private boolean o;
  private int p = 4;
  private boolean q;
  private int r;

  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, l.F, paramInt, 0);
    this.p = localTypedArray.getInt(l.H, 4);
    Drawable localDrawable = localTypedArray.getDrawable(l.G);
    localTypedArray.recycle();
    LayoutInflater.from(getContext()).inflate(i.e, this, true);
    this.c = new n(this, (byte)0);
    this.d = ((LinearLayoutCompat)findViewById(textnow.g.g.j));
    this.e = this.d.getBackground();
    this.h = ((FrameLayout)findViewById(textnow.g.g.l));
    this.h.setOnClickListener(this.c);
    this.h.setOnLongClickListener(this.c);
    this.i = ((ImageView)this.h.findViewById(textnow.g.g.p));
    this.f = ((FrameLayout)findViewById(textnow.g.g.n));
    this.f.setOnClickListener(this.c);
    this.g = ((ImageView)this.f.findViewById(textnow.g.g.p));
    this.g.setImageDrawable(localDrawable);
    this.b = new m(this, (byte)0);
    this.b.registerDataSetObserver(new DataSetObserver()
    {
      public final void onChanged()
      {
        super.onChanged();
        ActivityChooserView.c(ActivityChooserView.this);
      }
    });
    Resources localResources = paramContext.getResources();
    this.j = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(e.c));
  }

  private ListPopupWindow c()
  {
    if (this.m == null)
    {
      this.m = new ListPopupWindow(getContext());
      this.m.a(this.b);
      this.m.a(this);
      this.m.a(true);
      this.m.a(this.c);
      this.m.a(this.c);
    }
    return this.m;
  }

  public final boolean a()
  {
    if (c().b())
    {
      c().a();
      ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
      if (localViewTreeObserver.isAlive())
        localViewTreeObserver.removeGlobalOnLayoutListener(this.l);
    }
    return true;
  }

  public final boolean b()
  {
    return c().b();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    g localg = this.b.e();
    if (localg != null)
      localg.registerObserver(this.k);
    this.q = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    g localg = this.b.e();
    if (localg != null)
      localg.unregisterObserver(this.k);
    ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
    if (localViewTreeObserver.isAlive())
      localViewTreeObserver.removeGlobalOnLayoutListener(this.l);
    if (c().b())
      a();
    this.q = false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.d.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
    if (!c().b())
      a();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    LinearLayoutCompat localLinearLayoutCompat = this.d;
    if (this.h.getVisibility() != 0)
      paramInt2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 1073741824);
    measureChild(localLinearLayoutCompat, paramInt1, paramInt2);
    setMeasuredDimension(localLinearLayoutCompat.getMeasuredWidth(), localLinearLayoutCompat.getMeasuredHeight());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActivityChooserView
 * JD-Core Version:    0.6.2
 */