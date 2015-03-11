package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataDeleteRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<DataDeleteRequest> CREATOR = new d();
  private final int BR;
  private final long KS;
  private final List<DataType> SB;
  private final long Sr;
  private final List<DataSource> Uk;
  private final List<Session> Ul;
  private final boolean Um;
  private final boolean Un;

  DataDeleteRequest(int paramInt, long paramLong1, long paramLong2, List<DataSource> paramList, List<DataType> paramList1, List<Session> paramList2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.BR = paramInt;
    this.KS = paramLong1;
    this.Sr = paramLong2;
    this.Uk = Collections.unmodifiableList(paramList);
    this.SB = Collections.unmodifiableList(paramList1);
    this.Ul = paramList2;
    this.Um = paramBoolean1;
    this.Un = paramBoolean2;
  }

  private DataDeleteRequest(DataDeleteRequest.Builder paramBuilder)
  {
    this.BR = 1;
    this.KS = DataDeleteRequest.Builder.a(paramBuilder);
    this.Sr = DataDeleteRequest.Builder.b(paramBuilder);
    this.Uk = Collections.unmodifiableList(DataDeleteRequest.Builder.c(paramBuilder));
    this.SB = Collections.unmodifiableList(DataDeleteRequest.Builder.d(paramBuilder));
    this.Ul = Collections.unmodifiableList(DataDeleteRequest.Builder.e(paramBuilder));
    this.Um = DataDeleteRequest.Builder.f(paramBuilder);
    this.Un = DataDeleteRequest.Builder.g(paramBuilder);
  }

  private boolean a(DataDeleteRequest paramDataDeleteRequest)
  {
    return (this.KS == paramDataDeleteRequest.KS) && (this.Sr == paramDataDeleteRequest.Sr) && (n.equal(this.Uk, paramDataDeleteRequest.Uk)) && (n.equal(this.SB, paramDataDeleteRequest.SB)) && (n.equal(this.Ul, paramDataDeleteRequest.Ul)) && (this.Um == paramDataDeleteRequest.Um) && (this.Un == paramDataDeleteRequest.Un);
  }

  public boolean deleteAllData()
  {
    return this.Um;
  }

  public boolean deleteAllSessions()
  {
    return this.Un;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof DataDeleteRequest)) && (a((DataDeleteRequest)paramObject)));
  }

  public List<DataSource> getDataSources()
  {
    return this.Uk;
  }

  public List<DataType> getDataTypes()
  {
    return this.SB;
  }

  public long getEndTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(this.Sr, TimeUnit.MILLISECONDS);
  }

  public List<Session> getSessions()
  {
    return this.Ul;
  }

  public long getStartTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(this.KS, TimeUnit.MILLISECONDS);
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(this.KS);
    arrayOfObject[1] = Long.valueOf(this.Sr);
    return n.hashCode(arrayOfObject);
  }

  public long iD()
  {
    return this.KS;
  }

  public long iE()
  {
    return this.Sr;
  }

  public boolean jg()
  {
    return this.Um;
  }

  public boolean jh()
  {
    return this.Un;
  }

  public String toString()
  {
    return n.h(this).a("startTimeMillis", Long.valueOf(this.KS)).a("endTimeMillis", Long.valueOf(this.Sr)).a("dataSources", this.Uk).a("dateTypes", this.SB).a("sessions", this.Ul).a("deleteAllData", Boolean.valueOf(this.Um)).a("deleteAllSessions", Boolean.valueOf(this.Un)).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.DataDeleteRequest
 * JD-Core Version:    0.6.2
 */