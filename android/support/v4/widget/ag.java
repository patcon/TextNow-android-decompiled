package android.support.v4.widget;

import android.support.v4.view.aq;
import android.view.View;
import java.util.ArrayList;

final class ag
  implements Runnable
{
  final View a;

  ag(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    this.a = paramView;
  }

  public final void run()
  {
    if (this.a.getParent() == this.b)
    {
      aq.a(this.a, 0, null);
      SlidingPaneLayout.a(this.b, this.a);
    }
    SlidingPaneLayout.g(this.b).remove(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.ag
 * JD-Core Version:    0.6.2
 */