package android.support.v4.view;

import android.view.View;

final class ch
  implements cp
{
  cd a;

  ch(cd paramcd)
  {
    this.a = paramcd;
  }

  public final void a(View paramView)
  {
    if (cd.c(this.a) >= 0)
      av.a(paramView, 2, null);
    if (cd.a(this.a) != null)
      cd.a(this.a).run();
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof cp));
    for (cp localcp = (cp)localObject; ; localcp = null)
    {
      if (localcp != null)
        localcp.a(paramView);
      return;
    }
  }

  public final void b(View paramView)
  {
    if (cd.c(this.a) >= 0)
    {
      av.a(paramView, cd.c(this.a), null);
      cd.a(this.a, -1);
    }
    if (cd.b(this.a) != null)
      cd.b(this.a).run();
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof cp));
    for (cp localcp = (cp)localObject; ; localcp = null)
    {
      if (localcp != null)
        localcp.b(paramView);
      return;
    }
  }

  public final void c(View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof cp));
    for (cp localcp = (cp)localObject; ; localcp = null)
    {
      if (localcp != null)
        localcp.c(paramView);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ch
 * JD-Core Version:    0.6.2
 */