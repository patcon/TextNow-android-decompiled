package android.support.v4.view;

import android.view.KeyEvent;

final class t extends s
{
  public final int a(int paramInt)
  {
    return KeyEvent.normalizeMetaState(paramInt);
  }

  public final boolean a(int paramInt1, int paramInt2)
  {
    return KeyEvent.metaStateHasModifiers(paramInt1, paramInt2);
  }

  public final boolean b(int paramInt)
  {
    return KeyEvent.metaStateHasNoModifiers(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.t
 * JD-Core Version:    0.6.2
 */