package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jr;
import java.util.Collections;
import java.util.List;

public class StartBleScanRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<StartBleScanRequest> CREATOR = new ac();
  private final int BR;
  private final List<DataType> SB;
  private final l UQ;
  private final int UR;

  StartBleScanRequest(int paramInt1, List<DataType> paramList, IBinder paramIBinder, int paramInt2)
  {
    this.BR = paramInt1;
    this.SB = paramList;
    this.UQ = l.a.ay(paramIBinder);
    this.UR = paramInt2;
  }

  private StartBleScanRequest(StartBleScanRequest.Builder paramBuilder)
  {
    this.BR = 2;
    this.SB = jr.b(StartBleScanRequest.Builder.a(paramBuilder));
    this.UQ = StartBleScanRequest.Builder.b(paramBuilder);
    this.UR = StartBleScanRequest.Builder.c(paramBuilder);
  }

  public int describeContents()
  {
    return 0;
  }

  public List<DataType> getDataTypes()
  {
    return Collections.unmodifiableList(this.SB);
  }

  public int getTimeoutSecs()
  {
    return this.UR;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public IBinder jC()
  {
    return this.UQ.asBinder();
  }

  public String toString()
  {
    return n.h(this).a("dataTypes", this.SB).a("timeoutSecs", Integer.valueOf(this.UR)).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ac.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.StartBleScanRequest
 * JD-Core Version:    0.6.2
 */