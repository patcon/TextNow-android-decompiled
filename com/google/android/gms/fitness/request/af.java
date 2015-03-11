package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Subscription;

public class af
  implements SafeParcelable
{
  public static final Parcelable.Creator<af> CREATOR = new ag();
  private final int BR;
  private final Subscription US;
  private final boolean UT;

  af(int paramInt, Subscription paramSubscription, boolean paramBoolean)
  {
    this.BR = paramInt;
    this.US = paramSubscription;
    this.UT = paramBoolean;
  }

  private af(af.a parama)
  {
    this.BR = 1;
    this.US = af.a.a(parama);
    this.UT = af.a.b(parama);
  }

  public int describeContents()
  {
    return 0;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public Subscription jD()
  {
    return this.US;
  }

  public boolean jE()
  {
    return this.UT;
  }

  public String toString()
  {
    return n.h(this).a("subscription", this.US).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ag.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.af
 * JD-Core Version:    0.6.2
 */