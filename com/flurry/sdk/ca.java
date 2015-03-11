package com.flurry.sdk;

import java.io.InputStream;
import java.io.OutputStream;

public class ca<ObjectType>
  implements ex<ObjectType>
{
  private Class<ObjectType> a;

  public ca(Class<ObjectType> paramClass)
  {
    this.a = paramClass;
  }

  public ObjectType a(InputStream paramInputStream)
  {
    if (paramInputStream == null)
      return null;
    jq localjq = new jq();
    oc localoc = new oc("AvroJsonObjectSerializerModule", new hq(1, 0, 0, null));
    localoc.a(CharSequence.class, new ca.a(null));
    localjq.a(localoc);
    return localjq.a(paramInputStream, this.a);
  }

  public void a(OutputStream paramOutputStream, ObjectType paramObjectType)
  {
    if ((paramOutputStream == null) || (paramObjectType == null))
      return;
    jq localjq = new jq();
    localjq.a(ju.a.m, false);
    localjq.a(ju.a.b, false);
    localjq.a(ju.a.c, false);
    localjq.a(paramOutputStream, paramObjectType);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ca
 * JD-Core Version:    0.6.2
 */