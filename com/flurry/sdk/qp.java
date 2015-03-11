package com.flurry.sdk;

public final class qp extends qq
{
  protected final sh[] a;
  protected final String[] b;

  protected qp(Class<?> paramClass)
  {
    this(paramClass, null, null, null, null);
  }

  protected qp(Class<?> paramClass, String[] paramArrayOfString, sh[] paramArrayOfsh, Object paramObject1, Object paramObject2)
  {
    super(paramClass, 0, paramObject1, paramObject2);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      this.b = null;
      this.a = null;
      return;
    }
    this.b = paramArrayOfString;
    this.a = paramArrayOfsh;
  }

  public static qp d(Class<?> paramClass)
  {
    return new qp(paramClass, null, null, null, null);
  }

  public final qp a(Object paramObject)
  {
    return new qp(this.d, this.b, this.a, this.f, paramObject);
  }

  protected final sh a(Class<?> paramClass)
  {
    return new qp(paramClass, this.b, this.a, this.f, this.g);
  }

  protected final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.d.getName());
    if ((this.a != null) && (this.a.length > 0))
    {
      localStringBuilder.append('<');
      int i = 1;
      sh[] arrayOfsh = this.a;
      int j = arrayOfsh.length;
      int k = 0;
      if (k < j)
      {
        sh localsh = arrayOfsh[k];
        if (i != 0)
          i = 0;
        while (true)
        {
          localStringBuilder.append(localsh.m());
          k++;
          break;
          localStringBuilder.append(',');
        }
      }
      localStringBuilder.append('>');
    }
    return localStringBuilder.toString();
  }

  public final String a(int paramInt)
  {
    if ((paramInt < 0) || (this.b == null) || (paramInt >= this.b.length))
      return null;
    return this.b[paramInt];
  }

  public final qp b(Object paramObject)
  {
    if (paramObject == this.f)
      return this;
    return new qp(this.d, this.b, this.a, paramObject, this.g);
  }

  public final sh b(int paramInt)
  {
    if ((paramInt < 0) || (this.a == null) || (paramInt >= this.a.length))
      return null;
    return this.a[paramInt];
  }

  public final sh b(Class<?> paramClass)
  {
    throw new IllegalArgumentException("Internal error: SimpleType.narrowContentsBy() should never be called");
  }

  public final sh c(Class<?> paramClass)
  {
    throw new IllegalArgumentException("Internal error: SimpleType.widenContentsBy() should never be called");
  }

  public final sh e(Object paramObject)
  {
    throw new IllegalArgumentException("Simple types have no content types; can not call withContenTypeHandler()");
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    while (true)
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
      qp localqp = (qp)paramObject;
      if (localqp.d != this.d)
        return false;
      sh[] arrayOfsh1 = this.a;
      sh[] arrayOfsh2 = localqp.a;
      if (arrayOfsh1 == null)
      {
        if ((arrayOfsh2 != null) && (arrayOfsh2.length != 0))
          return false;
      }
      else
      {
        if (arrayOfsh2 == null)
          return false;
        if (arrayOfsh1.length != arrayOfsh2.length)
          return false;
        int i = arrayOfsh1.length;
        for (int j = 0; j < i; j++)
          if (!arrayOfsh1[j].equals(arrayOfsh2[j]))
            return false;
      }
    }
  }

  public final boolean f()
  {
    return false;
  }

  public final int h()
  {
    if (this.a == null)
      return 0;
    return this.a.length;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(40);
    localStringBuilder.append("[simple type, class ").append(a()).append(']');
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qp
 * JD-Core Version:    0.6.2
 */