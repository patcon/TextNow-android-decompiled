package com.flurry.sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class kz$b
  implements Iterator<kt>
{
  private final kz.a[] a;
  private kz.a b;
  private int c;

  public kz$b(kz.a[] paramArrayOfa)
  {
    this.a = paramArrayOfa;
    int i = 0;
    int j = this.a.length;
    int k;
    if (i < j)
    {
      kz.a[] arrayOfa = this.a;
      k = i + 1;
      kz.a locala = arrayOfa[i];
      if (locala != null)
        this.b = locala;
    }
    while (true)
    {
      this.c = k;
      return;
      i = k;
      break;
      k = i;
    }
  }

  public final kt a()
  {
    kz.a locala1 = this.b;
    if (locala1 == null)
      throw new NoSuchElementException();
    kz.a[] arrayOfa;
    int i;
    for (kz.a locala2 = locala1.a; (locala2 == null) && (this.c < this.a.length); locala2 = arrayOfa[i])
    {
      arrayOfa = this.a;
      i = this.c;
      this.c = (i + 1);
    }
    this.b = locala2;
    return locala1.c;
  }

  public final boolean hasNext()
  {
    return this.b != null;
  }

  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kz.b
 * JD-Core Version:    0.6.2
 */