package textnow.aq;

import android.os.StatFs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class j
{
  private static final Method a;
  private static final Method b;
  private static final Method c;
  private static final Method d;
  private static final String e = j.class.getName();
  private StatFs f;

  static
  {
    try
    {
      Method localMethod8 = StatFs.class.getMethod("getBlockSize", new Class[0]);
      localMethod1 = localMethod8;
      a = localMethod1;
    }
    catch (NoSuchMethodException localNoSuchMethodException3)
    {
      try
      {
        Method localMethod7 = StatFs.class.getMethod("getBlockSizeLong", new Class[0]);
        localMethod2 = localMethod7;
        b = localMethod2;
      }
      catch (NoSuchMethodException localNoSuchMethodException3)
      {
        try
        {
          Method localMethod6 = StatFs.class.getMethod("getAvailableBlocks", new Class[0]);
          localMethod3 = localMethod6;
          c = localMethod3;
        }
        catch (NoSuchMethodException localNoSuchMethodException3)
        {
          try
          {
            while (true)
            {
              Method localMethod5 = StatFs.class.getMethod("getAvailableBlocksLong", new Class[0]);
              localMethod4 = localMethod5;
              d = localMethod4;
              return;
              localNoSuchMethodException1 = localNoSuchMethodException1;
              Method localMethod1 = null;
              continue;
              localNoSuchMethodException2 = localNoSuchMethodException2;
              Method localMethod2 = null;
            }
            localNoSuchMethodException3 = localNoSuchMethodException3;
            Method localMethod3 = null;
          }
          catch (NoSuchMethodException localNoSuchMethodException4)
          {
            while (true)
              Method localMethod4 = null;
          }
        }
      }
    }
  }

  public j(String paramString)
  {
    this.f = new StatFs(paramString);
  }

  public final long a()
  {
    long l1 = 0L;
    if (b != null);
    while (true)
    {
      try
      {
        long l3 = ((Long)b.invoke(this.f, new Object[0])).longValue();
        l2 = l3;
        k = 0;
        if (k == 0)
        {
          l1 = l2;
          return l1;
        }
      }
      catch (ClassCastException localClassCastException2)
      {
        l2 = l1;
        k = 1;
        continue;
      }
      catch (IllegalAccessException localIllegalAccessException2)
      {
        l2 = l1;
        k = 1;
        continue;
      }
      catch (IllegalArgumentException localIllegalArgumentException2)
      {
        l2 = l1;
        k = 1;
        continue;
      }
      catch (InvocationTargetException localInvocationTargetException2)
      {
        long l2 = l1;
        int k = 1;
        continue;
        l1 = l2;
      }
      if (a == null)
        continue;
      try
      {
        int j = ((Integer)a.invoke(this.f, new Object[0])).intValue();
        l1 = j;
        i = 0;
        if (i != 0)
          continue;
        return l1;
      }
      catch (ClassCastException localClassCastException1)
      {
        while (true)
          i = 1;
      }
      catch (IllegalAccessException localIllegalAccessException1)
      {
        while (true)
          i = 1;
      }
      catch (IllegalArgumentException localIllegalArgumentException1)
      {
        while (true)
          i = 1;
      }
      catch (InvocationTargetException localInvocationTargetException1)
      {
        while (true)
          int i = 1;
      }
    }
  }

  public final long b()
  {
    long l1 = 0L;
    if (d != null);
    while (true)
    {
      try
      {
        long l3 = ((Long)d.invoke(this.f, new Object[0])).longValue();
        l2 = l3;
        k = 0;
        if (k == 0)
        {
          l1 = l2;
          return l1;
        }
      }
      catch (ClassCastException localClassCastException2)
      {
        l2 = l1;
        k = 1;
        continue;
      }
      catch (IllegalAccessException localIllegalAccessException2)
      {
        l2 = l1;
        k = 1;
        continue;
      }
      catch (IllegalArgumentException localIllegalArgumentException2)
      {
        l2 = l1;
        k = 1;
        continue;
      }
      catch (InvocationTargetException localInvocationTargetException2)
      {
        long l2 = l1;
        int k = 1;
        continue;
        l1 = l2;
      }
      if (c == null)
        continue;
      try
      {
        int j = ((Integer)c.invoke(this.f, new Object[0])).intValue();
        l1 = j;
        i = 0;
        if (i != 0)
          continue;
        return l1;
      }
      catch (ClassCastException localClassCastException1)
      {
        while (true)
          i = 1;
      }
      catch (IllegalAccessException localIllegalAccessException1)
      {
        while (true)
          i = 1;
      }
      catch (IllegalArgumentException localIllegalArgumentException1)
      {
        while (true)
          i = 1;
      }
      catch (InvocationTargetException localInvocationTargetException1)
      {
        while (true)
          int i = 1;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aq.j
 * JD-Core Version:    0.6.2
 */