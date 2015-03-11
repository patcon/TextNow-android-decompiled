package com.flurry.sdk;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class kz
{
  private final kz.a[] a;
  private final int b;
  private final int c;

  public kz(Collection<kt> paramCollection)
  {
    this.c = paramCollection.size();
    int i = a(this.c);
    this.b = (i - 1);
    kz.a[] arrayOfa = new kz.a[i];
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      kt localkt = (kt)localIterator.next();
      String str = localkt.c();
      int j = str.hashCode() & this.b;
      arrayOfa[j] = new kz.a(arrayOfa[j], str, localkt);
    }
    this.a = arrayOfa;
  }

  private static final int a(int paramInt)
  {
    if (paramInt <= 32);
    int j;
    for (int i = paramInt + paramInt; ; i = paramInt + (paramInt >> 2))
    {
      j = 2;
      while (j < i)
        j += j;
    }
    return j;
  }

  private kt a(String paramString, int paramInt)
  {
    for (kz.a locala = this.a[paramInt]; locala != null; locala = locala.a)
      if (paramString.equals(locala.b))
        return locala.c;
    return null;
  }

  public final kt a(String paramString)
  {
    int i = paramString.hashCode() & this.b;
    kz.a locala = this.a[i];
    if (locala == null)
      return null;
    if (locala.b == paramString)
      return locala.c;
    do
    {
      locala = locala.a;
      if (locala == null)
        break;
    }
    while (locala.b != paramString);
    return locala.c;
    return a(paramString, i);
  }

  public final void a()
  {
    kz.a[] arrayOfa = this.a;
    int i = arrayOfa.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      kz.a locala = arrayOfa[j];
      while (locala != null)
      {
        kt localkt = locala.c;
        int m = k + 1;
        localkt.a(k);
        locala = locala.a;
        k = m;
      }
      j++;
    }
  }

  public final void a(kt paramkt)
  {
    String str = paramkt.c();
    int i = str.hashCode() & -1 + this.a.length;
    kz.a locala1 = this.a[i];
    int j = 0;
    kz.a locala2 = null;
    if (locala1 != null)
    {
      if ((j == 0) && (locala1.b.equals(str)))
        j = 1;
      while (true)
      {
        locala1 = locala1.a;
        break;
        locala2 = new kz.a(locala2, locala1.b, locala1.c);
      }
    }
    if (j == 0)
      throw new NoSuchElementException("No entry '" + paramkt + "' found, can't replace");
    this.a[i] = new kz.a(locala2, str, paramkt);
  }

  public final int b()
  {
    return this.c;
  }

  public final void b(kt paramkt)
  {
    String str = paramkt.c();
    int i = str.hashCode() & -1 + this.a.length;
    kz.a locala1 = this.a[i];
    int j = 0;
    kz.a locala2 = null;
    if (locala1 != null)
    {
      if ((j == 0) && (locala1.b.equals(str)))
        j = 1;
      while (true)
      {
        locala1 = locala1.a;
        break;
        locala2 = new kz.a(locala2, locala1.b, locala1.c);
      }
    }
    if (j == 0)
      throw new NoSuchElementException("No entry '" + paramkt + "' found, can't remove");
    this.a[i] = locala2;
  }

  public final Iterator<kt> c()
  {
    return new kz.b(this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kz
 * JD-Core Version:    0.6.2
 */