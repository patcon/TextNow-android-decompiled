package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;

public class s
  implements Parcelable.Creator<SessionInsertRequest>
{
  static void a(SessionInsertRequest paramSessionInsertRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramSessionInsertRequest.getSession(), paramInt, false);
    b.c(paramParcel, 1000, paramSessionInsertRequest.getVersionCode());
    b.c(paramParcel, 2, paramSessionInsertRequest.getDataSets(), false);
    b.c(paramParcel, 3, paramSessionInsertRequest.getAggregateDataPoints(), false);
    b.H(paramParcel, i);
  }

  public SessionInsertRequest bK(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    ArrayList localArrayList1 = null;
    Session localSession = null;
    int j = 0;
    ArrayList localArrayList2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localSession = (Session)a.a(paramParcel, k, Session.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localArrayList1 = a.c(paramParcel, k, DataSet.CREATOR);
        break;
      case 3:
        localArrayList2 = a.c(paramParcel, k, DataPoint.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new SessionInsertRequest(j, localSession, localArrayList1, localArrayList2);
  }

  public SessionInsertRequest[] dc(int paramInt)
  {
    return new SessionInsertRequest[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.s
 * JD-Core Version:    0.6.2
 */