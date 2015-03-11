package com.admarvel.android.ads;

public abstract interface AdMarvelAdapterListener
{
  public abstract void onClickAd(String paramString);

  public abstract void onClose();

  public abstract void onExpand();

  public abstract void onFailedToReceiveAd(int paramInt, AdMarvelUtils.ErrorReason paramErrorReason);

  public abstract void onReceiveAd();

  public abstract void onReceiveNativeAd(Object paramObject);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelAdapterListener
 * JD-Core Version:    0.6.2
 */