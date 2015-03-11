package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;

public abstract interface Cast$ApplicationConnectionResult extends Result
{
  public abstract ApplicationMetadata getApplicationMetadata();

  public abstract String getApplicationStatus();

  public abstract String getSessionId();

  public abstract boolean getWasLaunched();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.Cast.ApplicationConnectionResult
 * JD-Core Version:    0.6.2
 */