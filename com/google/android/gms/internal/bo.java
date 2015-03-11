package com.google.android.gms.internal;

public final class bo extends bv.a
{
  private final Object ls = new Object();
  private bq.a nA;
  private bn nB;

  public final void a(bn parambn)
  {
    synchronized (this.ls)
    {
      this.nB = parambn;
      return;
    }
  }

  public final void a(bq.a parama)
  {
    synchronized (this.ls)
    {
      this.nA = parama;
      return;
    }
  }

  public final void onAdClicked()
  {
    synchronized (this.ls)
    {
      if (this.nB != null)
        this.nB.ab();
      return;
    }
  }

  public final void onAdClosed()
  {
    synchronized (this.ls)
    {
      if (this.nB != null)
        this.nB.ac();
      return;
    }
  }

  public final void onAdFailedToLoad(int paramInt)
  {
    synchronized (this.ls)
    {
      if (this.nA != null)
      {
        if (paramInt == 3)
        {
          i = 1;
          this.nA.g(i);
          this.nA = null;
        }
      }
      else
        return;
      int i = 2;
    }
  }

  public final void onAdLeftApplication()
  {
    synchronized (this.ls)
    {
      if (this.nB != null)
        this.nB.ad();
      return;
    }
  }

  public final void onAdLoaded()
  {
    synchronized (this.ls)
    {
      if (this.nA != null)
      {
        this.nA.g(0);
        this.nA = null;
        return;
      }
      if (this.nB != null)
        this.nB.af();
      return;
    }
  }

  public final void onAdOpened()
  {
    synchronized (this.ls)
    {
      if (this.nB != null)
        this.nB.ae();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bo
 * JD-Core Version:    0.6.2
 */