package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionReadRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<SessionReadRequest> CREATOR = new t();
  private final int BR;
  private final long KS;
  private final List<DataType> SB;
  private final long Sr;
  private final String UN;
  private boolean UO;
  private final List<String> UP;
  private final List<DataSource> Uk;
  private final boolean Uv;
  private final String vL;

  SessionReadRequest(int paramInt, String paramString1, String paramString2, long paramLong1, long paramLong2, List<DataType> paramList, List<DataSource> paramList1, boolean paramBoolean1, boolean paramBoolean2, List<String> paramList2)
  {
    this.BR = paramInt;
    this.UN = paramString1;
    this.vL = paramString2;
    this.KS = paramLong1;
    this.Sr = paramLong2;
    this.SB = Collections.unmodifiableList(paramList);
    this.Uk = Collections.unmodifiableList(paramList1);
    this.UO = paramBoolean1;
    this.Uv = paramBoolean2;
    this.UP = paramList2;
  }

  private SessionReadRequest(SessionReadRequest.Builder paramBuilder)
  {
    this.BR = 3;
    this.UN = SessionReadRequest.Builder.a(paramBuilder);
    this.vL = SessionReadRequest.Builder.b(paramBuilder);
    this.KS = SessionReadRequest.Builder.c(paramBuilder);
    this.Sr = SessionReadRequest.Builder.d(paramBuilder);
    this.SB = Collections.unmodifiableList(SessionReadRequest.Builder.e(paramBuilder));
    this.Uk = Collections.unmodifiableList(SessionReadRequest.Builder.f(paramBuilder));
    this.UO = SessionReadRequest.Builder.g(paramBuilder);
    this.Uv = SessionReadRequest.Builder.h(paramBuilder);
    this.UP = Collections.unmodifiableList(SessionReadRequest.Builder.i(paramBuilder));
  }

  private boolean a(SessionReadRequest paramSessionReadRequest)
  {
    return (n.equal(this.UN, paramSessionReadRequest.UN)) && (this.vL.equals(paramSessionReadRequest.vL)) && (this.KS == paramSessionReadRequest.KS) && (this.Sr == paramSessionReadRequest.Sr) && (n.equal(this.SB, paramSessionReadRequest.SB)) && (n.equal(this.Uk, paramSessionReadRequest.Uk)) && (this.UO == paramSessionReadRequest.UO) && (this.UP.equals(paramSessionReadRequest.UP)) && (this.Uv == paramSessionReadRequest.Uv);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof SessionReadRequest)) && (a((SessionReadRequest)paramObject)));
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

  public List<String> getExcludedPackages()
  {
    return this.UP;
  }

  public String getSessionId()
  {
    return this.vL;
  }

  public String getSessionName()
  {
    return this.UN;
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
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.UN;
    arrayOfObject[1] = this.vL;
    arrayOfObject[2] = Long.valueOf(this.KS);
    arrayOfObject[3] = Long.valueOf(this.Sr);
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

  public boolean includeSessionsFromAllApps()
  {
    return this.UO;
  }

  public boolean jl()
  {
    return this.Uv;
  }

  public boolean jz()
  {
    return this.UO;
  }

  public String toString()
  {
    return n.h(this).a("sessionName", this.UN).a("sessionId", this.vL).a("startTimeMillis", Long.valueOf(this.KS)).a("endTimeMillis", Long.valueOf(this.Sr)).a("dataTypes", this.SB).a("dataSources", this.Uk).a("sessionsFromAllApps", Boolean.valueOf(this.UO)).a("excludedPackages", this.UP).a("useServer", Boolean.valueOf(this.Uv)).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    t.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.SessionReadRequest
 * JD-Core Version:    0.6.2
 */