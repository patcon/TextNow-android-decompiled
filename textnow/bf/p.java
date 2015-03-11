package textnow.bf;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.tremorvideo.sdk.android.videoad.r;

final class p extends WebChromeClient
{
  private p(l paraml)
  {
  }

  public final void onConsoleMessage(String paramString1, int paramInt, String paramString2)
  {
    r.d("GenericWebview Console: " + paramString1);
  }

  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    r.d("GenericWebview Console: " + paramConsoleMessage.message());
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bf.p
 * JD-Core Version:    0.6.2
 */