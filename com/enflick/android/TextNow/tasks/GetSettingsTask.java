package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.activities.phone.d;
import com.enflick.android.TextNow.api.SettingsGet;
import com.enflick.android.TextNow.api.k;
import com.enflick.android.TextNow.api.responsemodel.Settings;
import com.enflick.android.TextNow.api.responsemodel.Settings.AndroidSettings;
import com.enflick.android.TextNow.api.responsemodel.Settings.AndroidSettings.CDMA;
import com.enflick.android.TextNow.api.responsemodel.Settings.AndroidSettings.SIP;
import textnow.s.i;
import textnow.u.n;

public class GetSettingsTask extends c
{
  private boolean d = false;

  public final boolean a()
  {
    return this.d;
  }

  public void run()
  {
    k localk = new k();
    i locali = new SettingsGet(this.a).runSync(localk);
    if (a(locali));
    Settings localSettings;
    do
    {
      return;
      localSettings = (Settings)locali.c();
    }
    while ((localSettings == null) || (localSettings.androidSetting == null));
    n localn = new n(this.a);
    if (localSettings.androidSetting.sip != null)
    {
      String str = localSettings.androidSetting.sip.codecOrder;
      if (!TextUtils.isEmpty(str))
        localn.c(str);
    }
    localn.a(localSettings.androidSetting.vesselEnabled);
    Settings.AndroidSettings.CDMA localCDMA1 = localSettings.androidSetting.cdma;
    Settings.AndroidSettings.CDMA localCDMA2;
    if ((localn.l()) && (localSettings.androidSetting.cdma_aggressive != null))
      localCDMA2 = localSettings.androidSetting.cdma_aggressive;
    while (true)
    {
      if (localCDMA2 != null)
      {
        if (localCDMA2.pingThreshold > 0)
          localn.a(localCDMA2.pingThreshold);
        if (localCDMA2.bandwidthThreshold > 0)
          localn.c(localCDMA2.bandwidthThreshold);
        if (localCDMA2.downloadTimeout > 0)
          localn.e(localCDMA2.downloadTimeout);
        localn.a(localCDMA2.testFileUrl);
      }
      try
      {
        d locald = d.a();
        com.enflick.android.TextNow.activities.phone.b localb1 = new com.enflick.android.TextNow.activities.phone.b();
        int i;
        label244: com.enflick.android.TextNow.activities.phone.b localb2;
        if (textnow.q.a.a)
        {
          i = com.enflick.android.TextNow.activities.phone.a.a;
          localb2 = localb1.a(i);
          if (!textnow.q.a.a)
            break label362;
        }
        label279: label362: for (int j = com.enflick.android.TextNow.activities.phone.a.b; ; j = localCDMA2.bandwidthThreshold)
        {
          locald.a(localb2.b(j).a());
          if (localSettings.androidSetting.banner != null)
            localn.a(localSettings.androidSetting.banner);
          if (localSettings.androidSetting.offerwall != null)
            localn.g(localSettings.androidSetting.offerwall);
          localn.n();
          this.d = true;
          return;
          if (!textnow.q.b.e())
            break label377;
          localCDMA2 = localSettings.androidSetting.cdma_low;
          break;
          i = localCDMA2.pingThreshold;
          break label244;
        }
      }
      catch (Exception localException)
      {
        break label279;
        label377: localCDMA2 = localCDMA1;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetSettingsTask
 * JD-Core Version:    0.6.2
 */