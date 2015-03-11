package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.at;

public final class SearchAdRequest
{
  public static final int BORDER_TYPE_DASHED = 1;
  public static final int BORDER_TYPE_DOTTED = 2;
  public static final int BORDER_TYPE_NONE = 0;
  public static final int BORDER_TYPE_SOLID = 3;
  public static final int CALL_BUTTON_COLOR_DARK = 2;
  public static final int CALL_BUTTON_COLOR_LIGHT = 0;
  public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
  public static final String DEVICE_ID_EMULATOR = at.DEVICE_ID_EMULATOR;
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_INVALID_REQUEST = 1;
  public static final int ERROR_CODE_NETWORK_ERROR = 2;
  public static final int ERROR_CODE_NO_FILL = 3;
  private final at ks;
  private final int tc;
  private final int td;
  private final int te;
  private final int tf;
  private final int tg;
  private final int th;
  private final int ti;
  private final int tj;
  private final String tk;
  private final int tl;
  private final String tm;
  private final int tn;
  private final int to;
  private final String tp;

  private SearchAdRequest(SearchAdRequest.Builder paramBuilder)
  {
    this.tc = SearchAdRequest.Builder.a(paramBuilder);
    this.td = SearchAdRequest.Builder.b(paramBuilder);
    this.te = SearchAdRequest.Builder.c(paramBuilder);
    this.tf = SearchAdRequest.Builder.d(paramBuilder);
    this.tg = SearchAdRequest.Builder.e(paramBuilder);
    this.th = SearchAdRequest.Builder.f(paramBuilder);
    this.ti = SearchAdRequest.Builder.g(paramBuilder);
    this.tj = SearchAdRequest.Builder.h(paramBuilder);
    this.tk = SearchAdRequest.Builder.i(paramBuilder);
    this.tl = SearchAdRequest.Builder.j(paramBuilder);
    this.tm = SearchAdRequest.Builder.k(paramBuilder);
    this.tn = SearchAdRequest.Builder.l(paramBuilder);
    this.to = SearchAdRequest.Builder.m(paramBuilder);
    this.tp = SearchAdRequest.Builder.n(paramBuilder);
    this.ks = new at(SearchAdRequest.Builder.o(paramBuilder), this);
  }

  final at T()
  {
    return this.ks;
  }

  public final int getAnchorTextColor()
  {
    return this.tc;
  }

  public final int getBackgroundColor()
  {
    return this.td;
  }

  public final int getBackgroundGradientBottom()
  {
    return this.te;
  }

  public final int getBackgroundGradientTop()
  {
    return this.tf;
  }

  public final int getBorderColor()
  {
    return this.tg;
  }

  public final int getBorderThickness()
  {
    return this.th;
  }

  public final int getBorderType()
  {
    return this.ti;
  }

  public final int getCallButtonColor()
  {
    return this.tj;
  }

  public final String getCustomChannels()
  {
    return this.tk;
  }

  public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> paramClass)
  {
    return this.ks.getCustomEventExtrasBundle(paramClass);
  }

  public final int getDescriptionTextColor()
  {
    return this.tl;
  }

  public final String getFontFace()
  {
    return this.tm;
  }

  public final int getHeaderTextColor()
  {
    return this.tn;
  }

  public final int getHeaderTextSize()
  {
    return this.to;
  }

  public final Location getLocation()
  {
    return this.ks.getLocation();
  }

  @Deprecated
  public final <T extends NetworkExtras> T getNetworkExtras(Class<T> paramClass)
  {
    return this.ks.getNetworkExtras(paramClass);
  }

  public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> paramClass)
  {
    return this.ks.getNetworkExtrasBundle(paramClass);
  }

  public final String getQuery()
  {
    return this.tp;
  }

  public final boolean isTestDevice(Context paramContext)
  {
    return this.ks.isTestDevice(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.search.SearchAdRequest
 * JD-Core Version:    0.6.2
 */