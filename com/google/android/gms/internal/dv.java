package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;
import com.google.android.gms.dynamic.e;

@ez
public final class dv
  implements SafeParcelable
{
  public static final du CREATOR = new du();
  public final el lM;
  public final ee lT;
  public final eg si;
  public final Context sj;
  public final int versionCode;

  dv(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4)
  {
    this.versionCode = paramInt;
    this.lM = ((el)e.f(d.a.am(paramIBinder1)));
    this.lT = ((ee)e.f(d.a.am(paramIBinder2)));
    this.si = ((eg)e.f(d.a.am(paramIBinder3)));
    this.sj = ((Context)e.f(d.a.am(paramIBinder4)));
  }

  public dv(eg parameg, el paramel, ee paramee, Context paramContext)
  {
    this.versionCode = 1;
    this.si = parameg;
    this.lM = paramel;
    this.lT = paramee;
    this.sj = paramContext;
  }

  public static void a(Intent paramIntent, dv paramdv)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", paramdv);
    paramIntent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", localBundle);
  }

  public static dv c(Intent paramIntent)
  {
    try
    {
      Bundle localBundle = paramIntent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
      localBundle.setClassLoader(dv.class.getClassLoader());
      dv localdv = (dv)localBundle.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
      return localdv;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  final IBinder ck()
  {
    return e.k(this.lM).asBinder();
  }

  final IBinder cl()
  {
    return e.k(this.lT).asBinder();
  }

  final IBinder cm()
  {
    return e.k(this.si).asBinder();
  }

  final IBinder cn()
  {
    return e.k(this.sj).asBinder();
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    du.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dv
 * JD-Core Version:    0.6.2
 */