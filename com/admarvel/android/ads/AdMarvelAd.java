package com.admarvel.android.ads;

import android.content.Context;
import android.location.Location;
import com.admarvel.android.util.a.a;
import com.admarvel.android.util.a.c.a;
import com.admarvel.android.util.i;
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
  private long C = 0L;
  private String D = null;
  private String E = null;
  private String F;
  private String G;
  private String H;
  private String I;
  private String J;
  private Boolean K;
  private String L;
  private int M;
  private String N;
  private int O;
  private boolean P = false;
  private String Q;
  private String R;
  private String S;
  private final String T;
  private final String U;
  private boolean V = false;
  private String W;
  private String X;
  private String Y;
  private String Z;
  private int a;
  private final String aA;
  private final String aB;
  private final int aC;
  private final String aD;
  private String aE;
  private String aa;
  private String ab;
  private boolean ac;
  private int ad;
  private float ae = -1.0F;
  private boolean af = false;
  private boolean ag = false;
  private String ah;
  private String ai;
  private String aj;
  private String ak;
  private AdMarvelAd.RhythmVideoAdType al = null;
  private AdMarvelAd.HeyzapAdType am = null;
  private boolean an;
  private boolean ao;
  private String ap;
  private String aq;
  private String ar;
  private String as;
  private String at;
  private String au;
  private boolean av;
  private Integer aw = Integer.valueOf(0);
  private String ax;
  private final Map<String, Object> ay;
  private final String az;
  private String b;
  private String c;
  private String d;
  private String e;
  private int f = -1;
  private int g = -1;
  private String h;
  private String i;
  private AdMarvelAd.AdType j;
  private String k;
  private List<String> l;
  private int m;
  private String n;
  private String o;
  private AdMarvelUtils.SDKAdNetwork p;
  private String q;
  private String r;
  private String s;
  private boolean t;
  private String u;
  private String[] v;
  private String[] w;
  private String x = null;
  private String y = null;
  private String z = null;

  public AdMarvelAd(String paramString1, Map<String, Object> paramMap, String paramString2, String paramString3, String paramString4, int paramInt, String paramString5, String paramString6)
  {
    this.U = paramString1;
    this.ay = paramMap;
    this.az = paramString2;
    this.aA = paramString3;
    this.aB = paramString4;
    this.aC = paramInt;
    this.aD = paramString5;
    this.T = paramString6;
    if ((paramString4 != null) && (paramMap.get("UNIQUE_ID") == null))
      paramMap.put("UNIQUE_ID", paramString4);
  }

  public void allowInteractionInExpandableAds()
  {
    this.ag = true;
  }

  public String getAdColonyAppVersion()
  {
    return this.B;
  }

  public long getAdColonyDelayAfterInitInMs()
  {
    return this.C;
  }

  public String getAdColonyMuted()
  {
    return this.Z;
  }

  public String getAdFormat()
  {
    return this.E;
  }

  public int getAdHistoryCounter()
  {
    return this.aw.intValue();
  }

  public String getAdHistoryDumpString()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("appname", this.T);
      localJSONObject.put("partnerid", this.az);
      if (this.ap != null)
        localJSONObject.put("request", new JSONObject(this.ap));
      if (this.aq != null)
        localJSONObject.put("response", new JSONObject(this.aq));
      if (this.ar != null)
        localJSONObject.put("html", new JSONObject(this.ar));
      this.as = localJSONObject.toString(1);
      return this.as;
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
    return this.Q;
  }

  public float getAdMarvelViewWidth()
  {
    return this.ae;
  }

  public String getAdMobExtras()
  {
    return this.z;
  }

  public AdMarvelAd.AdType getAdType()
  {
    return this.j;
  }

  public String getAdmobAdFormat()
  {
    return this.aE;
  }

  public String getAdmobTestAction()
  {
    return this.aE;
  }

  public String[] getAdmobTestDeviceId()
  {
    return this.v;
  }

  public String getAmazonAdRequestAdvancedOptions()
  {
    return this.ab;
  }

  public int getAmazonAdTimeOut()
  {
    return this.ad;
  }

  public String getAmazonAdvancedOptions()
  {
    return this.aa;
  }

  public String getAndroidId()
  {
    return this.aB;
  }

  public String getAppId()
  {
    return this.ax;
  }

  public String getAppName()
  {
    return this.S;
  }

  public String getBannerid()
  {
    return this.L;
  }

  public String getChannelId()
  {
    return this.r;
  }

  public String getClickURL()
  {
    return this.i;
  }

  public String getCloseFunction()
  {
    return this.u;
  }

  public String getCompanyName()
  {
    return this.s;
  }

  public String getCountdowntext()
  {
    return this.at;
  }

  public String getCreativeType()
  {
    return this.k;
  }

  public String getDeviceConnectivity()
  {
    return this.aD;
  }

  public String getDisableAdDuration()
  {
    return this.W;
  }

  public int getErrorCode()
  {
    return this.m;
  }

  public String getErrorReason()
  {
    return this.n;
  }

  public String getExcluded()
  {
    return this.N;
  }

  public String getExpandDirection()
  {
    return this.D;
  }

  public String getFacebookAdSize()
  {
    return this.y;
  }

  public String getFacebookChildDirectedFlag()
  {
    return this.x;
  }

  public String[] getFacebookTestDeviceId()
  {
    return this.w;
  }

  public String getGooglePlayLocation()
  {
    return this.A;
  }

  public String getHeight()
  {
    return this.F;
  }

  public AdMarvelAd.HeyzapAdType getHeyzapAdType()
  {
    return this.am;
  }

  public int getId()
  {
    return this.a;
  }

  public String getImageAlt()
  {
    return this.h;
  }

  public int getImageHeight()
  {
    return this.g;
  }

  public String getImageURL()
  {
    return this.e;
  }

  public int getImageWidth()
  {
    return this.f;
  }

  public String getInterstitialAction()
  {
    return this.I;
  }

  public String getIpAddress()
  {
    return this.b;
  }

  public String getKeywordsContentUrl()
  {
    return this.J;
  }

  public int getMaxretries()
  {
    return this.O;
  }

  public String getOfflineBaseUrl()
  {
    return this.ah;
  }

  public String getOfflinekeyUrl()
  {
    return this.ai;
  }

  public int getOrientation()
  {
    return this.aC;
  }

  public String getPartnerId()
  {
    return this.az;
  }

  public List<String> getPixels()
  {
    return this.l;
  }

  public String getPubId()
  {
    return this.q;
  }

  public Boolean getRetry()
  {
    return this.K;
  }

  public int getRetrynum()
  {
    return this.M;
  }

  public AdMarvelAd.RhythmVideoAdType getRhythmVideoAdType()
  {
    return this.al;
  }

  public String getRhythmVideoUrl()
  {
    return this.ak;
  }

  public String getScene()
  {
    return this.aj;
  }

  public AdMarvelUtils.SDKAdNetwork getSdkAdNetwork()
  {
    return this.p;
  }

  public String getSdkNetwork()
  {
    return this.o;
  }

  public String getSiteId()
  {
    return this.aA;
  }

  public String getSlotName()
  {
    return this.R;
  }

  public String getSource()
  {
    return this.H;
  }

  public Map<String, Object> getTargetParams()
  {
    return this.ay;
  }

  public String getTargetZoneId()
  {
    return this.Y;
  }

  public String getText()
  {
    return this.d;
  }

  public String getVideoplacement()
  {
    return this.au;
  }

  public String getWidth()
  {
    return this.G;
  }

  public String getXHTML()
  {
    return this.c;
  }

  public String getXhtml()
  {
    return this.c;
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
    return this.e != null;
  }

  public boolean isAmazonEnableGeoLocation()
  {
    return this.ac;
  }

  public boolean isAppInteractionAllowedForExpandableAds()
  {
    return this.ag;
  }

  public boolean isCachingEnabled()
  {
    return this.an;
  }

  public boolean isDisableAdrequest()
  {
    return this.V;
  }

  public boolean isHoverAd()
  {
    return this.af;
  }

  public boolean isMustBeVisible()
  {
    return this.P;
  }

  public boolean isTest()
  {
    return this.t;
  }

  public boolean isTimercountdownEnabled()
  {
    return this.av;
  }

  public boolean isTrackingIdSet()
  {
    return this.ao;
  }

  public AdMarvelXMLReader loadAd(Context paramContext)
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
    String str13;
    String str15;
    if (localAdMarvelXMLElement1.getName().equals("ad"))
    {
      String str10 = (String)localAdMarvelXMLElement1.getAttributes().get("id");
      if ((str10 != null) && (str10.length() > 0))
      {
        this.a = Integer.parseInt(str10);
        this.L = str10;
      }
      String str11 = (String)localAdMarvelXMLElement1.getAttributes().get("ip");
      if ((str11 != null) && (str11.length() > 0))
        this.b = str11;
      String str12 = (String)localAdMarvelXMLElement1.getAttributes().get("dah");
      if ((str12 != null) && (str12.length() > 0) && (str12.equalsIgnoreCase("true")))
        AdMarvelUtils.disableLogDump();
      str13 = (String)localAdMarvelXMLElement1.getAttributes().get("type");
      if ("text".equals(str13))
      {
        this.j = AdMarvelAd.AdType.TEXT;
        String str14 = (String)localAdMarvelXMLElement1.getAttributes().get("source");
        if ((str14 != null) && (str14.length() > 0))
          this.H = str14;
        str15 = (String)localAdMarvelXMLElement1.getAttributes().get("ave");
        if ((str15 == null) || (str15.length() <= 0));
      }
    }
    while (true)
    {
      try
      {
        AdMarvelAnalyticsAdapter localAdMarvelAnalyticsAdapter = AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramContext);
        if (str15.equals("1"))
        {
          localAdMarvelAnalyticsAdapter.enableAppInstallCheck(true);
          String str16 = (String)localAdMarvelXMLElement1.getAttributes().get("iha");
          if ((str16 != null) && (str16.length() > 0) && (str16.equals("1")))
            setAsHoverAd();
          String str17 = (String)localAdMarvelXMLElement1.getAttributes().get("aie");
          if ((str17 != null) && (str17.length() > 0) && (str17.equals("1")))
            allowInteractionInExpandableAds();
          if (!localAdMarvelXMLElement1.getChildren().containsKey("pixels"))
            break label711;
          AdMarvelXMLElement localAdMarvelXMLElement14 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement1.getChildren().get("pixels")).get(0);
          if (!localAdMarvelXMLElement14.getChildren().containsKey("pixel"))
            break label711;
          int i1 = ((ArrayList)localAdMarvelXMLElement14.getChildren().get("pixel")).size();
          int i2 = 0;
          if (i2 >= i1)
            break label711;
          AdMarvelXMLElement localAdMarvelXMLElement15 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement14.getChildren().get("pixel")).get(i2);
          if (localAdMarvelXMLElement15 != null)
          {
            String str9 = localAdMarvelXMLElement15.getData();
            if ((AdMarvelView.a) || (AdMarvelInterstitialAds.enableOfflineSDK))
              str9 = str9.replaceAll("\\{siteid\\}", getSiteId()).replaceAll("\\{random\\}", String.valueOf(System.currentTimeMillis())).replaceAll("\\{uniqueid\\}", getAndroidId());
            if (this.l == null)
              this.l = new ArrayList();
            this.l.add(str9);
          }
          i2++;
          continue;
          if ("image".equals(str13))
          {
            this.j = AdMarvelAd.AdType.IMAGE;
            break;
          }
          if ("javascript".equals(str13))
          {
            this.j = AdMarvelAd.AdType.JAVASCRIPT;
            break;
          }
          if ("error".equals(str13))
          {
            this.j = AdMarvelAd.AdType.ERROR;
            break;
          }
          if ("sdkcall".equals(str13))
          {
            this.j = AdMarvelAd.AdType.SDKCALL;
            break;
          }
          if (!"custom".equals(str13))
            break;
          this.j = AdMarvelAd.AdType.CUSTOM;
          break;
        }
        if (!str15.equals("0"))
          continue;
        localAdMarvelAnalyticsAdapter.enableAppInstallCheck(false);
        continue;
      }
      catch (Exception localException2)
      {
        continue;
      }
      this.j = AdMarvelAd.AdType.ERROR;
    }
    label711: String str8;
    if (((AdMarvelView.a) || (AdMarvelInterstitialAds.enableOfflineSDK)) && (localAdMarvelXMLElement1.getChildren().containsKey("file")))
    {
      str8 = ((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement1.getChildren().get("file")).get(0)).getData();
      if (!this.j.equals(AdMarvelAd.AdType.JAVASCRIPT));
    }
    try
    {
      c.a locala = a.a(Class.forName("com.admarvel.android.offlinesdk.AdmarvelOfflineUtils").newInstance(), "readData");
      locala.a(String.class, this.ai);
      locala.a(String.class, str8);
      this.c = ((String)locala.a());
      if (this.c != null)
        this.c = this.c.replaceAll("\\{siteid\\}", getSiteId());
      this.ai = (this.ai + "/" + str8);
      if ((this.j.equals(AdMarvelAd.AdType.SDKCALL)) && (localAdMarvelXMLElement1.getChildren().containsKey("xhtml")))
      {
        AdMarvelXMLElement localAdMarvelXMLElement13 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement1.getChildren().get("xhtml")).get(0);
        if (localAdMarvelXMLElement13 != null)
        {
          String str1 = localAdMarvelXMLElement13.getData();
          localAdMarvelXMLReader.parseXMLString(new i().a(str1));
          localAdMarvelXMLElement2 = localAdMarvelXMLReader.getParsedXMLData();
          str2 = (String)localAdMarvelXMLElement2.getAttributes().get("network");
          if (("googleplay".equals(str2)) || ("admob".equals(str2)))
          {
            this.o = "com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter";
            this.p = AdMarvelUtils.SDKAdNetwork.GOOGLEPLAY;
            if (!"YES".equals((String)localAdMarvelXMLElement2.getAttributes().get("retry")))
              break label2294;
            this.K = Boolean.valueOf(true);
            String str3 = (String)localAdMarvelXMLElement2.getAttributes().get("bannerid");
            if ((str3 != null) && (str3.length() > 0))
              this.L = str3;
            String str4 = (String)localAdMarvelXMLElement2.getAttributes().get("retrynum");
            if ((str4 != null) && (str4.length() > 0))
              this.M = Integer.parseInt(str4);
            String str5 = (String)localAdMarvelXMLElement2.getAttributes().get("excluded");
            if ((str5 != null) && (str5.length() > 0))
              this.N = str5;
            String str6 = (String)localAdMarvelXMLElement2.getAttributes().get("maxretries");
            if ((str6 == null) || (str6.length() <= 0))
              break label2305;
            this.O = Integer.parseInt(str6);
            if ((this.j.equals(AdMarvelAd.AdType.JAVASCRIPT)) && (localAdMarvelXMLElement2.getChildren().containsKey("customdata")))
            {
              AdMarvelXMLElement localAdMarvelXMLElement12 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("customdata")).get(0);
              if (localAdMarvelXMLElement12.getChildren().containsKey("close_func"))
                this.u = ((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement12.getChildren().get("close_func")).get(0)).getData();
            }
            if (localAdMarvelXMLElement2.getChildren().containsKey("errorCode"))
            {
              AdMarvelXMLElement localAdMarvelXMLElement11 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("errorCode")).get(0);
              if (localAdMarvelXMLElement11 != null)
                this.m = Integer.parseInt(localAdMarvelXMLElement11.getData());
            }
            if (localAdMarvelXMLElement2.getChildren().containsKey("errorReason"))
            {
              AdMarvelXMLElement localAdMarvelXMLElement10 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("errorReason")).get(0);
              if (localAdMarvelXMLElement10 != null)
                this.n = localAdMarvelXMLElement10.getData();
            }
            if (localAdMarvelXMLElement2.getChildren().containsKey("xhtml"))
            {
              AdMarvelXMLElement localAdMarvelXMLElement9 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("xhtml")).get(0);
              if (localAdMarvelXMLElement9 != null)
                this.c = localAdMarvelXMLElement9.getData();
            }
            if (localAdMarvelXMLElement2.getChildren().containsKey("clickurl"))
            {
              AdMarvelXMLElement localAdMarvelXMLElement8 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("clickurl")).get(0);
              if (localAdMarvelXMLElement8 != null)
              {
                this.i = localAdMarvelXMLElement8.getData();
                if (((AdMarvelView.a) || (AdMarvelInterstitialAds.enableOfflineSDK)) && (this.i != null))
                  this.i = this.i.replaceAll("\\{siteid\\}", getSiteId());
              }
            }
            if (localAdMarvelXMLElement2.getChildren().containsKey("image"))
            {
              if (((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("image")).get(0)).getChildren().containsKey("url"))
              {
                AdMarvelXMLElement localAdMarvelXMLElement7 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("image")).get(0)).getChildren().get("url")).get(0);
                if (localAdMarvelXMLElement7 != null)
                  this.e = localAdMarvelXMLElement7.getData();
              }
              if (((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("image")).get(0)).getChildren().containsKey("alt"))
              {
                AdMarvelXMLElement localAdMarvelXMLElement6 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("image")).get(0)).getChildren().get("alt")).get(0);
                if (localAdMarvelXMLElement6 != null)
                  this.h = localAdMarvelXMLElement6.getData();
              }
              if (((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("image")).get(0)).getChildren().containsKey("width"))
              {
                AdMarvelXMLElement localAdMarvelXMLElement5 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("image")).get(0)).getChildren().get("width")).get(0);
                if (localAdMarvelXMLElement5 != null)
                  this.f = Integer.parseInt(localAdMarvelXMLElement5.getData());
              }
              if (((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("image")).get(0)).getChildren().containsKey("height"))
              {
                AdMarvelXMLElement localAdMarvelXMLElement4 = (AdMarvelXMLElement)((ArrayList)((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("image")).get(0)).getChildren().get("height")).get(0);
                if (localAdMarvelXMLElement4 != null)
                  this.g = Integer.parseInt(localAdMarvelXMLElement4.getData());
              }
            }
            if (localAdMarvelXMLElement2.getChildren().containsKey("text"))
            {
              AdMarvelXMLElement localAdMarvelXMLElement3 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("text")).get(0);
              if (localAdMarvelXMLElement3 != null)
                this.d = localAdMarvelXMLElement3.getData();
            }
            return localAdMarvelXMLReader;
          }
        }
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      while (true)
        localInstantiationException.printStackTrace();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
        localIllegalAccessException.printStackTrace();
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
        localClassNotFoundException.printStackTrace();
    }
    catch (Exception localException1)
    {
      while (true)
      {
        AdMarvelXMLElement localAdMarvelXMLElement2;
        String str2;
        localException1.printStackTrace();
        continue;
        if ("rhythm".equals(str2))
        {
          this.o = "com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter";
          this.p = AdMarvelUtils.SDKAdNetwork.RHYTHM;
        }
        else if ("millennial".equals(str2))
        {
          this.o = "com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter";
          this.p = AdMarvelUtils.SDKAdNetwork.MILLENNIAL;
        }
        else if ("amazon".equals(str2))
        {
          this.o = "com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter";
          this.p = AdMarvelUtils.SDKAdNetwork.AMAZON;
        }
        else if ("adcolony".equals(str2))
        {
          this.o = "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter";
          this.p = AdMarvelUtils.SDKAdNetwork.ADCOLONY;
        }
        else if ("pulse3d".equals(str2))
        {
          this.o = "com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter";
          this.p = AdMarvelUtils.SDKAdNetwork.PULSE3D;
        }
        else if ("facebook".equals(str2))
        {
          this.o = "com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter";
          this.p = AdMarvelUtils.SDKAdNetwork.FACEBOOK;
        }
        else if ("inmobi".equals(str2))
        {
          this.o = "com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter";
          this.p = AdMarvelUtils.SDKAdNetwork.INMOBI;
        }
        else if ("heyzap".equals(str2))
        {
          this.o = "com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter";
          this.p = AdMarvelUtils.SDKAdNetwork.HEYZAP;
        }
        else if ("disable_ad_request".equals(str2))
        {
          String str7 = (String)localAdMarvelXMLElement2.getAttributes().get("durationinseconds");
          if (str7 != null)
          {
            this.V = true;
            this.W = str7;
          }
        }
        else
        {
          this.j = AdMarvelAd.AdType.ERROR;
          this.m = 307;
          this.n = "Missing SDK ad network";
          continue;
          label2294: this.K = Boolean.valueOf(false);
          continue;
          label2305: this.O = 1;
          continue;
          localAdMarvelXMLElement2 = localAdMarvelXMLElement1;
        }
      }
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
        localConcurrentHashMap1.putAll(this.ay);
        Map.Entry localEntry;
        try
        {
          localConcurrentHashMap2 = new ConcurrentHashMap();
          localConcurrentHashMap2.putAll(this.ay);
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
          this.ay.clear();
          this.ay.putAll(localConcurrentHashMap1);
          localException.printStackTrace();
        }
        return;
        localConcurrentHashMap2.remove(localEntry.getKey());
        continue;
      }
      finally
      {
      }
      label234: this.ay.clear();
      this.ay.putAll(localConcurrentHashMap2);
    }
  }

  public void setAdColonyAppVersion(String paramString)
  {
    this.B = paramString;
  }

  public void setAdColonyDelayAfterInitInMs(long paramLong)
  {
    this.C = paramLong;
  }

  public void setAdColonyMuted()
  {
    this.Z = "true";
  }

  public void setAdFormat(String paramString)
  {
    this.E = paramString;
  }

  public void setAdHistoryCounter(int paramInt)
  {
    this.aw = Integer.valueOf(paramInt);
  }

  public void setAdId(String paramString)
  {
    this.Q = paramString;
  }

  public void setAdMarvelViewWidth(float paramFloat)
  {
    this.ae = paramFloat;
  }

  public void setAdMobExtras(String paramString)
  {
    this.z = paramString;
  }

  public void setAdType(AdMarvelAd.AdType paramAdType)
  {
    this.j = paramAdType;
  }

  public void setAdmobTestAction(String paramString)
  {
    this.aE = paramString;
  }

  public void setAdmobTestDeviceId(String[] paramArrayOfString)
  {
    this.v = paramArrayOfString;
  }

  public void setAmazonAdRequestAdvancedOptions(String paramString)
  {
    this.ab = paramString;
  }

  public void setAmazonAdTimeOut(int paramInt)
  {
    this.ad = paramInt;
  }

  public void setAmazonAdvancedOptions(String paramString)
  {
    this.aa = paramString;
  }

  public void setAmazonEnableGeoLocation(boolean paramBoolean)
  {
    this.ac = paramBoolean;
  }

  public void setAppId(String paramString)
  {
    this.ax = paramString;
  }

  public void setAppName(String paramString)
  {
    this.S = paramString;
  }

  public void setAsHoverAd()
  {
    this.af = true;
  }

  public void setBannerid(String paramString)
  {
    this.L = paramString;
  }

  public void setCachingEnabled(boolean paramBoolean)
  {
    this.an = paramBoolean;
  }

  public void setChannelId(String paramString)
  {
    this.r = paramString;
  }

  public void setClickURL(String paramString)
  {
    this.i = paramString;
  }

  public void setCloseFunction(String paramString)
  {
    this.u = paramString;
  }

  public void setCompanyName(String paramString)
  {
    this.s = paramString;
  }

  public void setCountdowntext(String paramString)
  {
    this.at = paramString;
  }

  public void setCreativeType(String paramString)
  {
    this.k = paramString;
  }

  public void setErrorCode(int paramInt)
  {
    this.m = paramInt;
  }

  public void setErrorReason(String paramString)
  {
    this.n = paramString;
  }

  public void setExcluded(String paramString)
  {
    this.N = paramString;
  }

  public void setExpandDirection(String paramString)
  {
    this.D = paramString;
  }

  public void setFacebookAdSize(String paramString)
  {
    this.y = paramString;
  }

  public void setFacebookChildDirectedFlag(String paramString)
  {
    this.x = paramString;
  }

  public void setFacebookTestDeviceId(String[] paramArrayOfString)
  {
    this.w = paramArrayOfString;
  }

  public void setGooglePlayLocation(String paramString)
  {
    this.A = paramString;
  }

  public void setHeight(String paramString)
  {
    this.F = paramString;
  }

  public void setHeyzapAdType(AdMarvelAd.HeyzapAdType paramHeyzapAdType)
  {
    this.am = paramHeyzapAdType;
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
      this.ar = localJSONObject.toString(1);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public void setId(int paramInt)
  {
    this.a = paramInt;
  }

  public void setImageAlt(String paramString)
  {
    this.h = paramString;
  }

  public void setImageHeight(int paramInt)
  {
    this.g = paramInt;
  }

  public void setImageURL(String paramString)
  {
    this.e = paramString;
  }

  public void setImageWidth(int paramInt)
  {
    this.f = paramInt;
  }

  public void setInterstitialAction(String paramString)
  {
    this.I = paramString;
  }

  public void setIpAddress(String paramString)
  {
    this.b = paramString;
  }

  public void setKeywordsContentUrl(String paramString)
  {
    this.J = paramString;
  }

  public void setMustBeVisible(boolean paramBoolean)
  {
    this.P = paramBoolean;
  }

  public void setOfflineBaseUrl(String paramString)
  {
    this.ah = paramString;
  }

  public void setOfflinekeyUrl(String paramString)
  {
    this.ai = paramString;
  }

  public void setPixels(List<String> paramList)
  {
    this.l = paramList;
  }

  public void setPubId(String paramString)
  {
    this.q = paramString;
  }

  public void setRequestJson(JSONObject paramJSONObject)
  {
    if (paramJSONObject != null);
    try
    {
      this.ap = paramJSONObject.toString(1);
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
      this.aq = localJSONObject.toString(1);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public void setRetry(Boolean paramBoolean)
  {
    this.K = paramBoolean;
  }

  public void setRetrynum(int paramInt)
  {
    this.M = paramInt;
  }

  public void setRhythmVideoAdType(AdMarvelAd.RhythmVideoAdType paramRhythmVideoAdType)
  {
    this.al = paramRhythmVideoAdType;
  }

  public void setRhythmVideoUrl(String paramString)
  {
    this.ak = paramString;
  }

  public void setScene(String paramString)
  {
    this.aj = paramString;
  }

  public void setSdkNetwork(String paramString)
  {
    this.o = paramString;
  }

  public void setSetTrackingId(boolean paramBoolean)
  {
    this.ao = paramBoolean;
  }

  public void setSlotName(String paramString)
  {
    this.R = paramString;
  }

  public void setSource(String paramString)
  {
    this.H = paramString;
  }

  public void setTargetZoneId(String paramString)
  {
    this.Y = paramString;
  }

  public void setTest(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }

  public void setText(String paramString)
  {
    this.d = paramString;
  }

  public void setTimercountdown(boolean paramBoolean)
  {
    this.av = paramBoolean;
  }

  public void setVideoplacement(String paramString)
  {
    this.au = paramString;
  }

  public void setWidth(String paramString)
  {
    this.G = paramString;
  }

  public void setXhtml(String paramString)
  {
    this.c = paramString;
  }

  public void setZoneId(String paramString)
  {
    this.X = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelAd
 * JD-Core Version:    0.6.2
 */