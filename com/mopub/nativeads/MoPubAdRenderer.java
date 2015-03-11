package com.mopub.nativeads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public abstract interface MoPubAdRenderer<T>
{
  public abstract View createAdView(Context paramContext, ViewGroup paramViewGroup);

  public abstract void renderAdView(View paramView, T paramT);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.MoPubAdRenderer
 * JD-Core Version:    0.6.2
 */