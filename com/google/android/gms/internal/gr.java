package com.google.android.gms.internal;

import android.os.SystemClock;
import org.json.JSONObject;

public final class gr
{
  private static final gn BG = new gn("RequestTracker");
  public static final Object CN = new Object();
  private long CJ;
  private long CK;
  private long CL;
  private gq CM;

  public gr(long paramLong)
  {
    this.CJ = paramLong;
    this.CK = -1L;
    this.CL = 0L;
  }

  private void eu()
  {
    this.CK = -1L;
    this.CM = null;
    this.CL = 0L;
  }

  public final void a(long paramLong, gq paramgq)
  {
    synchronized (CN)
    {
      gq localgq = this.CM;
      long l = this.CK;
      this.CK = paramLong;
      this.CM = paramgq;
      this.CL = SystemClock.elapsedRealtime();
      if (localgq != null)
        localgq.n(l);
      return;
    }
  }

  public final boolean b(long paramLong, int paramInt, JSONObject paramJSONObject)
  {
    for (boolean bool = true; ; bool = false)
    {
      synchronized (CN)
      {
        if ((this.CK != -1L) && (this.CK == paramLong))
        {
          gn localgn = BG;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Long.valueOf(this.CK);
          localgn.b("request %d completed", arrayOfObject);
          localgq = this.CM;
          eu();
          if (localgq != null)
            localgq.a(paramLong, paramInt, paramJSONObject);
          return bool;
        }
      }
      gq localgq = null;
    }
  }

  public final boolean c(long paramLong, int paramInt)
  {
    return b(paramLong, paramInt, null);
  }

  public final void clear()
  {
    synchronized (CN)
    {
      if (this.CK != -1L)
        eu();
      return;
    }
  }

  public final boolean d(long paramLong, int paramInt)
  {
    boolean bool = true;
    long l = 0L;
    while (true)
    {
      synchronized (CN)
      {
        if ((this.CK != -1L) && (paramLong - this.CL >= this.CJ))
        {
          gn localgn = BG;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Long.valueOf(this.CK);
          localgn.b("request %d timed out", arrayOfObject);
          l = this.CK;
          localgq = this.CM;
          eu();
          if (localgq != null)
            localgq.a(l, paramInt, null);
          return bool;
        }
      }
      gq localgq = null;
      bool = false;
    }
  }

  public final boolean ev()
  {
    synchronized (CN)
    {
      if (this.CK != -1L)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }

  public final boolean p(long paramLong)
  {
    synchronized (CN)
    {
      if ((this.CK != -1L) && (this.CK == paramLong))
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gr
 * JD-Core Version:    0.6.2
 */