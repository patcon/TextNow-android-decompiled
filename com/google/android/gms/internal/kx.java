package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.ad;
import com.google.android.gms.fitness.request.ah;
import com.google.android.gms.fitness.request.b;
import com.google.android.gms.fitness.result.BleDevicesResult;

public class kx
  implements BleApi
{
  public PendingResult<Status> claimBleDevice(GoogleApiClient paramGoogleApiClient, final BleDevice paramBleDevice)
  {
    return paramGoogleApiClient.b(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(new b(paramBleDevice), localb, str);
      }
    });
  }

  public PendingResult<Status> claimBleDevice(GoogleApiClient paramGoogleApiClient, final String paramString)
  {
    return paramGoogleApiClient.b(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(new b(paramString), localb, str);
      }
    });
  }

  public PendingResult<BleDevicesResult> listClaimedBleDevices(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new kk.a()
    {
      protected void a(kk paramAnonymouskk)
      {
        kx.a locala = new kx.a(this, null);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(locala, str);
      }

      protected BleDevicesResult w(Status paramAnonymousStatus)
      {
        return BleDevicesResult.D(paramAnonymousStatus);
      }
    });
  }

  public PendingResult<Status> startBleScan(GoogleApiClient paramGoogleApiClient, final StartBleScanRequest paramStartBleScanRequest)
  {
    return paramGoogleApiClient.a(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(paramStartBleScanRequest, localb, str);
      }
    });
  }

  public PendingResult<Status> stopBleScan(GoogleApiClient paramGoogleApiClient, final BleScanCallback paramBleScanCallback)
  {
    return paramGoogleApiClient.a(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        String str = paramAnonymouskk.getContext().getPackageName();
        ad localad = new ad(paramBleScanCallback);
        paramAnonymouskk.jb().a(localad, localb, str);
      }
    });
  }

  public PendingResult<Status> unclaimBleDevice(GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice)
  {
    return unclaimBleDevice(paramGoogleApiClient, paramBleDevice.getAddress());
  }

  public PendingResult<Status> unclaimBleDevice(GoogleApiClient paramGoogleApiClient, final String paramString)
  {
    return paramGoogleApiClient.b(new kk.c()
    {
      protected void a(kk paramAnonymouskk)
      {
        kk.b localb = new kk.b(this);
        String str = paramAnonymouskk.getContext().getPackageName();
        paramAnonymouskk.jb().a(new ah(paramString), localb, str);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kx
 * JD-Core Version:    0.6.2
 */