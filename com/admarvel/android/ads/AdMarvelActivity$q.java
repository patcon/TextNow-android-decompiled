package com.admarvel.android.ads;

import android.graphics.Paint;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

class AdMarvelActivity$q
  implements Runnable
{
  private final WeakReference<AdMarvelActivity> a;
  private final WeakReference<AdMarvelInternalWebView> b;
  private String c;

  public AdMarvelActivity$q(String paramString, AdMarvelActivity paramAdMarvelActivity, AdMarvelInternalWebView paramAdMarvelInternalWebView)
  {
    this.c = paramString;
    this.a = new WeakReference(paramAdMarvelActivity);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
  }

  public void run()
  {
    final AdMarvelActivity localAdMarvelActivity;
    final AdMarvelInternalWebView localAdMarvelInternalWebView;
    RelativeLayout localRelativeLayout;
    p localp2;
    int j;
    try
    {
      localAdMarvelActivity = (AdMarvelActivity)this.a.get();
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
      if ((localAdMarvelActivity == null) || (localAdMarvelInternalWebView == null) || (this.c == null))
        return;
      if (this.c.length() <= 0)
        return;
      localAdMarvelActivity.c = true;
      localRelativeLayout = (RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.b);
      p localp1 = (p)localRelativeLayout.findViewWithTag(AdMarvelActivity.c(localAdMarvelActivity) + "BR_VIDEO");
      if (localp1 == null)
      {
        localp2 = new p(localAdMarvelActivity);
        localp2.setTag(AdMarvelActivity.c(localAdMarvelActivity) + "BR_VIDEO");
        if (!localAdMarvelActivity.d)
          break label399;
        RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
        localLayoutParams.addRule(13);
        localp2.setLayoutParams(localLayoutParams);
        int i = localRelativeLayout.getChildCount();
        for (j = 0; (j < i) && (localRelativeLayout.getChildAt(j) != localAdMarvelInternalWebView); j++);
      }
      if (this.c == null)
        return;
      localp1.a(Uri.parse(this.c));
      return;
    }
    catch (Exception localException1)
    {
      Logging.log(Log.getStackTraceString(localException1));
      return;
    }
    localRelativeLayout.addView(localp2, j);
    localRelativeLayout.removeView(localAdMarvelInternalWebView);
    localAdMarvelInternalWebView.setBackgroundColor(0);
    localAdMarvelInternalWebView.setBackgroundDrawable(null);
    int k = ac.a();
    if (k >= 11);
    try
    {
      Class[] arrayOfClass = new Class[2];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = Paint.class;
      Method localMethod = View.class.getMethod("setLayerType", arrayOfClass);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(1);
      arrayOfObject[1] = null;
      localMethod.invoke(localAdMarvelInternalWebView, arrayOfObject);
      label329: localRelativeLayout.addView(localAdMarvelInternalWebView);
      while (true)
      {
        localp2.a(Uri.parse(this.c));
        localp2.setVisibility(0);
        localp2.a(new MediaPlayer.OnPreparedListener()
        {
          public void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
          {
            if (localAdMarvelActivity.d)
            {
              if ((AdMarvelActivity.v(localAdMarvelActivity) != null) && (AdMarvelActivity.v(localAdMarvelActivity).length() > 0))
                localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelActivity.v(localAdMarvelActivity) + "()");
              if ((AdMarvelActivity.w(localAdMarvelActivity) != null) && (AdMarvelActivity.w(localAdMarvelActivity).length() > 0))
                localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelActivity.w(localAdMarvelActivity) + "()");
              return;
            }
            localAdMarvelInternalWebView.loadUrl("javascript:AdApp.videoView().setDuration(" + paramAnonymousMediaPlayer.getDuration() / 1000 + ")");
            localAdMarvelInternalWebView.loadUrl("javascript:AdApp.videoView().setCanPlay(true)");
            localAdMarvelInternalWebView.loadUrl("javascript:AdApp.adView().play()");
          }
        });
        localp2.a(new MediaPlayer.OnCompletionListener()
        {
          public void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
          {
            if (localAdMarvelActivity.d)
              if ((AdMarvelActivity.x(localAdMarvelActivity) != null) && (AdMarvelActivity.x(localAdMarvelActivity).length() > 0))
                localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelActivity.x(localAdMarvelActivity) + "()");
            while (true)
            {
              AdMarvelActivity.d locald = new AdMarvelActivity.d(localAdMarvelActivity);
              AdMarvelActivity.f(localAdMarvelActivity).post(locald);
              return;
              localAdMarvelInternalWebView.loadUrl("javascript:AdApp.videoView().end();");
            }
          }
        });
        localp2.a(new MediaPlayer.OnErrorListener()
        {
          public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            AdMarvelActivity.d locald = new AdMarvelActivity.d(localAdMarvelActivity);
            AdMarvelActivity.f(localAdMarvelActivity).post(locald);
            if ((localAdMarvelActivity.d) && (AdMarvelActivity.y(localAdMarvelActivity) != null) && (AdMarvelActivity.y(localAdMarvelActivity).length() > 0))
              localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelActivity.y(localAdMarvelActivity) + "()");
            return false;
          }
        });
        return;
        label399: localp2.setLayoutParams(new RelativeLayout.LayoutParams(1, 1));
        localRelativeLayout.addView(localp2);
      }
    }
    catch (Exception localException2)
    {
      break label329;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.q
 * JD-Core Version:    0.6.2
 */