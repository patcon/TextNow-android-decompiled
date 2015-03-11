package textnow.ba;

import android.app.Activity;
import android.webkit.WebView;
import java.util.Timer;
import java.util.TimerTask;

final class d extends TimerTask
{
  String a;

  public d(c paramc, String paramString)
  {
    this.a = paramString;
  }

  public final void run()
  {
    this.b.e.purge();
    this.b.e.cancel();
    this.b.e = null;
    c.b(this.b).runOnUiThread(new Runnable()
    {
      public final void run()
      {
        c.c(d.this.b).loadUrl(d.this.a);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ba.d
 * JD-Core Version:    0.6.2
 */