package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class fk
  implements SafeParcelable
{
  public static final fl CREATOR = new fl();
  public static final int xT = Integer.parseInt("-1");
  final int xM;
  public final String xU;
  final fp xV;
  public final int xW;
  public final byte[] xX;

  fk(int paramInt1, String paramString, fp paramfp, int paramInt2, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == xT) || (fo.H(paramInt2) != null));
    for (boolean bool = true; ; bool = false)
    {
      hm.b(bool, "Invalid section type " + paramInt2);
      this.xM = paramInt1;
      this.xU = paramString;
      this.xV = paramfp;
      this.xW = paramInt2;
      this.xX = paramArrayOfByte;
      String str = dO();
      if (str == null)
        break;
      throw new IllegalArgumentException(str);
    }
  }

  public fk(String paramString, fp paramfp)
  {
    this(1, paramString, paramfp, xT, null);
  }

  public fk(String paramString1, fp paramfp, String paramString2)
  {
    this(1, paramString1, paramfp, fo.Y(paramString2), null);
  }

  public fk(byte[] paramArrayOfByte, fp paramfp)
  {
    this(1, null, paramfp, xT, paramArrayOfByte);
  }

  public String dO()
  {
    if ((this.xW != xT) && (fo.H(this.xW) == null))
      return "Invalid section type " + this.xW;
    if ((this.xU != null) && (this.xX != null))
      return "Both content and blobContent set";
    return null;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    fl.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fk
 * JD-Core Version:    0.6.2
 */