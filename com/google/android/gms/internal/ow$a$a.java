package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

class ow$a$a
  implements ow
{
  private IBinder lb;

  ow$a$a(IBinder paramIBinder)
  {
    this.lb = paramIBinder;
  }

  public void a(int paramInt, FullWallet paramFullWallet, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        localParcel1.writeInt(paramInt);
        if (paramFullWallet != null)
        {
          localParcel1.writeInt(1);
          paramFullWallet.writeToParcel(localParcel1, 0);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
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
      localParcel1.writeInt(0);
    }
  }

  public void a(int paramInt, MaskedWallet paramMaskedWallet, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        localParcel1.writeInt(paramInt);
        if (paramMaskedWallet != null)
        {
          localParcel1.writeInt(1);
          paramMaskedWallet.writeToParcel(localParcel1, 0);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
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
      localParcel1.writeInt(0);
    }
  }

  public void a(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    int i = 1;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
      localParcel1.writeInt(paramInt);
      if (paramBoolean)
      {
        localParcel1.writeInt(i);
        if (paramBundle == null)
          break label92;
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
      }
      while (true)
      {
        this.lb.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        i = 0;
        break;
        label92: localParcel1.writeInt(0);
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public void a(Status paramStatus, op paramop, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        if (paramStatus != null)
        {
          localParcel1.writeInt(1);
          paramStatus.writeToParcel(localParcel1, 0);
          if (paramop != null)
          {
            localParcel1.writeInt(1);
            paramop.writeToParcel(localParcel1, 0);
            if (paramBundle == null)
              break label133;
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
            this.lb.transact(5, localParcel1, localParcel2, 0);
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
      label133: localParcel1.writeInt(0);
    }
  }

  public IBinder asBinder()
  {
    return this.lb;
  }

  public void i(int paramInt, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
      localParcel1.writeInt(paramInt);
      if (paramBundle != null)
      {
        localParcel1.writeInt(1);
        paramBundle.writeToParcel(localParcel1, 0);
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ow.a.a
 * JD-Core Version:    0.6.2
 */