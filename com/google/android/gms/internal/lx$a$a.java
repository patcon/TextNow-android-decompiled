package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.a;
import com.google.android.gms.location.c;
import com.google.android.gms.location.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

class lx$a$a
  implements lx
{
  private IBinder lb;

  lx$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(long paramLong, boolean paramBoolean, PendingIntent paramPendingIntent)
  {
    int i = 1;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      localParcel1.writeLong(paramLong);
      if (paramBoolean)
      {
        localParcel1.writeInt(i);
        if (paramPendingIntent == null)
          break label94;
        localParcel1.writeInt(1);
        paramPendingIntent.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(5, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        i = 0;
        break;
        label94: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramPendingIntent != null)
      {
        localParcel1.writeInt(1);
        paramPendingIntent.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(11, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(PendingIntent paramPendingIntent, lw paramlw, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramPendingIntent != null)
        {
          localParcel1.writeInt(1);
          paramPendingIntent.writeToParcel(localParcel1, 0);
          if (paramlw != null)
          {
            localIBinder = paramlw.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
            this.lb.transact(2, localParcel1, localParcel2, 0);
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

  public void a(Location paramLocation, int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramLocation != null)
      {
        localParcel1.writeInt(1);
        paramLocation.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeInt(paramInt);
        this.lb.transact(26, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(lw paramlw, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramlw != null);
      for (IBinder localIBinder = paramlw.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        this.lb.transact(4, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(ma paramma, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramma != null)
        {
          localParcel1.writeInt(1);
          paramma.writeToParcel(localParcel1, 0);
          if (paramPendingIntent != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            this.lb.transact(53, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
    }
  }

  public void a(ma paramma, a parama)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramma != null)
        {
          localParcel1.writeInt(1);
          paramma.writeToParcel(localParcel1, 0);
          if (parama != null)
          {
            localIBinder = parama.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.lb.transact(52, localParcel1, localParcel2, 0);
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

  public void a(mh parammh, mx parammx, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (parammh != null)
        {
          localParcel1.writeInt(1);
          parammh.writeToParcel(localParcel1, 0);
          if (parammx != null)
          {
            localParcel1.writeInt(1);
            parammx.writeToParcel(localParcel1, 0);
            if (paramPendingIntent == null)
              break label134;
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            this.lb.transact(48, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
      continue;
      label134: localParcel1.writeInt(0);
    }
  }

  public void a(mj parammj, mx parammx, mv parammv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (parammj != null)
        {
          localParcel1.writeInt(1);
          parammj.writeToParcel(localParcel1, 0);
          if (parammx != null)
          {
            localParcel1.writeInt(1);
            parammx.writeToParcel(localParcel1, 0);
            if (parammv == null)
              break label136;
            localIBinder = parammv.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.lb.transact(17, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
      continue;
      label136: IBinder localIBinder = null;
    }
  }

  public void a(ml paramml, mx parammx)
  {
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramml != null)
        {
          localParcel.writeInt(1);
          paramml.writeToParcel(localParcel, 0);
          if (parammx != null)
          {
            localParcel.writeInt(1);
            parammx.writeToParcel(localParcel, 0);
            this.lb.transact(25, localParcel, null, 1);
          }
        }
        else
        {
          localParcel.writeInt(0);
          continue;
        }
      }
      finally
      {
        localParcel.recycle();
      }
      localParcel.writeInt(0);
    }
  }

  public void a(mn parammn, mx parammx, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (parammn != null)
        {
          localParcel1.writeInt(1);
          parammn.writeToParcel(localParcel1, 0);
          if (parammx != null)
          {
            localParcel1.writeInt(1);
            parammx.writeToParcel(localParcel1, 0);
            if (paramPendingIntent == null)
              break label134;
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            this.lb.transact(18, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
      continue;
      label134: localParcel1.writeInt(0);
    }
  }

  public void a(mr parammr, mx parammx, mv parammv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (parammr != null)
        {
          localParcel1.writeInt(1);
          parammr.writeToParcel(localParcel1, 0);
          if (parammx != null)
          {
            localParcel1.writeInt(1);
            parammx.writeToParcel(localParcel1, 0);
            if (parammv == null)
              break label136;
            localIBinder = parammv.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.lb.transact(46, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
      continue;
      label136: IBinder localIBinder = null;
    }
  }

  public void a(mt parammt, LatLngBounds paramLatLngBounds, List<String> paramList, mx parammx, mv parammv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (parammt != null)
        {
          localParcel1.writeInt(1);
          parammt.writeToParcel(localParcel1, 0);
          if (paramLatLngBounds != null)
          {
            localParcel1.writeInt(1);
            paramLatLngBounds.writeToParcel(localParcel1, 0);
            localParcel1.writeStringList(paramList);
            if (parammx == null)
              break label163;
            localParcel1.writeInt(1);
            parammx.writeToParcel(localParcel1, 0);
            if (parammv == null)
              break label172;
            localIBinder = parammv.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.lb.transact(50, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
      continue;
      label163: localParcel1.writeInt(0);
      continue;
      label172: IBinder localIBinder = null;
    }
  }

  public void a(mx parammx, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (parammx != null)
        {
          localParcel1.writeInt(1);
          parammx.writeToParcel(localParcel1, 0);
          if (paramPendingIntent != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
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
      localParcel1.writeInt(0);
    }
  }

  public void a(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramLocationRequest != null)
        {
          localParcel1.writeInt(1);
          paramLocationRequest.writeToParcel(localParcel1, 0);
          if (paramPendingIntent != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            this.lb.transact(9, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
    }
  }

  public void a(LocationRequest paramLocationRequest, a parama)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramLocationRequest != null)
        {
          localParcel1.writeInt(1);
          paramLocationRequest.writeToParcel(localParcel1, 0);
          if (parama != null)
          {
            localIBinder = parama.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.lb.transact(8, localParcel1, localParcel2, 0);
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

  public void a(LocationRequest paramLocationRequest, a parama, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramLocationRequest != null)
        {
          localParcel1.writeInt(1);
          paramLocationRequest.writeToParcel(localParcel1, 0);
          if (parama != null)
          {
            localIBinder = parama.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
            this.lb.transact(20, localParcel1, localParcel2, 0);
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

  public void a(a parama)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (parama != null);
      for (IBinder localIBinder = parama.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.lb.transact(10, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(LatLng paramLatLng, mj parammj, mx parammx, mv parammv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramLatLng != null)
        {
          localParcel1.writeInt(1);
          paramLatLng.writeToParcel(localParcel1, 0);
          if (parammj != null)
          {
            localParcel1.writeInt(1);
            parammj.writeToParcel(localParcel1, 0);
            if (parammx == null)
              break label155;
            localParcel1.writeInt(1);
            parammx.writeToParcel(localParcel1, 0);
            if (parammv == null)
              break label164;
            localIBinder = parammv.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.lb.transact(16, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
      continue;
      label155: localParcel1.writeInt(0);
      continue;
      label164: IBinder localIBinder = null;
    }
  }

  public void a(LatLngBounds paramLatLngBounds, int paramInt, mj parammj, mx parammx, mv parammv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramLatLngBounds != null)
        {
          localParcel1.writeInt(1);
          paramLatLngBounds.writeToParcel(localParcel1, 0);
          localParcel1.writeInt(paramInt);
          if (parammj != null)
          {
            localParcel1.writeInt(1);
            parammj.writeToParcel(localParcel1, 0);
            if (parammx == null)
              break label163;
            localParcel1.writeInt(1);
            parammx.writeToParcel(localParcel1, 0);
            if (parammv == null)
              break label172;
            localIBinder = parammv.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.lb.transact(14, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
      continue;
      label163: localParcel1.writeInt(0);
      continue;
      label172: IBinder localIBinder = null;
    }
  }

  public void a(LatLngBounds paramLatLngBounds, int paramInt, String paramString, mj parammj, mx parammx, mv parammv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramLatLngBounds != null)
        {
          localParcel1.writeInt(1);
          paramLatLngBounds.writeToParcel(localParcel1, 0);
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString);
          if (parammj != null)
          {
            localParcel1.writeInt(1);
            parammj.writeToParcel(localParcel1, 0);
            if (parammx == null)
              break label171;
            localParcel1.writeInt(1);
            parammx.writeToParcel(localParcel1, 0);
            if (parammv == null)
              break label180;
            localIBinder = parammv.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.lb.transact(47, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
      continue;
      label171: localParcel1.writeInt(0);
      continue;
      label180: IBinder localIBinder = null;
    }
  }

  public void a(String paramString, mx parammx, mv parammv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        localParcel1.writeString(paramString);
        if (parammx != null)
        {
          localParcel1.writeInt(1);
          parammx.writeToParcel(localParcel1, 0);
          if (parammv != null)
          {
            localIBinder = parammv.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.lb.transact(15, localParcel1, localParcel2, 0);
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

  public void a(String paramString, LatLngBounds paramLatLngBounds, mf parammf, mx parammx, mv parammv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        localParcel1.writeString(paramString);
        if (paramLatLngBounds != null)
        {
          localParcel1.writeInt(1);
          paramLatLngBounds.writeToParcel(localParcel1, 0);
          if (parammf != null)
          {
            localParcel1.writeInt(1);
            parammf.writeToParcel(localParcel1, 0);
            if (parammx == null)
              break label163;
            localParcel1.writeInt(1);
            parammx.writeToParcel(localParcel1, 0);
            if (parammv == null)
              break label172;
            localIBinder = parammv.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.lb.transact(55, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
      continue;
      label163: localParcel1.writeInt(0);
      continue;
      label172: IBinder localIBinder = null;
    }
  }

  public void a(List<mc> paramList, PendingIntent paramPendingIntent, lw paramlw, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        localParcel1.writeTypedList(paramList);
        if (paramPendingIntent != null)
        {
          localParcel1.writeInt(1);
          paramPendingIntent.writeToParcel(localParcel1, 0);
          if (paramlw != null)
          {
            localIBinder = paramlw.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
            this.lb.transact(1, localParcel1, localParcel2, 0);
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

  public void a(String[] paramArrayOfString, lw paramlw, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      localParcel1.writeStringArray(paramArrayOfString);
      if (paramlw != null);
      for (IBinder localIBinder = paramlw.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        this.lb.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public IBinder asBinder()
  {
    return this.lb;
  }

  public void b(mx parammx, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (parammx != null)
        {
          localParcel1.writeInt(1);
          parammx.writeToParcel(localParcel1, 0);
          if (paramPendingIntent != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            this.lb.transact(49, localParcel1, localParcel2, 0);
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
      localParcel1.writeInt(0);
    }
  }

  public void b(String paramString, mx parammx, mv parammv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        localParcel1.writeString(paramString);
        if (parammx != null)
        {
          localParcel1.writeInt(1);
          parammx.writeToParcel(localParcel1, 0);
          if (parammv != null)
          {
            localIBinder = parammv.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.lb.transact(42, localParcel1, localParcel2, 0);
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

  public Location bW(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      localParcel1.writeString(paramString);
      this.lb.transact(21, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        localLocation = (Location)Location.CREATOR.createFromParcel(localParcel2);
        return localLocation;
      }
      Location localLocation = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public c bX(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      localParcel1.writeString(paramString);
      this.lb.transact(34, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        c localc2 = c.CREATOR.ct(localParcel2);
        localc1 = localc2;
        return localc1;
      }
      c localc1 = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public Location lV()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      this.lb.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        localLocation = (Location)Location.CREATOR.createFromParcel(localParcel2);
        return localLocation;
      }
      Location localLocation = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public IBinder lW()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      this.lb.transact(51, localParcel1, localParcel2, 0);
      localParcel2.readException();
      IBinder localIBinder = localParcel2.readStrongBinder();
      return localIBinder;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public IBinder lX()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      this.lb.transact(54, localParcel1, localParcel2, 0);
      localParcel2.readException();
      IBinder localIBinder = localParcel2.readStrongBinder();
      return localIBinder;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void removeActivityUpdates(PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramPendingIntent != null)
      {
        localParcel1.writeInt(1);
        paramPendingIntent.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void setMockLocation(Location paramLocation)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramLocation != null)
      {
        localParcel1.writeInt(1);
        paramLocation.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(13, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void setMockMode(boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int i = 0;
      if (paramBoolean)
        i = 1;
      localParcel1.writeInt(i);
      this.lb.transact(12, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lx.a.a
 * JD-Core Version:    0.6.2
 */