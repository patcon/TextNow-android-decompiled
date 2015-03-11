package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

class d$a extends WebChromeClient
{
  private WebChromeClient.CustomViewCallback a;
  private View b;
  private FrameLayout c;
  private final WeakReference<d> d;
  private final WeakReference<Context> e;

  public d$a(d paramd, Context paramContext)
  {
    this.d = new WeakReference(paramd);
    this.e = new WeakReference(paramContext);
  }

  void a()
  {
    onHideCustomView();
  }

  public View getVideoLoadingProgressView()
  {
    d locald = (d)this.d.get();
    if (locald == null)
      return super.getVideoLoadingProgressView();
    if (d.a(locald))
      return super.getVideoLoadingProgressView();
    Context localContext = (Context)this.e.get();
    if ((localContext != null) && ((localContext instanceof Activity)))
    {
      Activity localActivity = (Activity)localContext;
      if (localActivity != null)
      {
        ProgressBar localProgressBar = new ProgressBar(localActivity, null, 16842871);
        localProgressBar.setIndeterminate(true);
        return localProgressBar;
      }
    }
    return super.getVideoLoadingProgressView();
  }

  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    d locald = (d)this.d.get();
    if (locald == null)
      return true;
    if (d.a(locald))
      return true;
    return super.onConsoleMessage(paramConsoleMessage);
  }

  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    d locald = (d)this.d.get();
    if (locald == null);
    while (d.a(locald))
      return;
    paramCallback.invoke(paramString, true, false);
  }

  public void onHideCustomView()
  {
    super.onHideCustomView();
    d locald = (d)this.d.get();
    if (locald == null);
    while (true)
    {
      return;
      if (!d.a(locald))
      {
        if (this.c != null)
        {
          Context localContext = (Context)this.e.get();
          if ((localContext != null) && ((localContext instanceof Activity)))
          {
            Activity localActivity = (Activity)localContext;
            if (localActivity != null)
            {
              Window localWindow = localActivity.getWindow();
              ViewGroup localViewGroup = (ViewGroup)localWindow.findViewById(16908290);
              this.c.removeView(this.b);
              this.b = null;
              localViewGroup.removeView(this.c);
              this.c = null;
              if ((localWindow.getCurrentFocus() instanceof d))
                ((d)localWindow.getCurrentFocus()).setOnKeyListener(null);
            }
          }
        }
        try
        {
          if (this.a != null)
          {
            this.a.onCustomViewHidden();
            return;
          }
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
      }
    }
  }

  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    d locald = (d)this.d.get();
    if (locald == null)
    {
      paramJsResult.cancel();
      return true;
    }
    if (d.a(locald))
    {
      paramJsResult.cancel();
      return true;
    }
    if (d.m(locald).get() == true)
    {
      paramJsResult.cancel();
      return true;
    }
    if ((this.e.get() != null) && ((this.e.get() instanceof Activity)))
      return super.onJsAlert(paramWebView, paramString1, paramString2, paramJsResult);
    paramJsResult.cancel();
    return true;
  }

  public boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    paramJsResult.cancel();
    return true;
  }

  public boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    d locald = (d)this.d.get();
    if (locald == null)
    {
      paramJsResult.cancel();
      return true;
    }
    if (d.a(locald))
    {
      paramJsResult.cancel();
      return true;
    }
    if (d.m(locald).get() == true)
    {
      paramJsResult.cancel();
      return true;
    }
    if ((this.e.get() != null) && ((this.e.get() instanceof Activity)))
      return super.onJsConfirm(paramWebView, paramString1, paramString2, paramJsResult);
    paramJsResult.cancel();
    return true;
  }

  public boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    d locald = (d)this.d.get();
    if (locald == null)
    {
      paramJsPromptResult.cancel();
      return true;
    }
    if (d.a(locald))
    {
      paramJsPromptResult.cancel();
      return true;
    }
    if (d.m(locald).get() == true)
    {
      paramJsPromptResult.cancel();
      return true;
    }
    if ((this.e.get() != null) && ((this.e.get() instanceof Activity)))
      return super.onJsPrompt(paramWebView, paramString1, paramString2, paramString3, paramJsPromptResult);
    paramJsPromptResult.cancel();
    return true;
  }

  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    d locald;
    while (true)
    {
      try
      {
        if (this.d == null)
          break label277;
        locald = (d)this.d.get();
        break;
        if (d.a(locald))
          break label276;
        if ((locald.getParent() != null) && ((locald.getParent() instanceof RelativeLayout)))
        {
          localo = (o)((RelativeLayout)locald.getParent()).findViewWithTag(locald.s + "CONTROLS");
          if (localo != null)
            ((ProgressBar)localo.findViewWithTag(locald.s + "PROGRESS_BAR")).setProgress(paramInt);
          Context localContext = (Context)this.e.get();
          if ((localContext == null) || (!(localContext instanceof Activity)))
            break label276;
          Activity localActivity = (Activity)localContext;
          if ((localActivity == null) || (!(localActivity instanceof AdMarvelActivity)))
            break label276;
          AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)localActivity;
          if ((localAdMarvelActivity == null) || (Version.getAndroidSDKVersion() < 14) || (paramInt != 100) || (d.o(locald)) || (!localAdMarvelActivity.f) || (localAdMarvelActivity.g))
            break label276;
          d.f(locald, true);
          locald.loadUrl("javascript:AdApp.adView().play()");
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log("Exception in onProgressChanged " + localException.getMessage());
        return;
      }
      o localo = null;
    }
    while (locald == null)
    {
      label276: return;
      label277: locald = null;
    }
  }

  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    super.onShowCustomView(paramView, paramCustomViewCallback);
    d locald = (d)this.d.get();
    if (locald == null);
    Activity localActivity;
    do
    {
      Context localContext;
      do
      {
        do
          return;
        while (d.a(locald));
        this.a = paramCustomViewCallback;
        localContext = (Context)this.e.get();
      }
      while ((localContext == null) || (!(localContext instanceof Activity)));
      localActivity = (Activity)localContext;
    }
    while (localActivity == null);
    if (this.b != null)
    {
      paramCustomViewCallback.onCustomViewHidden();
      return;
    }
    this.b = paramView;
    Window localWindow = localActivity.getWindow();
    ViewGroup localViewGroup = (ViewGroup)localWindow.findViewById(16908290);
    this.c = new FrameLayout(locald.getContext());
    this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    LinearLayout localLinearLayout = new LinearLayout(locald.getContext());
    localLinearLayout.setBackgroundColor(-1442840576);
    localLinearLayout.setGravity(53);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams.weight = 40.0F;
    localLinearLayout.setLayoutParams(localLayoutParams);
    localLinearLayout.addView(new d.j(locald.getContext(), locald, this, localActivity));
    this.c.addView(paramView);
    this.c.addView(localLinearLayout);
    if ((paramView instanceof FrameLayout))
    {
      View localView = ((FrameLayout)paramView).getFocusedChild();
      if ((localView instanceof VideoView))
      {
        ((VideoView)localView).setOnErrorListener(new MediaPlayer.OnErrorListener()
        {
          public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            d.a.this.a();
            return true;
          }
        });
        if ((localWindow.getCurrentFocus() instanceof d))
          ((d)localWindow.getCurrentFocus()).setOnKeyListener(new View.OnKeyListener()
          {
            public boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
            {
              if ((paramAnonymousKeyEvent.getAction() == 0) && (paramAnonymousInt == 4))
              {
                if (d.a.a(d.a.this) == null)
                  return paramAnonymousView.onKeyDown(paramAnonymousInt, paramAnonymousKeyEvent);
                d.a.this.a();
                return true;
              }
              return false;
            }
          });
        localView.setOnKeyListener(new View.OnKeyListener()
        {
          public boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
          {
            if ((paramAnonymousKeyEvent.getAction() == 0) && (paramAnonymousInt == 4))
            {
              if (d.a.a(d.a.this) == null)
                return paramAnonymousView.onKeyDown(paramAnonymousInt, paramAnonymousKeyEvent);
              d.a.this.a();
              return true;
            }
            return false;
          }
        });
      }
    }
    localViewGroup.addView(this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.d.a
 * JD-Core Version:    0.6.2
 */