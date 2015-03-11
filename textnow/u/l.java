package textnow.u;

import java.io.Serializable;
import org.json.JSONObject;

public final class l
  implements Serializable
{
  String a;
  String b;
  String c;
  long d;
  int e;
  String f;
  String g;
  String h;
  String i;

  public l(String paramString1, String paramString2)
  {
    this.h = paramString1;
    JSONObject localJSONObject = new JSONObject(this.h);
    this.a = localJSONObject.optString("orderId");
    this.b = localJSONObject.optString("packageName");
    this.c = localJSONObject.optString("productId");
    this.d = localJSONObject.optLong("purchaseTime");
    this.e = localJSONObject.optInt("purchaseState");
    this.f = localJSONObject.optString("developerPayload");
    this.g = localJSONObject.optString("token", localJSONObject.optString("purchaseToken"));
    this.i = paramString2;
  }

  public final String a()
  {
    return this.c;
  }

  public final String b()
  {
    return this.g;
  }

  public final String c()
  {
    return this.h;
  }

  public final String d()
  {
    return this.i;
  }

  public final String toString()
  {
    return "PurchaseInfo:" + this.h;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.u.l
 * JD-Core Version:    0.6.2
 */