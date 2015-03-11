package com.flurry.sdk;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.flurry.android.FlurryFullscreenTakeoverActivity;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdFrame;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class f extends SurfaceView
  implements DialogInterface.OnKeyListener, af
{
  private static final String A = f.class.getSimpleName();
  private MediaPlayer.OnCompletionListener B = new MediaPlayer.OnCompletionListener()
  {
    public void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
    {
      f.e(f.this).d();
      f.c(f.this, 5);
      f.d(f.this, 5);
      if (f.e(f.this) != null)
        f.e(f.this).h();
      if (f.i(f.this) != null)
        f.i(f.this).onCompletion(f.d(f.this));
      if (f.g(f.this) != null)
        f.g(f.this).a("videoCompleted", Collections.emptyMap(), f.g(f.this).getAdUnit(), f.g(f.this).getAdLog(), f.g(f.this).getAdFrameIndex(), 0);
    }
  };
  private MediaPlayer.OnErrorListener C = new MediaPlayer.OnErrorListener()
  {
    public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      eo.a(6, f.g(), "Video Playback Error: " + paramAnonymousInt1 + "," + paramAnonymousInt2);
      f.c(f.this, -1);
      f.d(f.this, -1);
      f.this.b();
      if (f.e(f.this) != null)
      {
        f.e(f.this).h();
        f.e(f.this).d();
      }
      if ((f.j(f.this) != null) && (f.j(f.this).onError(f.d(f.this), paramAnonymousInt1, paramAnonymousInt2)))
        return true;
      if (f.this.getWindowToken() != null)
      {
        f.this.getContext().getResources();
        if (paramAnonymousInt1 != 200)
          break label308;
      }
      label308: for (String str = "Sorry, this video is not valid for streaming to this device."; ; str = "Sorry, this video cannot be played.")
      {
        eo.a(3, f.g(), str);
        f.this.b();
        if (f.g(f.this) != null)
        {
          HashMap localHashMap = new HashMap();
          localHashMap.put("errorCode", Integer.toString(b.r.a()));
          localHashMap.put("frameworkError", Integer.toString(paramAnonymousInt1));
          localHashMap.put("implError", Integer.toString(paramAnonymousInt2));
          f.g(f.this).a("renderFailed", localHashMap, f.g(f.this).getAdUnit(), f.g(f.this).getAdLog(), f.g(f.this).getAdFrameIndex(), 0);
        }
        if (f.k(f.this) == null)
          break;
        f.k(f.this).terminateVideoPlaybackDueToError();
        return true;
      }
    }
  };
  private MediaPlayer.OnBufferingUpdateListener D = new MediaPlayer.OnBufferingUpdateListener()
  {
    public void onBufferingUpdate(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt)
    {
      f.e(f.this, paramAnonymousInt);
    }
  };
  MediaPlayer.OnVideoSizeChangedListener a = new MediaPlayer.OnVideoSizeChangedListener()
  {
    public void onVideoSizeChanged(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      f.a(f.this, paramAnonymousMediaPlayer.getVideoWidth());
      f.b(f.this, paramAnonymousMediaPlayer.getVideoHeight());
      if ((f.a(f.this) != 0) && (f.b(f.this) != 0))
        f.this.getHolder().setFixedSize(f.a(f.this), f.b(f.this));
    }
  };
  MediaPlayer.OnPreparedListener b = new MediaPlayer.OnPreparedListener()
  {
    public void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
    {
      f.c(f.this, 2);
      f.a(f.this, true);
      if (f.c(f.this) != null)
        f.c(f.this).onPrepared(f.d(f.this));
      if (f.e(f.this) != null)
        f.e(f.this).setEnabled(true);
      f.a(f.this, paramAnonymousMediaPlayer.getVideoWidth());
      f.b(f.this, paramAnonymousMediaPlayer.getVideoHeight());
      int i = f.f(f.this);
      if (i != 0)
        f.this.seekTo(i);
      if ((!f.e(f.this).getAutoPlay()) && (f.this.getCurrentPosition() <= f.e(f.this).getOffsetStartTime()))
      {
        f.this.seekTo(3);
        f.e(f.this).setOffsetStartTime(3);
      }
      f.this.b();
      if (f.g(f.this) != null)
      {
        String str = ((AdFrame)f.g(f.this).getAdUnit().d().get(f.g(f.this).getAdFrameIndex())).g().toString();
        am localam = FlurryAdModule.getInstance().c(str);
        if (!localam.g())
        {
          f.g(f.this).a("rendered", Collections.emptyMap(), f.g(f.this).getAdUnit(), f.g(f.this).getAdLog(), f.g(f.this).getAdFrameIndex(), 0);
          localam.f(true);
        }
      }
      if (f.e(f.this) != null)
        f.e(f.this).a();
      if ((f.g(f.this) == null) || (!f.g(f.this).d()))
        f.h(f.this);
    }
  };
  SurfaceHolder.Callback c = new SurfaceHolder.Callback()
  {
    public void surfaceChanged(SurfaceHolder paramAnonymousSurfaceHolder, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      int i = 1;
      f.f(f.this, paramAnonymousInt2);
      f.g(f.this, paramAnonymousInt3);
      int j;
      if (f.l(f.this) == 3)
      {
        j = i;
        if ((f.a(f.this) != paramAnonymousInt2) || (f.b(f.this) != paramAnonymousInt3))
          break label184;
        label60: if ((f.d(f.this) != null) && (j != 0) && (i != 0))
        {
          if (f.f(f.this) != 0)
            f.this.seekTo(f.f(f.this));
          if ((f.g(f.this) == null) || (f.g(f.this).d()))
            break label190;
          f.this.start();
        }
      }
      while (true)
      {
        if (f.e(f.this) != null)
        {
          if (f.e(f.this).g())
            f.e(f.this).h();
          f.e(f.this).e();
        }
        return;
        j = 0;
        break;
        label184: i = 0;
        break label60;
        label190: if (f.g(f.this) == null)
          f.this.start();
      }
    }

    public void surfaceCreated(SurfaceHolder paramAnonymousSurfaceHolder)
    {
      f.a(f.this, paramAnonymousSurfaceHolder);
      eo.a(4, f.g(), "mCurrentState is ....:" + f.m(f.this));
      eo.a(4, f.g(), "mTargetState is ....:" + f.l(f.this));
      if ((f.d(f.this) == null) && (f.n(f.this)))
        f.b(f.this, false);
    }

    public void surfaceDestroyed(SurfaceHolder paramAnonymousSurfaceHolder)
    {
      f.a(f.this, null);
      if (f.e(f.this) != null)
      {
        f.e(f.this).d();
        f.e(f.this).k();
      }
      eo.a(4, f.g(), "mCurrentState is :" + f.m(f.this));
      f.c(f.this, false);
    }
  };
  private Uri d;
  private int e;
  private int f = 0;
  private int g = 0;
  private SurfaceHolder h = null;
  private MediaPlayer i = null;
  private int j;
  private int k;
  private int l;
  private int m;
  private z n;
  private MediaPlayer.OnCompletionListener o;
  private MediaPlayer.OnPreparedListener p;
  private int q;
  private MediaPlayer.OnErrorListener r;
  private int s;
  private boolean t;
  private int u;
  private ViewGroup v;
  private g w;
  private FlurryFullscreenTakeoverActivity x;
  private ProgressDialog y;
  private AtomicBoolean z = new AtomicBoolean(false);

  public f(Context paramContext, g paramg, FlurryFullscreenTakeoverActivity paramFlurryFullscreenTakeoverActivity, z paramz)
  {
    super(paramContext);
    a(paramContext, paramg, paramFlurryFullscreenTakeoverActivity, paramz);
  }

  private void a(Context paramContext, g paramg, FlurryFullscreenTakeoverActivity paramFlurryFullscreenTakeoverActivity, z paramz)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramContext);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -2);
    localLayoutParams.gravity = 16;
    localFrameLayout.setLayoutParams(localLayoutParams);
    this.v = localFrameLayout;
    this.j = 0;
    this.k = 0;
    getHolder().addCallback(this.c);
    getHolder().setType(3);
    setFocusable(true);
    setFocusableInTouchMode(true);
    requestFocus();
    this.f = 0;
    this.g = 0;
    this.w = paramg;
    this.x = paramFlurryFullscreenTakeoverActivity;
    this.n = paramz;
    this.n.setAdUnityView(paramg);
  }

  private void a(boolean paramBoolean)
  {
    if ((this.d == null) || (this.h == null) || (FlurryFullscreenTakeoverActivity.fBasicWebViewClosingHandlerFired == true))
      return;
    Intent localIntent = new Intent("com.android.music.musicservicecommand");
    localIntent.putExtra("command", "pause");
    getContext().sendBroadcast(localIntent);
    b(false);
    try
    {
      a();
      this.i = new MediaPlayer();
      this.i.setOnPreparedListener(this.b);
      this.i.setOnVideoSizeChangedListener(this.a);
      this.e = -1;
      this.i.setOnCompletionListener(this.B);
      this.i.setOnErrorListener(this.C);
      this.i.setOnBufferingUpdateListener(this.D);
      this.q = 0;
      if (h())
      {
        this.i.setDataSource(getContext(), this.d);
        this.i.setDisplay(this.h);
        this.i.setScreenOnWhilePlaying(true);
        this.i.prepareAsync();
        this.f = 1;
        i();
        return;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        eo.a(5, A, "Unable to open content: " + this.d, localIOException);
        this.f = -1;
        this.g = -1;
        this.C.onError(this.i, 1, 0);
        return;
        FileInputStream localFileInputStream = new FileInputStream(this.d.getPath());
        this.i.setDataSource(localFileInputStream.getFD());
        localFileInputStream.close();
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      eo.a(5, A, "Unable to open content: " + this.d, localIllegalArgumentException);
      this.f = -1;
      this.g = -1;
      this.C.onError(this.i, 1, 0);
    }
  }

  private void b(boolean paramBoolean)
  {
    if (this.w != null)
    {
      String str = ((AdFrame)this.w.getAdUnit().d().get(this.w.getAdFrameIndex())).g().toString();
      FlurryAdModule.getInstance().c(str).a(getCurrentPosition());
    }
    eo.a(4, A, "media player has been released");
    if (this.i != null)
    {
      this.n.setIsMediaPlayerReleased(true);
      this.n.setMediaPlayer(null);
      this.i.reset();
      this.i.release();
      this.i = null;
      this.f = 0;
      if (paramBoolean)
        this.g = 0;
    }
  }

  private boolean h()
  {
    return !this.d.getScheme().equalsIgnoreCase("file");
  }

  private void i()
  {
    if ((this.i != null) && (this.n != null))
    {
      this.n.setMediaPlayer(this);
      this.n.setEnabled(m());
      this.n.setIsMediaPlayerReleased(false);
    }
  }

  private void j()
  {
    if ((this.n.getAutoPlay()) || (getCurrentPosition() > this.n.getOffsetStartTime()))
      start();
    this.n.a(0);
  }

  private boolean k()
  {
    Context localContext = getContext();
    if (localContext != null)
    {
      boolean bool1 = ((Activity)localContext).isFinishing();
      boolean bool2 = this.z.get();
      eo.a(4, A, "IsFinishing " + bool1 + " IsAdClosed " + bool2);
      return (!bool2) && (!bool1);
    }
    return false;
  }

  private void l()
  {
    if (this.n.g())
    {
      this.n.h();
      return;
    }
    this.n.e();
  }

  private boolean m()
  {
    return (this.i != null) && (this.f != -1) && (this.f != 0) && (this.f != 1);
  }

  public void a()
  {
    if (this.y == null)
      if (getContext() != null)
      {
        this.y = new ProgressDialog(getContext());
        this.y.setProgressStyle(0);
        this.y.setCancelable(true);
        this.y.setCanceledOnTouchOutside(false);
        this.y.setOnKeyListener(this);
        this.y.show();
      }
    while (this.y.isShowing())
    {
      return;
      eo.a(3, A, "Context is null, cannot create progress dialog.");
      return;
    }
    this.y.show();
  }

  public void a(Uri paramUri, int paramInt)
  {
    this.d = paramUri;
    this.s = paramInt;
    requestLayout();
    invalidate();
  }

  public void b()
  {
    if ((this.y != null) && (this.y.isShowing()))
    {
      this.y.dismiss();
      this.y = null;
    }
  }

  public void c()
  {
    if (this.w != null)
    {
      String str = ((AdFrame)this.w.getAdUnit().d().get(this.w.getAdFrameIndex())).g().toString();
      FlurryAdModule.getInstance().c(str).a(getCurrentPosition());
    }
    if (this.i != null)
    {
      this.i.stop();
      this.i.release();
      this.i = null;
      this.f = 0;
      this.g = 0;
      this.n.d();
      this.n.setIsMediaPlayerReleased(true);
      this.n.setMediaPlayer(null);
    }
  }

  public boolean canPause()
  {
    return this.t;
  }

  public boolean canSeekBackward()
  {
    return false;
  }

  public boolean canSeekForward()
  {
    return false;
  }

  public void d()
  {
    eo.a(4, A, "HERE IN SUSPEND BEGIN");
    if (this.i != null)
      eo.a(4, A, "video position suspend is :" + this.i.getCurrentPosition());
    if (m())
    {
      this.s = getCurrentPosition();
      this.u = this.f;
      this.f = 6;
      this.g = 6;
      eo.a(5, A, "able to suspend video.");
      if (this.i.isPlaying())
        this.i.pause();
    }
  }

  public void e()
  {
    eo.a(4, A, "HERE IN resume BEGIN");
    if (this.i != null)
      eo.a(3, A, "video position resume is :" + this.i.getCurrentPosition() + " mSeekWhenPrepared " + this.s);
    if ((this.h == null) && (this.f == 6))
      this.g = 7;
    do
    {
      return;
      if ((this.i != null) && (this.f == 6));
      try
      {
        j();
        this.f = this.u;
        this.g = this.u;
        if ((this.f == 8) && (k()))
        {
          a(true);
          return;
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        while (true)
          eo.a(3, A, "Exception: " + localIllegalStateException.getLocalizedMessage());
      }
    }
    while ((this.n == null) || (!this.n.getMoreInfoClicked()));
    this.n.i();
  }

  public void f()
  {
    this.z.set(true);
  }

  public int getAudioSessionId()
  {
    return 0;
  }

  public int getBufferPercentage()
  {
    if (this.i != null)
      return this.q;
    return 0;
  }

  public int getCurrentPosition()
  {
    if (m())
      return this.i.getCurrentPosition();
    return 0;
  }

  public int getDuration()
  {
    if (m())
    {
      if (this.e > 0)
        return this.e;
      this.e = this.i.getDuration();
      return this.e;
    }
    this.e = -1;
    return this.e;
  }

  public boolean isPlaying()
  {
    return (m()) && (this.i.isPlaying());
  }

  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    eo.a(3, "listeners", "onkey,keycode=" + paramInt + ",event=" + paramKeyEvent.getAction());
    if ((paramDialogInterface == this.y) && (paramInt == 4) && (paramKeyEvent.getAction() == 1))
    {
      if (this.w != null)
        this.w.a();
      paramDialogInterface.dismiss();
      return true;
    }
    return false;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i1;
    if ((paramInt != 4) && (paramInt != 82) && (paramInt != 5) && (paramInt != 6))
    {
      i1 = 1;
      if ((m()) && (i1 != 0) && (this.n != null))
      {
        if ((paramInt != 25) && (paramInt != 24))
          break label76;
        eo.a(4, A, "Volume controls hit");
      }
    }
    while (true)
    {
      return super.onKeyDown(paramInt, paramKeyEvent);
      i1 = 0;
      break;
      label76: l();
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    eo.a(4, A, "onMeasure");
    int i1 = getDefaultSize(this.j, paramInt1);
    int i2 = getDefaultSize(this.k, paramInt2);
    if ((this.j > 0) && (this.k > 0))
    {
      if (i2 * this.j <= i1 * this.k)
        break label134;
      eo.a(4, A, "image too tall, correcting");
      i2 = i1 * this.k / this.j;
    }
    while (true)
    {
      eo.a(4, A, "setting size: " + i1 + 'x' + i2);
      setMeasuredDimension(i1, i2);
      this.n.b();
      return;
      label134: if (i2 * this.j < i1 * this.k)
      {
        eo.a(4, A, "image too wide, correcting");
        i1 = i2 * this.j / this.k;
      }
      else
      {
        eo.a(4, A, "aspect ratio is correct: " + i1 + "/" + i2 + "=" + this.j + "/" + this.k);
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((m()) && (this.n != null))
      l();
    return false;
  }

  public boolean onTrackballEvent(MotionEvent paramMotionEvent)
  {
    if ((m()) && (this.n != null))
      l();
    return false;
  }

  public void pause()
  {
    eo.a(4, A, "HERE IN PAUSE BEGIN");
    if (this.i != null)
      eo.a(4, A, "video position pause is :" + this.i.getCurrentPosition());
    if ((m()) && (this.i.isPlaying()))
    {
      this.i.pause();
      this.f = 4;
    }
    this.g = 4;
  }

  public void seekTo(int paramInt)
  {
    if (m())
    {
      this.i.seekTo(paramInt);
      this.s = 0;
      return;
    }
    this.s = paramInt;
  }

  public void setCloseConfirmDialogClicked(boolean paramBoolean)
  {
    this.n.setmCloseConfirmDialogClicked(paramBoolean);
  }

  public void setMediaController(z paramz)
  {
    if (this.n != null)
      this.n.h();
    this.n = paramz;
    i();
  }

  public void setOnCompletionListener(MediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    this.o = paramOnCompletionListener;
  }

  public void setOnErrorListener(MediaPlayer.OnErrorListener paramOnErrorListener)
  {
    this.r = paramOnErrorListener;
  }

  public void setOnPreparedListener(MediaPlayer.OnPreparedListener paramOnPreparedListener)
  {
    this.p = paramOnPreparedListener;
  }

  public void setVideoState(am paramam)
  {
    if (this.n != null)
      this.n.setVideoState(paramam);
  }

  public void start()
  {
    eo.a(4, A, "HERE IN START BEGIN");
    if (this.i != null)
      eo.a(4, A, "video position start is :" + this.i.getCurrentPosition());
    if (m())
    {
      this.i.start();
      this.f = 3;
    }
    if (this.n.c())
    {
      this.n.a();
      this.n.e();
    }
    this.g = 3;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.f
 * JD-Core Version:    0.6.2
 */