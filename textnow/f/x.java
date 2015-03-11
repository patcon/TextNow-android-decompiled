package textnow.f;

import android.os.Build.VERSION;

public final class x
{
  private static final aa a = new ac();
  private final Object b;

  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new ab();
      return;
    }
    if (Build.VERSION.SDK_INT >= 15)
    {
      a = new z();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new y();
      return;
    }
  }

  public x(Object paramObject)
  {
    this.b = paramObject;
  }

  public static x a()
  {
    return new x(a.a());
  }

  public final void a(int paramInt)
  {
    a.b(this.b, paramInt);
  }

  public final void a(boolean paramBoolean)
  {
    a.a(this.b, paramBoolean);
  }

  public final void b(int paramInt)
  {
    a.a(this.b, paramInt);
  }

  public final void c(int paramInt)
  {
    a.c(this.b, paramInt);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    x localx;
    do
    {
      do
      {
        return true;
        if (paramObject == null)
          return false;
        if (getClass() != paramObject.getClass())
          return false;
        localx = (x)paramObject;
        if (this.b != null)
          break;
      }
      while (localx.b == null);
      return false;
    }
    while (this.b.equals(localx.b));
    return false;
  }

  public final int hashCode()
  {
    if (this.b == null)
      return 0;
    return this.b.hashCode();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.f.x
 * JD-Core Version:    0.6.2
 */