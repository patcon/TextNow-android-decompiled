package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;

public abstract class hw$a extends Binder
  implements hw
{
  public hw$a()
  {
    attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
  }

  public static hw G(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof hw)))
      return (hw)localIInterface;
    return new hw.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
      int m = paramParcel1.readInt();
      Status localStatus3 = null;
      if (m != 0)
        localStatus3 = Status.CREATOR.createFromParcel(paramParcel1);
      a(localStatus3);
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
      if (paramParcel1.readInt() != 0);
      for (Status localStatus2 = Status.CREATOR.createFromParcel(paramParcel1); ; localStatus2 = null)
      {
        int k = paramParcel1.readInt();
        ParcelFileDescriptor localParcelFileDescriptor = null;
        if (k != 0)
          localParcelFileDescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1);
        a(localStatus2, localParcelFileDescriptor);
        return true;
      }
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
      int j = paramParcel1.readInt();
      Status localStatus1 = null;
      if (j != 0)
        localStatus1 = Status.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() != 0);
      for (boolean bool = true; ; bool = false)
      {
        a(localStatus1, bool);
        return true;
      }
    case 4:
    }
    paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    int i = paramParcel1.readInt();
    hm.b localb = null;
    if (i != 0)
      localb = hm.b.CREATOR.q(paramParcel1);
    a(localb);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hw.a
 * JD-Core Version:    0.6.2
 */