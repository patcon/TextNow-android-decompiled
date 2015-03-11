package textnow.bd;

final class o
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    o localo;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (getClass() != paramObject.getClass())
        return false;
      localo = (o)paramObject;
      if (this.a != localo.a)
        return false;
    }
    while (this.b == localo.b);
    return false;
  }

  public final int hashCode()
  {
    return 31 * (31 + this.a) + this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.o
 * JD-Core Version:    0.6.2
 */