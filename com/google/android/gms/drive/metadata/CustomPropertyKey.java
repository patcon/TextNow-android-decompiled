package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomPropertyKey
  implements SafeParcelable
{
  public static final Parcelable.Creator<CustomPropertyKey> CREATOR = new c();
  private static final Pattern PF = Pattern.compile("[\\w.!@$%^&*()/-]+");
  final int BR;
  final String JO;
  final int mVisibility;

  CustomPropertyKey(int paramInt1, String paramString, int paramInt2)
  {
    o.b(paramString, "key");
    o.b(PF.matcher(paramString).matches(), "key name characters must be alphanumeric or one of .!@$%^&*()-_/");
    if ((paramInt2 == 0) || (paramInt2 == i));
    while (true)
    {
      o.b(i, "visibility must be either PUBLIC or PRIVATE");
      this.BR = paramInt1;
      this.JO = paramString;
      this.mVisibility = paramInt2;
      return;
      i = 0;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == null);
    CustomPropertyKey localCustomPropertyKey;
    do
    {
      do
      {
        return false;
        if (paramObject == this)
          return true;
      }
      while (!(paramObject instanceof CustomPropertyKey));
      localCustomPropertyKey = (CustomPropertyKey)paramObject;
    }
    while ((!localCustomPropertyKey.getKey().equals(this.JO)) || (localCustomPropertyKey.getVisibility() != this.mVisibility));
    return true;
  }

  public String getKey()
  {
    return this.JO;
  }

  public int getVisibility()
  {
    return this.mVisibility;
  }

  public int hashCode()
  {
    return (this.JO + this.mVisibility).hashCode();
  }

  public String toString()
  {
    return "CustomPropertyKey(" + this.JO + "," + this.mVisibility + ")";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.CustomPropertyKey
 * JD-Core Version:    0.6.2
 */