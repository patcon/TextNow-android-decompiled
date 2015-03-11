package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
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

class kp$a$a
  implements kp
{
  private IBinder lb;

  kp$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(DataDeleteRequest paramDataDeleteRequest, kt paramkt, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
        if (paramDataDeleteRequest != null)
        {
          localParcel1.writeInt(1);
          paramDataDeleteRequest.writeToParcel(localParcel1, 0);
          if (paramkt != null)
          {
            localIBinder = paramkt.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
            this.lb.transact(19, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      IBinder localIBinder = null;
    }
  }

  public void a(DataReadRequest paramDataReadRequest, km paramkm, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramDataReadRequest != null)
      {
        localParcel.writeInt(1);
        paramDataReadRequest.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkm != null)
          localIBinder = paramkm.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(8, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(DataSourcesRequest paramDataSourcesRequest, kn paramkn, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramDataSourcesRequest != null)
      {
        localParcel.writeInt(1);
        paramDataSourcesRequest.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkn != null)
          localIBinder = paramkn.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(1, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(DataTypeCreateRequest paramDataTypeCreateRequest, ko paramko, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramDataTypeCreateRequest != null)
      {
        localParcel.writeInt(1);
        paramDataTypeCreateRequest.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramko != null)
          localIBinder = paramko.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(13, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(SessionInsertRequest paramSessionInsertRequest, kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramSessionInsertRequest != null)
      {
        localParcel.writeInt(1);
        paramSessionInsertRequest.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkt != null)
          localIBinder = paramkt.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(9, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(SessionReadRequest paramSessionReadRequest, kr paramkr, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramSessionReadRequest != null)
      {
        localParcel.writeInt(1);
        paramSessionReadRequest.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkr != null)
          localIBinder = paramkr.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(10, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(StartBleScanRequest paramStartBleScanRequest, kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramStartBleScanRequest != null)
      {
        localParcel.writeInt(1);
        paramStartBleScanRequest.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkt != null)
          localIBinder = paramkt.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(15, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(aa paramaa, kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramaa != null)
      {
        localParcel.writeInt(1);
        paramaa.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkt != null)
          localIBinder = paramkt.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(21, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(ad paramad, kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramad != null)
      {
        localParcel.writeInt(1);
        paramad.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkt != null)
          localIBinder = paramkt.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(16, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(af paramaf, kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramaf != null)
      {
        localParcel.writeInt(1);
        paramaf.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkt != null)
          localIBinder = paramkt.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(4, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(ah paramah, kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramah != null)
      {
        localParcel.writeInt(1);
        paramah.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkt != null)
          localIBinder = paramkt.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(18, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(aj paramaj, kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramaj != null)
      {
        localParcel.writeInt(1);
        paramaj.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkt != null)
          localIBinder = paramkt.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(5, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(b paramb, kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramb != null)
      {
        localParcel.writeInt(1);
        paramb.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkt != null)
          localIBinder = paramkt.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(17, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(e parame, kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (parame != null)
      {
        localParcel.writeInt(1);
        parame.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkt != null)
          localIBinder = paramkt.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(7, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(j paramj, ko paramko, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramj != null)
      {
        localParcel.writeInt(1);
        paramj.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramko != null)
          localIBinder = paramko.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(14, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(m paramm, kq paramkq, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramm != null)
      {
        localParcel.writeInt(1);
        paramm.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkq != null)
          localIBinder = paramkq.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(6, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(o paramo, kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramo != null)
      {
        localParcel.writeInt(1);
        paramo.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkt != null)
          localIBinder = paramkt.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(2, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(q paramq, kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramq != null)
      {
        localParcel.writeInt(1);
        paramq.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkt != null)
          localIBinder = paramkt.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(3, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(u paramu, kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramu != null)
      {
        localParcel.writeInt(1);
        paramu.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkt != null)
          localIBinder = paramkt.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(20, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(w paramw, kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramw != null)
      {
        localParcel.writeInt(1);
        paramw.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramkt != null)
          localIBinder = paramkt.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(11, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(y paramy, ks paramks, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      if (paramy != null)
      {
        localParcel.writeInt(1);
        paramy.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramks != null)
          localIBinder = paramks.asBinder();
        localParcel.writeStrongBinder(localIBinder);
        localParcel.writeString(paramString);
        this.lb.transact(12, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      IBinder localIBinder = null;
      if (paramkt != null)
        localIBinder = paramkt.asBinder();
      localParcel.writeStrongBinder(localIBinder);
      localParcel.writeString(paramString);
      this.lb.transact(22, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public void a(lf paramlf, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      IBinder localIBinder = null;
      if (paramlf != null)
        localIBinder = paramlf.asBinder();
      localParcel.writeStrongBinder(localIBinder);
      localParcel.writeString(paramString);
      this.lb.transact(24, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public IBinder asBinder()
  {
    return this.lb;
  }

  public void b(kt paramkt, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
      IBinder localIBinder = null;
      if (paramkt != null)
        localIBinder = paramkt.asBinder();
      localParcel.writeStrongBinder(localIBinder);
      localParcel.writeString(paramString);
      this.lb.transact(23, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kp.a.a
 * JD-Core Version:    0.6.2
 */