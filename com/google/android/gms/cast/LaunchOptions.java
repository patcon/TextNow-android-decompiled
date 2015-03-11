package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ik;
import java.util.Locale;

public class LaunchOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator<LaunchOptions> CREATOR = new c();
  private final int BR;
  private boolean Fb;
  private String Fc;

  public LaunchOptions()
  {
    this(1, false, ik.b(Locale.getDefault()));
  }

  LaunchOptions(int paramInt, boolean paramBoolean, String paramString)
  {
    this.BR = paramInt;
    this.Fb = paramBoolean;
    this.Fc = paramString;
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
    while ((this.Fb == localLaunchOptions.Fb) && (ik.a(this.Fc, localLaunchOptions.Fc)));
    return false;
  }

  public String getLanguage()
  {
    return this.Fc;
  }

  public boolean getRelaunchIfRunning()
  {
    return this.Fb;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(this.Fb);
    arrayOfObject[1] = this.Fc;
    return n.hashCode(arrayOfObject);
  }

  public void setLanguage(String paramString)
  {
    this.Fc = paramString;
  }

  public void setRelaunchIfRunning(boolean paramBoolean)
  {
    this.Fb = paramBoolean;
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(this.Fb);
    arrayOfObject[1] = this.Fc;
    return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.LaunchOptions
 * JD-Core Version:    0.6.2
 */