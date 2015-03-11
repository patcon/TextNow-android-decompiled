package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class c
  implements SafeParcelable
{
  public static final Parcelable.Creator<c> CREATOR = new d();
  final int BR;
  private final int FD;
  private final String Sz;
  private final int auS;
  private final boolean auT;
  private boolean auU;
  private String auV;
  private final String mName;

  c(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, String paramString3)
  {
    this.BR = paramInt1;
    this.mName = paramString1;
    this.Sz = paramString2;
    this.FD = paramInt2;
    this.auS = paramInt3;
    this.auT = paramBoolean1;
    this.auU = paramBoolean2;
    this.auV = paramString3;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c));
    c localc;
    do
    {
      return false;
      localc = (c)paramObject;
    }
    while ((!n.equal(Integer.valueOf(this.BR), Integer.valueOf(localc.BR))) || (!n.equal(this.mName, localc.mName)) || (!n.equal(this.Sz, localc.Sz)) || (!n.equal(Integer.valueOf(this.FD), Integer.valueOf(localc.FD))) || (!n.equal(Integer.valueOf(this.auS), Integer.valueOf(localc.auS))) || (!n.equal(Boolean.valueOf(this.auT), Boolean.valueOf(localc.auT))));
    return true;
  }

  public String getAddress()
  {
    return this.Sz;
  }

  public String getName()
  {
    return this.mName;
  }

  public int getRole()
  {
    return this.auS;
  }

  public int getType()
  {
    return this.FD;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = Integer.valueOf(this.BR);
    arrayOfObject[1] = this.mName;
    arrayOfObject[2] = this.Sz;
    arrayOfObject[3] = Integer.valueOf(this.FD);
    arrayOfObject[4] = Integer.valueOf(this.auS);
    arrayOfObject[5] = Boolean.valueOf(this.auT);
    return n.hashCode(arrayOfObject);
  }

  public boolean isConnected()
  {
    return this.auU;
  }

  public boolean isEnabled()
  {
    return this.auT;
  }

  public String pS()
  {
    return this.auV;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ConnectionConfiguration[ ");
    localStringBuilder.append("mName=" + this.mName);
    localStringBuilder.append(", mAddress=" + this.Sz);
    localStringBuilder.append(", mType=" + this.FD);
    localStringBuilder.append(", mRole=" + this.auS);
    localStringBuilder.append(", mEnabled=" + this.auT);
    localStringBuilder.append(", mIsConnected=" + this.auU);
    localStringBuilder.append(", mEnabled=" + this.auV);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.c
 * JD-Core Version:    0.6.2
 */