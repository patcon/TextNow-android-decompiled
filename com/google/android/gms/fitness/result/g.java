package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;

public class g
  implements Parcelable.Creator<SessionStopResult>
{
  static void a(SessionStopResult paramSessionStopResult, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1000, paramSessionStopResult.getVersionCode());
    b.a(paramParcel, 2, paramSessionStopResult.getStatus(), paramInt, false);
    b.c(paramParcel, 3, paramSessionStopResult.getSessions(), false);
    b.H(paramParcel, i);
  }

  public SessionStopResult cb(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    Status localStatus = null;
    int j = 0;
    ArrayList localArrayList = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localStatus = (Status)a.a(paramParcel, k, Status.CREATOR);
        break;
      case 3:
        localArrayList = a.c(paramParcel, k, Session.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new SessionStopResult(j, localStatus, localArrayList);
  }

  public SessionStopResult[] dt(int paramInt)
  {
    return new SessionStopResult[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.result.g
 * JD-Core Version:    0.6.2
 */