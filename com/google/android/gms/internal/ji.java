package com.google.android.gms.internal;

import com.google.android.gms.common.internal.o;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class ji
{
  private void a(StringBuilder paramStringBuilder, ji.a parama, Object paramObject)
  {
    if (parama.hd() == 11)
    {
      paramStringBuilder.append(((ji)parama.hn().cast(paramObject)).toString());
      return;
    }
    if (parama.hd() == 7)
    {
      paramStringBuilder.append("\"");
      paramStringBuilder.append(jz.bf((String)paramObject));
      paramStringBuilder.append("\"");
      return;
    }
    paramStringBuilder.append(paramObject);
  }

  private void a(StringBuilder paramStringBuilder, ji.a parama, ArrayList<Object> paramArrayList)
  {
    paramStringBuilder.append("[");
    int i = 0;
    int j = paramArrayList.size();
    while (i < j)
    {
      if (i > 0)
        paramStringBuilder.append(",");
      Object localObject = paramArrayList.get(i);
      if (localObject != null)
        a(paramStringBuilder, parama, localObject);
      i++;
    }
    paramStringBuilder.append("]");
  }

  protected <O, I> I a(ji.a<I, O> parama, Object paramObject)
  {
    if (ji.a.c(parama) != null)
      paramObject = parama.convertBack(paramObject);
    return paramObject;
  }

  protected boolean a(ji.a parama)
  {
    if (parama.he() == 11)
    {
      if (parama.hk())
        return bd(parama.hl());
      return bc(parama.hl());
    }
    return bb(parama.hl());
  }

  protected Object b(ji.a parama)
  {
    String str1 = parama.hl();
    if (parama.hn() != null)
    {
      boolean bool;
      if (ba(parama.hl()) == null)
      {
        bool = true;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = parama.hl();
        o.a(bool, "Concrete field shouldn't be value object: %s", arrayOfObject);
        if (!parama.hk())
          break label79;
      }
      label79: for (HashMap localHashMap = hh(); ; localHashMap = hg())
      {
        if (localHashMap == null)
          break label88;
        return localHashMap.get(str1);
        bool = false;
        break;
      }
      try
      {
        label88: String str2 = "get" + Character.toUpperCase(str1.charAt(0)) + str1.substring(1);
        Object localObject = getClass().getMethod(str2, new Class[0]).invoke(this, new Object[0]);
        return localObject;
      }
      catch (Exception localException)
      {
        throw new RuntimeException(localException);
      }
    }
    return ba(parama.hl());
  }

  protected abstract Object ba(String paramString);

  protected abstract boolean bb(String paramString);

  protected boolean bc(String paramString)
  {
    throw new UnsupportedOperationException("Concrete types not supported");
  }

  protected boolean bd(String paramString)
  {
    throw new UnsupportedOperationException("Concrete type arrays not supported");
  }

  public abstract HashMap<String, ji.a<?, ?>> hf();

  public HashMap<String, Object> hg()
  {
    return null;
  }

  public HashMap<String, Object> hh()
  {
    return null;
  }

  public String toString()
  {
    HashMap localHashMap = hf();
    StringBuilder localStringBuilder = new StringBuilder(100);
    Iterator localIterator = localHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ji.a locala = (ji.a)localHashMap.get(str);
      if (a(locala))
      {
        Object localObject = a(locala, b(locala));
        if (localStringBuilder.length() == 0)
          localStringBuilder.append("{");
        while (true)
        {
          localStringBuilder.append("\"").append(str).append("\":");
          if (localObject != null)
            break label135;
          localStringBuilder.append("null");
          break;
          localStringBuilder.append(",");
        }
        label135: switch (locala.he())
        {
        default:
          if (locala.hj())
            a(localStringBuilder, locala, (ArrayList)localObject);
          break;
        case 8:
          localStringBuilder.append("\"").append(js.d((byte[])localObject)).append("\"");
          break;
        case 9:
          localStringBuilder.append("\"").append(js.e((byte[])localObject)).append("\"");
          break;
        case 10:
          ka.a(localStringBuilder, (HashMap)localObject);
          continue;
          a(localStringBuilder, locala, localObject);
        }
      }
    }
    if (localStringBuilder.length() > 0)
      localStringBuilder.append("}");
    while (true)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("{}");
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ji
 * JD-Core Version:    0.6.2
 */