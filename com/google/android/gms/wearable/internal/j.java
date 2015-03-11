package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class j
  implements Parcelable.Creator<DataItemAssetParcelable>
{
  static void a(DataItemAssetParcelable paramDataItemAssetParcelable, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramDataItemAssetParcelable.BR);
    b.a(paramParcel, 2, paramDataItemAssetParcelable.getId(), false);
    b.a(paramParcel, 3, paramDataItemAssetParcelable.getDataItemKey(), false);
    b.H(paramParcel, i);
  }

  public DataItemAssetParcelable dT(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.C(paramParcel);
    int j = 0;
    String str2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        j = a.g(paramParcel, k);
        break;
      case 2:
        str2 = a.o(paramParcel, k);
        break;
      case 3:
        str1 = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new DataItemAssetParcelable(j, str2, str1);
  }

  public DataItemAssetParcelable[] fW(int paramInt)
  {
    return new DataItemAssetParcelable[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.j
 * JD-Core Version:    0.6.2
 */