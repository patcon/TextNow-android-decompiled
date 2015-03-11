package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class NotifyTransactionStatusRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<NotifyTransactionStatusRequest> CREATOR = new m();
  String aiQ;
  String ajR;
  int status;
  final int xM;

  NotifyTransactionStatusRequest()
  {
    this.xM = 1;
  }

  NotifyTransactionStatusRequest(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    this.xM = paramInt1;
    this.aiQ = paramString1;
    this.status = paramInt2;
    this.ajR = paramString2;
  }

  public static NotifyTransactionStatusRequest.Builder newBuilder()
  {
    NotifyTransactionStatusRequest localNotifyTransactionStatusRequest = new NotifyTransactionStatusRequest();
    localNotifyTransactionStatusRequest.getClass();
    return new NotifyTransactionStatusRequest.Builder(localNotifyTransactionStatusRequest, null);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String getDetailedReason()
  {
    return this.ajR;
  }

  public final String getGoogleTransactionId()
  {
    return this.aiQ;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final int getVersionCode()
  {
    return this.xM;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    m.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.NotifyTransactionStatusRequest
 * JD-Core Version:    0.6.2
 */