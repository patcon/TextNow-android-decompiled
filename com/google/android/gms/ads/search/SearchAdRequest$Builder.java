package com.google.android.gms.ads.search;

import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.bg.a;

public final class SearchAdRequest$Builder
{
  private final bg.a le = new bg.a();
  private int xl;
  private int xm;
  private int xn;
  private int xo;
  private int xp;
  private int xq;
  private int xr = 0;
  private int xs;
  private String xt;
  private int xu;
  private String xv;
  private int xw;
  private int xx;
  private String xy;

  public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> paramClass, Bundle paramBundle)
  {
    this.le.b(paramClass, paramBundle);
    return this;
  }

  public final Builder addNetworkExtras(NetworkExtras paramNetworkExtras)
  {
    this.le.a(paramNetworkExtras);
    return this;
  }

  public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> paramClass, Bundle paramBundle)
  {
    this.le.a(paramClass, paramBundle);
    return this;
  }

  public final Builder addTestDevice(String paramString)
  {
    this.le.s(paramString);
    return this;
  }

  public final SearchAdRequest build()
  {
    return new SearchAdRequest(this, null);
  }

  public final Builder setAnchorTextColor(int paramInt)
  {
    this.xl = paramInt;
    return this;
  }

  public final Builder setBackgroundColor(int paramInt)
  {
    this.xm = paramInt;
    this.xn = Color.argb(0, 0, 0, 0);
    this.xo = Color.argb(0, 0, 0, 0);
    return this;
  }

  public final Builder setBackgroundGradient(int paramInt1, int paramInt2)
  {
    this.xm = Color.argb(0, 0, 0, 0);
    this.xn = paramInt2;
    this.xo = paramInt1;
    return this;
  }

  public final Builder setBorderColor(int paramInt)
  {
    this.xp = paramInt;
    return this;
  }

  public final Builder setBorderThickness(int paramInt)
  {
    this.xq = paramInt;
    return this;
  }

  public final Builder setBorderType(int paramInt)
  {
    this.xr = paramInt;
    return this;
  }

  public final Builder setCallButtonColor(int paramInt)
  {
    this.xs = paramInt;
    return this;
  }

  public final Builder setCustomChannels(String paramString)
  {
    this.xt = paramString;
    return this;
  }

  public final Builder setDescriptionTextColor(int paramInt)
  {
    this.xu = paramInt;
    return this;
  }

  public final Builder setFontFace(String paramString)
  {
    this.xv = paramString;
    return this;
  }

  public final Builder setHeaderTextColor(int paramInt)
  {
    this.xw = paramInt;
    return this;
  }

  public final Builder setHeaderTextSize(int paramInt)
  {
    this.xx = paramInt;
    return this;
  }

  public final Builder setLocation(Location paramLocation)
  {
    this.le.a(paramLocation);
    return this;
  }

  public final Builder setQuery(String paramString)
  {
    this.xy = paramString;
    return this;
  }

  public final Builder tagForChildDirectedTreatment(boolean paramBoolean)
  {
    this.le.h(paramBoolean);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.search.SearchAdRequest.Builder
 * JD-Core Version:    0.6.2
 */