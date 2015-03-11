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

class j extends SurfaceView
  implements MediaController.MediaPlayerControl
{
  private MediaPlayer.OnCompletionListener A = new MediaPlayer.OnCompletionListener()
  {
    public void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
    {
      j.c(j.this, 5);
      j.d(j.this, 5);
      if (j.j(j.this) != null)
        j.j(j.this).onCompletion(j.d(j.this));
    }
  };
  private MediaPlayer.OnSeekCompleteListener B = new MediaPlayer.OnSeekCompleteListener()
  {
    public void onSeekComplete(MediaPlayer paramAnonymousMediaPlayer)
    {
      if (j.e(j.this) != null)
        j.e(j.this).k();
    }
  };
  private MediaPlayer.OnErrorListener C = new MediaPlayer.OnErrorListener()
  {
    public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      j.c(j.this, -1);
      j.d(j.this, -1);
      if (j.e(j.this) != null)
        j.e(j.this).k();
      if ((j.k(j.this) != null) && (j.k(j.this).onError(j.d(j.this), paramAnonymousInt1, paramAnonymousInt2)));
      return true;
    }
  };
  private MediaPlayer.OnBufferingUpdateListener D = new MediaPlayer.OnBufferingUpdateListener()
  {
    public void onBufferingUpdate(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt)
    {
      j.e(j.this, paramAnonymousInt);
    }
  };
  MediaPlayer.OnVideoSizeChangedListener a = new MediaPlayer.OnVideoSizeChangedListener()
  {
    public void onVideoSizeChanged(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      j.a(j.this, paramAnonymousMediaPlayer.getVideoWidth());
      j.b(j.this, paramAnonymousMediaPlayer.getVideoHeight());
      if ((j.a(j.this) != 0) && (j.b(j.this) != 0))
        j.this.getHolder().setFixedSize(j.a(j.this), j.b(j.this));
    }
  };
  MediaPlayer.OnPreparedListener b = new MediaPlayer.OnPreparedListener()
  {
    public void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
    {
      j.c(j.this, 2);
      j.a(j.this, j.b(j.this, j.c(j.this, true)));
      if (j.c(j.this) != null)
        j.c(j.this).onPrepared(j.d(j.this));
      if (j.e(j.this) != null)
        j.e(j.this).k();
      j.a(j.this, paramAnonymousMediaPlayer.getVideoWidth());
      j.b(j.this, paramAnonymousMediaPlayer.getVideoHeight());
      int i = j.f(j.this);
      if (i != 0)
        j.this.seekTo(i);
      if ((j.a(j.this) != 0) && (j.b(j.this) != 0))
      {
        j.this.getHolder().setFixedSize(j.a(j.this), j.b(j.this));
        if ((j.g(j.this) == j.a(j.this)) && (j.h(j.this) == j.b(j.this)))
        {
          if (j.i(j.this) != 3)
            break label229;
          j.this.start();
        }
      }
      label229: 
      while (j.i(j.this) != 3)
      {
        do
          return;
        while ((j.this.isPlaying()) || (i != 0) || (j.this.getCurrentPosition() <= 0));
        return;
      }
      j.this.start();
    }
  };
  SurfaceHolder.Callback c = new SurfaceHolder.Callback()
  {
    public void surfaceChanged(SurfaceHolder paramAnonymousSurfaceHolder, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      int i = 1;
      j.f(j.this, paramAnonymousInt2);
      j.g(j.this, paramAnonymousInt3);
      int j;
      if (j.i(j.this) == 3)
      {
        j = i;
        if ((j.a(j.this) != paramAnonymousInt2) || (j.b(j.this) != paramAnonymousInt3))
          break label118;
      }
      while (true)
      {
        if ((j.d(j.this) != null) && (j != 0) && (i != 0))
        {
          if (j.f(j.this) != 0)
            j.this.seekTo(j.f(j.this));
          j.this.start();
        }
        return;
        j = 0;
        break;
        label118: i = 0;
      }
    }

    public void surfaceCreated(SurfaceHolder paramAnonymousSurfaceHolder)
    {
      j.a(j.this, paramAnonymousSurfaceHolder);
      if (j.l(j.this) != null)
      {
        AdMarvelVideoActivity localAdMarvelVideoActivity = (AdMarvelVideoActivity)j.l(j.this).get();
        if ((localAdMarvelVideoActivity != null) && (localAdMarvelVideoActivity.i != AdMarvelVideoActivity.j.d) && (localAdMarvelVideoActivity.i != AdMarvelVideoActivity.j.e) && (localAdMarvelVideoActivity.i != AdMarvelVideoActivity.j.f))
          j.m(j.this);
        return;
      }
      j.m(j.this);
    }

    public void surfaceDestroyed(SurfaceHolder paramAnonymousSurfaceHolder)
    {
      j.a(j.this, null);
      j.this.a(true);
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
  private j.a x;
  private int y = 0;
  private final WeakReference<AdMarvelVideoActivity> z;

  public j(Context paramContext)
  {
    super(paramContext);
    this.w = paramContext;
    this.z = null;
    g();
  }

  public j(AdMarvelVideoActivity paramAdMarvelVideoActivity, Context paramContext)
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
      if (r.k(this.w))
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
    if (!r.k(this.w))
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

  public void a(j.a parama)
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

  public int getAudioSessionId()
  {
    return 0;
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
    if (!r.k(this.w))
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.j
 * JD-Core Version:    0.6.2
 */