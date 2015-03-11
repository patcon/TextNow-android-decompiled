package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kw;

public final class Device
  implements SafeParcelable
{
  public static final Parcelable.Creator<Device> CREATOR = new i();
  public static final int TYPE_CHEST_STRAP = 4;
  public static final int TYPE_PHONE = 1;
  public static final int TYPE_SCALE = 5;
  public static final int TYPE_TABLET = 2;
  public static final int TYPE_UNKNOWN = 0;
  public static final int TYPE_WATCH = 3;
  private final int BR;
  private final int FD;
  private final String SZ;
  private final String Sx;
  private final String Ta;
  private final String Tb;
  private final int Tc;

  Device(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2, int paramInt3)
  {
    this.BR = paramInt1;
    this.SZ = ((String)o.i(paramString1));
    this.Ta = ((String)o.i(paramString2));
    this.Sx = "";
    this.Tb = ((String)o.i(paramString4));
    this.FD = paramInt2;
    this.Tc = paramInt3;
  }

  public Device(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this(paramString1, paramString2, "", paramString3, paramInt, 0);
  }

  public Device(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    this(paramString1, paramString2, paramString4, paramInt);
  }

  public Device(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
  {
    this(1, paramString1, paramString2, "", paramString4, paramInt1, paramInt2);
  }

  private static String M(Context paramContext)
  {
    return Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
  }

  private static int N(Context paramContext)
  {
    int i = P(paramContext);
    int j = 0;
    switch (i)
    {
    default:
      if (R(paramContext))
        j = 1;
      break;
    case 8:
    case 9:
    case 10:
      boolean bool;
      do
      {
        return j;
        bool = O(paramContext);
        j = 0;
      }
      while (!bool);
      return 3;
    }
    return 2;
  }

  public static boolean O(Context paramContext)
  {
    return (0xF & paramContext.getResources().getConfiguration().uiMode) == 6;
  }

  private static int P(Context paramContext)
  {
    return 5 + Q(paramContext) % 1000 / 100;
  }

  private static int Q(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return -1;
  }

  private static boolean R(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getPhoneType() != 0;
  }

  private boolean a(Device paramDevice)
  {
    return (n.equal(this.SZ, paramDevice.SZ)) && (n.equal(this.Ta, paramDevice.Ta)) && (n.equal(this.Sx, paramDevice.Sx)) && (n.equal(this.Tb, paramDevice.Tb)) && (this.FD == paramDevice.FD) && (this.Tc == paramDevice.Tc);
  }

  public static Device getLocalDevice(Context paramContext)
  {
    int i = N(paramContext);
    String str = M(paramContext);
    return new Device(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, str, i, 2);
  }

  private boolean iS()
  {
    return iR() == 1;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof Device)) && (a((Device)paramObject)));
  }

  public final String getManufacturer()
  {
    return this.SZ;
  }

  public final String getModel()
  {
    return this.Ta;
  }

  final String getStreamIdentifier()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.SZ;
    arrayOfObject[1] = this.Ta;
    arrayOfObject[2] = this.Tb;
    return String.format("%s:%s:%s", arrayOfObject);
  }

  public final int getType()
  {
    return this.FD;
  }

  public final String getUid()
  {
    return this.Tb;
  }

  public final String getVersion()
  {
    return this.Sx;
  }

  final int getVersionCode()
  {
    return this.BR;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this.SZ;
    arrayOfObject[1] = this.Ta;
    arrayOfObject[2] = this.Sx;
    arrayOfObject[3] = this.Tb;
    arrayOfObject[4] = Integer.valueOf(this.FD);
    return n.hashCode(arrayOfObject);
  }

  public final int iR()
  {
    return this.Tc;
  }

  final Device iT()
  {
    return new Device(kw.bt(this.SZ), kw.bt(this.Ta), kw.bt(this.Sx), this.Tb, this.FD);
  }

  public final String iU()
  {
    if ((kw.jc()) || (iS()))
      return this.Tb;
    return kw.bt(this.Tb);
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = getStreamIdentifier();
    arrayOfObject[1] = this.Sx;
    arrayOfObject[2] = Integer.valueOf(this.FD);
    arrayOfObject[3] = Integer.valueOf(this.Tc);
    return String.format("Device{%s:%s:%s:%s}", arrayOfObject);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.Device
 * JD-Core Version:    0.6.2
 */