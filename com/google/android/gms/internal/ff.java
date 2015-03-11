package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;

public final class ff
{
  public static final Api.c<fx> xI = new Api.c();
  private static final Api.b<fx, Api.ApiOptions.NoOptions> xJ = new Api.b()
  {
    public final fx a(Context paramAnonymousContext, Looper paramAnonymousLooper, gy paramAnonymousgy, Api.ApiOptions.NoOptions paramAnonymousNoOptions, GoogleApiClient.ConnectionCallbacks paramAnonymousConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramAnonymousOnConnectionFailedListener)
    {
      return new fx(paramAnonymousContext, paramAnonymousLooper, paramAnonymousConnectionCallbacks, paramAnonymousOnConnectionFailedListener);
    }

    public final int getPriority()
    {
      return 2147483647;
    }
  };
  public static final Api<Api.ApiOptions.NoOptions> xK = new Api(xJ, xI, new Scope[0]);
  public static final ft xL = new fy();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ff
 * JD-Core Version:    0.6.2
 */