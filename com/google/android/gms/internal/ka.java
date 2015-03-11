package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

public class ka
  implements SafeParcelable
{
  public static final kb CREATOR = new kb();
  public final String YV;
  public final String YW;
  public final int versionCode;

  public ka(int paramInt, String paramString1, String paramString2)
  {
    this.versionCode = paramInt;
    this.YV = paramString1;
    this.YW = paramString2;
  }

  public ka(String paramString, Locale paramLocale)
  {
    this.versionCode = 0;
    this.YV = paramString;
    this.YW = paramLocale.toString();
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    ka localka;
    do
    {
      return true;
      if ((paramObject == null) || (!(paramObject instanceof ka)))
        return false;
      localka = (ka)paramObject;
    }
    while ((this.YW.equals(localka.YW)) && (this.YV.equals(localka.YV)));
    return false;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.YV;
    arrayOfObject[1] = this.YW;
    return hk.hashCode(arrayOfObject);
  }

  public String toString()
  {
    return hk.e(this).a("clientPackageName", this.YV).a("locale", this.YW).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kb.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ka
 * JD-Core Version:    0.6.2
 */