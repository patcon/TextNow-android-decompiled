package com.flurry.sdk;

public class mx extends iu<mw>
{
  protected static final mw a;
  protected static final mw b;
  protected static final mw c;
  protected static final mw d = mw.a(null, qp.d(Long.TYPE), localmn4);

  @Deprecated
  public static final mx.a e = new mx.a(null);

  @Deprecated
  public static final mx.d f = new mx.d();

  @Deprecated
  public static final mx.c g = new mx.c();
  protected static final na h = new mx.b(null);
  public static final mx i = new mx();

  static
  {
    mn localmn1 = mn.b(String.class, null, null);
    a = mw.a(null, qp.d(String.class), localmn1);
    mn localmn2 = mn.b(Boolean.TYPE, null, null);
    b = mw.a(null, qp.d(Boolean.TYPE), localmn2);
    mn localmn3 = mn.b(Integer.TYPE, null, null);
    c = mw.a(null, qp.d(Integer.TYPE), localmn3);
    mn localmn4 = mn.b(Long.TYPE, null, null);
  }

  protected mw a(sh paramsh)
  {
    Class localClass = paramsh.p();
    if (localClass == String.class)
      return a;
    if (localClass == Boolean.TYPE)
      return b;
    if (localClass == Integer.TYPE)
      return c;
    if (localClass == Long.TYPE)
      return d;
    return null;
  }

  protected nc a(jn<?> paramjn, mn parammn, sh paramsh, boolean paramBoolean)
  {
    return new nc(paramjn, paramBoolean, paramsh, parammn);
  }

  public nc a(jn<?> paramjn, sh paramsh, iu.a parama, boolean paramBoolean)
  {
    mn localmn = c(paramjn, paramsh, parama);
    localmn.a(h);
    localmn.n();
    return a(paramjn, localmn, paramsh, paramBoolean).k();
  }

  public mw b(jn<?> paramjn, sh paramsh, iu.a parama)
  {
    boolean bool = paramjn.b();
    iq localiq = paramjn.a();
    Class localClass = paramsh.p();
    if (bool);
    while (true)
    {
      return mw.a(paramjn, paramsh, mn.a(localClass, localiq, parama));
      localiq = null;
    }
  }

  public mw b(ju paramju, sh paramsh, iu.a parama)
  {
    mw localmw = a(paramsh);
    if (localmw == null)
      localmw = mw.b(a(paramju, paramsh, parama, true));
    return localmw;
  }

  public mn c(jn<?> paramjn, sh paramsh, iu.a parama)
  {
    boolean bool = paramjn.b();
    iq localiq = paramjn.a();
    Class localClass = paramsh.p();
    if (bool);
    while (true)
    {
      mn localmn = mn.a(localClass, localiq, parama);
      localmn.a(h);
      localmn.a(true);
      return localmn;
      localiq = null;
    }
  }

  public mw c(iy paramiy, sh paramsh, iu.a parama)
  {
    mw localmw = a(paramsh);
    if (localmw == null)
      localmw = mw.a(a(paramiy, paramsh, parama, false));
    return localmw;
  }

  public mw d(iy paramiy, sh paramsh, iu.a parama)
  {
    mw localmw = a(paramsh);
    if (localmw == null)
      localmw = mw.a(a(paramiy, paramsh, parama, false));
    return localmw;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mx
 * JD-Core Version:    0.6.2
 */