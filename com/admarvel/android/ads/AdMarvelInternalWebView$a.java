package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Handler;
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

class AdMarvelInternalWebView$a extends WebChromeClient
{
  private WebChromeClient.CustomViewCallback a;
  private View b;
  private FrameLayout c;
  private final WeakReference<AdMarvelInternalWebView> d;
  private final WeakReference<Context> e;

  public AdMarvelInternalWebView$a(AdMarvelInternalWebView paramAdMarvelInternalWebView, Context paramContext)
  {
    this.d = new WeakReference(paramAdMarvelInternalWebView);
    this.e = new WeakReference(paramContext);
  }

  void a()
  {
    onHideCustomView();
  }

  public View getVideoLoadingProgressView()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.d.get();
    if (localAdMarvelInternalWebView == null)
      return super.getVideoLoadingProgressView();
    if (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
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
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.d.get();
    if (localAdMarvelInternalWebView == null)
      return true;
    if (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
      return true;
    return super.onConsoleMessage(paramConsoleMessage);
  }

  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.d.get();
    if (localAdMarvelInternalWebView == null);
    while (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
      return;
    paramCallback.invoke(paramString, true, false);
  }

  public void onHideCustomView()
  {
    super.onHideCustomView();
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.d.get();
    if (localAdMarvelInternalWebView == null);
    while (true)
    {
      return;
      if (!AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
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
              if ((localWindow.getCurrentFocus() instanceof AdMarvelInternalWebView))
                ((AdMarvelInternalWebView)localWindow.getCurrentFocus()).setOnKeyListener(null);
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
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.d.get();
    if (localAdMarvelInternalWebView == null)
    {
      paramJsResult.cancel();
      return true;
    }
    if (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
    {
      paramJsResult.cancel();
      return true;
    }
    if (AdMarvelInternalWebView.m(localAdMarvelInternalWebView).get() == true)
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
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.d.get();
    if (localAdMarvelInternalWebView == null)
    {
      paramJsResult.cancel();
      return true;
    }
    if (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
    {
      paramJsResult.cancel();
      return true;
    }
    if (AdMarvelInternalWebView.m(localAdMarvelInternalWebView).get() == true)
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
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.d.get();
    if (localAdMarvelInternalWebView == null)
    {
      paramJsPromptResult.cancel();
      return true;
    }
    if (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
    {
      paramJsPromptResult.cancel();
      return true;
    }
    if (AdMarvelInternalWebView.m(localAdMarvelInternalWebView).get() == true)
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
    label387: 
    while (true)
    {
      AdMarvelInternalWebView localAdMarvelInternalWebView;
      w localw;
      label88: AdMarvelActivity.g localg;
      try
      {
        if (this.d != null)
        {
          localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.d.get();
          break label375;
          if (!AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
            if ((localAdMarvelInternalWebView.getParent() != null) && ((localAdMarvelInternalWebView.getParent() instanceof RelativeLayout)))
            {
              localw = (w)((RelativeLayout)localAdMarvelInternalWebView.getParent()).findViewWithTag(localAdMarvelInternalWebView.GUID + "CONTROLS");
              if ((localw != null) && (AdMarvelInternalWebView.e(localAdMarvelInternalWebView).get() == true))
                ((ProgressBar)localw.findViewWithTag(localAdMarvelInternalWebView.GUID + "PROGRESS_BAR")).setProgress(paramInt);
              Context localContext = (Context)this.e.get();
              if ((localContext == null) || (!(localContext instanceof Activity)))
                break label380;
              Activity localActivity = (Activity)localContext;
              if ((localActivity == null) || (!(localActivity instanceof AdMarvelActivity)))
                break label380;
              AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)localActivity;
              if (localAdMarvelActivity != null)
              {
                WeakReference localWeakReference = localAdMarvelActivity.a;
                localg = null;
                if (localWeakReference != null)
                  localg = (AdMarvelActivity.g)localAdMarvelActivity.a.get();
                if (localg != null)
                {
                  if (AdMarvelInternalWebView.f(localAdMarvelInternalWebView).get() != true)
                    break label360;
                  if ((paramInt < 10) || (AdMarvelInternalWebView.i(localAdMarvelInternalWebView) <= 2))
                    break label387;
                  AdMarvelInternalWebView.h(localAdMarvelInternalWebView).post(new AdMarvelInternalWebView.k(localAdMarvelInternalWebView, localActivity));
                }
              }
              label280: if ((ac.a() < 14) || (paramInt != 100) || (AdMarvelInternalWebView.n(localAdMarvelInternalWebView)) || (!localAdMarvelActivity.c) || (localAdMarvelActivity.d))
                break label380;
              AdMarvelInternalWebView.b(localAdMarvelInternalWebView, true);
              localAdMarvelInternalWebView.loadUrl("javascript:AdApp.adView().play()");
              return;
            }
        }
      }
      catch (Exception localException)
      {
        Logging.log("Exception in onProgressChanged " + localException.getMessage());
        return;
      }
      label360: label375: label380: 
      do
      {
        localg.setProgress(paramInt);
        break label280;
        localw = null;
        break label88;
        while (localAdMarvelInternalWebView == null)
        {
          return;
          localAdMarvelInternalWebView = null;
        }
      }
      while (paramInt < 30);
    }
  }

  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    super.onShowCustomView(paramView, paramCustomViewCallback);
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.d.get();
    if (localAdMarvelInternalWebView == null);
    Activity localActivity;
    do
    {
      Context localContext;
      do
      {
        do
          return;
        while (AdMarvelInternalWebView.a(localAdMarvelInternalWebView));
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
    this.c = new FrameLayout(localAdMarvelInternalWebView.getContext());
    this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    LinearLayout localLinearLayout = new LinearLayout(localAdMarvelInternalWebView.getContext());
    localLinearLayout.setBackgroundColor(-1442840576);
    localLinearLayout.setGravity(53);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams.weight = 40.0F;
    localLinearLayout.setLayoutParams(localLayoutParams);
    localLinearLayout.addView(new AdMarvelInternalWebView.i(localAdMarvelInternalWebView.getContext(), localAdMarvelInternalWebView, this, localActivity));
    this.c.addView(paramView);
    this.c.addView(localLinearLayout);
    this.c.setBackgroundColor(-16777216);
    if ((paramView instanceof FrameLayout))
    {
      View localView = ((FrameLayout)paramView).getFocusedChild();
      if ((localView instanceof VideoView))
      {
        ((VideoView)localView).setOnErrorListener(new MediaPlayer.OnErrorListener()
        {
          public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            AdMarvelInternalWebView.a.this.a();
            return true;
          }
        });
        if ((localWindow.getCurrentFocus() instanceof AdMarvelInternalWebView))
          ((AdMarvelInternalWebView)localWindow.getCurrentFocus()).setOnKeyListener(new View.OnKeyListener()
          {
            public boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
            {
              if ((paramAnonymousKeyEvent.getAction() == 0) && (paramAnonymousInt == 4))
              {
                if (AdMarvelInternalWebView.a.a(AdMarvelInternalWebView.a.this) == null)
                  return paramAnonymousView.onKeyDown(paramAnonymousInt, paramAnonymousKeyEvent);
                AdMarvelInternalWebView.a.this.a();
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
              if (AdMarvelInternalWebView.a.a(AdMarvelInternalWebView.a.this) == null)
                return paramAnonymousView.onKeyDown(paramAnonymousInt, paramAnonymousKeyEvent);
              AdMarvelInternalWebView.a.this.a();
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInternalWebView.a
 * JD-Core Version:    0.6.2
 */