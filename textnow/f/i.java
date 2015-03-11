package textnow.f;

import android.os.Build.VERSION;
import java.util.List;

public final class i
{
  private static final j a = new m();
  private final Object b;

  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new l();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new k();
      return;
    }
  }

  public i()
  {
    this.b = a.a(this);
  }

  public i(Object paramObject)
  {
    this.b = paramObject;
  }

  public static a b()
  {
    return null;
  }

  public static boolean c()
  {
    return false;
  }

  public static List<a> d()
  {
    return null;
  }

  public static a e()
  {
    return null;
  }

  public final Object a()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.f.i
 * JD-Core Version:    0.6.2
 */