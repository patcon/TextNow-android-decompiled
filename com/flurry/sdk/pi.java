package com.flurry.sdk;

@kb
public class pi extends pt<Enum<?>>
{
  protected final rb a;

  public pi(rb paramrb)
  {
    super(Enum.class, false);
    this.a = paramrb;
  }

  public static pi a(Class<Enum<?>> paramClass, ju paramju, mw parammw)
  {
    iq localiq = paramju.a();
    if (paramju.a(ju.a.t));
    for (rb localrb = rb.c(paramClass, localiq); ; localrb = rb.b(paramClass, localiq))
      return new pi(localrb);
  }

  public final void a(Enum<?> paramEnum, hf paramhf, jw paramjw)
  {
    if (paramjw.a(ju.a.u))
    {
      paramhf.b(paramEnum.ordinal());
      return;
    }
    paramhf.b(this.a.a(paramEnum));
  }

  public rb d()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pi
 * JD-Core Version:    0.6.2
 */