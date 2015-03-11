package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class jf$a
  implements SafeParcelable
{
  public static final jh CREATOR = new jh();
  final String Mw;
  final int Mx;
  final int versionCode;

  jf$a(int paramInt1, String paramString, int paramInt2)
  {
    this.versionCode = paramInt1;
    this.Mw = paramString;
    this.Mx = paramInt2;
  }

  jf$a(String paramString, int paramInt)
  {
    this.versionCode = 1;
    this.Mw = paramString;
    this.Mx = paramInt;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    jh.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jf.a
 * JD-Core Version:    0.6.2
 */