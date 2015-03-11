package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.av;
import android.view.Window;

final class l extends t
  implements m
{
  private final Activity a;

  public l(Activity paramActivity, Context paramContext)
  {
    super(paramContext);
    this.a = paramActivity;
  }

  public final void a(float paramFloat)
  {
    if (paramFloat == 1.0F)
      a(true);
    while (true)
    {
      super.b(paramFloat);
      return;
      if (paramFloat == 0.0F)
        a(false);
    }
  }

  final boolean a()
  {
    return av.h(this.a.getWindow().getDecorView()) == 1;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.l
 * JD-Core Version:    0.6.2
 */