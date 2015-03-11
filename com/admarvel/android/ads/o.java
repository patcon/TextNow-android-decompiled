package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.URLUtil;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.admarvel.android.util.AdMarvelBitmapDrawableUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

class o extends LinearLayout
{
  static int a = 100001;
  final String b;
  private final WeakReference<Activity> c;
  private boolean d = false;

  @SuppressLint({"NewApi"})
  o(Activity paramActivity, Context paramContext, String paramString, boolean paramBoolean)
  {
    super(paramContext);
    this.c = new WeakReference(paramActivity);
    this.b = paramString;
    this.d = paramBoolean;
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
    addView(localProgressBar);
    if (this.d)
    {
      float f1 = TypedValue.applyDimension(1, 34.0F, getResources().getDisplayMetrics());
      LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(-2, a(36.0F));
      localLayoutParams3.weight = 25.0F;
      localLayoutParams3.gravity = 17;
      RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams((int)f1, (int)f1);
      localLayoutParams4.addRule(13);
      o.a locala1 = new o.a(this, paramContext);
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
          Activity localActivity = (Activity)o.a(o.this).get();
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
            if (d.d(o.this.b) != null)
              d.d(o.this.b).a(o.this.b);
            return;
            label81: localAdMarvelActivity.finish();
          }
        }
      });
      locala1.setBackgroundDrawable(AdMarvelBitmapDrawableUtils.getBitMapDrawable("done", paramContext));
      o.a locala2 = new o.a(this, paramContext);
      locala2.setTag(this.b + "BACK_BUTTON");
      locala2.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          o.b(o.this);
        }
      });
      locala2.setLayoutParams(localLayoutParams4);
      locala2.setEnabled(false);
      locala2.setBackgroundDrawable(AdMarvelBitmapDrawableUtils.getBitMapDrawable("backward", getContext()));
      RelativeLayout localRelativeLayout2 = new RelativeLayout(paramContext);
      localRelativeLayout2.setTag(this.b + "BACK_BUTTON_LAYOUT");
      localRelativeLayout2.setLayoutParams(localLayoutParams3);
      localRelativeLayout2.addView(locala2);
      o.a locala3 = new o.a(this, paramContext);
      locala3.setTag(this.b + "FORWARD_BUTTON");
      locala3.setLayoutParams(localLayoutParams4);
      locala3.setEnabled(false);
      RelativeLayout localRelativeLayout3 = new RelativeLayout(paramContext);
      locala3.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          o.c(o.this);
        }
      });
      locala3.setBackgroundDrawable(AdMarvelBitmapDrawableUtils.getBitMapDrawable("resume", getContext()));
      localRelativeLayout3.setTag(this.b + "FORWARD_BUTTON_LAYOUT");
      localRelativeLayout3.setLayoutParams(localLayoutParams3);
      localRelativeLayout3.addView(locala3);
      o.a locala4 = new o.a(this, paramContext);
      locala4.setTag(this.b + "BROWSER_BUTTON");
      locala4.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          o.d(o.this);
        }
      });
      locala4.setLayoutParams(localLayoutParams4);
      locala4.setBackgroundDrawable(AdMarvelBitmapDrawableUtils.getBitMapDrawable("open_url", getContext()));
      RelativeLayout localRelativeLayout4 = new RelativeLayout(paramContext);
      localRelativeLayout4.setTag(this.b + "BROWSER_BUTTON_LAYOUT");
      localRelativeLayout4.setLayoutParams(localLayoutParams3);
      localRelativeLayout4.addView(locala4);
      float f2 = TypedValue.applyDimension(1, 40.0F, getResources().getDisplayMetrics());
      ShapeDrawable localShapeDrawable2 = new ShapeDrawable(new RectShape());
      localShapeDrawable2.getPaint().setColor(Color.parseColor("#FF1D1C1D"));
      LinearLayout.LayoutParams localLayoutParams5 = new LinearLayout.LayoutParams(-1, (int)f2);
      LinearLayout localLinearLayout = new LinearLayout(paramContext);
      localLinearLayout.setGravity(17);
      localLinearLayout.setTag(this.b + "BUTTON_BAR_LAYOUT");
      localLinearLayout.setLayoutParams(localLayoutParams5);
      localLinearLayout.setOrientation(0);
      localLinearLayout.setWeightSum(100.0F);
      localLinearLayout.setBackgroundDrawable(localShapeDrawable2);
      localLinearLayout.addView(localRelativeLayout1);
      localLinearLayout.addView(localRelativeLayout2);
      localLinearLayout.addView(localRelativeLayout3);
      localLinearLayout.addView(localRelativeLayout4);
      addView(localLinearLayout);
    }
  }

  private int a(float paramFloat)
  {
    return (int)TypedValue.applyDimension(1, paramFloat, getResources().getDisplayMetrics());
  }

  private void b()
  {
    d locald = (d)((RelativeLayout)getParent()).findViewWithTag(this.b + "WEBVIEW");
    if (locald.canGoBack())
    {
      locald.goBack();
      a();
    }
  }

  private void c()
  {
    d locald = (d)((RelativeLayout)getParent()).findViewWithTag(this.b + "WEBVIEW");
    if (locald.canGoForward())
    {
      locald.goForward();
      a();
    }
  }

  private void d()
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(((d)((RelativeLayout)getParent()).findViewWithTag(this.b + "WEBVIEW")).getUrl()));
    localIntent.addFlags(268435456);
    Activity localActivity = (Activity)this.c.get();
    if ((localActivity != null) && ((localActivity instanceof AdMarvelActivity)))
    {
      AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)localActivity;
      if (r.a(getContext(), localIntent))
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
    d locald = (d)((RelativeLayout)getParent()).findViewWithTag(this.b + "WEBVIEW");
    o.a locala1;
    o.a locala2;
    label178: Map localMap;
    o.a locala3;
    if (this.d)
    {
      locala1 = (o.a)findViewWithTag(this.b + "BACK_BUTTON_LAYOUT").findViewWithTag(this.b + "BACK_BUTTON");
      locala2 = (o.a)findViewWithTag(this.b + "FORWARD_BUTTON_LAYOUT").findViewWithTag(this.b + "FORWARD_BUTTON");
      if (!locald.canGoBack())
        break label318;
      locala1.setEnabled(true);
      if (!locald.canGoForward())
        break label326;
      locala2.setEnabled(true);
      localMap = AdMarvelUtils.getAdMarvelOptionalFlags();
      locala3 = (o.a)findViewWithTag(this.b + "BROWSER_BUTTON_LAYOUT").findViewWithTag(this.b + "BROWSER_BUTTON");
      String str = locald.getUrl();
      if ((str == null) || (!URLUtil.isNetworkUrl(str)))
        break label334;
      locala3.setEnabled(true);
    }
    while (true)
    {
      if ((localMap != null) && (localMap.containsKey("AP_TOOL_DISABLE_EXTERNAL_BROWSER_ICON")) && (((String)localMap.get("AP_TOOL_DISABLE_EXTERNAL_BROWSER_ICON")).equals("true")))
      {
        locala3.setEnabled(false);
        locala3.setVisibility(8);
      }
      return;
      label318: locala1.setEnabled(false);
      break;
      label326: locala2.setEnabled(false);
      break label178;
      label334: locala3.setEnabled(false);
    }
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0)
      a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.o
 * JD-Core Version:    0.6.2
 */