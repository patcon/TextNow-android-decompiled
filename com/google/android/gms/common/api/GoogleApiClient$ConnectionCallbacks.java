package com.google.android.gms.common.api;

import android.os.Bundle;

public abstract interface GoogleApiClient$ConnectionCallbacks
{
  public static final int CAUSE_NETWORK_LOST = 2;
  public static final int CAUSE_SERVICE_DISCONNECTED = 1;

  public abstract void onConnected(Bundle paramBundle);

  public abstract void onConnectionSuspended(int paramInt);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
 * JD-Core Version:    0.6.2
 */