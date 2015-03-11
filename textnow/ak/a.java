package textnow.ak;

import java.lang.reflect.Type;
import textnow.ai.b;

public final class a<T>
{
  final Class<? super T> a;
  final Type b;
  final int c;

  protected a()
  {
    Type localType = getClass().getGenericSuperclass();
    if ((localType instanceof Class))
      throw new RuntimeException("Missing type parameter.");
    this.b = b.a(((java.lang.reflect.ParameterizedType)localType).getActualTypeArguments()[0]);
    this.a = b.b(this.b);
    this.c = this.b.hashCode();
  }

  private a(Type paramType)
  {
    this.b = b.a((Type)textnow.ai.a.a(paramType));
    this.a = b.b(this.b);
    this.c = this.b.hashCode();
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
    return this.a;
  }

  public final Type b()
  {
    return this.b;
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof a)) && (b.a(this.b, ((a)paramObject).b));
  }

  public final int hashCode()
  {
    return this.c;
  }

  public final String toString()
  {
    return b.c(this.b);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ak.a
 * JD-Core Version:    0.6.2
 */