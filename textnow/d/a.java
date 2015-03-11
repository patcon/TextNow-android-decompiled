package textnow.d;

import android.os.Build.VERSION;

public final class a
{
  private static final b a = new c();

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new d();
      return;
    }
  }

  public static String a(String paramString)
  {
    return a.a(paramString);
  }

  public static String b(String paramString)
  {
    return a.b(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.d.a
 * JD-Core Version:    0.6.2
 */