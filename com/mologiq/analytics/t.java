package com.mologiq.analytics;

import android.content.Context;
import org.json.JSONObject;

public abstract class t
{
  private final String a;

  public t(String paramString)
  {
    this.a = paramString;
  }

  protected abstract String a();

  final void a(Context paramContext)
  {
    try
    {
      a(af.b(af.a(paramContext) + System.getProperty("line.separator") + this.a));
      return;
    }
    catch (Exception localException)
    {
      af.a(localException.getStackTrace().toString());
    }
  }

  protected abstract void a(String paramString);

  final boolean b(Context paramContext)
  {
    String str = af.b(af.a(paramContext) + System.getProperty("line.separator") + this.a);
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

  public abstract void c(Context paramContext);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.t
 * JD-Core Version:    0.6.2
 */