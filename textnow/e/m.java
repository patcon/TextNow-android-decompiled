package textnow.e;

public final class m<E>
  implements Cloneable
{
  private static final Object a = new Object();
  private boolean b = false;
  private int[] c;
  private Object[] d;
  private int e;

  public m()
  {
    this(10);
  }

  private m(int paramInt)
  {
    int i = b.a(10);
    this.c = new int[i];
    this.d = new Object[i];
    this.e = 0;
  }

  // ERROR //
  private m<E> c()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 47	java/lang/Object:clone	()Ljava/lang/Object;
    //   4: checkcast 2	textnow/e/m
    //   7: astore_2
    //   8: aload_2
    //   9: aload_0
    //   10: getfield 36	textnow/e/m:c	[I
    //   13: invokevirtual 49	[I:clone	()Ljava/lang/Object;
    //   16: checkcast 48	[I
    //   19: putfield 36	textnow/e/m:c	[I
    //   22: aload_2
    //   23: aload_0
    //   24: getfield 38	textnow/e/m:d	[Ljava/lang/Object;
    //   27: invokevirtual 51	[Ljava/lang/Object;:clone	()Ljava/lang/Object;
    //   30: checkcast 50	[Ljava/lang/Object;
    //   33: putfield 38	textnow/e/m:d	[Ljava/lang/Object;
    //   36: aload_2
    //   37: areturn
    //   38: astore_1
    //   39: aconst_null
    //   40: areturn
    //   41: astore_3
    //   42: aload_2
    //   43: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	8	38	java/lang/CloneNotSupportedException
    //   8	36	41	java/lang/CloneNotSupportedException
  }

  private void d()
  {
    int i = this.e;
    int[] arrayOfInt = this.c;
    Object[] arrayOfObject = this.d;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Object localObject = arrayOfObject[j];
      if (localObject != a)
      {
        if (j != k)
        {
          arrayOfInt[k] = arrayOfInt[j];
          arrayOfObject[k] = localObject;
          arrayOfObject[j] = null;
        }
        k++;
      }
      j++;
    }
    this.b = false;
    this.e = k;
  }

  public final int a()
  {
    if (this.b)
      d();
    return this.e;
  }

  public final E a(int paramInt)
  {
    int i = b.a(this.c, this.e, paramInt);
    if ((i < 0) || (this.d[i] == a))
      return null;
    return this.d[i];
  }

  public final void a(int paramInt, E paramE)
  {
    int i = b.a(this.c, this.e, paramInt);
    if (i >= 0)
    {
      this.d[i] = paramE;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.e) && (this.d[j] == a))
    {
      this.c[j] = paramInt;
      this.d[j] = paramE;
      return;
    }
    if ((this.b) && (this.e >= this.c.length))
    {
      d();
      j = 0xFFFFFFFF ^ b.a(this.c, this.e, paramInt);
    }
    if (this.e >= this.c.length)
    {
      int k = b.a(1 + this.e);
      int[] arrayOfInt = new int[k];
      Object[] arrayOfObject = new Object[k];
      System.arraycopy(this.c, 0, arrayOfInt, 0, this.c.length);
      System.arraycopy(this.d, 0, arrayOfObject, 0, this.d.length);
      this.c = arrayOfInt;
      this.d = arrayOfObject;
    }
    if (this.e - j != 0)
    {
      System.arraycopy(this.c, j, this.c, j + 1, this.e - j);
      System.arraycopy(this.d, j, this.d, j + 1, this.e - j);
    }
    this.c[j] = paramInt;
    this.d[j] = paramE;
    this.e = (1 + this.e);
  }

  public final void b()
  {
    int i = this.e;
    Object[] arrayOfObject = this.d;
    for (int j = 0; j < i; j++)
      arrayOfObject[j] = null;
    this.e = 0;
    this.b = false;
  }

  public final void b(int paramInt)
  {
    int i = b.a(this.c, this.e, paramInt);
    if ((i >= 0) && (this.d[i] != a))
    {
      this.d[i] = a;
      this.b = true;
    }
  }

  public final void c(int paramInt)
  {
    if (this.d[paramInt] != a)
    {
      this.d[paramInt] = a;
      this.b = true;
    }
  }

  public final int d(int paramInt)
  {
    if (this.b)
      d();
    return this.c[paramInt];
  }

  public final E e(int paramInt)
  {
    if (this.b)
      d();
    return this.d[paramInt];
  }

  public final int f(int paramInt)
  {
    if (this.b)
      d();
    return b.a(this.c, this.e, paramInt);
  }

  public final String toString()
  {
    if (a() <= 0)
      return "{}";
    StringBuilder localStringBuilder = new StringBuilder(28 * this.e);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.e)
    {
      if (i > 0)
        localStringBuilder.append(", ");
      localStringBuilder.append(d(i));
      localStringBuilder.append('=');
      Object localObject = e(i);
      if (localObject != this)
        localStringBuilder.append(localObject);
      while (true)
      {
        i++;
        break;
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.e.m
 * JD-Core Version:    0.6.2
 */