package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

public class c
  implements Parcelable.Creator<CustomProperty>
{
  static void a(CustomProperty paramCustomProperty, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramCustomProperty.BR);
    b.a(paramParcel, 2, paramCustomProperty.PJ, paramInt, false);
    b.a(paramParcel, 3, paramCustomProperty.mValue, false);
    b.H(paramParcel, i);
  }

  public CustomProperty aG(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    CustomPropertyKey localCustomPropertyKey = null;
    int j = 0;
    String str = null;
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
        localCustomPropertyKey = (CustomPropertyKey)a.a(paramParcel, k, CustomPropertyKey.CREATOR);
        break;
      case 3:
        str = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new CustomProperty(j, localCustomPropertyKey, str);
  }

  public CustomProperty[] bS(int paramInt)
  {
    return new CustomProperty[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.c
 * JD-Core Version:    0.6.2
 */