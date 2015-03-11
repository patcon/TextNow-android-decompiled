package com.google.android.gms.internal;

@ez
public final class co extends cv.a
{
  private final Object mw = new Object();
  private cq.a qm;
  private cn qn;

  public final void a(cn paramcn)
  {
    synchronized (this.mw)
    {
      this.qn = paramcn;
      return;
    }
  }

  public final void a(cq.a parama)
  {
    synchronized (this.mw)
    {
      this.qm = parama;
      return;
    }
  }

  public final void onAdClicked()
  {
    synchronized (this.mw)
    {
      if (this.qn != null)
        this.qn.ae();
      return;
    }
  }

  public final void onAdClosed()
  {
    synchronized (this.mw)
    {
      if (this.qn != null)
        this.qn.af();
      return;
    }
  }

  public final void onAdFailedToLoad(int paramInt)
  {
    synchronized (this.mw)
    {
      if (this.qm != null)
      {
        if (paramInt == 3)
        {
          i = 1;
          this.qm.j(i);
          this.qm = null;
        }
      }
      else
        return;
      int i = 2;
    }
  }

  public final void onAdLeftApplication()
  {
    synchronized (this.mw)
    {
      if (this.qn != null)
        this.qn.ag();
      return;
    }
  }

  public final void onAdLoaded()
  {
    synchronized (this.mw)
    {
      if (this.qm != null)
      {
        this.qm.j(0);
        this.qm = null;
        return;
      }
      if (this.qn != null)
        this.qn.ai();
      return;
    }
  }

  public final void onAdOpened()
  {
    synchronized (this.mw)
    {
      if (this.qn != null)
        this.qn.ah();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.co
 * JD-Core Version:    0.6.2
 */