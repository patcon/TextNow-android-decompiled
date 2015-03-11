package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hm;

public class CustomPropertyKey
  implements SafeParcelable
{
  public static final Parcelable.Creator<CustomPropertyKey> CREATOR = new c();
  final String JL;
  final int JM;
  final int xM;

  CustomPropertyKey(int paramInt1, String paramString, int paramInt2)
  {
    this.xM = paramInt1;
    hm.b(paramString, "key");
    if ((paramInt2 == 0) || (paramInt2 == i));
    while (true)
    {
      hm.a(i, "visibility must be either PUBLIC or PRIVATE");
      this.JL = paramString;
      this.JM = paramInt2;
      return;
      i = 0;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == null);
    CustomPropertyKey localCustomPropertyKey;
    do
    {
      do
      {
        return false;
        if (paramObject == this)
          return true;
      }
      while (!(paramObject instanceof CustomPropertyKey));
      localCustomPropertyKey = (CustomPropertyKey)paramObject;
    }
    while ((!localCustomPropertyKey.getKey().equals(this.JL)) || (localCustomPropertyKey.getVisibility() != this.JM));
    return true;
  }

  public String getKey()
  {
    return this.JL;
  }

  public int getVisibility()
  {
    return this.JM;
  }

  public int hashCode()
  {
    return (this.JL + this.JM).hashCode();
  }

  public String toString()
  {
    return "CustomPropertyKey(" + this.JL + "," + this.JM + ")";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.CustomPropertyKey
 * JD-Core Version:    0.6.2
 */