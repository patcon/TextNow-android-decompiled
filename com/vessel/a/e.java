package com.vessel.a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

public final class e
{
  String a;
  String b;
  d.c c;
  d.b d;

  public e(JSONObject paramJSONObject)
  {
    this.a = paramJSONObject.optString("key");
    String str1 = paramJSONObject.optString("operator");
    d.c localc;
    String str2;
    d.b localb;
    if (">".equals(str1))
    {
      localc = d.c.a;
      this.c = localc;
      this.b = paramJSONObject.optString("value");
      str2 = paramJSONObject.optString("operand_type");
      if (!"integer".equalsIgnoreCase(str2))
        break label164;
      localb = d.b.b;
    }
    while (true)
    {
      this.d = localb;
      return;
      if (">=".equals(str1))
      {
        localc = d.c.c;
        break;
      }
      if ("<".equals(str1))
      {
        localc = d.c.b;
        break;
      }
      if ("<=".equals(str1))
      {
        localc = d.c.d;
        break;
      }
      if ("==".equals(str1))
      {
        localc = d.c.e;
        break;
      }
      if ("!=".equals(str1))
      {
        localc = d.c.f;
        break;
      }
      localc = null;
      break;
      label164: if ("boolean".equals(str2))
        localb = d.b.d;
      else if ("number".equalsIgnoreCase(str2))
        localb = d.b.c;
      else if ("date".equalsIgnoreCase(str2))
        localb = d.b.e;
      else
        localb = d.b.a;
    }
  }

  protected static Boolean a(String paramString)
  {
    if ("true".equalsIgnoreCase(paramString))
      return Boolean.valueOf(true);
    if ("false".equalsIgnoreCase(paramString))
      return Boolean.valueOf(false);
    return Boolean.valueOf(false);
  }

  protected static Integer b(String paramString)
  {
    try
    {
      Integer localInteger = Integer.valueOf(paramString);
      return localInteger;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return null;
  }

  protected static Double c(String paramString)
  {
    try
    {
      Double localDouble = Double.valueOf(paramString);
      return localDouble;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return null;
  }

  public static Date d(String paramString)
  {
    if (paramString == null)
      return null;
    try
    {
      Date localDate = new Date(1000L * Long.parseLong(paramString));
      return localDate;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return null;
  }

  public static Date e(String paramString)
  {
    try
    {
      Date localDate = new SimpleDateFormat("M-d-yyyy", Locale.ENGLISH).parse(paramString);
      return localDate;
    }
    catch (ParseException localParseException)
    {
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.vessel.a.e
 * JD-Core Version:    0.6.2
 */