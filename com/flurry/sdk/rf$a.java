package com.flurry.sdk;

final class rf$a<T>
{
  final T a;
  final int b;
  a<T> c;

  public rf$a(T paramT, int paramInt)
  {
    this.a = paramT;
    this.b = paramInt;
  }

  public final int a(T paramT, int paramInt)
  {
    System.arraycopy(this.a, 0, paramT, paramInt, this.b);
    return paramInt + this.b;
  }

  public final T a()
  {
    return this.a;
  }

  public final void a(a<T> parama)
  {
    if (this.c != null)
      throw new IllegalStateException();
    this.c = parama;
  }

  public final a<T> b()
  {
    return this.c;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.rf.a
 * JD-Core Version:    0.6.2
 */