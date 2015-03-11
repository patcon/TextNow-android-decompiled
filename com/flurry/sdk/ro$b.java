package com.flurry.sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ro$b
  implements Iterator<String>
{
  static final b a = new b();

  public static b a()
  {
    return a;
  }

  public String b()
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ro.b
 * JD-Core Version:    0.6.2
 */