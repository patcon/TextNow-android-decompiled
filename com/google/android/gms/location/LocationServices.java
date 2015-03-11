package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.jc;
import com.google.android.gms.internal.jg;

public class LocationServices
{
  public static final Api<Api.ApiOptions.NoOptions> API = new Api(yI, yH, new Scope[0]);
  public static FusedLocationProviderApi FusedLocationApi = new jb();
  public static GeofencingApi GeofencingApi = new jc();
  private static final Api.c<jg> yH = new Api.c();
  private static final Api.b<jg, Api.ApiOptions.NoOptions> yI = new Api.b()
  {
    public final jg c(Context paramAnonymousContext, Looper paramAnonymousLooper, gy paramAnonymousgy, Api.ApiOptions.NoOptions paramAnonymousNoOptions, GoogleApiClient.ConnectionCallbacks paramAnonymousConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramAnonymousOnConnectionFailedListener)
    {
      return new jg(paramAnonymousContext, paramAnonymousLooper, paramAnonymousConnectionCallbacks, paramAnonymousOnConnectionFailedListener, "locationServices");
    }

    public final int getPriority()
    {
      return 2147483647;
    }
  };

  public static jg e(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool1 = true;
    boolean bool2;
    jg localjg;
    if (paramGoogleApiClient != null)
    {
      bool2 = bool1;
      hm.b(bool2, "GoogleApiClient parameter is required.");
      localjg = (jg)paramGoogleApiClient.a(yH);
      if (localjg == null)
        break label44;
    }
    while (true)
    {
      hm.a(bool1, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
      return localjg;
      bool2 = false;
      break;
      label44: bool1 = false;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationServices
 * JD-Core Version:    0.6.2
 */