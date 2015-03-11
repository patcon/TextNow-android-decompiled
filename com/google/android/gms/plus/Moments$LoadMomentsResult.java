package com.google.android.gms.plus;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.plus.model.moments.MomentBuffer;

public abstract interface Moments$LoadMomentsResult extends Releasable, Result
{
  public abstract MomentBuffer getMomentBuffer();

  public abstract String getNextPageToken();

  public abstract String getUpdated();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.Moments.LoadMomentsResult
 * JD-Core Version:    0.6.2
 */