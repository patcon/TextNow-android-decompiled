package com.mologiq.analytics;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

final class ac extends w
{
  private static final ac c = new ac(".f4532369-bca8-4847-bd88-d1779ee05f8f");
  private List<ad> a = new ArrayList();
  private long b = 0L;

  private ac(String paramString)
  {
    super(paramString);
  }

  static ac b()
  {
    return c;
  }

  protected final String a()
  {
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("timestamp", this.b);
    if ((this.a != null) && (this.a.size() > 0))
    {
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        ad localad = (ad)localIterator.next();
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("n", localad.a());
        localJSONObject2.put("v", localad.b());
        localJSONArray.put(localJSONObject2);
      }
      localJSONObject1.put("tp", localJSONArray);
    }
    return localJSONObject1.toString();
  }

  final void a(long paramLong)
  {
    this.b = paramLong;
  }

  protected final void a(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      JSONObject localJSONObject1 = new JSONObject(paramString);
      if (!localJSONObject1.isNull("core"))
      {
        JSONObject localJSONObject2 = localJSONObject1.getJSONObject("core");
        this.b = localJSONObject2.getLong("timestamp");
        if (!localJSONObject2.isNull("tp"))
        {
          JSONArray localJSONArray = localJSONObject2.getJSONArray("tp");
          if ((localJSONArray != null) && (localJSONArray.length() > 0))
          {
            this.a = new ArrayList();
            for (int i = 0; i < localJSONArray.length(); i++)
            {
              JSONObject localJSONObject3 = localJSONArray.getJSONObject(i);
              ad localad = new ad(this);
              localad.a(localJSONObject3.getString("n"));
              localad.b(localJSONObject3.getString("v"));
              this.a.add(localad);
            }
          }
        }
      }
    }
  }

  protected final void b(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      JSONObject localJSONObject1 = new JSONObject(paramString);
      if (!localJSONObject1.isNull("tp"))
      {
        JSONArray localJSONArray = localJSONObject1.getJSONArray("tp");
        if ((localJSONArray != null) && (localJSONArray.length() > 0))
        {
          this.a = new ArrayList();
          for (int i = 0; i < localJSONArray.length(); i++)
          {
            JSONObject localJSONObject2 = localJSONArray.getJSONObject(i);
            ad localad = new ad(this);
            localad.a(localJSONObject2.getString("n"));
            localad.b(localJSONObject2.getString("v"));
            this.a.add(localad);
          }
        }
      }
    }
  }

  public final Map<String, Object> c()
  {
    if ((this.a != null) && (this.a.size() > 0))
    {
      HashMap localHashMap = new HashMap();
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        ad localad = (ad)localIterator.next();
        localHashMap.put(localad.a(), localad.b());
      }
      return localHashMap;
    }
    return null;
  }

  public final void c(Context paramContext)
  {
    String str1 = ak.a(paramContext) + System.getProperty("line.separator") + ".f4532369-bca8-4847-bd88-d1779ee05f8f";
    JSONObject localJSONObject = new JSONObject();
    String str2 = a();
    if ((str2 != null) && (str2.length() > 0))
      localJSONObject.put("core", new JSONObject(str2));
    if (("" != null) && ("".length() > 0))
      localJSONObject.put("extra", new JSONObject(""));
    ak.a(str1, localJSONObject.toString());
  }

  final long d()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.ac
 * JD-Core Version:    0.6.2
 */