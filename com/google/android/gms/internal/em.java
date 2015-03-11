package com.google.android.gms.internal;

public abstract class em
{
  private final Runnable lg = new Runnable()
  {
    public final void run()
    {
      em.a(em.this, Thread.currentThread());
      em.this.bh();
    }
  };
  private volatile Thread sf;

  public abstract void bh();

  public final void cancel()
  {
    onStop();
    if (this.sf != null)
      this.sf.interrupt();
  }

  public abstract void onStop();

  public final void start()
  {
    en.execute(this.lg);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.em
 * JD-Core Version:    0.6.2
 */