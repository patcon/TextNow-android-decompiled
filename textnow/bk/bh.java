package textnow.bk;

import android.os.Handler;

final class bh extends al
{
  bh(bg parambg)
  {
  }

  public final void a(final String paramString)
  {
    bg.b(this.a).post(new Runnable()
    {
      public final void run()
      {
        av localav = bg.a(bh.this.a).a(bh.this);
        if (localav != null)
          localav.a(paramString);
      }
    });
  }

  public final void a(final az paramaz)
  {
    bg.b(this.a).post(new Runnable()
    {
      public final void run()
      {
        av localav = bg.a(bh.this.a).a(bh.this);
        if (localav != null)
          localav.a(paramaz);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.bh
 * JD-Core Version:    0.6.2
 */