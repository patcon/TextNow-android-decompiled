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
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramDriveId.BR);
    b.a(paramParcel, 2, paramDriveId.Ni, false);
    b.a(paramParcel, 3, paramDriveId.Nj);
    b.a(paramParcel, 4, paramDriveId.Nk);
    b.H(paramParcel, i);
  }

  public DriveId O(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = a.C(paramParcel);
    int j = 0;
    String str = null;
    long l2 = l1;
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

  public DriveId[] aT(int paramInt)
  {
    return new DriveId[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.c
 * JD-Core Version:    0.6.2
 */