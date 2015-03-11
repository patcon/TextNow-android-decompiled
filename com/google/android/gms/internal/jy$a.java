package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

public abstract class jy$a extends Binder
  implements jy
{
  public static jy au(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof jy)))
      return (jy)localIInterface;
    return new jy.a.a(paramIBinder);
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.location.places.internal.IPlacesCallbacks");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
      int k = paramParcel1.readInt();
      DataHolder localDataHolder3 = null;
      if (k != 0)
        localDataHolder3 = DataHolder.CREATOR.x(paramParcel1);
      V(localDataHolder3);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
      int j = paramParcel1.readInt();
      DataHolder localDataHolder2 = null;
      if (j != 0)
        localDataHolder2 = DataHolder.CREATOR.x(paramParcel1);
      W(localDataHolder2);
      return true;
    case 3:
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
    int i = paramParcel1.readInt();
    DataHolder localDataHolder1 = null;
    if (i != 0)
      localDataHolder1 = DataHolder.CREATOR.x(paramParcel1);
    X(localDataHolder1);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jy.a
 * JD-Core Version:    0.6.2
 */