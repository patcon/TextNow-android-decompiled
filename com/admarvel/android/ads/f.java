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
import android.os.AsyncTask;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.MediaController.MediaPlayerControl;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

class f extends SurfaceView
  implements MediaController.MediaPlayerControl
{
  private Context A;
  private int B = 0;
  private final WeakReference<AdMarvelVideoActivity> C;
  private final boolean D;
  private f.c E;
  private MediaPlayer.OnCompletionListener F = new MediaPlayer.OnCompletionListener()
  {
    public void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
    {
      f.c(f.this, 5);
      f.d(f.this, 5);
      f.d(f.this, false);
      if (f.i(f.this) != null)
        f.i(f.this).onCompletion(f.d(f.this));
    }
  };
  private MediaPlayer.OnSeekCompleteListener G = new MediaPlayer.OnSeekCompleteListener()
  {
    public void onSeekComplete(MediaPlayer paramAnonymousMediaPlayer)
    {
      if (f.this.a != null)
        f.this.a.d();
    }
  };
  private MediaPlayer.OnErrorListener H = new MediaPlayer.OnErrorListener()
  {
    public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      f.c(f.this, -1);
      f.d(f.this, -1);
      f.d(f.this, false);
      if (f.this.a != null)
        f.this.a.d();
      if (!f.j(f.this))
        f.this.c();
      if ((f.k(f.this) != null) && (f.k(f.this).onError(f.d(f.this), paramAnonymousInt1, paramAnonymousInt2)));
      return true;
    }
  };
  private MediaPlayer.OnBufferingUpdateListener I = new MediaPlayer.OnBufferingUpdateListener()
  {
    public void onBufferingUpdate(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt)
    {
      f.e(f.this, paramAnonymousInt);
    }
  };
  public f.a a;
  MediaPlayer.OnVideoSizeChangedListener b = new MediaPlayer.OnVideoSizeChangedListener()
  {
    public void onVideoSizeChanged(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      f.a(f.this, paramAnonymousMediaPlayer.getVideoWidth());
      f.b(f.this, paramAnonymousMediaPlayer.getVideoHeight());
      if ((f.a(f.this) != 0) && (f.b(f.this) != 0))
        f.this.getHolder().setFixedSize(f.a(f.this), f.b(f.this));
    }
  };
  MediaPlayer.OnPreparedListener c = new MediaPlayer.OnPreparedListener()
  {
    public void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
    {
      f.c(f.this, 2);
      f.a(f.this, f.b(f.this, f.c(f.this, true)));
      if (f.c(f.this) != null)
        f.c(f.this).onPrepared(f.d(f.this));
      if (f.this.a != null)
        f.this.a.d();
      f.a(f.this, paramAnonymousMediaPlayer.getVideoWidth());
      f.b(f.this, paramAnonymousMediaPlayer.getVideoHeight());
      int i = f.e(f.this);
      if (i != 0)
        f.this.seekTo(i);
      if ((f.a(f.this) != 0) && (f.b(f.this) != 0))
      {
        f.this.getHolder().setFixedSize(f.a(f.this), f.b(f.this));
        if ((f.f(f.this) == f.a(f.this)) && (f.g(f.this) == f.b(f.this)))
        {
          if (f.h(f.this) != 3)
            break label229;
          f.this.start();
        }
      }
      label229: 
      while (f.h(f.this) != 3)
      {
        do
          return;
        while ((f.this.isPlaying()) || (i != 0) || (f.this.getCurrentPosition() <= 0));
        return;
      }
      f.this.start();
    }
  };
  SurfaceHolder.Callback d = new SurfaceHolder.Callback()
  {
    public void surfaceChanged(SurfaceHolder paramAnonymousSurfaceHolder, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      int i = 1;
      f.f(f.this, paramAnonymousInt2);
      f.g(f.this, paramAnonymousInt3);
      int j;
      if (f.h(f.this) == 3)
      {
        j = i;
        if ((f.a(f.this) != paramAnonymousInt2) || (f.b(f.this) != paramAnonymousInt3))
          break label118;
      }
      while (true)
      {
        if ((f.d(f.this) != null) && (j != 0) && (i != 0))
        {
          if (f.e(f.this) != 0)
            f.this.seekTo(f.e(f.this));
          f.this.start();
        }
        return;
        j = 0;
        break;
        label118: i = 0;
      }
    }

    public void surfaceCreated(SurfaceHolder paramAnonymousSurfaceHolder)
    {
      f.a(f.this, paramAnonymousSurfaceHolder);
      if (f.l(f.this) != null)
      {
        localAdMarvelVideoActivity = (AdMarvelVideoActivity)f.l(f.this).get();
        if ((localAdMarvelVideoActivity != null) && (localAdMarvelVideoActivity.i != AdMarvelVideoActivity.k.d) && (localAdMarvelVideoActivity.i != AdMarvelVideoActivity.k.e) && (localAdMarvelVideoActivity.i != AdMarvelVideoActivity.k.f))
          f.m(f.this);
      }
      while (f.n(f.this) == 0)
      {
        AdMarvelVideoActivity localAdMarvelVideoActivity;
        return;
      }
      f.m(f.this);
    }

    public void surfaceDestroyed(SurfaceHolder paramAnonymousSurfaceHolder)
    {
      f.a(f.this, null);
      f.this.a(true);
    }
  };
  private int e = 0;
  private Uri f;
  private final Uri g;
  private int h;
  private boolean i = true;
  private int j = 0;
  private int k = 0;
  private Map<String, f.b> l;
  private SurfaceHolder m = null;
  private MediaPlayer n = null;
  private int o;
  private int p;
  private int q;
  private int r;
  private MediaPlayer.OnCompletionListener s;
  private MediaPlayer.OnPreparedListener t;
  private int u;
  private MediaPlayer.OnErrorListener v;
  private int w;
  private boolean x;
  private boolean y;
  private boolean z;

  public f(Context paramContext, boolean paramBoolean, String paramString)
  {
    super(paramContext);
    this.A = paramContext;
    this.C = null;
    this.D = paramBoolean;
    i();
    this.g = Uri.parse(paramString);
  }

  private int a(long paramLong)
  {
    return (int)paramLong / 1000;
  }

  private void i()
  {
    this.o = 0;
    this.p = 0;
    getHolder().addCallback(this.d);
    getHolder().setType(3);
    this.j = 0;
    this.k = 0;
  }

  // ERROR //
  private void j()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 182	com/admarvel/android/ads/f:f	Landroid/net/Uri;
    //   4: ifnull +10 -> 14
    //   7: aload_0
    //   8: getfield 74	com/admarvel/android/ads/f:m	Landroid/view/SurfaceHolder;
    //   11: ifnonnull +4 -> 15
    //   14: return
    //   15: aload_0
    //   16: getfield 117	com/admarvel/android/ads/f:A	Landroid/content/Context;
    //   19: invokestatic 187	com/admarvel/android/ads/ab:k	(Landroid/content/Context;)Z
    //   22: ifne +20 -> 42
    //   25: aload_0
    //   26: getfield 189	com/admarvel/android/ads/f:a	Lcom/admarvel/android/ads/f$a;
    //   29: ifnull -15 -> 14
    //   32: aload_0
    //   33: getfield 189	com/admarvel/android/ads/f:a	Lcom/admarvel/android/ads/f$a;
    //   36: invokeinterface 193 1 0
    //   41: return
    //   42: aload_0
    //   43: iconst_0
    //   44: invokevirtual 196	com/admarvel/android/ads/f:a	(Z)V
    //   47: aload_0
    //   48: new 198	android/media/MediaPlayer
    //   51: dup
    //   52: invokespecial 200	android/media/MediaPlayer:<init>	()V
    //   55: putfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   58: aload_0
    //   59: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   62: aload_0
    //   63: getfield 90	com/admarvel/android/ads/f:c	Landroid/media/MediaPlayer$OnPreparedListener;
    //   66: invokevirtual 204	android/media/MediaPlayer:setOnPreparedListener	(Landroid/media/MediaPlayer$OnPreparedListener;)V
    //   69: aload_0
    //   70: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   73: aload_0
    //   74: getfield 85	com/admarvel/android/ads/f:b	Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
    //   77: invokevirtual 208	android/media/MediaPlayer:setOnVideoSizeChangedListener	(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
    //   80: aload_0
    //   81: iconst_m1
    //   82: putfield 210	com/admarvel/android/ads/f:h	I
    //   85: aload_0
    //   86: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   89: aload_0
    //   90: getfield 95	com/admarvel/android/ads/f:F	Landroid/media/MediaPlayer$OnCompletionListener;
    //   93: invokevirtual 214	android/media/MediaPlayer:setOnCompletionListener	(Landroid/media/MediaPlayer$OnCompletionListener;)V
    //   96: aload_0
    //   97: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   100: aload_0
    //   101: getfield 105	com/admarvel/android/ads/f:H	Landroid/media/MediaPlayer$OnErrorListener;
    //   104: invokevirtual 218	android/media/MediaPlayer:setOnErrorListener	(Landroid/media/MediaPlayer$OnErrorListener;)V
    //   107: aload_0
    //   108: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   111: aload_0
    //   112: getfield 110	com/admarvel/android/ads/f:I	Landroid/media/MediaPlayer$OnBufferingUpdateListener;
    //   115: invokevirtual 222	android/media/MediaPlayer:setOnBufferingUpdateListener	(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V
    //   118: aload_0
    //   119: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   122: aload_0
    //   123: getfield 100	com/admarvel/android/ads/f:G	Landroid/media/MediaPlayer$OnSeekCompleteListener;
    //   126: invokevirtual 226	android/media/MediaPlayer:setOnSeekCompleteListener	(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V
    //   129: aload_0
    //   130: iconst_0
    //   131: putfield 155	com/admarvel/android/ads/f:u	I
    //   134: aload_0
    //   135: getfield 182	com/admarvel/android/ads/f:f	Landroid/net/Uri;
    //   138: invokevirtual 230	android/net/Uri:toString	()Ljava/lang/String;
    //   141: ldc 232
    //   143: invokevirtual 238	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   146: istore 5
    //   148: iload 5
    //   150: ifeq +171 -> 321
    //   153: new 240	java/io/FileInputStream
    //   156: dup
    //   157: new 242	java/io/File
    //   160: dup
    //   161: aload_0
    //   162: getfield 182	com/admarvel/android/ads/f:f	Landroid/net/Uri;
    //   165: invokevirtual 230	android/net/Uri:toString	()Ljava/lang/String;
    //   168: invokespecial 245	java/io/File:<init>	(Ljava/lang/String;)V
    //   171: invokespecial 248	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   174: astore 6
    //   176: aload_0
    //   177: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   180: aload 6
    //   182: invokevirtual 252	java/io/FileInputStream:getFD	()Ljava/io/FileDescriptor;
    //   185: invokevirtual 256	android/media/MediaPlayer:setDataSource	(Ljava/io/FileDescriptor;)V
    //   188: aload 6
    //   190: invokevirtual 259	java/io/FileInputStream:close	()V
    //   193: aload_0
    //   194: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   197: aload_0
    //   198: getfield 74	com/admarvel/android/ads/f:m	Landroid/view/SurfaceHolder;
    //   201: invokevirtual 263	android/media/MediaPlayer:setDisplay	(Landroid/view/SurfaceHolder;)V
    //   204: aload_0
    //   205: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   208: iconst_3
    //   209: invokevirtual 266	android/media/MediaPlayer:setAudioStreamType	(I)V
    //   212: aload_0
    //   213: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   216: iconst_1
    //   217: invokevirtual 269	android/media/MediaPlayer:setScreenOnWhilePlaying	(Z)V
    //   220: aload_0
    //   221: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   224: invokevirtual 272	android/media/MediaPlayer:prepareAsync	()V
    //   227: aload_0
    //   228: iconst_1
    //   229: putfield 70	com/admarvel/android/ads/f:j	I
    //   232: return
    //   233: astore_3
    //   234: aload_3
    //   235: invokestatic 278	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   238: invokestatic 283	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   241: aload_0
    //   242: iconst_m1
    //   243: putfield 70	com/admarvel/android/ads/f:j	I
    //   246: aload_0
    //   247: iconst_m1
    //   248: putfield 72	com/admarvel/android/ads/f:k	I
    //   251: aload_0
    //   252: getfield 105	com/admarvel/android/ads/f:H	Landroid/media/MediaPlayer$OnErrorListener;
    //   255: aload_0
    //   256: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   259: iconst_1
    //   260: iconst_0
    //   261: invokeinterface 289 4 0
    //   266: pop
    //   267: return
    //   268: astore 7
    //   270: aconst_null
    //   271: astore 6
    //   273: aload 6
    //   275: ifnull +8 -> 283
    //   278: aload 6
    //   280: invokevirtual 259	java/io/FileInputStream:close	()V
    //   283: aload 7
    //   285: athrow
    //   286: astore_1
    //   287: aload_1
    //   288: invokestatic 278	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   291: invokestatic 283	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   294: aload_0
    //   295: iconst_m1
    //   296: putfield 70	com/admarvel/android/ads/f:j	I
    //   299: aload_0
    //   300: iconst_m1
    //   301: putfield 72	com/admarvel/android/ads/f:k	I
    //   304: aload_0
    //   305: getfield 105	com/admarvel/android/ads/f:H	Landroid/media/MediaPlayer$OnErrorListener;
    //   308: aload_0
    //   309: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   312: iconst_1
    //   313: iconst_0
    //   314: invokeinterface 289 4 0
    //   319: pop
    //   320: return
    //   321: aload_0
    //   322: getfield 76	com/admarvel/android/ads/f:n	Landroid/media/MediaPlayer;
    //   325: aload_0
    //   326: getfield 117	com/admarvel/android/ads/f:A	Landroid/content/Context;
    //   329: aload_0
    //   330: getfield 182	com/admarvel/android/ads/f:f	Landroid/net/Uri;
    //   333: invokevirtual 292	android/media/MediaPlayer:setDataSource	(Landroid/content/Context;Landroid/net/Uri;)V
    //   336: goto -143 -> 193
    //   339: astore 7
    //   341: goto -68 -> 273
    //
    // Exception table:
    //   from	to	target	type
    //   47	148	233	java/io/IOException
    //   188	193	233	java/io/IOException
    //   193	232	233	java/io/IOException
    //   278	283	233	java/io/IOException
    //   283	286	233	java/io/IOException
    //   321	336	233	java/io/IOException
    //   153	176	268	finally
    //   47	148	286	java/lang/IllegalArgumentException
    //   188	193	286	java/lang/IllegalArgumentException
    //   193	232	286	java/lang/IllegalArgumentException
    //   278	283	286	java/lang/IllegalArgumentException
    //   283	286	286	java/lang/IllegalArgumentException
    //   321	336	286	java/lang/IllegalArgumentException
    //   176	188	339	finally
  }

  private boolean k()
  {
    return (this.n != null) && (this.j != -1) && (this.j != 0) && (this.j != 1);
  }

  public Uri a()
  {
    return this.g;
  }

  String a(String paramString)
  {
    if ((this.l != null) && (this.l.containsKey(paramString)))
    {
      f.b localb = (f.b)this.l.get(paramString);
      if (localb != null)
        return localb.a;
    }
    return null;
  }

  public void a(int paramInt)
  {
    if (!ab.k(this.A))
    {
      if (this.a != null)
        this.a.f();
      return;
    }
    if (this.n == null)
    {
      this.w = paramInt;
      j();
      return;
    }
    this.n.seekTo(paramInt);
  }

  public void a(MediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    this.s = paramOnCompletionListener;
  }

  public void a(MediaPlayer.OnErrorListener paramOnErrorListener)
  {
    this.v = paramOnErrorListener;
  }

  public void a(MediaPlayer.OnPreparedListener paramOnPreparedListener)
  {
    this.t = paramOnPreparedListener;
  }

  public void a(Uri paramUri)
  {
    try
    {
      if (this.n != null)
      {
        this.n.reset();
        this.n.release();
        this.n = null;
      }
      this.f = paramUri;
      this.w = 0;
      j();
      requestLayout();
      invalidate();
      return;
    }
    catch (Exception localException)
    {
      if (this.a != null)
        this.a.g();
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  void a(String paramString1, String paramString2)
  {
    if (this.l == null)
      this.l = new ConcurrentHashMap();
    if (this.l.containsKey(paramString1))
    {
      f.b localb2 = (f.b)this.l.get(paramString1);
      localb2.a = paramString2;
      this.l.put(paramString1, localb2);
      return;
    }
    f.b localb1 = new f.b(null);
    localb1.a = paramString2;
    this.l.put(paramString1, localb1);
  }

  public void a(boolean paramBoolean)
  {
    try
    {
      if (this.n != null)
      {
        this.n.reset();
        this.n.release();
        this.n = null;
        this.j = 0;
        if (paramBoolean)
          this.k = 0;
      }
      return;
    }
    catch (Exception localException)
    {
      if (this.a != null)
        this.a.g();
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  void b()
  {
    if (this.E != null)
      this.E.cancel(true);
    try
    {
      if (b(this.g.toString()))
      {
        File localFile = new File(a(this.g.toString()));
        if (localFile.exists())
          localFile.delete();
      }
      if (this.E != null)
        this.E = null;
      return;
    }
    catch (Exception localException)
    {
      while (true)
        Logging.log(Log.getStackTraceString(localException));
    }
  }

  public void b(Uri paramUri)
  {
    try
    {
      this.f = paramUri;
      this.w = 0;
      j();
      requestLayout();
      invalidate();
      return;
    }
    catch (Exception localException)
    {
      if (this.a != null)
        this.a.g();
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  public boolean b(String paramString)
  {
    return (this.l != null) && (this.l.containsKey(paramString)) && (new File(((f.b)this.l.get(paramString)).a).exists());
  }

  public void c()
  {
    try
    {
      if (this.n != null)
      {
        this.n.reset();
        this.n.release();
        this.n = null;
        this.j = 0;
        this.k = 0;
        if (this.a != null)
          this.a.b();
      }
      return;
    }
    catch (Exception localException)
    {
      if (this.a != null)
        this.a.g();
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  public void c(String paramString)
  {
    b(Uri.parse(paramString));
  }

  public boolean canPause()
  {
    return this.x;
  }

  public boolean canSeekBackward()
  {
    return this.y;
  }

  public boolean canSeekForward()
  {
    return this.z;
  }

  public void d()
  {
    if (k())
      this.n.setVolume(0.0F, 0.0F);
  }

  public void d(String paramString)
  {
    String str;
    if (!b(paramString))
    {
      File localFile = getContext().getDir("adm_cache_files", 0);
      str = localFile.getAbsolutePath() + "/" + UUID.randomUUID().toString() + "_" + System.nanoTime();
      a(paramString, str);
      if (ac.a() >= 11)
      {
        this.E = new f.c(paramString, str, this);
        this.E.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
      }
    }
    else
    {
      return;
    }
    this.E = new f.c(paramString, str, this);
    this.E.execute(new Void[0]);
  }

  public void e()
  {
    if (k())
      this.n.setVolume(1.0F, 1.0F);
  }

  public void e(String paramString)
  {
    this.i = true;
    if (b(paramString))
    {
      c(a(paramString));
      start();
      return;
    }
    c(paramString);
    start();
  }

  public void f()
  {
    this.i = true;
    if (b(this.g.toString()))
    {
      c(a(this.g.toString()));
      start();
      return;
    }
    b(this.g);
    start();
  }

  public void g()
  {
    if (this.B > 0)
    {
      if (this.D)
        if (a(this.B) == a(getCurrentPosition()))
        {
          start();
          if (this.a != null)
            this.a.d();
        }
      while (true)
      {
        if (this.a != null)
          this.a.c();
        return;
        a(this.B);
        continue;
        if ((b(this.g.toString())) && (this.i))
        {
          c(a(this.g.toString()));
          seekTo(this.B);
          this.k = 3;
        }
        else if (this.i)
        {
          b(this.g);
          start();
        }
      }
    }
    if (b(this.g.toString()))
      c(a(this.g.toString()));
    while (true)
    {
      start();
      return;
      a(this.g);
    }
  }

  public int getBufferPercentage()
  {
    if (this.n != null)
      return this.u;
    return 0;
  }

  public int getCurrentPosition()
  {
    if (k())
    {
      int i1 = this.n.getCurrentPosition();
      this.e = i1;
      return i1;
    }
    return 0;
  }

  public int getDuration()
  {
    if (k())
    {
      if (this.h > 0)
        return this.h;
      this.h = this.n.getDuration();
      return this.h;
    }
    this.h = -1;
    return this.h;
  }

  public int h()
  {
    if (k())
    {
      this.e = this.n.getCurrentPosition();
      this.B = this.e;
      return this.e;
    }
    return this.B;
  }

  public boolean isPlaying()
  {
    return (k()) && (this.n.isPlaying());
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = getDefaultSize(this.o, paramInt1);
    int i2 = getDefaultSize(this.p, paramInt2);
    if ((this.o > 0) && (this.p > 0))
    {
      if (i2 * this.o <= i1 * this.p)
        break label70;
      i2 = i1 * this.p / this.o;
    }
    while (true)
    {
      setMeasuredDimension(i1, i2);
      return;
      label70: if (i2 * this.o < i1 * this.p)
        i1 = i2 * this.o / this.p;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a != null)
      this.a.e();
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
      this.j = 4;
      this.B = getCurrentPosition();
      if ((k()) && (this.n.isPlaying()))
      {
        if (!this.D)
          break label66;
        this.n.pause();
      }
      while (true)
      {
        if (this.a != null)
          this.a.a();
        this.k = 4;
        return;
        label66: c();
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      if (this.a != null)
        this.a.g();
      Logging.log(Log.getStackTraceString(localIllegalStateException));
    }
  }

  public void seekTo(int paramInt)
  {
    if (!ab.k(this.A))
    {
      if (this.a != null)
        this.a.f();
      return;
    }
    if (k())
    {
      this.n.seekTo(paramInt);
      this.w = 0;
      return;
    }
    this.w = paramInt;
  }

  public void start()
  {
    try
    {
      if (k())
      {
        this.n.start();
        this.j = 3;
      }
      this.k = 3;
      this.B = 0;
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      if (this.a != null)
        this.a.g();
      Logging.log(Log.getStackTraceString(localIllegalStateException));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.f
 * JD-Core Version:    0.6.2
 */