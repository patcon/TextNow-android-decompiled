package com.mologiq.analytics;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

final class aa
  implements Runnable
{
  private final List<z> a;
  private final Map<String, Object> b;
  private final String c;
  private final long d;
  private final String e;
  private final WeakReference<Context> f;

  public aa(Context paramContext, List<z> paramList, Map<String, Object> paramMap, String paramString1, int paramInt, String paramString2)
  {
    this.f = new WeakReference(paramContext);
    this.a = paramList;
    this.b = paramMap;
    this.c = paramString1;
    this.d = paramInt;
    this.e = paramString2;
  }

  public final void run()
  {
    Context localContext = (Context)this.f.get();
    if (localContext != null)
      new y(localContext, this.a, this.b, this.c, this.d, this.e).execute(new Object[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.aa
 * JD-Core Version:    0.6.2
 */