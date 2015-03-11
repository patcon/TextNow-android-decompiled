package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.concurrent.TimeUnit;

public class Session
  implements SafeParcelable
{
  public static final Parcelable.Creator<Session> CREATOR = new p();
  public static final String EXTRA_SESSION = "vnd.google.fitness.session";
  public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";
  private final int BR;
  private final long KS;
  private final int SC;
  private final a SP;
  private final long Sr;
  private final String Tq;
  private final String Tr;
  private final String mName;

  Session(int paramInt1, long paramLong1, long paramLong2, String paramString1, String paramString2, String paramString3, int paramInt2, a parama)
  {
    this.BR = paramInt1;
    this.KS = paramLong1;
    this.Sr = paramLong2;
    this.mName = paramString1;
    this.Tq = paramString2;
    this.Tr = paramString3;
    this.SC = paramInt2;
    this.SP = parama;
  }

  private Session(Session.Builder paramBuilder)
  {
    this.BR = 2;
    this.KS = Session.Builder.a(paramBuilder);
    this.Sr = Session.Builder.b(paramBuilder);
    this.mName = Session.Builder.c(paramBuilder);
    this.Tq = Session.Builder.d(paramBuilder);
    this.Tr = Session.Builder.e(paramBuilder);
    this.SC = Session.Builder.f(paramBuilder);
    this.SP = Session.Builder.g(paramBuilder);
  }

  private boolean a(Session paramSession)
  {
    return (this.KS == paramSession.KS) && (this.Sr == paramSession.Sr) && (n.equal(this.mName, paramSession.mName)) && (n.equal(this.Tq, paramSession.Tq)) && (n.equal(this.Tr, paramSession.Tr)) && (n.equal(this.SP, paramSession.SP)) && (this.SC == paramSession.SC);
  }

  public static Session extract(Intent paramIntent)
  {
    if (paramIntent == null)
      return null;
    return (Session)c.a(paramIntent, "vnd.google.fitness.session", CREATOR);
  }

  public static String getMimeType(String paramString)
  {
    return "vnd.google.fitness.session/" + paramString;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof Session)) && (a((Session)paramObject)));
  }

  public String getActivity()
  {
    return FitnessActivities.getName(this.SC);
  }

  public String getAppPackageName()
  {
    if (this.SP == null)
      return null;
    return this.SP.getPackageName();
  }

  public String getDescription()
  {
    return this.Tr;
  }

  public long getEndTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(this.Sr, TimeUnit.MILLISECONDS);
  }

  public String getIdentifier()
  {
    return this.Tq;
  }

  public String getName()
  {
    return this.mName;
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
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Long.valueOf(this.KS);
    arrayOfObject[1] = Long.valueOf(this.Sr);
    arrayOfObject[2] = this.Tq;
    return n.hashCode(arrayOfObject);
  }

  public int iB()
  {
    return this.SC;
  }

  public long iD()
  {
    return this.KS;
  }

  public long iE()
  {
    return this.Sr;
  }

  public a iM()
  {
    return this.SP;
  }

  public boolean isOngoing()
  {
    return this.Sr == 0L;
  }

  public String toString()
  {
    return n.h(this).a("startTime", Long.valueOf(this.KS)).a("endTime", Long.valueOf(this.Sr)).a("name", this.mName).a("identifier", this.Tq).a("description", this.Tr).a("activity", Integer.valueOf(this.SC)).a("application", this.SP).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    p.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.Session
 * JD-Core Version:    0.6.2
 */