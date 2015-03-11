package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.at;
import java.util.Date;
import java.util.Set;

public final class PublisherAdRequest
{
  public static final String DEVICE_ID_EMULATOR = at.DEVICE_ID_EMULATOR;
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_INVALID_REQUEST = 1;
  public static final int ERROR_CODE_NETWORK_ERROR = 2;
  public static final int ERROR_CODE_NO_FILL = 3;
  public static final int GENDER_FEMALE = 2;
  public static final int GENDER_MALE = 1;
  public static final int GENDER_UNKNOWN;
  private final at ks;

  private PublisherAdRequest(PublisherAdRequest.Builder paramBuilder)
  {
    this.ks = new at(PublisherAdRequest.Builder.a(paramBuilder));
  }

  final at T()
  {
    return this.ks;
  }

  public final Date getBirthday()
  {
    return this.ks.getBirthday();
  }

  public final String getContentUrl()
  {
    return this.ks.getContentUrl();
  }

  public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> paramClass)
  {
    return this.ks.getCustomEventExtrasBundle(paramClass);
  }

  public final int getGender()
  {
    return this.ks.getGender();
  }

  public final Set<String> getKeywords()
  {
    return this.ks.getKeywords();
  }

  public final Location getLocation()
  {
    return this.ks.getLocation();
  }

  public final boolean getManualImpressionsEnabled()
  {
    return this.ks.getManualImpressionsEnabled();
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

  public final String getPublisherProvidedId()
  {
    return this.ks.getPublisherProvidedId();
  }

  public final boolean isTestDevice(Context paramContext)
  {
    return this.ks.isTestDevice(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.doubleclick.PublisherAdRequest
 * JD-Core Version:    0.6.2
 */