package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
  implements Parcelable.Creator<LaunchOptions>
{
  static void a(LaunchOptions paramLaunchOptions, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramLaunchOptions.getVersionCode());
    b.a(paramParcel, 2, paramLaunchOptions.getRelaunchIfRunning());
    b.a(paramParcel, 3, paramLaunchOptions.getLanguage(), false);
    b.H(paramParcel, i);
  }

  public LaunchOptions[] Z(int paramInt)
  {
    return new LaunchOptions[paramInt];
  }

  public LaunchOptions v(Parcel paramParcel)
  {
    boolean bool = false;
    int i = a.C(paramParcel);
    String str = null;
    int j = 0;
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
        bool = a.c(paramParcel, k);
        break;
      case 3:
        str = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new LaunchOptions(j, bool, str);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.c
 * JD-Core Version:    0.6.2
 */