package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import java.util.concurrent.Future;
import org.json.JSONObject;

@ez
public class fq
  implements fo.a<bp>
{
  public bp c(fo paramfo, JSONObject paramJSONObject)
  {
    Future localFuture1 = paramfo.a(paramJSONObject, "image", true);
    Future localFuture2 = paramfo.a(paramJSONObject, "secondary_image", false);
    return new bp(paramJSONObject.getString("headline"), (Drawable)localFuture1.get(), paramJSONObject.getString("body"), (Drawable)localFuture2.get(), paramJSONObject.getString("call_to_action"), paramJSONObject.getString("attribution"));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fq
 * JD-Core Version:    0.6.2
 */