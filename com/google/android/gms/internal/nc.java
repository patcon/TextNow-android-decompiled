package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.panorama.PanoramaApi;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;
import com.google.android.gms.panorama.PanoramaApi.a;

public class nc
  implements PanoramaApi
{
  private static void a(Context paramContext, Uri paramUri)
  {
    paramContext.revokeUriPermission(paramUri, 1);
  }

  private static void a(Context paramContext, nb paramnb, final na paramna, final Uri paramUri, Bundle paramBundle)
  {
    paramContext.grantUriPermission("com.google.android.gms", paramUri, 1);
    na.a local4 = new na.a()
    {
      public final void a(int paramAnonymousInt1, Bundle paramAnonymousBundle, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        nc.b(nc.this, paramUri);
        paramna.a(paramAnonymousInt1, paramAnonymousBundle, paramAnonymousInt2, paramAnonymousIntent);
      }
    };
    try
    {
      paramnb.a(local4, paramUri, paramBundle, true);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      paramContext.revokeUriPermission(paramUri, 1);
      throw localRemoteException;
    }
    catch (RuntimeException localRuntimeException)
    {
      paramContext.revokeUriPermission(paramUri, 1);
      throw localRuntimeException;
    }
  }

  public PendingResult<PanoramaApi.PanoramaResult> loadPanoramaInfo(GoogleApiClient paramGoogleApiClient, final Uri paramUri)
  {
    return paramGoogleApiClient.a(new nc.b(paramUri)
    {
      protected void a(Context paramAnonymousContext, nb paramAnonymousnb)
      {
        paramAnonymousnb.a(new nc.c(this), paramUri, null, false);
      }
    });
  }

  public PendingResult<PanoramaApi.PanoramaResult> loadPanoramaInfoAndGrantAccess(GoogleApiClient paramGoogleApiClient, final Uri paramUri)
  {
    return paramGoogleApiClient.a(new nc.b(paramUri)
    {
      protected void a(Context paramAnonymousContext, nb paramAnonymousnb)
      {
        nc.b(paramAnonymousContext, paramAnonymousnb, new nc.c(this), paramUri, null);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nc
 * JD-Core Version:    0.6.2
 */