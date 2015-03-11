package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ah
  implements SafeParcelable
{
  public static final Parcelable.Creator<ah> CREATOR = new ai();
  private final int BR;
  private final String Ui;

  ah(int paramInt, String paramString)
  {
    this.BR = paramInt;
    this.Ui = paramString;
  }

  public ah(String paramString)
  {
    this(3, paramString);
  }

  public int describeContents()
  {
    return 0;
  }

  public String getDeviceAddress()
  {
    return this.Ui;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.Ui;
    return String.format("UnclaimBleDeviceRequest{%s}", arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ai.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.ah
 * JD-Core Version:    0.6.2
 */