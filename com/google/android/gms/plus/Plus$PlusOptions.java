package com.google.android.gms.plus;

import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import java.util.HashSet;
import java.util.Set;

public final class Plus$PlusOptions
  implements Api.ApiOptions.Optional
{
  final String abr;
  final Set<String> abs;

  private Plus$PlusOptions()
  {
    this.abr = null;
    this.abs = new HashSet();
  }

  private Plus$PlusOptions(Plus.PlusOptions.Builder paramBuilder)
  {
    this.abr = paramBuilder.abr;
    this.abs = paramBuilder.abs;
  }

  public static Plus.PlusOptions.Builder builder()
  {
    return new Plus.PlusOptions.Builder();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.Plus.PlusOptions
 * JD-Core Version:    0.6.2
 */