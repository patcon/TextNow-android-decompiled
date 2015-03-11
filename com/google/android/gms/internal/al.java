package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class al
  implements SafeParcelable
{
  public static final am CREATOR = new am();
  public final int height;
  public final int heightPixels;
  public final String me;
  public final boolean mf;
  public final al[] mg;
  public final int versionCode;
  public final int width;
  public final int widthPixels;

  public al()
  {
    this(2, "interstitial_mb", 0, 0, true, 0, 0, null);
  }

  al(int paramInt1, String paramString, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5, al[] paramArrayOfal)
  {
    this.versionCode = paramInt1;
    this.me = paramString;
    this.height = paramInt2;
    this.heightPixels = paramInt3;
    this.mf = paramBoolean;
    this.width = paramInt4;
    this.widthPixels = paramInt5;
    this.mg = paramArrayOfal;
  }

  public al(Context paramContext, AdSize paramAdSize)
  {
    this(paramContext, new AdSize[] { paramAdSize });
  }

  public al(Context paramContext, AdSize[] paramArrayOfAdSize)
  {
    AdSize localAdSize = paramArrayOfAdSize[0];
    this.versionCode = 2;
    this.mf = false;
    this.width = localAdSize.getWidth();
    this.height = localAdSize.getHeight();
    int j;
    int k;
    label62: DisplayMetrics localDisplayMetrics;
    int n;
    label99: int i1;
    if (this.width == -1)
    {
      j = 1;
      if (this.height != -2)
        break label216;
      k = 1;
      localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      if (j == 0)
        break label222;
      this.widthPixels = a(localDisplayMetrics);
      n = (int)(this.widthPixels / localDisplayMetrics.density);
      if (k == 0)
        break label248;
      i1 = c(localDisplayMetrics);
      label111: this.heightPixels = et.a(localDisplayMetrics, i1);
      if ((j == 0) && (k == 0))
        break label257;
    }
    label257: for (this.me = (n + "x" + i1 + "_as"); ; this.me = localAdSize.toString())
    {
      if (paramArrayOfAdSize.length <= 1)
        break label269;
      this.mg = new al[paramArrayOfAdSize.length];
      while (i < paramArrayOfAdSize.length)
      {
        this.mg[i] = new al(paramContext, paramArrayOfAdSize[i]);
        i++;
      }
      j = 0;
      break;
      label216: k = 0;
      break label62;
      label222: int m = this.width;
      this.widthPixels = et.a(localDisplayMetrics, this.width);
      n = m;
      break label99;
      label248: i1 = this.height;
      break label111;
    }
    label269: this.mg = null;
  }

  public al(al paramal, al[] paramArrayOfal)
  {
    this(2, paramal.me, paramal.height, paramal.heightPixels, paramal.mf, paramal.width, paramal.widthPixels, paramArrayOfal);
  }

  public static int a(DisplayMetrics paramDisplayMetrics)
  {
    return paramDisplayMetrics.widthPixels;
  }

  public static int b(DisplayMetrics paramDisplayMetrics)
  {
    return (int)(c(paramDisplayMetrics) * paramDisplayMetrics.density);
  }

  private static int c(DisplayMetrics paramDisplayMetrics)
  {
    int i = (int)(paramDisplayMetrics.heightPixels / paramDisplayMetrics.density);
    if (i <= 400)
      return 32;
    if (i <= 720)
      return 50;
    return 90;
  }

  public final AdSize aG()
  {
    return a.a(this.width, this.height, this.me);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    am.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.al
 * JD-Core Version:    0.6.2
 */