package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class v
  implements SafeParcelable
{
  public static final Parcelable.Creator<v> CREATOR = new w();
  public final List<ak> avz;
  public final int statusCode;
  public final int versionCode;

  v(int paramInt1, int paramInt2, List<ak> paramList)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.avz = paramList;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    w.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.v
 * JD-Core Version:    0.6.2
 */