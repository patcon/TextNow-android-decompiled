package com.admarvel.android.ads;

import android.location.Location;
import com.admarvel.android.b.a;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class AdMarvelAd
  implements Serializable
{
  private String A = null;
  private String B = null;
  private String C = null;
  private String D = null;
  private String E;
  private String F;
  private String G;
  private String H;
  private String I;
  private Boolean J;
  private String K;
  private int L;
  private String M;
  private int N;
  private boolean O = false;
  private String P;
  private String Q;
  private String R;
  private final boolean S;
  private final String T;
  private final String U;
  private boolean V = false;
  private String W;
  private String X;
  private String Y;
  private String Z;
  private final String a = "/data/com.admarvel.android.admarvelcachedads";
  private boolean aa;
  private int ab;
  private String ac;
  private String ad;
  private String ae;
  private String af;
  private AdMarvelAd.RhythmVideoAdType ag = null;
  private AdMarvelAd.HeyzapAdType ah = null;
  private boolean ai;
  private boolean aj;
  private String ak;
  private String al;
  private String am;
  private String an;
  private String ao;
  private String ap;
  private boolean aq;
  private Integer ar = Integer.valueOf(0);
  private String as;
  private final Map<String, Object> at;
  private final String au;
  private final String av;
  private final String aw;
  private final int ax;
  private final String ay;
  private String az;
  private int b;
  private String c;
  private String d;
  private String e;
  private String f;
  private int g = -1;
  private int h = -1;
  private String i;
  private String j;
  private AdMarvelAd.AdType k;
  private String l;
  private List<String> m;
  private int n;
  private String o;
  private String p;
  private AdMarvelUtils.SDKAdNetwork q;
  private String r;
  private String s;
  private String t;
  private boolean u;
  private String v;
  private String[] w;
  private String[] x;
  private String y = null;
  private String z = null;

  public AdMarvelAd(String paramString1, Map<String, Object> paramMap, String paramString2, String paramString3, String paramString4, int paramInt, String paramString5, boolean paramBoolean, String paramString6)
  {
    this.U = paramString1;
    this.at = paramMap;
    this.au = paramString2;
    this.av = paramString3;
    this.aw = paramString4;
    this.ax = paramInt;
    this.ay = paramString5;
    this.S = paramBoolean;
    this.T = paramString6;
    if ((paramString4 != null) && (paramMap.get("UNIQUE_ID") == null))
      paramMap.put("UNIQUE_ID", paramString4);
  }

  public String getAdColonyAppVersion()
  {
    return this.B;
  }

  public String getAdFormat()
  {
    return this.D;
  }

  public int getAdHistoryCounter()
  {
    return this.ar.intValue();
  }

  public String getAdHistoryDumpString()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("appname", this.T);
      localJSONObject.put("partnerid", this.au);
      if (this.ak != null)
        localJSONObject.put("request", new JSONObject(this.ak));
      if (this.al != null)
        localJSONObject.put("response", new JSONObject(this.al));
      if (this.am != null)
        localJSONObject.put("html", new JSONObject(this.am));
      this.an = localJSONObject.toString(1);
      return this.an;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        localJSONException.printStackTrace();
    }
    catch (Exception localException)
    {
      while (true)
        localException.printStackTrace();
    }
  }

  public String getAdId()
  {
    return this.P;
  }

  public String getAdMobExtras()
  {
    return this.z;
  }

  public AdMarvelAd.AdType getAdType()
  {
    return this.k;
  }

  public String getAdmobAdFormat()
  {
    return this.az;
  }

  public String getAdmobTestAction()
  {
    return this.az;
  }

  public String[] getAdmobTestDeviceId()
  {
    return this.w;
  }

  public String getAmazonAdRequestAdvancedOptions()
  {
    return this.Z;
  }

  public int getAmazonAdTimeOut()
  {
    return this.ab;
  }

  public String getAmazonAdvancedOptions()
  {
    return this.Y;
  }

  public String getAndroidId()
  {
    return this.aw;
  }

  public String getAppId()
  {
    return this.as;
  }

  public String getAppName()
  {
    return this.R;
  }

  public String getBannerid()
  {
    return this.K;
  }

  public String getChannelId()
  {
    return this.s;
  }

  public String getClickURL()
  {
    return this.j;
  }

  public String getCloseFunction()
  {
    return this.v;
  }

  public String getCompanyName()
  {
    return this.t;
  }

  public String getCountdowntext()
  {
    return this.ao;
  }

  public String getCreativeType()
  {
    return this.l;
  }

  public String getDeviceConnectivity()
  {
    return this.ay;
  }

  public String getDisableAdDuration()
  {
    return this.W;
  }

  public int getErrorCode()
  {
    return this.n;
  }

  public String getErrorReason()
  {
    return this.o;
  }

  public String getExcluded()
  {
    return this.M;
  }

  public String getExpandDirection()
  {
    return this.C;
  }

  public String getFacebookChildDirectedFlag()
  {
    return this.y;
  }

  public String[] getFacebookTestDeviceId()
  {
    return this.x;
  }

  public String getGooglePlayLocation()
  {
    return this.A;
  }

  public String getHeight()
  {
    return this.E;
  }

  public AdMarvelAd.HeyzapAdType getHeyzapAdType()
  {
    return this.ah;
  }

  public int getId()
  {
    return this.b;
  }

  public String getImageAlt()
  {
    return this.i;
  }

  public int getImageHeight()
  {
    return this.h;
  }

  public String getImageURL()
  {
    return this.f;
  }

  public int getImageWidth()
  {
    return this.g;
  }

  public String getInterstitialAction()
  {
    return this.H;
  }

  public String getIpAddress()
  {
    return this.c;
  }

  public String getKeywordsContentUrl()
  {
    return this.I;
  }

  public int getMaxretries()
  {
    return this.N;
  }

  public String getOfflineBaseUrl()
  {
    return this.ac;
  }

  public String getOfflinekeyUrl()
  {
    return this.ad;
  }

  public int getOrientation()
  {
    return this.ax;
  }

  public String getPartnerId()
  {
    return this.au;
  }

  public List<String> getPixels()
  {
    return this.m;
  }

  public String getPubId()
  {
    return this.r;
  }

  public Boolean getRetry()
  {
    return this.J;
  }

  public int getRetrynum()
  {
    return this.L;
  }

  public AdMarvelAd.RhythmVideoAdType getRhythmVideoAdType()
  {
    return this.ag;
  }

  public String getRhythmVideoUrl()
  {
    return this.af;
  }

  public String getScene()
  {
    return this.ae;
  }

  public AdMarvelUtils.SDKAdNetwork getSdkAdNetwork()
  {
    return this.q;
  }

  public String getSdkNetwork()
  {
    return this.p;
  }

  public String getSiteId()
  {
    return this.av;
  }

  public String getSlotName()
  {
    return this.Q;
  }

  public String getSource()
  {
    return this.G;
  }

  public Map<String, Object> getTargetParams()
  {
    return this.at;
  }

  public String getText()
  {
    return this.e;
  }

  public String getVideoplacement()
  {
    return this.ap;
  }

  public String getWidth()
  {
    return this.F;
  }

  public String getXHTML()
  {
    return this.d;
  }

  public String getXhtml()
  {
    return this.d;
  }

  public String getXml()
  {
    return this.U;
  }

  public String getZoneId()
  {
    return this.X;
  }

  public boolean hasImage()
  {
    return this.f != null;
  }

  public boolean isAmazonEnableGeoLocation()
  {
    return this.aa;
  }

  public boolean isCachingEnabled()
  {
    return this.ai;
  }

  public boolean isDisableAdrequest()
  {
    return this.V;
  }

  public boolean isMustBeVisible()
  {
    return this.O;
  }

  public boolean isTest()
  {
    return this.u;
  }

  public boolean isTimercountdownEnabled()
  {
    return this.aq;
  }

  public boolean isTrackingIdSet()
  {
    return this.aj;
  }

  public AdMarvelXMLReader loadAd(File paramFile)
  {
    if (this.U == null);
    AdMarvelXMLReader localAdMarvelXMLReader;
    AdMarvelXMLElement localAdMarvelXMLElement1;
    do
    {
      return null;
      localAdMarvelXMLReader = new AdMarvelXMLReader();
      localAdMarvelXMLReader.parseXMLString(this.U);
      localAdMarvelXMLElement1 = localAdMarvelXMLReader.getParsedXMLData();
    }
    while (localAdMarvelXMLElement1 == null);
    String str14;
    if (localAdMarvelXMLElement1.a().equals("ad"))
    {
      String str11 = (String)localAdMarvelXMLElement1.getAttributes().get("id");
      if ((str11 != null) && (str11.length() > 0))
      {
        this.b = Integer.parseInt(str11);
        this.K = str11;
      }
      String str12 = (String)localAdMarvelXMLElement1.getAttributes().get("ip");
      if ((str12 != null) && (str12.length() > 0))
        this.c = str12;
      String str13 = (String)localAdMarvelXMLElement1.getAttributes().get("dah");
      if ((str13 != null) && (str13.length() > 0) && (str13.equalsIgnoreCase("true")))
        AdMarvelUtils.disableLogDump();
      str14 = (String)localAdMarvelXMLElement1.getAttributes().get("type");
      if ("text".equals(str14))
      {
        this.k = AdMarvelAd.AdType.TEXT;
        String str15 = (String)localAdMarvelXMLElement1.getAttributes().get("source");
        if ((str15 != null) && (str15.length() > 0))
          this.G = str15;
      }
    }
    while (true)
    {
      if (!localAdMarvelXMLElement1.c().containsKey("pixels"))
        break label546;
      AdMarvelXMLElement localAdMarvelXMLElement14 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement1.c().get("pixels")).get(0);
      if (!localAdMarvelXMLElement14.c().containsKey("pixel"))
        break label546;
      int i1 = ((ArrayList)localAdMarvelXMLElement14.c().get("pixel")).size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        AdMarvelXMLElement localAdMarvelXMLElement15 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement14.c().get("pixel")).get(i2);
        if (localAdMarvelXMLElement15 != null)
        {
          String str10 = localAdMarvelXMLElement15.b();
          if ((AdMarvelView.b) || (AdMarvelInterstitialAds.enableOfflineSDK))
            str10 = str10.replaceAll("\\{siteid\\}", getSiteId()).replaceAll("\\{random\\}", String.valueOf(System.currentTimeMillis())).replaceAll("\\{uniqueid\\}", getAndroidId());
          if (this.m == null)
            this.m = new ArrayList();
          this.m.add(str10);
        }
      }
      if ("image".equals(str14))
      {
        this.k = AdMarvelAd.AdType.IMAGE;
        break;
      }
      if ("javascript".equals(str14))
      {
        this.k = AdMarvelAd.AdType.JAVASCRIPT;
        break;
      }
      if ("error".equals(str14))
      {
        this.k = AdMarvelAd.AdType.ERROR;
        break;
      }
      if ("sdkcall".equals(str14))
      {
        this.k = AdMarvelAd.AdType.SDKCALL;
        break;
      }
      if (!"custom".equals(str14))
        break;
      this.k = AdMarvelAd.AdType.CUSTOM;
      break;
      this.k = AdMarvelAd.AdType.ERROR;
    }
    label546: if (((AdMarvelView.b) || (AdMarvelInterstitialAds.enableOfflineSDK)) && (localAdMarvelXMLElement1.c().containsKey("file")))
    {
      String str9 = ((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement1.c().get("file")).get(0)).b();
      if (this.k.equals(AdMarvelAd.AdType.JAVASCRIPT))
      {
        this.d = a.a(this.ad, str9);
        if (this.d != null)
          this.d = this.d.replaceAll("\\{siteid\\}", getSiteId());
      }
      this.ad = (this.ad + "/" + str9);
    }
    AdMarvelXMLElement localAdMarvelXMLElement2;
    String str3;
    if ((this.k.equals(AdMarvelAd.AdType.SDKCALL)) && (localAdMarvelXMLElement1.c().containsKey("xhtml")))
    {
      AdMarvelXMLElement localAdMarvelXMLElement13 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement1.c().get("xhtml")).get(0);
      if (localAdMarvelXMLElement13 != null)
      {
        String str2 = localAdMarvelXMLElement13.b();
        localAdMarvelXMLReader.parseXMLString(new v().a(str2));
        localAdMarvelXMLElement2 = localAdMarvelXMLReader.getParsedXMLData();
        str3 = (String)localAdMarvelXMLElement2.getAttributes().get("network");
        if (("googleplay".equals(str3)) || ("admob".equals(str3)))
        {
          this.p = "com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter";
          this.q = AdMarvelUtils.SDKAdNetwork.GOOGLEPLAY;
          if (!"YES".equals((String)localAdMarvelXMLElement2.getAttributes().get("retry")))
            break label2235;
          this.J = Boolean.valueOf(true);
          label844: String str4 = (String)localAdMarvelXMLElement2.getAttributes().get("bannerid");
          if ((str4 != null) && (str4.length() > 0))
            this.K = str4;
          String str5 = (String)localAdMarvelXMLElement2.getAttributes().get("retrynum");
          if ((str5 != null) && (str5.length() > 0))
            this.L = Integer.parseInt(str5);
          String str6 = (String)localAdMarvelXMLElement2.getAttributes().get("excluded");
          if ((str6 != null) && (str6.length() > 0))
            this.M = str6;
          String str7 = (String)localAdMarvelXMLElement2.getAttributes().get("maxretries");
          if ((str7 == null) || (str7.length() <= 0))
            break label2246;
          this.N = Integer.parseInt(str7);
        }
      }
    }
    while (true)
    {
      label990: if ((this.k.equals(AdMarvelAd.AdType.JAVASCRIPT)) && (localAdMarvelXMLElement2.c().containsKey("customdata")))
      {
        AdMarvelXMLElement localAdMarvelXMLElement12 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("customdata")).get(0);
        if (localAdMarvelXMLElement12.c().containsKey("close_func"))
          this.v = ((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement12.c().get("close_func")).get(0)).b();
      }
      if (localAdMarvelXMLElement2.c().containsKey("errorCode"))
      {
        AdMarvelXMLElement localAdMarvelXMLElement11 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("errorCode")).get(0);
        if (localAdMarvelXMLElement11 != null)
          this.n = Integer.parseInt(localAdMarvelXMLElement11.b());
      }
      if (localAdMarvelXMLElement2.c().containsKey("errorReason"))
      {
        AdMarvelXMLElement localAdMarvelXMLElement10 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("errorReason")).get(0);
        if (localAdMarvelXMLElement10 != null)
          this.o = localAdMarvelXMLElement10.b();
      }
      if (localAdMarvelXMLElement2.c().containsKey("xhtml"))
      {
        AdMarvelXMLElement localAdMarvelXMLElement9 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("xhtml")).get(0);
        if (localAdMarvelXMLElement9 != null)
          this.d = localAdMarvelXMLElement9.b();
      }
      if (localAdMarvelXMLElement2.c().containsKey("clickurl"))
      {
        AdMarvelXMLElement localAdMarvelXMLElement8 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("clickurl")).get(0);
        if (localAdMarvelXMLElement8 != null)
        {
          this.j = localAdMarvelXMLElement8.b();
          if (((AdMarvelView.b) || (AdMarvelInterstitialAds.enableOfflineSDK)) && (this.j != null))
            this.j = this.j.replaceAll("\\{siteid\\}", getSiteId());
        }
      }
      if (localAdMarvelXMLElement2.c().containsKey("image"))
      {
        if (((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("image")).get(0)).c().containsKey("url"))
        {
          AdMarvelXMLElement localAdMarvelXMLElement7 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("image")).get(0)).c().get("url")).get(0);
          if (localAdMarvelXMLElement7 != null)
            this.f = localAdMarvelXMLElement7.b();
        }
        if (((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("image")).get(0)).c().containsKey("alt"))
        {
          AdMarvelXMLElement localAdMarvelXMLElement6 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("image")).get(0)).c().get("alt")).get(0);
          if (localAdMarvelXMLElement6 != null)
            this.i = localAdMarvelXMLElement6.b();
        }
        if (((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("image")).get(0)).c().containsKey("width"))
        {
          AdMarvelXMLElement localAdMarvelXMLElement5 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("image")).get(0)).c().get("width")).get(0);
          if (localAdMarvelXMLElement5 != null)
            this.g = Integer.parseInt(localAdMarvelXMLElement5.b());
        }
        if (((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("image")).get(0)).c().containsKey("height"))
        {
          AdMarvelXMLElement localAdMarvelXMLElement4 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("image")).get(0)).c().get("height")).get(0);
          if (localAdMarvelXMLElement4 != null)
            this.h = Integer.parseInt(localAdMarvelXMLElement4.b());
        }
      }
      if (localAdMarvelXMLElement2.c().containsKey("text"))
      {
        AdMarvelXMLElement localAdMarvelXMLElement3 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("text")).get(0);
        if (localAdMarvelXMLElement3 != null)
          this.e = localAdMarvelXMLElement3.b();
      }
      if ((this.S == true) && (!this.k.equals(AdMarvelAd.AdType.ERROR)))
      {
        if (!localAdMarvelXMLElement2.c().containsKey("image"))
          break label2278;
        String str1 = this.f.replace("http://admarvel.s3.amazonaws.com", "");
        File localFile = new File(paramFile, "/data/com.admarvel.android.admarvelcachedads" + str1);
        Logging.log("AdMarvelAd::loadAd: " + localFile.getAbsolutePath());
        if (!localFile.exists())
          break label2254;
        this.f = this.f.replace("http://admarvel.s3.amazonaws.com", "content://" + this.T + ".AdMarvelCachedImageLocalFileContentProvider");
      }
      while (true)
      {
        return localAdMarvelXMLReader;
        if ("rhythm".equals(str3))
        {
          this.p = "com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter";
          this.q = AdMarvelUtils.SDKAdNetwork.RHYTHM;
          break;
        }
        if ("greystripe".equals(str3))
        {
          this.p = "com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter";
          this.q = AdMarvelUtils.SDKAdNetwork.GREYSTRIPE;
          break;
        }
        if ("millennial".equals(str3))
        {
          this.p = "com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter";
          this.q = AdMarvelUtils.SDKAdNetwork.MILLENNIAL;
          break;
        }
        if ("amazon".equals(str3))
        {
          this.p = "com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter";
          this.q = AdMarvelUtils.SDKAdNetwork.AMAZON;
          break;
        }
        if ("adcolony".equals(str3))
        {
          this.p = "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter";
          this.q = AdMarvelUtils.SDKAdNetwork.ADCOLONY;
          break;
        }
        if ("pulse3d".equals(str3))
        {
          this.p = "com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter";
          this.q = AdMarvelUtils.SDKAdNetwork.PULSE3D;
          break;
        }
        if ("facebook".equals(str3))
        {
          this.p = "com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter";
          this.q = AdMarvelUtils.SDKAdNetwork.FACEBOOK;
          break;
        }
        if ("inmobi".equals(str3))
        {
          this.p = "com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter";
          this.q = AdMarvelUtils.SDKAdNetwork.INMOBI;
          break;
        }
        if ("heyzap".equals(str3))
        {
          this.p = "com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter";
          this.q = AdMarvelUtils.SDKAdNetwork.HEYZAP;
          break;
        }
        if ("disable_ad_request".equals(str3))
        {
          String str8 = (String)localAdMarvelXMLElement2.getAttributes().get("durationinseconds");
          if (str8 == null)
            break;
          this.V = true;
          this.W = str8;
          break;
        }
        this.k = AdMarvelAd.AdType.ERROR;
        this.n = 307;
        this.o = "Missing SDK ad network";
        break;
        label2235: this.J = Boolean.valueOf(false);
        break label844;
        label2246: this.N = 1;
        break label990;
        label2254: this.k = AdMarvelAd.AdType.ERROR;
        this.n = 205;
        this.o = "Cached Ad Unable to render";
        continue;
        label2278: this.k = AdMarvelAd.AdType.ERROR;
        this.n = 205;
        this.o = "Cached Ad Unable to render: Only images are supported.  server-side configuration error";
      }
      localAdMarvelXMLElement2 = localAdMarvelXMLElement1;
    }
  }

  public void removeNonStringEntriesTargetParam()
  {
    while (true)
    {
      ConcurrentHashMap localConcurrentHashMap2;
      try
      {
        ConcurrentHashMap localConcurrentHashMap1 = new ConcurrentHashMap();
        localConcurrentHashMap1.putAll(this.at);
        Map.Entry localEntry;
        try
        {
          localConcurrentHashMap2 = new ConcurrentHashMap();
          localConcurrentHashMap2.putAll(this.at);
          Iterator localIterator = localConcurrentHashMap2.entrySet().iterator();
          if (!localIterator.hasNext())
            break label234;
          localEntry = (Map.Entry)localIterator.next();
          if ((localEntry.getValue() instanceof String))
            continue;
          if ((!(localEntry.getValue() instanceof Location)) || (!((String)localEntry.getKey()).equals("LOCATION_OBJECT")))
            continue;
          Location localLocation = (Location)localEntry.getValue();
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = Double.valueOf(localLocation.getLatitude());
          arrayOfObject[1] = Double.valueOf(localLocation.getLongitude());
          localConcurrentHashMap2.put("GEOLOCATION", String.format("%f,%f", arrayOfObject));
          localConcurrentHashMap2.remove(localEntry.getKey());
          continue;
        }
        catch (Exception localException)
        {
          this.at.clear();
          this.at.putAll(localConcurrentHashMap1);
          localException.printStackTrace();
        }
        return;
        localConcurrentHashMap2.remove(localEntry.getKey());
        continue;
      }
      finally
      {
      }
      label234: this.at.clear();
      this.at.putAll(localConcurrentHashMap2);
    }
  }

  public void setAdColonyAppVersion(String paramString)
  {
    this.B = paramString;
  }

  public void setAdFormat(String paramString)
  {
    this.D = paramString;
  }

  public void setAdHistoryCounter(int paramInt)
  {
    this.ar = Integer.valueOf(paramInt);
  }

  public void setAdId(String paramString)
  {
    this.P = paramString;
  }

  public void setAdMobExtras(String paramString)
  {
    this.z = paramString;
  }

  public void setAdType(AdMarvelAd.AdType paramAdType)
  {
    this.k = paramAdType;
  }

  public void setAdmobTestAction(String paramString)
  {
    this.az = paramString;
  }

  public void setAdmobTestDeviceId(String[] paramArrayOfString)
  {
    this.w = paramArrayOfString;
  }

  public void setAmazonAdRequestAdvancedOptions(String paramString)
  {
    this.Z = paramString;
  }

  public void setAmazonAdTimeOut(int paramInt)
  {
    this.ab = paramInt;
  }

  public void setAmazonAdvancedOptions(String paramString)
  {
    this.Y = paramString;
  }

  public void setAmazonEnableGeoLocation(boolean paramBoolean)
  {
    this.aa = paramBoolean;
  }

  public void setAppId(String paramString)
  {
    this.as = paramString;
  }

  public void setAppName(String paramString)
  {
    this.R = paramString;
  }

  public void setBannerid(String paramString)
  {
    this.K = paramString;
  }

  public void setCachingEnabled(boolean paramBoolean)
  {
    this.ai = paramBoolean;
  }

  public void setChannelId(String paramString)
  {
    this.s = paramString;
  }

  public void setClickURL(String paramString)
  {
    this.j = paramString;
  }

  public void setCloseFunction(String paramString)
  {
    this.v = paramString;
  }

  public void setCompanyName(String paramString)
  {
    this.t = paramString;
  }

  public void setCountdowntext(String paramString)
  {
    this.ao = paramString;
  }

  public void setCreativeType(String paramString)
  {
    this.l = paramString;
  }

  public void setErrorCode(int paramInt)
  {
    this.n = paramInt;
  }

  public void setErrorReason(String paramString)
  {
    this.o = paramString;
  }

  public void setExcluded(String paramString)
  {
    this.M = paramString;
  }

  public void setExpandDirection(String paramString)
  {
    this.C = paramString;
  }

  public void setFacebookChildDirectedFlag(String paramString)
  {
    this.y = paramString;
  }

  public void setFacebookTestDeviceId(String[] paramArrayOfString)
  {
    this.x = paramArrayOfString;
  }

  public void setGooglePlayLocation(String paramString)
  {
    this.A = paramString;
  }

  public void setHeight(String paramString)
  {
    this.E = paramString;
  }

  public void setHeyzapAdType(AdMarvelAd.HeyzapAdType paramHeyzapAdType)
  {
    this.ah = paramHeyzapAdType;
  }

  public void setHtmlJson(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      SimpleDateFormat localSimpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      localSimpleDateFormat1.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
      SimpleDateFormat localSimpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      Date localDate = Calendar.getInstance().getTime();
      Long localLong = Long.valueOf(System.currentTimeMillis());
      localJSONObject.put("data", paramString);
      localJSONObject.put("timestamp", String.valueOf(localLong));
      localJSONObject.put("utc", localSimpleDateFormat1.format(localDate));
      localJSONObject.put("local", localSimpleDateFormat2.format(localDate));
      this.am = localJSONObject.toString(1);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public void setId(int paramInt)
  {
    this.b = paramInt;
  }

  public void setImageAlt(String paramString)
  {
    this.i = paramString;
  }

  public void setImageHeight(int paramInt)
  {
    this.h = paramInt;
  }

  public void setImageURL(String paramString)
  {
    this.f = paramString;
  }

  public void setImageWidth(int paramInt)
  {
    this.g = paramInt;
  }

  public void setInterstitialAction(String paramString)
  {
    this.H = paramString;
  }

  public void setIpAddress(String paramString)
  {
    this.c = paramString;
  }

  public void setKeywordsContentUrl(String paramString)
  {
    this.I = paramString;
  }

  public void setMustBeVisible(boolean paramBoolean)
  {
    this.O = paramBoolean;
  }

  public void setOfflineBaseUrl(String paramString)
  {
    this.ac = paramString;
  }

  public void setOfflinekeyUrl(String paramString)
  {
    this.ad = paramString;
  }

  public void setPixels(List<String> paramList)
  {
    this.m = paramList;
  }

  public void setPubId(String paramString)
  {
    this.r = paramString;
  }

  public void setRequestJson(JSONObject paramJSONObject)
  {
    if (paramJSONObject != null);
    try
    {
      this.ak = paramJSONObject.toString(1);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public void setResponseJson()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      SimpleDateFormat localSimpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      localSimpleDateFormat1.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
      SimpleDateFormat localSimpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      Date localDate = Calendar.getInstance().getTime();
      Long localLong = Long.valueOf(System.currentTimeMillis());
      localJSONObject.put("data", this.U);
      localJSONObject.put("timestamp", String.valueOf(localLong));
      localJSONObject.put("utc", localSimpleDateFormat1.format(localDate));
      localJSONObject.put("local", localSimpleDateFormat2.format(localDate));
      this.al = localJSONObject.toString(1);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public void setRetry(Boolean paramBoolean)
  {
    this.J = paramBoolean;
  }

  public void setRetrynum(int paramInt)
  {
    this.L = paramInt;
  }

  public void setRhythmVideoAdType(AdMarvelAd.RhythmVideoAdType paramRhythmVideoAdType)
  {
    this.ag = paramRhythmVideoAdType;
  }

  public void setRhythmVideoUrl(String paramString)
  {
    this.af = paramString;
  }

  public void setScene(String paramString)
  {
    this.ae = paramString;
  }

  public void setSdkNetwork(String paramString)
  {
    this.p = paramString;
  }

  public void setSetTrackingId(boolean paramBoolean)
  {
    this.aj = paramBoolean;
  }

  public void setSlotName(String paramString)
  {
    this.Q = paramString;
  }

  public void setSource(String paramString)
  {
    this.G = paramString;
  }

  public void setTest(boolean paramBoolean)
  {
    this.u = paramBoolean;
  }

  public void setText(String paramString)
  {
    this.e = paramString;
  }

  public void setTimercountdown(boolean paramBoolean)
  {
    this.aq = paramBoolean;
  }

  public void setVideoplacement(String paramString)
  {
    this.ap = paramString;
  }

  public void setWidth(String paramString)
  {
    this.F = paramString;
  }

  public void setXhtml(String paramString)
  {
    this.d = paramString;
  }

  public void setZoneId(String paramString)
  {
    this.X = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelAd
 * JD-Core Version:    0.6.2
 */