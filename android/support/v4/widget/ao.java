package android.support.v4.widget;

import android.support.v4.view.av;
import android.view.View;
import java.util.ArrayList;

final class ao
  implements Runnable
{
  final View a;

  ao(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    this.a = paramView;
  }

  public final void run()
  {
    if (this.a.getParent() == this.b)
    {
      av.a(this.a, 0, null);
      SlidingPaneLayout.a(this.b, this.a);
    }
    SlidingPaneLayout.g(this.b).remove(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.ao
 * JD-Core Version:    0.6.2
 */