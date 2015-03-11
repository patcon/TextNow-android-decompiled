package com.flurry.sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ro$a
  implements Iterator<hh>
{
  static final a a = new a();

  public static a a()
  {
    return a;
  }

  public hh b()
  {
    throw new NoSuchElementException();
  }

  public boolean hasNext()
  {
    return false;
  }

  public void remove()
  {
    throw new IllegalStateException();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ro.a
 * JD-Core Version:    0.6.2
 */