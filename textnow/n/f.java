package textnow.n;

import android.text.TextUtils;
import com.enflick.android.TextNow.activities.ai;
import com.enflick.android.TextNow.tasks.PurchaseAdRemovalTask;
import com.enflick.android.TextNow.tasks.PurchaseCallForwardingTask;
import com.enflick.android.TextNow.tasks.PurchaseCreditsTask;
import java.util.Random;
import org.json.JSONObject;
import textnow.u.r;

public final class f
{
  private ai a;

  public f(ai paramai)
  {
    this.a = paramai;
  }

  public final void a(String paramString1, String paramString2, String paramString3, g paramg)
  {
    r localr = new r(this.a);
    int i = 1.a[paramg.ordinal()];
    String str1 = null;
    switch (i)
    {
    default:
      if (i.a(paramString1))
      {
        int j = i.b(paramString1);
        if (j > 0)
          new PurchaseCreditsTask(j, paramString2, paramString3, str1).b(this.a);
      }
      break;
    case 1:
    }
    do
    {
      return;
      str1 = localr.S();
      break;
      this.a.r();
      this.a.c(2131493343);
      return;
      if (!i.d(paramString1))
        break label182;
      String str4 = i.f(paramString1);
      if (!TextUtils.isEmpty(str4))
      {
        new PurchaseCallForwardingTask(str4, paramString2, paramString3, str1).b(this.a);
        return;
      }
    }
    while (i.e(paramString1));
    this.a.r();
    this.a.c(2131493343);
    return;
    label182: if (i.e(paramString1))
    {
      String str2 = i.f(paramString1);
      if (!TextUtils.isEmpty(str2))
      {
        if ("android.test.purchased".equals(paramString1));
        try
        {
          JSONObject localJSONObject = new JSONObject(paramString2);
          localJSONObject.put("random_string", Double.toString(new Random().nextDouble()));
          String str3 = localJSONObject.toString();
          paramString2 = str3;
          new PurchaseAdRemovalTask(str2, paramString2, paramString3, str1).b(this.a);
          return;
        }
        catch (Exception localException)
        {
          while (true)
            new StringBuilder().append("Couldn't write receipt back to json object: ").append(paramString2).toString();
        }
      }
      this.a.r();
      this.a.c(2131493343);
      return;
    }
    new StringBuilder().append("Unknown sku consumed: ").append(paramString1).toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.n.f
 * JD-Core Version:    0.6.2
 */