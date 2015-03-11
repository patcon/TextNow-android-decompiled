package android.support.v7.widget;

final class m
{
  int a;
  int b;
  int c;

  m(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    m localm;
    do
    {
      do
      {
        return true;
        if ((paramObject == null) || (getClass() != paramObject.getClass()))
          return false;
        localm = (m)paramObject;
        if (this.a != localm.a)
          return false;
      }
      while ((this.a == 3) && (Math.abs(this.c - this.b) == 1) && (this.c == localm.b) && (this.b == localm.c));
      if (this.c != localm.c)
        return false;
    }
    while (this.b == localm.b);
    return false;
  }

  public final int hashCode()
  {
    return 31 * (31 * this.a + this.b) + this.c;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append("[");
    String str;
    switch (this.a)
    {
    default:
      str = "??";
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return str + ",s:" + this.b + "c:" + this.c + "]";
      str = "add";
      continue;
      str = "rm";
      continue;
      str = "up";
      continue;
      str = "mv";
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.m
 * JD-Core Version:    0.6.2
 */