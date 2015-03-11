package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.bg;

public final class SearchAdRequest
{
  public static final int BORDER_TYPE_DASHED = 1;
  public static final int BORDER_TYPE_DOTTED = 2;
  public static final int BORDER_TYPE_NONE = 0;
  public static final int BORDER_TYPE_SOLID = 3;
  public static final int CALL_BUTTON_COLOR_DARK = 2;
  public static final int CALL_BUTTON_COLOR_LIGHT = 0;
  public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
  public static final String DEVICE_ID_EMULATOR = bg.DEVICE_ID_EMULATOR;
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_INVALID_REQUEST = 1;
  public static final int ERROR_CODE_NETWORK_ERROR = 2;
  public static final int ERROR_CODE_NO_FILL = 3;
  private final bg ld;
  private final int xl;
  private final int xm;
  private final int xn;
  private final int xo;
  private final int xp;
  private final int xq;
  private final int xr;
  private final int xs;
  private final String xt;
  private final int xu;
  private final String xv;
  private final int xw;
  private final int xx;
  private final String xy;

  private SearchAdRequest(SearchAdRequest.Builder paramBuilder)
  {
    this.xl = SearchAdRequest.Builder.a(paramBuilder);
    this.xm = SearchAdRequest.Builder.b(paramBuilder);
    this.xn = SearchAdRequest.Builder.c(paramBuilder);
    this.xo = SearchAdRequest.Builder.d(paramBuilder);
    this.xp = SearchAdRequest.Builder.e(paramBuilder);
    this.xq = SearchAdRequest.Builder.f(paramBuilder);
    this.xr = SearchAdRequest.Builder.g(paramBuilder);
    this.xs = SearchAdRequest.Builder.h(paramBuilder);
    this.xt = SearchAdRequest.Builder.i(paramBuilder);
    this.xu = SearchAdRequest.Builder.j(paramBuilder);
    this.xv = SearchAdRequest.Builder.k(paramBuilder);
    this.xw = SearchAdRequest.Builder.l(paramBuilder);
    this.xx = SearchAdRequest.Builder.m(paramBuilder);
    this.xy = SearchAdRequest.Builder.n(paramBuilder);
    this.ld = new bg(SearchAdRequest.Builder.o(paramBuilder), this);
  }

  final bg V()
  {
    return this.ld;
  }

  public final int getAnchorTextColor()
  {
    return this.xl;
  }

  public final int getBackgroundColor()
  {
    return this.xm;
  }

  public final int getBackgroundGradientBottom()
  {
    return this.xn;
  }

  public final int getBackgroundGradientTop()
  {
    return this.xo;
  }

  public final int getBorderColor()
  {
    return this.xp;
  }

  public final int getBorderThickness()
  {
    return this.xq;
  }

  public final int getBorderType()
  {
    return this.xr;
  }

  public final int getCallButtonColor()
  {
    return this.xs;
  }

  public final String getCustomChannels()
  {
    return this.xt;
  }

  public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> paramClass)
  {
    return this.ld.getCustomEventExtrasBundle(paramClass);
  }

  public final int getDescriptionTextColor()
  {
    return this.xu;
  }

  public final String getFontFace()
  {
    return this.xv;
  }

  public final int getHeaderTextColor()
  {
    return this.xw;
  }

  public final int getHeaderTextSize()
  {
    return this.xx;
  }

  public final Location getLocation()
  {
    return this.ld.getLocation();
  }

  @Deprecated
  public final <T extends NetworkExtras> T getNetworkExtras(Class<T> paramClass)
  {
    return this.ld.getNetworkExtras(paramClass);
  }

  public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> paramClass)
  {
    return this.ld.getNetworkExtrasBundle(paramClass);
  }

  public final String getQuery()
  {
    return this.xy;
  }

  public final boolean isTestDevice(Context paramContext)
  {
    return this.ld.isTestDevice(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.search.SearchAdRequest
 * JD-Core Version:    0.6.2
 */