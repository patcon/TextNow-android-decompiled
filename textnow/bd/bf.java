package textnow.bd;

import android.content.Context;
import android.os.Handler;
import java.util.List;

final class bf
  implements bt
{
  private static bf a;
  private final bd b = new bd();
  private final Handler c;
  private final ai d;

  private bf(Context paramContext)
  {
    this.d = ai.a(paramContext);
    this.c = new Handler(paramContext.getMainLooper());
  }

  public static bf a(Context paramContext)
  {
    try
    {
      if (a == null)
        a = new bf(paramContext.getApplicationContext());
      bf localbf = a;
      return localbf;
    }
    finally
    {
    }
  }

  public final List<au> a(Object paramObject)
  {
    return this.b.a(this.d, paramObject);
  }

  public final void a(Object paramObject, p paramp, au paramau)
  {
    if (ad.a(paramp.a()))
    {
      paramau.a("Blank url");
      return;
    }
    boolean bool = paramp.g();
    Object localObject;
    if (bool)
      localObject = new ak()
      {
        public final void a(String paramAnonymousString)
        {
        }

        public final void a(ay paramAnonymousay)
        {
        }
      };
    while (true)
    {
      ay localay = this.d.a(paramp, (ak)localObject);
      if ((bool) || (localay.c() != az.b) || (this.b.a(paramau) == null))
        break;
      paramau.a(localay);
      return;
      localObject = new bg(this);
      this.b.a(paramau, paramObject, (bg)localObject);
    }
  }

  public final void a(au paramau)
  {
    bg localbg = this.b.a(paramau);
    localbg.a.d.a(localbg);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.bf
 * JD-Core Version:    0.6.2
 */