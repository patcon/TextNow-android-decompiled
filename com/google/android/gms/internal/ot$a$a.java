package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.d;

class ot$a$a
  implements ot
{
  private IBinder lb;

  ot$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(Bundle paramBundle, ow paramow)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramow != null)
          localIBinder = paramow.asBinder();
        localParcel.writeStrongBinder(localIBinder);
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

  public void a(on paramon, Bundle paramBundle, ow paramow)
  {
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (paramon != null)
        {
          localParcel.writeInt(1);
          paramon.writeToParcel(localParcel, 0);
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
            IBinder localIBinder = null;
            if (paramow != null)
              localIBinder = paramow.asBinder();
            localParcel.writeStrongBinder(localIBinder);
            this.lb.transact(8, localParcel, null, 1);
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

  public void a(FullWalletRequest paramFullWalletRequest, Bundle paramBundle, ow paramow)
  {
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (paramFullWalletRequest != null)
        {
          localParcel.writeInt(1);
          paramFullWalletRequest.writeToParcel(localParcel, 0);
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
            IBinder localIBinder = null;
            if (paramow != null)
              localIBinder = paramow.asBinder();
            localParcel.writeStrongBinder(localIBinder);
            this.lb.transact(2, localParcel, null, 1);
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

  public void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, ov paramov)
  {
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (paramMaskedWalletRequest != null)
        {
          localParcel.writeInt(1);
          paramMaskedWalletRequest.writeToParcel(localParcel, 0);
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
            IBinder localIBinder = null;
            if (paramov != null)
              localIBinder = paramov.asBinder();
            localParcel.writeStrongBinder(localIBinder);
            this.lb.transact(7, localParcel, null, 1);
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

  public void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, ow paramow)
  {
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (paramMaskedWalletRequest != null)
        {
          localParcel.writeInt(1);
          paramMaskedWalletRequest.writeToParcel(localParcel, 0);
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
            IBinder localIBinder = null;
            if (paramow != null)
              localIBinder = paramow.asBinder();
            localParcel.writeStrongBinder(localIBinder);
            this.lb.transact(1, localParcel, null, 1);
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

  public void a(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest, Bundle paramBundle)
  {
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (paramNotifyTransactionStatusRequest != null)
        {
          localParcel.writeInt(1);
          paramNotifyTransactionStatusRequest.writeToParcel(localParcel, 0);
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
            this.lb.transact(4, localParcel, null, 1);
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

  public void a(d paramd, Bundle paramBundle, ow paramow)
  {
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
        if (paramd != null)
        {
          localParcel.writeInt(1);
          paramd.writeToParcel(localParcel, 0);
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
            IBinder localIBinder = null;
            if (paramow != null)
              localIBinder = paramow.asBinder();
            localParcel.writeStrongBinder(localIBinder);
            this.lb.transact(6, localParcel, null, 1);
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

  public void a(String paramString1, String paramString2, Bundle paramBundle, ow paramow)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
      localParcel.writeString(paramString1);
      localParcel.writeString(paramString2);
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        IBinder localIBinder = null;
        if (paramow != null)
          localIBinder = paramow.asBinder();
        localParcel.writeStrongBinder(localIBinder);
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

  public IBinder asBinder()
  {
    return this.lb;
  }

  public void p(Bundle paramBundle)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
      if (paramBundle != null)
      {
        localParcel.writeInt(1);
        paramBundle.writeToParcel(localParcel, 0);
      }
      while (true)
      {
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ot.a.a
 * JD-Core Version:    0.6.2
 */