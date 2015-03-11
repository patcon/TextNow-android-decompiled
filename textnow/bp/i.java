package textnow.bp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import net.hockeyapp.android.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
{
  ArrayList<JSONObject> a;
  JSONObject b;
  h c;

  public i(String paramString, h paramh)
  {
    this.c = paramh;
    a(paramString);
    Collections.sort(this.a, new Comparator()
    {
      private static int a(JSONObject paramAnonymousJSONObject1, JSONObject paramAnonymousJSONObject2)
      {
        try
        {
          int i = paramAnonymousJSONObject1.getInt("version");
          int j = paramAnonymousJSONObject2.getInt("version");
          if (i > j);
          return 0;
        }
        catch (JSONException localJSONException)
        {
        }
        return 0;
      }
    });
  }

  private static int a(JSONObject paramJSONObject)
  {
    try
    {
      int i = paramJSONObject.getInt("version");
      return i;
    }
    catch (JSONException localJSONException)
    {
    }
    return 0;
  }

  private static int a(JSONObject paramJSONObject, String paramString, int paramInt)
  {
    try
    {
      int i = paramJSONObject.getInt(paramString);
      return i;
    }
    catch (JSONException localJSONException)
    {
    }
    return 0;
  }

  private static String a(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    try
    {
      String str = paramJSONObject.getString(paramString1);
      return str;
    }
    catch (JSONException localJSONException)
    {
    }
    return paramString2;
  }

  private void a(String paramString)
  {
    this.b = new JSONObject();
    try
    {
      JSONArray localJSONArray = new JSONArray(paramString);
      this.a = new ArrayList();
      int i = this.c.getCurrentVersionCode();
      for (int j = 0; j < localJSONArray.length(); j++)
      {
        JSONObject localJSONObject = localJSONArray.getJSONObject(j);
        if (localJSONObject.getInt("version") > i)
        {
          this.b = localJSONObject;
          i = localJSONObject.getInt("version");
        }
        this.a.add(localJSONObject);
      }
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    catch (JSONException localJSONException)
    {
    }
  }

  private static String b(JSONObject paramJSONObject)
  {
    try
    {
      String str = paramJSONObject.getString("shortversion");
      return str;
    }
    catch (JSONException localJSONException)
    {
    }
    return "";
  }

  public final String a()
  {
    return a(this.b, "shortversion", "") + " (" + a(this.b, "version", "") + ")";
  }

  public final String a(boolean paramBoolean)
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("<html>");
    localStringBuilder1.append("<body style='padding: 0px 0px 20px 0px'>");
    Iterator localIterator = this.a.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      JSONObject localJSONObject = (JSONObject)localIterator.next();
      if (i > 0)
        localStringBuilder1.append("<hr style='border-top: 1px solid #c8c8c8; border-bottom: 0px; margin: 40px 10px 0px 10px;' />");
      StringBuilder localStringBuilder2 = new StringBuilder();
      int j = a(localJSONObject);
      String str1 = b(localJSONObject);
      localStringBuilder2.append("<div style='padding: 20px 10px 10px;'><strong>");
      StringBuilder localStringBuilder4;
      String str3;
      if (i == 0)
      {
        localStringBuilder2.append("Newest version:");
        localStringBuilder2.append("</strong></div>");
        localStringBuilder1.append(localStringBuilder2.toString());
        localStringBuilder4 = new StringBuilder();
        str3 = a(localJSONObject, "notes", "");
        localStringBuilder4.append("<div style='padding: 0px 10px;'>");
        if (str3.trim().length() != 0)
          break label283;
        localStringBuilder4.append("<em>No information.</em>");
      }
      while (true)
      {
        localStringBuilder4.append("</div>");
        localStringBuilder1.append(localStringBuilder4.toString());
        i++;
        break;
        int k = this.c.getCurrentVersionCode();
        StringBuilder localStringBuilder3 = new StringBuilder().append("Version ").append(str1).append(" (").append(j).append("): ");
        if (j == k);
        for (String str2 = "[INSTALLED]"; ; str2 = "")
        {
          localStringBuilder2.append(str2);
          break;
        }
        label283: localStringBuilder4.append(str3);
      }
    }
    localStringBuilder1.append("</body>");
    localStringBuilder1.append("</html>");
    return localStringBuilder1.toString();
  }

  public final String b()
  {
    int i = a(this.b, "appsize", 0);
    Date localDate = new Date(1000L * a(this.b, "timestamp", 0));
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    StringBuilder localStringBuilder = new StringBuilder().append(localSimpleDateFormat.format(localDate)).append(" - ");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Float.valueOf(i / 1024.0F / 1024.0F);
    return String.format("%.2f", arrayOfObject) + " MB";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bp.i
 * JD-Core Version:    0.6.2
 */