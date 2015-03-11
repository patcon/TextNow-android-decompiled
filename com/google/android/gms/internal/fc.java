package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

@ez
public class fc
  implements Runnable
{
  private final int lf;
  private final int lg;
  protected final gv md;
  private final Handler td;
  private final long te;
  private long tf;
  private gw.a tg;
  protected boolean th;
  protected boolean ti;

  public fc(gw.a parama, gv paramgv, int paramInt1, int paramInt2)
  {
    this(parama, paramgv, paramInt1, paramInt2, 200L, 50L);
  }

  public fc(gw.a parama, gv paramgv, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    this.te = paramLong1;
    this.tf = paramLong2;
    this.td = new Handler(Looper.getMainLooper());
    this.md = paramgv;
    this.tg = parama;
    this.th = false;
    this.ti = false;
    this.lg = paramInt2;
    this.lf = paramInt1;
  }

  public void a(fk paramfk, ha paramha)
  {
    this.md.setWebViewClient(paramha);
    gv localgv = this.md;
    if (TextUtils.isEmpty(paramfk.rP));
    for (String str = null; ; str = gj.L(paramfk.rP))
    {
      localgv.loadDataWithBaseURL(str, paramfk.tG, "text/html", "UTF-8", null);
      return;
    }
  }

  public void b(fk paramfk)
  {
    a(paramfk, new ha(this, this.md, paramfk.tP));
  }

  public boolean cA()
  {
    try
    {
      boolean bool = this.th;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean cB()
  {
    return this.ti;
  }

  public void cy()
  {
    this.td.postDelayed(this, this.te);
  }

  public void cz()
  {
    try
    {
      this.th = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void run()
  {
    if ((this.md == null) || (cA()))
    {
      this.tg.a(this.md);
      return;
    }
    new fc.a(this, this.md).execute(new Void[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fc
 * JD-Core Version:    0.6.2
 */