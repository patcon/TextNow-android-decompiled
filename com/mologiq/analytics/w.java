package com.mologiq.analytics;

import android.content.Context;
import org.json.JSONObject;

abstract class w
{
  private final String a;

  w(String paramString)
  {
    this.a = paramString;
  }

  protected abstract String a();

  final void a(Context paramContext)
  {
    try
    {
      a(ak.b(ak.a(paramContext) + System.getProperty("line.separator") + this.a));
      return;
    }
    catch (Exception localException)
    {
      ak.a(ak.a(localException));
    }
  }

  protected abstract void a(String paramString);

  final boolean b(Context paramContext)
  {
    String str = ak.b(ak.a(paramContext) + System.getProperty("line.separator") + this.a);
    boolean bool = true;
    if ((str != null) && (str.length() > 0))
    {
      JSONObject localJSONObject = new JSONObject(str).getJSONObject("core");
      if ((localJSONObject != null) && (localJSONObject.toString().equals(a())))
        bool = false;
    }
    if (bool)
      c(paramContext);
    return bool;
  }

  abstract void c(Context paramContext);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.w
 * JD-Core Version:    0.6.2
 */