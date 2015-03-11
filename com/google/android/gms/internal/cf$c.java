package com.google.android.gms.internal;

import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;

final class cf$c
{
  public final int index;
  public final ViewGroup.LayoutParams ot;
  public final ViewGroup ou;

  public cf$c(ex paramex)
  {
    this.ot = paramex.getLayoutParams();
    ViewParent localViewParent = paramex.getParent();
    if ((localViewParent instanceof ViewGroup))
    {
      this.ou = ((ViewGroup)localViewParent);
      this.index = this.ou.indexOfChild(paramex);
      this.ou.removeView(paramex);
      paramex.q(true);
      return;
    }
    throw new cf.a("Could not get the parent of the WebView for an overlay.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cf.c
 * JD-Core Version:    0.6.2
 */