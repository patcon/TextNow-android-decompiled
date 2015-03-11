package com.admarvel.android.ads;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.MediaController.MediaPlayerControl;
import com.admarvel.android.util.Logging;
import java.io.IOException;
import java.lang.ref.WeakReference;

class p extends SurfaceView
  implements MediaController.MediaPlayerControl
{
  private MediaPlayer.OnCompletionListener A = new MediaPlayer.OnCompletionListener()
  {
    public void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
    {
      p.c(p.this, 5);
      p.d(p.this, 5);
      if (p.j(p.this) != null)
        p.j(p.this).onCompletion(p.d(p.this));
    }
  };
  private MediaPlayer.OnSeekCompleteListener B = new MediaPlayer.OnSeekCompleteListener()
  {
    public void onSeekComplete(MediaPlayer paramAnonymousMediaPlayer)
    {
      if (p.e(p.this) != null)
        p.e(p.this).k();
    }
  };
  private MediaPlayer.OnErrorListener C = new MediaPlayer.OnErrorListener()
  {
    public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      p.c(p.this, -1);
      p.d(p.this, -1);
      if (p.e(p.this) != null)
        p.e(p.this).k();
      if ((p.k(p.this) != null) && (p.k(p.this).onError(p.d(p.this), paramAnonymousInt1, paramAnonymousInt2)));
      return true;
    }
  };
  private MediaPlayer.OnBufferingUpdateListener D = new MediaPlayer.OnBufferingUpdateListener()
  {
    public void onBufferingUpdate(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt)
    {
      p.e(p.this, paramAnonymousInt);
    }
  };
  MediaPlayer.OnVideoSizeChangedListener a = new MediaPlayer.OnVideoSizeChangedListener()
  {
    public void onVideoSizeChanged(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      p.a(p.this, paramAnonymousMediaPlayer.getVideoWidth());
      p.b(p.this, paramAnonymousMediaPlayer.getVideoHeight());
      if ((p.a(p.this) != 0) && (p.b(p.this) != 0))
        p.this.getHolder().setFixedSize(p.a(p.this), p.b(p.this));
    }
  };
  MediaPlayer.OnPreparedListener b = new MediaPlayer.OnPreparedListener()
  {
    public void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
    {
      p.c(p.this, 2);
      p.a(p.this, p.b(p.this, p.c(p.this, true)));
      if (p.c(p.this) != null)
        p.c(p.this).onPrepared(p.d(p.this));
      if (p.e(p.this) != null)
        p.e(p.this).k();
      p.a(p.this, paramAnonymousMediaPlayer.getVideoWidth());
      p.b(p.this, paramAnonymousMediaPlayer.getVideoHeight());
      int i = p.f(p.this);
      if (i != 0)
        p.this.seekTo(i);
      if ((p.a(p.this) != 0) && (p.b(p.this) != 0))
      {
        p.this.getHolder().setFixedSize(p.a(p.this), p.b(p.this));
        if ((p.g(p.this) == p.a(p.this)) && (p.h(p.this) == p.b(p.this)))
        {
          if (p.i(p.this) != 3)
            break label229;
          p.this.start();
        }
      }
      label229: 
      while (p.i(p.this) != 3)
      {
        do
          return;
        while ((p.this.isPlaying()) || (i != 0) || (p.this.getCurrentPosition() <= 0));
        return;
      }
      p.this.start();
    }
  };
  SurfaceHolder.Callback c = new SurfaceHolder.Callback()
  {
    public void surfaceChanged(SurfaceHolder paramAnonymousSurfaceHolder, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      int i = 1;
      p.f(p.this, paramAnonymousInt2);
      p.g(p.this, paramAnonymousInt3);
      int j;
      if (p.i(p.this) == 3)
      {
        j = i;
        if ((p.a(p.this) != paramAnonymousInt2) || (p.b(p.this) != paramAnonymousInt3))
          break label118;
      }
      while (true)
      {
        if ((p.d(p.this) != null) && (j != 0) && (i != 0))
        {
          if (p.f(p.this) != 0)
            p.this.seekTo(p.f(p.this));
          p.this.start();
        }
        return;
        j = 0;
        break;
        label118: i = 0;
      }
    }

    public void surfaceCreated(SurfaceHolder paramAnonymousSurfaceHolder)
    {
      p.a(p.this, paramAnonymousSurfaceHolder);
      if (p.l(p.this) != null)
      {
        AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)p.l(p.this).get();
        if ((localAdMarvelVideoActivity != null) && (localAdMarvelVideoActivity.i != AdMarvelVideoActivity.k.d) && (localAdMarvelVideoActivity.i != AdMarvelVideoActivity.k.e) && (localAdMarvelVideoActivity.i != AdMarvelVideoActivity.k.f))
          p.m(p.this);
        return;
      }
      p.m(p.this);
    }

    public void surfaceDestroyed(SurfaceHolder paramAnonymousSurfaceHolder)
    {
      p.a(p.this, null);
      p.this.a(true);
    }
  };
  private int d = 0;
  private Uri e;
  private int f;
  private int g = 0;
  private int h = 0;
  private SurfaceHolder i = null;
  private MediaPlayer j = null;
  private int k;
  private int l;
  private int m;
  private int n;
  private MediaPlayer.OnCompletionListener o;
  private MediaPlayer.OnPreparedListener p;
  private int q;
  private MediaPlayer.OnErrorListener r;
  private int s;
  private boolean t;
  private boolean u;
  private boolean v;
  private Context w;
  private p.a x;
  private int y = 0;
  private final WeakReference<AdMarvelVideoActivity> z;

  public p(Context paramContext)
  {
    super(paramContext);
    this.w = paramContext;
    this.z = null;
    g();
  }

  public p(AdMarvelVideoActivity paramAdMarvelVideoActivity, Context paramContext)
  {
    super(paramContext);
    this.w = paramContext;
    this.z = new WeakReference(paramAdMarvelVideoActivity);
    g();
  }

  private int a(long paramLong)
  {
    return (int)paramLong / 1000;
  }

  private void g()
  {
    this.k = 0;
    this.l = 0;
    getHolder().addCallback(this.c);
    getHolder().setType(3);
    setFocusable(true);
    setFocusableInTouchMode(true);
    requestFocus();
    this.g = 0;
    this.h = 0;
  }

  private void h()
  {
    if ((this.e == null) || (this.i == null));
    do
    {
      return;
      if (ab.k(this.w))
        break;
    }
    while (this.x == null);
    this.x.l();
    return;
    a(false);
    try
    {
      this.j = new MediaPlayer();
      this.j.setOnPreparedListener(this.b);
      this.j.setOnVideoSizeChangedListener(this.a);
      this.f = -1;
      this.j.setOnCompletionListener(this.A);
      this.j.setOnErrorListener(this.C);
      this.j.setOnBufferingUpdateListener(this.D);
      this.j.setOnSeekCompleteListener(this.B);
      this.q = 0;
      this.j.setDataSource(this.w, this.e);
      this.j.setDisplay(this.i);
      this.j.setAudioStreamType(3);
      this.j.setScreenOnWhilePlaying(true);
      this.j.prepareAsync();
      this.g = 1;
      return;
    }
    catch (IOException localIOException)
    {
      this.g = -1;
      this.h = -1;
      this.C.onError(this.j, 1, 0);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      this.g = -1;
      this.h = -1;
      this.C.onError(this.j, 1, 0);
    }
  }

  private boolean i()
  {
    return (this.j != null) && (this.g != -1) && (this.g != 0) && (this.g != 1);
  }

  public void a()
  {
    try
    {
      if (this.j != null)
      {
        this.j.stop();
        this.j.reset();
        this.j.release();
        this.j = null;
        this.g = 0;
        this.h = 0;
        if (this.x != null)
          this.x.i();
      }
      return;
    }
    catch (Exception localException)
    {
      if (this.x != null)
        this.x.m();
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  public void a(int paramInt)
  {
    if (!ab.k(this.w))
    {
      if (this.x != null)
        this.x.l();
      return;
    }
    if (this.j == null)
    {
      this.s = paramInt;
      h();
      return;
    }
    this.j.seekTo(paramInt);
  }

  public void a(MediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    this.o = paramOnCompletionListener;
  }

  public void a(MediaPlayer.OnErrorListener paramOnErrorListener)
  {
    this.r = paramOnErrorListener;
  }

  public void a(MediaPlayer.OnPreparedListener paramOnPreparedListener)
  {
    this.p = paramOnPreparedListener;
  }

  public void a(Uri paramUri)
  {
    try
    {
      if (this.j != null)
      {
        Logging.log("AdMarvelVideoView-ResetMedia Player");
        this.j.reset();
      }
      this.e = paramUri;
      this.s = 0;
      h();
      requestLayout();
      invalidate();
      return;
    }
    catch (Exception localException)
    {
      if (this.x != null)
        this.x.m();
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  public void a(p.a parama)
  {
    this.x = parama;
  }

  public void a(boolean paramBoolean)
  {
    try
    {
      if (this.j != null)
      {
        this.j.reset();
        this.j.release();
        this.j = null;
        this.g = 0;
        if (paramBoolean)
          this.h = 0;
      }
      return;
    }
    catch (Exception localException)
    {
      if (this.x != null)
        this.x.m();
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  public void b()
  {
    if (i())
      this.j.setVolume(0.0F, 0.0F);
  }

  public void c()
  {
    if (i())
      this.j.setVolume(1.0F, 1.0F);
  }

  public boolean canPause()
  {
    return this.t;
  }

  public boolean canSeekBackward()
  {
    return this.u;
  }

  public boolean canSeekForward()
  {
    return this.v;
  }

  public void d()
  {
    this.y = getCurrentPosition();
  }

  public void e()
  {
    if (this.y > 0)
    {
      if (a(this.y) == a(getCurrentPosition()))
      {
        start();
        if (this.x != null)
          this.x.k();
      }
      while (true)
      {
        if (this.x != null)
          this.x.j();
        return;
        a(this.y);
      }
    }
    start();
  }

  public int f()
  {
    return this.d;
  }

  public int getBufferPercentage()
  {
    if (this.j != null)
      return this.q;
    return 0;
  }

  public int getCurrentPosition()
  {
    if (i())
    {
      int i1 = this.j.getCurrentPosition();
      this.d = i1;
      return i1;
    }
    return 0;
  }

  public int getDuration()
  {
    if (i())
    {
      if (this.f > 0)
        return this.f;
      this.f = this.j.getDuration();
      return this.f;
    }
    this.f = -1;
    return this.f;
  }

  public boolean isPlaying()
  {
    return (i()) && (this.j.isPlaying());
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = getDefaultSize(this.k, paramInt1);
    int i2 = getDefaultSize(this.l, paramInt2);
    if ((this.k > 0) && (this.l > 0))
    {
      if (i2 * this.k <= i1 * this.l)
        break label70;
      i2 = i1 * this.l / this.k;
    }
    while (true)
    {
      setMeasuredDimension(i1, i2);
      return;
      label70: if (i2 * this.k < i1 * this.l)
        i1 = i2 * this.k / this.l;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.x != null)
      this.x.n();
    return false;
  }

  public boolean onTrackballEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public void pause()
  {
    try
    {
      this.g = 4;
      this.y = getCurrentPosition();
      if ((i()) && (this.j.isPlaying()))
      {
        this.j.pause();
        if (this.x != null)
          this.x.h();
      }
      this.h = 4;
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      if (this.x != null)
        this.x.m();
      Logging.log(Log.getStackTraceString(localIllegalStateException));
    }
  }

  public void seekTo(int paramInt)
  {
    if (!ab.k(this.w))
    {
      if (this.x != null)
        this.x.l();
      return;
    }
    if (i())
    {
      this.j.seekTo(paramInt);
      this.s = 0;
      return;
    }
    this.s = paramInt;
  }

  public void start()
  {
    try
    {
      if (i())
      {
        this.j.start();
        this.g = 3;
      }
      this.h = 3;
      this.y = 0;
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      if (this.x != null)
        this.x.m();
      Logging.log(Log.getStackTraceString(localIllegalStateException));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.p
 * JD-Core Version:    0.6.2
 */