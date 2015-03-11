package android.support.v4.app;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

final class y
  implements w
{
  private IBinder a;

  y(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final void a(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
      localParcel.writeString(paramString);
      this.a.transact(3, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final void a(String paramString1, int paramInt, String paramString2)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
      localParcel.writeString(paramString1);
      localParcel.writeInt(paramInt);
      localParcel.writeString(paramString2);
      this.a.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final void a(String paramString1, int paramInt, String paramString2, Notification paramNotification)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
      localParcel.writeString(paramString1);
      localParcel.writeInt(paramInt);
      localParcel.writeString(paramString2);
      if (paramNotification != null)
      {
        localParcel.writeInt(1);
        paramNotification.writeToParcel(localParcel, 0);
      }
      while (true)
      {
        this.a.transact(1, localParcel, null, 1);
        return;
        localParcel.writeInt(0);
      }
    }
    finally
    {
      localParcel.recycle();
    }
  }

  public final IBinder asBinder()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.y
 * JD-Core Version:    0.6.2
 */