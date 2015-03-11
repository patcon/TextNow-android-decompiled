package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.d;

public abstract class ot$a extends Binder
  implements ot
{
  public static ot bL(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
    if ((localIInterface != null) && ((localIInterface instanceof ot)))
      return (ot)localIInterface;
    return new ot.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.wallet.internal.IOwService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
      MaskedWalletRequest localMaskedWalletRequest2;
      if (paramParcel1.readInt() != 0)
      {
        localMaskedWalletRequest2 = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label181;
      }
      for (Bundle localBundle9 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle9 = null)
      {
        a(localMaskedWalletRequest2, localBundle9, ow.a.bO(paramParcel1.readStrongBinder()));
        return true;
        localMaskedWalletRequest2 = null;
        break;
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
      FullWalletRequest localFullWalletRequest;
      if (paramParcel1.readInt() != 0)
      {
        localFullWalletRequest = (FullWalletRequest)FullWalletRequest.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label258;
      }
      for (Bundle localBundle8 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle8 = null)
      {
        a(localFullWalletRequest, localBundle8, ow.a.bO(paramParcel1.readStrongBinder()));
        return true;
        localFullWalletRequest = null;
        break;
      }
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle7 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle7 = null)
      {
        a(str1, str2, localBundle7, ow.a.bO(paramParcel1.readStrongBinder()));
        return true;
      }
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
      NotifyTransactionStatusRequest localNotifyTransactionStatusRequest;
      if (paramParcel1.readInt() != 0)
      {
        localNotifyTransactionStatusRequest = (NotifyTransactionStatusRequest)NotifyTransactionStatusRequest.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label392;
      }
      for (Bundle localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle6 = null)
      {
        a(localNotifyTransactionStatusRequest, localBundle6);
        return true;
        localNotifyTransactionStatusRequest = null;
        break;
      }
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle5 = null)
      {
        a(localBundle5, ow.a.bO(paramParcel1.readStrongBinder()));
        return true;
      }
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
      d locald;
      if (paramParcel1.readInt() != 0)
      {
        locald = (d)d.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label517;
      }
      for (Bundle localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle4 = null)
      {
        a(locald, localBundle4, ow.a.bO(paramParcel1.readStrongBinder()));
        return true;
        locald = null;
        break;
      }
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
      MaskedWalletRequest localMaskedWalletRequest1;
      if (paramParcel1.readInt() != 0)
      {
        localMaskedWalletRequest1 = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label594;
      }
      for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle3 = null)
      {
        a(localMaskedWalletRequest1, localBundle3, ov.a.bN(paramParcel1.readStrongBinder()));
        return true;
        localMaskedWalletRequest1 = null;
        break;
      }
    case 8:
      label181: label594: paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
      label258: label392: on localon;
      label517: if (paramParcel1.readInt() != 0)
      {
        localon = (on)on.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label671;
      }
      label671: for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle2 = null)
      {
        a(localon, localBundle2, ow.a.bO(paramParcel1.readStrongBinder()));
        return true;
        localon = null;
        break;
      }
    case 9:
    }
    paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
    if (paramParcel1.readInt() != 0);
    for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle1 = null)
    {
      p(localBundle1);
      return true;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ot.a
 * JD-Core Version:    0.6.2
 */