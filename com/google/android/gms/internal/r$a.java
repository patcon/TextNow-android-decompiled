package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsRequestCreator;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public abstract class r$a extends Binder
  implements r
{
  public static r a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
    if ((localIInterface != null) && ((localIInterface instanceof r)))
      return (r)localIInterface;
    return new r.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.auth.IAuthManagerService");
      return true;
    case 1:
      paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
      String str2 = paramParcel1.readString();
      String str3 = paramParcel1.readString();
      int k = paramParcel1.readInt();
      Bundle localBundle3 = null;
      if (k != 0)
        localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      Bundle localBundle4 = a(str2, str3, localBundle3);
      paramParcel2.writeNoException();
      if (localBundle4 != null)
      {
        paramParcel2.writeInt(1);
        localBundle4.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 2:
      paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
      String str1 = paramParcel1.readString();
      int j = paramParcel1.readInt();
      Bundle localBundle1 = null;
      if (j != 0)
        localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      Bundle localBundle2 = a(str1, localBundle1);
      paramParcel2.writeNoException();
      if (localBundle2 != null)
      {
        paramParcel2.writeInt(1);
        localBundle2.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 3:
    }
    paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
    int i = paramParcel1.readInt();
    AccountChangeEventsRequest localAccountChangeEventsRequest = null;
    if (i != 0)
      localAccountChangeEventsRequest = AccountChangeEventsRequest.CREATOR.createFromParcel(paramParcel1);
    AccountChangeEventsResponse localAccountChangeEventsResponse = a(localAccountChangeEventsRequest);
    paramParcel2.writeNoException();
    if (localAccountChangeEventsResponse != null)
    {
      paramParcel2.writeInt(1);
      localAccountChangeEventsResponse.writeToParcel(paramParcel2, 1);
    }
    while (true)
    {
      return true;
      paramParcel2.writeInt(0);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.r.a
 * JD-Core Version:    0.6.2
 */