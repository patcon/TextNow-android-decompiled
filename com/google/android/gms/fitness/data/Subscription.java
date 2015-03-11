package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Subscription
  implements SafeParcelable
{
  public static final Parcelable.Creator<Subscription> CREATOR = new s();
  private final int BR;
  private final DataType Sp;
  private final DataSource Sq;
  private final long Tt;
  private final int Tu;

  Subscription(int paramInt1, DataSource paramDataSource, DataType paramDataType, long paramLong, int paramInt2)
  {
    this.BR = paramInt1;
    this.Sq = paramDataSource;
    this.Sp = paramDataType;
    this.Tt = paramLong;
    this.Tu = paramInt2;
  }

  private Subscription(Subscription.a parama)
  {
    this.BR = 1;
    this.Sp = Subscription.a.a(parama);
    this.Sq = Subscription.a.b(parama);
    this.Tt = Subscription.a.c(parama);
    this.Tu = Subscription.a.d(parama);
  }

  private boolean a(Subscription paramSubscription)
  {
    return (n.equal(this.Sq, paramSubscription.Sq)) && (n.equal(this.Sp, paramSubscription.Sp)) && (this.Tt == paramSubscription.Tt) && (this.Tu == paramSubscription.Tu);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof Subscription)) && (a((Subscription)paramObject)));
  }

  public int getAccuracyMode()
  {
    return this.Tu;
  }

  public DataSource getDataSource()
  {
    return this.Sq;
  }

  public DataType getDataType()
  {
    return this.Sp;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.Sq;
    arrayOfObject[1] = this.Sq;
    arrayOfObject[2] = Long.valueOf(this.Tt);
    arrayOfObject[3] = Integer.valueOf(this.Tu);
    return n.hashCode(arrayOfObject);
  }

  public long iX()
  {
    return this.Tt;
  }

  public DataType iY()
  {
    if (this.Sp == null)
      return this.Sq.getDataType();
    return this.Sp;
  }

  public String toDebugString()
  {
    Object[] arrayOfObject = new Object[1];
    if (this.Sq == null);
    for (String str = this.Sp.getName(); ; str = this.Sq.toDebugString())
    {
      arrayOfObject[0] = str;
      return String.format("Subscription{%s}", arrayOfObject);
    }
  }

  public String toString()
  {
    return n.h(this).a("dataSource", this.Sq).a("dataType", this.Sp).a("samplingIntervalMicros", Long.valueOf(this.Tt)).a("accuracyMode", Integer.valueOf(this.Tu)).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    s.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.Subscription
 * JD-Core Version:    0.6.2
 */