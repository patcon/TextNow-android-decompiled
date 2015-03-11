package com.flurry.sdk;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Toast;
import com.flurry.android.FlurryAdSize;
import com.flurry.android.FlurryFullscreenTakeoverActivity;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdFrame;
import com.flurry.android.impl.ads.avro.protocol.v10.AdSpaceLayout;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r
  implements ad
{
  private static final String d = r.class.getSimpleName();
  private static int e = 0;
  FlurryAdModule a;
  y b;
  ag c;
  private boolean f = true;

  public r(FlurryAdModule paramFlurryAdModule)
  {
    this.a = paramFlurryAdModule;
    this.c = new ag(paramFlurryAdModule);
    this.b = y.a();
  }

  private void a(a parama, String paramString, int paramInt)
  {
    Context localContext = parama.c.a();
    e locale = parama.c.d;
    AdUnit localAdUnit = parama.c.c;
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", parama.c.a);
    localHashMap.put("url", paramString);
    localHashMap.put("response", paramInt + "");
    this.a.a(new q("sendUrlStatusResult", localHashMap, localContext, localAdUnit, locale, parama.c.e), this, 0);
  }

  private void a(final a parama, final String paramString, final int paramInt1, final r.b paramb, int paramInt2)
  {
    if (paramInt1 >= 5)
    {
      eo.a(5, d, "No response for url: " + paramString);
      if (paramInt2 != 0)
        a(parama, paramString, paramInt2);
      if (paramb != null)
        paramb.a(true);
      return;
    }
    el localel = new el();
    localel.a(paramString);
    localel.a(new el.a()
    {
      public void a(el<Void, Void> paramAnonymousel, Void paramAnonymousVoid)
      {
        final int i = paramAnonymousel.e();
        if ((eo.c() <= 3) && (eo.d()))
          do.a().a(new Runnable()
          {
            public void run()
            {
              Toast.makeText(do.a().b(), "sUUS HTTP Response Code: " + i, 0).show();
            }
          });
        if (i == 200)
        {
          eo.a(3, r.b(), "URL hit succeeded for: " + paramString);
          r.a(r.this, parama, paramString, i);
          if (paramb != null)
            paramb.a(true);
          return;
        }
        r.a(r.this, parama, paramString, 1 + paramInt1, paramb, i);
      }
    });
    em.a().a(this, localel);
  }

  private void a(final String paramString1, String paramString2, final int paramInt, final r.a parama)
  {
    if (parama == null);
    final String str;
    do
    {
      return;
      if ((paramString1 == null) || (paramString2 == null))
      {
        parama.a(null);
        return;
      }
      if (paramInt >= 5)
      {
        parama.a(null);
        return;
      }
      str = cf.a(paramString2);
    }
    while (TextUtils.isEmpty(str));
    if (str.startsWith("http"))
    {
      el localel = new el();
      localel.a(str);
      localel.a(false);
      localel.a(new el.a()
      {
        public void a(el<Void, Void> paramAnonymousel, Void paramAnonymousVoid)
        {
          final int i = paramAnonymousel.e();
          if ((eo.c() <= 3) && (eo.d()))
            do.a().a(new Runnable()
            {
              public void run()
              {
                Toast.makeText(do.a().b(), "pRU HTTP Response Code: " + i, 0).show();
              }
            });
          if (i == 200)
          {
            eo.a(3, r.b(), "Redirect URL found for: " + paramString1);
            parama.a(str);
            return;
          }
          if ((i >= 300) && (i < 400))
          {
            eo.a(3, r.b(), "Num redirects: " + (1 + paramInt));
            List localList = paramAnonymousel.b("Location");
            if ((localList != null) && (localList.size() > 0))
            {
              r.a(r.this, paramString1, (String)localList.get(0), 1 + paramInt, parama);
              return;
            }
            eo.a(3, r.b(), "No location for redirect url: " + str);
          }
          while (true)
          {
            parama.a(null);
            return;
            eo.a(3, r.b(), "Bad Response status code: " + i);
          }
        }
      });
      em.a().a(this, localel);
      return;
    }
    if (a(str, "android.intent.action.VIEW"))
    {
      parama.a(str);
      return;
    }
    if ((!TextUtils.isEmpty(str)) && (str.startsWith("market://")))
    {
      parama.a(str);
      return;
    }
    parama.a(null);
  }

  private boolean a(AdUnit paramAdUnit)
  {
    if ((paramAdUnit != null) && (paramAdUnit.d().size() > 0))
      return ((AdFrame)paramAdUnit.d().get(0)).e().e().toString().equalsIgnoreCase("banner");
    return false;
  }

  public int a(a parama)
  {
    String str = parama.c.c.b().toString();
    return this.a.d().c().c(str);
  }

  Intent a(Intent paramIntent, String paramString)
  {
    Intent localIntent;
    if (fe.b(paramIntent))
      localIntent = new Intent(paramIntent);
    while (true)
    {
      if (localIntent != null)
        localIntent.putExtra("adSpaceName", paramString);
      return localIntent;
      localIntent = new Intent(do.a().b(), FlurryFullscreenTakeoverActivity.class);
      localIntent.putExtra("targetIntent", paramIntent);
    }
  }

  public String a(e parame, AdUnit paramAdUnit, a parama, String paramString)
  {
    Pattern localPattern = Pattern.compile(".*?(%\\{\\w+\\}).*?");
    Matcher localMatcher = localPattern.matcher(paramString);
    String str = paramString;
    while (localMatcher.matches())
    {
      str = this.c.a(parame, paramAdUnit, parama, str, localMatcher.group(1));
      localMatcher = localPattern.matcher(str);
    }
    return str;
  }

  public void a()
  {
    this.f = b(null);
  }

  void a(Context paramContext, String paramString, AdUnit paramAdUnit)
  {
    Intent localIntent = do.a().c().getLaunchIntentForPackage(paramString);
    if ((localIntent != null) && (fe.a(localIntent)))
    {
      a(paramContext, localIntent, paramAdUnit.b().toString());
      return;
    }
    a(paramContext, "https://play.google.com/store/apps/details?id=" + paramString, false, paramAdUnit, true);
  }

  public void a(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)));
    do
    {
      return;
      if (!paramString1.startsWith("market://details?id="))
        break label116;
      if (!this.f)
        break;
    }
    while (d(paramContext, paramString1, paramString2));
    eo.a(6, d, "Cannot launch Google Play url " + paramString1);
    return;
    String str = paramString1.substring("market://details?id=".length());
    d(paramContext, "https://market.android.com/details?id=" + str, paramString2);
    return;
    label116: eo.a(5, d, "Unexpected Google Play url scheme: " + paramString1);
  }

  public void a(Context paramContext, String paramString1, boolean paramBoolean, AdUnit paramAdUnit, String paramString2)
  {
    if (paramContext == null)
    {
      eo.a(5, d, "Cannot process redirect, null context");
      return;
    }
    am localam = this.a.c(paramString2);
    if (localam.h())
    {
      localam.g(false);
      if ((paramContext instanceof FlurryFullscreenTakeoverActivity))
        ((FlurryFullscreenTakeoverActivity)paramContext).setVideoMoreInfoInProgress(localam);
    }
    a(paramContext, paramString1, paramBoolean, paramAdUnit, false);
  }

  void a(final Context paramContext, final String paramString, final boolean paramBoolean1, final AdUnit paramAdUnit, final boolean paramBoolean2)
  {
    if (paramContext == null)
    {
      eo.a(5, d, "Unable to launch url, null context");
      return;
    }
    this.a.b(new ff()
    {
      public void a()
      {
        if (paramString != null)
        {
          String str2 = paramAdUnit.b().toString();
          String str3 = cf.a(paramString);
          eo.a(5, r.b(), "Generic Launch of " + str3);
          if (TextUtils.isEmpty(str3));
          label206: label231: 
          do
          {
            while (true)
            {
              return;
              if (str3.startsWith("market://"))
              {
                r.this.a(paramContext, str3, str2);
                return;
              }
              if (!str3.startsWith("http"))
                break label231;
              if (cf.e(str3));
              for (boolean bool = r.this.b(paramContext, str3, str2); !bool; bool = r.this.c(paramContext, str3, str2))
              {
                Intent localIntent = new Intent(do.a().b(), FlurryFullscreenTakeoverActivity.class);
                localIntent.putExtra("url", str3);
                localIntent.putExtra("should_close_ad", paramBoolean2);
                if ((!paramBoolean1) || (!fe.a(localIntent)))
                  break label206;
                r.this.a(paramContext, localIntent, str2);
                return;
              }
            }
            eo.a(6, r.b(), "Unable to launch FlurryFullscreenTakeoverActivity, falling back to browser. Fix by declaring this Activity in your AndroidManifest.xml");
            r.this.d(paramContext, str3, str2);
            return;
          }
          while (r.this.d(paramContext, str3, str2));
          eo.a(5, r.b(), "Failed to launch intent for:" + str3);
          return;
        }
        String str1 = "Unable to launch intent for: " + paramString;
        eo.a(5, r.b(), str1);
      }
    });
  }

  void a(a parama, int paramInt)
  {
    e = a(parama);
    if (paramInt > e)
    {
      eo.a(5, d, "Maximum depth for event/action loop exceeded when performing next AdUnit:");
      return;
    }
    final Context localContext = parama.c.a();
    AdUnit localAdUnit = parama.c.c;
    final String str = localAdUnit.b().toString();
    boolean bool1 = parama.b.containsKey("delay");
    final boolean bool2 = a(localAdUnit, parama.c.e);
    if (bool1);
    final l locall;
    while (true)
    {
      try
      {
        long l2 = Long.parseLong((String)parama.b.get("delay"));
        l1 = l2;
        locall = this.a.d().c(str);
        if ((locall == null) || (!bool1) || (!bool2))
          break;
        locall.a(l1 * 1000L);
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        eo.a(6, d, "caught NumberFormatException with delay parameter in nextAdUnit:" + (String)parama.b.get("delay"));
      }
      long l1 = 30L;
    }
    if (locall != null)
    {
      do.a().c(new ff()
      {
        public void a()
        {
          u localu = r.this.a.d();
          Context localContext = localContext;
          String str = str;
          ViewGroup localViewGroup = locall.getViewGroup();
          if (bool2);
          for (FlurryAdSize localFlurryAdSize = FlurryAdSize.BANNER_BOTTOM; ; localFlurryAdSize = FlurryAdSize.FULLSCREEN)
          {
            localu.a(localContext, str, localViewGroup, localFlurryAdSize, true);
            return;
          }
        }
      });
      return;
    }
    if (bool2 == true)
    {
      do.a().c(new ff()
      {
        public void a()
        {
          r.this.a.d().a(localContext, str, null, FlurryAdSize.BANNER_BOTTOM, false);
        }
      });
      return;
    }
    do.a().c(new ff()
    {
      public void a()
      {
        r.this.a.d().a(localContext, str, null, FlurryAdSize.FULLSCREEN, true);
      }
    });
  }

  public void a(a parama, ae paramae, int paramInt)
  {
    q localq = parama.c;
    String str1 = null;
    if (localq != null)
      str1 = parama.c.a;
    eo.a(3, d, "performAction:action=" + parama.a + ",params=" + parama.b + ",triggering event=" + str1);
    String str2 = parama.a;
    if (paramInt > 10)
    {
      eo.a(5, d, "Maximum depth for event/action loop exceeded when performing action:" + str2 + "," + parama.b + ",triggered by:" + str1);
      return;
    }
    if (str2.equals("directOpen"))
    {
      b(parama);
      return;
    }
    if (str2.equals("delete"))
    {
      c(parama);
      return;
    }
    if (str2.equals("processRedirect"))
    {
      d(parama);
      return;
    }
    if (str2.equals("verifyUrl"))
    {
      b(parama, paramae, paramInt);
      return;
    }
    if (str2.equals("launchPackage"))
    {
      e(parama);
      return;
    }
    if (str2.equals("sendUrlAsync"))
    {
      f(parama);
      return;
    }
    if (str2.equals("sendAdLogs"))
    {
      g(parama);
      return;
    }
    if (str2.equals("logEvent"))
    {
      h(parama);
      return;
    }
    if (str2.equals("nextFrame"))
    {
      i(parama);
      return;
    }
    if (str2.equals("nextAdUnit"))
    {
      a(parama, paramInt);
      return;
    }
    if (str2.equals("checkCap"))
    {
      c(parama, paramae, paramInt);
      return;
    }
    if (str2.equals("updateViewCount"))
    {
      j(parama);
      return;
    }
    eo.a(5, d, "Unknown action:" + str2 + ",triggered by:" + str1);
  }

  void a(a parama, String paramString)
  {
    eo.a(3, d, "url after is: " + paramString);
    a(parama, paramString, null);
  }

  void a(a parama, String paramString, r.b paramb)
  {
    a(parama, paramString, 0, paramb, 0);
  }

  void a(String paramString, r.a parama)
  {
    a(paramString, paramString, 0, parama);
  }

  public boolean a(Context paramContext, Intent paramIntent, String paramString)
  {
    if (paramContext == null)
      eo.a(5, d, "Cannot launch activity, null context");
    while ((paramIntent == null) || (paramString == null) || (!fe.a(paramIntent)))
      return false;
    Intent localIntent = a(paramIntent, paramString);
    try
    {
      paramContext.startActivity(localIntent);
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      eo.a(6, d, "Cannot launch Activity", localActivityNotFoundException);
    }
    return false;
  }

  boolean a(AdUnit paramAdUnit, int paramInt)
  {
    if ((paramAdUnit != null) && (paramAdUnit.d().size() > 0))
      return ((AdFrame)paramAdUnit.d().get(paramInt)).e().e().toString().equals("banner");
    return false;
  }

  boolean a(String paramString)
  {
    Intent localIntent = do.a().c().getLaunchIntentForPackage(paramString);
    return (localIntent != null) && (fe.a(localIntent));
  }

  boolean a(String paramString1, String paramString2)
  {
    Intent localIntent = new Intent(paramString2);
    localIntent.setData(Uri.parse(paramString1));
    return fe.a(localIntent);
  }

  void b(final Context paramContext, final String paramString, final boolean paramBoolean1, final AdUnit paramAdUnit, final boolean paramBoolean2)
  {
    if (paramContext == null)
    {
      eo.a(5, d, "Cannot process redirect, null context");
      return;
    }
    a(paramString, new r.a()
    {
      public void a(String paramAnonymousString)
      {
        if (paramAnonymousString != null)
        {
          eo.a(3, r.b(), "Got final url after processRedirect:" + paramAnonymousString);
          r.this.a(paramContext, paramAnonymousString, paramBoolean1, paramAdUnit, paramBoolean2);
          return;
        }
        eo.a(5, r.b(), "Redirect URL could not be found for: " + paramString);
      }
    });
  }

  void b(a parama)
  {
    Context localContext = parama.c.a();
    e locale = parama.c.d;
    AdUnit localAdUnit = parama.c.c;
    String str1 = localAdUnit.b().toString();
    if (parama.b.containsKey("url"))
    {
      String str2 = (String)parama.b.get("url");
      if (str2.startsWith("market://"))
      {
        a(localContext, str2, str1);
        return;
      }
      if ("true".equals(parama.b.get("native")))
      {
        eo.a(2, d, "Explictly instructed to use native browser");
        d(localContext, a(locale, localAdUnit, parama, str2), str1);
        return;
      }
      if (a(localAdUnit))
      {
        this.a.b(locale);
        this.a.b(localAdUnit);
      }
      Intent localIntent = new Intent(do.a().b(), FlurryFullscreenTakeoverActivity.class);
      localIntent.putExtra("url", str2);
      localIntent.putExtra("is_mraid_ad", true);
      if (fe.a(localIntent))
      {
        a(localContext, localIntent, str1);
        return;
      }
      eo.a(6, d, "Can't start FlurryFullscreenTakeoverActivity, was it declared in the manifest? Falling back to default browser");
      d(localContext, str2, str1);
      return;
    }
    eo.a(6, d, "failed to perform directOpen action: no url in " + parama.c.a);
  }

  void b(a parama, ae paramae, int paramInt)
  {
    Context localContext = parama.c.a();
    e locale = parama.c.d;
    AdUnit localAdUnit = parama.c.c;
    if (parama.b.containsKey("url"))
      if (!a((String)parama.b.get("url")))
        break label113;
    label113: for (String str = "urlVerified"; ; str = "urlNotVerified")
    {
      this.a.a(str, 1);
      paramae.a(new q(str, Collections.emptyMap(), localContext, localAdUnit, locale, parama.c.e), this, paramInt + 1);
      return;
    }
  }

  public void b(a parama, String paramString)
  {
    eo.a(3, d, "url after is: " + paramString);
    a(parama, paramString, 4, null, 0);
  }

  public boolean b(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
      return false;
    Intent localIntent = h.b(paramContext, paramString1);
    if (localIntent != null)
      return a(paramContext, localIntent, paramString2);
    eo.a(5, d, "Google Play is not installed: " + paramString1);
    return false;
  }

  boolean b(String paramString)
  {
    String str = do.a().b().getPackageName();
    if (paramString == null)
      paramString = "market://details?id=" + str;
    return a(paramString, "android.intent.action.VIEW");
  }

  void c(a parama)
  {
    String str1 = parama.c.c.b().toString();
    if (parama.b.containsKey("count"))
      str3 = (String)parama.b.get("count");
    while (!parama.b.containsKey("groupId"))
      try
      {
        int j = Integer.parseInt(str3);
        i = j;
        this.a.d().a(str1, i);
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        while (true)
        {
          String str3;
          eo.a(6, d, "caught NumberFormatException with count parameter in deleteAds:" + str3);
          int i = -1;
        }
      }
    String str2 = (String)parama.b.get("groupId");
    this.a.d().a(str1, str2);
  }

  void c(a parama, ae paramae, int paramInt)
  {
    Context localContext = parama.c.a();
    e locale = parama.c.d;
    AdUnit localAdUnit = parama.c.c;
    if (parama.b.containsKey("idHash"))
    {
      String str1 = (String)parama.b.get("idHash");
      x localx = this.b.a(str1);
      String str2 = "capNotExhausted";
      if ((localx != null) && (this.b.a(localx.h())))
      {
        eo.a(4, d, "Discarding expired frequency cap info for idHash=" + str1);
        this.b.b(str1);
        localx = null;
      }
      if ((localx != null) && (localx.c() >= localx.e()))
      {
        eo.a(4, d, "Frequency cap exhausted for idHash=" + str1);
        str2 = "capExhausted";
      }
      this.a.a(str2, 1);
      paramae.a(new q(str2, Collections.emptyMap(), localContext, localAdUnit, locale, parama.c.e), this, paramInt + 1);
    }
  }

  public boolean c(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
      return false;
    Intent localIntent = h.a(paramContext, paramString1);
    if (localIntent != null)
      return a(paramContext, localIntent, paramString2);
    eo.a(5, d, "Cannot launch App: " + paramString1);
    return false;
  }

  void d(a parama)
  {
    Context localContext = parama.c.a();
    e locale = parama.c.d;
    AdUnit localAdUnit = parama.c.c;
    String str1;
    if (parama.b.containsKey("url"))
    {
      str1 = (String)parama.b.get("url");
      if (!parama.b.containsKey("native"))
        break label195;
    }
    label183: label195: for (boolean bool = "false".equals(parama.b.get("native")); ; bool = true)
    {
      String str2;
      if (!TextUtils.isEmpty(str1))
      {
        str2 = cf.a(a(locale, localAdUnit, parama, str1));
        if (!TextUtils.isEmpty(str2))
        {
          if (!str2.startsWith("http"))
            break label183;
          eo.a(3, d, "Calling processRedirectURL for: " + str2 + " and launching in webView: " + bool);
          b(localContext, str2, bool, localAdUnit, true);
        }
      }
      return;
      a(localContext, str2, false, localAdUnit, true);
      return;
    }
  }

  public boolean d(Context paramContext, String paramString1, String paramString2)
  {
    if (paramContext == null)
    {
      eo.a(5, d, "Cannot launch url, null context");
      return false;
    }
    return a(paramContext, new Intent("android.intent.action.VIEW").setData(Uri.parse(paramString1)), paramString2);
  }

  void e(a parama)
  {
    Context localContext = parama.c.a();
    AdUnit localAdUnit = parama.c.c;
    if (parama.b.containsKey("package"))
      a(localContext, (String)parama.b.get("package"), localAdUnit);
  }

  void f(a parama)
  {
    e locale = parama.c.d;
    AdUnit localAdUnit = parama.c.c;
    if (parama.b.containsKey("url"))
      a(parama, a(locale, localAdUnit, parama, (String)parama.b.get("url")));
  }

  void g(a parama)
  {
    this.a.C();
  }

  void h(a parama)
  {
    if ((parama.b.containsKey("__sendToServer")) && (((String)parama.b.get("__sendToServer")).equals("true")));
    for (boolean bool = true; ; bool = false)
    {
      parama.b.remove("__sendToServer");
      this.a.a(parama.c.d, parama.c.a, bool, parama.b);
      return;
    }
  }

  void i(a parama)
  {
  }

  void j(a parama)
  {
    x localx;
    String str2;
    if (parama.b.containsKey("idHash"))
    {
      String str1 = (String)parama.b.get("idHash");
      localx = this.b.a(str1);
      if (localx != null)
      {
        localx.d();
        eo.a(4, d, "updateViewCount:idHash=" + localx.b() + ",newCap=" + localx.e() + ",prevCap=" + localx.f() + ",views=" + localx.c());
        if (localx.c() >= localx.e())
        {
          str2 = parama.c.c.b().toString();
          if (localx.c() <= localx.e())
            break label209;
          eo.a(6, d, "FlurryAdAction: !! rendering a capped object: " + localx.b() + " for adspace: " + str2);
        }
      }
    }
    while (true)
    {
      this.a.d().d(str2);
      return;
      label209: eo.a(4, d, "FlurryAdAction: hit cap for object: " + localx.b() + ", cache cleared for adspace: " + str2);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.r
 * JD-Core Version:    0.6.2
 */