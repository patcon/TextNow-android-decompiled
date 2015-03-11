package com.enflick.android.TextNow.tasks;

public final class b
{
  private long a;
  private int b;
  private long c;
  private float d;

  public final long a()
  {
    return this.a;
  }

  public final void a(int paramInt)
  {
    this.b = paramInt;
  }

  public final void a(long paramLong)
  {
    this.a = paramLong;
  }

  public final int b()
  {
    return this.b;
  }

  public final void b(long paramLong)
  {
    this.c = paramLong;
  }

  public final float c()
  {
    if (this.c > 0L)
      return 1000.0F * (this.b / 1024.0F) / (float)this.c;
    return 0.0F;
  }

  public final float d()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.b
 * JD-Core Version:    0.6.2
 */