package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class dy
{
  private static final SimpleDateFormat qA = new SimpleDateFormat("yyyyMMdd");

  public static du a(Context paramContext, ds paramds, String paramString)
  {
    JSONObject localJSONObject;
    String str1;
    String str3;
    String str4;
    long l1;
    String str5;
    long l2;
    int i;
    du localdu3;
    label206: Object localObject1;
    label244: int m;
    label340: Object localObject3;
    label378: int k;
    label419: Object localObject5;
    label457: int j;
    while (true)
    {
      try
      {
        localJSONObject = new JSONObject(paramString);
        str1 = localJSONObject.optString("ad_base_url", null);
        String str2 = localJSONObject.optString("ad_url", null);
        str3 = localJSONObject.optString("ad_size", null);
        str4 = localJSONObject.optString("ad_html", null);
        l1 = -1L;
        str5 = localJSONObject.optString("debug_dialog", null);
        if (!localJSONObject.has("interstitial_timeout"))
          break label642;
        l2 = ()(1000.0D * localJSONObject.getDouble("interstitial_timeout"));
        String str6 = localJSONObject.optString("orientation", null);
        i = -1;
        if ("portrait".equals(str6))
        {
          i = eo.bS();
          if (!TextUtils.isEmpty(str4))
          {
            if (!TextUtils.isEmpty(str1))
              break label636;
            eu.D("Could not parse the mediation config: Missing required ad_base_url field");
            return new du(0);
          }
        }
        else
        {
          if (!"landscape".equals(str6))
            continue;
          i = eo.bR();
          continue;
        }
        if (!TextUtils.isEmpty(str2))
        {
          du localdu2 = dx.a(paramContext, paramds.kQ.sw, str2, null, null);
          str1 = localdu2.oA;
          str4 = localdu2.qe;
          l1 = localdu2.qk;
          localdu3 = localdu2;
          JSONArray localJSONArray1 = localJSONObject.optJSONArray("click_urls");
          if (localdu3 == null)
          {
            localObject1 = null;
            if (localJSONArray1 == null)
              break;
            if (localObject1 != null)
              break label650;
            localObject1 = new LinkedList();
            break label650;
            if (m >= localJSONArray1.length())
              break label656;
            ((List)localObject1).add(localJSONArray1.getString(m));
            m++;
            continue;
          }
        }
        else
        {
          eu.D("Could not parse the mediation config: Missing required ad_html or ad_url field.");
          du localdu1 = new du(0);
          return localdu1;
        }
      }
      catch (JSONException localJSONException)
      {
        eu.D("Could not parse the mediation config: " + localJSONException.getMessage());
        return new du(0);
      }
      localObject1 = localdu3.nt;
      continue;
      JSONArray localJSONArray2 = localJSONObject.optJSONArray("impression_urls");
      if (localdu3 == null)
        localObject3 = null;
      while (localJSONArray2 != null)
      {
        if (localObject3 != null)
          break label663;
        localObject3 = new LinkedList();
        break label663;
        while (k < localJSONArray2.length())
        {
          ((List)localObject3).add(localJSONArray2.getString(k));
          k++;
        }
        localObject3 = localdu3.nu;
        continue;
        JSONArray localJSONArray3 = localJSONObject.optJSONArray("manual_impression_urls");
        if (localdu3 == null);
        for (localObject5 = null; localJSONArray3 != null; localObject5 = localdu3.qi)
        {
          if (localObject5 != null)
            break label676;
          localObject5 = new LinkedList();
          break label676;
          while (j < localJSONArray3.length())
          {
            ((List)localObject5).add(localJSONArray3.getString(j));
            j++;
          }
        }
      }
    }
    while (true)
    {
      if (localdu3 != null)
      {
        if (localdu3.orientation != -1)
          i = localdu3.orientation;
        if (localdu3.qf > 0L)
          l2 = localdu3.qf;
      }
      String str7 = localJSONObject.optString("active_view");
      boolean bool = localJSONObject.optBoolean("ad_is_javascript", false);
      String str8 = null;
      if (bool)
        str8 = localJSONObject.optString("ad_passback_url", null);
      du localdu4 = new du(str1, str4, (List)localObject2, (List)localObject4, l2, false, -1L, (List)localObject6, -1L, i, str3, l1, str5, bool, str8, str7);
      return localdu4;
      Object localObject6 = localObject5;
      continue;
      Object localObject4 = localObject3;
      break label419;
      Object localObject2 = localObject1;
      break label340;
      label636: localdu3 = null;
      break label206;
      label642: l2 = -1L;
      break;
      label650: m = 0;
      break label244;
      label656: localObject2 = localObject1;
      break label340;
      label663: k = 0;
      break label378;
      localObject4 = localObject3;
      break label419;
      label676: j = 0;
      break label457;
      localObject6 = localObject5;
    }
  }

  public static String a(ds paramds, ec paramec, Location paramLocation, String paramString)
  {
    try
    {
      HashMap localHashMap = new HashMap();
      if ((paramString != null) && (paramString.trim() != ""))
        localHashMap.put("eid", paramString);
      if (paramds.pW != null)
        localHashMap.put("ad_pos", paramds.pW);
      a(localHashMap, paramds.pX);
      localHashMap.put("format", paramds.kT.me);
      if (paramds.kT.width == -1)
        localHashMap.put("smart_w", "full");
      if (paramds.kT.height == -2)
        localHashMap.put("smart_h", "auto");
      if (paramds.kT.mg != null)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        al[] arrayOfal = paramds.kT.mg;
        int i = arrayOfal.length;
        int j = 0;
        if (j < i)
        {
          al localal = arrayOfal[j];
          if (localStringBuilder.length() != 0)
            localStringBuilder.append("|");
          int k;
          if (localal.width == -1)
          {
            k = (int)(localal.widthPixels / paramec.rr);
            label207: localStringBuilder.append(k);
            localStringBuilder.append("x");
            if (localal.height != -2)
              break label272;
          }
          label272: for (int m = (int)(localal.heightPixels / paramec.rr); ; m = localal.height)
          {
            localStringBuilder.append(m);
            j++;
            break;
            k = localal.width;
            break label207;
          }
        }
        localHashMap.put("sz", localStringBuilder);
      }
      localHashMap.put("slotname", paramds.kN);
      localHashMap.put("pn", paramds.applicationInfo.packageName);
      if (paramds.pY != null)
        localHashMap.put("vc", Integer.valueOf(paramds.pY.versionCode));
      localHashMap.put("ms", paramds.pZ);
      localHashMap.put("ms2", paramds.qd);
      localHashMap.put("seq_num", paramds.qa);
      localHashMap.put("session_id", paramds.qb);
      localHashMap.put("js", paramds.kQ.sw);
      a(localHashMap, paramec);
      if ((paramds.pX.versionCode >= 2) && (paramds.pX.ma != null))
        a(localHashMap, paramds.pX.ma);
      if (paramds.versionCode >= 2)
        localHashMap.put("quality_signals", paramds.qc);
      if (eu.p(2))
      {
        String str2 = eo.o(localHashMap).toString(2);
        eu.C("Ad Request JSON: " + str2);
      }
      String str1 = eo.o(localHashMap).toString();
      return str1;
    }
    catch (JSONException localJSONException)
    {
      eu.D("Problem serializing ad request to JSON: " + localJSONException.getMessage());
    }
    return null;
  }

  private static void a(HashMap<String, Object> paramHashMap, Location paramLocation)
  {
    HashMap localHashMap = new HashMap();
    Float localFloat = Float.valueOf(1000.0F * paramLocation.getAccuracy());
    Long localLong1 = Long.valueOf(1000L * paramLocation.getTime());
    Long localLong2 = Long.valueOf(()(10000000.0D * paramLocation.getLatitude()));
    Long localLong3 = Long.valueOf(()(10000000.0D * paramLocation.getLongitude()));
    localHashMap.put("radius", localFloat);
    localHashMap.put("lat", localLong2);
    localHashMap.put("long", localLong3);
    localHashMap.put("time", localLong1);
    paramHashMap.put("uule", localHashMap);
  }

  private static void a(HashMap<String, Object> paramHashMap, ai paramai)
  {
    String str = el.bP();
    if (str != null)
      paramHashMap.put("abf", str);
    if (paramai.lS != -1L)
      paramHashMap.put("cust_age", qA.format(new Date(paramai.lS)));
    if (paramai.extras != null)
      paramHashMap.put("extras", paramai.extras);
    if (paramai.lT != -1)
      paramHashMap.put("cust_gender", Integer.valueOf(paramai.lT));
    if (paramai.lU != null)
      paramHashMap.put("kw", paramai.lU);
    if (paramai.lW != -1)
      paramHashMap.put("tag_for_child_directed_treatment", Integer.valueOf(paramai.lW));
    if (paramai.lV)
      paramHashMap.put("adtest", "on");
    if (paramai.versionCode >= 2)
    {
      if (paramai.lX)
        paramHashMap.put("d_imp_hdr", Integer.valueOf(1));
      if (!TextUtils.isEmpty(paramai.lY))
        paramHashMap.put("ppid", paramai.lY);
      if (paramai.lZ != null)
        a(paramHashMap, paramai.lZ);
    }
    if ((paramai.versionCode >= 3) && (paramai.mb != null))
      paramHashMap.put("url", paramai.mb);
  }

  private static void a(HashMap<String, Object> paramHashMap, aw paramaw)
  {
    if (Color.alpha(paramaw.mD) != 0)
      paramHashMap.put("acolor", o(paramaw.mD));
    if (Color.alpha(paramaw.backgroundColor) != 0)
      paramHashMap.put("bgcolor", o(paramaw.backgroundColor));
    if ((Color.alpha(paramaw.mE) != 0) && (Color.alpha(paramaw.mF) != 0))
    {
      paramHashMap.put("gradientto", o(paramaw.mE));
      paramHashMap.put("gradientfrom", o(paramaw.mF));
    }
    if (Color.alpha(paramaw.mG) != 0)
      paramHashMap.put("bcolor", o(paramaw.mG));
    paramHashMap.put("bthick", Integer.toString(paramaw.mH));
    Object localObject1;
    Object localObject2;
    switch (paramaw.mI)
    {
    default:
      localObject1 = null;
      if (localObject1 != null)
        paramHashMap.put("btype", localObject1);
      int i = paramaw.mJ;
      localObject2 = null;
      switch (i)
      {
      default:
      case 2:
      case 0:
      case 1:
      }
      break;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      if (localObject2 != null)
        paramHashMap.put("callbuttoncolor", localObject2);
      if (paramaw.mK != null)
        paramHashMap.put("channel", paramaw.mK);
      if (Color.alpha(paramaw.mL) != 0)
        paramHashMap.put("dcolor", o(paramaw.mL));
      if (paramaw.mM != null)
        paramHashMap.put("font", paramaw.mM);
      if (Color.alpha(paramaw.mN) != 0)
        paramHashMap.put("hcolor", o(paramaw.mN));
      paramHashMap.put("headersize", Integer.toString(paramaw.mO));
      if (paramaw.mP != null)
        paramHashMap.put("q", paramaw.mP);
      return;
      localObject1 = "none";
      break;
      localObject1 = "dashed";
      break;
      localObject1 = "dotted";
      break;
      localObject1 = "solid";
      break;
      localObject2 = "dark";
      continue;
      localObject2 = "light";
      continue;
      localObject2 = "medium";
    }
  }

  private static void a(HashMap<String, Object> paramHashMap, ec paramec)
  {
    paramHashMap.put("am", Integer.valueOf(paramec.rb));
    paramHashMap.put("cog", m(paramec.rc));
    paramHashMap.put("coh", m(paramec.rd));
    if (!TextUtils.isEmpty(paramec.re))
      paramHashMap.put("carrier", paramec.re);
    paramHashMap.put("gl", paramec.rf);
    if (paramec.rg)
      paramHashMap.put("simulator", Integer.valueOf(1));
    paramHashMap.put("ma", m(paramec.rh));
    paramHashMap.put("sp", m(paramec.ri));
    paramHashMap.put("hl", paramec.rj);
    if (!TextUtils.isEmpty(paramec.rk))
      paramHashMap.put("mv", paramec.rk);
    paramHashMap.put("muv", Integer.valueOf(paramec.rl));
    if (paramec.rm != -2)
      paramHashMap.put("cnt", Integer.valueOf(paramec.rm));
    paramHashMap.put("gnt", Integer.valueOf(paramec.rn));
    paramHashMap.put("pt", Integer.valueOf(paramec.ro));
    paramHashMap.put("rm", Integer.valueOf(paramec.rp));
    paramHashMap.put("riv", Integer.valueOf(paramec.rq));
    paramHashMap.put("u_sd", Float.valueOf(paramec.rr));
    paramHashMap.put("sh", Integer.valueOf(paramec.rt));
    paramHashMap.put("sw", Integer.valueOf(paramec.rs));
    Bundle localBundle1 = new Bundle();
    localBundle1.putInt("active_network_state", paramec.rx);
    localBundle1.putBoolean("active_network_metered", paramec.rw);
    paramHashMap.put("connectivity", localBundle1);
    Bundle localBundle2 = new Bundle();
    localBundle2.putBoolean("is_charging", paramec.rv);
    localBundle2.putDouble("battery_level", paramec.ru);
    paramHashMap.put("battery", localBundle2);
  }

  private static Integer m(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
      return Integer.valueOf(i);
  }

  private static String o(int paramInt)
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(0xFFFFFF & paramInt);
    return String.format(localLocale, "#%06x", arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dy
 * JD-Core Version:    0.6.2
 */