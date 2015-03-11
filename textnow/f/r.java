package textnow.f;

import android.os.Build.VERSION;

public final class r
{
  private static final u a = new w();
  private final Object b;

  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new v();
      return;
    }
    if (Build.VERSION.SDK_INT >= 15)
    {
      a = new t();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new s();
      return;
    }
  }

  private r(Object paramObject)
  {
    this.b = paramObject;
  }

  public static r a()
  {
    return new r(a.a());
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
    r localr;
    do
    {
      do
      {
        return true;
        if (paramObject == null)
          return false;
        if (getClass() != paramObject.getClass())
          return false;
        localr = (r)paramObject;
        if (this.b != null)
          break;
      }
      while (localr.b == null);
      return false;
    }
    while (this.b.equals(localr.b));
    return false;
  }

  public final int hashCode()
  {
    if (this.b == null)
      return 0;
    return this.b.hashCode();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.f.r
 * JD-Core Version:    0.6.2
 */