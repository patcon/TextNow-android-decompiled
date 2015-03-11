package textnow.u;

import org.json.JSONObject;

public final class n
{
  String a;
  String b;
  String c;
  String d;
  String e;
  String f;

  public n(String paramString)
  {
    this.f = paramString;
    JSONObject localJSONObject = new JSONObject(this.f);
    this.a = localJSONObject.optString("productId");
    this.b = localJSONObject.optString("type");
    this.c = localJSONObject.optString("price");
    this.d = localJSONObject.optString("title");
    this.e = localJSONObject.optString("description");
  }

  public final String a()
  {
    return this.c;
  }

  public final String toString()
  {
    return "SkuDetails:" + this.f;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.u.n
 * JD-Core Version:    0.6.2
 */