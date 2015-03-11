package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class hv$a
  implements SafeParcelable
{
  public static final hx CREATOR = new hx();
  final String GZ;
  final int Ha;
  final int versionCode;

  hv$a(int paramInt1, String paramString, int paramInt2)
  {
    this.versionCode = paramInt1;
    this.GZ = paramString;
    this.Ha = paramInt2;
  }

  hv$a(String paramString, int paramInt)
  {
    this.versionCode = 1;
    this.GZ = paramString;
    this.Ha = paramInt;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    hx.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hv.a
 * JD-Core Version:    0.6.2
 */