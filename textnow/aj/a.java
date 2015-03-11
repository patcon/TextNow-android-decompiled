package textnow.aj;

import java.lang.reflect.Type;
import textnow.ah.b;

public class a<T>
{
  final Class<? super T> b;
  final Type c;
  final int d;

  protected a()
  {
    Type localType = getClass().getGenericSuperclass();
    if ((localType instanceof Class))
      throw new RuntimeException("Missing type parameter.");
    this.c = b.a(((java.lang.reflect.ParameterizedType)localType).getActualTypeArguments()[0]);
    this.b = b.b(this.c);
    this.d = this.c.hashCode();
  }

  private a(Type paramType)
  {
    this.c = b.a((Type)textnow.ah.a.a(paramType));
    this.b = b.b(this.c);
    this.d = this.c.hashCode();
  }

  public static <T> a<T> a(Class<T> paramClass)
  {
    return new a(paramClass);
  }

  public static a<?> a(Type paramType)
  {
    return new a(paramType);
  }

  public final Class<? super T> a()
  {
    return this.b;
  }

  public final Type b()
  {
    return this.c;
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof a)) && (b.a(this.c, ((a)paramObject).c));
  }

  public final int hashCode()
  {
    return this.d;
  }

  public final String toString()
  {
    return b.c(this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.aj.a
 * JD-Core Version:    0.6.2
 */