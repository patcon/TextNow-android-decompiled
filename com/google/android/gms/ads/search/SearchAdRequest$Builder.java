package com.google.android.gms.ads.search;

import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.at.a;

public final class SearchAdRequest$Builder
{
  private final at.a kt = new at.a();
  private int tc;
  private int td;
  private int te;
  private int tf;
  private int tg;
  private int th;
  private int ti = 0;
  private int tj;
  private String tk;
  private int tl;
  private String tm;
  private int tn;
  private int to;
  private String tp;

  public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> paramClass, Bundle paramBundle)
  {
    this.kt.b(paramClass, paramBundle);
    return this;
  }

  public final Builder addNetworkExtras(NetworkExtras paramNetworkExtras)
  {
    this.kt.a(paramNetworkExtras);
    return this;
  }

  public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> paramClass, Bundle paramBundle)
  {
    this.kt.a(paramClass, paramBundle);
    return this;
  }

  public final Builder addTestDevice(String paramString)
  {
    this.kt.h(paramString);
    return this;
  }

  public final SearchAdRequest build()
  {
    return new SearchAdRequest(this, null);
  }

  public final Builder setAnchorTextColor(int paramInt)
  {
    this.tc = paramInt;
    return this;
  }

  public final Builder setBackgroundColor(int paramInt)
  {
    this.td = paramInt;
    this.te = Color.argb(0, 0, 0, 0);
    this.tf = Color.argb(0, 0, 0, 0);
    return this;
  }

  public final Builder setBackgroundGradient(int paramInt1, int paramInt2)
  {
    this.td = Color.argb(0, 0, 0, 0);
    this.te = paramInt2;
    this.tf = paramInt1;
    return this;
  }

  public final Builder setBorderColor(int paramInt)
  {
    this.tg = paramInt;
    return this;
  }

  public final Builder setBorderThickness(int paramInt)
  {
    this.th = paramInt;
    return this;
  }

  public final Builder setBorderType(int paramInt)
  {
    this.ti = paramInt;
    return this;
  }

  public final Builder setCallButtonColor(int paramInt)
  {
    this.tj = paramInt;
    return this;
  }

  public final Builder setCustomChannels(String paramString)
  {
    this.tk = paramString;
    return this;
  }

  public final Builder setDescriptionTextColor(int paramInt)
  {
    this.tl = paramInt;
    return this;
  }

  public final Builder setFontFace(String paramString)
  {
    this.tm = paramString;
    return this;
  }

  public final Builder setHeaderTextColor(int paramInt)
  {
    this.tn = paramInt;
    return this;
  }

  public final Builder setHeaderTextSize(int paramInt)
  {
    this.to = paramInt;
    return this;
  }

  public final Builder setLocation(Location paramLocation)
  {
    this.kt.a(paramLocation);
    return this;
  }

  public final Builder setQuery(String paramString)
  {
    this.tp = paramString;
    return this;
  }

  public final Builder tagForChildDirectedTreatment(boolean paramBoolean)
  {
    this.kt.h(paramBoolean);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.search.SearchAdRequest.Builder
 * JD-Core Version:    0.6.2
 */