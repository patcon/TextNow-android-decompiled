package com.flurry.sdk;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.view.Window;

public final class ch
{
  @TargetApi(11)
  public static void a(Window paramWindow)
  {
    if (paramWindow == null);
    while (Build.VERSION.SDK_INT < 11)
      return;
    paramWindow.setFlags(16777216, 16777216);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ch
 * JD-Core Version:    0.6.2
 */