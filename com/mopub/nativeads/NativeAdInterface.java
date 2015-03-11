package com.mopub.nativeads;

import android.view.View;
import java.util.Map;
import java.util.Set;

abstract interface NativeAdInterface
{
  public abstract void destroy();

  public abstract String getCallToAction();

  public abstract String getClickDestinationUrl();

  public abstract Object getExtra(String paramString);

  public abstract Map<String, Object> getExtras();

  public abstract String getIconImageUrl();

  public abstract int getImpressionMinPercentageViewed();

  public abstract int getImpressionMinTimeViewed();

  public abstract Set<String> getImpressionTrackers();

  public abstract String getMainImageUrl();

  public abstract Double getStarRating();

  public abstract String getText();

  public abstract String getTitle();

  public abstract void handleClick(View paramView);

  public abstract void prepareImpression(View paramView);

  public abstract void recordImpression();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.NativeAdInterface
 * JD-Core Version:    0.6.2
 */