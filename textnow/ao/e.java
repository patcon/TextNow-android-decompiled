package textnow.ao;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class e
  implements Serializable, WildcardType
{
  private final Type a;
  private final Type b;

  public e(Type[] paramArrayOfType1, Type[] paramArrayOfType2)
  {
    if (paramArrayOfType2.length <= i)
    {
      int k = i;
      a.a(k);
      if (paramArrayOfType1.length != i)
        break label88;
      int n = i;
      label29: a.a(n);
      if (paramArrayOfType2.length != i)
        break label99;
      a.a(paramArrayOfType2[0]);
      b.e(paramArrayOfType2[0]);
      if (paramArrayOfType1[0] != Object.class)
        break label94;
    }
    while (true)
    {
      a.a(i);
      this.b = b.a(paramArrayOfType2[0]);
      this.a = Object.class;
      return;
      int m = 0;
      break;
      label88: int i1 = 0;
      break label29;
      label94: int j = 0;
    }
    label99: a.a(paramArrayOfType1[0]);
    b.e(paramArrayOfType1[0]);
    this.b = null;
    this.a = b.a(paramArrayOfType1[0]);
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof WildcardType)) && (b.a(this, (WildcardType)paramObject));
  }

  public final Type[] getLowerBounds()
  {
    if (this.b != null)
    {
      Type[] arrayOfType = new Type[1];
      arrayOfType[0] = this.b;
      return arrayOfType;
    }
    return b.a;
  }

  public final Type[] getUpperBounds()
  {
    Type[] arrayOfType = new Type[1];
    arrayOfType[0] = this.a;
    return arrayOfType;
  }

  public final int hashCode()
  {
    if (this.b != null);
    for (int i = 31 + this.b.hashCode(); ; i = 1)
      return i ^ 31 + this.a.hashCode();
  }

  public final String toString()
  {
    if (this.b != null)
      return "? super " + b.c(this.b);
    if (this.a == Object.class)
      return "?";
    return "? extends " + b.c(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ao.e
 * JD-Core Version:    0.6.2
 */