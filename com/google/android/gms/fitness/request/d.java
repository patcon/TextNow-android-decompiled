package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;

public class d
  implements Parcelable.Creator<DataDeleteRequest>
{
  static void a(DataDeleteRequest paramDataDeleteRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramDataDeleteRequest.iD());
    b.c(paramParcel, 1000, paramDataDeleteRequest.getVersionCode());
    b.a(paramParcel, 2, paramDataDeleteRequest.iE());
    b.c(paramParcel, 3, paramDataDeleteRequest.getDataSources(), false);
    b.c(paramParcel, 4, paramDataDeleteRequest.getDataTypes(), false);
    b.c(paramParcel, 5, paramDataDeleteRequest.getSessions(), false);
    b.a(paramParcel, 6, paramDataDeleteRequest.jg());
    b.a(paramParcel, 7, paramDataDeleteRequest.jh());
    b.H(paramParcel, i);
  }

  public DataDeleteRequest bB(Parcel paramParcel)
  {
    long l1 = 0L;
    ArrayList localArrayList1 = null;
    boolean bool1 = false;
    int i = a.C(paramParcel);
    boolean bool2 = false;
    ArrayList localArrayList2 = null;
    ArrayList localArrayList3 = null;
    long l2 = l1;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        l2 = a.i(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        l1 = a.i(paramParcel, k);
        break;
      case 3:
        localArrayList3 = a.c(paramParcel, k, DataSource.CREATOR);
        break;
      case 4:
        localArrayList2 = a.c(paramParcel, k, DataType.CREATOR);
        break;
      case 5:
        localArrayList1 = a.c(paramParcel, k, Session.CREATOR);
        break;
      case 6:
        bool2 = a.c(paramParcel, k);
        break;
      case 7:
        bool1 = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new DataDeleteRequest(j, l2, l1, localArrayList3, localArrayList2, localArrayList1, bool2, bool1);
  }

  public DataDeleteRequest[] cS(int paramInt)
  {
    return new DataDeleteRequest[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.d
 * JD-Core Version:    0.6.2
 */