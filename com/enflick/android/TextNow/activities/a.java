package com.enflick.android.TextNow.activities;

import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import textnow.v.z;

final class a
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  Rect a = new Rect();

  private a(ChatHeadMessageActivity paramChatHeadMessageActivity)
  {
  }

  public final void onGlobalLayout()
  {
    this.b.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.a);
    int i = this.a.top;
    int j = this.b.getWindowManager().getDefaultDisplay().getHeight() - i - ChatHeadMessageActivity.a(this.b).getHeight();
    if ((ChatHeadMessageActivity.b(this.b) != null) && (ChatHeadMessageActivity.b(this.b).isVisible()) && (j > z.a(this.b, 300)))
      if (!ChatHeadMessageActivity.c(this.b))
      {
        this.b.i();
        ChatHeadMessageActivity.b(this.b, true);
      }
    while (!ChatHeadMessageActivity.c(this.b))
      return;
    this.b.j();
    ChatHeadMessageActivity.b(this.b, false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.a
 * JD-Core Version:    0.6.2
 */