package textnow.ao;

final class k<K, V>
{
  private p<K, V> a;
  private int b;
  private int c;
  private int d;

  final p<K, V> a()
  {
    p localp = this.a;
    if (localp.a != null)
      throw new IllegalStateException();
    return localp;
  }

  final void a(int paramInt)
  {
    this.b = (-1 + 2 * Integer.highestOneBit(paramInt) - paramInt);
    this.d = 0;
    this.c = 0;
    this.a = null;
  }

  final void a(p<K, V> paramp)
  {
    paramp.c = null;
    paramp.a = null;
    paramp.b = null;
    paramp.i = 1;
    if ((this.b > 0) && ((0x1 & this.d) == 0))
    {
      this.d = (1 + this.d);
      this.b = (-1 + this.b);
      this.c = (1 + this.c);
    }
    paramp.a = this.a;
    this.a = paramp;
    this.d = (1 + this.d);
    if ((this.b > 0) && ((0x1 & this.d) == 0))
    {
      this.d = (1 + this.d);
      this.b = (-1 + this.b);
      this.c = (1 + this.c);
    }
    int i = 4;
    if ((this.d & i - 1) == i - 1)
    {
      if (this.c == 0)
      {
        p localp3 = this.a;
        p localp4 = localp3.a;
        p localp5 = localp4.a;
        localp4.a = localp5.a;
        this.a = localp4;
        localp4.b = localp5;
        localp4.c = localp3;
        localp4.i = (1 + localp3.i);
        localp5.a = localp4;
        localp3.a = localp4;
      }
      while (true)
      {
        i *= 2;
        break;
        if (this.c == 1)
        {
          p localp1 = this.a;
          p localp2 = localp1.a;
          this.a = localp2;
          localp2.c = localp1;
          localp2.i = (1 + localp1.i);
          localp1.a = localp2;
          this.c = 0;
        }
        else if (this.c == 2)
        {
          this.c = 0;
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ao.k
 * JD-Core Version:    0.6.2
 */