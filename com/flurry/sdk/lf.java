package com.flurry.sdk;

public final class lf
{
  final hj a;
  final iz b;
  final Object[] c;
  private int d;
  private le e;

  public lf(hj paramhj, iz paramiz, int paramInt)
  {
    this.a = paramhj;
    this.b = paramiz;
    this.d = paramInt;
    this.c = new Object[paramInt];
  }

  protected final le a()
  {
    return this.e;
  }

  public final void a(ks paramks, String paramString, Object paramObject)
  {
    this.e = new le.a(this.e, paramObject, paramks, paramString);
  }

  public final void a(kt paramkt, Object paramObject)
  {
    this.e = new le.c(this.e, paramObject, paramkt);
  }

  public final void a(Object paramObject1, Object paramObject2)
  {
    this.e = new le.b(this.e, paramObject2, paramObject1);
  }

  public final void a(kt[] paramArrayOfkt)
  {
    int i = 0;
    int j = paramArrayOfkt.length;
    while (i < j)
    {
      kt localkt = paramArrayOfkt[i];
      if (localkt != null)
        this.c[i] = this.b.a(localkt.k(), localkt, null);
      i++;
    }
  }

  public final boolean a(int paramInt, Object paramObject)
  {
    this.c[paramInt] = paramObject;
    int i = -1 + this.d;
    this.d = i;
    return i <= 0;
  }

  protected final Object[] a(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject != null)
    {
      int i = 0;
      int j = this.c.length;
      while (i < j)
      {
        if (this.c[i] == null)
        {
          Object localObject = paramArrayOfObject[i];
          if (localObject != null)
            this.c[i] = localObject;
        }
        i++;
      }
    }
    return this.c;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lf
 * JD-Core Version:    0.6.2
 */