package com.flurry.sdk;

@kb
public class pu extends oq<ji>
{
  public static final pu a = new pu();

  protected pu()
  {
    super(ji.class);
  }

  public void a(ji paramji, hf paramhf, jw paramjw)
  {
    paramji.a(paramhf, paramjw);
  }

  public final void a(ji paramji, hf paramhf, jw paramjw, jz paramjz)
  {
    if ((paramji instanceof jj))
    {
      ((jj)paramji).a(paramhf, paramjw, paramjz);
      return;
    }
    a(paramji, paramhf, paramjw);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pu
 * JD-Core Version:    0.6.2
 */