package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class c$a extends Binder
  implements c
{
  public c$a()
  {
    attachInterface(this, "com.google.android.gms.dynamic.IFragmentWrapper");
  }

  public static c al(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
    if ((localIInterface != null) && ((localIInterface instanceof c)))
      return (c)localIInterface;
    return new c.a.a(paramIBinder);
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.dynamic.IFragmentWrapper");
      return true;
    case 2:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      d locald3 = iu();
      paramParcel2.writeNoException();
      IBinder localIBinder5 = null;
      if (locald3 != null)
        localIBinder5 = locald3.asBinder();
      paramParcel2.writeStrongBinder(localIBinder5);
      return true;
    case 3:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      Bundle localBundle = getArguments();
      paramParcel2.writeNoException();
      if (localBundle != null)
      {
        paramParcel2.writeInt(1);
        localBundle.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 4:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      int i12 = getId();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i12);
      return true;
    case 5:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      c localc2 = iv();
      paramParcel2.writeNoException();
      IBinder localIBinder4 = null;
      if (localc2 != null)
        localIBinder4 = localc2.asBinder();
      paramParcel2.writeStrongBinder(localIBinder4);
      return true;
    case 6:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      d locald2 = iw();
      paramParcel2.writeNoException();
      IBinder localIBinder3 = null;
      if (locald2 != null)
        localIBinder3 = locald2.asBinder();
      paramParcel2.writeStrongBinder(localIBinder3);
      return true;
    case 7:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      boolean bool13 = getRetainInstance();
      paramParcel2.writeNoException();
      if (bool13);
      for (int i11 = 1; ; i11 = 0)
      {
        paramParcel2.writeInt(i11);
        return true;
      }
    case 8:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      String str = getTag();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      return true;
    case 9:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      c localc1 = ix();
      paramParcel2.writeNoException();
      IBinder localIBinder2 = null;
      if (localc1 != null)
        localIBinder2 = localc1.asBinder();
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    case 10:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      int i10 = getTargetRequestCode();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i10);
      return true;
    case 11:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      boolean bool12 = getUserVisibleHint();
      paramParcel2.writeNoException();
      int i9 = 0;
      if (bool12)
        i9 = 1;
      paramParcel2.writeInt(i9);
      return true;
    case 12:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      d locald1 = getView();
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (locald1 != null)
        localIBinder1 = locald1.asBinder();
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    case 13:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      boolean bool11 = isAdded();
      paramParcel2.writeNoException();
      int i8 = 0;
      if (bool11)
        i8 = 1;
      paramParcel2.writeInt(i8);
      return true;
    case 14:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      boolean bool10 = isDetached();
      paramParcel2.writeNoException();
      int i7 = 0;
      if (bool10)
        i7 = 1;
      paramParcel2.writeInt(i7);
      return true;
    case 15:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      boolean bool9 = isHidden();
      paramParcel2.writeNoException();
      int i6 = 0;
      if (bool9)
        i6 = 1;
      paramParcel2.writeInt(i6);
      return true;
    case 16:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      boolean bool8 = isInLayout();
      paramParcel2.writeNoException();
      int i5 = 0;
      if (bool8)
        i5 = 1;
      paramParcel2.writeInt(i5);
      return true;
    case 17:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      boolean bool7 = isRemoving();
      paramParcel2.writeNoException();
      int i4 = 0;
      if (bool7)
        i4 = 1;
      paramParcel2.writeInt(i4);
      return true;
    case 18:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      boolean bool6 = isResumed();
      paramParcel2.writeNoException();
      int i3 = 0;
      if (bool6)
        i3 = 1;
      paramParcel2.writeInt(i3);
      return true;
    case 19:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      boolean bool5 = isVisible();
      paramParcel2.writeNoException();
      int i2 = 0;
      if (bool5)
        i2 = 1;
      paramParcel2.writeInt(i2);
      return true;
    case 20:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      d(d.a.am(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 21:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      int i1 = paramParcel1.readInt();
      boolean bool4 = false;
      if (i1 != 0)
        bool4 = true;
      setHasOptionsMenu(bool4);
      paramParcel2.writeNoException();
      return true;
    case 22:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      int n = paramParcel1.readInt();
      boolean bool3 = false;
      if (n != 0)
        bool3 = true;
      setMenuVisibility(bool3);
      paramParcel2.writeNoException();
      return true;
    case 23:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      int m = paramParcel1.readInt();
      boolean bool2 = false;
      if (m != 0)
        bool2 = true;
      setRetainInstance(bool2);
      paramParcel2.writeNoException();
      return true;
    case 24:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      int k = paramParcel1.readInt();
      boolean bool1 = false;
      if (k != 0)
        bool1 = true;
      setUserVisibleHint(bool1);
      paramParcel2.writeNoException();
      return true;
    case 25:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      int j = paramParcel1.readInt();
      Intent localIntent2 = null;
      if (j != 0)
        localIntent2 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
      startActivity(localIntent2);
      paramParcel2.writeNoException();
      return true;
    case 26:
      paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      int i = paramParcel1.readInt();
      Intent localIntent1 = null;
      if (i != 0)
        localIntent1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
      startActivityForResult(localIntent1, paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 27:
    }
    paramParcel1.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
    e(d.a.am(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.c.a
 * JD-Core Version:    0.6.2
 */