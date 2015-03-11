package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class dn extends em
  implements dp.a, ey.a
{
  private final bt kB;
  private final ex lN;
  private final Object ls = new Object();
  private final Context mContext;
  private bm nf;
  private final k pA;
  private em pB;
  private du pC;
  private boolean pD = false;
  private bk pE;
  private bq pF;
  private final dm.a px;
  private final Object py = new Object();
  private final ds.a pz;

  public dn(Context paramContext, ds.a parama, k paramk, ex paramex, bt parambt, dm.a parama1)
  {
    this.kB = parambt;
    this.px = parama1;
    this.lN = paramex;
    this.mContext = paramContext;
    this.pz = parama;
    this.pA = paramk;
  }

  private al a(ds paramds)
  {
    if (this.pC.qj == null)
      throw new dn.a("The ad response must specify one of the supported ad sizes.", 0);
    String[] arrayOfString = this.pC.qj.split("x");
    if (arrayOfString.length != 2)
      throw new dn.a("Could not parse the ad size from the ad response: " + this.pC.qj, 0);
    while (true)
    {
      int m;
      al localal;
      try
      {
        int i = Integer.parseInt(arrayOfString[0]);
        int j = Integer.parseInt(arrayOfString[1]);
        al[] arrayOfal = paramds.kT.mg;
        int k = arrayOfal.length;
        m = 0;
        if (m >= k)
          break;
        localal = arrayOfal[m];
        float f = this.mContext.getResources().getDisplayMetrics().density;
        if (localal.width == -1)
        {
          n = (int)(localal.widthPixels / f);
          if (localal.height != -2)
            break label255;
          i1 = (int)(localal.heightPixels / f);
          if ((i != n) || (j != i1))
            break label265;
          return new al(localal, paramds.kT.mg);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new dn.a("Could not parse the ad size from the ad response: " + this.pC.qj, 0);
      }
      int n = localal.width;
      continue;
      label255: int i1 = localal.height;
      continue;
      label265: m++;
    }
    throw new dn.a("The ad size from the ad response was not one of the requested sizes: " + this.pC.qj, 0);
  }

  private void a(ds paramds, long paramLong)
  {
    synchronized (this.py)
    {
      this.pE = new bk(this.mContext, paramds, this.kB, this.nf);
      this.pF = this.pE.a(paramLong, 60000L);
      switch (this.pF.nL)
      {
      default:
        throw new dn.a("Unexpected mediation result: " + this.pF.nL, 0);
      case 1:
      case 0:
      }
    }
    throw new dn.a("No fill from any mediation ad networks.", 3);
  }

  private void bn()
  {
    if (this.pC.errorCode == -3);
    do
    {
      return;
      if (TextUtils.isEmpty(this.pC.qe))
        throw new dn.a("No fill from ad server.", 3);
    }
    while (!this.pC.qg);
    try
    {
      this.nf = new bm(this.pC.qe);
      return;
    }
    catch (JSONException localJSONException)
    {
    }
    throw new dn.a("Could not parse mediation config: " + this.pC.qe, 0);
  }

  private boolean c(long paramLong)
  {
    long l = 60000L - (SystemClock.elapsedRealtime() - paramLong);
    if (l <= 0L)
      return false;
    try
    {
      this.ls.wait(l);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    throw new dn.a("Ad request cancelled.", -1);
  }

  private void e(long paramLong)
  {
    et.sv.post(new Runnable()
    {
      public void run()
      {
        while (true)
        {
          synchronized (dn.a(dn.this))
          {
            if (dn.c(dn.this).errorCode != -2)
              return;
            dn.d(dn.this).cb().a(dn.this);
            if (dn.c(dn.this).errorCode == -3)
            {
              eu.C("Loading URL in WebView: " + dn.c(dn.this).oA);
              dn.d(dn.this).loadUrl(dn.c(dn.this).oA);
              return;
            }
          }
          eu.C("Loading HTML in WebView.");
          dn.d(dn.this).loadDataWithBaseURL(eo.v(dn.c(dn.this).oA), dn.c(dn.this).qe, "text/html", "UTF-8", null);
        }
      }
    });
    h(paramLong);
  }

  private void g(long paramLong)
  {
    do
      if (!c(paramLong))
        throw new dn.a("Timed out waiting for ad response.", 2);
    while (this.pC == null);
    synchronized (this.py)
    {
      this.pB = null;
      if ((this.pC.errorCode != -2) && (this.pC.errorCode != -3))
        throw new dn.a("There was a problem getting an ad response. ErrorCode: " + this.pC.errorCode, this.pC.errorCode);
    }
  }

  private void h(long paramLong)
  {
    do
      if (!c(paramLong))
        throw new dn.a("Timed out waiting for WebView to finish loading.", 2);
    while (!this.pD);
  }

  public void a(du paramdu)
  {
    synchronized (this.ls)
    {
      eu.z("Received ad response.");
      this.pC = paramdu;
      this.ls.notify();
      return;
    }
  }

  public void a(ex paramex)
  {
    synchronized (this.ls)
    {
      eu.z("WebView finished loading.");
      this.pD = true;
      this.ls.notify();
      return;
    }
  }

  public void bh()
  {
    ds localds;
    al localal1;
    int i;
    long l1;
    long l4;
    label154: long l2;
    al localal2;
    synchronized (this.ls)
    {
      eu.z("AdLoaderBackgroundTask started.");
      g localg = this.pA.z();
      String str1 = localg.b(this.mContext);
      String str2 = localg.a(this.mContext);
      localds = new ds(this.pz, str1, str2);
      localal1 = null;
      i = -2;
      l1 = -1L;
      try
      {
        l4 = SystemClock.elapsedRealtime();
        em localem = dp.a(this.mContext, localds, this);
        synchronized (this.py)
        {
          this.pB = localem;
          if (this.pB != null)
            break label479;
          throw new dn.a("Could not start the ad request service.", 0);
        }
      }
      catch (dn.a locala)
      {
        i = locala.getErrorCode();
        if (i == 3)
          break label154;
      }
      if (i == -1)
      {
        eu.B(locala.getMessage());
        if (this.pC != null)
          break label612;
        this.pC = new du(i);
        et.sv.post(new Runnable()
        {
          public void run()
          {
            dn.this.onStop();
          }
        });
        l2 = l1;
        localal2 = localal1;
        label205: boolean bool1 = TextUtils.isEmpty(this.pC.qo);
        if (bool1)
          break label645;
      }
    }
    while (true)
    {
      try
      {
        String str5 = this.pC.qo;
        localJSONObject = new JSONObject(str5);
        ai localai = localds.pX;
        ex localex = this.lN;
        List localList1 = this.pC.nt;
        List localList2 = this.pC.nu;
        List localList3 = this.pC.qi;
        int j = this.pC.orientation;
        long l3 = this.pC.nx;
        String str3 = localds.qa;
        boolean bool2 = this.pC.qg;
        if (this.pF == null)
          break label651;
        localbl = this.pF.nM;
        if (this.pF == null)
          break label657;
        localbu = this.pF.nN;
        if (this.pF == null)
          break label663;
        str4 = this.pF.nO;
        bm localbm = this.nf;
        if (this.pF == null)
          break label669;
        localbo = this.pF.nP;
        final ef localef = new ef(localai, localex, localList1, i, localList2, localList3, j, l3, str3, bool2, localbl, localbu, str4, localbm, localbo, this.pC.qh, localal2, this.pC.qf, l2, this.pC.qk, this.pC.ql, localJSONObject);
        et.sv.post(new Runnable()
        {
          public void run()
          {
            synchronized (dn.a(dn.this))
            {
              dn.b(dn.this).a(localef);
              return;
            }
          }
        });
        return;
        label479: g(l4);
        l1 = SystemClock.elapsedRealtime();
        bn();
        al[] arrayOfal = localds.kT.mg;
        localal1 = null;
        if (arrayOfal != null)
          localal1 = a(localds);
        if (this.pC.qg)
        {
          a(localds, l4);
          l2 = l1;
          localal2 = localal1;
          break label205;
        }
        if (this.pC.qm)
        {
          f(l4);
          l2 = l1;
          localal2 = localal1;
          break label205;
        }
        e(l4);
        l2 = l1;
        localal2 = localal1;
        break label205;
        eu.D(locala.getMessage());
        break;
        localObject2 = finally;
        throw localObject2;
        label612: this.pC = new du(i, this.pC.nx);
      }
      catch (Exception localException)
      {
        eu.b("Error parsing the JSON for Active View.", localException);
      }
      label645: JSONObject localJSONObject = null;
      continue;
      label651: bl localbl = null;
      continue;
      label657: bu localbu = null;
      continue;
      label663: String str4 = null;
      continue;
      label669: bo localbo = null;
    }
  }

  protected void f(long paramLong)
  {
    al localal = this.lN.V();
    int i;
    if (localal.mf)
      i = this.mContext.getResources().getDisplayMetrics().widthPixels;
    final do localdo;
    for (int j = this.mContext.getResources().getDisplayMetrics().heightPixels; ; j = localal.heightPixels)
    {
      localdo = new do(this, this.lN, i, j);
      et.sv.post(new Runnable()
      {
        public void run()
        {
          synchronized (dn.a(dn.this))
          {
            if (dn.c(dn.this).errorCode != -2)
              return;
            dn.d(dn.this).cb().a(dn.this);
            localdo.b(dn.c(dn.this));
            return;
          }
        }
      });
      h(paramLong);
      if (!localdo.bq())
        break;
      eu.z("Ad-Network indicated no fill with passback URL.");
      throw new dn.a("AdNetwork sent passback url", 3);
      i = localal.widthPixels;
    }
    if (!localdo.br())
      throw new dn.a("AdNetwork timed out", 2);
  }

  public void onStop()
  {
    synchronized (this.py)
    {
      if (this.pB != null)
        this.pB.cancel();
      this.lN.stopLoading();
      eo.a(this.lN);
      if (this.pE != null)
        this.pE.cancel();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dn
 * JD-Core Version:    0.6.2
 */