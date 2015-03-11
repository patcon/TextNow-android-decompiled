package com.admarvel.android.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

class AdMarvelWebView$v
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;
  private final WeakReference<AdMarvelInternalWebView> b;
  private String c;

  public AdMarvelWebView$v(String paramString, AdMarvelWebView paramAdMarvelWebView, AdMarvelInternalWebView paramAdMarvelInternalWebView)
  {
    this.c = paramString;
    this.a = new WeakReference(paramAdMarvelWebView);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
  }

  public void run()
  {
    label396: label544: 
    while (true)
    {
      final AdMarvelWebView localAdMarvelWebView;
      final AdMarvelInternalWebView localAdMarvelInternalWebView;
      f localf1;
      f localf3;
      float f;
      RelativeLayout.LayoutParams localLayoutParams;
      int j;
      try
      {
        localAdMarvelWebView = (AdMarvelWebView)this.a.get();
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
        if ((localAdMarvelWebView == null) || (localAdMarvelInternalWebView == null) || (this.c == null))
          break;
        if (this.c.length() <= 0)
          return;
        localf1 = (f)localAdMarvelWebView.findViewWithTag(localAdMarvelWebView.e + "EMBEDDED_VIDEO");
        if (localf1 != null)
          break label544;
        f localf2 = new f(localAdMarvelWebView.getContext(), false, this.c);
        localf2.setTag(localAdMarvelWebView.e + "EMBEDDED_VIDEO");
        localf3 = localf2;
        f = localAdMarvelWebView.getContext().getResources().getDisplayMetrics().density;
        if ((AdMarvelWebView.z(localAdMarvelWebView) > 0) && (AdMarvelWebView.A(localAdMarvelWebView) > 0))
        {
          localLayoutParams = new RelativeLayout.LayoutParams((int)(f * AdMarvelWebView.z(localAdMarvelWebView)), (int)(f * AdMarvelWebView.A(localAdMarvelWebView)));
          if (AdMarvelWebView.B(localAdMarvelWebView) < 0)
            break label355;
          if (AdMarvelWebView.C(localAdMarvelWebView) >= 0)
          {
            localLayoutParams.leftMargin = ((int)(f * AdMarvelWebView.B(localAdMarvelWebView)));
            localLayoutParams.topMargin = ((int)(f * AdMarvelWebView.C(localAdMarvelWebView)));
            localf3.setLayoutParams(localLayoutParams);
            if (AdMarvelWebView.D(localAdMarvelWebView) > 0)
            {
              LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localAdMarvelWebView.getLayoutParams();
              localLayoutParams1.height = ((int)(f * AdMarvelWebView.D(localAdMarvelWebView)));
              localAdMarvelWebView.setLayoutParams(localLayoutParams1);
            }
            int i = localAdMarvelWebView.getChildCount();
            j = 0;
            if ((j >= i) || (localAdMarvelWebView.getChildAt(j) == localAdMarvelInternalWebView))
              break label396;
            j++;
            continue;
          }
        }
        else
        {
          localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
          continue;
        }
      }
      catch (Exception localException1)
      {
        Logging.log(Log.getStackTraceString(localException1));
        return;
      }
      localLayoutParams.leftMargin = ((int)(f * AdMarvelWebView.B(localAdMarvelWebView)));
      localLayoutParams.addRule(15);
      continue;
      label355: if (AdMarvelWebView.C(localAdMarvelWebView) >= 0)
      {
        localLayoutParams.topMargin = ((int)(f * AdMarvelWebView.C(localAdMarvelWebView)));
        localLayoutParams.addRule(14);
      }
      else
      {
        localLayoutParams.addRule(13);
        continue;
        localAdMarvelWebView.addView(localf3, j);
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
          label484: localf3.d(this.c);
          localf3.a(new MediaPlayer.OnPreparedListener()
          {
            public void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
            {
              if (AdMarvelWebView.E(localAdMarvelWebView))
              {
                paramAnonymousMediaPlayer.setVolume(0.0F, 0.0F);
                AdMarvelWebView.e(localAdMarvelWebView, false);
              }
              if ((AdMarvelWebView.F(localAdMarvelWebView) != null) && (AdMarvelWebView.F(localAdMarvelWebView).length() > 0))
                localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelWebView.F(localAdMarvelWebView) + "()");
              if ((AdMarvelWebView.G(localAdMarvelWebView) != null) && (AdMarvelWebView.G(localAdMarvelWebView).length() > 0))
                localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelWebView.G(localAdMarvelWebView) + "()");
              if (AdMarvelWebView.H(localAdMarvelWebView) == null)
              {
                AdMarvelWebView.a(localAdMarvelWebView, new AdMarvelWebView.ak(localAdMarvelWebView, localAdMarvelInternalWebView));
                AdMarvelWebView.d(localAdMarvelWebView).postDelayed(AdMarvelWebView.H(localAdMarvelWebView), 500L);
              }
            }
          });
          localf3.a(new MediaPlayer.OnCompletionListener()
          {
            public void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
            {
              if ((AdMarvelWebView.I(localAdMarvelWebView) != null) && (AdMarvelWebView.I(localAdMarvelWebView).length() > 0))
                localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelWebView.I(localAdMarvelWebView) + "()");
            }
          });
          localf3.a(new MediaPlayer.OnErrorListener()
          {
            public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
            {
              if ((AdMarvelWebView.J(localAdMarvelWebView) != null) && (AdMarvelWebView.J(localAdMarvelWebView).length() > 0))
                localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelWebView.J(localAdMarvelWebView) + "()");
              return false;
            }
          });
          return;
        }
        catch (Exception localException2)
        {
          break label484;
        }
        localf3 = localf1;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.v
 * JD-Core Version:    0.6.2
 */