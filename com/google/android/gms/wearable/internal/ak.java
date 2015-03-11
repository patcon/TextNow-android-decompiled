package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

public class ak
  implements SafeParcelable, Node
{
  public static final Parcelable.Creator<ak> CREATOR = new al();
  private final String BL;
  final int BR;
  private final String NH;

  ak(int paramInt, String paramString1, String paramString2)
  {
    this.BR = paramInt;
    this.BL = paramString1;
    this.NH = paramString2;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ak));
    ak localak;
    do
    {
      return false;
      localak = (ak)paramObject;
    }
    while ((!localak.BL.equals(this.BL)) || (!localak.NH.equals(this.NH)));
    return true;
  }

  public String getDisplayName()
  {
    return this.NH;
  }

  public String getId()
  {
    return this.BL;
  }

  public int hashCode()
  {
    return 37 * (629 + this.BL.hashCode()) + this.NH.hashCode();
  }

  public String toString()
  {
    return "NodeParcelable{" + this.BL + "," + this.NH + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    al.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ak
 * JD-Core Version:    0.6.2
 */