package com.mopub.common.util;

import android.view.View;
import android.view.ViewGroup;

public class Views
{
  public static void removeFromParent(View paramView)
  {
    if ((paramView == null) || (paramView.getParent() == null));
    while (!(paramView.getParent() instanceof ViewGroup))
      return;
    ((ViewGroup)paramView.getParent()).removeView(paramView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.Views
 * JD-Core Version:    0.6.2
 */