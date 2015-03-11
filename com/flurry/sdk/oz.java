package com.flurry.sdk;

public class oz extends oi
{
  public oz(oi paramoi)
  {
    super(paramoi);
  }

  public oz(oi paramoi, jk<Object> paramjk)
  {
    super(paramoi, paramjk);
  }

  protected jk<Object> a(ov paramov, Class<?> paramClass, jw paramjw)
  {
    if (this.o != null);
    for (jk localjk = paramjw.a(paramjw.a(this.o, paramClass), this); ; localjk = paramjw.a(paramClass, this))
    {
      if (!localjk.b())
        localjk = localjk.a();
      this.j = this.j.a(paramClass, localjk);
      return localjk;
    }
  }

  public oi a(jk<Object> paramjk)
  {
    if (getClass() != oz.class)
      throw new IllegalStateException("UnwrappingBeanPropertyWriter sub-class does not override 'withSerializer()'; needs to!");
    if (!paramjk.b())
      paramjk = paramjk.a();
    return new oz(this, paramjk);
  }

  public void a(Object paramObject, hf paramhf, jw paramjw)
  {
    Object localObject = a(paramObject);
    if (localObject == null);
    do
    {
      return;
      if (localObject == paramObject)
        b(paramObject);
    }
    while ((this.l != null) && (this.l.equals(localObject)));
    jk localjk = this.i;
    if (localjk == null)
    {
      Class localClass = localObject.getClass();
      ov localov = this.j;
      localjk = localov.a(localClass);
      if (localjk == null)
        localjk = a(localov, localClass, paramjw);
    }
    if (!localjk.b())
      paramhf.a(this.g);
    if (this.n == null)
    {
      localjk.a(localObject, paramhf, paramjw);
      return;
    }
    localjk.a(localObject, paramhf, paramjw, this.n);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.oz
 * JD-Core Version:    0.6.2
 */