package com.google.android.gms.common.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Api<O extends Api.ApiOptions>
{
  private final Api.b<?, O> Dm;
  private final Api.c<?> Dn;
  private final ArrayList<Scope> Do;

  public <C extends Api.a> Api(Api.b<C, O> paramb, Api.c<C> paramc, Scope[] paramArrayOfScope)
  {
    this.Dm = paramb;
    this.Dn = paramc;
    this.Do = new ArrayList(Arrays.asList(paramArrayOfScope));
  }

  public final List<Scope> eA()
  {
    return this.Do;
  }

  public final Api.c<?> eB()
  {
    return this.Dn;
  }

  public final Api.b<?, O> ez()
  {
    return this.Dm;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Api
 * JD-Core Version:    0.6.2
 */