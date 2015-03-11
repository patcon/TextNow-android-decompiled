package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ao
  implements SafeParcelable
{
  public static final Parcelable.Creator<ao> CREATOR = new ap();
  public final m avA;
  public final int statusCode;
  public final int versionCode;

  ao(int paramInt1, int paramInt2, m paramm)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.avA = paramm;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ap.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ao
 * JD-Core Version:    0.6.2
 */