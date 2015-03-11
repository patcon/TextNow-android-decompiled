package com.enflick.android.TextNow.tasks;

import android.text.TextUtils;
import com.enflick.android.TextNow.activities.phone.h;
import com.enflick.android.TextNow.api.SettingsGet;
import com.enflick.android.TextNow.api.k;
import com.enflick.android.TextNow.api.responsemodel.Settings;
import com.enflick.android.TextNow.api.responsemodel.Settings.AndroidSettings;
import com.enflick.android.TextNow.api.responsemodel.Settings.AndroidSettings.CDMA;
import com.enflick.android.TextNow.api.responsemodel.Settings.AndroidSettings.CallRating;
import com.enflick.android.TextNow.api.responsemodel.Settings.AndroidSettings.SIP;
import textnow.x.i;
import textnow.z.p;

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
    p localp = new p(this.a);
    if (localSettings.androidSetting.sip != null)
    {
      String str = localSettings.androidSetting.sip.codecOrder;
      if (!TextUtils.isEmpty(str))
        localp.c(str);
    }
    localp.b(localSettings.androidSetting.vesselEnabled);
    Settings.AndroidSettings.CDMA localCDMA1 = localSettings.androidSetting.cdma;
    Settings.AndroidSettings.CDMA localCDMA2 = localSettings.androidSetting.cdma_aggressive;
    Settings.AndroidSettings.CDMA localCDMA3 = localSettings.androidSetting.cdma_low;
    Settings.AndroidSettings.CDMA localCDMA4;
    if ((localp.z()) && (localSettings.androidSetting.cdma_aggressive != null))
      localCDMA4 = localSettings.androidSetting.cdma_aggressive;
    while (true)
    {
      if (localCDMA4 != null)
      {
        if (localCDMA4.pingThreshold > 0)
          localp.a(localCDMA4.pingThreshold);
        if (localCDMA4.bandwidthThreshold > 0)
          localp.f(localCDMA4.bandwidthThreshold);
        if (localCDMA4.downloadTimeout > 0)
          localp.j(localCDMA4.downloadTimeout);
        localp.a(localCDMA4.testFileUrl);
      }
      try
      {
        h localh = h.a();
        com.enflick.android.TextNow.activities.phone.b localb1 = new com.enflick.android.TextNow.activities.phone.b();
        int i;
        label262: int j;
        label297: Settings.AndroidSettings.CallRating localCallRating;
        if (textnow.v.a.a)
        {
          i = com.enflick.android.TextNow.activities.phone.a.a;
          com.enflick.android.TextNow.activities.phone.b localb2 = localb1.a(i);
          if (!textnow.v.a.a)
            break label506;
          j = com.enflick.android.TextNow.activities.phone.a.b;
          localh.a(localb2.b(j).a());
          localCallRating = localSettings.androidSetting.callRating;
          if (localCallRating != null)
            localp.c(localCallRating.minWaitHr);
        }
        try
        {
          localp.b(Float.parseFloat(localCallRating.showMinProbability));
          localp.c(Float.parseFloat(localCallRating.showMaxProbability));
          localp.e(Float.parseFloat(localCallRating.satisfiedThreshold));
          localp.d(Float.parseFloat(localCallRating.changeSensitivity));
          label373: if ((localCDMA2 != null) && (localCDMA3 != null))
          {
            localp.d(localCDMA3.pingThreshold);
            localp.e(localCDMA2.pingThreshold);
            localp.h(localCDMA2.bandwidthThreshold);
            localp.i(localCDMA3.bandwidthThreshold);
          }
          if (localSettings.androidSetting.offerwall != null)
            localp.g(localSettings.androidSetting.offerwall);
          if (localSettings.androidSetting.banners != null)
            localp.a(localSettings.androidSetting.banners);
          localp.B();
          this.d = true;
          return;
          if (textnow.v.b.e())
          {
            localCDMA4 = localSettings.androidSetting.cdma_low;
            continue;
            i = localCDMA4.pingThreshold;
            break label262;
            label506: j = localCDMA4.bandwidthThreshold;
          }
        }
        catch (NumberFormatException localNumberFormatException)
        {
          break label373;
        }
      }
      catch (Exception localException)
      {
        break label297;
        localCDMA4 = localCDMA1;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetSettingsTask
 * JD-Core Version:    0.6.2
 */