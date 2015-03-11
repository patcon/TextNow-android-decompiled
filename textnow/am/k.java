package textnow.am;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import textnow.an.a;

public class k
  implements Cloneable
{
  private static final n i = new e();
  private static final n j = new c();
  private static Class[] k;
  private static Class[] l;
  private static Class[] m = arrayOfClass3;
  private static final HashMap<Class, HashMap<String, Method>> n = new HashMap();
  private static final HashMap<Class, HashMap<String, Method>> o = new HashMap();
  String a;
  protected a b;
  Method c = null;
  Class d;
  j e = null;
  final ReentrantReadWriteLock f = new ReentrantReadWriteLock();
  final Object[] g = new Object[1];
  private Method h = null;
  private n p;
  private Object q;

  static
  {
    Class[] arrayOfClass1 = new Class[6];
    arrayOfClass1[0] = Float.TYPE;
    arrayOfClass1[1] = Float.class;
    arrayOfClass1[2] = Double.TYPE;
    arrayOfClass1[3] = Integer.TYPE;
    arrayOfClass1[4] = Double.class;
    arrayOfClass1[5] = Integer.class;
    k = arrayOfClass1;
    Class[] arrayOfClass2 = new Class[6];
    arrayOfClass2[0] = Integer.TYPE;
    arrayOfClass2[1] = Integer.class;
    arrayOfClass2[2] = Float.TYPE;
    arrayOfClass2[3] = Double.TYPE;
    arrayOfClass2[4] = Float.class;
    arrayOfClass2[5] = Double.class;
    l = arrayOfClass2;
    Class[] arrayOfClass3 = new Class[6];
    arrayOfClass3[0] = Double.TYPE;
    arrayOfClass3[1] = Double.class;
    arrayOfClass3[2] = Float.TYPE;
    arrayOfClass3[3] = Integer.TYPE;
    arrayOfClass3[4] = Float.class;
    arrayOfClass3[5] = Integer.class;
  }

  private k(String paramString)
  {
    this.a = paramString;
  }

  public static k a(String paramString, float[] paramArrayOfFloat)
  {
    return new l(paramString, paramArrayOfFloat);
  }

  public static k a(String paramString, int[] paramArrayOfInt)
  {
    return new m(paramString, paramArrayOfInt);
  }

  public k a()
  {
    try
    {
      k localk = (k)super.clone();
      localk.a = this.a;
      localk.b = this.b;
      localk.e = this.e.a();
      localk.p = this.p;
      return localk;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    return null;
  }

  void a(float paramFloat)
  {
    this.q = this.e.a(paramFloat);
  }

  public void a(float[] paramArrayOfFloat)
  {
    int i1 = 1;
    this.d = Float.TYPE;
    int i2 = paramArrayOfFloat.length;
    h[] arrayOfh = new h[Math.max(i2, 2)];
    if (i2 == i1)
    {
      arrayOfh[0] = ((h)new h(0.0F));
      arrayOfh[i1] = ((h)g.a(1.0F, paramArrayOfFloat[0]));
    }
    while (true)
    {
      this.e = new d(arrayOfh);
      return;
      arrayOfh[0] = ((h)g.a(0.0F, paramArrayOfFloat[0]));
      while (i1 < i2)
      {
        arrayOfh[i1] = ((h)g.a(i1 / (i2 - 1), paramArrayOfFloat[i1]));
        i1++;
      }
    }
  }

  public void a(int[] paramArrayOfInt)
  {
    int i1 = 1;
    this.d = Integer.TYPE;
    int i2 = paramArrayOfInt.length;
    i[] arrayOfi = new i[Math.max(i2, 2)];
    if (i2 == i1)
    {
      arrayOfi[0] = ((i)new i(0.0F));
      arrayOfi[i1] = ((i)g.a(1.0F, paramArrayOfInt[0]));
    }
    while (true)
    {
      this.e = new f(arrayOfi);
      return;
      arrayOfi[0] = ((i)g.a(0.0F, paramArrayOfInt[0]));
      while (i1 < i2)
      {
        arrayOfi[i1] = ((i)g.a(i1 / (i2 - 1), paramArrayOfInt[i1]));
        i1++;
      }
    }
  }

  final void b()
  {
    n localn;
    if (this.p == null)
    {
      if (this.d != Integer.class)
        break label44;
      localn = i;
    }
    while (true)
    {
      this.p = localn;
      if (this.p != null)
        this.e.f = this.p;
      return;
      label44: if (this.d == Float.class)
        localn = j;
      else
        localn = null;
    }
  }

  public final String c()
  {
    return this.a;
  }

  Object d()
  {
    return this.q;
  }

  public String toString()
  {
    return this.a + ": " + this.e.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.am.k
 * JD-Core Version:    0.6.2
 */