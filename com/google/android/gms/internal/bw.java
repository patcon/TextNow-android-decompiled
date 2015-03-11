package com.google.android.gms.internal;

import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

public final class bw
  implements MediationAdRequest
{
  private final Date d;
  private final Set<String> f;
  private final boolean g;
  private final int ml;
  private final int nR;

  public bw(Date paramDate, int paramInt1, Set<String> paramSet, boolean paramBoolean, int paramInt2)
  {
    this.d = paramDate;
    this.ml = paramInt1;
    this.f = paramSet;
    this.g = paramBoolean;
    this.nR = paramInt2;
  }

  public final Date getBirthday()
  {
    return this.d;
  }

  public final int getGender()
  {
    return this.ml;
  }

  public final Set<String> getKeywords()
  {
    return this.f;
  }

  public final boolean isTesting()
  {
    return this.g;
  }

  public final int taggedForChildDirectedTreatment()
  {
    return this.nR;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bw
 * JD-Core Version:    0.6.2
 */