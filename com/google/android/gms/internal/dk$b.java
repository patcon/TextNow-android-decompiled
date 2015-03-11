package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

@ez
final class dk$b extends RelativeLayout
{
  private final gm ly;

  public dk$b(Context paramContext, String paramString)
  {
    super(paramContext);
    this.ly = new gm(paramContext, paramString);
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    this.ly.c(paramMotionEvent);
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dk.b
 * JD-Core Version:    0.6.2
 */