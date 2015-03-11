package com.mopub.mobileads;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

abstract interface BaseVideoViewController$BaseVideoViewControllerListener
{
  public abstract void onFinish();

  public abstract void onSetContentView(View paramView);

  public abstract void onSetRequestedOrientation(int paramInt);

  public abstract void onStartActivityForResult(Class<? extends Activity> paramClass, int paramInt, Bundle paramBundle);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.BaseVideoViewController.BaseVideoViewControllerListener
 * JD-Core Version:    0.6.2
 */