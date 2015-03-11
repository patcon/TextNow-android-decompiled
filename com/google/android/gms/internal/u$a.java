package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;

final class u$a extends ViewSwitcher
{
  private final ep kI;

  public u$a(Context paramContext)
  {
    super(paramContext);
    this.kI = new ep(paramContext);
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    this.kI.c(paramMotionEvent);
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.u.a
 * JD-Core Version:    0.6.2
 */