package com.google.android.gms.internal;

import java.util.Map;

@ez
public final class bv
  implements by
{
  private final bw pz;

  public bv(bw parambw)
  {
    this.pz = parambw;
  }

  public final void a(gv paramgv, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("name");
    if (str == null)
    {
      gs.W("App event with no name parameter.");
      return;
    }
    this.pz.onAppEvent(str, (String)paramMap.get("info"));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bv
 * JD-Core Version:    0.6.2
 */