package textnow.ax;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;

public final class a
{
  WebView a;
  aj b;
  e c;
  public boolean d;
  private Activity e;

  public a(Context paramContext)
  {
    this.e = ((Activity)paramContext);
    this.a = new WebView(paramContext);
    this.a.getSettings().setJavaScriptEnabled(true);
    this.a.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    this.a.addJavascriptInterface(this, "Device");
    this.a.setWebViewClient(new c(this, (byte)0));
    this.a.setWebChromeClient(new b(this, (byte)0));
  }

  public final void a()
  {
    this.e.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        a.this.a.destroy();
        a.this.a = null;
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.a
 * JD-Core Version:    0.6.2
 */