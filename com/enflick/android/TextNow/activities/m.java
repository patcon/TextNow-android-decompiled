package com.enflick.android.TextNow.activities;

import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import textnow.q.ad;

final class m
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  View a = this.c.a.findViewById(2131165286);
  Rect b = new Rect();

  private m(l paraml)
  {
  }

  public final void onGlobalLayout()
  {
    this.c.a.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.b);
    int i = this.b.top;
    if (this.c.a.getWindowManager().getDefaultDisplay().getHeight() - i - this.a.getHeight() - this.c.a.q() > ad.a(this.c.a, 100))
      if (!l.a(this.c))
      {
        this.c.p();
        l.a(this.c, true);
      }
    while (!l.a(this.c))
      return;
    this.c.q();
    l.a(this.c, false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.m
 * JD-Core Version:    0.6.2
 */