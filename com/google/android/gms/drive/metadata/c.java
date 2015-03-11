package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
  implements Parcelable.Creator<CustomPropertyKey>
{
  static void a(CustomPropertyKey paramCustomPropertyKey, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramCustomPropertyKey.BR);
    b.a(paramParcel, 2, paramCustomPropertyKey.JO, false);
    b.c(paramParcel, 3, paramCustomPropertyKey.mVisibility);
    b.H(paramParcel, i);
  }

  public CustomPropertyKey aE(Parcel paramParcel)
  {
    int i = 0;
    int j = a.C(paramParcel);
    String str = null;
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
        k = a.g(paramParcel, m);
        break;
      case 2:
        str = a.o(paramParcel, m);
        break;
      case 3:
        i = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new CustomPropertyKey(k, str, i);
  }

  public CustomPropertyKey[] bQ(int paramInt)
  {
    return new CustomPropertyKey[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.c
 * JD-Core Version:    0.6.2
 */