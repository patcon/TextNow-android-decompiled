package com.flurry.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

@SuppressLint({"SetJavaScriptEnabled"})
public final class n extends RelativeLayout
  implements View.OnClickListener
{
  private final String a = getClass().getSimpleName();
  private WebView b;
  private WebViewClient c;
  private WebChromeClient d;
  private boolean e;
  private boolean f = true;
  private ProgressDialog g;
  private ImageView h;
  private ImageView i;
  private ImageView j;
  private final int k = 0;
  private final int l = 1;
  private final int m = 2;
  private n.f n;
  private n.c o;
  private n.d p;
  private boolean q;

  @TargetApi(11)
  public n(Context paramContext, String paramString, boolean paramBoolean)
  {
    super(paramContext);
    this.b = new WebView(paramContext);
    this.c = new n.b(this, null);
    this.d = new n.a(this, null);
    this.f = paramBoolean;
    this.b.getSettings().setJavaScriptEnabled(true);
    this.b.getSettings().setUseWideViewPort(true);
    this.b.getSettings().setLoadWithOverviewMode(true);
    this.b.getSettings().setBuiltInZoomControls(true);
    if (Build.VERSION.SDK_INT >= 11)
      this.b.getSettings().setDisplayZoomControls(false);
    this.b.setWebViewClient(this.c);
    this.b.setWebChromeClient(this.d);
    this.b.loadUrl(paramString);
    this.h = new ImageView(paramContext);
    this.h.setId(0);
    this.h.setImageDrawable(getResources().getDrawable(17301560));
    this.h.setOnClickListener(this);
    this.i = new ImageView(paramContext);
    this.i.setId(1);
    this.i.setImageDrawable(getResources().getDrawable(17301580));
    this.i.setOnClickListener(this);
    this.j = new ImageView(paramContext);
    this.j.setId(2);
    this.j.setImageDrawable(getResources().getDrawable(17301565));
    this.j.setOnClickListener(this);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    addView(this.b);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams1.addRule(14);
    addView(this.h, localLayoutParams1);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(9);
    addView(this.i, localLayoutParams2);
    RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams3.addRule(11);
    addView(this.j, localLayoutParams3);
  }

  public final void a(Context paramContext)
  {
    if (this.g == null)
      if (paramContext != null)
      {
        this.g = new ProgressDialog(paramContext);
        this.g.setProgressStyle(0);
        this.g.setMessage("Loading...");
        this.g.setCancelable(true);
        this.g.setCanceledOnTouchOutside(false);
        this.g.show();
      }
    while (this.g.isShowing())
    {
      return;
      eo.a(3, this.a, "Context is null, cannot create progress dialog.");
      return;
    }
    this.g.show();
  }

  public final boolean a()
  {
    return (this.e) || ((this.b != null) && (this.b.canGoBack()));
  }

  public final boolean b()
  {
    return this.f;
  }

  public final void c()
  {
    if (this.e)
      this.d.onHideCustomView();
    while (this.b == null)
      return;
    this.b.goBack();
  }

  @TargetApi(11)
  public final void d()
  {
    if (this.b != null)
    {
      e();
      removeView(this.b);
      this.b.stopLoading();
      if (Build.VERSION.SDK_INT >= 11)
        this.b.onPause();
      this.b.destroy();
      this.b = null;
    }
  }

  public final void e()
  {
    if ((this.g != null) && (this.g.isShowing()))
    {
      this.g.dismiss();
      this.g = null;
    }
  }

  public final n.c getBasicWebViewClosingHandler()
  {
    return this.o;
  }

  public final n.d getBasicWebViewFullScreenTransitionHandler()
  {
    return this.p;
  }

  public final n.f getBasicWebViewUrlLoadingHandler()
  {
    return this.n;
  }

  public final String getUrl()
  {
    WebView localWebView = this.b;
    String str = null;
    if (localWebView != null)
      str = this.b.getUrl();
    return str;
  }

  public final void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    do
    {
      do
      {
        do
          return;
        while (this.o == null);
        this.o.a(this, n.e.c);
        return;
      }
      while ((this.b == null) || (!this.b.canGoForward()));
      this.b.goForward();
      return;
      if ((this.b != null) && (this.b.canGoBack()))
      {
        this.b.goBack();
        return;
      }
    }
    while (this.o == null);
    if (b())
    {
      this.o.a(this, n.e.c);
      return;
    }
    this.o.a(this, n.e.b);
  }

  public final void setBasicWebViewClosingHandler(n.c paramc)
  {
    this.o = paramc;
  }

  public final void setBasicWebViewFullScreenTransitionHandler(n.d paramd)
  {
    this.p = paramd;
  }

  public final void setBasicWebViewUrlLoadingHandler(n.f paramf)
  {
    this.n = paramf;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.n
 * JD-Core Version:    0.6.2
 */