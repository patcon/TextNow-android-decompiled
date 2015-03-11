package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import java.util.ArrayList;

public class b
  implements Parcelable.Creator<Cart>
{
  static void a(Cart paramCart, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.C(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramCart.getVersionCode());
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramCart.aiK, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramCart.aiL, false);
    com.google.android.gms.common.internal.safeparcel.b.b(paramParcel, 4, paramCart.aiM, false);
    com.google.android.gms.common.internal.safeparcel.b.G(paramParcel, i);
  }

  public Cart bR(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.B(paramParcel);
    ArrayList localArrayList = new ArrayList();
    int j = 0;
    String str2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.A(paramParcel);
      switch (a.ar(k))
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
        break;
      case 4:
        localArrayList = a.c(paramParcel, k, LineItem.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new Cart(j, str2, str1, localArrayList);
  }

  public Cart[] dx(int paramInt)
  {
    return new Cart[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.b
 * JD-Core Version:    0.6.2
 */