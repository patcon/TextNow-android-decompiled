package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class AppVisibleCustomProperties
  implements SafeParcelable, Iterable<CustomProperty>
{
  public static final Parcelable.Creator<AppVisibleCustomProperties> CREATOR = new a();
  public static final AppVisibleCustomProperties JN = new AppVisibleCustomProperties.a().gD();
  final List<CustomProperty> JO;
  final int xM;

  AppVisibleCustomProperties(int paramInt, Collection<CustomProperty> paramCollection)
  {
    this.xM = paramInt;
    hm.f(paramCollection);
    this.JO = new ArrayList(paramCollection);
  }

  private AppVisibleCustomProperties(Collection<CustomProperty> paramCollection)
  {
    this(1, paramCollection);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final Iterator<CustomProperty> iterator()
  {
    return this.JO.iterator();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties
 * JD-Core Version:    0.6.2
 */