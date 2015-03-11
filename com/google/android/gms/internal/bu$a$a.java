package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;

class bu$a$a
  implements bu
{
  private IBinder kq;

  bu$a$a(IBinder paramIBinder)
  {
    this.kq = paramIBinder;
  }

  public void a(d paramd, ai paramai, String paramString, bv parambv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      IBinder localIBinder1;
      if (paramd != null)
      {
        localIBinder1 = paramd.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramai == null)
          break label121;
        localParcel1.writeInt(1);
        paramai.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString);
        IBinder localIBinder2 = null;
        if (parambv != null)
          localIBinder2 = parambv.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        this.kq.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder1 = null;
        break;
        label121: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(d paramd, ai paramai, String paramString1, String paramString2, bv parambv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      IBinder localIBinder1;
      if (paramd != null)
      {
        localIBinder1 = paramd.asBinder();
        localParcel1.writeStrongBinder(localIBinder1);
        if (paramai == null)
          break label129;
        localParcel1.writeInt(1);
        paramai.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        IBinder localIBinder2 = null;
        if (parambv != null)
          localIBinder2 = parambv.asBinder();
        localParcel1.writeStrongBinder(localIBinder2);
        this.kq.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        localIBinder1 = null;
        break;
        label129: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(d paramd, al paramal, ai paramai, String paramString, bv parambv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        IBinder localIBinder1;
        if (paramd != null)
        {
          localIBinder1 = paramd.asBinder();
          localParcel1.writeStrongBinder(localIBinder1);
          if (paramal != null)
          {
            localParcel1.writeInt(1);
            paramal.writeToParcel(localParcel1, 0);
            if (paramai == null)
              break label163;
            localParcel1.writeInt(1);
            paramai.writeToParcel(localParcel1, 0);
            localParcel1.writeString(paramString);
            IBinder localIBinder2 = null;
            if (parambv != null)
              localIBinder2 = parambv.asBinder();
            localParcel1.writeStrongBinder(localIBinder2);
            this.kq.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localIBinder1 = null;
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
      label163: localParcel1.writeInt(0);
    }
  }

  public void a(d paramd, al paramal, ai paramai, String paramString1, String paramString2, bv parambv)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        IBinder localIBinder1;
        if (paramd != null)
        {
          localIBinder1 = paramd.asBinder();
          localParcel1.writeStrongBinder(localIBinder1);
          if (paramal != null)
          {
            localParcel1.writeInt(1);
            paramal.writeToParcel(localParcel1, 0);
            if (paramai == null)
              break label171;
            localParcel1.writeInt(1);
            paramai.writeToParcel(localParcel1, 0);
            localParcel1.writeString(paramString1);
            localParcel1.writeString(paramString2);
            IBinder localIBinder2 = null;
            if (parambv != null)
              localIBinder2 = parambv.asBinder();
            localParcel1.writeStrongBinder(localIBinder2);
            this.kq.transact(6, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localIBinder1 = null;
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
      label171: localParcel1.writeInt(0);
    }
  }

  public IBinder asBinder()
  {
    return this.kq;
  }

  public void destroy()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.kq.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public d getView()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.kq.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      d locald = d.a.ag(localParcel2.readStrongBinder());
      return locald;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void pause()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.kq.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void resume()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.kq.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void showInterstitial()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      this.kq.transact(4, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.internal.bu.a.a
 * JD-Core Version:    0.6.2
 */