package textnow.ah;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import textnow.af.i;
import textnow.af.n;
import textnow.aj.a;

public final class f
{
  private final Map<Type, i<?>> a;

  public f(Map<Type, i<?>> paramMap)
  {
    this.a = paramMap;
  }

  private <T> o<T> a(Class<? super T> paramClass)
  {
    try
    {
      final Constructor localConstructor = paramClass.getDeclaredConstructor(new Class[0]);
      if (!localConstructor.isAccessible())
        localConstructor.setAccessible(true);
      o local6 = new o()
      {
        public final T a()
        {
          try
          {
            Object localObject = localConstructor.newInstance(null);
            return localObject;
          }
          catch (InstantiationException localInstantiationException)
          {
            throw new RuntimeException("Failed to invoke " + localConstructor + " with no args", localInstantiationException);
          }
          catch (InvocationTargetException localInvocationTargetException)
          {
            throw new RuntimeException("Failed to invoke " + localConstructor + " with no args", localInvocationTargetException.getTargetException());
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            throw new AssertionError(localIllegalAccessException);
          }
        }
      };
      return local6;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
    return null;
  }

  public final <T> o<T> a(a<T> parama)
  {
    final Type localType = parama.b();
    final Class localClass = parama.a();
    final i locali1 = (i)this.a.get(localType);
    Object localObject;
    if (locali1 != null)
      localObject = new o()
      {
        public final T a()
        {
          i locali = locali1;
          return locali.a();
        }
      };
    while (true)
    {
      return localObject;
      final i locali2 = (i)this.a.get(localClass);
      if (locali2 != null)
        return new o()
        {
          public final T a()
          {
            i locali = locali2;
            return locali.a();
          }
        };
      localObject = a(localClass);
      if (localObject == null)
      {
        if (Collection.class.isAssignableFrom(localClass))
          if (SortedSet.class.isAssignableFrom(localClass))
            localObject = new o()
            {
              public final T a()
              {
                return new TreeSet();
              }
            };
        while (localObject == null)
        {
          return new o()
          {
            private final t d = t.a();

            public final T a()
            {
              try
              {
                Object localObject = this.d.a(localClass);
                return localObject;
              }
              catch (Exception localException)
              {
                throw new RuntimeException("Unable to invoke no-args constructor for " + localType + ". " + "Register an InstanceCreator with Gson for this type may fix this problem.", localException);
              }
            }
          };
          if (EnumSet.class.isAssignableFrom(localClass))
          {
            localObject = new o()
            {
              public final T a()
              {
                if ((localType instanceof ParameterizedType))
                {
                  Type localType = ((ParameterizedType)localType).getActualTypeArguments()[0];
                  if ((localType instanceof Class))
                    return EnumSet.noneOf((Class)localType);
                  throw new n("Invalid EnumSet type: " + localType.toString());
                }
                throw new n("Invalid EnumSet type: " + localType.toString());
              }
            };
          }
          else if (Set.class.isAssignableFrom(localClass))
          {
            localObject = new o()
            {
              public final T a()
              {
                return new LinkedHashSet();
              }
            };
          }
          else if (Queue.class.isAssignableFrom(localClass))
          {
            localObject = new o()
            {
              public final T a()
              {
                return new LinkedList();
              }
            };
          }
          else
          {
            localObject = new o()
            {
              public final T a()
              {
                return new ArrayList();
              }
            };
            continue;
            if (Map.class.isAssignableFrom(localClass))
            {
              if (SortedMap.class.isAssignableFrom(localClass))
                localObject = new o()
                {
                  public final T a()
                  {
                    return new TreeMap();
                  }
                };
              else if (((localType instanceof ParameterizedType)) && (!String.class.isAssignableFrom(a.a(((ParameterizedType)localType).getActualTypeArguments()[0]).a())))
                localObject = new o()
                {
                  public final T a()
                  {
                    return new LinkedHashMap();
                  }
                };
              else
                localObject = new o()
                {
                  public final T a()
                  {
                    return new j();
                  }
                };
            }
            else
              localObject = null;
          }
        }
      }
    }
  }

  public final String toString()
  {
    return this.a.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ah.f
 * JD-Core Version:    0.6.2
 */