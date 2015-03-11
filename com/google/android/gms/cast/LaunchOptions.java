package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.hk;
import java.util.Locale;

public class LaunchOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator<LaunchOptions> CREATOR = new c();
  private boolean Aq;
  private String Ar;
  private final int xM;

  public LaunchOptions()
  {
    this(1, false, gi.b(Locale.getDefault()));
  }

  LaunchOptions(int paramInt, boolean paramBoolean, String paramString)
  {
    this.xM = paramInt;
    this.Aq = paramBoolean;
    this.Ar = paramString;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    LaunchOptions localLaunchOptions;
    do
    {
      return true;
      if (!(paramObject instanceof LaunchOptions))
        return false;
      localLaunchOptions = (LaunchOptions)paramObject;
    }
    while ((this.Aq == localLaunchOptions.Aq) && (gi.a(this.Ar, localLaunchOptions.Ar)));
    return false;
  }

  public String getLanguage()
  {
    return this.Ar;
  }

  public boolean getRelaunchIfRunning()
  {
    return this.Aq;
  }

  int getVersionCode()
  {
    return this.xM;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(this.Aq);
    arrayOfObject[1] = this.Ar;
    return hk.hashCode(arrayOfObject);
  }

  public void setLanguage(String paramString)
  {
    this.Ar = paramString;
  }

  public void setRelaunchIfRunning(boolean paramBoolean)
  {
    this.Aq = paramBoolean;
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(this.Aq);
    arrayOfObject[1] = this.Ar;
    return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.LaunchOptions
 * JD-Core Version:    0.6.2
 */