package com.admarvel.android.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class AdMarvelInternalWebView$l extends BroadcastReceiver
{
  AdMarvelInternalWebView$l(AdMarvelInternalWebView paramAdMarvelInternalWebView)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.SCREEN_OFF"))
      if (this.a.isLastStateVisible)
      {
        String str2 = "javascript:" + this.a.visibilityCallback + "(" + false + ")";
        this.a.loadUrl(str2);
        this.a.isLastStateVisible = false;
      }
    int j;
    do
    {
      do
        return;
      while ((!paramIntent.getAction().equals("android.intent.action.SCREEN_ON")) || (this.a.isLastStateVisible));
      int[] arrayOfInt = { -1, -1 };
      this.a.getLocationOnScreen(arrayOfInt);
      int i = arrayOfInt[1];
      j = 0;
      if (i >= 0)
      {
        int k = arrayOfInt[1];
        int m = ab.h(this.a.getContext());
        j = 0;
        if (k < m)
          j = 1;
      }
    }
    while (j == 0);
    String str1 = "javascript:" + this.a.visibilityCallback + "(" + true + ")";
    this.a.loadUrl(str1);
    this.a.isLastStateVisible = true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInternalWebView.l
 * JD-Core Version:    0.6.2
 */