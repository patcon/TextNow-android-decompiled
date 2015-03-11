package com.google.android.gms.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public abstract interface Account
{
  public abstract void clearDefaultAccount(GoogleApiClient paramGoogleApiClient);

  public abstract String getAccountName(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<Status> revokeAccessAndDisconnect(GoogleApiClient paramGoogleApiClient);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.Account
 * JD-Core Version:    0.6.2
 */