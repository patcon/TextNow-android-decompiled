package com.google.android.gms.auth.api;

import android.os.IInterface;

public abstract interface IGoogleAuthService extends IInterface
{
  public abstract void sendConnection(IGoogleAuthApiCallbacks paramIGoogleAuthApiCallbacks, GoogleAuthApiRequest paramGoogleAuthApiRequest);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.IGoogleAuthService
 * JD-Core Version:    0.6.2
 */