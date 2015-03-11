package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.c;

@Deprecated
public class r
  implements SafeParcelable
{
  public static final Parcelable.Creator<r> CREATOR = new s();
  public final c avx;
  public final int statusCode;
  public final int versionCode;

  r(int paramInt1, int paramInt2, c paramc)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.avx = paramc;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    s.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.r
 * JD-Core Version:    0.6.2
 */