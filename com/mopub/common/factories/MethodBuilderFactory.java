package com.mopub.common.factories;

import com.mopub.common.util.Reflection.MethodBuilder;

public class MethodBuilderFactory
{
  protected static MethodBuilderFactory instance = new MethodBuilderFactory();

  public static Reflection.MethodBuilder create(Object paramObject, String paramString)
  {
    return instance.internalCreate(paramObject, paramString);
  }

  @Deprecated
  public static void setInstance(MethodBuilderFactory paramMethodBuilderFactory)
  {
    instance = paramMethodBuilderFactory;
  }

  protected Reflection.MethodBuilder internalCreate(Object paramObject, String paramString)
  {
    return new Reflection.MethodBuilder(paramObject, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.factories.MethodBuilderFactory
 * JD-Core Version:    0.6.2
 */