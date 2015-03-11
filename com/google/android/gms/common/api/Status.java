package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Status
  implements Result, SafeParcelable
{
  public static final StatusCreator CREATOR = new StatusCreator();
  public static final Status Jv = new Status(0);
  public static final Status Jw = new Status(14);
  public static final Status Jx = new Status(8);
  public static final Status Jy = new Status(15);
  public static final Status Jz = new Status(16);
  private final int BR;
  private final int HF;
  private final String JA;
  private final PendingIntent mPendingIntent;

  public Status(int paramInt)
  {
    this(paramInt, null);
  }

  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.BR = paramInt1;
    this.HF = paramInt2;
    this.JA = paramString;
    this.mPendingIntent = paramPendingIntent;
  }

  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }

  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramString, paramPendingIntent);
  }

  private String fX()
  {
    if (this.JA != null)
      return this.JA;
    return CommonStatusCodes.getStatusCodeString(this.HF);
  }

  public final int describeContents()
  {
    return 0;
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
    while ((this.BR != localStatus.BR) || (this.HF != localStatus.HF) || (!n.equal(this.JA, localStatus.JA)) || (!n.equal(this.mPendingIntent, localStatus.mPendingIntent)));
    return true;
  }

  final PendingIntent getPendingIntent()
  {
    return this.mPendingIntent;
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
    return this.HF;
  }

  public final String getStatusMessage()
  {
    return this.JA;
  }

  final int getVersionCode()
  {
    return this.BR;
  }

  @Deprecated
  public final ConnectionResult gt()
  {
    return new ConnectionResult(this.HF, this.mPendingIntent);
  }

  public final boolean hasResolution()
  {
    return this.mPendingIntent != null;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(this.BR);
    arrayOfObject[1] = Integer.valueOf(this.HF);
    arrayOfObject[2] = this.JA;
    arrayOfObject[3] = this.mPendingIntent;
    return n.hashCode(arrayOfObject);
  }

  public final boolean isCanceled()
  {
    return this.HF == 16;
  }

  public final boolean isInterrupted()
  {
    return this.HF == 14;
  }

  public final boolean isSuccess()
  {
    return this.HF <= 0;
  }

  public final void startResolutionForResult(Activity paramActivity, int paramInt)
  {
    if (!hasResolution())
      return;
    paramActivity.startIntentSenderForResult(this.mPendingIntent.getIntentSender(), paramInt, null, 0, 0, 0);
  }

  public final String toString()
  {
    return n.h(this).a("statusCode", fX()).a("resolution", this.mPendingIntent).toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    StatusCreator.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Status
 * JD-Core Version:    0.6.2
 */