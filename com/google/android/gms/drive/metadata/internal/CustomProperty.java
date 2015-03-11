package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

public class CustomProperty
  implements SafeParcelable
{
  public static final Parcelable.Creator<CustomProperty> CREATOR = new c();
  final int BR;
  final CustomPropertyKey PJ;
  final String mValue;

  CustomProperty(int paramInt, CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    this.BR = paramInt;
    o.b(paramCustomPropertyKey, "key");
    this.PJ = paramCustomPropertyKey;
    this.mValue = paramString;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.CustomProperty
 * JD-Core Version:    0.6.2
 */