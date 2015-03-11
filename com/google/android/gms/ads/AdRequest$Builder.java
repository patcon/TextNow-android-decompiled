package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.internal.bg.a;
import java.util.Date;

public final class AdRequest$Builder
{
  private final bg.a le = new bg.a();

  public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> paramClass, Bundle paramBundle)
  {
    this.le.b(paramClass, paramBundle);
    return this;
  }

  public final Builder addKeyword(String paramString)
  {
    this.le.r(paramString);
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

  public final AdRequest build()
  {
    return new AdRequest(this, null);
  }

  public final Builder setBirthday(Date paramDate)
  {
    this.le.a(paramDate);
    return this;
  }

  public final Builder setContentUrl(String paramString)
  {
    o.b(paramString, "Content URL must be non-null.");
    o.b(paramString, "Content URL must be non-empty.");
    if (paramString.length() <= 512);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(512);
      arrayOfObject[1] = Integer.valueOf(paramString.length());
      o.b(bool, "Content URL must not exceed %d in length.  Provided length was %d.", arrayOfObject);
      this.le.t(paramString);
      return this;
    }
  }

  public final Builder setGender(int paramInt)
  {
    this.le.g(paramInt);
    return this;
  }

  public final Builder setLocation(Location paramLocation)
  {
    this.le.a(paramLocation);
    return this;
  }

  public final Builder tagForChildDirectedTreatment(boolean paramBoolean)
  {
    this.le.h(paramBoolean);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdRequest.Builder
 * JD-Core Version:    0.6.2
 */