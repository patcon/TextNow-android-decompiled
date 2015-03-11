package com.google.android.gms.internal;

import java.util.Map;

public final class az
  implements bc
{
  private final ba mS;

  public az(ba paramba)
  {
    this.mS = paramba;
  }

  public final void b(ex paramex, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("name");
    if (str == null)
    {
      eu.D("App event with no name parameter.");
      return;
    }
    this.mS.onAppEvent(str, (String)paramMap.get("info"));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.az
 * JD-Core Version:    0.6.2
 */