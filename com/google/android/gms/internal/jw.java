package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class jw
  implements SafeParcelable
{
  public static final jx CREATOR = new jx();
  public static final jw YP = w("test_type", 1);
  public static final jw YQ = w("saved_offers", 4);
  public static final Set<jw> YR;
  final int YS;
  final String qX;
  final int xM;

  static
  {
    jw[] arrayOfjw = new jw[2];
    arrayOfjw[0] = YP;
    arrayOfjw[1] = YQ;
    YR = Collections.unmodifiableSet(new HashSet(Arrays.asList(arrayOfjw)));
  }

  jw(int paramInt1, String paramString, int paramInt2)
  {
    hm.aE(paramString);
    this.xM = paramInt1;
    this.qX = paramString;
    this.YS = paramInt2;
  }

  private static jw w(String paramString, int paramInt)
  {
    return new jw(0, paramString, paramInt);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    jw localjw;
    do
    {
      return true;
      if (!(paramObject instanceof jw))
        return false;
      localjw = (jw)paramObject;
    }
    while ((this.qX.equals(localjw.qX)) && (this.YS == localjw.YS));
    return false;
  }

  public final int hashCode()
  {
    return this.qX.hashCode();
  }

  public final String toString()
  {
    return this.qX;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    jx.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jw
 * JD-Core Version:    0.6.2
 */