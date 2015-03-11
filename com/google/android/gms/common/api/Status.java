package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hk.a;

public final class Status
  implements Result, SafeParcelable
{
  public static final StatusCreator CREATOR = new StatusCreator();
  public static final Status En = new Status(0);
  public static final Status Eo = new Status(14);
  public static final Status Ep = new Status(8);
  public static final Status Eq = new Status(15);
  public static final Status Er = new Status(16);
  private final int CT;
  private final String Es;
  private final PendingIntent mPendingIntent;
  private final int xM;

  public Status(int paramInt)
  {
    this(1, paramInt, null, null);
  }

  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.xM = paramInt1;
    this.CT = paramInt2;
    this.Es = paramString;
    this.mPendingIntent = paramPendingIntent;
  }

  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramString, paramPendingIntent);
  }

  private String ex()
  {
    if (this.Es != null)
      return this.Es;
    return CommonStatusCodes.getStatusCodeString(this.CT);
  }

  public final int describeContents()
  {
    return 0;
  }

  final PendingIntent eQ()
  {
    return this.mPendingIntent;
  }

  @Deprecated
  public final ConnectionResult eR()
  {
    return new ConnectionResult(this.CT, this.mPendingIntent);
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status));
    Status localStatus;
    do
    {
      return false;
      localStatus = (Status)paramObject;
    }
    while ((this.xM != localStatus.xM) || (this.CT != localStatus.CT) || (!hk.equal(this.Es, localStatus.Es)) || (!hk.equal(this.mPendingIntent, localStatus.mPendingIntent)));
    return true;
  }

  public final PendingIntent getResolution()
  {
    return this.mPendingIntent;
  }

  public final Status getStatus()
  {
    return this;
  }

  public final int getStatusCode()
  {
    return this.CT;
  }

  public final String getStatusMessage()
  {
    return this.Es;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final boolean hasResolution()
  {
    return this.mPendingIntent != null;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(this.xM);
    arrayOfObject[1] = Integer.valueOf(this.CT);
    arrayOfObject[2] = this.Es;
    arrayOfObject[3] = this.mPendingIntent;
    return hk.hashCode(arrayOfObject);
  }

  public final boolean isCanceled()
  {
    return this.CT == 16;
  }

  public final boolean isInterrupted()
  {
    return this.CT == 14;
  }

  public final boolean isSuccess()
  {
    return this.CT <= 0;
  }

  public final void startResolutionForResult(Activity paramActivity, int paramInt)
  {
    if (!hasResolution())
      return;
    paramActivity.startIntentSenderForResult(this.mPendingIntent.getIntentSender(), paramInt, null, 0, 0, 0);
  }

  public final String toString()
  {
    return hk.e(this).a("statusCode", ex()).a("resolution", this.mPendingIntent).toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    StatusCreator.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Status
 * JD-Core Version:    0.6.2
 */