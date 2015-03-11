package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class nb$a extends Binder
  implements nb
{
  public static nb bA(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaService");
    if ((localIInterface != null) && ((localIInterface instanceof nb)))
      return (nb)localIInterface;
    return new nb.a.a(paramIBinder);
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString("com.google.android.gms.panorama.internal.IPanoramaService");
      return true;
    case 1:
    }
    paramParcel1.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaService");
    na localna = na.a.bz(paramParcel1.readStrongBinder());
    Uri localUri;
    Bundle localBundle;
    if (paramParcel1.readInt() != 0)
    {
      localUri = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() == 0)
        break label133;
      localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      label103: if (paramParcel1.readInt() == 0)
        break label139;
    }
    label133: label139: for (boolean bool = true; ; bool = false)
    {
      a(localna, localUri, localBundle, bool);
      return true;
      localUri = null;
      break;
      localBundle = null;
      break label103;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nb.a
 * JD-Core Version:    0.6.2
 */