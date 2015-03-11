package textnow.ai;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class c
  implements Serializable, GenericArrayType
{
  private final Type a;

  public c(Type paramType)
  {
    this.a = b.a(paramType);
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof GenericArrayType)) && (b.a(this, (GenericArrayType)paramObject));
  }

  public final Type getGenericComponentType()
  {
    return this.a;
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }

  public final String toString()
  {
    return b.c(this.a) + "[]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ai.c
 * JD-Core Version:    0.6.2
 */