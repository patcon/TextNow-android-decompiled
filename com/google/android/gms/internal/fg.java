package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.BitSet;

public class fg
  implements SafeParcelable
{
  public static final fh CREATOR = new fh();
  final int xM;
  final fk[] xN;
  public final String xO;
  public final boolean xP;

  fg(int paramInt, fk[] paramArrayOffk, String paramString, boolean paramBoolean)
  {
    this.xM = paramInt;
    this.xN = paramArrayOffk;
    this.xO = paramString;
    this.xP = paramBoolean;
  }

  public fg(String paramString, boolean paramBoolean, fk[] paramArrayOffk)
  {
    this(1, paramArrayOffk, paramString, paramBoolean);
    BitSet localBitSet = new BitSet(fo.dP());
    for (int i = 0; i < paramArrayOffk.length; i++)
    {
      int j = paramArrayOffk[i].xW;
      if (j != -1)
      {
        if (localBitSet.get(j))
          throw new IllegalArgumentException("Duplicate global search section type " + fo.H(j));
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
    fh.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fg
 * JD-Core Version:    0.6.2
 */