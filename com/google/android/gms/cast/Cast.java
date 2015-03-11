package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.internal.ij;

public final class Cast
{
  public static final Api<Cast.CastOptions> API = new Api(CV, CU, new Scope[0]);
  static final Api.c<ij> CU = new Api.c();
  private static final Api.b<ij, Cast.CastOptions> CV = new Api.b()
  {
    public final ij a(Context paramAnonymousContext, Looper paramAnonymousLooper, ClientSettings paramAnonymousClientSettings, Cast.CastOptions paramAnonymousCastOptions, GoogleApiClient.ConnectionCallbacks paramAnonymousConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramAnonymousOnConnectionFailedListener)
    {
      o.b(paramAnonymousCastOptions, "Setting the API options is required.");
      return new ij(paramAnonymousContext, paramAnonymousLooper, paramAnonymousCastOptions.EK, Cast.CastOptions.a(paramAnonymousCastOptions), paramAnonymousCastOptions.EL, paramAnonymousConnectionCallbacks, paramAnonymousOnConnectionFailedListener);
    }

    public final int getPriority()
    {
      return 2147483647;
    }
  };
  public static final Cast.CastApi CastApi = new Cast.CastApi.a();
  public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
  public static final int MAX_MESSAGE_LENGTH = 65536;
  public static final int MAX_NAMESPACE_LENGTH = 128;
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.Cast
 * JD-Core Version:    0.6.2
 */