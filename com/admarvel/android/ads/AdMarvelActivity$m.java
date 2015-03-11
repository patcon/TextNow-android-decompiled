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

class AdMarvelActivity$m
  implements Runnable
{
  private final WeakReference<AdMarvelActivity> a;
  private final WeakReference<d> b;
  private String c;

  public AdMarvelActivity$m(String paramString, AdMarvelActivity paramAdMarvelActivity, d paramd)
  {
    this.c = paramString;
    this.a = new WeakReference(paramAdMarvelActivity);
    this.b = new WeakReference(paramd);
  }

  public void run()
  {
    final AdMarvelActivity localAdMarvelActivity;
    final d locald;
    RelativeLayout localRelativeLayout;
    j localj2;
    int j;
    try
    {
      localAdMarvelActivity = (AdMarvelActivity)this.a.get();
      locald = (d)this.b.get();
      if ((localAdMarvelActivity == null) || (locald == null) || (this.c == null))
        return;
      if (this.c.length() <= 0)
        return;
      localAdMarvelActivity.f = true;
      localRelativeLayout = (RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.a);
      j localj1 = (j)localRelativeLayout.findViewWithTag(localAdMarvelActivity.e + "BR_VIDEO");
      if (localj1 == null)
      {
        localj2 = new j(localAdMarvelActivity);
        localj2.setTag(localAdMarvelActivity.e + "BR_VIDEO");
        if (!localAdMarvelActivity.g)
          break label399;
        RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
        localLayoutParams.addRule(13);
        localj2.setLayoutParams(localLayoutParams);
        int i = localRelativeLayout.getChildCount();
        for (j = 0; (j < i) && (localRelativeLayout.getChildAt(j) != locald); j++);
      }
      if (this.c == null)
        return;
      localj1.a(Uri.parse(this.c));
      return;
    }
    catch (Exception localException1)
    {
      Logging.log(Log.getStackTraceString(localException1));
      return;
    }
    localRelativeLayout.addView(localj2, j);
    localRelativeLayout.removeView(locald);
    locald.setBackgroundColor(0);
    locald.setBackgroundDrawable(null);
    int k = Version.getAndroidSDKVersion();
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
      localMethod.invoke(locald, arrayOfObject);
      label329: localRelativeLayout.addView(locald);
      while (true)
      {
        localj2.a(Uri.parse(this.c));
        localj2.setVisibility(0);
        localj2.a(new MediaPlayer.OnPreparedListener()
        {
          public void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
          {
            if (localAdMarvelActivity.g)
            {
              if ((localAdMarvelActivity.h != null) && (localAdMarvelActivity.h.length() > 0))
                locald.loadUrl("javascript:" + localAdMarvelActivity.h + "()");
              if ((localAdMarvelActivity.j != null) && (localAdMarvelActivity.j.length() > 0))
                locald.loadUrl("javascript:" + localAdMarvelActivity.j + "()");
              return;
            }
            locald.loadUrl("javascript:AdApp.videoView().setDuration(" + paramAnonymousMediaPlayer.getDuration() / 1000 + ")");
            locald.loadUrl("javascript:AdApp.videoView().setCanPlay(true)");
            locald.loadUrl("javascript:AdApp.adView().play()");
          }
        });
        localj2.a(new MediaPlayer.OnCompletionListener()
        {
          public void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
          {
            if (localAdMarvelActivity.g)
              if ((localAdMarvelActivity.l != null) && (localAdMarvelActivity.l.length() > 0))
                locald.loadUrl("javascript:" + localAdMarvelActivity.l + "()");
            while (true)
            {
              AdMarvelActivity.d locald = new AdMarvelActivity.d(localAdMarvelActivity);
              localAdMarvelActivity.d.post(locald);
              return;
              locald.loadUrl("javascript:AdApp.videoView().end();");
            }
          }
        });
        localj2.a(new MediaPlayer.OnErrorListener()
        {
          public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            AdMarvelActivity.d locald = new AdMarvelActivity.d(localAdMarvelActivity);
            localAdMarvelActivity.d.post(locald);
            if ((localAdMarvelActivity.g) && (localAdMarvelActivity.n != null) && (localAdMarvelActivity.n.length() > 0))
              locald.loadUrl("javascript:" + localAdMarvelActivity.n + "()");
            return false;
          }
        });
        return;
        label399: localj2.setLayoutParams(new RelativeLayout.LayoutParams(1, 1));
        localRelativeLayout.addView(localj2);
      }
    }
    catch (Exception localException2)
    {
      break label329;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.m
 * JD-Core Version:    0.6.2
 */