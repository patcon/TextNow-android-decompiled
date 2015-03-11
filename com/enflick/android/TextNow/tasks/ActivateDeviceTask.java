package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.activation.Activate;
import com.enflick.android.TextNow.api.users.activation.a;
import org.json.JSONObject;
import textnow.x.i;
import textnow.z.u;

public class ActivateDeviceTask extends c
{
  private String d;
  private String e;
  private String f;

  public ActivateDeviceTask(String paramString1, String paramString2)
  {
    this.d = paramString1;
    this.e = paramString2;
  }

  public final String a()
  {
    return this.f;
  }

  public void run()
  {
    a locala = new a(new u(this.a).b(), this.d, this.e);
    i locali = new Activate(this.a).runSync(locala);
    if (a(locali))
      return;
    String str = (String)locali.b();
    try
    {
      this.f = new JSONObject(str).getJSONObject("device").getString("msl");
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.ActivateDeviceTask
 * JD-Core Version:    0.6.2
 */