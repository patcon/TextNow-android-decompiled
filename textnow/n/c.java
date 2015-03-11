package textnow.n;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class c
  implements a
{
  private IBinder a;

  c(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final int a(int paramInt, String paramString1, String paramString2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
      localParcel1.writeInt(paramInt);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final Bundle a(int paramInt, String paramString1, String paramString2, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        if (paramBundle != null)
        {
          localParcel1.writeInt(1);
          paramBundle.writeToParcel(localParcel1, 0);
          this.a.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
            return localBundle;
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
      Bundle localBundle = null;
    }
  }

  public final Bundle a(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
      localParcel1.writeInt(paramInt);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeString(paramString3);
      this.a.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
        return localBundle;
      }
      Bundle localBundle = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final Bundle a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
      localParcel1.writeInt(paramInt);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localParcel1.writeString(paramString3);
      localParcel1.writeString(paramString4);
      this.a.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      if (localParcel2.readInt() != 0)
      {
        localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
        return localBundle;
      }
      Bundle localBundle = null;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final int b(int paramInt, String paramString1, String paramString2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
      localParcel1.writeInt(paramInt);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.a.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.n.c
 * JD-Core Version:    0.6.2
 */