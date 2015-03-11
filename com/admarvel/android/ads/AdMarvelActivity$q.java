package com.admarvel.android.ads;

import android.app.Activity;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$q
  implements Runnable
{
  private final WeakReference<Activity> a;
  private String b = null;
  private Activity c = null;

  public AdMarvelActivity$q(Activity paramActivity, String paramString)
  {
    this.a = new WeakReference(paramActivity);
    this.b = paramString;
  }

  public void run()
  {
    Display localDisplay;
    try
    {
      this.c = ((Activity)this.a.get());
      if (this.c == null)
        return;
      if (this.b == null)
        return;
      localDisplay = ((WindowManager)this.c.getSystemService("window")).getDefaultDisplay();
      if (this.b.equalsIgnoreCase("Portrait"))
      {
        this.c.setRequestedOrientation(1);
        if (localDisplay.getRotation() == 0)
          return;
        this.c.setRequestedOrientation(9);
        return;
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      return;
    }
    if (this.b.equalsIgnoreCase("LandscapeLeft"))
    {
      this.c.setRequestedOrientation(0);
      if (localDisplay.getRotation() != 1)
        this.c.setRequestedOrientation(8);
    }
    else if (this.b.equalsIgnoreCase("PortraitUpSideDown"))
    {
      this.c.setRequestedOrientation(9);
      if (localDisplay.getRotation() != 2)
        this.c.setRequestedOrientation(1);
    }
    else if (this.b.equalsIgnoreCase("LandscapeRight"))
    {
      this.c.setRequestedOrientation(8);
      if (localDisplay.getRotation() != 3)
        this.c.setRequestedOrientation(0);
    }
    else if (this.b.equalsIgnoreCase("none"))
    {
      if (localDisplay.getRotation() == 2)
      {
        this.c.setRequestedOrientation(9);
        if (localDisplay.getRotation() != 2)
          this.c.setRequestedOrientation(1);
      }
      else if (localDisplay.getRotation() == 3)
      {
        this.c.setRequestedOrientation(8);
        if (localDisplay.getRotation() != 3)
          this.c.setRequestedOrientation(0);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.q
 * JD-Core Version:    0.6.2
 */