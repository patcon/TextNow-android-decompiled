package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class hb
  implements Parcelable
{

  @Deprecated
  public static final Parcelable.Creator<hb> CREATOR = new Parcelable.Creator()
  {
    @Deprecated
    public final hb[] H(int paramAnonymousInt)
    {
      return new hb[paramAnonymousInt];
    }

    @Deprecated
    public final hb k(Parcel paramAnonymousParcel)
    {
      return new hb(paramAnonymousParcel);
    }
  };
  private String BL;
  private String BM;
  private String mValue;

  @Deprecated
  public hb()
  {
  }

  @Deprecated
  hb(Parcel paramParcel)
  {
    readFromParcel(paramParcel);
  }

  public hb(String paramString1, String paramString2, String paramString3)
  {
    this.BL = paramString1;
    this.BM = paramString2;
    this.mValue = paramString3;
  }

  @Deprecated
  private void readFromParcel(Parcel paramParcel)
  {
    this.BL = paramParcel.readString();
    this.BM = paramParcel.readString();
    this.mValue = paramParcel.readString();
  }

  @Deprecated
  public int describeContents()
  {
    return 0;
  }

  public String getId()
  {
    return this.BL;
  }

  public String getValue()
  {
    return this.mValue;
  }

  @Deprecated
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.BL);
    paramParcel.writeString(this.BM);
    paramParcel.writeString(this.mValue);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hb
 * JD-Core Version:    0.6.2
 */