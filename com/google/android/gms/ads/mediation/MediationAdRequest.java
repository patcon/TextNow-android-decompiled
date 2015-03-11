package com.google.android.gms.ads.mediation;

import java.util.Date;
import java.util.Set;

public abstract interface MediationAdRequest
{
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

  public abstract Date getBirthday();

  public abstract int getGender();

  public abstract Set<String> getKeywords();

  public abstract boolean isTesting();

  public abstract int taggedForChildDirectedTreatment();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.MediationAdRequest
 * JD-Core Version:    0.6.2
 */