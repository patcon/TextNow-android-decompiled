package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class m
  implements Parcelable.Creator<RawBucket>
{
  static void a(RawBucket paramRawBucket, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramRawBucket.KS);
    b.c(paramParcel, 1000, paramRawBucket.BR);
    b.a(paramParcel, 2, paramRawBucket.Sr);
    b.a(paramParcel, 3, paramRawBucket.St, paramInt, false);
    b.c(paramParcel, 4, paramRawBucket.Tl);
    b.c(paramParcel, 5, paramRawBucket.SD, false);
    b.c(paramParcel, 6, paramRawBucket.SE);
    b.a(paramParcel, 7, paramRawBucket.SF);
    b.H(paramParcel, i);
  }

  public RawBucket br(Parcel paramParcel)
  {
    long l1 = 0L;
    ArrayList localArrayList = null;
    boolean bool = false;
    int i = a.C(paramParcel);
    int j = 0;
    int k = 0;
    Session localSession = null;
    long l2 = l1;
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
        l2 = a.i(paramParcel, n);
        break;
      case 1000:
        m = a.g(paramParcel, n);
        break;
      case 2:
        l1 = a.i(paramParcel, n);
        break;
      case 3:
        localSession = (Session)a.a(paramParcel, n, Session.CREATOR);
        break;
      case 4:
        k = a.g(paramParcel, n);
        break;
      case 5:
        localArrayList = a.c(paramParcel, n, RawDataSet.CREATOR);
        break;
      case 6:
        j = a.g(paramParcel, n);
        break;
      case 7:
        bool = a.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new RawBucket(m, l2, l1, localSession, k, localArrayList, j, bool);
  }

  public RawBucket[] cH(int paramInt)
  {
    return new RawBucket[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.m
 * JD-Core Version:    0.6.2
 */