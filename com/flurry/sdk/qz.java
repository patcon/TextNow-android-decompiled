package com.flurry.sdk;

import java.lang.reflect.Array;

public class qz
{
  public static Object a(Object paramObject)
  {
    return new Object()
    {
      public final boolean equals(Object paramAnonymousObject)
      {
        boolean bool1;
        if (paramAnonymousObject == this)
          bool1 = true;
        int i;
        int j;
        do
        {
          Class localClass1;
          Class localClass2;
          do
          {
            do
            {
              return bool1;
              bool1 = false;
            }
            while (paramAnonymousObject == null);
            localClass1 = paramAnonymousObject.getClass();
            localClass2 = qz.this.getClass();
            bool1 = false;
          }
          while (localClass1 != localClass2);
          i = Array.getLength(paramAnonymousObject);
          j = this.b;
          bool1 = false;
        }
        while (i != j);
        for (int k = 0; ; k++)
        {
          if (k >= this.b)
            break label123;
          Object localObject1 = Array.get(qz.this, k);
          Object localObject2 = Array.get(paramAnonymousObject, k);
          if ((localObject1 != localObject2) && (localObject1 != null))
          {
            boolean bool2 = localObject1.equals(localObject2);
            bool1 = false;
            if (!bool2)
              break;
          }
        }
        label123: return true;
      }
    };
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qz
 * JD-Core Version:    0.6.2
 */