package textnow.ai;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class v
{
  public static v a()
  {
    try
    {
      Class localClass = Class.forName("sun.misc.Unsafe");
      Field localField = localClass.getDeclaredField("theUnsafe");
      localField.setAccessible(true);
      final Object localObject = localField.get(null);
      v local1 = new v()
      {
        public final <T> T a(Class<T> paramAnonymousClass)
        {
          return v.this.invoke(localObject, new Object[] { paramAnonymousClass });
        }
      };
      return local1;
    }
    catch (Exception localException1)
    {
      try
      {
        Method localMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[] { Class.class, Class.class });
        localMethod3.setAccessible(true);
        v local2 = new v()
        {
          public final <T> T a(Class<T> paramAnonymousClass)
          {
            return v.this.invoke(null, new Object[] { paramAnonymousClass, Object.class });
          }
        };
        return local2;
      }
      catch (Exception localException2)
      {
        try
        {
          Method localMethod1 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[] { Class.class });
          localMethod1.setAccessible(true);
          final int i = ((Integer)localMethod1.invoke(null, new Object[] { Object.class })).intValue();
          Class[] arrayOfClass = new Class[2];
          arrayOfClass[0] = Class.class;
          arrayOfClass[1] = Integer.TYPE;
          Method localMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", arrayOfClass);
          localMethod2.setAccessible(true);
          v local3 = new v()
          {
            public final <T> T a(Class<T> paramAnonymousClass)
            {
              Method localMethod = v.this;
              Object[] arrayOfObject = new Object[2];
              arrayOfObject[0] = paramAnonymousClass;
              arrayOfObject[1] = Integer.valueOf(i);
              return localMethod.invoke(null, arrayOfObject);
            }
          };
          return local3;
        }
        catch (Exception localException3)
        {
        }
      }
    }
    return new v()
    {
      public final <T> T a(Class<T> paramAnonymousClass)
      {
        throw new UnsupportedOperationException("Cannot allocate " + paramAnonymousClass);
      }
    };
  }

  public abstract <T> T a(Class<T> paramClass);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ai.v
 * JD-Core Version:    0.6.2
 */