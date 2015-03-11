package com.google.ads.mediation.customevent;

@Deprecated
public abstract interface CustomEventListener
{
  public abstract void onDismissScreen();

  public abstract void onFailedToReceiveAd();

  public abstract void onLeaveApplication();

  public abstract void onPresentScreen();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventListener
 * JD-Core Version:    0.6.2
 */