package com.flurry.sdk;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ft
{
  private static final ft a = new ft();
  private static final fn b = fn.a(fn.v.g);

  public static ft a()
  {
    return a;
  }

  private void a(String paramString, StringBuilder paramStringBuilder)
  {
    int i = 0;
    if (i < paramString.length())
    {
      int j = paramString.charAt(i);
      int k;
      switch (j)
      {
      default:
        if (((j >= 0) && (j <= 31)) || ((j >= 127) && (j <= 159)) || ((j >= 8192) && (j <= 8447)))
        {
          Integer.toHexString(j);
          paramStringBuilder.append("\\u");
          k = 0;
        }
        break;
      case 34:
        while (k < 4 - paramStringBuilder.length())
        {
          paramStringBuilder.append('0');
          k++;
          continue;
          paramStringBuilder.append("\\\"");
        }
      case 92:
      case 8:
      case 12:
      case 10:
      case 13:
      case 9:
      case 47:
      }
      while (true)
      {
        i++;
        break;
        paramStringBuilder.append("\\\\");
        continue;
        paramStringBuilder.append("\\b");
        continue;
        paramStringBuilder.append("\\f");
        continue;
        paramStringBuilder.append("\\n");
        continue;
        paramStringBuilder.append("\\r");
        continue;
        paramStringBuilder.append("\\t");
        continue;
        paramStringBuilder.append("\\/");
        continue;
        paramStringBuilder.append(paramString.toUpperCase());
        continue;
        paramStringBuilder.append(j);
      }
    }
  }

  protected int a(int paramInt, Object paramObject, fn paramfn)
  {
    return paramInt * 31 + b(paramObject, paramfn);
  }

  public int a(fn paramfn, Object paramObject)
  {
    Integer localInteger = paramfn.e(b(paramObject));
    if (localInteger != null)
      return localInteger.intValue();
    throw new fp(paramfn, paramObject);
  }

  public int a(Object paramObject1, Object paramObject2, fn paramfn)
  {
    return a(paramObject1, paramObject2, paramfn, false);
  }

  protected int a(Object paramObject1, Object paramObject2, fn paramfn, boolean paramBoolean)
  {
    if (paramObject1 == paramObject2)
      return 0;
    switch (1.a[paramfn.a().ordinal()])
    {
    case 6:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    default:
      return ((Comparable)paramObject1).compareTo(paramObject2);
    case 1:
      Iterator localIterator3 = paramfn.b().iterator();
      while (localIterator3.hasNext())
      {
        fn.f localf = (fn.f)localIterator3.next();
        if (localf.f() != fn.f.a.c)
        {
          int m = localf.b();
          String str = localf.a();
          int n = a(a(paramObject1, str, m), a(paramObject2, str, m), localf.c(), paramBoolean);
          if (n != 0)
          {
            if (localf.f() == fn.f.a.b)
              return -n;
            return n;
          }
        }
      }
      return 0;
    case 2:
      return paramfn.c(paramObject1.toString()) - paramfn.c(paramObject2.toString());
    case 3:
      Collection localCollection1 = (Collection)paramObject1;
      Collection localCollection2 = (Collection)paramObject2;
      Iterator localIterator1 = localCollection1.iterator();
      Iterator localIterator2 = localCollection2.iterator();
      fn localfn = paramfn.i();
      while ((localIterator1.hasNext()) && (localIterator2.hasNext()))
      {
        int k = a(localIterator1.next(), localIterator2.next(), localfn, paramBoolean);
        if (k != 0)
          return k;
      }
      if (localIterator1.hasNext())
        return 1;
      if (localIterator2.hasNext())
        return -1;
      return 0;
    case 4:
      if (paramBoolean)
      {
        if (((Map)paramObject1).equals(paramObject2))
          return 0;
        return 1;
      }
      throw new fk("Can't compare maps!");
    case 5:
      int i = a(paramfn, paramObject1);
      int j = a(paramfn, paramObject2);
      if (i == j)
        return a(paramObject1, paramObject2, (fn)paramfn.k().get(i), paramBoolean);
      return i - j;
    case 14:
      return 0;
    case 7:
    }
    gy localgy1;
    if ((paramObject1 instanceof gy))
    {
      localgy1 = (gy)paramObject1;
      if (!(paramObject2 instanceof gy))
        break label479;
    }
    label479: for (gy localgy2 = (gy)paramObject2; ; localgy2 = new gy(paramObject2.toString()))
    {
      return localgy1.a(localgy2);
      localgy1 = new gy(paramObject1.toString());
      break;
    }
  }

  public ge a(fn paramfn)
  {
    return new fu(paramfn, paramfn, this);
  }

  protected Object a(Object paramObject, fn paramfn)
  {
    return null;
  }

  public Object a(Object paramObject, String paramString, int paramInt)
  {
    return ((fz)paramObject).a(paramInt);
  }

  public Object a(Object paramObject, byte[] paramArrayOfByte, fn paramfn)
  {
    fx localfx = (fx)c(paramObject, paramfn);
    System.arraycopy(paramArrayOfByte, 0, localfx.b(), 0, paramfn.l());
    return localfx;
  }

  public String a(Object paramObject)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(paramObject, localStringBuilder);
    return localStringBuilder.toString();
  }

  public void a(Object paramObject1, String paramString, int paramInt, Object paramObject2)
  {
    ((fz)paramObject1).a(paramInt, paramObject2);
  }

  protected void a(Object paramObject1, String paramString, int paramInt, Object paramObject2, Object paramObject3)
  {
    a(paramObject1, paramString, paramInt, paramObject2);
  }

  protected void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    int i = 0;
    if (d(paramObject))
    {
      paramStringBuilder.append("{");
      fn localfn = e(paramObject);
      Iterator localIterator3 = localfn.b().iterator();
      int i2;
      for (int i1 = 0; localIterator3.hasNext(); i1 = i2)
      {
        fn.f localf = (fn.f)localIterator3.next();
        a(localf.a(), paramStringBuilder);
        paramStringBuilder.append(": ");
        a(a(paramObject, localf.a(), localf.b()), paramStringBuilder);
        i2 = i1 + 1;
        if (i2 < localfn.b().size())
          paramStringBuilder.append(", ");
      }
      paramStringBuilder.append("}");
      return;
    }
    if ((paramObject instanceof Collection))
    {
      Collection localCollection = (Collection)paramObject;
      paramStringBuilder.append("[");
      long l = -1 + localCollection.size();
      Iterator localIterator2 = localCollection.iterator();
      while (localIterator2.hasNext())
      {
        a(localIterator2.next(), paramStringBuilder);
        int n = i + 1;
        if (i < l)
          paramStringBuilder.append(", ");
        i = n;
      }
      paramStringBuilder.append("]");
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramStringBuilder.append("{");
      Map localMap = (Map)paramObject;
      Iterator localIterator1 = localMap.entrySet().iterator();
      int m;
      for (int k = 0; localIterator1.hasNext(); k = m)
      {
        Map.Entry localEntry = (Map.Entry)localIterator1.next();
        a(localEntry.getKey(), paramStringBuilder);
        paramStringBuilder.append(": ");
        a(localEntry.getValue(), paramStringBuilder);
        m = k + 1;
        if (m < localMap.size())
          paramStringBuilder.append(", ");
      }
      paramStringBuilder.append("}");
      return;
    }
    if (((paramObject instanceof CharSequence)) || ((paramObject instanceof fw)))
    {
      paramStringBuilder.append("\"");
      a(paramObject.toString(), paramStringBuilder);
      paramStringBuilder.append("\"");
      return;
    }
    if ((paramObject instanceof ByteBuffer))
    {
      paramStringBuilder.append("{\"bytes\": \"");
      ByteBuffer localByteBuffer = (ByteBuffer)paramObject;
      for (int j = localByteBuffer.position(); j < localByteBuffer.limit(); j++)
        paramStringBuilder.append((char)localByteBuffer.get(j));
      paramStringBuilder.append("\"}");
      return;
    }
    paramStringBuilder.append(paramObject);
  }

  public int b(Object paramObject, fn paramfn)
  {
    int i = 0;
    if (paramObject == null)
      return i;
    int j = 1;
    int k = 1.a[paramfn.a().ordinal()];
    i = 0;
    switch (k)
    {
    case 14:
    case 4:
    case 6:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    default:
      return paramObject.hashCode();
    case 1:
      Iterator localIterator2 = paramfn.b().iterator();
      i = j;
      while (localIterator2.hasNext())
      {
        fn.f localf = (fn.f)localIterator2.next();
        if (localf.f() != fn.f.a.c)
          i = a(i, a(paramObject, localf.a(), localf.b()), localf.c());
      }
    case 3:
      Collection localCollection = (Collection)paramObject;
      fn localfn = paramfn.i();
      Iterator localIterator1 = localCollection.iterator();
      while (localIterator1.hasNext())
        j = a(j, localIterator1.next(), localfn);
      return j;
    case 5:
      return b(paramObject, (fn)paramfn.k().get(a(paramfn, paramObject)));
    case 2:
      return paramfn.c(paramObject.toString());
    case 7:
    }
    if ((paramObject instanceof gy));
    while (true)
    {
      return paramObject.hashCode();
      paramObject = new gy(paramObject.toString());
    }
  }

  public Object b(fn paramfn, Object paramObject)
  {
    if (paramObject == null)
      paramObject = null;
    do
    {
      return paramObject;
      switch (1.a[paramfn.a().ordinal()])
      {
      case 2:
      default:
        throw new fk("Deep copy failed for schema \"" + paramfn + "\" and value \"" + paramObject + "\"");
      case 3:
        List localList = (List)paramObject;
        ft.a locala = new ft.a(localList.size(), paramfn);
        Iterator localIterator3 = localList.iterator();
        while (localIterator3.hasNext())
        {
          Object localObject = localIterator3.next();
          locala.add(b(paramfn.i(), localObject));
        }
        return locala;
      case 13:
        return new Boolean(((Boolean)paramObject).booleanValue());
      case 8:
        ByteBuffer localByteBuffer = (ByteBuffer)paramObject;
        byte[] arrayOfByte = new byte[localByteBuffer.capacity()];
        localByteBuffer.rewind();
        localByteBuffer.get(arrayOfByte);
        localByteBuffer.rewind();
        return ByteBuffer.wrap(arrayOfByte);
      case 12:
        return new Double(((Double)paramObject).doubleValue());
      case 6:
        return a(null, ((fx)paramObject).b(), paramfn);
      case 11:
        return new Float(((Float)paramObject).floatValue());
      case 9:
        return new Integer(((Integer)paramObject).intValue());
      case 10:
        return new Long(((Long)paramObject).longValue());
      case 4:
        Map localMap = (Map)paramObject;
        HashMap localHashMap = new HashMap(localMap.size());
        Iterator localIterator2 = localMap.entrySet().iterator();
        while (localIterator2.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator2.next();
          localHashMap.put((CharSequence)b(b, localEntry.getKey()), b(paramfn.j(), localEntry.getValue()));
        }
        return localHashMap;
      case 14:
        return null;
      case 1:
        fz localfz1 = (fz)paramObject;
        fz localfz2 = (fz)d(null, paramfn);
        Iterator localIterator1 = paramfn.b().iterator();
        while (localIterator1.hasNext())
        {
          fn.f localf = (fn.f)localIterator1.next();
          localfz2.a(localf.b(), b(localf.c(), localfz1.a(localf.b())));
        }
        return localfz2;
      case 7:
      case 5:
      }
    }
    while ((paramObject instanceof String));
    if ((paramObject instanceof gy))
      return new gy((gy)paramObject);
    return new gy(paramObject.toString());
    return b((fn)paramfn.k().get(a(paramfn, paramObject)), paramObject);
  }

  protected Object b(Object paramObject1, String paramString, int paramInt, Object paramObject2)
  {
    return a(paramObject1, paramString, paramInt);
  }

  protected String b(Object paramObject)
  {
    if (paramObject == null)
      return fn.v.n.a();
    if (d(paramObject))
      return e(paramObject).g();
    if (f(paramObject))
      return g(paramObject).g();
    if (c(paramObject))
      return fn.v.c.a();
    if (h(paramObject))
      return fn.v.d.a();
    if (i(paramObject))
      return j(paramObject).g();
    if (k(paramObject))
      return fn.v.g.a();
    if (l(paramObject))
      return fn.v.h.a();
    if ((paramObject instanceof Integer))
      return fn.v.i.a();
    if ((paramObject instanceof Long))
      return fn.v.j.a();
    if ((paramObject instanceof Float))
      return fn.v.k.a();
    if ((paramObject instanceof Double))
      return fn.v.l.a();
    if ((paramObject instanceof Boolean))
      return fn.v.m.a();
    throw new fk("Unknown datum type: " + paramObject);
  }

  public Object c(Object paramObject, fn paramfn)
  {
    if (((paramObject instanceof fx)) && (((fx)paramObject).b().length == paramfn.l()))
      return paramObject;
    return new ft.c(paramfn);
  }

  protected boolean c(Object paramObject)
  {
    return paramObject instanceof Collection;
  }

  public Object d(Object paramObject, fn paramfn)
  {
    if ((paramObject instanceof fz))
    {
      fz localfz = (fz)paramObject;
      if (localfz.a() == paramfn)
        return localfz;
    }
    return new ft.d(paramfn);
  }

  protected boolean d(Object paramObject)
  {
    return paramObject instanceof fz;
  }

  protected fn e(Object paramObject)
  {
    return ((fs)paramObject).a();
  }

  protected boolean f(Object paramObject)
  {
    return paramObject instanceof fw;
  }

  protected fn g(Object paramObject)
  {
    return ((fs)paramObject).a();
  }

  protected boolean h(Object paramObject)
  {
    return paramObject instanceof Map;
  }

  protected boolean i(Object paramObject)
  {
    return paramObject instanceof fx;
  }

  protected fn j(Object paramObject)
  {
    return ((fs)paramObject).a();
  }

  protected boolean k(Object paramObject)
  {
    return paramObject instanceof CharSequence;
  }

  protected boolean l(Object paramObject)
  {
    return paramObject instanceof ByteBuffer;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ft
 * JD-Core Version:    0.6.2
 */