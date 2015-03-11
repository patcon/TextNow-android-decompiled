package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@Deprecated
public class CountrySpecification
  implements SafeParcelable
{
  public static final Parcelable.Creator<CountrySpecification> CREATOR = new c();
  String rf;
  private final int xM;

  CountrySpecification(int paramInt, String paramString)
  {
    this.xM = paramInt;
    this.rf = paramString;
  }

  public CountrySpecification(String paramString)
  {
    this.xM = 1;
    this.rf = paramString;
  }

  public int describeContents()
  {
    return 0;
  }

  public String getCountryCode()
  {
    return this.rf;
  }

  public int getVersionCode()
  {
    return this.xM;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.CountrySpecification
 * JD-Core Version:    0.6.2
 */