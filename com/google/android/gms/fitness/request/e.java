package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSet;

public class e
  implements SafeParcelable
{
  public static final Parcelable.Creator<e> CREATOR = new f();
  private final int BR;
  private final DataSet Ts;

  e(int paramInt, DataSet paramDataSet)
  {
    this.BR = paramInt;
    this.Ts = paramDataSet;
  }

  private e(e.a parama)
  {
    this.BR = 1;
    this.Ts = e.a.a(parama);
  }

  private boolean a(e parame)
  {
    return n.equal(this.Ts, parame.Ts);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof e)) && (a((e)paramObject)));
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.Ts;
    return n.hashCode(arrayOfObject);
  }

  public DataSet iW()
  {
    return this.Ts;
  }

  public String toString()
  {
    return n.h(this).a("dataSet", this.Ts).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.e
 * JD-Core Version:    0.6.2
 */