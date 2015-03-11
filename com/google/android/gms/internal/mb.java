package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class mb<M extends ma<M>, T>
{
  protected final Class<T> amY;
  protected final boolean amZ;
  protected final int tag;
  protected final int type;

  private mb(int paramInt1, Class<T> paramClass, int paramInt2, boolean paramBoolean)
  {
    this.type = paramInt1;
    this.amY = paramClass;
    this.tag = paramInt2;
    this.amZ = paramBoolean;
  }

  public static <M extends ma<M>, T extends me> mb<M, T> a(int paramInt1, Class<T> paramClass, int paramInt2)
  {
    return new mb(paramInt1, paramClass, paramInt2, false);
  }

  protected void a(mg parammg, List<Object> paramList)
  {
    paramList.add(u(ly.p(parammg.anc)));
  }

  protected boolean eM(int paramInt)
  {
    return paramInt == this.tag;
  }

  final T i(List<mg> paramList)
  {
    int i = 0;
    Object localObject1;
    if (paramList == null)
      localObject1 = null;
    while (true)
    {
      return localObject1;
      if (!this.amZ)
        break;
      ArrayList localArrayList = new ArrayList();
      for (int j = 0; j < paramList.size(); j++)
      {
        mg localmg = (mg)paramList.get(j);
        if ((eM(localmg.tag)) && (localmg.anc.length != 0))
          a(localmg, localArrayList);
      }
      int k = localArrayList.size();
      if (k == 0)
        return null;
      localObject1 = this.amY.cast(Array.newInstance(this.amY.getComponentType(), k));
      while (i < k)
      {
        Array.set(localObject1, i, localArrayList.get(i));
        i++;
      }
    }
    int m = -1 + paramList.size();
    Object localObject2 = null;
    Object localObject3;
    if ((localObject2 == null) && (m >= 0))
    {
      localObject3 = (mg)paramList.get(m);
      if ((!eM(((mg)localObject3).tag)) || (((mg)localObject3).anc.length == 0))
        break label243;
    }
    while (true)
    {
      m--;
      localObject2 = localObject3;
      break;
      if (localObject2 == null)
        return null;
      return this.amY.cast(u(ly.p(localObject2.anc)));
      label243: localObject3 = localObject2;
    }
  }

  protected Object u(ly paramly)
  {
    Class localClass;
    if (this.amZ)
      localClass = this.amY.getComponentType();
    try
    {
      switch (this.type)
      {
      default:
        throw new IllegalArgumentException("Unknown type " + this.type);
      case 10:
      case 11:
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      while (true)
      {
        throw new IllegalArgumentException("Error creating instance of class " + localClass, localInstantiationException);
        localClass = this.amY;
      }
      me localme2 = (me)localClass.newInstance();
      paramly.a(localme2, mh.eO(this.tag));
      return localme2;
      me localme1 = (me)localClass.newInstance();
      paramly.a(localme1);
      return localme1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalArgumentException("Error creating instance of class " + localClass, localIllegalAccessException);
    }
    catch (IOException localIOException)
    {
      throw new IllegalArgumentException("Error reading extension field", localIOException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mb
 * JD-Core Version:    0.6.2
 */