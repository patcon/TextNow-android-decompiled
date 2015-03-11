package com.flurry.sdk;

import java.io.Serializable;

public class jh$a
  implements Serializable
{
  protected Object a;
  protected String b;
  protected int c = -1;

  protected jh$a()
  {
  }

  public jh$a(Object paramObject, int paramInt)
  {
    this.a = paramObject;
    this.c = paramInt;
  }

  public jh$a(Object paramObject, String paramString)
  {
    this.a = paramObject;
    if (paramString == null)
      throw new NullPointerException("Can not pass null fieldName");
    this.b = paramString;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Class localClass;
    if ((this.a instanceof Class))
    {
      localClass = (Class)this.a;
      Package localPackage = localClass.getPackage();
      if (localPackage != null)
      {
        localStringBuilder.append(localPackage.getName());
        localStringBuilder.append('.');
      }
      localStringBuilder.append(localClass.getSimpleName());
      localStringBuilder.append('[');
      if (this.b == null)
        break label120;
      localStringBuilder.append('"');
      localStringBuilder.append(this.b);
      localStringBuilder.append('"');
    }
    while (true)
    {
      localStringBuilder.append(']');
      return localStringBuilder.toString();
      localClass = this.a.getClass();
      break;
      label120: if (this.c >= 0)
        localStringBuilder.append(this.c);
      else
        localStringBuilder.append('?');
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.jh.a
 * JD-Core Version:    0.6.2
 */