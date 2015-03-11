package android.support.v4.widget;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class s
  implements View.OnApplyWindowInsetsListener
{
  public final WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    t localt = (t)paramView;
    if (paramWindowInsets.getSystemWindowInsetTop() > 0);
    for (boolean bool = true; ; bool = false)
    {
      localt.a(paramWindowInsets, bool);
      return paramWindowInsets.consumeSystemWindowInsets();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.s
 * JD-Core Version:    0.6.2
 */