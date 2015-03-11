package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class RawDataSet
  implements SafeParcelable
{
  public static final Parcelable.Creator<RawDataSet> CREATOR = new o();
  final int BR;
  final boolean SF;
  final int Tm;
  final int To;
  final List<RawDataPoint> Tp;

  RawDataSet(int paramInt1, int paramInt2, int paramInt3, List<RawDataPoint> paramList, boolean paramBoolean)
  {
    this.BR = paramInt1;
    this.Tm = paramInt2;
    this.To = paramInt3;
    this.Tp = paramList;
    this.SF = paramBoolean;
  }

  public RawDataSet(DataSet paramDataSet, List<DataSource> paramList, List<DataType> paramList1)
  {
    this.BR = 2;
    this.Tp = paramDataSet.e(paramList);
    this.SF = paramDataSet.iC();
    this.Tm = t.a(paramDataSet.getDataSource(), paramList);
    this.To = t.a(paramDataSet.getDataType(), paramList1);
  }

  private boolean a(RawDataSet paramRawDataSet)
  {
    return (this.Tm == paramRawDataSet.Tm) && (this.To == paramRawDataSet.To) && (this.SF == paramRawDataSet.SF) && (n.equal(this.Tp, paramRawDataSet.Tp));
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof RawDataSet)) && (a((RawDataSet)paramObject)));
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.Tm);
    arrayOfObject[1] = Integer.valueOf(this.To);
    return n.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.Tm);
    arrayOfObject[1] = Integer.valueOf(this.To);
    arrayOfObject[2] = this.Tp;
    return String.format("RawDataSet{%s@[%s, %s]}", arrayOfObject);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.RawDataSet
 * JD-Core Version:    0.6.2
 */