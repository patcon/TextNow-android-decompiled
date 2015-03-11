package textnow.d;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class e
{
  private static Method a;
  private static Method b;

  static
  {
    try
    {
      Class localClass = Class.forName("libcore.icu.ICU");
      if (localClass != null)
      {
        a = localClass.getMethod("getScript", new Class[] { String.class });
        b = localClass.getMethod("addLikelySubtags", new Class[] { String.class });
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static String a(String paramString)
  {
    try
    {
      if (a != null)
      {
        Object[] arrayOfObject = { paramString };
        String str = (String)a.invoke(null, arrayOfObject);
        return str;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      return null;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label32: break label32;
    }
  }

  public static String b(String paramString)
  {
    try
    {
      if (b != null)
      {
        Object[] arrayOfObject = { paramString };
        String str = (String)b.invoke(null, arrayOfObject);
        return str;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      return paramString;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label32: break label32;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.d.e
 * JD-Core Version:    0.6.2
 */