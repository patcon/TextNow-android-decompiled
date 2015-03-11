package textnow.f;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class a
{
  private static final d a = new c();

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new b();
      return;
    }
  }

  public static x a(AccessibilityEvent paramAccessibilityEvent)
  {
    return new x(paramAccessibilityEvent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.f.a
 * JD-Core Version:    0.6.2
 */