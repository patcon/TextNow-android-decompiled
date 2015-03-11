package com.flurry.sdk;

public class oy extends pw<Object>
{
  public oy()
  {
    super(Object.class);
  }

  protected void a(Object paramObject)
  {
    throw new jh("No serializer found for class " + paramObject.getClass().getName() + " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS) )");
  }

  public void a(Object paramObject, hf paramhf, jw paramjw)
  {
    if (paramjw.a(ju.a.m))
      a(paramObject);
    paramhf.d();
    paramhf.e();
  }

  public final void a(Object paramObject, hf paramhf, jw paramjw, jz paramjz)
  {
    if (paramjw.a(ju.a.m))
      a(paramObject);
    paramjz.b(paramObject, paramhf);
    paramjz.e(paramObject, paramhf);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.oy
 * JD-Core Version:    0.6.2
 */