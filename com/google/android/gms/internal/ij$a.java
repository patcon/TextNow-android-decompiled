package com.google.android.gms.internal;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast.ApplicationConnectionResult;
import com.google.android.gms.common.api.Status;

final class ij$a
  implements Cast.ApplicationConnectionResult
{
  private final Status CM;
  private final ApplicationMetadata GN;
  private final String GO;
  private final boolean GP;
  private final String vL;

  public ij$a(Status paramStatus)
  {
    this(paramStatus, null, null, null, false);
  }

  public ij$a(Status paramStatus, ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.CM = paramStatus;
    this.GN = paramApplicationMetadata;
    this.GO = paramString1;
    this.vL = paramString2;
    this.GP = paramBoolean;
  }

  public final ApplicationMetadata getApplicationMetadata()
  {
    return this.GN;
  }

  public final String getApplicationStatus()
  {
    return this.GO;
  }

  public final String getSessionId()
  {
    return this.vL;
  }

  public final Status getStatus()
  {
    return this.CM;
  }

  public final boolean getWasLaunched()
  {
    return this.GP;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ij.a
 * JD-Core Version:    0.6.2
 */