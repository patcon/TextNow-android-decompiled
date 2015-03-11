package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Subscription;

public class ag
  implements Parcelable.Creator<af>
{
  static void a(af paramaf, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramaf.jD(), paramInt, false);
    b.c(paramParcel, 1000, paramaf.getVersionCode());
    b.a(paramParcel, 2, paramaf.jE());
    b.H(paramParcel, i);
  }

  public af bS(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    Subscription localSubscription = null;
    int j = 0;
    boolean bool = false;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localSubscription = (Subscription)a.a(paramParcel, k, Subscription.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        bool = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new af(j, localSubscription, bool);
  }

  public af[] dk(int paramInt)
  {
    return new af[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.ag
 * JD-Core Version:    0.6.2
 */