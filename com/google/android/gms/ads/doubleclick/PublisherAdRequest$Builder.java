package com.google.android.gms.ads.doubleclick;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.at.a;
import com.google.android.gms.internal.hm;
import java.util.Date;

public final class PublisherAdRequest$Builder
{
  private final at.a kt = new at.a();

  public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> paramClass, Bundle paramBundle)
  {
    this.kt.b(paramClass, paramBundle);
    return this;
  }

  public final Builder addKeyword(String paramString)
  {
    this.kt.g(paramString);
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

  public final PublisherAdRequest build()
  {
    return new PublisherAdRequest(this, null);
  }

  public final Builder setBirthday(Date paramDate)
  {
    this.kt.a(paramDate);
    return this;
  }

  public final Builder setContentUrl(String paramString)
  {
    hm.b(paramString, "Content URL must be non-null.");
    hm.b(paramString, "Content URL must be non-empty.");
    if (paramString.length() <= 512);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(512);
      arrayOfObject[1] = Integer.valueOf(paramString.length());
      hm.b(bool, "Content URL must not exceed %d in length.  Provided length was %d.", arrayOfObject);
      this.kt.i(paramString);
      return this;
    }
  }

  public final Builder setGender(int paramInt)
  {
    this.kt.e(paramInt);
    return this;
  }

  public final Builder setLocation(Location paramLocation)
  {
    this.kt.a(paramLocation);
    return this;
  }

  public final Builder setManualImpressionsEnabled(boolean paramBoolean)
  {
    this.kt.g(paramBoolean);
    return this;
  }

  public final Builder setPublisherProvidedId(String paramString)
  {
    this.kt.j(paramString);
    return this;
  }

  public final Builder tagForChildDirectedTreatment(boolean paramBoolean)
  {
    this.kt.h(paramBoolean);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder
 * JD-Core Version:    0.6.2
 */