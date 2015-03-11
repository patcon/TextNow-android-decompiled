package textnow.bk;

final class bw<T>
{
  private final T a;

  public bw(T paramT)
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
    while (!(paramObject instanceof bw))
      return false;
    return this.a.equals(((bw)paramObject).a);
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.bw
 * JD-Core Version:    0.6.2
 */