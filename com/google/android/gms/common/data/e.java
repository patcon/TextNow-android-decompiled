package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class e<T extends SafeParcelable> extends DataBuffer<T>
{
  private static final String[] EE = { "data" };
  private final Parcelable.Creator<T> EF;

  public e(DataHolder paramDataHolder, Parcelable.Creator<T> paramCreator)
  {
    super(paramDataHolder);
    this.EF = paramCreator;
  }

  public T ad(int paramInt)
  {
    byte[] arrayOfByte = this.DG.f("data", paramInt, 0);
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(arrayOfByte, 0, arrayOfByte.length);
    localParcel.setDataPosition(0);
    SafeParcelable localSafeParcelable = (SafeParcelable)this.EF.createFromParcel(localParcel);
    localParcel.recycle();
    return localSafeParcelable;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.e
 * JD-Core Version:    0.6.2
 */