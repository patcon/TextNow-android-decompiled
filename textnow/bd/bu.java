package textnow.bd;

final class bu<T>
{
  private final T a;

  public bu(T paramT)
  {
    this.a = paramT;
  }

  public final T a()
  {
    return this.a;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == null);
    while (!(paramObject instanceof bu))
      return false;
    return this.a.equals(((bu)paramObject).a);
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.bu
 * JD-Core Version:    0.6.2
 */