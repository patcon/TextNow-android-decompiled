package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.ig;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.d;
import com.google.android.gms.wallet.wobs.f;
import com.google.android.gms.wallet.wobs.l;
import com.google.android.gms.wallet.wobs.n;
import com.google.android.gms.wallet.wobs.p;
import java.util.ArrayList;

public class j
  implements Parcelable.Creator<LoyaltyWalletObject>
{
  static void a(LoyaltyWalletObject paramLoyaltyWalletObject, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramLoyaltyWalletObject.getVersionCode());
    b.a(paramParcel, 2, paramLoyaltyWalletObject.eC, false);
    b.a(paramParcel, 3, paramLoyaltyWalletObject.aji, false);
    b.a(paramParcel, 4, paramLoyaltyWalletObject.ajj, false);
    b.a(paramParcel, 5, paramLoyaltyWalletObject.ajk, false);
    b.a(paramParcel, 6, paramLoyaltyWalletObject.ajl, false);
    b.a(paramParcel, 7, paramLoyaltyWalletObject.ajm, false);
    b.a(paramParcel, 8, paramLoyaltyWalletObject.ajn, false);
    b.a(paramParcel, 9, paramLoyaltyWalletObject.ajo, false);
    b.a(paramParcel, 10, paramLoyaltyWalletObject.ajp, false);
    b.a(paramParcel, 11, paramLoyaltyWalletObject.ajq, false);
    b.c(paramParcel, 12, paramLoyaltyWalletObject.state);
    b.b(paramParcel, 13, paramLoyaltyWalletObject.ajr, false);
    b.a(paramParcel, 14, paramLoyaltyWalletObject.ajs, paramInt, false);
    b.b(paramParcel, 15, paramLoyaltyWalletObject.ajt, false);
    b.a(paramParcel, 17, paramLoyaltyWalletObject.ajv, false);
    b.a(paramParcel, 16, paramLoyaltyWalletObject.aju, false);
    b.a(paramParcel, 19, paramLoyaltyWalletObject.ajx);
    b.b(paramParcel, 18, paramLoyaltyWalletObject.ajw, false);
    b.b(paramParcel, 21, paramLoyaltyWalletObject.ajz, false);
    b.b(paramParcel, 20, paramLoyaltyWalletObject.ajy, false);
    b.a(paramParcel, 23, paramLoyaltyWalletObject.ajB, paramInt, false);
    b.b(paramParcel, 22, paramLoyaltyWalletObject.ajA, false);
    b.G(paramParcel, i);
  }

  public LoyaltyWalletObject bY(Parcel paramParcel)
  {
    int i = a.B(paramParcel);
    int j = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
    String str8 = null;
    String str9 = null;
    String str10 = null;
    int k = 0;
    ArrayList localArrayList1 = ig.ga();
    l locall = null;
    ArrayList localArrayList2 = ig.ga();
    String str11 = null;
    String str12 = null;
    ArrayList localArrayList3 = ig.ga();
    boolean bool = false;
    ArrayList localArrayList4 = ig.ga();
    ArrayList localArrayList5 = ig.ga();
    ArrayList localArrayList6 = ig.ga();
    f localf = null;
    while (paramParcel.dataPosition() < i)
    {
      int m = a.A(paramParcel);
      switch (a.ar(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        j = a.g(paramParcel, m);
        break;
      case 2:
        str1 = a.o(paramParcel, m);
        break;
      case 3:
        str2 = a.o(paramParcel, m);
        break;
      case 4:
        str3 = a.o(paramParcel, m);
        break;
      case 5:
        str4 = a.o(paramParcel, m);
        break;
      case 6:
        str5 = a.o(paramParcel, m);
        break;
      case 7:
        str6 = a.o(paramParcel, m);
        break;
      case 8:
        str7 = a.o(paramParcel, m);
        break;
      case 9:
        str8 = a.o(paramParcel, m);
        break;
      case 10:
        str9 = a.o(paramParcel, m);
        break;
      case 11:
        str10 = a.o(paramParcel, m);
        break;
      case 12:
        k = a.g(paramParcel, m);
        break;
      case 13:
        localArrayList1 = a.c(paramParcel, m, p.CREATOR);
        break;
      case 14:
        locall = (l)a.a(paramParcel, m, l.CREATOR);
        break;
      case 15:
        localArrayList2 = a.c(paramParcel, m, LatLng.CREATOR);
        break;
      case 17:
        str12 = a.o(paramParcel, m);
        break;
      case 16:
        str11 = a.o(paramParcel, m);
        break;
      case 19:
        bool = a.c(paramParcel, m);
        break;
      case 18:
        localArrayList3 = a.c(paramParcel, m, d.CREATOR);
        break;
      case 21:
        localArrayList5 = a.c(paramParcel, m, com.google.android.gms.wallet.wobs.j.CREATOR);
        break;
      case 20:
        localArrayList4 = a.c(paramParcel, m, n.CREATOR);
        break;
      case 23:
        localf = (f)a.a(paramParcel, m, f.CREATOR);
        break;
      case 22:
        localArrayList6 = a.c(paramParcel, m, n.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new LoyaltyWalletObject(j, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, k, localArrayList1, locall, localArrayList2, str11, str12, localArrayList3, bool, localArrayList4, localArrayList5, localArrayList6, localf);
  }

  public LoyaltyWalletObject[] dE(int paramInt)
  {
    return new LoyaltyWalletObject[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.j
 * JD-Core Version:    0.6.2
 */