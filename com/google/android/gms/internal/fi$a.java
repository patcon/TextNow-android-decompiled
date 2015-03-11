package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

@ez
public final class fi$a
{
  public final ApplicationInfo applicationInfo;
  public final String lA;
  public final gt lD;
  public final ay lH;
  public final List<String> lS;
  public final String tA;
  public final String tB;
  public final Bundle tC;
  public final int tD;
  public final Bundle tE;
  public final boolean tF;
  public final Bundle tw;
  public final av tx;
  public final PackageInfo ty;

  public fi$a(Bundle paramBundle1, av paramav, ay paramay, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, gt paramgt, Bundle paramBundle2, List<String> paramList, Bundle paramBundle3, boolean paramBoolean)
  {
    this.tw = paramBundle1;
    this.tx = paramav;
    this.lH = paramay;
    this.lA = paramString1;
    this.applicationInfo = paramApplicationInfo;
    this.ty = paramPackageInfo;
    this.tA = paramString2;
    this.tB = paramString3;
    this.lD = paramgt;
    this.tC = paramBundle2;
    this.tF = paramBoolean;
    if ((paramList != null) && (paramList.size() > 0))
      this.tD = 2;
    for (this.lS = paramList; ; this.lS = null)
    {
      this.tE = paramBundle3;
      return;
      this.tD = 0;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fi.a
 * JD-Core Version:    0.6.2
 */