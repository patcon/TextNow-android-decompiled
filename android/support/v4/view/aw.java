package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;

class aw extends av
{
  static boolean b = false;

  public final void a(View paramView, a parama)
  {
    paramView.setAccessibilityDelegate((View.AccessibilityDelegate)parama.a());
  }

  public final boolean a(View paramView, int paramInt)
  {
    return paramView.canScrollHorizontally(paramInt);
  }

  public final boolean b(View paramView, int paramInt)
  {
    return paramView.canScrollVertically(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.view.aw
 * JD-Core Version:    0.6.2
 */