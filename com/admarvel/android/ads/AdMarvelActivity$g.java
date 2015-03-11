package com.admarvel.android.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class AdMarvelActivity$g extends RelativeLayout
{
  TextView a;
  ProgressBar b;
  private final Context d;
  private boolean e = false;
  private boolean f = true;
  private boolean g = true;
  private int h = 0;

  public AdMarvelActivity$g(AdMarvelActivity paramAdMarvelActivity, Context paramContext)
  {
    super(paramContext);
    this.d = paramContext;
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams1.addRule(13);
    setLayoutParams(localLayoutParams1);
    setBackgroundColor(getResources().getColor(17170445));
    new RelativeLayout.LayoutParams(-1, a(100.0F));
    this.a = new TextView(paramContext);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    this.a.setLayoutParams(localLayoutParams2);
    if (ac.a() < 9)
      this.b = new ProgressBar(this.d, null, 16842872);
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
      this.a.setText("Loading..." + this.h + "% ");
      if (AdMarvelActivity.a(paramAdMarvelActivity))
      {
        this.f = false;
        AdMarvelActivity.a(paramAdMarvelActivity, true);
        AdMarvelActivity.f(paramAdMarvelActivity).postDelayed(AdMarvelActivity.E(paramAdMarvelActivity), 5000L);
      }
      return;
      this.b = new ProgressBar(this.d, null, 16843401);
    }
  }

  private int a(float paramFloat)
  {
    return (int)TypedValue.applyDimension(1, paramFloat, getResources().getDisplayMetrics());
  }

  private void d()
  {
    AdMarvelActivity localAdMarvelActivity = this.c;
    AdMarvelActivity.a(localAdMarvelActivity, false);
    RelativeLayout localRelativeLayout = (RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.b);
    w localw;
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    if (localRelativeLayout != null)
    {
      localw = (w)localRelativeLayout.findViewWithTag(AdMarvelActivity.c(localAdMarvelActivity) + "CONTROLS");
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)localRelativeLayout.findViewWithTag(AdMarvelActivity.c(localAdMarvelActivity) + "WEBVIEW");
      if (this.e)
        break label127;
      if ((localw != null) && (localAdMarvelInternalWebView != null))
      {
        localAdMarvelInternalWebView.clearHistory();
        localAdMarvelInternalWebView.setVisibility(0);
        localw.setVisibility(0);
      }
    }
    while (true)
    {
      localRelativeLayout.requestLayout();
      return;
      label127: if (localAdMarvelInternalWebView != null)
      {
        localAdMarvelInternalWebView.stopLoading();
        localAdMarvelInternalWebView.d();
        localAdMarvelInternalWebView.setVisibility(8);
      }
      if (localw != null)
        localw.setVisibility(8);
    }
  }

  public boolean a()
  {
    return this.g;
  }

  public void b()
  {
    this.e = true;
  }

  public void c()
  {
    setShowing(false);
    this.b.setVisibility(8);
    setVisibility(8);
  }

  public int getProgress()
  {
    return this.h;
  }

  public void setCancelable(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public void setProgress(int paramInt)
  {
    this.h = paramInt;
    this.b.setProgress(paramInt);
    if (paramInt >= 100)
      c();
    this.a.setText("Loading..." + paramInt + "% ");
    this.a.invalidate();
  }

  public void setShowing(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.g
 * JD-Core Version:    0.6.2
 */