package com.admarvel.android.ads;

import android.app.Activity;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$j
  implements Runnable
{
  private static int a = -2147483648;
  private final WeakReference<Activity> b;

  public AdMarvelActivity$j(Activity paramActivity)
  {
    this.b = new WeakReference(paramActivity);
  }

  public int a()
  {
    return a;
  }

  public void run()
  {
    try
    {
      if (this.b.get() != null)
        a = ((WindowManager)((Activity)this.b.get()).getSystemService("window")).getDefaultDisplay().getRotation();
      return;
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.j
 * JD-Core Version:    0.6.2
 */