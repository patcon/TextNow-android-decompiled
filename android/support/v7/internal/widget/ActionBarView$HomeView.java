package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import java.util.List;
import textnow.g.f;

class ActionBarView$HomeView extends FrameLayout
{
  private ImageView a;
  private ImageView b;
  private int c;
  private int d;
  private Drawable e;

  public ActionBarView$HomeView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ActionBarView$HomeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final int a()
  {
    if (this.a.getVisibility() == 8)
      return this.c;
    return 0;
  }

  public final void a(Drawable paramDrawable)
  {
    this.b.setImageDrawable(paramDrawable);
  }

  public final void a(boolean paramBoolean)
  {
    ImageView localImageView = this.a;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      return;
    }
  }

  public final void b(Drawable paramDrawable)
  {
    ImageView localImageView = this.a;
    if (paramDrawable != null);
    while (true)
    {
      localImageView.setImageDrawable(paramDrawable);
      this.d = 0;
      return;
      paramDrawable = this.e;
    }
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    CharSequence localCharSequence = getContentDescription();
    if (!TextUtils.isEmpty(localCharSequence))
      paramAccessibilityEvent.getText().add(localCharSequence);
    return true;
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    int i;
    ImageView localImageView;
    if (this.d != 0)
    {
      i = this.d;
      this.d = i;
      localImageView = this.a;
      if (i == 0)
        break label48;
    }
    label48: for (Drawable localDrawable = getResources().getDrawable(i); ; localDrawable = null)
    {
      localImageView.setImageDrawable(localDrawable);
      return;
    }
  }

  protected void onFinishInflate()
  {
    this.a = ((ImageView)findViewById(f.H));
    this.b = ((ImageView)findViewById(f.o));
    this.e = this.a.getDrawable();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = (paramInt4 - paramInt2) / 2;
    int j = this.a.getVisibility();
    int k = 0;
    if (j != 8)
    {
      FrameLayout.LayoutParams localLayoutParams2 = (FrameLayout.LayoutParams)this.a.getLayoutParams();
      int i4 = this.a.getMeasuredHeight();
      int i5 = this.a.getMeasuredWidth();
      int i6 = i - i4 / 2;
      this.a.layout(0, i6, i5, i4 + i6);
      int i7 = i5 + localLayoutParams2.leftMargin + localLayoutParams2.rightMargin;
      paramInt1 += i7;
      k = i7;
    }
    FrameLayout.LayoutParams localLayoutParams1 = (FrameLayout.LayoutParams)this.b.getLayoutParams();
    int m = this.b.getMeasuredHeight();
    int n = this.b.getMeasuredWidth();
    int i1 = (paramInt3 - paramInt1) / 2;
    int i2 = k + Math.max(localLayoutParams1.leftMargin, i1 - n / 2);
    int i3 = Math.max(localLayoutParams1.topMargin, i - m / 2);
    this.b.layout(i2, i3, n + i2, m + i3);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    measureChildWithMargins(this.a, paramInt1, 0, paramInt2, 0);
    FrameLayout.LayoutParams localLayoutParams1 = (FrameLayout.LayoutParams)this.a.getLayoutParams();
    this.c = (localLayoutParams1.leftMargin + this.a.getMeasuredWidth() + localLayoutParams1.rightMargin);
    int i;
    int k;
    int m;
    int i2;
    if (this.a.getVisibility() == 8)
    {
      i = 0;
      int j = localLayoutParams1.topMargin + this.a.getMeasuredHeight() + localLayoutParams1.bottomMargin;
      measureChildWithMargins(this.b, paramInt1, i, paramInt2, 0);
      FrameLayout.LayoutParams localLayoutParams2 = (FrameLayout.LayoutParams)this.b.getLayoutParams();
      k = i + (localLayoutParams2.leftMargin + this.b.getMeasuredWidth() + localLayoutParams2.rightMargin);
      m = Math.max(j, localLayoutParams2.topMargin + this.b.getMeasuredHeight() + localLayoutParams2.bottomMargin);
      int n = View.MeasureSpec.getMode(paramInt1);
      int i1 = View.MeasureSpec.getMode(paramInt2);
      i2 = View.MeasureSpec.getSize(paramInt1);
      i3 = View.MeasureSpec.getSize(paramInt2);
      switch (n)
      {
      default:
        i2 = k;
      case 1073741824:
        label208: switch (i1)
        {
        default:
        case 1073741824:
        case -2147483648:
        }
        break;
      case -2147483648:
      }
    }
    for (int i3 = m; ; i3 = Math.min(m, i3))
    {
      setMeasuredDimension(i2, i3);
      return;
      i = this.c;
      break;
      i2 = Math.min(k, i2);
      break label208;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarView.HomeView
 * JD-Core Version:    0.6.2
 */