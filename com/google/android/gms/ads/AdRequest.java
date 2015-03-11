package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.bg;
import java.util.Date;
import java.util.Set;

public final class AdRequest
{
  public static final String DEVICE_ID_EMULATOR = bg.DEVICE_ID_EMULATOR;
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_INVALID_REQUEST = 1;
  public static final int ERROR_CODE_NETWORK_ERROR = 2;
  public static final int ERROR_CODE_NO_FILL = 3;
  public static final int GENDER_FEMALE = 2;
  public static final int GENDER_MALE = 1;
  public static final int GENDER_UNKNOWN = 0;
  public static final int MAX_CONTENT_URL_LENGTH = 512;
  private final bg ld;

  private AdRequest(AdRequest.Builder paramBuilder)
  {
    this.ld = new bg(AdRequest.Builder.a(paramBuilder));
  }

  final bg V()
  {
    return this.ld;
  }

  public final Date getBirthday()
  {
    return this.ld.getBirthday();
  }

  public final String getContentUrl()
  {
    return this.ld.getContentUrl();
  }

  public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> paramClass)
  {
    return this.ld.getCustomEventExtrasBundle(paramClass);
  }

  public final int getGender()
  {
    return this.ld.getGender();
  }

  public final Set<String> getKeywords()
  {
    return this.ld.getKeywords();
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

  public final boolean isTestDevice(Context paramContext)
  {
    return this.ld.isTestDevice(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdRequest
 * JD-Core Version:    0.6.2
 */