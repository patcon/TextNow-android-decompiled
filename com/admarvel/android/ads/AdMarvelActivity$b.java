package com.admarvel.android.ads;

import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

class AdMarvelActivity$b
  implements b
{
  private final WeakReference<AdMarvelActivity> a;

  public AdMarvelActivity$b(AdMarvelActivity paramAdMarvelActivity)
  {
    this.a = new WeakReference(paramAdMarvelActivity);
  }

  public void a(String paramString)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.a.get();
    if (localAdMarvelActivity == null);
    d locald;
    do
    {
      RelativeLayout localRelativeLayout;
      do
      {
        return;
        localRelativeLayout = (RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.a);
      }
      while (localRelativeLayout == null);
      locald = (d)localRelativeLayout.findViewWithTag(paramString + "WEBVIEW");
    }
    while ((locald == null) || (locald.b()) || (locald.u == null) || (locald.u.length() <= 0));
    locald.loadUrl("javascript:" + locald.u + "()");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.b
 * JD-Core Version:    0.6.2
 */