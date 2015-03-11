package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.a;
import com.google.android.gms.location.b;
import com.google.android.gms.location.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

class je$a$a
  implements je
{
  private IBinder kq;

  je$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
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
        this.kq.transact(5, localParcel1, localParcel2, 0);
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
        this.kq.transact(11, localParcel1, localParcel2, 0);
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

  public void a(PendingIntent paramPendingIntent, jd paramjd, String paramString)
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
          if (paramjd != null)
          {
            localIBinder = paramjd.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
            this.kq.transact(2, localParcel1, localParcel2, 0);
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
        this.kq.transact(26, localParcel1, localParcel2, 0);
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

  public void a(jd paramjd, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramjd != null);
      for (IBinder localIBinder = paramjd.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        this.kq.transact(4, localParcel1, localParcel2, 0);
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

  public void a(jk paramjk, ka paramka, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramjk != null)
        {
          localParcel1.writeInt(1);
          paramjk.writeToParcel(localParcel1, 0);
          if (paramka != null)
          {
            localParcel1.writeInt(1);
            paramka.writeToParcel(localParcel1, 0);
            if (paramPendingIntent == null)
              break label134;
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            this.kq.transact(48, localParcel1, localParcel2, 0);
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

  public void a(jm paramjm, ka paramka, jy paramjy)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramjm != null)
        {
          localParcel1.writeInt(1);
          paramjm.writeToParcel(localParcel1, 0);
          if (paramka != null)
          {
            localParcel1.writeInt(1);
            paramka.writeToParcel(localParcel1, 0);
            if (paramjy == null)
              break label136;
            localIBinder = paramjy.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.kq.transact(17, localParcel1, localParcel2, 0);
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

  public void a(jo paramjo, ka paramka)
  {
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramjo != null)
        {
          localParcel.writeInt(1);
          paramjo.writeToParcel(localParcel, 0);
          if (paramka != null)
          {
            localParcel.writeInt(1);
            paramka.writeToParcel(localParcel, 0);
            this.kq.transact(25, localParcel, null, 1);
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

  public void a(jq paramjq, ka paramka, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramjq != null)
        {
          localParcel1.writeInt(1);
          paramjq.writeToParcel(localParcel1, 0);
          if (paramka != null)
          {
            localParcel1.writeInt(1);
            paramka.writeToParcel(localParcel1, 0);
            if (paramPendingIntent == null)
              break label134;
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            this.kq.transact(18, localParcel1, localParcel2, 0);
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

  public void a(ju paramju, ka paramka, jy paramjy)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramju != null)
        {
          localParcel1.writeInt(1);
          paramju.writeToParcel(localParcel1, 0);
          if (paramka != null)
          {
            localParcel1.writeInt(1);
            paramka.writeToParcel(localParcel1, 0);
            if (paramjy == null)
              break label136;
            localIBinder = paramjy.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.kq.transact(46, localParcel1, localParcel2, 0);
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

  public void a(ka paramka, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramka != null)
        {
          localParcel1.writeInt(1);
          paramka.writeToParcel(localParcel1, 0);
          if (paramPendingIntent != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            this.kq.transact(19, localParcel1, localParcel2, 0);
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
            this.kq.transact(9, localParcel1, localParcel2, 0);
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
            this.kq.transact(8, localParcel1, localParcel2, 0);
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
            this.kq.transact(20, localParcel1, localParcel2, 0);
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
        this.kq.transact(10, localParcel1, localParcel2, 0);
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

  public void a(LatLng paramLatLng, jm paramjm, ka paramka, jy paramjy)
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
          if (paramjm != null)
          {
            localParcel1.writeInt(1);
            paramjm.writeToParcel(localParcel1, 0);
            if (paramka == null)
              break label155;
            localParcel1.writeInt(1);
            paramka.writeToParcel(localParcel1, 0);
            if (paramjy == null)
              break label164;
            localIBinder = paramjy.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.kq.transact(16, localParcel1, localParcel2, 0);
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

  public void a(LatLngBounds paramLatLngBounds, int paramInt, jm paramjm, ka paramka, jy paramjy)
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
          if (paramjm != null)
          {
            localParcel1.writeInt(1);
            paramjm.writeToParcel(localParcel1, 0);
            if (paramka == null)
              break label163;
            localParcel1.writeInt(1);
            paramka.writeToParcel(localParcel1, 0);
            if (paramjy == null)
              break label172;
            localIBinder = paramjy.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.kq.transact(14, localParcel1, localParcel2, 0);
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

  public void a(LatLngBounds paramLatLngBounds, int paramInt, String paramString, jm paramjm, ka paramka, jy paramjy)
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
          if (paramjm != null)
          {
            localParcel1.writeInt(1);
            paramjm.writeToParcel(localParcel1, 0);
            if (paramka == null)
              break label171;
            localParcel1.writeInt(1);
            paramka.writeToParcel(localParcel1, 0);
            if (paramjy == null)
              break label180;
            localIBinder = paramjy.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.kq.transact(47, localParcel1, localParcel2, 0);
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

  public void a(String paramString, ka paramka, jy paramjy)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        localParcel1.writeString(paramString);
        if (paramka != null)
        {
          localParcel1.writeInt(1);
          paramka.writeToParcel(localParcel1, 0);
          if (paramjy != null)
          {
            localIBinder = paramjy.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.kq.transact(15, localParcel1, localParcel2, 0);
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

  public void a(String paramString, LatLngBounds paramLatLngBounds, jm paramjm, ka paramka, jy paramjy)
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
          if (paramjm != null)
          {
            localParcel1.writeInt(1);
            paramjm.writeToParcel(localParcel1, 0);
            if (paramka == null)
              break label163;
            localParcel1.writeInt(1);
            paramka.writeToParcel(localParcel1, 0);
            if (paramjy == null)
              break label172;
            localIBinder = paramjy.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.kq.transact(45, localParcel1, localParcel2, 0);
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

  public void a(String paramString, List<String> paramList, List<jw> paramList1, ka paramka, jy paramjy)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        localParcel1.writeString(paramString);
        localParcel1.writeStringList(paramList);
        localParcel1.writeTypedList(paramList1);
        if (paramka != null)
        {
          localParcel1.writeInt(1);
          paramka.writeToParcel(localParcel1, 0);
          if (paramjy != null)
          {
            localIBinder = paramjy.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.kq.transact(50, localParcel1, localParcel2, 0);
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

  public void a(List<jh> paramList, PendingIntent paramPendingIntent, jd paramjd, String paramString)
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
          if (paramjd != null)
          {
            localIBinder = paramjd.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
            this.kq.transact(1, localParcel1, localParcel2, 0);
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

  public void a(String[] paramArrayOfString, jd paramjd, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      localParcel1.writeStringArray(paramArrayOfString);
      if (paramjd != null);
      for (IBinder localIBinder = paramjd.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        this.kq.transact(3, localParcel1, localParcel2, 0);
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
    return this.kq;
  }

  public void b(ka paramka, PendingIntent paramPendingIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramka != null)
        {
          localParcel1.writeInt(1);
          paramka.writeToParcel(localParcel1, 0);
          if (paramPendingIntent != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            this.kq.transact(49, localParcel1, localParcel2, 0);
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

  public void b(String paramString, ka paramka, jy paramjy)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        localParcel1.writeString(paramString);
        if (paramka != null)
        {
          localParcel1.writeInt(1);
          paramka.writeToParcel(localParcel1, 0);
          if (paramjy != null)
          {
            localIBinder = paramjy.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            this.kq.transact(42, localParcel1, localParcel2, 0);
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

  public Location bo(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      localParcel1.writeString(paramString);
      this.kq.transact(21, localParcel1, localParcel2, 0);
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

  public b bp(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      localParcel1.writeString(paramString);
      this.kq.transact(34, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        b localb2 = b.CREATOR.bs(localParcel2);
        localb1 = localb2;
        return localb1;
      }
      b localb1 = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public Location iW()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      this.kq.transact(7, localParcel1, localParcel2, 0);
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

  public IBinder iX()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      this.kq.transact(51, localParcel1, localParcel2, 0);
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
        this.kq.transact(6, localParcel1, localParcel2, 0);
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
        this.kq.transact(13, localParcel1, localParcel2, 0);
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
      this.kq.transact(12, localParcel1, localParcel2, 0);
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.je.a.a
 * JD-Core Version:    0.6.2
 */