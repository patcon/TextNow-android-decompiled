package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import java.util.ArrayList;
import java.util.HashSet;

public class u extends aq.a
  implements ba, bd, bf, bn, ci, cl, dm.a, ej, t
{
  private final bt kB;
  private final u.c kC;
  private final y kD;
  private final ab kE;
  private boolean kF;
  private final ComponentCallbacks kG = new ComponentCallbacks()
  {
    public void onConfigurationChanged(Configuration paramAnonymousConfiguration)
    {
      if ((u.a(u.this) != null) && (u.a(u.this).kU != null) && (u.a(u.this).kU.oy != null))
        u.a(u.this).kU.oy.bX();
    }

    public void onLowMemory()
    {
    }
  };

  public u(Context paramContext, al paramal, String paramString, bt parambt, ev paramev)
  {
    this.kC = new u.c(paramContext, paramal, paramString, paramev);
    this.kB = parambt;
    this.kD = new y(this);
    this.kE = new ab();
    eo.n(paramContext);
    W();
  }

  private void W()
  {
    if ((Build.VERSION.SDK_INT >= 14) && (this.kC != null) && (this.kC.kO != null))
      this.kC.kO.registerComponentCallbacks(this.kG);
  }

  private void X()
  {
    if ((Build.VERSION.SDK_INT >= 14) && (this.kC != null) && (this.kC.kO != null))
      this.kC.kO.unregisterComponentCallbacks(this.kG);
  }

  private void a(int paramInt)
  {
    eu.D("Failed to load ad: " + paramInt);
    if (this.kC.kR != null);
    try
    {
      this.kC.kR.onAdFailedToLoad(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call AdListener.onAdFailedToLoad().", localRemoteException);
    }
  }

  private void ah()
  {
    eu.B("Ad closing.");
    if (this.kC.kR != null);
    try
    {
      this.kC.kR.onAdClosed();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call AdListener.onAdClosed().", localRemoteException);
    }
  }

  private void ai()
  {
    eu.B("Ad leaving application.");
    if (this.kC.kR != null);
    try
    {
      this.kC.kR.onAdLeftApplication();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call AdListener.onAdLeftApplication().", localRemoteException);
    }
  }

  private void aj()
  {
    eu.B("Ad opening.");
    if (this.kC.kR != null);
    try
    {
      this.kC.kR.onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call AdListener.onAdOpened().", localRemoteException);
    }
  }

  private void ak()
  {
    eu.B("Ad finished loading.");
    if (this.kC.kR != null);
    try
    {
      this.kC.kR.onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call AdListener.onAdLoaded().", localRemoteException);
    }
  }

  private boolean al()
  {
    boolean bool = true;
    if (!eo.a(this.kC.kO.getPackageManager(), this.kC.kO.getPackageName(), "android.permission.INTERNET"))
    {
      if (!this.kC.kT.mf)
        et.a(this.kC.kM, this.kC.kT, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
      bool = false;
    }
    if (!eo.m(this.kC.kO))
    {
      if (!this.kC.kT.mf)
        et.a(this.kC.kM, this.kC.kT, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
      bool = false;
    }
    if ((!bool) && (!this.kC.kT.mf))
      this.kC.kM.setVisibility(0);
    return bool;
  }

  private void am()
  {
    if (this.kC.kU == null)
      eu.D("Ad state was null when trying to ping click URLs.");
    do
    {
      return;
      eu.z("Pinging click URLs.");
      this.kC.kV.bC();
      if (this.kC.kU.nt != null)
        eo.a(this.kC.kO, this.kC.kQ.sw, this.kC.kU.nt);
    }
    while ((this.kC.kU.rz == null) || (this.kC.kU.rz.nt == null));
    br.a(this.kC.kO, this.kC.kQ.sw, this.kC.kU, this.kC.kN, false, this.kC.kU.rz.nt);
  }

  private void an()
  {
    if (this.kC.kU != null)
    {
      this.kC.kU.oy.destroy();
      this.kC.kU = null;
    }
  }

  private void b(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-2, -2);
    this.kC.kM.addView(paramView, localLayoutParams);
  }

  // ERROR //
  private boolean b(ef paramef)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 302	com/google/android/gms/internal/ef:qg	Z
    //   4: ifeq +193 -> 197
    //   7: aload_1
    //   8: getfield 306	com/google/android/gms/internal/ef:nN	Lcom/google/android/gms/internal/bu;
    //   11: invokeinterface 312 1 0
    //   16: invokestatic 318	com/google/android/gms/dynamic/e:e	(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;
    //   19: checkcast 320	android/view/View
    //   22: astore 5
    //   24: aload_0
    //   25: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   28: getfield 198	com/google/android/gms/internal/u$c:kM	Lcom/google/android/gms/internal/u$a;
    //   31: invokevirtual 324	com/google/android/gms/internal/u$a:getNextView	()Landroid/view/View;
    //   34: astore 6
    //   36: aload 6
    //   38: ifnull +15 -> 53
    //   41: aload_0
    //   42: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   45: getfield 198	com/google/android/gms/internal/u$c:kM	Lcom/google/android/gms/internal/u$a;
    //   48: aload 6
    //   50: invokevirtual 327	com/google/android/gms/internal/u$a:removeView	(Landroid/view/View;)V
    //   53: aload_0
    //   54: aload 5
    //   56: invokespecial 329	com/google/android/gms/internal/u:b	(Landroid/view/View;)V
    //   59: aload_0
    //   60: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   63: getfield 198	com/google/android/gms/internal/u$c:kM	Lcom/google/android/gms/internal/u$a;
    //   66: invokevirtual 333	com/google/android/gms/internal/u$a:getChildCount	()I
    //   69: iconst_1
    //   70: if_icmple +13 -> 83
    //   73: aload_0
    //   74: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   77: getfield 198	com/google/android/gms/internal/u$c:kM	Lcom/google/android/gms/internal/u$a;
    //   80: invokevirtual 336	com/google/android/gms/internal/u$a:showNext	()V
    //   83: aload_0
    //   84: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   87: getfield 225	com/google/android/gms/internal/u$c:kU	Lcom/google/android/gms/internal/ef;
    //   90: ifnull +70 -> 160
    //   93: aload_0
    //   94: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   97: getfield 198	com/google/android/gms/internal/u$c:kM	Lcom/google/android/gms/internal/u$a;
    //   100: invokevirtual 324	com/google/android/gms/internal/u$a:getNextView	()Landroid/view/View;
    //   103: astore_2
    //   104: aload_2
    //   105: instanceof 282
    //   108: ifeq +162 -> 270
    //   111: aload_2
    //   112: checkcast 282	com/google/android/gms/internal/ex
    //   115: aload_0
    //   116: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   119: getfield 84	com/google/android/gms/internal/u$c:kO	Landroid/content/Context;
    //   122: aload_0
    //   123: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   126: getfield 189	com/google/android/gms/internal/u$c:kT	Lcom/google/android/gms/internal/al;
    //   129: invokevirtual 339	com/google/android/gms/internal/ex:a	(Landroid/content/Context;Lcom/google/android/gms/internal/al;)V
    //   132: aload_0
    //   133: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   136: getfield 225	com/google/android/gms/internal/u$c:kU	Lcom/google/android/gms/internal/ef;
    //   139: getfield 306	com/google/android/gms/internal/ef:nN	Lcom/google/android/gms/internal/bu;
    //   142: ifnull +18 -> 160
    //   145: aload_0
    //   146: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   149: getfield 225	com/google/android/gms/internal/u$c:kU	Lcom/google/android/gms/internal/ef;
    //   152: getfield 306	com/google/android/gms/internal/ef:nN	Lcom/google/android/gms/internal/bu;
    //   155: invokeinterface 340 1 0
    //   160: aload_0
    //   161: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   164: getfield 198	com/google/android/gms/internal/u$c:kM	Lcom/google/android/gms/internal/u$a;
    //   167: iconst_0
    //   168: invokevirtual 220	com/google/android/gms/internal/u$a:setVisibility	(I)V
    //   171: iconst_1
    //   172: ireturn
    //   173: astore 4
    //   175: ldc_w 342
    //   178: aload 4
    //   180: invokestatic 136	com/google/android/gms/internal/eu:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   183: iconst_0
    //   184: ireturn
    //   185: astore 7
    //   187: ldc_w 344
    //   190: aload 7
    //   192: invokestatic 136	com/google/android/gms/internal/eu:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   195: iconst_0
    //   196: ireturn
    //   197: aload_1
    //   198: getfield 347	com/google/android/gms/internal/ef:rA	Lcom/google/android/gms/internal/al;
    //   201: ifnull -142 -> 59
    //   204: aload_1
    //   205: getfield 280	com/google/android/gms/internal/ef:oy	Lcom/google/android/gms/internal/ex;
    //   208: aload_1
    //   209: getfield 347	com/google/android/gms/internal/ef:rA	Lcom/google/android/gms/internal/al;
    //   212: invokevirtual 350	com/google/android/gms/internal/ex:a	(Lcom/google/android/gms/internal/al;)V
    //   215: aload_0
    //   216: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   219: getfield 198	com/google/android/gms/internal/u$c:kM	Lcom/google/android/gms/internal/u$a;
    //   222: invokevirtual 353	com/google/android/gms/internal/u$a:removeAllViews	()V
    //   225: aload_0
    //   226: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   229: getfield 198	com/google/android/gms/internal/u$c:kM	Lcom/google/android/gms/internal/u$a;
    //   232: aload_1
    //   233: getfield 347	com/google/android/gms/internal/ef:rA	Lcom/google/android/gms/internal/al;
    //   236: getfield 356	com/google/android/gms/internal/al:widthPixels	I
    //   239: invokevirtual 359	com/google/android/gms/internal/u$a:setMinimumWidth	(I)V
    //   242: aload_0
    //   243: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   246: getfield 198	com/google/android/gms/internal/u$c:kM	Lcom/google/android/gms/internal/u$a;
    //   249: aload_1
    //   250: getfield 347	com/google/android/gms/internal/ef:rA	Lcom/google/android/gms/internal/al;
    //   253: getfield 362	com/google/android/gms/internal/al:heightPixels	I
    //   256: invokevirtual 365	com/google/android/gms/internal/u$a:setMinimumHeight	(I)V
    //   259: aload_0
    //   260: aload_1
    //   261: getfield 280	com/google/android/gms/internal/ef:oy	Lcom/google/android/gms/internal/ex;
    //   264: invokespecial 329	com/google/android/gms/internal/u:b	(Landroid/view/View;)V
    //   267: goto -208 -> 59
    //   270: aload_2
    //   271: ifnull -139 -> 132
    //   274: aload_0
    //   275: getfield 53	com/google/android/gms/internal/u:kC	Lcom/google/android/gms/internal/u$c;
    //   278: getfield 198	com/google/android/gms/internal/u$c:kM	Lcom/google/android/gms/internal/u$a;
    //   281: aload_2
    //   282: invokevirtual 327	com/google/android/gms/internal/u$a:removeView	(Landroid/view/View;)V
    //   285: goto -153 -> 132
    //   288: astore_3
    //   289: ldc_w 367
    //   292: invokestatic 121	com/google/android/gms/internal/eu:D	(Ljava/lang/String;)V
    //   295: goto -135 -> 160
    //
    // Exception table:
    //   from	to	target	type
    //   7	24	173	android/os/RemoteException
    //   53	59	185	java/lang/Throwable
    //   145	160	288	android/os/RemoteException
  }

  private ds.a c(ai paramai)
  {
    ApplicationInfo localApplicationInfo = this.kC.kO.getApplicationInfo();
    try
    {
      PackageInfo localPackageInfo2 = this.kC.kO.getPackageManager().getPackageInfo(localApplicationInfo.packageName, 0);
      localPackageInfo1 = localPackageInfo2;
      if ((!this.kC.kT.mf) && (this.kC.kM.getParent() != null))
      {
        int[] arrayOfInt = new int[2];
        this.kC.kM.getLocationOnScreen(arrayOfInt);
        int i = arrayOfInt[0];
        int j = arrayOfInt[1];
        DisplayMetrics localDisplayMetrics = this.kC.kO.getResources().getDisplayMetrics();
        int k = this.kC.kM.getWidth();
        int m = this.kC.kM.getHeight();
        if ((this.kC.kM.isShown()) && (i + k > 0) && (j + m > 0) && (i <= localDisplayMetrics.widthPixels) && (j <= localDisplayMetrics.heightPixels))
        {
          n = 1;
          localBundle1 = new Bundle(5);
          localBundle1.putInt("x", i);
          localBundle1.putInt("y", j);
          localBundle1.putInt("width", k);
          localBundle1.putInt("height", m);
          localBundle1.putInt("visible", n);
          String str = eh.bI();
          this.kC.kV = new eg(str, this.kC.kN);
          this.kC.kV.f(paramai);
          Bundle localBundle2 = eh.a(this.kC.kO, this, str);
          return new ds.a(localBundle1, paramai, this.kC.kT, this.kC.kN, localApplicationInfo, localPackageInfo1, str, eh.rQ, this.kC.kQ, localBundle2);
        }
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
      {
        PackageInfo localPackageInfo1 = null;
        continue;
        int n = 0;
        continue;
        Bundle localBundle1 = null;
      }
    }
  }

  private void c(boolean paramBoolean)
  {
    if (this.kC.kU == null)
      eu.D("Ad state was null when trying to ping impression URLs.");
    do
    {
      return;
      eu.z("Pinging Impression URLs.");
      this.kC.kV.bB();
      if (this.kC.kU.nu != null)
        eo.a(this.kC.kO, this.kC.kQ.sw, this.kC.kU.nu);
      if ((this.kC.kU.rz != null) && (this.kC.kU.rz.nu != null))
        br.a(this.kC.kO, this.kC.kQ.sw, this.kC.kU, this.kC.kN, paramBoolean, this.kC.kU.rz.nu);
    }
    while ((this.kC.kU.nM == null) || (this.kC.kU.nM.np == null));
    br.a(this.kC.kO, this.kC.kQ.sw, this.kC.kU, this.kC.kN, paramBoolean, this.kC.kU.nM.np);
  }

  public d U()
  {
    hm.ay("getAdFrame must be called on the main UI thread.");
    return e.h(this.kC.kM);
  }

  public al V()
  {
    hm.ay("getAdSize must be called on the main UI thread.");
    return this.kC.kT;
  }

  public void Y()
  {
    ai();
  }

  public void Z()
  {
    this.kE.d(this.kC.kU);
    if (this.kC.kT.mf)
      an();
    this.kF = false;
    ah();
    this.kC.kV.bD();
  }

  public void a(al paramal)
  {
    hm.ay("setAdSize must be called on the main UI thread.");
    this.kC.kT = paramal;
    if (this.kC.kU != null)
      this.kC.kU.oy.a(paramal);
    if (this.kC.kM.getChildCount() > 1)
      this.kC.kM.removeView(this.kC.kM.getNextView());
    this.kC.kM.setMinimumWidth(paramal.widthPixels);
    this.kC.kM.setMinimumHeight(paramal.heightPixels);
    this.kC.kM.requestLayout();
  }

  public void a(ap paramap)
  {
    hm.ay("setAdListener must be called on the main UI thread.");
    this.kC.kR = paramap;
  }

  public void a(as paramas)
  {
    hm.ay("setAppEventListener must be called on the main UI thread.");
    this.kC.kW = paramas;
  }

  public void a(dc paramdc)
  {
    hm.ay("setInAppPurchaseListener must be called on the main UI thread.");
    this.kC.kY = paramdc;
  }

  public void a(dg paramdg, String paramString)
  {
    hm.ay("setPlayStorePurchaseParams must be called on the main UI thread.");
    this.kC.kZ = new cz(paramString);
    this.kC.kX = paramdg;
    if ((!eh.bM()) && (paramdg != null))
      new cs(this.kC.kO, this.kC.kX, this.kC.kZ).start();
  }

  public void a(ef paramef)
  {
    this.kC.kS = null;
    if ((paramef.errorCode != -2) && (paramef.errorCode != 3))
      eh.b(this.kC.aq());
    if (paramef.errorCode == -1)
      return;
    boolean bool;
    if (paramef.pX.extras != null)
    {
      bool = paramef.pX.extras.getBoolean("_noRefresh", false);
      if (!this.kC.kT.mf)
        break label179;
      eo.a(paramef.oy);
    }
    while (true)
    {
      if ((paramef.errorCode == 3) && (paramef.rz != null) && (paramef.rz.nv != null))
      {
        eu.z("Pinging no fill URLs.");
        br.a(this.kC.kO, this.kC.kQ.sw, paramef, this.kC.kN, false, paramef.rz.nv);
      }
      if (paramef.errorCode == -2)
        break label279;
      a(paramef.errorCode);
      return;
      bool = false;
      break;
      label179: if (!bool)
        if (paramef.nx > 0L)
          this.kD.a(paramef.pX, paramef.nx);
        else if ((paramef.rz != null) && (paramef.rz.nx > 0L))
          this.kD.a(paramef.pX, paramef.rz.nx);
        else if ((!paramef.qg) && (paramef.errorCode == 2))
          this.kD.d(paramef.pX);
    }
    label279: if (!this.kC.kT.mf)
    {
      if (!b(paramef))
      {
        a(0);
        return;
      }
      if (this.kC.kM != null)
        u.a.a(this.kC.kM).x(paramef.ql);
    }
    if ((this.kC.kU != null) && (this.kC.kU.nP != null))
      this.kC.kU.nP.a(null);
    if (paramef.nP != null)
      paramef.nP.a(this);
    this.kE.d(this.kC.kU);
    this.kC.kU = paramef;
    if (paramef.rA != null)
      this.kC.kT = paramef.rA;
    this.kC.kV.j(paramef.rB);
    this.kC.kV.k(paramef.rC);
    this.kC.kV.n(this.kC.kT.mf);
    this.kC.kV.o(paramef.qg);
    if (!this.kC.kT.mf)
      c(false);
    if (this.kC.la == null)
      this.kC.la = new ek(this.kC.kN);
    int i;
    if (paramef.rz != null)
      i = paramef.rz.ny;
    for (int j = paramef.rz.nz; ; j = 0)
    {
      this.kC.la.a(i, j);
      if ((!this.kC.kT.mf) && (paramef.oy != null) && ((paramef.oy.cb().cj()) || (paramef.ry != null)))
      {
        ac localac = this.kE.a(this.kC.kT, this.kC.kU);
        if ((paramef.oy.cb().cj()) && (localac != null))
          localac.a(new x(paramef.oy));
      }
      this.kC.kU.oy.bX();
      ak();
      return;
      i = 0;
    }
  }

  public void a(String paramString, ArrayList<String> paramArrayList)
  {
    ct localct = new ct(paramString, paramArrayList, this.kC.kO, this.kC.kQ.sw);
    if (this.kC.kY == null)
    {
      eu.D("InAppPurchaseListener is not set. Try to launch default purchase flow.");
      if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.kC.kO) != 0)
        eu.D("Google Play Service unavailable, cannot launch default purchase flow.");
      while (true)
      {
        return;
        if (this.kC.kX == null)
        {
          eu.D("PlayStorePurchaseListener is not set.");
          return;
        }
        if (this.kC.kZ == null)
        {
          eu.D("PlayStorePurchaseVerifier is not initialized.");
          return;
        }
        try
        {
          boolean bool = this.kC.kX.isValidPurchase(paramString);
          if (bool)
          {
            cu.a(this.kC.kO, this.kC.kQ.sz, new cq(localct, this.kC.kX, this.kC.kZ, this.kC.kO));
            return;
          }
        }
        catch (RemoteException localRemoteException2)
        {
          while (true)
            eu.D("Could not start In-App purchase.");
        }
      }
    }
    try
    {
      this.kC.kY.a(localct);
      return;
    }
    catch (RemoteException localRemoteException1)
    {
      eu.D("Could not start In-App purchase.");
    }
  }

  public void a(HashSet<eg> paramHashSet)
  {
    this.kC.a(paramHashSet);
  }

  public boolean a(ai paramai)
  {
    hm.ay("loadAd must be called on the main UI thread.");
    if (this.kC.kS != null)
      eu.D("An ad request is already in progress. Aborting.");
    do
    {
      return false;
      if ((this.kC.kT.mf) && (this.kC.kU != null))
      {
        eu.D("An interstitial is already loading. Aborting.");
        return false;
      }
    }
    while (!al());
    eu.B("Starting ad request.");
    if (!paramai.lV)
      eu.B("Use AdRequest.Builder.addTestDevice(\"" + et.r(this.kC.kO) + "\") to get test ads on this device.");
    this.kD.cancel();
    this.kC.lb = false;
    ds.a locala = c(paramai);
    Object localObject;
    if (this.kC.kT.mf)
    {
      ex localex2 = ex.a(this.kC.kO, this.kC.kT, false, false, this.kC.kP, this.kC.kQ);
      localex2.cb().a(this, null, this, this, true, this, this);
      localObject = localex2;
      this.kC.kS = dm.a(this.kC.kO, locala, this.kC.kP, (ex)localObject, this.kB, this);
      return true;
    }
    View localView = this.kC.kM.getNextView();
    ex localex1;
    if ((localView instanceof ex))
    {
      localex1 = (ex)localView;
      localex1.a(this.kC.kO, this.kC.kT);
    }
    while (true)
    {
      localex1.cb().a(this, this, this, this, false, this);
      localObject = localex1;
      break;
      if (localView != null)
        this.kC.kM.removeView(localView);
      localex1 = ex.a(this.kC.kO, this.kC.kT, false, false, this.kC.kP, this.kC.kQ);
      if (this.kC.kT.mg == null)
        b(localex1);
    }
  }

  public void aa()
  {
    if (this.kC.kT.mf)
      c(false);
    this.kF = true;
    aj();
  }

  public void ab()
  {
    onAdClicked();
  }

  public void ac()
  {
    Z();
  }

  public void ad()
  {
    Y();
  }

  public void ae()
  {
    aa();
  }

  public void af()
  {
    if (this.kC.kU != null)
      eu.D("Mediation adapter " + this.kC.kU.nO + " refreshed, but mediation adapters should never refresh.");
    c(true);
    ak();
  }

  public void ag()
  {
    hm.ay("recordManualImpression must be called on the main UI thread.");
    if (this.kC.kU == null)
      eu.D("Ad state was null when trying to ping manual tracking URLs.");
    do
    {
      return;
      eu.z("Pinging manual tracking URLs.");
    }
    while (this.kC.kU.qi == null);
    eo.a(this.kC.kO, this.kC.kQ.sw, this.kC.kU.qi);
  }

  public void b(ai paramai)
  {
    ViewParent localViewParent = this.kC.kM.getParent();
    if (((localViewParent instanceof View)) && (((View)localViewParent).isShown()) && (eo.bQ()) && (!this.kF))
    {
      a(paramai);
      return;
    }
    eu.B("Ad is not visible. Not refreshing ad.");
    this.kD.d(paramai);
  }

  public void b(boolean paramBoolean)
  {
    this.kC.lb = paramBoolean;
  }

  public void destroy()
  {
    hm.ay("destroy must be called on the main UI thread.");
    X();
    this.kC.kR = null;
    this.kC.kW = null;
    this.kD.cancel();
    this.kE.stop();
    stopLoading();
    if (this.kC.kM != null)
      this.kC.kM.removeAllViews();
    if ((this.kC.kU != null) && (this.kC.kU.oy != null))
      this.kC.kU.oy.destroy();
    if ((this.kC.kU != null) && (this.kC.kU.nN != null));
    try
    {
      this.kC.kU.nN.destroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.D("Could not destroy mediation adapter.");
    }
  }

  public boolean isReady()
  {
    hm.ay("isLoaded must be called on the main UI thread.");
    return (this.kC.kS == null) && (this.kC.kU != null);
  }

  public void onAdClicked()
  {
    am();
  }

  public void onAppEvent(String paramString1, String paramString2)
  {
    if (this.kC.kW != null);
    try
    {
      this.kC.kW.onAppEvent(paramString1, paramString2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not call the AppEventListener.", localRemoteException);
    }
  }

  public void pause()
  {
    hm.ay("pause must be called on the main UI thread.");
    if (this.kC.kU != null)
      eo.a(this.kC.kU.oy);
    if ((this.kC.kU != null) && (this.kC.kU.nN != null));
    try
    {
      this.kC.kU.nN.pause();
      this.kE.pause();
      this.kD.pause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        eu.D("Could not pause mediation adapter.");
    }
  }

  public void resume()
  {
    hm.ay("resume must be called on the main UI thread.");
    if (this.kC.kU != null)
      eo.b(this.kC.kU.oy);
    if ((this.kC.kU != null) && (this.kC.kU.nN != null));
    try
    {
      this.kC.kU.nN.resume();
      this.kD.resume();
      this.kE.resume();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        eu.D("Could not resume mediation adapter.");
    }
  }

  public void showInterstitial()
  {
    hm.ay("showInterstitial must be called on the main UI thread.");
    if (!this.kC.kT.mf)
    {
      eu.D("Cannot call showInterstitial on a banner ad.");
      return;
    }
    if (this.kC.kU == null)
    {
      eu.D("The interstitial has not loaded.");
      return;
    }
    if (this.kC.kU.oy.ce())
    {
      eu.D("The interstitial is already showing.");
      return;
    }
    this.kC.kU.oy.q(true);
    if ((this.kC.kU.oy.cb().cj()) || (this.kC.kU.ry != null))
    {
      ac localac = this.kE.a(this.kC.kT, this.kC.kU);
      if ((this.kC.kU.oy.cb().cj()) && (localac != null))
        localac.a(new x(this.kC.kU.oy));
    }
    if (this.kC.kU.qg)
      try
      {
        this.kC.kU.nN.showInterstitial();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        eu.c("Could not show interstitial.", localRemoteException);
        an();
        return;
      }
    v localv = new v(this.kC.lb, false);
    boolean bool1;
    if ((this.kC.kO instanceof Activity))
    {
      Window localWindow = ((Activity)this.kC.kO).getWindow();
      Rect localRect1 = new Rect();
      Rect localRect2 = new Rect();
      localWindow.getDecorView().getGlobalVisibleRect(localRect1);
      localWindow.getDecorView().getWindowVisibleDisplayFrame(localRect2);
      if ((localRect1.bottom != 0) && (localRect2.bottom != 0))
      {
        bool1 = this.kC.lb;
        if (localRect1.top != localRect2.top)
          break label419;
      }
    }
    label419: for (boolean bool2 = true; ; bool2 = false)
    {
      localv = new v(bool1, bool2);
      ch localch = new ch(this, this, this, this.kC.kU.oy, this.kC.kU.orientation, this.kC.kQ, this.kC.kU.ql, localv);
      cf.a(this.kC.kO, localch);
      return;
    }
  }

  public void stopLoading()
  {
    hm.ay("stopLoading must be called on the main UI thread.");
    if (this.kC.kU != null)
    {
      this.kC.kU.oy.stopLoading();
      this.kC.kU = null;
    }
    if (this.kC.kS != null)
      this.kC.kS.cancel();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.u
 * JD-Core Version:    0.6.2
 */