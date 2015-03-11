package textnow.ao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class d
  implements Serializable, ParameterizedType
{
  private final Type a;
  private final Type b;
  private final Type[] c;

  public d(Type paramType1, Type paramType2, Type[] paramArrayOfType)
  {
    boolean bool2;
    if ((paramType2 instanceof Class))
    {
      Class localClass = (Class)paramType2;
      if ((paramType1 != null) || (localClass.getEnclosingClass() == null))
      {
        bool2 = bool1;
        a.a(bool2);
        if ((paramType1 != null) && (localClass.getEnclosingClass() == null))
          break label153;
        label56: a.a(bool1);
      }
    }
    else
    {
      if (paramType1 != null)
        break label159;
    }
    label153: label159: for (Type localType = null; ; localType = b.a(paramType1))
    {
      this.a = localType;
      this.b = b.a(paramType2);
      this.c = ((Type[])paramArrayOfType.clone());
      while (i < this.c.length)
      {
        a.a(this.c[i]);
        b.e(this.c[i]);
        this.c[i] = b.a(this.c[i]);
        i++;
      }
      bool2 = false;
      break;
      bool1 = false;
      break label56;
    }
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof ParameterizedType)) && (b.a(this, (ParameterizedType)paramObject));
  }

  public final Type[] getActualTypeArguments()
  {
    return (Type[])this.c.clone();
  }

  public final Type getOwnerType()
  {
    return this.a;
  }

  public final Type getRawType()
  {
    return this.b;
  }

  public final int hashCode()
  {
    return Arrays.hashCode(this.c) ^ this.b.hashCode() ^ b.a(this.a);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(30 * (1 + this.c.length));
    localStringBuilder.append(b.c(this.b));
    if (this.c.length == 0)
      return localStringBuilder.toString();
    localStringBuilder.append("<").append(b.c(this.c[0]));
    for (int i = 1; i < this.c.length; i++)
      localStringBuilder.append(", ").append(b.c(this.c[i]));
    return ">";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ao.d
 * JD-Core Version:    0.6.2
 */