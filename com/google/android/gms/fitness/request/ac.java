package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

public class ac
  implements Parcelable.Creator<StartBleScanRequest>
{
  static void a(StartBleScanRequest paramStartBleScanRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramStartBleScanRequest.getDataTypes(), false);
    b.c(paramParcel, 1000, paramStartBleScanRequest.getVersionCode());
    b.a(paramParcel, 2, paramStartBleScanRequest.jC(), false);
    b.c(paramParcel, 3, paramStartBleScanRequest.getTimeoutSecs());
    b.H(paramParcel, i);
  }

  public StartBleScanRequest bQ(Parcel paramParcel)
  {
    IBinder localIBinder = null;
    int i = 0;
    int j = a.C(paramParcel);
    ArrayList localArrayList = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.B(paramParcel);
      switch (a.aD(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        localArrayList = a.c(paramParcel, m, DataType.CREATOR);
        break;
      case 1000:
        k = a.g(paramParcel, m);
        break;
      case 2:
        localIBinder = a.p(paramParcel, m);
        break;
      case 3:
        i = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new StartBleScanRequest(k, localArrayList, localIBinder, i);
  }

  public StartBleScanRequest[] di(int paramInt)
  {
    return new StartBleScanRequest[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.ac
 * JD-Core Version:    0.6.2
 */