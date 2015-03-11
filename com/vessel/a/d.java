package com.vessel.a;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.vessel.VesselSDK;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import textnow.b.h;

public final class d
{
  public static boolean a = false;

  private static String a(String paramString, Context paramContext)
  {
    if ((paramString == null) || (paramContext == null));
    while (true)
    {
      return null;
      if ("model".equalsIgnoreCase(paramString))
        return Build.MODEL;
      if ("app_version".equalsIgnoreCase(paramString))
        return h.a(paramContext);
      if ("app_version_code".equalsIgnoreCase(paramString))
        return h.b(paramContext);
      if ("locale".equalsIgnoreCase(paramString));
      try
      {
        String str2 = Locale.getDefault().toString();
        return str2;
        if ("platform_version".equalsIgnoreCase(paramString))
          return Build.VERSION.RELEASE;
        if ("platform_version_level".equalsIgnoreCase(paramString))
          return Integer.toString(Build.VERSION.SDK_INT);
        if ("vessel_sdk_version".equalsIgnoreCase(paramString))
          return "VesselSDK 1.9.1";
        if ("manufacturer".equalsIgnoreCase(paramString))
          return Build.MANUFACTURER;
        if ("operator".equalsIgnoreCase(paramString))
          return h.c(paramContext);
        if ("new_install".equalsIgnoreCase(paramString))
          return Boolean.toString(h.b(paramContext, "new_user", true));
        if ("language".equalsIgnoreCase(paramString));
        try
        {
          String str1 = Locale.getDefault().getLanguage();
          return str1;
          if ("install_date".equalsIgnoreCase(paramString))
          {
            long l = h.a(paramContext, "vessel_install_date", -1L);
            if (l != -1L)
              return Long.toString(l);
          }
          else
          {
            Map localMap = VesselSDK.getCustomFilterProperties();
            if ((localMap != null) && (localMap.containsKey(paramString)))
              return (String)localMap.get(paramString);
          }
        }
        catch (Exception localException1)
        {
          return null;
        }
      }
      catch (Exception localException2)
      {
      }
    }
    return null;
  }

  private static Date a(Date paramDate)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    try
    {
      Date localDate = localSimpleDateFormat.parse(localSimpleDateFormat.format(paramDate));
      return localDate;
    }
    catch (ParseException localParseException)
    {
    }
    return null;
  }

  private static boolean a(String paramString1, String paramString2, d.c paramc)
  {
    if (paramString1 == null);
    do
    {
      return false;
      switch (1.b[paramc.ordinal()])
      {
      default:
        return false;
      case 1:
        return paramString1.equals(paramString2);
      case 2:
      }
    }
    while (paramString1.equals(paramString2));
    return true;
  }

  public static boolean a(JSONObject paramJSONObject, Context paramContext)
  {
    if (paramJSONObject == null);
    d.a locala;
    label42: label173: label1013: label1019: 
    do
    {
      JSONArray localJSONArray;
      do
      {
        return true;
        localJSONArray = paramJSONObject.optJSONArray("filters");
      }
      while ((localJSONArray == null) || (localJSONArray.length() == 0));
      if ("OR".equalsIgnoreCase(paramJSONObject.optString("logic")))
        locala = d.a.b;
      for (int i = 0; ; i++)
      {
        if (i >= localJSONArray.length())
          break label1019;
        JSONObject localJSONObject = localJSONArray.optJSONObject(i);
        if (localJSONObject == null)
        {
          return false;
          locala = d.a.a;
          break label42;
        }
        e locale = new e(localJSONObject);
        if (locale.c == null)
          return false;
        String str = a(locale.a, paramContext);
        boolean bool1;
        switch (1.a[locale.d.ordinal()])
        {
        default:
          bool1 = a(str, locale.b, locale.c);
          if (bool1)
            new StringBuilder("Passed filter ").append(localJSONObject.toString()).toString();
          break;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
        while ((locala != d.a.b) || (!bool1))
        {
          if ((locala != d.a.a) || (bool1))
            break label1013;
          return false;
          bool1 = a(str, locale.b, locale.c);
          break label173;
          Double localDouble1 = e.c(str);
          Double localDouble2 = e.c(locale.b);
          double d1 = localDouble1.doubleValue();
          double d2 = localDouble2.doubleValue();
          d.c localc4 = locale.c;
          switch (1.b[localc4.ordinal()])
          {
          default:
            bool1 = false;
            break;
          case 1:
            if (d1 == d2)
            {
              bool1 = true;
              break;
            }
            bool1 = false;
            break;
          case 2:
            if (d1 != d2)
            {
              bool1 = true;
              break;
            }
            bool1 = false;
            break;
          case 3:
            if (d1 > d2)
            {
              bool1 = true;
              break;
            }
            bool1 = false;
            break;
          case 4:
            if (d1 >= d2)
            {
              bool1 = true;
              break;
            }
            bool1 = false;
            break;
          case 5:
            if (d1 < d2)
            {
              bool1 = true;
              break;
            }
            bool1 = false;
            break;
          case 6:
            if (d1 <= d2)
            {
              bool1 = true;
              break;
            }
            bool1 = false;
            break;
            boolean bool2 = e.a(str).booleanValue();
            boolean bool3 = e.a(locale.b).booleanValue();
            d.c localc3 = locale.c;
            switch (1.b[localc3.ordinal()])
            {
            default:
              bool1 = false;
              break;
            case 1:
              if (bool2 == bool3)
              {
                bool1 = true;
                break;
              }
              bool1 = false;
              break;
            case 2:
              if (bool2 != bool3)
              {
                bool1 = true;
                break;
              }
              bool1 = false;
              break;
              int j = e.b(str).intValue();
              int k = e.b(locale.b).intValue();
              d.c localc2 = locale.c;
              switch (1.b[localc2.ordinal()])
              {
              default:
                bool1 = false;
                break;
              case 1:
                if (j == k)
                {
                  bool1 = true;
                  break;
                }
                bool1 = false;
                break;
              case 2:
                if (j != k)
                {
                  bool1 = true;
                  break;
                }
                bool1 = false;
                break;
              case 3:
                if (j > k)
                {
                  bool1 = true;
                  break;
                }
                bool1 = false;
                break;
              case 4:
                if (j >= k)
                {
                  bool1 = true;
                  break;
                }
                bool1 = false;
                break;
              case 5:
                if (j < k)
                {
                  bool1 = true;
                  break;
                }
                bool1 = false;
                break;
              case 6:
                if (j <= k)
                {
                  bool1 = true;
                  break;
                }
                bool1 = false;
                break;
                Date localDate1 = e.d(str);
                Date localDate2 = e.e(locale.b);
                d.c localc1 = locale.c;
                if ((localDate1 == null) || (localDate2 == null))
                {
                  bool1 = false;
                  break;
                }
                Date localDate3 = a(localDate1);
                Date localDate4 = a(localDate2);
                switch (1.b[localc1.ordinal()])
                {
                default:
                  bool1 = false;
                  break;
                case 1:
                  bool1 = localDate3.equals(localDate4);
                  break;
                case 2:
                  if (!localDate3.equals(localDate4))
                  {
                    bool1 = true;
                    break;
                  }
                  bool1 = false;
                  break;
                case 3:
                  bool1 = localDate3.after(localDate4);
                  break;
                case 4:
                  if ((localDate3.after(localDate4)) || (localDate3.equals(localDate4)))
                  {
                    bool1 = true;
                    break;
                  }
                  bool1 = false;
                  break;
                case 5:
                  bool1 = localDate3.before(localDate4);
                  break;
                case 6:
                  if ((localDate3.before(localDate4)) || (localDate3.equals(localDate4)))
                  {
                    bool1 = true;
                    break;
                  }
                  bool1 = false;
                  break;
                  new StringBuilder("Fail filter ").append(localJSONObject.toString()).toString();
                }
                break;
              }
              break;
            }
            break;
          }
        }
      }
    }
    while (locala != d.a.b);
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.vessel.a.d
 * JD-Core Version:    0.6.2
 */