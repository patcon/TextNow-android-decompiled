package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

public abstract class kq$a extends Binder
  implements kq
{
  public kq$a()
  {
    attachInterface(this, "com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
  }

  public static kq at(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
    if ((localIInterface != null) && ((localIInterface instanceof kq)))
      return (kq)localIInterface;
    return new kq.a.a(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
    if (paramParcel1.readInt() != 0);
    for (ListSubscriptionsResult localListSubscriptionsResult = (ListSubscriptionsResult)ListSubscriptionsResult.CREATOR.createFromParcel(paramParcel1); ; localListSubscriptionsResult = null)
    {
      a(localListSubscriptionsResult);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kq.a
 * JD-Core Version:    0.6.2
 */