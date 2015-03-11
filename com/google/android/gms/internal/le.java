package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

public class le
  implements BleApi
{
  private static final Status Ue = new Status(5007);

  public PendingResult<Status> claimBleDevice(GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice)
  {
    return new ku(Ue);
  }

  public PendingResult<Status> claimBleDevice(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return new ku(Ue);
  }

  public PendingResult<BleDevicesResult> listClaimedBleDevices(GoogleApiClient paramGoogleApiClient)
  {
    return new ku(BleDevicesResult.D(Ue));
  }

  public PendingResult<Status> startBleScan(GoogleApiClient paramGoogleApiClient, StartBleScanRequest paramStartBleScanRequest)
  {
    return new ku(Ue);
  }

  public PendingResult<Status> stopBleScan(GoogleApiClient paramGoogleApiClient, BleScanCallback paramBleScanCallback)
  {
    return new ku(Ue);
  }

  public PendingResult<Status> unclaimBleDevice(GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice)
  {
    return new ku(Ue);
  }

  public PendingResult<Status> unclaimBleDevice(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return new ku(Ue);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.le
 * JD-Core Version:    0.6.2
 */