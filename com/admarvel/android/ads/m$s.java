package com.admarvel.android.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.LinearLayout.LayoutParams;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class m$s
  implements Runnable
{
  private final WeakReference<m> a;
  private final WeakReference<d> b;
  private String c;

  public m$s(String paramString, m paramm, d paramd)
  {
    this.c = paramString;
    this.a = new WeakReference(paramm);
    this.b = new WeakReference(paramd);
  }

  @TargetApi(14)
  public void run()
  {
    while (true)
    {
      a locala1;
      try
      {
        final m localm = (m)this.a.get();
        final d locald = (d)this.b.get();
        if ((localm == null) || (locald == null) || (this.c == null))
          break;
        if (this.c.length() <= 0)
          return;
        locala1 = (a)localm.findViewWithTag(localm.s + "EMBEDDED_VIDEO");
        if (locala1 == null)
        {
          a locala2 = new a(localm.getContext(), false, this.c);
          locala2.setTag(localm.s + "EMBEDDED_VIDEO");
          locala3 = locala2;
          locala3.a(localm.A, localm.B, localm.C, localm.D);
          float f = localm.getContext().getResources().getDisplayMetrics().density;
          if (localm.E > 0)
          {
            LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localm.getLayoutParams();
            localLayoutParams.height = ((int)(f * localm.E));
            localm.setLayoutParams(localLayoutParams);
          }
          localm.removeAllViews();
          localm.addView(locala3);
          localm.addView(locald);
          locald.setBackgroundColor(0);
          locald.setBackgroundDrawable(null);
          locald.setLayerType(1, null);
          locala3.a(this.c, 0);
          locala3.a(new a.a()
          {
          });
          locala3.a(new MediaPlayer.OnPreparedListener()
          {
            public void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
            {
              if (localm.P)
              {
                paramAnonymousMediaPlayer.setVolume(0.0F, 0.0F);
                localm.P = false;
              }
              if ((localm.F != null) && (localm.F.length() > 0))
                locald.e(localm.F + "()");
              if ((localm.H != null) && (localm.H.length() > 0))
                locald.e(localm.H + "()");
              if (localm.O == null)
              {
                localm.O = new m.ae(localm, locald);
                new Handler(Looper.getMainLooper()).postDelayed(localm.O, 500L);
              }
            }
          });
          locala3.a(new MediaPlayer.OnCompletionListener()
          {
            public void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
            {
              if ((localm.J != null) && (localm.J.length() > 0))
                locald.e(localm.J + "()");
            }
          });
          locala3.a(new MediaPlayer.OnErrorListener()
          {
            public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
            {
              if ((localm.N != null) && (localm.N.length() > 0))
                locald.e(localm.N + "()");
              return false;
            }
          });
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        return;
      }
      a locala3 = locala1;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.s
 * JD-Core Version:    0.6.2
 */