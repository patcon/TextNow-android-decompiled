package com.admarvel.android.ads;

import android.app.Activity;
import android.view.Display;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

class AdMarvelWebView$ag
  implements Runnable
{
  private final WeakReference<Activity> a;
  private String b = null;
  private Activity c = null;

  public AdMarvelWebView$ag(Activity paramActivity, String paramString)
  {
    this.a = new WeakReference(paramActivity);
    this.b = paramString;
  }

  public void run()
  {
    this.c = ((Activity)this.a.get());
    if (this.c == null);
    Display localDisplay;
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              localDisplay = ((WindowManager)this.c.getSystemService("window")).getDefaultDisplay();
              if (this.b.equalsIgnoreCase("Portrait"))
              {
                this.c.setRequestedOrientation(1);
                return;
              }
              if (!this.b.equalsIgnoreCase("LandscapeLeft"))
                break;
              this.c.setRequestedOrientation(0);
            }
            while (localDisplay.getRotation() == 1);
            this.c.setRequestedOrientation(8);
            return;
            if (this.b.equalsIgnoreCase("PortraitUpSideDown"))
            {
              this.c.setRequestedOrientation(9);
              return;
            }
            if (!this.b.equalsIgnoreCase("LandscapeRight"))
              break;
            this.c.setRequestedOrientation(8);
          }
          while (localDisplay.getRotation() == 3);
          this.c.setRequestedOrientation(0);
          return;
        }
        while (!this.b.equalsIgnoreCase("none"));
        if (localDisplay.getRotation() == 2)
        {
          this.c.setRequestedOrientation(9);
          return;
        }
      }
      while (localDisplay.getRotation() != 3);
      this.c.setRequestedOrientation(8);
    }
    while (localDisplay.getRotation() == 3);
    this.c.setRequestedOrientation(0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.ag
 * JD-Core Version:    0.6.2
 */