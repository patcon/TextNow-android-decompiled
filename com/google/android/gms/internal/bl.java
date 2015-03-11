package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bl
{
  public final String nk;
  public final String nl;
  public final List<String> nm;
  public final String nn;
  public final String no;
  public final List<String> np;
  public final String nq;

  public bl(JSONObject paramJSONObject)
  {
    this.nl = paramJSONObject.getString("id");
    JSONArray localJSONArray = paramJSONObject.getJSONArray("adapters");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    for (int i = 0; i < localJSONArray.length(); i++)
      localArrayList.add(localJSONArray.getString(i));
    this.nm = Collections.unmodifiableList(localArrayList);
    this.nn = paramJSONObject.optString("allocation_id", null);
    this.np = br.a(paramJSONObject, "imp_urls");
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("ad");
    String str1;
    JSONObject localJSONObject2;
    if (localJSONObject1 != null)
    {
      str1 = localJSONObject1.toString();
      this.nk = str1;
      localJSONObject2 = paramJSONObject.optJSONObject("data");
      if (localJSONObject2 == null)
        break label175;
    }
    label175: for (String str2 = localJSONObject2.toString(); ; str2 = null)
    {
      this.nq = str2;
      String str3 = null;
      if (localJSONObject2 != null)
        str3 = localJSONObject2.optString("class_name");
      this.no = str3;
      return;
      str1 = null;
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bl
 * JD-Core Version:    0.6.2
 */