package textnow.e;

public final class n<T>
  implements m<T>
{
  private final Object[] a = new Object[30];
  private int b;

  public n(int paramInt)
  {
  }

  public final T a()
  {
    if (this.b > 0)
    {
      int i = -1 + this.b;
      Object localObject = this.a[i];
      this.a[i] = null;
      this.b = (-1 + this.b);
      return localObject;
    }
    return null;
  }

  public final boolean a(T paramT)
  {
    int i = 0;
    if (i < this.b)
      if (this.a[i] != paramT);
    for (int j = 1; ; j = 0)
    {
      if (j == 0)
        break label47;
      throw new IllegalStateException("Already in the pool!");
      i++;
      break;
    }
    label47: int k = this.b;
    int m = this.a.length;
    boolean bool = false;
    if (k < m)
    {
      this.a[this.b] = paramT;
      this.b = (1 + this.b);
      bool = true;
    }
    return bool;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.e.n
 * JD-Core Version:    0.6.2
 */