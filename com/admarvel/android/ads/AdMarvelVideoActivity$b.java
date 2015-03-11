package com.admarvel.android.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class AdMarvelVideoActivity$b extends RelativeLayout
{
  TextView a;
  ProgressBar b;
  private final Context c;
  private boolean d = false;
  private boolean e = true;
  private boolean f = true;
  private int g = 0;
  private final WeakReference<AdMarvelVideoActivity> h;

  public AdMarvelVideoActivity$b(Context paramContext, AdMarvelVideoActivity paramAdMarvelVideoActivity)
  {
    super(paramContext);
    this.h = new WeakReference(paramAdMarvelVideoActivity);
    this.c = paramContext;
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams1.addRule(13);
    setLayoutParams(localLayoutParams1);
    setBackgroundColor(getResources().getColor(17170445));
    new RelativeLayout.LayoutParams(-1, a(100.0F));
    this.a = new TextView(paramContext);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    this.a.setLayoutParams(localLayoutParams2);
    if (ac.a() < 9)
      this.b = new ProgressBar(this.c, null, 16842872);
    for (RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-2, -2); ; localLayoutParams3 = new RelativeLayout.LayoutParams(a(50.0F), a(50.0F)))
    {
      this.b.setId(189523436);
      this.b.setVisibility(0);
      localLayoutParams3.addRule(13);
      addView(this.b, localLayoutParams3);
      localLayoutParams2.addRule(3, this.b.getId());
      localLayoutParams2.addRule(14);
      localLayoutParams2.addRule(13);
      addView(this.a);
      return;
      this.b = new ProgressBar(this.c, null, 16843401);
    }
  }

  private int a(float paramFloat)
  {
    return (int)TypedValue.applyDimension(1, paramFloat, getResources().getDisplayMetrics());
  }

  private void e()
  {
    AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.h.get();
    if (localAdMarvelVideoActivity == null);
    do
    {
      return;
      LinearLayout localLinearLayout = (LinearLayout)localAdMarvelVideoActivity.findViewById(AdMarvelVideoActivity.c);
      if (localLinearLayout != null)
        localLinearLayout.setVisibility(0);
    }
    while (((LinearLayout)localAdMarvelVideoActivity.findViewById(AdMarvelVideoActivity.b) == null) || (!AdMarvelVideoActivity.r(localAdMarvelVideoActivity)) || (!AdMarvelVideoActivity.g(localAdMarvelVideoActivity)));
    localAdMarvelVideoActivity.b(true);
  }

  public boolean a()
  {
    return this.f;
  }

  public void b()
  {
    setShowing(true);
    this.b.setVisibility(0);
    setVisibility(0);
  }

  public void c()
  {
    this.d = true;
  }

  public void d()
  {
    setShowing(false);
    this.b.setVisibility(8);
    setVisibility(8);
  }

  public int getProgress()
  {
    return this.g;
  }

  public void setCancelable(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }

  public void setMessage(String paramString)
  {
    this.a.setText(paramString);
  }

  public void setProgress(int paramInt)
  {
    this.g = paramInt;
    this.b.setProgress(paramInt);
    if (paramInt >= 100)
      d();
    this.a.setText("Loading..." + paramInt + "% ");
    this.a.invalidate();
  }

  public void setShowing(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelVideoActivity.b
 * JD-Core Version:    0.6.2
 */