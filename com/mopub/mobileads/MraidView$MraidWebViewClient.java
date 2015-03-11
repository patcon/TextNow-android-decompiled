package com.mopub.mobileads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;

class MraidView$MraidWebViewClient extends WebViewClient
{
  private MraidView$MraidWebViewClient(MraidView paramMraidView)
  {
  }

  public void onLoadResource(WebView paramWebView, String paramString)
  {
    new StringBuilder().append("Loaded resource: ").append(paramString).toString();
  }

  public void onPageFinished(WebView paramWebView, String paramString)
  {
    MraidView localMraidView;
    if (!MraidView.access$500(this.this$0))
    {
      MraidView.access$600(this.this$0).initializeJavaScriptState();
      this.this$0.fireChangeEventForProperty(MraidPlacementTypeProperty.createWithType(MraidView.access$700(this.this$0)));
      this.this$0.fireReadyEvent();
      if (this.this$0.getMraidListener() != null)
        this.this$0.getMraidListener().onReady(this.this$0);
      localMraidView = this.this$0;
      if (this.this$0.getVisibility() != 0)
        break label122;
    }
    label122: for (boolean bool = true; ; bool = false)
    {
      MraidView.access$802(localMraidView, bool);
      this.this$0.fireChangeEventForProperty(MraidViewableProperty.createWithViewable(MraidView.access$800(this.this$0)));
      MraidView.access$502(this.this$0, true);
      return;
    }
  }

  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    new StringBuilder().append("Error: ").append(paramString1).toString();
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    String str = Uri.parse(paramString).getScheme();
    if ("mopub".equals(str))
      return true;
    if ("mraid".equals(str))
    {
      MraidView.access$400(this.this$0, URI.create(paramString));
      return true;
    }
    if (this.this$0.wasClicked())
    {
      Intent localIntent = new Intent();
      localIntent.setAction("android.intent.action.VIEW");
      localIntent.setData(Uri.parse(paramString));
      localIntent.addFlags(268435456);
      try
      {
        this.this$0.getContext().startActivity(localIntent);
        return true;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        return false;
      }
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidView.MraidWebViewClient
 * JD-Core Version:    0.6.2
 */