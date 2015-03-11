package com.admarvel.android.ads;

import android.location.Location;
import android.util.Log;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.c;
import java.lang.ref.WeakReference;

class r$p
  implements Runnable
{
  private final WeakReference<d> a;
  private final String b;
  private String c = "null";

  public r$p(d paramd, String paramString)
  {
    this.a = new WeakReference(paramd);
    this.b = paramString;
  }

  public void run()
  {
    d locald;
    try
    {
      locald = (d)this.a.get();
      if (locald == null)
        return;
      if ((!r.c(locald.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) && (!r.c(locald.getContext(), "android.permission.ACCESS_FINE_LOCATION")))
      {
        locald.e(this.b + "(" + this.c + ")");
        return;
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      return;
    }
    if (r.b(locald.getContext(), "location"))
    {
      Location localLocation = c.a().a(locald);
      if (localLocation != null)
        this.c = (localLocation.getLatitude() + "," + localLocation.getLongitude() + "," + localLocation.getAccuracy());
      locald.e(this.b + "(" + this.c + ")");
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.r.p
 * JD-Core Version:    0.6.2
 */