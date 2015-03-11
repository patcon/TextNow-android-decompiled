package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Session;

public class w
  implements SafeParcelable
{
  public static final Parcelable.Creator<w> CREATOR = new x();
  private final int BR;
  private final Session St;

  w(int paramInt, Session paramSession)
  {
    this.BR = paramInt;
    this.St = paramSession;
  }

  private w(w.a parama)
  {
    this.BR = 1;
    this.St = w.a.a(parama);
  }

  private boolean a(w paramw)
  {
    return n.equal(this.St, paramw.St);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof w)) && (a((w)paramObject)));
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
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.St;
    return n.hashCode(arrayOfObject);
  }

  public String toString()
  {
    return n.h(this).a("session", this.St).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    x.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.w
 * JD-Core Version:    0.6.2
 */