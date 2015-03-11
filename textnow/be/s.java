package textnow.be;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;

final class s extends WebViewClient
{
  private s(q paramq)
  {
  }

  public final void a()
  {
    this.a.d.loadUrl("javascript: tremorvideo.EmbedVideoPlayer.stopVideo();");
  }

  protected final void a(String paramString)
  {
    this.a.d.loadUrl("javascript: tremorcore.nativeCallComplete('" + paramString + "');");
  }

  public final void b()
  {
    this.a.d.loadUrl("javascript: tremorvideo.EmbedVideoPlayer.pauseVideo();");
  }

  public final void c()
  {
    this.a.d.loadUrl("javascript: tremorvideo.EmbedVideoPlayer.resumeVideo();");
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (!this.a.d.i)
    {
      this.a.d.j = false;
      this.a.d.loadUrl("javascript: tremorvideo.EmbedVideoPlayer.setIsAndroid()");
      this.a.d.loadUrl("javascript: tremorvideo.EmbedVideoPlayer.initVideo('" + this.a.d.e + "');");
      this.a.d.i = true;
    }
  }

  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    this.a.h.i();
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (Uri.parse(paramString).getScheme().equals("tremorvideo"))
    {
      this.a.a(URI.create(paramString));
      return true;
    }
    if ((q.a(this.a) != null) && (paramString.startsWith(q.a(this.a))))
    {
      this.a.h.a(paramString);
      return true;
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.be.s
 * JD-Core Version:    0.6.2
 */