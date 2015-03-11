package com.google.android.gms.cast;

import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;

public final class Cast$CastOptions
  implements Api.ApiOptions.HasOptions
{
  final CastDevice EK;
  final Cast.Listener EL;
  private final int EM;

  private Cast$CastOptions(Cast.CastOptions.Builder paramBuilder)
  {
    this.EK = paramBuilder.EN;
    this.EL = paramBuilder.EO;
    this.EM = Cast.CastOptions.Builder.a(paramBuilder);
  }

  public static Cast.CastOptions.Builder builder(CastDevice paramCastDevice, Cast.Listener paramListener)
  {
    return new Cast.CastOptions.Builder(paramCastDevice, paramListener, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.Cast.CastOptions
 * JD-Core Version:    0.6.2
 */