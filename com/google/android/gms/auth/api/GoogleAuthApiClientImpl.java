package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.e.e;
import com.google.android.gms.common.internal.l;

public final class GoogleAuthApiClientImpl extends e<IGoogleAuthService>
{
  public static final String ACTION_START_SERVICE = "com.google.android.gms.auth.service.START";
  public static final String SERVICE_DESCRIPTOR = "com.google.android.gms.auth.api.IGoogleAuthService";
  private final String Dd;
  private String[] Ds;

  public GoogleAuthApiClientImpl(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, String[] paramArrayOfString)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramArrayOfString);
    this.Dd = paramString;
    this.Ds = paramArrayOfString;
  }

  public GoogleAuthApiClientImpl(Context paramContext, ClientSettings paramClientSettings, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, String[] paramArrayOfString)
  {
    this(paramContext, paramContext.getMainLooper(), paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener, paramString, paramArrayOfString);
  }

  protected final void a(l paraml, e.e parame)
  {
    paraml.b(parame, 6171000, getContext().getPackageName(), this.Dd, gR());
  }

  protected final IGoogleAuthService createServiceInterface(IBinder paramIBinder)
  {
    return IGoogleAuthService.Stub.asInterface(paramIBinder);
  }

  public final String getAccountName()
  {
    return this.Dd;
  }

  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.auth.api.IGoogleAuthService";
  }

  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.auth.service.START";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.GoogleAuthApiClientImpl
 * JD-Core Version:    0.6.2
 */