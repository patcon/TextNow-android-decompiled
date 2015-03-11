package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.app.a;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import textnow.g.b;

final class af extends LinearLayoutCompat
  implements View.OnLongClickListener
{
  private final int[] b = { 16842964 };
  private a c;
  private TextView d;
  private ImageView e;
  private View f;

  public af(ac paramac, Context paramContext, a parama, boolean paramBoolean)
  {
    super(paramContext, null, b.d);
    this.c = parama;
    ao localao = ao.a(paramContext, null, this.b, b.d, 0);
    if (localao.d(0))
      setBackgroundDrawable(localao.a(0));
    localao.b();
    if (paramBoolean)
      b(8388627);
    b();
  }

  private void b()
  {
    a locala = this.c;
    View localView = locala.c();
    if (localView != null)
    {
      ViewParent localViewParent = localView.getParent();
      if (localViewParent != this)
      {
        if (localViewParent != null)
          ((ViewGroup)localViewParent).removeView(localView);
        addView(localView);
      }
      this.f = localView;
      if (this.d != null)
        this.d.setVisibility(8);
      if (this.e != null)
      {
        this.e.setVisibility(8);
        this.e.setImageDrawable(null);
      }
      return;
    }
    if (this.f != null)
    {
      removeView(this.f);
      this.f = null;
    }
    Drawable localDrawable = locala.a();
    CharSequence localCharSequence = locala.b();
    int i;
    if (localDrawable != null)
    {
      if (this.e == null)
      {
        ImageView localImageView = new ImageView(getContext());
        LinearLayoutCompat.LayoutParams localLayoutParams2 = new LinearLayoutCompat.LayoutParams(-2, -2);
        localLayoutParams2.h = 16;
        localImageView.setLayoutParams(localLayoutParams2);
        addView(localImageView, 0);
        this.e = localImageView;
      }
      this.e.setImageDrawable(localDrawable);
      this.e.setVisibility(0);
      if (TextUtils.isEmpty(localCharSequence))
        break label372;
      i = 1;
      label213: if (i == 0)
        break label378;
      if (this.d == null)
      {
        CompatTextView localCompatTextView = new CompatTextView(getContext(), null, b.e);
        localCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayoutCompat.LayoutParams localLayoutParams1 = new LinearLayoutCompat.LayoutParams(-2, -2);
        localLayoutParams1.h = 16;
        localCompatTextView.setLayoutParams(localLayoutParams1);
        addView(localCompatTextView);
        this.d = localCompatTextView;
      }
      this.d.setText(localCharSequence);
      this.d.setVisibility(0);
    }
    while (true)
    {
      if (this.e != null)
        this.e.setContentDescription(locala.e());
      if ((i != 0) || (TextUtils.isEmpty(locala.e())))
        break label405;
      setOnLongClickListener(this);
      return;
      if (this.e == null)
        break;
      this.e.setVisibility(8);
      this.e.setImageDrawable(null);
      break;
      label372: i = 0;
      break label213;
      label378: if (this.d != null)
      {
        this.d.setVisibility(8);
        this.d.setText(null);
      }
    }
    label405: setOnLongClickListener(null);
    setLongClickable(false);
  }

  public final a a()
  {
    return this.c;
  }

  public final void a(a parama)
  {
    this.c = parama;
    b();
  }

  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(a.class.getName());
  }

  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if (Build.VERSION.SDK_INT >= 14)
      paramAccessibilityNodeInfo.setClassName(a.class.getName());
  }

  public final boolean onLongClick(View paramView)
  {
    int[] arrayOfInt = new int[2];
    getLocationOnScreen(arrayOfInt);
    Context localContext = getContext();
    int i = getWidth();
    int j = getHeight();
    int k = localContext.getResources().getDisplayMetrics().widthPixels;
    Toast localToast = Toast.makeText(localContext, this.c.e(), 0);
    localToast.setGravity(49, arrayOfInt[0] + i / 2 - k / 2, j);
    localToast.show();
    return true;
  }

  public final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.a.b > 0) && (getMeasuredWidth() > this.a.b))
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a.b, 1073741824), paramInt2);
  }

  public final void setSelected(boolean paramBoolean)
  {
    if (isSelected() != paramBoolean);
    for (int i = 1; ; i = 0)
    {
      super.setSelected(paramBoolean);
      if ((i != 0) && (paramBoolean))
        sendAccessibilityEvent(4);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.af
 * JD-Core Version:    0.6.2
 */