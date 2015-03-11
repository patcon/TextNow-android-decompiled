package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class fp
  implements SafeParcelable
{
  public static final fq CREATOR = new fq();
  public final String name;
  public final int weight;
  final int xM;
  public final String yb;
  public final boolean yc;
  public final boolean yd;
  public final String ye;
  public final fm[] yf;
  final int[] yg;
  public final String yh;

  fp(int paramInt1, String paramString1, String paramString2, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, String paramString3, fm[] paramArrayOffm, int[] paramArrayOfInt, String paramString4)
  {
    this.xM = paramInt1;
    this.name = paramString1;
    this.yb = paramString2;
    this.yc = paramBoolean1;
    this.weight = paramInt2;
    this.yd = paramBoolean2;
    this.ye = paramString3;
    this.yf = paramArrayOffm;
    this.yg = paramArrayOfInt;
    this.yh = paramString4;
  }

  fp(String paramString1, String paramString2, boolean paramBoolean1, int paramInt, boolean paramBoolean2, String paramString3, fm[] paramArrayOffm, int[] paramArrayOfInt, String paramString4)
  {
    this(2, paramString1, paramString2, paramBoolean1, paramInt, paramBoolean2, paramString3, paramArrayOffm, paramArrayOfInt, paramString4);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof fp;
    boolean bool2 = false;
    if (bool1)
    {
      fp localfp = (fp)paramObject;
      boolean bool3 = this.name.equals(localfp.name);
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = this.yb.equals(localfp.yb);
        bool2 = false;
        if (bool4)
        {
          boolean bool5 = this.yc;
          boolean bool6 = localfp.yc;
          bool2 = false;
          if (bool5 == bool6)
            bool2 = true;
        }
      }
    }
    return bool2;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    fq.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fp
 * JD-Core Version:    0.6.2
 */