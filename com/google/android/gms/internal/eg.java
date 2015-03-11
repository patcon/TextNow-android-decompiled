package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class eg
{
  private final Object ls = new Object();
  private boolean qO = false;
  private final eh rD;
  private final LinkedList<eg.a> rE;
  private final String rF;
  private final String rG;
  private long rH = -1L;
  private long rI = -1L;
  private long rJ = -1L;
  private long rK = 0L;
  private long rL = -1L;
  private long rM = -1L;

  public eg(eh parameh, String paramString1, String paramString2)
  {
    this.rD = parameh;
    this.rF = paramString1;
    this.rG = paramString2;
    this.rE = new LinkedList();
  }

  public eg(String paramString1, String paramString2)
  {
    this(eh.bH(), paramString1, paramString2);
  }

  public void bB()
  {
    synchronized (this.ls)
    {
      if ((this.rM != -1L) && (this.rI == -1L))
      {
        this.rI = SystemClock.elapsedRealtime();
        this.rD.a(this);
      }
      eh.bK().bB();
      return;
    }
  }

  public void bC()
  {
    synchronized (this.ls)
    {
      if (this.rM != -1L)
      {
        eg.a locala = new eg.a();
        locala.bG();
        this.rE.add(locala);
        this.rK = (1L + this.rK);
        eh.bK().bC();
        this.rD.a(this);
      }
      return;
    }
  }

  public void bD()
  {
    synchronized (this.ls)
    {
      if ((this.rM != -1L) && (!this.rE.isEmpty()))
      {
        eg.a locala = (eg.a)this.rE.getLast();
        if (locala.bE() == -1L)
        {
          locala.bF();
          this.rD.a(this);
        }
      }
      return;
    }
  }

  public void f(ai paramai)
  {
    synchronized (this.ls)
    {
      this.rL = SystemClock.elapsedRealtime();
      eh.bK().b(paramai, this.rL);
      return;
    }
  }

  public void j(long paramLong)
  {
    synchronized (this.ls)
    {
      this.rM = paramLong;
      if (this.rM != -1L)
        this.rD.a(this);
      return;
    }
  }

  public void k(long paramLong)
  {
    synchronized (this.ls)
    {
      if (this.rM != -1L)
      {
        this.rH = paramLong;
        this.rD.a(this);
      }
      return;
    }
  }

  public void n(boolean paramBoolean)
  {
    synchronized (this.ls)
    {
      if (this.rM != -1L)
      {
        this.rJ = SystemClock.elapsedRealtime();
        if (!paramBoolean)
        {
          this.rI = this.rJ;
          this.rD.a(this);
        }
      }
      return;
    }
  }

  public void o(boolean paramBoolean)
  {
    synchronized (this.ls)
    {
      if (this.rM != -1L)
      {
        this.qO = paramBoolean;
        this.rD.a(this);
      }
      return;
    }
  }

  public Bundle toBundle()
  {
    Bundle localBundle;
    ArrayList localArrayList;
    synchronized (this.ls)
    {
      localBundle = new Bundle();
      localBundle.putString("seqnum", this.rF);
      localBundle.putString("slotid", this.rG);
      localBundle.putBoolean("ismediation", this.qO);
      localBundle.putLong("treq", this.rL);
      localBundle.putLong("tresponse", this.rM);
      localBundle.putLong("timp", this.rI);
      localBundle.putLong("tload", this.rJ);
      localBundle.putLong("pcc", this.rK);
      localBundle.putLong("tfetch", this.rH);
      localArrayList = new ArrayList();
      Iterator localIterator = this.rE.iterator();
      if (localIterator.hasNext())
        localArrayList.add(((eg.a)localIterator.next()).toBundle());
    }
    localBundle.putParcelableArrayList("tclick", localArrayList);
    return localBundle;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eg
 * JD-Core Version:    0.6.2
 */