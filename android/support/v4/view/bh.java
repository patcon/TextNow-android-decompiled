package android.support.v4.view;

import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class bh
{
  private static Method a;

  public static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    if (a == null);
    try
    {
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Boolean.TYPE;
      a = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", arrayOfClass);
      label31: a.setAccessible(true);
      try
      {
        Method localMethod = a;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Boolean.valueOf(paramBoolean);
        localMethod.invoke(paramViewGroup, arrayOfObject);
        return;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label31;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.bh
 * JD-Core Version:    0.6.2
 */