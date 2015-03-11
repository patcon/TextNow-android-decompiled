package com.google.android.gms.plus.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.j.a;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.jp;
import java.util.List;

class d$a$a
  implements d
{
  private IBinder lb;

  d$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public j a(b paramb, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      if (paramb != null);
      for (IBinder localIBinder = paramb.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt1);
        localParcel1.writeInt(paramInt2);
        localParcel1.writeInt(paramInt3);
        localParcel1.writeString(paramString);
        this.lb.transact(16, localParcel1, localParcel2, 0);
        localParcel2.readException();
        j localj = j.a.O(localParcel2.readStrongBinder());
        return localj;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(jp paramjp)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      if (paramjp != null)
      {
        localParcel1.writeInt(1);
        paramjp.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(4, localParcel1, localParcel2, 0);
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

  public void a(b paramb)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      if (paramb != null);
      for (IBinder localIBinder = paramb.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.lb.transact(8, localParcel1, localParcel2, 0);
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

  public void a(b paramb, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      IBinder localIBinder;
      if (paramb != null)
      {
        localIBinder = paramb.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        if (paramUri == null)
          break label120;
        localParcel1.writeInt(1);
        paramUri.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString2);
        localParcel1.writeString(paramString3);
        this.lb.transact(14, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label120: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(b paramb, Uri paramUri, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        IBinder localIBinder;
        if (paramb != null)
        {
          localIBinder = paramb.asBinder();
          localParcel1.writeStrongBinder(localIBinder);
          if (paramUri != null)
          {
            localParcel1.writeInt(1);
            paramUri.writeToParcel(localParcel1, 0);
            if (paramBundle == null)
              break label133;
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
            this.lb.transact(9, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localIBinder = null;
          continue;
        }
        localParcel1.writeInt(0);
        continue;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      label133: localParcel1.writeInt(0);
    }
  }

  public void a(b paramb, jp paramjp)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      IBinder localIBinder;
      if (paramb != null)
      {
        localIBinder = paramb.asBinder();
        localParcel1.writeStrongBinder(localIBinder);
        if (paramjp == null)
          break label85;
        localParcel1.writeInt(1);
        paramjp.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(45, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder = null;
        break;
        label85: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(b paramb, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      if (paramb != null);
      for (IBinder localIBinder = paramb.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        this.lb.transact(1, localParcel1, localParcel2, 0);
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

  public void a(b paramb, String paramString1, String paramString2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      if (paramb != null);
      for (IBinder localIBinder = paramb.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        this.lb.transact(2, localParcel1, localParcel2, 0);
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

  public void a(b paramb, List<String> paramList)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      if (paramb != null);
      for (IBinder localIBinder = paramb.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeStringList(paramList);
        this.lb.transact(34, localParcel1, localParcel2, 0);
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

  public void a(String paramString, jb paramjb1, jb paramjb2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
        localParcel1.writeString(paramString);
        if (paramjb1 != null)
        {
          localParcel1.writeInt(1);
          paramjb1.writeToParcel(localParcel1, 0);
          if (paramjb2 != null)
          {
            localParcel1.writeInt(1);
            paramjb2.writeToParcel(localParcel1, 0);
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
    }
  }

  public IBinder asBinder()
  {
    return this.lb;
  }

  public void b(b paramb)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      if (paramb != null);
      for (IBinder localIBinder = paramb.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        this.lb.transact(19, localParcel1, localParcel2, 0);
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

  public void b(b paramb, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      if (paramb != null);
      for (IBinder localIBinder = paramb.asBinder(); ; localIBinder = null)
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

  public void c(b paramb, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      if (paramb != null);
      for (IBinder localIBinder = paramb.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        this.lb.transact(18, localParcel1, localParcel2, 0);
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

  public void clearDefaultAccount()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      this.lb.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void d(b paramb, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      if (paramb != null);
      for (IBinder localIBinder = paramb.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        this.lb.transact(40, localParcel1, localParcel2, 0);
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

  public void e(b paramb, String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      if (paramb != null);
      for (IBinder localIBinder = paramb.asBinder(); ; localIBinder = null)
      {
        localParcel1.writeStrongBinder(localIBinder);
        localParcel1.writeString(paramString);
        this.lb.transact(44, localParcel1, localParcel2, 0);
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

  public String getAccountName()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      this.lb.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public String nb()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      this.lb.transact(41, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public boolean nc()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      this.lb.transact(42, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      boolean bool = false;
      if (i != 0)
        bool = true;
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public String nd()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      this.lb.transact(43, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void removeMoment(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
      localParcel1.writeString(paramString);
      this.lb.transact(17, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.plus.internal.d.a.a
 * JD-Core Version:    0.6.2
 */