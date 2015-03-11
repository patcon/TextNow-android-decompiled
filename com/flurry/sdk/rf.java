package com.flurry.sdk;

public abstract class rf<T>
{
  T a;
  rf.a<T> b;
  rf.a<T> c;
  int d;

  public T a()
  {
    b();
    if (this.a == null)
      return b(12);
    return this.a;
  }

  public final T a(T paramT, int paramInt)
  {
    rf.a locala = new rf.a(paramT, paramInt);
    if (this.b == null)
    {
      this.c = locala;
      this.b = locala;
      this.d = (paramInt + this.d);
      if (paramInt >= 16384)
        break label72;
    }
    label72: for (int i = paramInt + paramInt; ; i = paramInt + (paramInt >> 2))
    {
      return b(i);
      this.c.a(locala);
      this.c = locala;
      break;
    }
  }

  protected abstract T b(int paramInt);

  public T b(T paramT, int paramInt)
  {
    int i = paramInt + this.d;
    Object localObject = b(i);
    rf.a locala = this.b;
    int j = 0;
    while (locala != null)
    {
      j = locala.a(localObject, j);
      locala = locala.b();
    }
    System.arraycopy(paramT, 0, localObject, j, paramInt);
    int k = j + paramInt;
    if (k != i)
      throw new IllegalStateException("Should have gotten " + i + " entries, got " + k);
    return localObject;
  }

  protected void b()
  {
    if (this.c != null)
      this.a = this.c.a();
    this.c = null;
    this.b = null;
    this.d = 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.rf
 * JD-Core Version:    0.6.2
 */