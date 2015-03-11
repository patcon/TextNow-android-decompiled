package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@ez
public final class cw
  implements MediationAdRequest
{
  private final Date d;
  private final Set<String> f;
  private final boolean g;
  private final Location h;
  private final int om;
  private final int qD;

  public cw(Date paramDate, int paramInt1, Set<String> paramSet, Location paramLocation, boolean paramBoolean, int paramInt2)
  {
    this.d = paramDate;
    this.om = paramInt1;
    this.f = paramSet;
    this.h = paramLocation;
    this.g = paramBoolean;
    this.qD = paramInt2;
  }

  public final Date getBirthday()
  {
    return this.d;
  }

  public final int getGender()
  {
    return this.om;
  }

  public final Set<String> getKeywords()
  {
    return this.f;
  }

  public final Location getLocation()
  {
    return this.h;
  }

  public final boolean isTesting()
  {
    return this.g;
  }

  public final int taggedForChildDirectedTreatment()
  {
    return this.qD;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cw
 * JD-Core Version:    0.6.2
 */