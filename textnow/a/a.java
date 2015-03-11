package textnow.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import org.json.JSONObject;
import textnow.b.h;

public final class a
{
  public static JSONObject a(Context paramContext)
  {
    JSONObject localJSONObject1 = new JSONObject();
    if (paramContext != null);
    while (true)
    {
      try
      {
        Resources localResources = paramContext.getResources();
        localJSONObject1.put("manufacturer", Build.MANUFACTURER);
        localJSONObject1.put("model", Build.MODEL);
        JSONObject localJSONObject2 = new JSONObject();
        JSONObject localJSONObject3 = new JSONObject();
        Configuration localConfiguration = localResources.getConfiguration();
        str = "";
        switch (0xF & localConfiguration.screenLayout)
        {
        default:
          localJSONObject3.put("screen-size", str);
          localJSONObject2.put("screen", localJSONObject3);
          localJSONObject1.put("hardware", localJSONObject2);
          localJSONObject1.put("software", h.a());
          localJSONObject1.put("network_info", h.d(paramContext));
          localJSONObject1.put("location", h.e(paramContext));
          return localJSONObject1;
        case 4:
          str = "xlarge";
          continue;
        case 1:
        case 2:
        case 3:
        }
      }
      catch (Exception localException)
      {
      }
      return localJSONObject1;
      String str = "small";
      continue;
      str = "normal";
      continue;
      str = "large";
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.a.a
 * JD-Core Version:    0.6.2
 */