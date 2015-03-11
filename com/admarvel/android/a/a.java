package com.admarvel.android.a;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;

public class a
{
  private final b a;

  public a(Context paramContext)
  {
    this.a = new b(paramContext);
    if (b() >= 11)
    {
      new Handler().post(new a.a(this, null));
      return;
    }
    new c().execute(new Object[] { null });
  }

  public static int b()
  {
    if (Build.VERSION.RELEASE.contains("1.5"))
      return 3;
    return d.a();
  }

  public void a()
  {
    this.a.execute(new Object[] { null });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.a.a
 * JD-Core Version:    0.6.2
 */