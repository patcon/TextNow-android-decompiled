package textnow.ay;

import android.app.Activity;
import android.webkit.WebView;
import java.util.Timer;
import java.util.TimerTask;

final class c extends TimerTask
{
  String a;

  public c(b paramb, String paramString)
  {
    this.a = paramString;
  }

  public final void run()
  {
    this.b.e.purge();
    this.b.e.cancel();
    this.b.e = null;
    b.b(this.b).runOnUiThread(new Runnable()
    {
      public final void run()
      {
        b.c(c.this.b).loadUrl(c.this.a);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ay.c
 * JD-Core Version:    0.6.2
 */