package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class ScrollingTabContainerView$TabView extends LinearLayout
{
  private android.support.v7.app.c a;
  private TextView b;
  private ImageView c;
  private View d;
  private ScrollingTabContainerView e;

  public ScrollingTabContainerView$TabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void b()
  {
    android.support.v7.app.c localc = this.a;
    View localView = localc.c();
    if (localView != null)
    {
      ViewParent localViewParent = localView.getParent();
      if (localViewParent != this)
      {
        if (localViewParent != null)
          ((ViewGroup)localViewParent).removeView(localView);
        addView(localView);
      }
      this.d = localView;
      if (this.b != null)
        this.b.setVisibility(8);
      if (this.c != null)
      {
        this.c.setVisibility(8);
        this.c.setImageDrawable(null);
      }
    }
    label341: label366: 
    while (true)
    {
      return;
      if (this.d != null)
      {
        removeView(this.d);
        this.d = null;
      }
      Drawable localDrawable = localc.a();
      CharSequence localCharSequence = localc.b();
      if (localDrawable != null)
      {
        if (this.c == null)
        {
          ImageView localImageView = new ImageView(getContext());
          LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
          localLayoutParams2.gravity = 16;
          localImageView.setLayoutParams(localLayoutParams2);
          addView(localImageView, 0);
          this.c = localImageView;
        }
        this.c.setImageDrawable(localDrawable);
        this.c.setVisibility(0);
        if (localCharSequence == null)
          break label341;
        if (this.b == null)
        {
          CompatTextView localCompatTextView = new CompatTextView(getContext(), null, textnow.g.c.c);
          localCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
          LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
          localLayoutParams1.gravity = 16;
          localCompatTextView.setLayoutParams(localLayoutParams1);
          addView(localCompatTextView);
          this.b = localCompatTextView;
        }
        this.b.setText(localCharSequence);
        this.b.setVisibility(0);
      }
      while (true)
      {
        if (this.c == null)
          break label366;
        this.c.setContentDescription(localc.d());
        return;
        if (this.c == null)
          break;
        this.c.setVisibility(8);
        this.c.setImageDrawable(null);
        break;
        if (this.b != null)
        {
          this.b.setVisibility(8);
          this.b.setText(null);
        }
      }
    }
  }

  public final android.support.v7.app.c a()
  {
    return this.a;
  }

  public final void a(android.support.v7.app.c paramc)
  {
    this.a = paramc;
    b();
  }

  final void a(ScrollingTabContainerView paramScrollingTabContainerView, android.support.v7.app.c paramc, boolean paramBoolean)
  {
    this.e = paramScrollingTabContainerView;
    this.a = paramc;
    if (paramBoolean)
      setGravity(19);
    b();
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.e != null);
    for (int i = this.e.b; ; i = 0)
    {
      if ((i > 0) && (getMeasuredWidth() > i))
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), paramInt2);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ScrollingTabContainerView.TabView
 * JD-Core Version:    0.6.2
 */