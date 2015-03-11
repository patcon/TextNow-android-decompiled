package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
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
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import textnow.g.e;
import textnow.g.f;
import textnow.g.h;

public class ActivityChooserView extends ViewGroup
{
  android.support.v4.view.j a;
  private final j b;
  private final k c;
  private final LinearLayout d;
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
        ActivityChooserView.b(ActivityChooserView.this).d();
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
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, textnow.g.k.g, paramInt, 0);
    this.p = localTypedArray.getInt(0, 4);
    Drawable localDrawable = localTypedArray.getDrawable(1);
    localTypedArray.recycle();
    LayoutInflater.from(getContext()).inflate(h.i, this, true);
    this.c = new k(this, (byte)0);
    this.d = ((LinearLayout)findViewById(f.k));
    this.e = this.d.getBackground();
    this.h = ((FrameLayout)findViewById(f.l));
    this.h.setOnClickListener(this.c);
    this.h.setOnLongClickListener(this.c);
    this.i = ((ImageView)this.h.findViewById(f.q));
    this.f = ((FrameLayout)findViewById(f.n));
    this.f.setOnClickListener(this.c);
    this.g = ((ImageView)this.f.findViewById(f.q));
    this.g.setImageDrawable(localDrawable);
    this.b = new j(this, (byte)0);
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
    if (c().f())
    {
      c().d();
      ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
      if (localViewTreeObserver.isAlive())
        localViewTreeObserver.removeGlobalOnLayoutListener(this.l);
    }
    return true;
  }

  public final boolean b()
  {
    return c().f();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    d locald = this.b.e();
    if (locald != null)
      locald.registerObserver(this.k);
    this.q = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    d locald = this.b.e();
    if (locald != null)
      locald.unregisterObserver(this.k);
    ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
    if (localViewTreeObserver.isAlive())
      localViewTreeObserver.removeGlobalOnLayoutListener(this.l);
    if (c().f())
      a();
    this.q = false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.d.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
    if (!c().f())
      a();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    LinearLayout localLinearLayout = this.d;
    if (this.h.getVisibility() != 0)
      paramInt2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 1073741824);
    measureChild(localLinearLayout, paramInt1, paramInt2);
    setMeasuredDimension(localLinearLayout.getMeasuredWidth(), localLinearLayout.getMeasuredHeight());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActivityChooserView
 * JD-Core Version:    0.6.2
 */