package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class fm
  implements SafeParcelable
{
  public static final fn CREATOR = new fn();
  public final int id;
  final int xM;
  final Bundle xY;

  fm(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    this.xM = paramInt1;
    this.id = paramInt2;
    this.xY = paramBundle;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    fn.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fm
 * JD-Core Version:    0.6.2
 */