package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class cf extends cn.a
{
  private static final int of = Color.argb(0, 0, 0, 0);
  private ex lN;
  private final Activity og;
  private ch oh;
  private cj oi;
  private cf.c oj;
  private ck ok;
  private boolean ol;
  private FrameLayout om;
  private WebChromeClient.CustomViewCallback on;
  private boolean oo = false;
  private boolean op = false;
  private boolean oq = false;
  private RelativeLayout or;

  public cf(Activity paramActivity)
  {
    this.og = paramActivity;
  }

  private static RelativeLayout.LayoutParams a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(paramInt3, paramInt4);
    localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
    localLayoutParams.addRule(10);
    localLayoutParams.addRule(9);
    return localLayoutParams;
  }

  public static void a(Context paramContext, ch paramch)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    localIntent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", paramch.kQ.sz);
    ch.a(localIntent, paramch);
    localIntent.addFlags(524288);
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  private void aT()
  {
    if ((!this.og.isFinishing()) || (this.op));
    do
    {
      do
      {
        return;
        this.op = true;
      }
      while (!this.og.isFinishing());
      if (this.lN != null)
      {
        this.lN.bY();
        this.or.removeView(this.lN);
        if (this.oj != null)
        {
          this.lN.q(false);
          this.oj.ou.addView(this.lN, this.oj.index, this.oj.ot);
        }
      }
    }
    while ((this.oh == null) || (this.oh.ox == null));
    this.oh.ox.Z();
  }

  private void k(boolean paramBoolean)
  {
    if (!this.ol)
      this.og.requestWindowFeature(1);
    Window localWindow = this.og.getWindow();
    if ((!this.oq) || (this.oh.oH.ld))
      localWindow.setFlags(1024, 1024);
    setRequestedOrientation(this.oh.orientation);
    if (Build.VERSION.SDK_INT >= 11)
    {
      eu.z("Enabling hardware acceleration on the AdActivity window.");
      eq.a(localWindow);
    }
    this.or = new cf.b(this.og, this.oh.oG);
    boolean bool;
    if (!this.oq)
    {
      this.or.setBackgroundColor(-16777216);
      this.og.setContentView(this.or);
      S();
      bool = this.oh.oy.cb().cj();
      if (!paramBoolean)
        break label414;
      this.lN = ex.a(this.og, this.oh.oy.V(), true, bool, null, this.oh.kQ);
      this.lN.cb().a(null, null, this.oh.oz, this.oh.oD, true, this.oh.oF);
      this.lN.cb().a(new ey.a()
      {
        public void a(ex paramAnonymousex)
        {
          paramAnonymousex.bZ();
        }
      });
      if (this.oh.ob == null)
        break label362;
      this.lN.loadUrl(this.oh.ob);
    }
    label414: 
    while (true)
    {
      this.lN.a(this);
      ViewParent localViewParent = this.lN.getParent();
      if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
        ((ViewGroup)localViewParent).removeView(this.lN);
      if (this.oq)
        this.lN.setBackgroundColor(of);
      this.or.addView(this.lN, -1, -1);
      if (!paramBoolean)
        this.lN.bZ();
      i(bool);
      return;
      this.or.setBackgroundColor(of);
      break;
      label362: if (this.oh.oC != null)
      {
        this.lN.loadDataWithBaseURL(this.oh.oA, this.oh.oC, "text/html", "UTF-8", null);
      }
      else
      {
        throw new cf.a("No URL or HTML to display in ad overlay.");
        this.lN = this.oh.oy;
        this.lN.setContext(this.og);
      }
    }
  }

  public void S()
  {
    this.ol = true;
  }

  public void a(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.om = new FrameLayout(this.og);
    this.om.setBackgroundColor(-16777216);
    this.om.addView(paramView, -1, -1);
    this.og.setContentView(this.om);
    S();
    this.on = paramCustomViewCallback;
  }

  public cj aQ()
  {
    return this.oi;
  }

  public void aR()
  {
    if (this.oh != null)
      setRequestedOrientation(this.oh.orientation);
    if (this.om != null)
    {
      this.og.setContentView(this.or);
      S();
      this.om.removeAllViews();
      this.om = null;
    }
    if (this.on != null)
    {
      this.on.onCustomViewHidden();
      this.on = null;
    }
  }

  public void aS()
  {
    this.or.removeView(this.ok);
    i(true);
  }

  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.oi != null)
      this.oi.setLayoutParams(a(paramInt1, paramInt2, paramInt3, paramInt4));
  }

  public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.oi == null)
    {
      this.oi = new cj(this.og, this.lN);
      this.or.addView(this.oi, 0, a(paramInt1, paramInt2, paramInt3, paramInt4));
      this.lN.cb().r(false);
    }
  }

  public void close()
  {
    this.og.finish();
  }

  public void i(boolean paramBoolean)
  {
    int i;
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramBoolean)
    {
      i = 50;
      this.ok = new ck(this.og, i);
      localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams.addRule(10);
      if (!paramBoolean)
        break label88;
    }
    label88: for (int j = 11; ; j = 9)
    {
      localLayoutParams.addRule(j);
      this.ok.j(this.oh.oB);
      this.or.addView(this.ok, localLayoutParams);
      return;
      i = 32;
      break;
    }
  }

  public void j(boolean paramBoolean)
  {
    if (this.ok != null)
      this.ok.j(paramBoolean);
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = false;
    if (paramBundle != null)
      bool = paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
    this.oo = bool;
    do
    {
      try
      {
        this.oh = ch.a(this.og.getIntent());
        if (this.oh == null)
          throw new cf.a("Could not get info for ad overlay.");
      }
      catch (cf.a locala)
      {
        eu.D(locala.getMessage());
        this.og.finish();
        return;
      }
      if (this.oh.oH != null);
      for (this.oq = this.oh.oH.lb; ; this.oq = false)
      {
        if (paramBundle == null)
        {
          if (this.oh.ox != null)
            this.oh.ox.aa();
          if ((this.oh.oE != 1) && (this.oh.ow != null))
            this.oh.ow.onAdClicked();
        }
        switch (this.oh.oE)
        {
        default:
          throw new cf.a("Could not determine ad overlay type.");
        case 1:
        case 2:
        case 3:
        case 4:
        }
      }
      k(false);
      return;
      this.oj = new cf.c(this.oh.oy);
      k(false);
      return;
      k(true);
      return;
      if (this.oo)
      {
        this.og.finish();
        return;
      }
    }
    while (cc.a(this.og, this.oh.ov, this.oh.oD));
    this.og.finish();
  }

  public void onDestroy()
  {
    if (this.oi != null)
      this.oi.destroy();
    if (this.lN != null)
      this.or.removeView(this.lN);
    aT();
  }

  public void onPause()
  {
    if (this.oi != null)
      this.oi.pause();
    aR();
    if ((this.lN != null) && ((!this.og.isFinishing()) || (this.oj == null)))
      eo.a(this.lN);
    aT();
  }

  public void onRestart()
  {
  }

  public void onResume()
  {
    if ((this.oh != null) && (this.oh.oE == 4))
    {
      if (!this.oo)
        break label47;
      this.og.finish();
    }
    while (true)
    {
      if (this.lN != null)
        eo.b(this.lN);
      return;
      label47: this.oo = true;
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.oo);
  }

  public void onStart()
  {
  }

  public void onStop()
  {
    aT();
  }

  public void setRequestedOrientation(int paramInt)
  {
    this.og.setRequestedOrientation(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cf
 * JD-Core Version:    0.6.2
 */