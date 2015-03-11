package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.aa;
import com.google.android.gms.fitness.request.ad;
import com.google.android.gms.fitness.request.af;
import com.google.android.gms.fitness.request.ah;
import com.google.android.gms.fitness.request.aj;
import com.google.android.gms.fitness.request.b;
import com.google.android.gms.fitness.request.e;
import com.google.android.gms.fitness.request.j;
import com.google.android.gms.fitness.request.m;
import com.google.android.gms.fitness.request.o;
import com.google.android.gms.fitness.request.q;
import com.google.android.gms.fitness.request.u;
import com.google.android.gms.fitness.request.w;
import com.google.android.gms.fitness.request.y;

public abstract class kp$a extends Binder
  implements kp
{
  public static kp as(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
    if ((localIInterface != null) && ((localIInterface instanceof kp)))
      return (kp)localIInterface;
    return new kp.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i16 = paramParcel1.readInt();
      DataSourcesRequest localDataSourcesRequest = null;
      if (i16 != 0)
        localDataSourcesRequest = (DataSourcesRequest)DataSourcesRequest.CREATOR.createFromParcel(paramParcel1);
      a(localDataSourcesRequest, kn.a.aq(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i15 = paramParcel1.readInt();
      o localo = null;
      if (i15 != 0)
        localo = (o)o.CREATOR.createFromParcel(paramParcel1);
      a(localo, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i14 = paramParcel1.readInt();
      q localq = null;
      if (i14 != 0)
        localq = (q)q.CREATOR.createFromParcel(paramParcel1);
      a(localq, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i13 = paramParcel1.readInt();
      af localaf = null;
      if (i13 != 0)
        localaf = (af)af.CREATOR.createFromParcel(paramParcel1);
      a(localaf, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i12 = paramParcel1.readInt();
      aj localaj = null;
      if (i12 != 0)
        localaj = (aj)aj.CREATOR.createFromParcel(paramParcel1);
      a(localaj, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i11 = paramParcel1.readInt();
      m localm = null;
      if (i11 != 0)
        localm = (m)m.CREATOR.createFromParcel(paramParcel1);
      a(localm, kq.a.at(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i10 = paramParcel1.readInt();
      e locale = null;
      if (i10 != 0)
        locale = (e)e.CREATOR.createFromParcel(paramParcel1);
      a(locale, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 19:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i9 = paramParcel1.readInt();
      DataDeleteRequest localDataDeleteRequest = null;
      if (i9 != 0)
        localDataDeleteRequest = (DataDeleteRequest)DataDeleteRequest.CREATOR.createFromParcel(paramParcel1);
      a(localDataDeleteRequest, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i8 = paramParcel1.readInt();
      DataTypeCreateRequest localDataTypeCreateRequest = null;
      if (i8 != 0)
        localDataTypeCreateRequest = (DataTypeCreateRequest)DataTypeCreateRequest.CREATOR.createFromParcel(paramParcel1);
      a(localDataTypeCreateRequest, ko.a.ar(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i7 = paramParcel1.readInt();
      j localj = null;
      if (i7 != 0)
        localj = (j)j.CREATOR.createFromParcel(paramParcel1);
      a(localj, ko.a.ar(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i6 = paramParcel1.readInt();
      DataReadRequest localDataReadRequest = null;
      if (i6 != 0)
        localDataReadRequest = (DataReadRequest)DataReadRequest.CREATOR.createFromParcel(paramParcel1);
      a(localDataReadRequest, km.a.ap(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i5 = paramParcel1.readInt();
      SessionInsertRequest localSessionInsertRequest = null;
      if (i5 != 0)
        localSessionInsertRequest = (SessionInsertRequest)SessionInsertRequest.CREATOR.createFromParcel(paramParcel1);
      a(localSessionInsertRequest, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i4 = paramParcel1.readInt();
      SessionReadRequest localSessionReadRequest = null;
      if (i4 != 0)
        localSessionReadRequest = (SessionReadRequest)SessionReadRequest.CREATOR.createFromParcel(paramParcel1);
      a(localSessionReadRequest, kr.a.au(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i3 = paramParcel1.readInt();
      w localw = null;
      if (i3 != 0)
        localw = (w)w.CREATOR.createFromParcel(paramParcel1);
      a(localw, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i2 = paramParcel1.readInt();
      y localy = null;
      if (i2 != 0)
        localy = (y)y.CREATOR.createFromParcel(paramParcel1);
      a(localy, ks.a.av(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 15:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i1 = paramParcel1.readInt();
      StartBleScanRequest localStartBleScanRequest = null;
      if (i1 != 0)
        localStartBleScanRequest = (StartBleScanRequest)StartBleScanRequest.CREATOR.createFromParcel(paramParcel1);
      a(localStartBleScanRequest, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 16:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int n = paramParcel1.readInt();
      ad localad = null;
      if (n != 0)
        localad = (ad)ad.CREATOR.createFromParcel(paramParcel1);
      a(localad, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 17:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int m = paramParcel1.readInt();
      b localb = null;
      if (m != 0)
        localb = (b)b.CREATOR.createFromParcel(paramParcel1);
      a(localb, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 18:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int k = paramParcel1.readInt();
      ah localah = null;
      if (k != 0)
        localah = (ah)ah.CREATOR.createFromParcel(paramParcel1);
      a(localah, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 20:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int j = paramParcel1.readInt();
      u localu = null;
      if (j != 0)
        localu = (u)u.CREATOR.createFromParcel(paramParcel1);
      a(localu, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 21:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      int i = paramParcel1.readInt();
      aa localaa = null;
      if (i != 0)
        localaa = (aa)aa.CREATOR.createFromParcel(paramParcel1);
      a(localaa, kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 22:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      a(kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 23:
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      b(kt.a.aw(paramParcel1.readStrongBinder()), paramParcel1.readString());
      return true;
    case 24:
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
    a(lf.a.ax(paramParcel1.readStrongBinder()), paramParcel1.readString());
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kp.a
 * JD-Core Version:    0.6.2
 */