package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
  implements Parcelable.Creator<DriveId>
{
  static void a(DriveId paramDriveId, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.c(paramParcel, 1, paramDriveId.xM);
    b.a(paramParcel, 2, paramDriveId.HN, false);
    b.a(paramParcel, 3, paramDriveId.HO);
    b.a(paramParcel, 4, paramDriveId.HP);
    b.G(paramParcel, i);
  }

  public DriveId N(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = a.B(paramParcel);
    int j = 0;
    String str = null;
    long l2 = l1;
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
        str = a.o(paramParcel, k);
        break;
      case 3:
        l2 = a.i(paramParcel, k);
        break;
      case 4:
        l1 = a.i(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new DriveId(j, str, l2, l1);
  }

  public DriveId[] aH(int paramInt)
  {
    return new DriveId[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.c
 * JD-Core Version:    0.6.2
 */