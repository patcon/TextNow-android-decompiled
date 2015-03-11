package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.internal.hm;

public class CustomProperty
  implements SafeParcelable
{
  public static final Parcelable.Creator<CustomProperty> CREATOR = new c();
  final CustomPropertyKey JQ;
  final String mValue;
  final int xM;

  CustomProperty(int paramInt, CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    this.xM = paramInt;
    hm.b(paramCustomPropertyKey, "key");
    this.JQ = paramCustomPropertyKey;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.CustomProperty
 * JD-Core Version:    0.6.2
 */