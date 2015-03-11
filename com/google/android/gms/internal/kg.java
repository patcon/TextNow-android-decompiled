package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public class kg extends hb<ke>
{
  public kg(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, null);
  }

  protected void a(hi paramhi, hb.e parame)
  {
    Bundle localBundle = new Bundle();
    paramhi.a(parame, 5089000, getContext().getPackageName(), localBundle);
  }

  public ke bj(IBinder paramIBinder)
  {
    return ke.a.bi(paramIBinder);
  }

  protected String bu()
  {
    return "com.google.android.gms.panorama.service.START";
  }

  protected String bv()
  {
    return "com.google.android.gms.panorama.internal.IPanoramaService";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kg
 * JD-Core Version:    0.6.2
 */