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

public class kf
  implements PanoramaApi
{
  private static void a(Context paramContext, Uri paramUri)
  {
    paramContext.revokeUriPermission(paramUri, 1);
  }

  private static void a(Context paramContext, ke paramke, final kd paramkd, final Uri paramUri, Bundle paramBundle)
  {
    paramContext.grantUriPermission("com.google.android.gms", paramUri, 1);
    kd.a local4 = new kd.a()
    {
      public final void a(int paramAnonymousInt1, Bundle paramAnonymousBundle, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        kf.b(kf.this, paramUri);
        paramkd.a(paramAnonymousInt1, paramAnonymousBundle, paramAnonymousInt2, paramAnonymousIntent);
      }
    };
    try
    {
      paramke.a(local4, paramUri, paramBundle, true);
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
    return paramGoogleApiClient.a(new kf.b(paramUri)
    {
      protected void a(Context paramAnonymousContext, ke paramAnonymouske)
      {
        paramAnonymouske.a(new kf.c(this), paramUri, null, false);
      }
    });
  }

  public PendingResult<PanoramaApi.PanoramaResult> loadPanoramaInfoAndGrantAccess(GoogleApiClient paramGoogleApiClient, final Uri paramUri)
  {
    return paramGoogleApiClient.a(new kf.b(paramUri)
    {
      protected void a(Context paramAnonymousContext, ke paramAnonymouske)
      {
        kf.b(paramAnonymousContext, paramAnonymouske, new kf.c(this), paramUri, null);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kf
 * JD-Core Version:    0.6.2
 */