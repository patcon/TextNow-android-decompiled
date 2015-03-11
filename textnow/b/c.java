package textnow.b;

import android.content.Context;
import android.provider.Settings.Secure;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.UUID;

public final class c
{
  private static String a = null;

  public c(Context paramContext)
  {
    if (a != null)
      return;
    String str1;
    if (paramContext != null)
    {
      str1 = h.a(paramContext, "uuid");
      if ((str1 == null) || (str1.length() != 32));
    }
    while (true)
    {
      a = str1;
      if (str1 != null)
        h.a(paramContext, "uuid", a);
      if (a == null)
        a = b();
      if (a == null)
      {
        String str2 = null;
        if (paramContext != null)
        {
          String str3 = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
          boolean bool = a(str3);
          str2 = null;
          if (bool)
            str2 = h.a(str3);
        }
        a = str2;
      }
      if (a == null)
        a = c();
      if (a != null)
        break;
      a = UUID.randomUUID().toString().replace("-", "");
      h.a(paramContext, "uuid", a);
      return;
      str1 = null;
    }
  }

  public static String a()
  {
    return a;
  }

  private static boolean a(String paramString)
  {
    if ((paramString == null) || (paramString.length() < 4) || (paramString.equalsIgnoreCase("unknown")));
    int j;
    do
    {
      do
        return false;
      while (paramString.equalsIgnoreCase("9774d56d682e549c"));
      int i = 0;
      j = 0;
      int k = 0;
      while (i < paramString.length())
      {
        int m = paramString.codePointAt(i);
        if (i == 0)
          k = m;
        if (k == m)
          j++;
        i++;
      }
    }
    while (j == paramString.length());
    return true;
  }

  private static String b()
  {
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      String str1 = (String)localClass.getMethod("get", new Class[] { String.class }).invoke(localClass, new Object[] { "ro.serialno" });
      if (a(str1))
      {
        String str2 = h.a(str1);
        return str2;
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  private static String c()
  {
    try
    {
      String str1 = (String)Class.forName("android.os.Build").getDeclaredField("SERIAL").get(null);
      if (a(str1))
      {
        String str2 = h.a(str1);
        return str2;
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.b.c
 * JD-Core Version:    0.6.2
 */