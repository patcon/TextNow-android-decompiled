package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;

public class m
  implements SafeParcelable
{
  public static final Parcelable.Creator<m> CREATOR = new n();
  private final int BR;
  private final DataType Sp;

  m(int paramInt, DataType paramDataType)
  {
    this.BR = paramInt;
    this.Sp = paramDataType;
  }

  private m(m.a parama)
  {
    this.BR = 1;
    this.Sp = m.a.a(parama);
  }

  public int describeContents()
  {
    return 0;
  }

  public DataType getDataType()
  {
    return this.Sp;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    n.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.m
 * JD-Core Version:    0.6.2
 */