package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class fi
  implements SafeParcelable
{
  public static final fj CREATOR = new fj();
  final int xM;
  final String xQ;
  final String xR;
  final String xS;

  fi(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.xM = paramInt;
    this.xQ = paramString1;
    this.xR = paramString2;
    this.xS = paramString3;
  }

  public fi(String paramString1, String paramString2, String paramString3)
  {
    this(1, paramString1, paramString2, paramString3);
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.xQ;
    arrayOfObject[1] = this.xR;
    arrayOfObject[2] = this.xS;
    return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    fj.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fi
 * JD-Core Version:    0.6.2
 */