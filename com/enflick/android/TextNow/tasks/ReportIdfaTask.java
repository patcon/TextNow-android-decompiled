package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.IdfaPost;
import com.enflick.android.TextNow.api.e;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import textnow.u.r;

public class ReportIdfaTask extends c
{
  public void run()
  {
    r localr = new r(this.a);
    Object localObject = "";
    try
    {
      String str2 = AdvertisingIdClient.getAdvertisingIdInfo(this.a).getId();
      localObject = str2;
      label30: if (((String)localObject).length() == 0)
      {
        localr.E((String)localObject);
        localr.n();
      }
      e locale;
      do
      {
        String str1;
        do
        {
          return;
          str1 = localr.ab();
        }
        while ((str1 != null) && (str1.equals(localObject)));
        locale = new e((String)localObject);
      }
      while (a(new IdfaPost(this.a).runSync(locale)));
      localr.E((String)localObject);
      localr.n();
      return;
    }
    catch (Exception localException)
    {
      break label30;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.ReportIdfaTask
 * JD-Core Version:    0.6.2
 */