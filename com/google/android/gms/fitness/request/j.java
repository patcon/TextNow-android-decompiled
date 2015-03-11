package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class j
  implements SafeParcelable
{
  public static final Parcelable.Creator<j> CREATOR = new k();
  private final int BR;
  private final String mName;

  j(int paramInt, String paramString)
  {
    this.BR = paramInt;
    this.mName = paramString;
  }

  public j(String paramString)
  {
    this.BR = 1;
    this.mName = paramString;
  }

  private boolean a(j paramj)
  {
    return n.equal(this.mName, paramj.mName);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof j)) && (a((j)paramObject)));
  }

  public String getName()
  {
    return this.mName;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.mName;
    return n.hashCode(arrayOfObject);
  }

  public String toString()
  {
    return n.h(this).a("name", this.mName).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    k.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.j
 * JD-Core Version:    0.6.2
 */