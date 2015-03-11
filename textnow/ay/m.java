package textnow.ay;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout.LayoutParams;
import com.tremorvideo.sdk.android.videoad.r;
import java.net.URI;
import org.json.JSONObject;

final class m extends WebViewClient
{
  private m(l paraml)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    JSONObject localJSONObject;
    if ((paramString.equals(l.d(this.a))) && (!l.e(this.a)))
      localJSONObject = new JSONObject();
    try
    {
      ViewGroup.LayoutParams localLayoutParams = this.a.getLayoutParams();
      if ((localLayoutParams instanceof RelativeLayout.LayoutParams))
      {
        localJSONObject.put("x", ((RelativeLayout.LayoutParams)localLayoutParams).leftMargin);
        localJSONObject.put("y", ((RelativeLayout.LayoutParams)localLayoutParams).topMargin);
        localJSONObject.put("width", localLayoutParams.width);
        localJSONObject.put("height", localLayoutParams.height);
        localJSONObject.put("AndroidVersion", r.p());
      }
      this.a.c(localJSONObject.toString());
      l.a(this.a, true);
      this.a.b();
      new Thread()
      {
        public final void run()
        {
          m.this.a.c();
        }
      }
      .start();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        r.a(localException);
    }
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (paramString.indexOf("tel:") >= 0)
    {
      this.a.g.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(paramString)));
      return true;
    }
    if (Uri.parse(paramString).getScheme().equals("tmwi"))
    {
      l.a(this.a, URI.create(paramString));
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ay.m
 * JD-Core Version:    0.6.2
 */