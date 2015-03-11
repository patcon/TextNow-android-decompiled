package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

public class t
  implements Parcelable.Creator<SessionReadRequest>
{
  static void a(SessionReadRequest paramSessionReadRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramSessionReadRequest.getSessionName(), false);
    b.c(paramParcel, 1000, paramSessionReadRequest.getVersionCode());
    b.a(paramParcel, 2, paramSessionReadRequest.getSessionId(), false);
    b.a(paramParcel, 3, paramSessionReadRequest.iD());
    b.a(paramParcel, 4, paramSessionReadRequest.iE());
    b.c(paramParcel, 5, paramSessionReadRequest.getDataTypes(), false);
    b.c(paramParcel, 6, paramSessionReadRequest.getDataSources(), false);
    b.a(paramParcel, 7, paramSessionReadRequest.jz());
    b.a(paramParcel, 8, paramSessionReadRequest.jl());
    b.b(paramParcel, 9, paramSessionReadRequest.getExcludedPackages(), false);
    b.H(paramParcel, i);
  }

  public SessionReadRequest bL(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    String str1 = null;
    String str2 = null;
    long l1 = 0L;
    long l2 = 0L;
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    boolean bool1 = false;
    boolean bool2 = false;
    ArrayList localArrayList3 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        str1 = a.o(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        str2 = a.o(paramParcel, k);
        break;
      case 3:
        l1 = a.i(paramParcel, k);
        break;
      case 4:
        l2 = a.i(paramParcel, k);
        break;
      case 5:
        localArrayList1 = a.c(paramParcel, k, DataType.CREATOR);
        break;
      case 6:
        localArrayList2 = a.c(paramParcel, k, DataSource.CREATOR);
        break;
      case 7:
        bool1 = a.c(paramParcel, k);
        break;
      case 8:
        bool2 = a.c(paramParcel, k);
        break;
      case 9:
        localArrayList3 = a.C(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new SessionReadRequest(j, str1, str2, l1, l2, localArrayList1, localArrayList2, bool1, bool2, localArrayList3);
  }

  public SessionReadRequest[] dd(int paramInt)
  {
    return new SessionReadRequest[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.t
 * JD-Core Version:    0.6.2
 */