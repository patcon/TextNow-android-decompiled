package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

public abstract class ae$a extends Binder
  implements ae
{
  public ae$a()
  {
    attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
  }

  public static ae bS(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
    if ((localIInterface != null) && ((localIInterface instanceof ae)))
      return (ae)localIInterface;
    return new ae.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.wearable.internal.IWearableListener");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
      int m = paramParcel1.readInt();
      DataHolder localDataHolder = null;
      if (m != 0)
        localDataHolder = DataHolder.CREATOR.z(paramParcel1);
      Z(localDataHolder);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
      int k = paramParcel1.readInt();
      ah localah = null;
      if (k != 0)
        localah = (ah)ah.CREATOR.createFromParcel(paramParcel1);
      a(localah);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
      int j = paramParcel1.readInt();
      ak localak2 = null;
      if (j != 0)
        localak2 = (ak)ak.CREATOR.createFromParcel(paramParcel1);
      a(localak2);
      return true;
    case 4:
    }
    paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
    int i = paramParcel1.readInt();
    ak localak1 = null;
    if (i != 0)
      localak1 = (ak)ak.CREATOR.createFromParcel(paramParcel1);
    b(localak1);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ae.a
 * JD-Core Version:    0.6.2
 */