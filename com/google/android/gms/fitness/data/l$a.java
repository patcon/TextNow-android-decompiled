package com.google.android.gms.fitness.data;

import com.google.android.gms.fitness.request.OnDataPointListener;
import java.util.HashMap;
import java.util.Map;

public class l$a
{
  private static final a Tj = new a();
  private final Map<OnDataPointListener, l> Tk = new HashMap();

  public static a iV()
  {
    return Tj;
  }

  public l a(OnDataPointListener paramOnDataPointListener)
  {
    synchronized (this.Tk)
    {
      l locall = (l)this.Tk.get(paramOnDataPointListener);
      if (locall == null)
      {
        locall = new l(paramOnDataPointListener, null);
        this.Tk.put(paramOnDataPointListener, locall);
      }
      return locall;
    }
  }

  public l b(OnDataPointListener paramOnDataPointListener)
  {
    synchronized (this.Tk)
    {
      l locall = (l)this.Tk.get(paramOnDataPointListener);
      return locall;
    }
  }

  public l c(OnDataPointListener paramOnDataPointListener)
  {
    synchronized (this.Tk)
    {
      l locall1 = (l)this.Tk.remove(paramOnDataPointListener);
      if (locall1 != null)
        return locall1;
      l locall2 = new l(paramOnDataPointListener, null);
      return locall2;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.l.a
 * JD-Core Version:    0.6.2
 */