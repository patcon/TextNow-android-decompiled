package com.enflick.android.TextNow.activities;

import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import textnow.v.z;

final class r
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  View a = this.c.a.findViewById(2131558516);
  Rect b = new Rect();

  private r(q paramq)
  {
  }

  public final void onGlobalLayout()
  {
    this.c.a.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.b);
    int i = this.b.top;
    if (this.c.a.getWindowManager().getDefaultDisplay().getHeight() - i - this.a.getHeight() - this.c.a.t() > z.a(this.c.a, 100))
      if (!q.a(this.c))
      {
        this.c.p();
        q.a(this.c, true);
      }
    while (!q.a(this.c))
      return;
    this.c.q();
    q.a(this.c, false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.r
 * JD-Core Version:    0.6.2
 */