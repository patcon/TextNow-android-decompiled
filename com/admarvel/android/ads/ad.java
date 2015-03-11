package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.admarvel.android.util.AdMarvelBitmapDrawableUtils;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;

class ad extends LinearLayout
{
  static int a = 100001;
  public boolean b = false;
  LinearLayout c;
  final String d;
  AdMarvelXMLReader e;
  AdMarvelXMLElement f;
  private final WeakReference<AdMarvelVideoActivity> g;
  private final WeakReference<p> h;
  private boolean i;
  private boolean j = false;

  ad(p paramp, AdMarvelVideoActivity paramAdMarvelVideoActivity, Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    this.g = new WeakReference(paramAdMarvelVideoActivity);
    this.h = new WeakReference(paramp);
    this.i = false;
    this.d = paramString2;
    setId(a);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -1);
    localLayoutParams1.gravity = 16;
    setLayoutParams(localLayoutParams1);
    setGravity(16);
    float f1 = TypedValue.applyDimension(1, 40.0F, getResources().getDisplayMetrics());
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RectShape());
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams2.gravity = 3;
    RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-2, (int)TypedValue.applyDimension(1, 32.0F, getResources().getDisplayMetrics()));
    localLayoutParams3.addRule(5);
    RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(-2, (int)TypedValue.applyDimension(1, 36.0F, getResources().getDisplayMetrics()));
    int k = (int)TypedValue.applyDimension(1, a(5.0F), getResources().getDisplayMetrics());
    localLayoutParams4.addRule(5);
    localLayoutParams4.setMargins(k, 0, k, 0);
    localLayoutParams3.setMargins(k, 0, k, 0);
    this.e = new AdMarvelXMLReader();
    this.e.parseXMLString(paramString1);
    this.f = this.e.getParsedXMLData();
    if ((this.f != null) && (this.f.c().containsKey("toolbar")))
    {
      AdMarvelXMLElement localAdMarvelXMLElement1 = (AdMarvelXMLElement)((ArrayList)this.f.c().get("toolbar")).get(0);
      String str1;
      label343: String str2;
      label351: int m;
      label363: int n;
      label412: AdMarvelXMLElement localAdMarvelXMLElement2;
      String str3;
      if (localAdMarvelXMLElement1 == null)
      {
        str1 = null;
        if (str1 == null)
          break label530;
        localShapeDrawable.getPaint().setColor(Color.parseColor(str1));
        if (localAdMarvelXMLElement1 != null)
          break label546;
        str2 = null;
        if (str2 == null)
          break label564;
        m = Integer.parseInt(str2);
        localShapeDrawable.setAlpha(m);
        setBackgroundDrawable(localShapeDrawable);
        if ((localAdMarvelXMLElement1 == null) || (!localAdMarvelXMLElement1.c().containsKey("item")))
          break label674;
        ArrayList localArrayList = (ArrayList)localAdMarvelXMLElement1.c().get("item");
        n = 0;
        if (n >= localArrayList.size())
          break label674;
        localAdMarvelXMLElement2 = (AdMarvelXMLElement)localArrayList.get(n);
        str3 = (String)localAdMarvelXMLElement2.getAttributes().get("type");
        String str4 = (String)localAdMarvelXMLElement2.getAttributes().get("subtype");
        if (!"SystemItem".equalsIgnoreCase(str3))
          break label572;
        if ((!"UIBarButtonSystemItemFlexibleSpace".equalsIgnoreCase(str4)) && (!"UIBarButtonSystemItemFixedSpace".equalsIgnoreCase(str4)))
          a(paramContext, localLayoutParams3, localLayoutParams2, localAdMarvelXMLElement2, this);
      }
      while (true)
      {
        n++;
        break label412;
        str1 = (String)localAdMarvelXMLElement1.getAttributes().get("background");
        break;
        label530: localShapeDrawable.getPaint().setColor(Color.parseColor("#3E3E3E"));
        break label343;
        label546: str2 = (String)localAdMarvelXMLElement1.getAttributes().get("alpha");
        break label351;
        label564: m = 175;
        break label363;
        label572: if ("Title".equalsIgnoreCase(str3))
          b(paramContext, localLayoutParams4, localLayoutParams2, localAdMarvelXMLElement2, this);
        else if ("Image".equalsIgnoreCase(str3))
          c(paramContext, localLayoutParams3, localLayoutParams2, localAdMarvelXMLElement2, this);
        else if (("Timer".equalsIgnoreCase(str3)) && (paramAdMarvelVideoActivity.k > 0))
          this.j = true;
        else if ("Toggle".equalsIgnoreCase(str3))
          a(paramContext, localLayoutParams4, localLayoutParams3, localLayoutParams2, localAdMarvelXMLElement2, this);
      }
    }
    label674: RelativeLayout.LayoutParams localLayoutParams5 = new RelativeLayout.LayoutParams(-1, (int)f1);
    localLayoutParams5.addRule(12);
    localLayoutParams5.addRule(3, AdMarvelInternalWebView.VIEW_ID);
    setLayoutParams(localLayoutParams5);
    if (this.j)
      a(paramContext, localLayoutParams4, localLayoutParams2);
  }

  private float a(float paramFloat)
  {
    return TypedValue.applyDimension(1, paramFloat, getResources().getDisplayMetrics());
  }

  private void a(Context paramContext, RelativeLayout.LayoutParams paramLayoutParams, LinearLayout.LayoutParams paramLayoutParams1)
  {
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setVisibility(4);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams1.gravity = 5;
    localLinearLayout.setOrientation(0);
    localLayoutParams1.weight = 1.0F;
    paramLayoutParams.addRule(15);
    localLinearLayout.setLayoutParams(localLayoutParams1);
    localLinearLayout.setTag(this.d + "TIMER_BUTTON_LAYOUT");
    localLinearLayout.setClickable(false);
    localLinearLayout.addStatesFromChildren();
    localLinearLayout.setGravity(5);
    TextView localTextView = new TextView(paramContext);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams2.setMargins((int)a(5.0F), 0, (int)a(5.0F), 0);
    localTextView.setTextColor(Color.parseColor("#0e78b9"));
    localTextView.setLayoutParams(paramLayoutParams);
    localTextView.setGravity(16);
    localTextView.setTypeface(Typeface.DEFAULT_BOLD);
    localTextView.setSingleLine(true);
    BitmapDrawable localBitmapDrawable = AdMarvelBitmapDrawableUtils.getBitMapDrawable("time", getContext());
    ImageView localImageView = new ImageView(paramContext);
    localImageView.setImageDrawable(localBitmapDrawable);
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams((int)a(32.0F), (int)a(32.0F));
    localLayoutParams3.gravity = 16;
    localLinearLayout.addView(localTextView, localLayoutParams2);
    localLinearLayout.addView(localImageView, localLayoutParams3);
    addView(localLinearLayout);
  }

  private void a(Context paramContext, RelativeLayout.LayoutParams paramLayoutParams, LinearLayout.LayoutParams paramLayoutParams1, AdMarvelXMLElement paramAdMarvelXMLElement, ViewGroup paramViewGroup)
  {
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RectShape());
    localShapeDrawable.getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, a(40.0F), Color.parseColor("#AAFFFFFF"), Color.parseColor("#AA3E3E3E"), Shader.TileMode.REPEAT));
    StateListDrawable localStateListDrawable = new StateListDrawable();
    localStateListDrawable.addState(new int[] { 16842919 }, localShapeDrawable);
    ad.d locald = new ad.d(this, paramContext, paramAdMarvelXMLElement, paramLayoutParams1);
    if (locald.c == null)
      return;
    ImageView localImageView = new ImageView(paramContext);
    localImageView.setLayoutParams(paramLayoutParams);
    locald.setBackgroundDrawable(localStateListDrawable);
    BitmapDrawable localBitmapDrawable;
    if (locald.c.equalsIgnoreCase("done"))
    {
      localBitmapDrawable = AdMarvelBitmapDrawableUtils.getBitMapDrawable("close", getContext());
      LinearLayout localLinearLayout = new LinearLayout(paramContext);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams((int)a(36.0F), (int)a(36.0F));
      paramLayoutParams1.gravity = 53;
      localLinearLayout.addView(localImageView, localLayoutParams);
      localImageView.setTag("ADM_VIDEO_SYSTEM_ICON_DONE_BUTTON");
      a(localLinearLayout);
    }
    while (true)
    {
      localImageView.setImageDrawable(localBitmapDrawable);
      return;
      paramLayoutParams.addRule(15);
      localBitmapDrawable = AdMarvelBitmapDrawableUtils.getBitMapDrawable(locald.c, getContext());
      locald.addView(localImageView);
      paramViewGroup.addView(locald);
    }
  }

  private void a(Context paramContext, RelativeLayout.LayoutParams paramLayoutParams1, RelativeLayout.LayoutParams paramLayoutParams2, LinearLayout.LayoutParams paramLayoutParams, AdMarvelXMLElement paramAdMarvelXMLElement, ViewGroup paramViewGroup)
  {
    while (true)
    {
      ViewSwitcher localViewSwitcher;
      int k;
      AdMarvelXMLElement localAdMarvelXMLElement;
      String str;
      try
      {
        localViewSwitcher = new ViewSwitcher(paramContext);
        localViewSwitcher.setLayoutParams(paramLayoutParams);
        localViewSwitcher.addStatesFromChildren();
        if ((paramAdMarvelXMLElement == null) || (!paramAdMarvelXMLElement.c().containsKey("subitem")))
          break label208;
        this.b = true;
        ArrayList localArrayList = (ArrayList)paramAdMarvelXMLElement.c().get("subitem");
        k = 0;
        if (k >= localArrayList.size())
          break label208;
        localAdMarvelXMLElement = (AdMarvelXMLElement)localArrayList.get(k);
        str = (String)localAdMarvelXMLElement.getAttributes().get("type");
        if ("SystemItem".equalsIgnoreCase(str))
          a(paramContext, paramLayoutParams2, paramLayoutParams, localAdMarvelXMLElement, localViewSwitcher);
        else if ("Title".equalsIgnoreCase(str))
          b(paramContext, paramLayoutParams1, paramLayoutParams, localAdMarvelXMLElement, localViewSwitcher);
      }
      catch (Exception localException)
      {
        Logging.log("Exception in addToggleButton API" + localException.getMessage());
        return;
      }
      if ("Image".equalsIgnoreCase(str))
      {
        c(paramContext, paramLayoutParams2, paramLayoutParams, localAdMarvelXMLElement, localViewSwitcher);
        break label225;
        label208: if (localViewSwitcher.getChildCount() == 2)
          paramViewGroup.addView(localViewSwitcher);
      }
      else
      {
        label225: k++;
      }
    }
  }

  private void a(View paramView)
  {
    if (paramView == null);
    label4: ad.d locald;
    label114: 
    do
    {
      AdMarvelVideoActivity localAdMarvelVideoActivity;
      do
      {
        do
        {
          break label4;
          do
            return;
          while (!(paramView instanceof ad.d));
          locald = (ad.d)paramView;
          localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
          if (localAdMarvelVideoActivity != null)
          {
            localAdMarvelVideoActivity.onUserInteraction();
            if (locald.e != null)
              localAdMarvelVideoActivity.a(locald.e);
          }
          ViewSwitcher localViewSwitcher;
          if ((paramView.getParent() instanceof ViewSwitcher))
          {
            localViewSwitcher = (ViewSwitcher)paramView.getParent();
            if (localViewSwitcher != null)
            {
              if (localViewSwitcher.getDisplayedChild() != 0)
                break label114;
              localViewSwitcher.showNext();
            }
          }
          while ((locald.c != null) && (locald.c.equalsIgnoreCase("open_url")))
          {
            a(locald);
            return;
            localViewSwitcher.showPrevious();
          }
          if ((locald.c == null) || (!locald.c.equalsIgnoreCase("play_movie")))
            break;
        }
        while (locald.b == null);
        a(locald.b);
        return;
        if ((locald.c == null) || (!locald.c.equalsIgnoreCase("done")))
          break;
      }
      while (localAdMarvelVideoActivity == null);
      localAdMarvelVideoActivity.c();
      return;
      if ((locald.c != null) && (locald.c.equalsIgnoreCase("stop")))
      {
        d();
        return;
      }
      if ((locald.c != null) && (locald.c.equalsIgnoreCase("replay")))
      {
        c();
        return;
      }
      if ((locald.c != null) && (locald.c.equalsIgnoreCase("pause")))
      {
        a(true);
        return;
      }
      if ((locald.c != null) && (locald.c.equalsIgnoreCase("resume")))
      {
        e();
        return;
      }
      if ((locald.c != null) && (locald.c.equalsIgnoreCase("mute")))
      {
        f();
        return;
      }
    }
    while ((locald.c == null) || (!locald.c.equalsIgnoreCase("unmute")));
    g();
  }

  private void a(ad.d paramd)
  {
    if (paramd == null);
    while (true)
    {
      return;
      AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
      if (localAdMarvelVideoActivity != null)
      {
        if (paramd.d == ad.c.a)
          a(false);
        while ((paramd.a != null) && (paramd.a.length() > 0))
        {
          if (AdMarvelInterstitialAds.getEnableClickRedirect())
          {
            localAdMarvelVideoActivity.d = true;
            Intent localIntent = new Intent(localAdMarvelVideoActivity, AdMarvelActivity.class);
            localIntent.addFlags(268435456);
            localIntent.putExtra("url", paramd.a);
            localIntent.putExtra("isInterstitial", false);
            localIntent.putExtra("isInterstitialClick", false);
            localIntent.putExtra("GUID", this.d);
            localAdMarvelVideoActivity.startActivity(localIntent);
          }
          AdMarvelInterstitialAds.getListener().a(localAdMarvelVideoActivity, paramd.a, "", 0, null, "");
          return;
          if (paramd.d == ad.c.b)
            d();
          else if (paramd.d == ad.c.c)
            localAdMarvelVideoActivity.c();
        }
      }
    }
  }

  private void a(String paramString)
  {
    if (paramString == null);
    AdMarvelVideoActivity localAdMarvelVideoActivity;
    do
    {
      return;
      localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
    }
    while (localAdMarvelVideoActivity == null);
    localAdMarvelVideoActivity.c(paramString);
  }

  private void a(boolean paramBoolean)
  {
    AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
    if (localAdMarvelVideoActivity != null)
      localAdMarvelVideoActivity.a(paramBoolean);
  }

  @SuppressLint({"NewApi"})
  private void b(Context paramContext, RelativeLayout.LayoutParams paramLayoutParams, LinearLayout.LayoutParams paramLayoutParams1, AdMarvelXMLElement paramAdMarvelXMLElement, ViewGroup paramViewGroup)
  {
    ad.d locald = new ad.d(this, paramContext, paramAdMarvelXMLElement, paramLayoutParams1);
    paramLayoutParams.addRule(15);
    ShapeDrawable localShapeDrawable1 = new ShapeDrawable(new RectShape());
    ShapeDrawable localShapeDrawable2 = new ShapeDrawable(new RectShape());
    localShapeDrawable2.getPaint().setColor(Color.parseColor("#000000FF"));
    localShapeDrawable1.getPaint().setColor(Color.parseColor("#AA3E3E3E"));
    StateListDrawable localStateListDrawable1 = new StateListDrawable();
    localStateListDrawable1.addState(new int[] { 16842919 }, localShapeDrawable1);
    localStateListDrawable1.addState(new int[] { -16842913 }, localShapeDrawable2);
    localStateListDrawable1.addState(new int[] { 16842913 }, localShapeDrawable1);
    StateListDrawable localStateListDrawable2 = new StateListDrawable();
    localStateListDrawable2.addState(new int[] { 16842919 }, localShapeDrawable1);
    if (locald.c == null)
      return;
    String str1 = (String)paramAdMarvelXMLElement.getAttributes().get("title");
    TextView localTextView = new TextView(paramContext);
    localTextView.setLayoutParams(paramLayoutParams);
    localTextView.setBackgroundColor(-16776961);
    localTextView.setGravity(17);
    paramLayoutParams.addRule(15);
    localTextView.setDuplicateParentStateEnabled(true);
    localTextView.setClickable(false);
    localTextView.setSingleLine();
    localTextView.setTextColor(Color.parseColor("#84c043"));
    localTextView.setTypeface(Typeface.DEFAULT_BOLD);
    localTextView.setTextSize(17.0F);
    String str2 = (String)paramAdMarvelXMLElement.getAttributes().get("color");
    String str3 = (String)paramAdMarvelXMLElement.getAttributes().get("textSize");
    if ((str2 != null) && (str2.length() > 0))
    {
      localTextView.setTextColor(Color.parseColor(str2));
      localTextView.setTypeface(Typeface.DEFAULT_BOLD);
      if (str3 == null);
    }
    try
    {
      localTextView.setTextSize(Integer.parseInt(str3));
      if (ac.a() >= 16)
      {
        localTextView.setBackground(localStateListDrawable1);
        if ((str1 != null) && (str1.length() > 0))
          localTextView.setText(str1);
        locald.setBackgroundDrawable(localStateListDrawable2);
        if (!locald.c.equalsIgnoreCase("done"))
          break label536;
        LinearLayout localLinearLayout = new LinearLayout(paramContext);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        paramLayoutParams1.gravity = 5;
        localTextView.setLayoutParams(paramLayoutParams);
        localLinearLayout.setLayoutParams(localLayoutParams);
        localTextView.setTag("ADM_VIDEO_CUSTOM_DONE_BUTTON");
        if ((str1 != null) && (str1.length() > 0))
          localTextView.setText(str1);
        localLinearLayout.addView(localTextView);
        a(localLinearLayout);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        localTextView.setTextSize(18.0F);
        Logging.log("Exception in setting Done button text size" + localException.getMessage());
        continue;
        localTextView.setBackgroundDrawable(localStateListDrawable1);
      }
      label536: locald.addView(localTextView);
      paramViewGroup.addView(locald, paramLayoutParams);
    }
  }

  private void c()
  {
    AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
    if (localAdMarvelVideoActivity != null)
      localAdMarvelVideoActivity.f();
  }

  private void c(Context paramContext, RelativeLayout.LayoutParams paramLayoutParams, LinearLayout.LayoutParams paramLayoutParams1, AdMarvelXMLElement paramAdMarvelXMLElement, ViewGroup paramViewGroup)
  {
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RectShape());
    localShapeDrawable.getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, a(40.0F), Color.parseColor("#AAFFFFFF"), Color.parseColor("#AA3E3E3E"), Shader.TileMode.REPEAT));
    StateListDrawable localStateListDrawable = new StateListDrawable();
    localStateListDrawable.addState(new int[] { 16842919 }, localShapeDrawable);
    ad.d locald = new ad.d(this, paramContext, paramAdMarvelXMLElement, paramLayoutParams1);
    if (locald.c == null);
    Object localObject;
    String str1;
    String str2;
    AdMarvelVideoActivity localAdMarvelVideoActivity;
    do
    {
      return;
      localObject = (String)paramAdMarvelXMLElement.getAttributes().get("image");
      str1 = (String)paramAdMarvelXMLElement.getAttributes().get("image_high");
      str2 = (String)paramAdMarvelXMLElement.getAttributes().get("image_retina");
      localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
    }
    while (localAdMarvelVideoActivity == null);
    float f1 = ab.i(localAdMarvelVideoActivity);
    if (f1 > 1.0F)
    {
      if ((f1 <= 1.0F) || (f1 >= 2.0F))
        break label377;
      if ((str1 != null) && (str1.length() > 0))
        localObject = str1;
    }
    paramLayoutParams.width = ((int)a(32.0F));
    paramLayoutParams.height = ((int)a(32.0F));
    paramLayoutParams.addRule(13);
    ImageView localImageView = new ImageView(paramContext);
    localImageView.setLayoutParams(paramLayoutParams);
    if (ac.a() >= 11)
      localAdMarvelVideoActivity.a().post(new ad.b(this, localImageView, (String)localObject));
    while (true)
    {
      locald.setBackgroundDrawable(localStateListDrawable);
      if (!locald.c.equalsIgnoreCase("done"))
        break label423;
      LinearLayout localLinearLayout = new LinearLayout(paramContext);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams((int)a(40.0F), (int)a(40.0F));
      paramLayoutParams1.weight = 25.0F;
      paramLayoutParams1.gravity = 5;
      localLinearLayout.addView(localImageView, localLayoutParams);
      localImageView.setTag("ADM_VIDEO_IMAGE_ICON_DONE_BUTTON");
      a(localLinearLayout);
      return;
      label377: if ((str2 == null) || (str2.length() <= 0))
        break;
      localObject = str2;
      break;
      new ad.a(this, localImageView).execute(new String[] { localObject });
    }
    label423: locald.addView(localImageView);
    paramViewGroup.addView(locald);
  }

  private void d()
  {
    AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
    if (localAdMarvelVideoActivity != null)
      localAdMarvelVideoActivity.d();
  }

  private void e()
  {
    AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
    if (localAdMarvelVideoActivity != null)
      localAdMarvelVideoActivity.e();
  }

  private void f()
  {
    AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
    p localp = (p)this.h.get();
    if (localp != null)
      localp.b();
    if (localAdMarvelVideoActivity != null)
      localAdMarvelVideoActivity.j = AdMarvelVideoActivity.m.a;
  }

  private void g()
  {
    AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
    p localp = (p)this.h.get();
    if (localp != null)
      localp.c();
    if (localAdMarvelVideoActivity != null)
      localAdMarvelVideoActivity.j = AdMarvelVideoActivity.m.b;
  }

  public LinearLayout a()
  {
    return this.c;
  }

  public void a(LinearLayout paramLinearLayout)
  {
    this.c = paramLinearLayout;
  }

  public boolean b()
  {
    return this.i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.ad
 * JD-Core Version:    0.6.2
 */