package textnow.f;

import android.os.Build.VERSION;
import java.util.List;

public final class o
{
  private static final p a = new s();
  private final Object b;

  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new r();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new q();
      return;
    }
  }

  public o()
  {
    this.b = a.a(this);
  }

  public o(Object paramObject)
  {
    this.b = paramObject;
  }

  public static e b()
  {
    return null;
  }

  public static boolean c()
  {
    return false;
  }

  public static List<e> d()
  {
    return null;
  }

  public static e e()
  {
    return null;
  }

  public final Object a()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.f.o
 * JD-Core Version:    0.6.2
 */