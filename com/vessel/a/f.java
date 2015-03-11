package com.vessel.a;

import android.text.TextUtils;
import com.vessel.enums.VesselEnums.TestVariation;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  String a;
  long b;
  long c;
  f.b d;
  HashMap<String, f.a> e = new HashMap();
  JSONObject f = null;
  private boolean g = false;

  public f(JSONObject paramJSONObject)
  {
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("variation");
    this.a = paramJSONObject.optString("name", "");
    this.b = paramJSONObject.optLong("id", 0L);
    this.c = paramJSONObject.optLong("last_update", 0L);
    this.f = paramJSONObject.optJSONObject("filters");
    JSONArray localJSONArray;
    int i;
    if (localJSONObject1 != null)
    {
      this.d = new f.b(localJSONObject1.optString("name", ""), localJSONObject1.optLong("id", 0L), localJSONObject1.optDouble("percentage", 0.0D));
      localJSONArray = localJSONObject1.optJSONArray("keys");
      if (localJSONArray != null)
        i = 0;
    }
    while (true)
    {
      if (i < localJSONArray.length());
      try
      {
        JSONObject localJSONObject2 = localJSONArray.getJSONObject(i);
        f.a locala = new f.a(localJSONObject2.optString("key"), localJSONObject2.optString("value"), localJSONObject2.optString("type"));
        this.e.put(locala.a, locala);
        label189: i++;
        continue;
        return;
      }
      catch (Exception localException)
      {
        break label189;
      }
    }
  }

  public final Object a()
  {
    return Long.valueOf(this.b);
  }

  public final String a(String paramString)
  {
    if (this.e != null)
    {
      f.a locala = (f.a)this.e.get(paramString);
      if (locala != null)
        return locala.b;
    }
    return null;
  }

  public final void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public final Object b()
  {
    if (this.d != null)
      return Long.valueOf(this.d.b);
    return Integer.valueOf(-1);
  }

  public final String c()
  {
    return this.a;
  }

  public final VesselEnums.TestVariation d()
  {
    if ((this.d != null) && (!TextUtils.isEmpty(this.d.a)))
      return VesselEnums.TestVariation.valueOf(this.d.a);
    return VesselEnums.TestVariation.NOTAVAILABLE;
  }

  public final JSONObject e()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("name", this.a);
      localJSONObject.put("test_id", this.b);
      if (this.d != null)
      {
        localJSONObject.put("variation", this.d.a);
        localJSONObject.put("variation_id", this.d.b);
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
    }
    return null;
  }

  public final boolean f()
  {
    return this.g;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.vessel.a.f
 * JD-Core Version:    0.6.2
 */