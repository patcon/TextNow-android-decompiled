package com.flurry.sdk;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.flurry.android.AdCreative;
import com.flurry.android.ICustomAdNetworkHandler;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdFrame;
import com.flurry.android.impl.ads.avro.protocol.v10.AdSpaceLayout;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class j extends ah
{
  private static final String a = j.class.getSimpleName();
  private static final Map<Class<? extends ViewGroup>, j.c> b = f();
  private i c;

  public j(FlurryAdModule paramFlurryAdModule, AdUnit paramAdUnit, e parame)
  {
    super(paramFlurryAdModule, paramAdUnit, parame);
  }

  private int a(ViewGroup paramViewGroup)
  {
    int i = paramViewGroup.getChildCount();
    if ((c() == null) || (c().d().size() <= 0))
      return i;
    AdSpaceLayout localAdSpaceLayout = ((AdFrame)c().d().get(0)).e();
    if (localAdSpaceLayout != null)
    {
      String[] arrayOfString = localAdSpaceLayout.f().toString().split("-");
      if ((arrayOfString.length == 2) && ("t".equals(arrayOfString[0])))
        return 0;
    }
    return i;
  }

  private ViewGroup.LayoutParams a(ViewGroup paramViewGroup, l paraml)
  {
    ViewGroup.LayoutParams localLayoutParams;
    if ((c() == null) || (c().d().size() <= 0))
      localLayoutParams = null;
    do
    {
      return localLayoutParams;
      AdSpaceLayout localAdSpaceLayout = ((AdFrame)c().d().get(0)).e();
      if (localAdSpaceLayout == null)
        return null;
      j.c localc = b(paramViewGroup);
      if (localc == null)
      {
        eo.a(5, a, "Ad space layout and alignment from the server is being ignored for ViewGroup subclass " + paramViewGroup.getClass().getSimpleName());
        return null;
      }
      localLayoutParams = localc.a(localAdSpaceLayout);
    }
    while (localLayoutParams != null);
    eo.a(6, a, "Ad space layout and alignment from the server is being ignored for ViewGroup subclass " + paramViewGroup.getClass().getSimpleName());
    return localLayoutParams;
  }

  private void a(Context paramContext, ViewGroup paramViewGroup, FlurryAdModule paramFlurryAdModule)
  {
    l locall = paramFlurryAdModule.a(paramContext, paramViewGroup, e());
    if (locall == null)
    {
      eo.a(6, a, "failed to render banner ad for holder = " + locall + " for adSpaceName = " + e());
      return;
    }
    ViewGroup localViewGroup1 = (ViewGroup)locall.getParent();
    if (localViewGroup1 != null)
      localViewGroup1.removeView(locall);
    locall.d();
    locall.removeAllViews();
    ViewGroup localViewGroup2 = (ViewGroup)this.c.getParent();
    if (localViewGroup2 != null)
      localViewGroup2.removeView(this.c);
    locall.addView(this.c, new RelativeLayout.LayoutParams(-1, -1));
    this.c.initLayout();
    ViewGroup.LayoutParams localLayoutParams = a(paramViewGroup, locall);
    if (localLayoutParams != null)
    {
      locall.setLayoutParams(localLayoutParams);
      eo.a(3, a, "banner ad holder layout params = " + localLayoutParams.getClass().getName() + " {width = " + localLayoutParams.width + ", height = " + localLayoutParams.height + "} for banner ad with adSpaceName = " + e());
    }
    paramViewGroup.addView(locall, a(paramViewGroup));
  }

  private static j.c b(ViewGroup paramViewGroup)
  {
    return (j.c)b.get(paramViewGroup.getClass());
  }

  private static Map<Class<? extends ViewGroup>, j.c> f()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(LinearLayout.class, new j.d());
    localHashMap.put(AbsoluteLayout.class, new j.a());
    localHashMap.put(FrameLayout.class, new j.b());
    localHashMap.put(RelativeLayout.class, new j.e());
    return Collections.unmodifiableMap(localHashMap);
  }

  public final void a(Context paramContext, ViewGroup paramViewGroup)
  {
    eo.a(3, a, "render(" + paramContext + ", " + paramViewGroup + ")");
    if ((paramContext == null) || (paramViewGroup == null))
    {
      eo.a(6, a, "failed to render banner ad for adspace: " + e() + " context: " + paramContext + " viewGroup: " + paramViewGroup);
      return;
    }
    FlurryAdModule localFlurryAdModule = b();
    AdUnit localAdUnit = c();
    e locale = d();
    if (localAdUnit == null)
    {
      eo.a(6, a, "failed to render banner ad, adUnit is null for adspace: " + e() + " context: " + paramContext + " viewGroup: " + paramViewGroup);
      return;
    }
    List localList = localAdUnit.d();
    if ((localList == null) || (localList.isEmpty()))
    {
      eo.a(6, a, "failed to render banner ad, no adFrames for adspace: " + e() + " context: " + paramContext + " viewGroup: " + paramViewGroup);
      return;
    }
    AdFrame localAdFrame = (AdFrame)localList.get(0);
    int i = localAdFrame.b().intValue();
    String str = localAdFrame.d().toString();
    AdCreative localAdCreative = cc.a(localAdFrame.e());
    ICustomAdNetworkHandler localICustomAdNetworkHandler = localFlurryAdModule.q();
    k localk = localFlurryAdModule.b();
    if ((i == 4) && (localICustomAdNetworkHandler != null))
    {
      this.c = localICustomAdNetworkHandler.getAdFromNetwork(paramContext, localAdCreative, str);
      if (this.c != null)
      {
        this.c.setPlatformModule(localFlurryAdModule);
        this.c.setAdLog(locale);
        this.c.setAdFrameIndex(0);
        this.c.setAdUnit(localAdUnit);
      }
    }
    while (this.c == null)
    {
      eo.d(a, "Failed to create view for ad network: " + str + ", network is unsupported on Android, or no ICustomAdNetworkHandler was registered or it failed to return a view.");
      HashMap localHashMap = new HashMap();
      localHashMap.put("errorCode", Integer.toString(b.p.a()));
      if (i == 4)
        localHashMap.put("binding_3rd_party", Integer.toString(4));
      localFlurryAdModule.a(new q("renderFailed", localHashMap, paramContext, localAdUnit, locale, 0), localFlurryAdModule.a(), 1);
      return;
      this.c = localk.a(paramContext, localFlurryAdModule, locale, localAdUnit);
    }
    a(paramContext, paramViewGroup, localFlurryAdModule);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.j
 * JD-Core Version:    0.6.2
 */