package com.google.android.gms.internal;

import java.util.Map;

public final class dz
{
  private ex lN;
  private final Object ls = new Object();
  private int pJ = -2;
  private String qB;
  private eb qC;
  public final bc qD = new bc()
  {
    public void b(ex paramAnonymousex, Map<String, String> paramAnonymousMap)
    {
      synchronized (dz.a(dz.this))
      {
        eb localeb = new eb(paramAnonymousMap);
        eu.D("Invalid " + localeb.getType() + " request error: " + localeb.by());
        dz.a(dz.this, 1);
        dz.a(dz.this).notify();
        return;
      }
    }
  };
  public final bc qE = new bc()
  {
    public void b(ex paramAnonymousex, Map<String, String> paramAnonymousMap)
    {
      synchronized (dz.a(dz.this))
      {
        eb localeb = new eb(paramAnonymousMap);
        String str1 = localeb.getUrl();
        if (str1 == null)
        {
          eu.D("URL missing in loadAdUrl GMSG.");
          return;
        }
        if (str1.contains("%40mediation_adapters%40"))
        {
          String str2 = str1.replaceAll("%40mediation_adapters%40", el.a(paramAnonymousex.getContext(), (String)paramAnonymousMap.get("check_adapters"), dz.b(dz.this)));
          eu.C("Ad request URL modified to " + str2);
        }
        dz.a(dz.this, localeb);
        dz.a(dz.this).notify();
        return;
      }
    }
  };

  public dz(String paramString)
  {
    this.qB = paramString;
  }

  public final void b(ex paramex)
  {
    synchronized (this.ls)
    {
      this.lN = paramex;
      return;
    }
  }

  public final eb bx()
  {
    synchronized (this.ls)
    {
      while (this.qC == null)
      {
        int i = this.pJ;
        if (i == -2)
          try
          {
            this.ls.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            eu.D("Ad request service was interrupted.");
            return null;
          }
      }
      eb localeb = this.qC;
      return localeb;
    }
  }

  public final int getErrorCode()
  {
    synchronized (this.ls)
    {
      int i = this.pJ;
      return i;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dz
 * JD-Core Version:    0.6.2
 */