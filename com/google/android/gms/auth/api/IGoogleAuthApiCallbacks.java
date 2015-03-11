package com.google.android.gms.auth.api;

import android.app.PendingIntent;
import android.os.IInterface;

public abstract interface IGoogleAuthApiCallbacks extends IInterface
{
  public abstract void onConnectionSuccess(GoogleAuthApiResponse paramGoogleAuthApiResponse);

  public abstract void onError(int paramInt, String paramString, PendingIntent paramPendingIntent);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.IGoogleAuthApiCallbacks
 * JD-Core Version:    0.6.2
 */