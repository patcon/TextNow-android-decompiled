package com.flurry.sdk;

public class av<ObjectType> extends aw
{
  private static final String a = aw.class.getSimpleName();
  private final ex<ObjectType> b;

  public av(ex<ObjectType> paramex, String paramString, long paramLong, boolean paramBoolean)
  {
    super(paramString, paramLong, paramBoolean);
    if (paramex == null)
      throw new IllegalArgumentException("Serializer cannot be null");
    this.b = paramex;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.av
 * JD-Core Version:    0.6.2
 */