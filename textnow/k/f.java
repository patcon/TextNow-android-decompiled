package textnow.k;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

final class f
  implements MenuItem.OnMenuItemClickListener
{
  private static final Class<?>[] a = { MenuItem.class };
  private Object b;
  private Method c;

  public f(Object paramObject, String paramString)
  {
    this.b = paramObject;
    Class localClass = paramObject.getClass();
    try
    {
      this.c = localClass.getMethod(paramString, a);
      return;
    }
    catch (Exception localException)
    {
      InflateException localInflateException = new InflateException("Couldn't resolve menu item onClick handler " + paramString + " in class " + localClass.getName());
      localInflateException.initCause(localException);
      throw localInflateException;
    }
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    try
    {
      if (this.c.getReturnType() == Boolean.TYPE)
        return ((Boolean)this.c.invoke(this.b, new Object[] { paramMenuItem })).booleanValue();
      this.c.invoke(this.b, new Object[] { paramMenuItem });
      return true;
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.k.f
 * JD-Core Version:    0.6.2
 */