package com.mopub.mobileads.util;

import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;

public class Interstitials
{
  public static boolean addCloseEventRegion(ViewGroup paramViewGroup, ViewGroup.LayoutParams paramLayoutParams, View.OnClickListener paramOnClickListener)
  {
    if ((paramViewGroup == null) || (paramViewGroup.getContext() == null))
      return false;
    Button localButton = new Button(paramViewGroup.getContext());
    localButton.setVisibility(0);
    localButton.setBackgroundColor(0);
    localButton.setOnClickListener(paramOnClickListener);
    paramViewGroup.addView(localButton, paramLayoutParams);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.Interstitials
 * JD-Core Version:    0.6.2
 */