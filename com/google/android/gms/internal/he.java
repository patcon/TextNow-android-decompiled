package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.BitSet;

public class he
  implements SafeParcelable
{
  public static final hf CREATOR = new hf();
  final int BR;
  final hi[] BS;
  public final String BT;
  public final boolean BU;
  public final Account account;

  he(int paramInt, hi[] paramArrayOfhi, String paramString, boolean paramBoolean, Account paramAccount)
  {
    this.BR = paramInt;
    this.BS = paramArrayOfhi;
    this.BT = paramString;
    this.BU = paramBoolean;
    this.account = paramAccount;
  }

  he(String paramString, boolean paramBoolean, Account paramAccount, hi[] paramArrayOfhi)
  {
    this(1, paramArrayOfhi, paramString, paramBoolean, paramAccount);
    BitSet localBitSet = new BitSet(hp.fl());
    for (int i = 0; i < paramArrayOfhi.length; i++)
    {
      int j = paramArrayOfhi[i].Cg;
      if (j != -1)
      {
        if (localBitSet.get(j))
          throw new IllegalArgumentException("Duplicate global search section type " + hp.O(j));
        localBitSet.set(j);
      }
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    hf.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.he
 * JD-Core Version:    0.6.2
 */