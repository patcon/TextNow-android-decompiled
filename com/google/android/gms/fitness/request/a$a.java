package com.google.android.gms.fitness.request;

import java.util.HashMap;
import java.util.Map;

public class a$a
{
  private static final a Ug = new a();
  private final Map<BleScanCallback, a> Uh = new HashMap();

  public static a je()
  {
    return Ug;
  }

  public a a(BleScanCallback paramBleScanCallback)
  {
    synchronized (this.Uh)
    {
      a locala = (a)this.Uh.get(paramBleScanCallback);
      if (locala == null)
      {
        locala = new a(paramBleScanCallback, null);
        this.Uh.put(paramBleScanCallback, locala);
      }
      return locala;
    }
  }

  public a b(BleScanCallback paramBleScanCallback)
  {
    synchronized (this.Uh)
    {
      a locala1 = (a)this.Uh.get(paramBleScanCallback);
      if (locala1 != null)
        return locala1;
      a locala2 = new a(paramBleScanCallback, null);
      return locala2;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.a.a
 * JD-Core Version:    0.6.2
 */