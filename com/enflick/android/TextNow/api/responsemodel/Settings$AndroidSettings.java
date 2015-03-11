package com.enflick.android.TextNow.api.responsemodel;

import textnow.y.c;

public class Settings$AndroidSettings
{

  @c(a="banner_message")
  public Settings.AndroidSettings.Banner banner;

  @c(a="banner_group")
  public Settings.AndroidSettings.Banner[] banners;

  @c(a="call_rating")
  public Settings.AndroidSettings.CallRating callRating;

  @c(a="cdma")
  public Settings.AndroidSettings.CDMA cdma;

  @c(a="cdma_use_aggressive")
  public boolean cdmaUseAggressive;

  @c(a="cdma_aggressive")
  public Settings.AndroidSettings.CDMA cdma_aggressive;

  @c(a="cdma_low")
  public Settings.AndroidSettings.CDMA cdma_low;

  @c(a="offerwall")
  public String offerwall;

  @c(a="sip")
  public Settings.AndroidSettings.SIP sip;

  @c(a="vessel_enabled")
  public boolean vesselEnabled;
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.responsemodel.Settings.AndroidSettings
 * JD-Core Version:    0.6.2
 */