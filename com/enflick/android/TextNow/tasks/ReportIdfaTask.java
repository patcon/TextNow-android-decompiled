package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.IdfaPost;
import com.enflick.android.TextNow.api.e;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import textnow.z.u;

public class ReportIdfaTask extends c
{
  public void run()
  {
    u localu = new u(this.a);
    Object localObject = "";
    try
    {
      String str2 = AdvertisingIdClient.getAdvertisingIdInfo(this.a).getId();
      localObject = str2;
      label30: if (((String)localObject).length() == 0)
      {
        localu.B((String)localObject);
        localu.B();
      }
      e locale;
      do
      {
        String str1;
        do
        {
          return;
          str1 = localu.aa();
        }
        while ((str1 != null) && (str1.equals(localObject)));
        locale = new e((String)localObject);
      }
      while (a(new IdfaPost(this.a).runSync(locale)));
      localu.B((String)localObject);
      localu.B();
      return;
    }
    catch (Exception localException)
    {
      break label30;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.ReportIdfaTask
 * JD-Core Version:    0.6.2
 */