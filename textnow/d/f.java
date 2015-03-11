package textnow.d;

import java.util.Locale;

public final class f
{
  public static final Locale a = new Locale("", "");
  private static String b = "Arab";
  private static String c = "Hebr";

  public static int a(Locale paramLocale)
  {
    int i = 1;
    if ((paramLocale != null) && (!paramLocale.equals(a)))
    {
      String str = a.a(a.b(paramLocale.toString()));
      if (str == null)
        switch (Character.getDirectionality(paramLocale.getDisplayName(paramLocale).charAt(0)))
        {
        default:
          i = 0;
        case 1:
        case 2:
        }
      while ((str.equalsIgnoreCase(b)) || (str.equalsIgnoreCase(c)))
        return i;
    }
    return 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.d.f
 * JD-Core Version:    0.6.2
 */