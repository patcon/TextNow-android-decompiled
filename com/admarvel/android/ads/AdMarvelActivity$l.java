package com.admarvel.android.ads;

import android.location.Location;
import android.util.Log;
import android.view.ViewGroup;
import android.view.Window;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.c;
import java.lang.ref.WeakReference;

class AdMarvelActivity$l
  implements Runnable
{
  private final String a;
  private final WeakReference<d> b;
  private final WeakReference<AdMarvelActivity> c;

  public AdMarvelActivity$l(String paramString, d paramd, AdMarvelActivity paramAdMarvelActivity)
  {
    this.a = paramString;
    this.b = new WeakReference(paramd);
    this.c = new WeakReference(paramAdMarvelActivity);
  }

  public void run()
  {
    while (true)
    {
      d locald;
      AdMarvelActivity localAdMarvelActivity;
      label39: int i;
      int j;
      Location localLocation;
      String str3;
      String str4;
      boolean bool1;
      boolean bool2;
      String str2;
      try
      {
        if (this.b == null)
          break label798;
        locald = (d)this.b.get();
        if (this.c == null)
          break label803;
        localAdMarvelActivity = (AdMarvelActivity)this.c.get();
        break label793;
        if (locald == null)
          break label797;
        String str1 = r.a(localAdMarvelActivity.getBaseContext());
        i = r.d(localAdMarvelActivity.getBaseContext());
        if (i == 1)
        {
          j = 0;
          if (str1.equals("wifi"))
            break label808;
          if (!str1.equals("mobile"))
            break label753;
          break label808;
          if (!r.b(localAdMarvelActivity.getBaseContext(), "location"))
            break label781;
          localLocation = c.a().a(locald);
          if (localLocation == null)
            break label822;
          str3 = "{lat:" + localLocation.getLatitude() + ", lon:" + localLocation.getLongitude() + ", acc:" + localLocation.getAccuracy() + "}";
          if (!AdMarvelActivity.f(localAdMarvelActivity))
            break label761;
          str4 = "Expanded";
          StringBuilder localStringBuilder1 = new StringBuilder().append("{screen: true, orientation: true, heading: ").append(r.b(localAdMarvelActivity.getBaseContext(), "compass")).append(", location : ");
          if (r.c(localAdMarvelActivity.getBaseContext(), "android.permission.ACCESS_COARSE_LOCATION"))
            break label816;
          if (!r.c(localAdMarvelActivity.getBaseContext(), "android.permission.ACCESS_FINE_LOCATION"))
            break label769;
          break label816;
          StringBuilder localStringBuilder2 = localStringBuilder1.append(bool1).append(",shake: ").append(r.b(localAdMarvelActivity.getBaseContext(), "accelerometer")).append(",tilt: ").append(r.b(localAdMarvelActivity.getBaseContext(), "accelerometer")).append(", network: true, sms:").append(r.j(localAdMarvelActivity.getBaseContext())).append(", phone:").append(r.j(localAdMarvelActivity.getBaseContext())).append(", email:true,calendar:");
          if ((!r.c(localAdMarvelActivity.getBaseContext(), "android.permission.READ_CALENDAR")) || (!r.c(localAdMarvelActivity.getBaseContext(), "android.permission.WRITE_CALENDAR")))
            break label775;
          bool2 = true;
          String str5 = bool2 + ", camera: " + r.b(localAdMarvelActivity.getBaseContext(), "camera") + ",map:true, audio:true, video:true, 'level-1':true,'level-2': true, 'level-3':false}";
          ViewGroup localViewGroup = (ViewGroup)localAdMarvelActivity.getWindow().findViewById(16908290);
          localViewGroup.getWidth();
          String str6 = r.a(localAdMarvelActivity);
          try
          {
            locald.loadUrl("javascript:" + this.a + "({x:" + locald.getLeft() + ",y:" + locald.getTop() + ",width:" + locald.getWidth() + ",height:" + locald.getHeight() + ",appX:" + localViewGroup.getLeft() + ",appY:" + localViewGroup.getTop() + ",appWidth:" + localViewGroup.getWidth() + ",appHeight:" + localViewGroup.getHeight() + ",orientation:" + j + ",networkType:" + "'" + str1 + "'" + ",network:" + "'" + str2 + "'" + ",screenWidth:" + r.g(localAdMarvelActivity.getBaseContext()) + ",screenHeight:" + r.h(localAdMarvelActivity.getBaseContext()) + ",adType:" + "'" + str4 + "'" + ",supportedFeatures:" + str5 + ",sdkVersion:" + "'" + "2.4.7" + "'" + ",location:" + str3 + ",applicationSupportedOrientations:" + "'" + str6 + "'" + "})");
            return;
          }
          catch (Exception localException2)
          {
            Logging.log(Log.getStackTraceString(localException2));
            return;
          }
        }
      }
      catch (Exception localException1)
      {
        Logging.log(localException1.getMessage() + " Exception in InitAdMarvel ");
        return;
      }
      if (i == 2)
      {
        j = 90;
        continue;
        label753: str2 = "NO";
        continue;
        label761: str4 = "Interstitial";
        continue;
        label769: bool1 = false;
        continue;
        label775: bool2 = false;
        continue;
        label781: localLocation = null;
      }
      else
      {
        j = -1;
        continue;
        while (true)
        {
          label793: if (localAdMarvelActivity != null)
            break label39;
          label797: return;
          label798: locald = null;
          break;
          label803: localAdMarvelActivity = null;
        }
        label808: str2 = "YES";
        continue;
        label816: bool1 = true;
        continue;
        label822: str3 = "null";
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.l
 * JD-Core Version:    0.6.2
 */