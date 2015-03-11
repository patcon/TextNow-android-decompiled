package com.flurry.sdk;

public class ft$b
  implements fw
{
  private fn a;
  private String b;

  public ft$b(fn paramfn, String paramString)
  {
    this.a = paramfn;
    this.b = paramString;
  }

  public fn a()
  {
    return this.a;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    while (((paramObject instanceof fw)) && (this.b.equals(paramObject.toString())))
      return true;
    return false;
  }

  public int hashCode()
  {
    return this.b.hashCode();
  }

  public String toString()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ft.b
 * JD-Core Version:    0.6.2
 */