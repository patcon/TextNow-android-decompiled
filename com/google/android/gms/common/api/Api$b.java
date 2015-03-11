package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;

public abstract interface Api$b<T extends Api.a, O>
{
  public abstract T a(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, O paramO, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);

  public abstract int getPriority();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Api.b
 * JD-Core Version:    0.6.2
 */