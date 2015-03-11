package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d
  implements Parcelable.Creator<c>
{
  static void a(c paramc, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramc.BR);
    b.a(paramParcel, 2, paramc.getName(), false);
    b.a(paramParcel, 3, paramc.getAddress(), false);
    b.c(paramParcel, 4, paramc.getType());
    b.c(paramParcel, 5, paramc.getRole());
    b.a(paramParcel, 6, paramc.isEnabled());
    b.a(paramParcel, 7, paramc.isConnected());
    b.a(paramParcel, 8, paramc.pS(), false);
    b.H(paramParcel, i);
  }

  public c dQ(Parcel paramParcel)
  {
    String str1 = null;
    boolean bool1 = false;
    int i = a.C(paramParcel);
    boolean bool2 = false;
    int j = 0;
    int k = 0;
    String str2 = null;
    String str3 = null;
    int m = 0;
    while (paramParcel.dataPosition() < i)
    {
      int n = a.B(paramParcel);
      switch (a.aD(n))
      {
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        m = a.g(paramParcel, n);
        break;
      case 2:
        str3 = a.o(paramParcel, n);
        break;
      case 3:
        str2 = a.o(paramParcel, n);
        break;
      case 4:
        k = a.g(paramParcel, n);
        break;
      case 5:
        j = a.g(paramParcel, n);
        break;
      case 6:
        bool2 = a.c(paramParcel, n);
        break;
      case 7:
        bool1 = a.c(paramParcel, n);
        break;
      case 8:
        str1 = a.o(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new c(m, str3, str2, k, j, bool2, bool1, str1);
  }

  public c[] fT(int paramInt)
  {
    return new c[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.d
 * JD-Core Version:    0.6.2
 */