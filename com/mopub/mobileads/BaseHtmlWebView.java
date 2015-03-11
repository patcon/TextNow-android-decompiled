package com.mopub.mobileads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.webkit.WebSettings;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.VersionCode;

public class BaseHtmlWebView extends BaseWebView
  implements ViewGestureDetector.UserClickListener
{
  private boolean mClicked;
  private final ViewGestureDetector mViewGestureDetector;

  public BaseHtmlWebView(Context paramContext, AdConfiguration paramAdConfiguration)
  {
    super(paramContext);
    disableScrollingAndZoom();
    getSettings().setJavaScriptEnabled(true);
    this.mViewGestureDetector = new ViewGestureDetector(paramContext, this, paramAdConfiguration);
    this.mViewGestureDetector.setUserClickListener(this);
    if (VersionCode.currentApiLevel().isAtLeast(VersionCode.ICE_CREAM_SANDWICH))
      enablePlugins(true);
    setBackgroundColor(0);
  }

  private void disableScrollingAndZoom()
  {
    setHorizontalScrollBarEnabled(false);
    setHorizontalScrollbarOverlay(false);
    setVerticalScrollBarEnabled(false);
    setVerticalScrollbarOverlay(false);
    getSettings().setSupportZoom(false);
  }

  public void init(boolean paramBoolean)
  {
    initializeOnTouchListener(paramBoolean);
  }

  void initializeOnTouchListener(final boolean paramBoolean)
  {
    setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        BaseHtmlWebView.this.mViewGestureDetector.sendTouchEvent(paramAnonymousMotionEvent);
        return (paramAnonymousMotionEvent.getAction() == 2) && (!paramBoolean);
      }
    });
  }

  void loadHtmlResponse(String paramString)
  {
    loadDataWithBaseURL("http://ads.mopub.com/", paramString, "text/html", "utf-8", null);
  }

  public void loadUrl(String paramString)
  {
    if (paramString == null);
    do
    {
      return;
      MoPubLog.d("Loading url: " + paramString);
    }
    while (!paramString.startsWith("javascript:"));
    super.loadUrl(paramString);
  }

  public void onResetUserClick()
  {
    this.mClicked = false;
  }

  public void onUserClick()
  {
    this.mClicked = true;
  }

  public boolean wasClicked()
  {
    return this.mClicked;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.BaseHtmlWebView
 * JD-Core Version:    0.6.2
 */