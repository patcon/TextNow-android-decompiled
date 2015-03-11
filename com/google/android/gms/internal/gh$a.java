package com.google.android.gms.internal;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast.ApplicationConnectionResult;
import com.google.android.gms.common.api.Status;

final class gh$a
  implements Cast.ApplicationConnectionResult
{
  private final ApplicationMetadata Ci;
  private final String Cj;
  private final boolean Ck;
  private final String rR;
  private final Status yz;

  public gh$a(Status paramStatus)
  {
    this(paramStatus, null, null, null, false);
  }

  public gh$a(Status paramStatus, ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.yz = paramStatus;
    this.Ci = paramApplicationMetadata;
    this.Cj = paramString1;
    this.rR = paramString2;
    this.Ck = paramBoolean;
  }

  public final ApplicationMetadata getApplicationMetadata()
  {
    return this.Ci;
  }

  public final String getApplicationStatus()
  {
    return this.Cj;
  }

  public final String getSessionId()
  {
    return this.rR;
  }

  public final Status getStatus()
  {
    return this.yz;
  }

  public final boolean getWasLaunched()
  {
    return this.Ck;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gh.a
 * JD-Core Version:    0.6.2
 */