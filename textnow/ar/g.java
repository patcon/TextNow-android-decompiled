package textnow.ar;

import android.content.Context;
import android.view.KeyEvent;

public final class g extends e
{
  protected g(Context paramContext, String paramString, c paramc)
  {
    super(paramContext, paramString, paramc);
  }

  public final boolean onKeyLongPress(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84)
      return true;
    return super.onKeyLongPress(paramInt, paramKeyEvent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ar.g
 * JD-Core Version:    0.6.2
 */