package textnow.bk;

import android.content.Context;
import android.os.Handler;
import java.util.List;

final class bg
  implements bv
{
  private static bg a;
  private final be b = new be();
  private final Handler c;
  private final aj d;

  private bg(Context paramContext)
  {
    this.d = aj.a(paramContext);
    this.c = new Handler(paramContext.getMainLooper());
  }

  public static bg a(Context paramContext)
  {
    try
    {
      if (a == null)
        a = new bg(paramContext.getApplicationContext());
      bg localbg = a;
      return localbg;
    }
    finally
    {
    }
  }

  public final List<av> a(Object paramObject)
  {
    return this.b.a(this.d, paramObject);
  }

  public final void a(Object paramObject, q paramq, av paramav)
  {
    if (ae.a(paramq.a()))
    {
      paramav.a("Blank url");
      return;
    }
    boolean bool = paramq.g();
    Object localObject;
    if (bool)
      localObject = new al()
      {
        public final void a(String paramAnonymousString)
        {
        }

        public final void a(az paramAnonymousaz)
        {
        }
      };
    while (true)
    {
      az localaz = this.d.a(paramq, (al)localObject);
      if ((bool) || (localaz.c() != ba.b) || (this.b.a(paramav) == null))
        break;
      paramav.a(localaz);
      return;
      localObject = new bh(this);
      this.b.a(paramav, paramObject, (bh)localObject);
    }
  }

  public final void a(av paramav)
  {
    bh localbh = this.b.a(paramav);
    localbh.a.d.a(localbh);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.bg
 * JD-Core Version:    0.6.2
 */