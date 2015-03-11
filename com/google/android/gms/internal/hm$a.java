package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class hm$a
  implements SafeParcelable
{
  public static final hn CREATOR = new hn();
  final int BR;
  public final Account Cj;

  public hm$a()
  {
    this(null);
  }

  hm$a(int paramInt, Account paramAccount)
  {
    this.BR = paramInt;
    this.Cj = paramAccount;
  }

  public hm$a(Account paramAccount)
  {
    this(1, paramAccount);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    hn.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hm.a
 * JD-Core Version:    0.6.2
 */