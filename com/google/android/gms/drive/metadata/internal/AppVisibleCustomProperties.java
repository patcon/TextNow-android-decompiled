package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class AppVisibleCustomProperties
  implements SafeParcelable, Iterable<CustomProperty>
{
  public static final Parcelable.Creator<AppVisibleCustomProperties> CREATOR = new a();
  public static final AppVisibleCustomProperties PG = new AppVisibleCustomProperties.a().im();
  final int BR;
  final List<CustomProperty> PH;

  AppVisibleCustomProperties(int paramInt, Collection<CustomProperty> paramCollection)
  {
    this.BR = paramInt;
    o.i(paramCollection);
    this.PH = new ArrayList(paramCollection);
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
    return this.PH.iterator();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties
 * JD-Core Version:    0.6.2
 */