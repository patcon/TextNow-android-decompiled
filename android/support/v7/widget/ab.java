package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;

final class ab
  implements Runnable
{
  private ab(aa paramaa)
  {
  }

  public final void run()
  {
    aa.a(this.a).getParent().requestDisallowInterceptTouchEvent(true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ab
 * JD-Core Version:    0.6.2
 */