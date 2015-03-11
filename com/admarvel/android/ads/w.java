package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.graphics.drawable.shapes.RectShape;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.admarvel.android.util.AdMarvelBitmapDrawableUtils;
import java.lang.ref.WeakReference;

class w extends LinearLayout
{
  static int a = 100001;
  final String b;
  private final WeakReference<Activity> c;

  @SuppressLint({"NewApi"})
  w(Activity paramActivity, Context paramContext, String paramString)
  {
    super(paramContext);
    this.c = new WeakReference(paramActivity);
    this.b = paramString;
    setId(a);
    setGravity(17);
    setOrientation(1);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams1.addRule(12);
    setLayoutParams(localLayoutParams1);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, (int)TypedValue.applyDimension(1, 5.0F, getResources().getDisplayMetrics()));
    ShapeDrawable localShapeDrawable1 = new ShapeDrawable();
    localShapeDrawable1.getPaint().setColor(Color.parseColor("#33B5E5"));
    ClipDrawable localClipDrawable = new ClipDrawable(localShapeDrawable1, 3, 1);
    ProgressBar localProgressBar = new ProgressBar(paramContext, null, 16842872);
    localProgressBar.setLayoutParams(localLayoutParams2);
    localProgressBar.setTag(this.b + "PROGRESS_BAR");
    localProgressBar.setBackgroundColor(0);
    localProgressBar.setProgressDrawable(localClipDrawable);
    localProgressBar.setVisibility(8);
    float f1 = TypedValue.applyDimension(1, 34.0F, getResources().getDisplayMetrics());
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(-2, a(36.0F));
    localLayoutParams3.weight = 25.0F;
    localLayoutParams3.gravity = 17;
    RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams((int)f1, (int)f1);
    localLayoutParams4.addRule(13);
    w.a locala1 = new w.a(this, paramContext);
    locala1.setTag(this.b + "CLOSE_BUTTON");
    locala1.setLayoutParams(localLayoutParams4);
    RelativeLayout localRelativeLayout1 = new RelativeLayout(paramContext);
    localRelativeLayout1.setTag(this.b + "CLOSE_BUTTON_LAYOUT");
    localRelativeLayout1.setLayoutParams(localLayoutParams3);
    localRelativeLayout1.addView(locala1);
    locala1.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Activity localActivity = (Activity)w.a(w.this).get();
        AdMarvelActivity localAdMarvelActivity;
        if ((localActivity != null) && ((localActivity instanceof AdMarvelActivity)))
        {
          localAdMarvelActivity = (AdMarvelActivity)localActivity;
          if (localAdMarvelActivity.c() != true)
            break label81;
          AdMarvelInterstitialAds.getListener().b();
        }
        while (true)
        {
          if (AdMarvelInternalWebView.d(w.this.b) != null)
            AdMarvelInternalWebView.d(w.this.b).a(w.this.b);
          return;
          label81: localAdMarvelActivity.finish();
        }
      }
    });
    locala1.setBackgroundDrawable(AdMarvelBitmapDrawableUtils.getBitMapDrawable("done", paramContext));
    w.a locala2 = new w.a(this, paramContext);
    locala2.setTag(this.b + "BACK_BUTTON");
    locala2.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        w.b(w.this);
      }
    });
    locala2.setLayoutParams(localLayoutParams4);
    locala2.setEnabled(false);
    RelativeLayout localRelativeLayout2 = new RelativeLayout(paramContext);
    localRelativeLayout2.setTag(this.b + "BACK_BUTTON_LAYOUT");
    localRelativeLayout2.setLayoutParams(localLayoutParams3);
    localRelativeLayout2.addView(locala2);
    w.a locala3 = new w.a(this, paramContext);
    locala3.setTag(this.b + "FORWARD_BUTTON");
    locala3.setLayoutParams(localLayoutParams4);
    locala3.setEnabled(false);
    RelativeLayout localRelativeLayout3 = new RelativeLayout(paramContext);
    locala3.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        w.c(w.this);
      }
    });
    localRelativeLayout3.setTag(this.b + "FORWARD_BUTTON_LAYOUT");
    localRelativeLayout3.setLayoutParams(localLayoutParams3);
    localRelativeLayout3.addView(locala3);
    w.a locala4 = new w.a(this, paramContext);
    locala4.setTag(this.b + "RELOAD_BUTTON");
    locala4.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        w.d(w.this);
      }
    });
    locala4.setLayoutParams(localLayoutParams4);
    Path localPath = new Path();
    localPath.arcTo(new RectF(15.0F, 40.0F, 85.0F, 75.0F), 0.0F, 270.0F, false);
    localPath.rLineTo(0.0F, 10.0F);
    localPath.rLineTo(40.0F, -15.0F);
    localPath.rLineTo(-40.0F, -15.0F);
    localPath.rLineTo(0.0F, 10.0F);
    localPath.arcTo(new RectF(5.0F, 30.0F, 95.0F, 85.0F), 270.0F, -270.0F, false);
    localPath.close();
    ShapeDrawable localShapeDrawable2 = new ShapeDrawable(new PathShape(localPath, 100.0F, 100.0F));
    localShapeDrawable2.getPaint().setColor(-1);
    localShapeDrawable2.getPaint().setStyle(Paint.Style.FILL);
    localShapeDrawable2.getPaint().setAntiAlias(true);
    locala4.setBackgroundDrawable(localShapeDrawable2);
    RelativeLayout localRelativeLayout4 = new RelativeLayout(paramContext);
    localRelativeLayout4.setTag(this.b + "RELOAD_BUTTON_LAYOUT");
    localRelativeLayout4.setLayoutParams(localLayoutParams3);
    localRelativeLayout4.addView(locala4);
    w.a locala5 = new w.a(this, paramContext);
    locala5.setTag(this.b + "BROWSER_BUTTON");
    locala5.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        w.e(w.this);
      }
    });
    locala5.setLayoutParams(localLayoutParams4);
    locala5.setBackgroundDrawable(AdMarvelBitmapDrawableUtils.getBitMapDrawable("open_url", getContext()));
    RelativeLayout localRelativeLayout5 = new RelativeLayout(paramContext);
    localRelativeLayout5.setTag(this.b + "BROWSER_BUTTON_LAYOUT");
    localRelativeLayout5.setLayoutParams(localLayoutParams3);
    localRelativeLayout5.addView(locala5);
    float f2 = TypedValue.applyDimension(1, 40.0F, getResources().getDisplayMetrics());
    ShapeDrawable localShapeDrawable3 = new ShapeDrawable(new RectShape());
    localShapeDrawable3.getPaint().setColor(Color.parseColor("#FF1D1C1D"));
    LinearLayout.LayoutParams localLayoutParams5 = new LinearLayout.LayoutParams(-1, (int)f2);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setGravity(17);
    localLinearLayout.setTag(this.b + "BUTTON_BAR_LAYOUT");
    localLinearLayout.setLayoutParams(localLayoutParams5);
    localLinearLayout.setOrientation(0);
    localLinearLayout.setWeightSum(100.0F);
    localLinearLayout.setBackgroundDrawable(localShapeDrawable3);
    localLinearLayout.addView(localRelativeLayout1);
    localLinearLayout.addView(localRelativeLayout2);
    localLinearLayout.addView(localRelativeLayout3);
    localLinearLayout.addView(localRelativeLayout5);
    addView(localProgressBar);
    addView(localLinearLayout);
  }

  private int a(float paramFloat)
  {
    return (int)TypedValue.applyDimension(1, paramFloat, getResources().getDisplayMetrics());
  }

  private void b()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)((RelativeLayout)getParent()).findViewWithTag(this.b + "WEBVIEW");
    if (localAdMarvelInternalWebView.canGoBack())
    {
      localAdMarvelInternalWebView.goBack();
      a();
    }
  }

  private void c()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)((RelativeLayout)getParent()).findViewWithTag(this.b + "WEBVIEW");
    if (localAdMarvelInternalWebView.canGoForward())
    {
      localAdMarvelInternalWebView.goForward();
      a();
    }
  }

  private void d()
  {
    ((AdMarvelInternalWebView)((RelativeLayout)getParent()).findViewWithTag(this.b + "WEBVIEW")).reload();
    a();
  }

  private void e()
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(((AdMarvelInternalWebView)((RelativeLayout)getParent()).findViewWithTag(this.b + "WEBVIEW")).getUrl()));
    localIntent.addFlags(268435456);
    Activity localActivity = (Activity)this.c.get();
    if ((localActivity != null) && ((localActivity instanceof AdMarvelActivity)))
    {
      AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)localActivity;
      if (ab.a(getContext(), localIntent))
        localAdMarvelActivity.startActivity(localIntent);
      if (localAdMarvelActivity.c() == true)
      {
        AdMarvelInterstitialAds.getListener().b();
        localAdMarvelActivity.b();
      }
      localAdMarvelActivity.a();
      localAdMarvelActivity.finish();
    }
  }

  void a()
  {
    Path localPath = new Path();
    localPath.moveTo(0.0F, 50.0F);
    localPath.rLineTo(80.0F, 30.0F);
    localPath.rLineTo(0.0F, -60.0F);
    localPath.rLineTo(-80.0F, 30.0F);
    localPath.close();
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)((RelativeLayout)getParent()).findViewWithTag(this.b + "WEBVIEW");
    w.a locala1 = (w.a)findViewWithTag(this.b + "BACK_BUTTON_LAYOUT").findViewWithTag(this.b + "BACK_BUTTON");
    w.a locala2 = (w.a)findViewWithTag(this.b + "FORWARD_BUTTON_LAYOUT").findViewWithTag(this.b + "FORWARD_BUTTON");
    w.a locala3 = (w.a)findViewWithTag(this.b + "BROWSER_BUTTON_LAYOUT").findViewWithTag(this.b + "BROWSER_BUTTON");
    BitmapDrawable localBitmapDrawable1;
    if (localAdMarvelInternalWebView.canGoBack())
    {
      locala1.setEnabled(true);
      localBitmapDrawable1 = AdMarvelBitmapDrawableUtils.getBitMapDrawable("backward", getContext());
      locala1.setBackgroundDrawable(localBitmapDrawable1);
      if (!localAdMarvelInternalWebView.canGoForward())
        break label378;
      locala2.setEnabled(true);
    }
    for (BitmapDrawable localBitmapDrawable2 = AdMarvelBitmapDrawableUtils.getBitMapDrawable("resume", getContext()); ; localBitmapDrawable2 = AdMarvelBitmapDrawableUtils.getBitMapDrawable("resume_disable", getContext()))
    {
      locala2.setBackgroundDrawable(localBitmapDrawable2);
      locala3.setBackgroundDrawable(AdMarvelBitmapDrawableUtils.getBitMapDrawable("open_url", getContext()));
      String str = localAdMarvelInternalWebView.getUrl();
      if ((str == null) || (!str.contains("http://")))
        break label399;
      locala3.setEnabled(true);
      return;
      locala1.setEnabled(false);
      localBitmapDrawable1 = AdMarvelBitmapDrawableUtils.getBitMapDrawable("backward_disable", getContext());
      break;
      label378: locala2.setEnabled(false);
    }
    label399: locala3.setEnabled(false);
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0)
      a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.w
 * JD-Core Version:    0.6.2
 */