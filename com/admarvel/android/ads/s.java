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
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
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

class s extends LinearLayout
{
  static int a = 100001;
  public boolean b = false;
  s.d c;
  final String d;
  AdMarvelXMLReader e;
  AdMarvelXMLElement f;
  private final WeakReference<AdMarvelVideoActivity> g;
  private final WeakReference<j> h;
  private boolean i;
  private boolean j = false;

  s(j paramj, AdMarvelVideoActivity paramAdMarvelVideoActivity, Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    this.g = new WeakReference(paramAdMarvelVideoActivity);
    this.h = new WeakReference(paramj);
    this.i = false;
    this.d = paramString2;
    setId(a);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -1);
    localLayoutParams1.gravity = 16;
    setLayoutParams(localLayoutParams1);
    setGravity(16);
    HorizontalScrollView localHorizontalScrollView = new HorizontalScrollView(paramContext);
    localHorizontalScrollView.setHorizontalScrollBarEnabled(false);
    localHorizontalScrollView.setVerticalScrollBarEnabled(false);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(0, -1);
    localLayoutParams2.weight = 1.0F;
    localHorizontalScrollView.setLayoutParams(localLayoutParams2);
    addView(localHorizontalScrollView);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
    localHorizontalScrollView.addView(localLinearLayout);
    this.e = new AdMarvelXMLReader();
    this.e.parseXMLString(paramString1);
    this.f = this.e.getParsedXMLData();
    if ((this.f != null) && (this.f.getChildren().containsKey("toolbar")))
    {
      AdMarvelXMLElement localAdMarvelXMLElement1 = (AdMarvelXMLElement)((ArrayList)this.f.getChildren().get("toolbar")).get(0);
      String str1;
      ShapeDrawable localShapeDrawable;
      label293: String str2;
      label301: int m;
      label313: label359: AdMarvelXMLElement localAdMarvelXMLElement2;
      String str3;
      if (localAdMarvelXMLElement1 == null)
      {
        str1 = null;
        localShapeDrawable = new ShapeDrawable(new RectShape());
        if (str1 == null)
          break label439;
        localShapeDrawable.getPaint().setColor(Color.parseColor(str1));
        str2 = null;
        if (localAdMarvelXMLElement1 != null)
          break label455;
        if (str2 == null)
          break label473;
        m = Integer.parseInt(str2);
        localShapeDrawable.setAlpha(m);
        setBackgroundDrawable(localShapeDrawable);
        if ((localAdMarvelXMLElement1 == null) || (!localAdMarvelXMLElement1.getChildren().containsKey("item")))
          break label572;
        ArrayList localArrayList = (ArrayList)localAdMarvelXMLElement1.getChildren().get("item");
        if (k >= localArrayList.size())
          break label572;
        localAdMarvelXMLElement2 = (AdMarvelXMLElement)localArrayList.get(k);
        str3 = (String)localAdMarvelXMLElement2.getAttributes().get("type");
        if (!"SystemItem".equalsIgnoreCase(str3))
          break label481;
        a(paramContext, localAdMarvelXMLElement2, localLinearLayout);
      }
      while (true)
      {
        k++;
        break label359;
        str1 = (String)localAdMarvelXMLElement1.getAttributes().get("background");
        break;
        label439: localShapeDrawable.getPaint().setColor(Color.parseColor("#3E3E3E"));
        break label293;
        label455: str2 = (String)localAdMarvelXMLElement1.getAttributes().get("alpha");
        break label301;
        label473: m = 175;
        break label313;
        label481: if ("Title".equalsIgnoreCase(str3))
          b(paramContext, localAdMarvelXMLElement2, localLinearLayout);
        else if ("Image".equalsIgnoreCase(str3))
          c(paramContext, localAdMarvelXMLElement2, localLinearLayout);
        else if (("Timer".equalsIgnoreCase(str3)) && (paramAdMarvelVideoActivity.k > 0))
          this.j = true;
        else if ("Toggle".equalsIgnoreCase(str3))
          d(paramContext, localAdMarvelXMLElement2, localLinearLayout);
      }
    }
    label572: RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, (int)TypedValue.applyDimension(1, 40.0F, getResources().getDisplayMetrics()));
    localLayoutParams.addRule(12);
    localLayoutParams.addRule(3, d.a);
    setLayoutParams(localLayoutParams);
    if (this.j)
      a(paramContext);
  }

  private float a(float paramFloat)
  {
    return TypedValue.applyDimension(1, paramFloat, getResources().getDisplayMetrics());
  }

  private void a(Context paramContext)
  {
    new LinearLayout.LayoutParams(-2, -1).gravity = 3;
    int k = (int)TypedValue.applyDimension(1, 5.0F, getResources().getDisplayMetrics());
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, (int)TypedValue.applyDimension(1, 36.0F, getResources().getDisplayMetrics()));
    localLayoutParams.addRule(5);
    localLayoutParams.setMargins(k, 0, k, 0);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setVisibility(4);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams1.gravity = 5;
    localLinearLayout.setOrientation(0);
    localLayoutParams.addRule(15);
    localLinearLayout.setLayoutParams(localLayoutParams1);
    localLinearLayout.setTag(this.d + "TIMER_BUTTON_LAYOUT");
    localLinearLayout.setClickable(false);
    localLinearLayout.addStatesFromChildren();
    localLinearLayout.setGravity(5);
    TextView localTextView = new TextView(paramContext);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams2.setMargins((int)a(5.0F), 0, (int)a(5.0F), 0);
    localTextView.setTextColor(Color.parseColor("#0e78b9"));
    localTextView.setLayoutParams(localLayoutParams);
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

  private void a(Context paramContext, AdMarvelXMLElement paramAdMarvelXMLElement, ViewGroup paramViewGroup)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams.gravity = 3;
    int k = (int)TypedValue.applyDimension(1, 5.0F, getResources().getDisplayMetrics());
    float f1 = TypedValue.applyDimension(1, 32.0F, getResources().getDisplayMetrics());
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams((int)f1, (int)f1);
    localLayoutParams1.addRule(5);
    localLayoutParams1.setMargins(k, 0, k, 0);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RectShape());
    localShapeDrawable.getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, a(40.0F), Color.parseColor("#AAFFFFFF"), Color.parseColor("#AA3E3E3E"), Shader.TileMode.REPEAT));
    StateListDrawable localStateListDrawable = new StateListDrawable();
    localStateListDrawable.addState(new int[] { 16842919 }, localShapeDrawable);
    s.d locald = new s.d(this, paramContext, paramAdMarvelXMLElement, localLayoutParams);
    if (locald.c == null)
      return;
    ImageView localImageView = new ImageView(paramContext);
    localImageView.setLayoutParams(localLayoutParams1);
    BitmapDrawable localBitmapDrawable;
    if (locald.c.equalsIgnoreCase("done"))
    {
      localBitmapDrawable = AdMarvelBitmapDrawableUtils.getBitMapDrawable("close", getContext());
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams((int)a(36.0F), (int)a(36.0F));
      localLayoutParams.gravity = 53;
      locald.addView(localImageView, localLayoutParams2);
      localImageView.setTag("ADM_VIDEO_SYSTEM_ICON_DONE_BUTTON");
      a(locald);
    }
    while (true)
    {
      localImageView.setImageDrawable(localBitmapDrawable);
      return;
      locald.setBackgroundDrawable(localStateListDrawable);
      localLayoutParams1.addRule(15);
      localBitmapDrawable = AdMarvelBitmapDrawableUtils.getBitMapDrawable(locald.c, getContext());
      locald.addView(localImageView);
      paramViewGroup.addView(locald);
    }
  }

  private void a(View paramView)
  {
    if (paramView == null);
    label4: s.d locald;
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
          while (!(paramView instanceof s.d));
          locald = (s.d)paramView;
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
            b(locald);
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
    localAdMarvelVideoActivity.b(paramString);
  }

  private void a(boolean paramBoolean)
  {
    AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
    if (localAdMarvelVideoActivity != null)
      localAdMarvelVideoActivity.a(paramBoolean);
  }

  @SuppressLint({"NewApi"})
  private void b(Context paramContext, AdMarvelXMLElement paramAdMarvelXMLElement, ViewGroup paramViewGroup)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams.gravity = 3;
    int k = (int)TypedValue.applyDimension(1, 5.0F, getResources().getDisplayMetrics());
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, (int)TypedValue.applyDimension(1, 36.0F, getResources().getDisplayMetrics()));
    localLayoutParams1.addRule(5);
    localLayoutParams1.setMargins(k, 0, k, 0);
    s.d locald = new s.d(this, paramContext, paramAdMarvelXMLElement, localLayoutParams);
    localLayoutParams1.addRule(15);
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
    localTextView.setLayoutParams(localLayoutParams1);
    localTextView.setBackgroundColor(-16776961);
    localTextView.setGravity(17);
    localLayoutParams1.addRule(15);
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
      if ((str1 != null) && (str1.length() > 0))
        localTextView.setText(str1);
      if (Version.getAndroidSDKVersion() >= 16)
      {
        localTextView.setBackground(localStateListDrawable1);
        locald.setBackgroundDrawable(localStateListDrawable2);
        if (!locald.c.equalsIgnoreCase("done"))
          break label567;
        localLayoutParams1.setMargins(0, 0, 0, 0);
        localTextView.setLayoutParams(localLayoutParams1);
        localTextView.setTag("ADM_VIDEO_CUSTOM_DONE_BUTTON");
        locald.addView(localTextView);
        a(locald);
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
      label567: locald.addView(localTextView);
      paramViewGroup.addView(locald, localLayoutParams1);
    }
  }

  private void b(s.d paramd)
  {
    if (paramd == null);
    while (true)
    {
      return;
      AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
      if (localAdMarvelVideoActivity != null)
      {
        if (paramd.d == s.c.a)
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
          if (paramd.d == s.c.b)
            d();
          else if (paramd.d == s.c.c)
            localAdMarvelVideoActivity.c();
        }
      }
    }
  }

  private void c()
  {
    AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
    if (localAdMarvelVideoActivity != null)
      localAdMarvelVideoActivity.f();
  }

  private void c(Context paramContext, AdMarvelXMLElement paramAdMarvelXMLElement, ViewGroup paramViewGroup)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    localLayoutParams.gravity = 3;
    int k = (int)TypedValue.applyDimension(1, 5.0F, getResources().getDisplayMetrics());
    float f1 = TypedValue.applyDimension(1, 32.0F, getResources().getDisplayMetrics());
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams((int)f1, (int)f1);
    localLayoutParams1.addRule(5);
    localLayoutParams1.setMargins(k, 0, k, 0);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RectShape());
    localShapeDrawable.getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, a(40.0F), Color.parseColor("#AAFFFFFF"), Color.parseColor("#AA3E3E3E"), Shader.TileMode.REPEAT));
    StateListDrawable localStateListDrawable = new StateListDrawable();
    localStateListDrawable.addState(new int[] { 16842919 }, localShapeDrawable);
    s.d locald = new s.d(this, paramContext, paramAdMarvelXMLElement, localLayoutParams);
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
    float f2 = r.i(localAdMarvelVideoActivity);
    if (f2 > 1.0F)
    {
      if ((f2 <= 1.0F) || (f2 >= 2.0F))
        break label440;
      if ((str1 != null) && (str1.length() > 0))
        localObject = str1;
    }
    localLayoutParams1.width = ((int)a(32.0F));
    localLayoutParams1.height = ((int)a(32.0F));
    localLayoutParams1.addRule(13);
    ImageView localImageView = new ImageView(paramContext);
    localImageView.setLayoutParams(localLayoutParams1);
    if (Version.getAndroidSDKVersion() >= 11)
      localAdMarvelVideoActivity.a().post(new s.b(this, localImageView, (String)localObject));
    while (true)
    {
      if (!locald.c.equalsIgnoreCase("done"))
        break label486;
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams((int)a(36.0F), (int)a(36.0F));
      localLayoutParams.gravity = 53;
      locald.addView(localImageView, localLayoutParams2);
      localImageView.setTag("ADM_VIDEO_IMAGE_ICON_DONE_BUTTON");
      a(locald);
      return;
      label440: if ((str2 == null) || (str2.length() <= 0))
        break;
      localObject = str2;
      break;
      new s.a(this, localImageView).execute(new String[] { localObject });
    }
    label486: locald.setBackgroundDrawable(localStateListDrawable);
    locald.addView(localImageView);
    paramViewGroup.addView(locald);
  }

  private void d()
  {
    AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
    if (localAdMarvelVideoActivity != null)
      localAdMarvelVideoActivity.d();
  }

  private void d(Context paramContext, AdMarvelXMLElement paramAdMarvelXMLElement, ViewGroup paramViewGroup)
  {
    while (true)
    {
      ViewSwitcher localViewSwitcher;
      int k;
      AdMarvelXMLElement localAdMarvelXMLElement;
      String str;
      try
      {
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
        localLayoutParams.gravity = 3;
        localViewSwitcher = new ViewSwitcher(paramContext);
        localViewSwitcher.setLayoutParams(localLayoutParams);
        localViewSwitcher.addStatesFromChildren();
        if ((paramAdMarvelXMLElement == null) || (!paramAdMarvelXMLElement.getChildren().containsKey("subitem")))
          break label214;
        this.b = true;
        ArrayList localArrayList = (ArrayList)paramAdMarvelXMLElement.getChildren().get("subitem");
        k = 0;
        if (k >= localArrayList.size())
          break label214;
        localAdMarvelXMLElement = (AdMarvelXMLElement)localArrayList.get(k);
        str = (String)localAdMarvelXMLElement.getAttributes().get("type");
        if ("SystemItem".equalsIgnoreCase(str))
          a(paramContext, localAdMarvelXMLElement, localViewSwitcher);
        else if ("Title".equalsIgnoreCase(str))
          b(paramContext, localAdMarvelXMLElement, localViewSwitcher);
      }
      catch (Exception localException)
      {
        Logging.log("Exception in addToggleButton API" + localException.getMessage());
        return;
      }
      if ("Image".equalsIgnoreCase(str))
      {
        c(paramContext, localAdMarvelXMLElement, localViewSwitcher);
        break label230;
        label214: if (localViewSwitcher.getChildCount() == 2)
          paramViewGroup.addView(localViewSwitcher);
      }
      else
      {
        label230: k++;
      }
    }
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
    j localj = (j)this.h.get();
    if (localj != null)
      localj.b();
    if (localAdMarvelVideoActivity != null)
      localAdMarvelVideoActivity.j = AdMarvelVideoActivity.l.a;
  }

  private void g()
  {
    AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)this.g.get();
    j localj = (j)this.h.get();
    if (localj != null)
      localj.c();
    if (localAdMarvelVideoActivity != null)
      localAdMarvelVideoActivity.j = AdMarvelVideoActivity.l.b;
  }

  public s.d a()
  {
    return this.c;
  }

  public void a(s.d paramd)
  {
    this.c = paramd;
  }

  public boolean b()
  {
    return this.i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.s
 * JD-Core Version:    0.6.2
 */