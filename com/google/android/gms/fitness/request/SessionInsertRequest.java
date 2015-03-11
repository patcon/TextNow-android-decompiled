package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import java.util.Collections;
import java.util.List;

public class SessionInsertRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<SessionInsertRequest> CREATOR = new s();
  private final int BR;
  private final List<DataSet> SD;
  private final Session St;
  private final List<DataPoint> UL;

  SessionInsertRequest(int paramInt, Session paramSession, List<DataSet> paramList, List<DataPoint> paramList1)
  {
    this.BR = paramInt;
    this.St = paramSession;
    this.SD = Collections.unmodifiableList(paramList);
    this.UL = Collections.unmodifiableList(paramList1);
  }

  private SessionInsertRequest(SessionInsertRequest.Builder paramBuilder)
  {
    this.BR = 1;
    this.St = SessionInsertRequest.Builder.a(paramBuilder);
    this.SD = Collections.unmodifiableList(SessionInsertRequest.Builder.b(paramBuilder));
    this.UL = Collections.unmodifiableList(SessionInsertRequest.Builder.c(paramBuilder));
  }

  private boolean a(SessionInsertRequest paramSessionInsertRequest)
  {
    return (n.equal(this.St, paramSessionInsertRequest.St)) && (n.equal(this.SD, paramSessionInsertRequest.SD)) && (n.equal(this.UL, paramSessionInsertRequest.UL));
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof SessionInsertRequest)) && (a((SessionInsertRequest)paramObject)));
  }

  public List<DataPoint> getAggregateDataPoints()
  {
    return this.UL;
  }

  public List<DataSet> getDataSets()
  {
    return this.SD;
  }

  public Session getSession()
  {
    return this.St;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.St;
    arrayOfObject[1] = this.SD;
    arrayOfObject[2] = this.UL;
    return n.hashCode(arrayOfObject);
  }

  public String toString()
  {
    return n.h(this).a("session", this.St).a("dataSets", this.SD).a("aggregateDataPoints", this.UL).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    s.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.SessionInsertRequest
 * JD-Core Version:    0.6.2
 */