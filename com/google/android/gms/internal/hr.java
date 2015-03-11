package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class hr
  implements SafeParcelable
{
  public static final hs CREATOR = new hs();
  public final String GT;
  public final int GU;
  final int xM;

  public hr(int paramInt1, String paramString, int paramInt2)
  {
    this.xM = paramInt1;
    this.GT = paramString;
    this.GU = paramInt2;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    hs.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hr
 * JD-Core Version:    0.6.2
 */