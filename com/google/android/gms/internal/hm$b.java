package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class hm$b
  implements Result, SafeParcelable
{
  public static final ho CREATOR = new ho();
  final int BR;
  public Status Ck;
  public List<hs> Cl;

  public hm$b()
  {
    this.BR = 1;
  }

  hm$b(int paramInt, Status paramStatus, List<hs> paramList)
  {
    this.BR = paramInt;
    this.Ck = paramStatus;
    this.Cl = paramList;
  }

  public int describeContents()
  {
    return 0;
  }

  public Status getStatus()
  {
    return this.Ck;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ho.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hm.b
 * JD-Core Version:    0.6.2
 */