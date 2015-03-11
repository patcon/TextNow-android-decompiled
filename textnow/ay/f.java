package textnow.ay;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class f extends WebViewClient
{
  protected f(e parame)
  {
  }

  protected final void a()
  {
    e.b(this.a, false);
    if (this.a.isShowing())
      this.a.dismiss();
  }

  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    if ((e.b(this.a)) && (!e.c(this.a)))
    {
      e.b(this.a, false);
      this.a.getWindow().setFlags(1024, 1024);
      this.a.show();
      String str = e.d(this.a).getTitle();
      if ((str != null) && (str.length() > 0))
        e.e(this.a).setText(str);
      paramWebView.forceLayout();
    }
    if ((e.a(this.a) != null) && (e.a(this.a).isShowing()))
      e.a(this.a).dismiss();
  }

  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    new StringBuilder().append("Webview loading URL: ").append(paramString).toString();
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    if (!e.a(this.a).isShowing())
      e.a(this.a).show();
  }

  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    this.a.d.a(new a(paramString1, paramInt, paramString2));
    a();
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    new StringBuilder().append("Redirect URL: ").append(paramString).toString();
    if (paramString.startsWith("fbconnect://success"))
    {
      Bundle localBundle = j.a(paramString);
      String str = localBundle.getString("error");
      if (str == null)
        str = localBundle.getString("error_type");
      if (str == null)
        this.a.d.a(localBundle);
      while (true)
      {
        e.a(this.a, true);
        this.a.dismiss();
        return true;
        if ((str.equals("access_denied")) || (str.equals("OAuthAccessDeniedException")))
          this.a.d.a();
        else
          this.a.d.a(new d(str));
      }
    }
    if (paramString.startsWith("fbconnect://cancel"))
    {
      this.a.d.a();
      this.a.dismiss();
      return true;
    }
    if (paramString.contains("touch"))
      return false;
    this.a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ay.f
 * JD-Core Version:    0.6.2
 */