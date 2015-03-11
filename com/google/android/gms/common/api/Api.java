package com.google.android.gms.common.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Api<O extends Api.ApiOptions>
{
  private final Api.b<?, O> Io;
  private final Api.c<?> Ip;
  private final ArrayList<Scope> Iq;

  public <C extends Api.a> Api(Api.b<C, O> paramb, Api.c<C> paramc, Scope[] paramArrayOfScope)
  {
    this.Io = paramb;
    this.Ip = paramc;
    this.Iq = new ArrayList(Arrays.asList(paramArrayOfScope));
  }

  public final Api.b<?, O> gb()
  {
    return this.Io;
  }

  public final List<Scope> gd()
  {
    return this.Iq;
  }

  public final Api.c<?> ge()
  {
    return this.Ip;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Api
 * JD-Core Version:    0.6.2
 */