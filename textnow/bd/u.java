package textnow.bd;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tremorvideo.sdk.android.videoad.r;
import java.net.URI;

final class u extends WebViewClient
{
  private u(q paramq)
  {
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (!q.a(this.a))
    {
      q.a(this.a, true);
      q.b(this.a).c();
      this.a.a(new m(q.c(this.a)));
      this.a.n();
      if (this.a.j() != null)
      {
        aa localaa = this.a.j();
        localaa.a();
      }
      q.b(this.a, true);
    }
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (Uri.parse(paramString).getScheme().equals("mraid"))
    {
      q.a(this.a, URI.create(paramString));
      return true;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setData(Uri.parse(paramString));
    localIntent.addFlags(268435456);
    try
    {
      this.a.getContext().startActivity(localIntent);
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      r.a(localActivityNotFoundException);
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bd.u
 * JD-Core Version:    0.6.2
 */