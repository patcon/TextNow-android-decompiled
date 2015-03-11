package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;

public abstract class lk$a extends Binder
  implements lk
{
  public lk$a()
  {
    attachInterface(this, "com.google.android.gms.fitness.internal.service.IFitnessSensorService");
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
      paramParcel2.writeString("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
      int k = paramParcel1.readInt();
      lg locallg = null;
      if (k != 0)
        locallg = (lg)lg.CREATOR.createFromParcel(paramParcel1);
      a(locallg, kn.a.aq(paramParcel1.readStrongBinder()));
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
      int j = paramParcel1.readInt();
      FitnessSensorServiceRequest localFitnessSensorServiceRequest = null;
      if (j != 0)
        localFitnessSensorServiceRequest = (FitnessSensorServiceRequest)FitnessSensorServiceRequest.CREATOR.createFromParcel(paramParcel1);
      a(localFitnessSensorServiceRequest, kt.a.aw(paramParcel1.readStrongBinder()));
      return true;
    case 3:
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
    int i = paramParcel1.readInt();
    li localli = null;
    if (i != 0)
      localli = (li)li.CREATOR.createFromParcel(paramParcel1);
    a(localli, kt.a.aw(paramParcel1.readStrongBinder()));
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lk.a
 * JD-Core Version:    0.6.2
 */