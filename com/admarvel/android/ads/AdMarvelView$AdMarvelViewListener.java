package com.admarvel.android.ads;

public abstract interface AdMarvelView$AdMarvelViewListener
{
  public abstract void onClickAd(AdMarvelView paramAdMarvelView, String paramString);

  public abstract void onClose();

  public abstract void onExpand();

  public abstract void onFailedToReceiveAd(AdMarvelView paramAdMarvelView, int paramInt, AdMarvelUtils.ErrorReason paramErrorReason);

  public abstract void onReceiveAd(AdMarvelView paramAdMarvelView);

  public abstract void onRequestAd(AdMarvelView paramAdMarvelView);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.AdMarvelViewListener
 * JD-Core Version:    0.6.2
 */