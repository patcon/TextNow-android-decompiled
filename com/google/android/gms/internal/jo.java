package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class jo
  implements SafeParcelable
{
  public static final jp CREATOR = new jp();
  private final String Wl;
  private final String mTag;
  final int xM;

  jo(int paramInt, String paramString1, String paramString2)
  {
    this.xM = paramInt;
    this.Wl = paramString1;
    this.mTag = paramString2;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof jo));
    jo localjo;
    do
    {
      return false;
      localjo = (jo)paramObject;
    }
    while ((!hk.equal(this.Wl, localjo.Wl)) || (!hk.equal(this.mTag, localjo.mTag)));
    return true;
  }

  public String getTag()
  {
    return this.mTag;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.Wl;
    arrayOfObject[1] = this.mTag;
    return hk.hashCode(arrayOfObject);
  }

  public String jj()
  {
    return this.Wl;
  }

  public String toString()
  {
    return hk.e(this).a("mPlaceId", this.Wl).a("mTag", this.mTag).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    jp.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jo
 * JD-Core Version:    0.6.2
 */