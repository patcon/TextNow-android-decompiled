package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Session;
import java.util.Collections;
import java.util.List;

public class SessionStopResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator<SessionStopResult> CREATOR = new g();
  private final int BR;
  private final Status CM;
  private final List<Session> Ul;

  SessionStopResult(int paramInt, Status paramStatus, List<Session> paramList)
  {
    this.BR = paramInt;
    this.CM = paramStatus;
    this.Ul = Collections.unmodifiableList(paramList);
  }

  public SessionStopResult(Status paramStatus, List<Session> paramList)
  {
    this.BR = 3;
    this.CM = paramStatus;
    this.Ul = Collections.unmodifiableList(paramList);
  }

  public static SessionStopResult I(Status paramStatus)
  {
    return new SessionStopResult(paramStatus, Collections.emptyList());
  }

  private boolean b(SessionStopResult paramSessionStopResult)
  {
    return (this.CM.equals(paramSessionStopResult.CM)) && (n.equal(this.Ul, paramSessionStopResult.Ul));
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof SessionStopResult)) && (b((SessionStopResult)paramObject)));
  }

  public List<Session> getSessions()
  {
    return this.Ul;
  }

  public Status getStatus()
  {
    return this.CM;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.CM;
    arrayOfObject[1] = this.Ul;
    return n.hashCode(arrayOfObject);
  }

  public String toString()
  {
    return n.h(this).a("status", this.CM).a("sessions", this.Ul).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.result.SessionStopResult
 * JD-Core Version:    0.6.2
 */