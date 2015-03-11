package textnow.ay;

import android.app.Activity;
import java.util.Timer;
import java.util.TimerTask;

final class s extends TimerTask
{
  String a;

  public s(l paraml, String paramString)
  {
    this.a = paramString;
  }

  public final void run()
  {
    this.b.h.purge();
    this.b.h.cancel();
    this.b.h = null;
    this.b.g.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        if (!s.this.b.d)
          s.this.b.loadUrl(s.this.a);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ay.s
 * JD-Core Version:    0.6.2
 */