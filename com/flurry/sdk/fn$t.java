package com.flurry.sdk;

class fn$t
{
  private Object a;
  private Object b;

  private fn$t(Object paramObject1, Object paramObject2)
  {
    this.a = paramObject1;
    this.b = paramObject2;
  }

  public boolean equals(Object paramObject)
  {
    return (this.a == ((t)paramObject).a) && (this.b == ((t)paramObject).b);
  }

  public int hashCode()
  {
    return System.identityHashCode(this.a) + System.identityHashCode(this.b);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.t
 * JD-Core Version:    0.6.2
 */