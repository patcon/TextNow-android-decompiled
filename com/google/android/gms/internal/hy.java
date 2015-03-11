package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.e.e;
import com.google.android.gms.common.internal.l;

public class hy extends e<hv>
{
  public hy(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
  }

  protected hv H(IBinder paramIBinder)
  {
    return hv.a.F(paramIBinder);
  }

  protected void a(l paraml, e.e parame)
  {
    paraml.b(parame, 6171000, getContext().getPackageName());
  }

  public hv fn()
  {
    return (hv)gS();
  }

  protected String getServiceDescriptor()
  {
    return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
  }

  protected String getStartServiceAction()
  {
    return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hy
 * JD-Core Version:    0.6.2
 */