package textnow.ay;

import android.content.Context;
import android.view.KeyEvent;
import android.webkit.WebViewClient;

public final class h extends e
{
  protected h(Context paramContext, String paramString, c paramc)
  {
    super(paramContext, paramString, paramc);
  }

  protected final WebViewClient b()
  {
    return new i(this, (byte)0);
  }

  public final boolean onKeyLongPress(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84)
      return true;
    return super.onKeyLongPress(paramInt, paramKeyEvent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ay.h
 * JD-Core Version:    0.6.2
 */