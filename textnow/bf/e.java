package textnow.bf;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

final class e extends WebChromeClient
{
  private e(d paramd)
  {
  }

  public final void onConsoleMessage(String paramString1, int paramInt, String paramString2)
  {
    new StringBuilder().append("MSG: ").append(paramString1).append("; Line: ").append(paramInt).append("; Source: ").append(paramString2).toString();
  }

  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    new StringBuilder().append("MSG: ").append(paramConsoleMessage.message()).append("; Line: ").append(paramConsoleMessage.lineNumber()).append("; Source: ").append(paramConsoleMessage.sourceId()).toString();
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bf.e
 * JD-Core Version:    0.6.2
 */