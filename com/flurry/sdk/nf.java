package com.flurry.sdk;

public final class nf
{
  protected final Class<?> a;
  protected final int b;
  protected String c;

  public nf(Class<?> paramClass, String paramString)
  {
    this.a = paramClass;
    this.b = paramClass.getName().hashCode();
    a(paramString);
  }

  public final Class<?> a()
  {
    return this.a;
  }

  public final void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      paramString = null;
    this.c = paramString;
  }

  public final String b()
  {
    return this.c;
  }

  public final boolean c()
  {
    return this.c != null;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
    }
    while (this.a == ((nf)paramObject).a);
    return false;
  }

  public final int hashCode()
  {
    return this.b;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append("[NamedType, class ").append(this.a.getName()).append(", name: ");
    if (this.c == null);
    for (String str = "null"; ; str = "'" + this.c + "'")
      return str + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.nf
 * JD-Core Version:    0.6.2
 */