package com.admarvel.android.ads;

public abstract interface AdMarvelAdapterListener
{
  public abstract void onClickAd(String paramString);

  public abstract void onClose();

  public abstract void onExpand();

  public abstract void onFailedToReceiveAd(int paramInt, AdMarvelUtils.ErrorReason paramErrorReason);

  public abstract void onReceiveAd();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelAdapterListener
 * JD-Core Version:    0.6.2
 */