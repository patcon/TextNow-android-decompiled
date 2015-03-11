package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class v
  implements SafeParcelable
{
  public static final w CREATOR = new w();
  public final boolean lb;
  public final boolean ld;
  public final int versionCode;

  v(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.versionCode = paramInt;
    this.lb = paramBoolean1;
    this.ld = paramBoolean2;
  }

  public v(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.versionCode = 1;
    this.lb = paramBoolean1;
    this.ld = paramBoolean2;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    w.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.v
 * JD-Core Version:    0.6.2
 */