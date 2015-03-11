package com.flurry.sdk;

abstract class jn$c<CFG extends jn.b, T extends c<CFG, T>> extends jn<T>
{
  protected int i;

  protected jn$c(iu<? extends ir> paramiu, iq paramiq, ne<?> paramne, ng paramng, jr paramjr, qs paramqs, je paramje, int paramInt)
  {
    super(paramiu, paramiq, paramne, paramng, paramjr, paramqs, paramje);
    this.i = paramInt;
  }

  protected jn$c(c<CFG, T> paramc, jn.a parama, ng paramng)
  {
    super(paramc, parama, paramng);
    this.i = paramc.i;
  }

  static <F extends Enum<F>,  extends jn.b> int d(Class<F> paramClass)
  {
    Enum[] arrayOfEnum = (Enum[])paramClass.getEnumConstants();
    int j = arrayOfEnum.length;
    int k = 0;
    int m = 0;
    Enum localEnum;
    if (k < j)
    {
      localEnum = arrayOfEnum[k];
      if (!((jn.b)localEnum).a())
        break label67;
    }
    label67: for (int n = m | ((jn.b)localEnum).b(); ; n = m)
    {
      k++;
      m = n;
      break;
      return m;
    }
  }

  @Deprecated
  public void a(CFG paramCFG)
  {
    this.i &= (0xFFFFFFFF ^ paramCFG.b());
  }

  @Deprecated
  public void a(CFG paramCFG, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      b(paramCFG);
      return;
    }
    a(paramCFG);
  }

  @Deprecated
  public void b(CFG paramCFG)
  {
    this.i |= paramCFG.b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.jn.c
 * JD-Core Version:    0.6.2
 */