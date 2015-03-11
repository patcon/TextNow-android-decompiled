package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

final class cf
  implements Runnable
{
  WeakReference<View> a;
  cd b;

  private cf(ce paramce, cd paramcd, View paramView)
  {
    this.a = new WeakReference(paramView);
    this.b = paramcd;
  }

  public final void run()
  {
    ce.a(this.c, this.b, (View)this.a.get());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.cf
 * JD-Core Version:    0.6.2
 */