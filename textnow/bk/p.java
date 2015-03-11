package textnow.bk;

final class p
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    p localp;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (getClass() != paramObject.getClass())
        return false;
      localp = (p)paramObject;
      if (this.a != localp.a)
        return false;
    }
    while (this.b == localp.b);
    return false;
  }

  public final int hashCode()
  {
    return 31 * (31 + this.a) + this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.p
 * JD-Core Version:    0.6.2
 */