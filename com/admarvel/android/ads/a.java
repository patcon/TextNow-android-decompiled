package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.widget.MediaController.MediaPlayerControl;
import android.widget.RelativeLayout.LayoutParams;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@TargetApi(14)
class a extends TextureView
  implements TextureView.SurfaceTextureListener, MediaController.MediaPlayerControl
{
  private static long I = 600000L;
  private Context A;
  private int B = 0;
  private final WeakReference<AdMarvelVideoActivity> C;
  private final boolean D;
  private int E = 0;
  private boolean F = false;
  private boolean G = false;
  private boolean H = false;
  private a.c J;
  private MediaPlayer.OnCompletionListener K = new MediaPlayer.OnCompletionListener()
  {
    public void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
    {
      a.a(a.this, 5);
      a.b(a.this, 5);
      a.d(a.this, false);
      if (a.e(a.this) != null)
        a.e(a.this).onCompletion(a.b(a.this));
    }
  };
  private MediaPlayer.OnSeekCompleteListener L = new MediaPlayer.OnSeekCompleteListener()
  {
    public void onSeekComplete(MediaPlayer paramAnonymousMediaPlayer)
    {
      if (a.this.e != null)
        a.this.e.d();
    }
  };
  private MediaPlayer.OnErrorListener M = new MediaPlayer.OnErrorListener()
  {
    public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      a.a(a.this, -1);
      a.b(a.this, -1);
      a.d(a.this, false);
      if (a.this.e != null)
        a.this.e.d();
      if (!a.f(a.this))
        a.this.c();
      if ((a.g(a.this) != null) && (a.g(a.this).onError(a.b(a.this), paramAnonymousInt1, paramAnonymousInt2)));
      return true;
    }
  };
  private MediaPlayer.OnBufferingUpdateListener N = new MediaPlayer.OnBufferingUpdateListener()
  {
    public void onBufferingUpdate(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt)
    {
      a.c(a.this, paramAnonymousInt);
    }
  };
  public SurfaceTexture a = null;
  public Surface b = null;
  public int c;
  public int d;
  public a.b e;
  public a.a f;
  MediaPlayer.OnVideoSizeChangedListener g = new a.e(this);
  MediaPlayer.OnPreparedListener h = new a.d(this);
  private int i = 0;
  private Uri j;
  private final Uri k;
  private int l;
  private boolean m = true;
  private int n = 0;
  private int o = 0;
  private MediaPlayer p = null;
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

  public a(Context paramContext, boolean paramBoolean, String paramString)
  {
    super(paramContext);
    this.A = paramContext;
    this.C = null;
    this.D = paramBoolean;
    j();
    this.k = Uri.parse(paramString);
    this.j = Uri.parse(paramString);
  }

  private void j()
  {
    setSurfaceTextureListener(this);
    setWillNotDraw(false);
    this.c = 0;
    this.d = 0;
    setFocusable(true);
    setFocusableInTouchMode(true);
    requestFocus();
    this.n = 0;
    this.o = 0;
  }

  // ERROR //
  private void k()
  {
    // Byte code:
    //   0: ldc 205
    //   2: invokestatic 211	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: getfield 153	com/admarvel/android/ads/a:j	Landroid/net/Uri;
    //   9: ifnull +10 -> 19
    //   12: aload_0
    //   13: getfield 89	com/admarvel/android/ads/a:a	Landroid/graphics/SurfaceTexture;
    //   16: ifnonnull +4 -> 20
    //   19: return
    //   20: aload_0
    //   21: getfield 137	com/admarvel/android/ads/a:A	Landroid/content/Context;
    //   24: invokestatic 216	com/admarvel/android/ads/r:k	(Landroid/content/Context;)Z
    //   27: ifne +20 -> 47
    //   30: aload_0
    //   31: getfield 218	com/admarvel/android/ads/a:e	Lcom/admarvel/android/ads/a$b;
    //   34: ifnull -15 -> 19
    //   37: aload_0
    //   38: getfield 218	com/admarvel/android/ads/a:e	Lcom/admarvel/android/ads/a$b;
    //   41: invokeinterface 222 1 0
    //   46: return
    //   47: aload_0
    //   48: iconst_0
    //   49: invokevirtual 224	com/admarvel/android/ads/a:a	(Z)V
    //   52: aload_0
    //   53: new 226	android/media/MediaPlayer
    //   56: dup
    //   57: invokespecial 228	android/media/MediaPlayer:<init>	()V
    //   60: putfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   63: aload_0
    //   64: getfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   67: aload_0
    //   68: getfield 115	com/admarvel/android/ads/a:h	Landroid/media/MediaPlayer$OnPreparedListener;
    //   71: invokevirtual 232	android/media/MediaPlayer:setOnPreparedListener	(Landroid/media/MediaPlayer$OnPreparedListener;)V
    //   74: aload_0
    //   75: getfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   78: aload_0
    //   79: getfield 110	com/admarvel/android/ads/a:g	Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
    //   82: invokevirtual 236	android/media/MediaPlayer:setOnVideoSizeChangedListener	(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
    //   85: aload_0
    //   86: iconst_m1
    //   87: putfield 238	com/admarvel/android/ads/a:l	I
    //   90: aload_0
    //   91: getfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   94: aload_0
    //   95: getfield 120	com/admarvel/android/ads/a:K	Landroid/media/MediaPlayer$OnCompletionListener;
    //   98: invokevirtual 242	android/media/MediaPlayer:setOnCompletionListener	(Landroid/media/MediaPlayer$OnCompletionListener;)V
    //   101: aload_0
    //   102: getfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   105: aload_0
    //   106: getfield 130	com/admarvel/android/ads/a:M	Landroid/media/MediaPlayer$OnErrorListener;
    //   109: invokevirtual 246	android/media/MediaPlayer:setOnErrorListener	(Landroid/media/MediaPlayer$OnErrorListener;)V
    //   112: aload_0
    //   113: getfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   116: aload_0
    //   117: getfield 135	com/admarvel/android/ads/a:N	Landroid/media/MediaPlayer$OnBufferingUpdateListener;
    //   120: invokevirtual 250	android/media/MediaPlayer:setOnBufferingUpdateListener	(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V
    //   123: aload_0
    //   124: getfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   127: aload_0
    //   128: getfield 125	com/admarvel/android/ads/a:L	Landroid/media/MediaPlayer$OnSeekCompleteListener;
    //   131: invokevirtual 254	android/media/MediaPlayer:setOnSeekCompleteListener	(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V
    //   134: aload_0
    //   135: iconst_0
    //   136: putfield 168	com/admarvel/android/ads/a:u	I
    //   139: aload_0
    //   140: getfield 153	com/admarvel/android/ads/a:j	Landroid/net/Uri;
    //   143: invokevirtual 258	android/net/Uri:toString	()Ljava/lang/String;
    //   146: ldc_w 260
    //   149: invokevirtual 266	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   152: istore 5
    //   154: iload 5
    //   156: ifeq +178 -> 334
    //   159: new 268	java/io/FileInputStream
    //   162: dup
    //   163: new 270	java/io/File
    //   166: dup
    //   167: aload_0
    //   168: getfield 153	com/admarvel/android/ads/a:j	Landroid/net/Uri;
    //   171: invokevirtual 258	android/net/Uri:toString	()Ljava/lang/String;
    //   174: invokespecial 272	java/io/File:<init>	(Ljava/lang/String;)V
    //   177: invokespecial 275	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   180: astore 6
    //   182: aload_0
    //   183: getfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   186: aload 6
    //   188: invokevirtual 279	java/io/FileInputStream:getFD	()Ljava/io/FileDescriptor;
    //   191: invokevirtual 283	android/media/MediaPlayer:setDataSource	(Ljava/io/FileDescriptor;)V
    //   194: aload 6
    //   196: invokevirtual 286	java/io/FileInputStream:close	()V
    //   199: aload_0
    //   200: new 288	android/view/Surface
    //   203: dup
    //   204: aload_0
    //   205: getfield 89	com/admarvel/android/ads/a:a	Landroid/graphics/SurfaceTexture;
    //   208: invokespecial 291	android/view/Surface:<init>	(Landroid/graphics/SurfaceTexture;)V
    //   211: putfield 91	com/admarvel/android/ads/a:b	Landroid/view/Surface;
    //   214: aload_0
    //   215: getfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   218: aload_0
    //   219: getfield 91	com/admarvel/android/ads/a:b	Landroid/view/Surface;
    //   222: invokevirtual 295	android/media/MediaPlayer:setSurface	(Landroid/view/Surface;)V
    //   225: aload_0
    //   226: getfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   229: iconst_3
    //   230: invokevirtual 299	android/media/MediaPlayer:setAudioStreamType	(I)V
    //   233: aload_0
    //   234: getfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   237: invokevirtual 302	android/media/MediaPlayer:prepareAsync	()V
    //   240: aload_0
    //   241: iconst_1
    //   242: putfield 85	com/admarvel/android/ads/a:n	I
    //   245: return
    //   246: astore_3
    //   247: aload_3
    //   248: invokestatic 308	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   251: invokestatic 211	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   254: aload_0
    //   255: iconst_m1
    //   256: putfield 85	com/admarvel/android/ads/a:n	I
    //   259: aload_0
    //   260: iconst_m1
    //   261: putfield 87	com/admarvel/android/ads/a:o	I
    //   264: aload_0
    //   265: getfield 130	com/admarvel/android/ads/a:M	Landroid/media/MediaPlayer$OnErrorListener;
    //   268: aload_0
    //   269: getfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   272: iconst_1
    //   273: iconst_0
    //   274: invokeinterface 314 4 0
    //   279: pop
    //   280: return
    //   281: astore 7
    //   283: aconst_null
    //   284: astore 6
    //   286: aload 6
    //   288: ifnull +8 -> 296
    //   291: aload 6
    //   293: invokevirtual 286	java/io/FileInputStream:close	()V
    //   296: aload 7
    //   298: athrow
    //   299: astore_1
    //   300: aload_1
    //   301: invokestatic 308	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   304: invokestatic 211	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   307: aload_0
    //   308: iconst_m1
    //   309: putfield 85	com/admarvel/android/ads/a:n	I
    //   312: aload_0
    //   313: iconst_m1
    //   314: putfield 87	com/admarvel/android/ads/a:o	I
    //   317: aload_0
    //   318: getfield 130	com/admarvel/android/ads/a:M	Landroid/media/MediaPlayer$OnErrorListener;
    //   321: aload_0
    //   322: getfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   325: iconst_1
    //   326: iconst_0
    //   327: invokeinterface 314 4 0
    //   332: pop
    //   333: return
    //   334: aload_0
    //   335: getfield 93	com/admarvel/android/ads/a:p	Landroid/media/MediaPlayer;
    //   338: aload_0
    //   339: getfield 137	com/admarvel/android/ads/a:A	Landroid/content/Context;
    //   342: aload_0
    //   343: getfield 153	com/admarvel/android/ads/a:j	Landroid/net/Uri;
    //   346: invokevirtual 317	android/media/MediaPlayer:setDataSource	(Landroid/content/Context;Landroid/net/Uri;)V
    //   349: goto -150 -> 199
    //   352: astore 7
    //   354: goto -68 -> 286
    //
    // Exception table:
    //   from	to	target	type
    //   52	154	246	java/io/IOException
    //   194	199	246	java/io/IOException
    //   199	245	246	java/io/IOException
    //   291	296	246	java/io/IOException
    //   296	299	246	java/io/IOException
    //   334	349	246	java/io/IOException
    //   159	182	281	finally
    //   52	154	299	java/lang/IllegalArgumentException
    //   194	199	299	java/lang/IllegalArgumentException
    //   199	245	299	java/lang/IllegalArgumentException
    //   291	296	299	java/lang/IllegalArgumentException
    //   296	299	299	java/lang/IllegalArgumentException
    //   334	349	299	java/lang/IllegalArgumentException
    //   182	194	352	finally
  }

  private boolean l()
  {
    return (this.p != null) && (this.n != -1) && (this.n != 0) && (this.n != 1);
  }

  public Uri a()
  {
    return this.k;
  }

  String a(String paramString)
  {
    Logging.log("#### getCachedVideoUriPath url: " + paramString);
    File localFile = new File(getContext().getDir("adm_cache_files", 0).getAbsolutePath() + "/" + d(paramString));
    if ((localFile.exists()) && (System.currentTimeMillis() - localFile.lastModified() < I))
    {
      Logging.log("## getCachedVideoUriPath cached: " + localFile.getPath());
      return localFile.getPath();
    }
    return null;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.c = paramInt1;
    this.d = paramInt2;
    this.q = paramInt3;
    this.r = paramInt4;
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
      if (this.p != null)
      {
        this.p.reset();
        this.p.release();
        this.p = null;
      }
      this.j = paramUri;
      this.w = 0;
      k();
      requestLayout();
      invalidate();
      return;
    }
    catch (Exception localException)
    {
      if (this.e != null)
        this.e.g();
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  public void a(Uri paramUri, Boolean paramBoolean)
  {
    try
    {
      this.j = paramUri;
      this.w = 0;
      Logging.log("### setVideoURIForMrec");
      k();
      requestLayout();
      invalidate();
      return;
    }
    catch (Exception localException)
    {
      if (this.e != null)
        this.e.g();
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  public void a(a.a parama)
  {
    this.f = parama;
  }

  public void a(String paramString, int paramInt)
  {
    if (this.E > 5);
    do
    {
      return;
      this.E = (1 + this.E);
    }
    while ((b(paramString)) || (c(paramString)));
    File localFile = getContext().getDir("adm_cache_files", 0);
    String str = localFile.getAbsolutePath() + "/" + d(paramString);
    Logging.log("#### tempPath " + str);
    if (Version.getAndroidSDKVersion() >= 11)
    {
      this.J = new a.c(paramString, str, paramInt);
      this.J.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
      return;
    }
    this.J = new a.c(paramString, str, paramInt);
    this.J.execute(new Void[0]);
  }

  public void a(String paramString, Boolean paramBoolean)
  {
    a(Uri.parse(paramString), paramBoolean);
  }

  public void a(boolean paramBoolean)
  {
    try
    {
      if (this.p != null)
      {
        this.p.reset();
        this.p.release();
        this.p = null;
        this.n = 0;
        if (paramBoolean)
          this.o = 0;
      }
      if (this.b != null)
      {
        this.b.release();
        this.b = null;
      }
      return;
    }
    catch (Exception localException)
    {
      if (this.e != null)
        this.e.g();
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  void b()
  {
    if (this.J != null)
    {
      this.J.cancel(true);
      this.J = null;
      Logging.log("### " + this.J + " thread interuped ");
    }
  }

  public boolean b(String paramString)
  {
    Logging.log("#### isVideoUriCached url: " + paramString);
    File localFile = new File(getContext().getDir("adm_cache_files", 0).getAbsolutePath() + "/" + d(paramString));
    boolean bool1 = localFile.exists();
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = System.currentTimeMillis() - localFile.lastModified() < I;
      bool2 = false;
      if (bool3)
      {
        Logging.log("## file cached: " + localFile.getPath());
        bool2 = true;
      }
    }
    return bool2;
  }

  public void c()
  {
    try
    {
      if (this.p != null)
      {
        this.p.reset();
        this.p.release();
        this.p = null;
        this.n = 0;
        this.o = 0;
        if (this.e != null)
          this.e.b();
      }
      return;
    }
    catch (Exception localException)
    {
      if (this.e != null)
        this.e.g();
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  public boolean c(String paramString)
  {
    Logging.log("#### isVideoUriProcessing url: " + paramString);
    File localFile = new File(getContext().getDir("adm_cache_files", 0).getAbsolutePath() + "/" + d(paramString) + ".PROCESSING");
    boolean bool1 = localFile.exists();
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = System.currentTimeMillis() - localFile.lastModified() < I;
      bool2 = false;
      if (bool3)
      {
        Logging.log("## file processing: " + localFile.getPath());
        bool2 = true;
      }
    }
    return bool2;
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

  public String d(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramString.getBytes());
      byte[] arrayOfByte = localMessageDigest.digest();
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i1 = 0; i1 < arrayOfByte.length; i1++)
        localStringBuffer.append(Integer.toHexString(0xFF & arrayOfByte[i1]));
      String str = localStringBuffer.toString();
      return str;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localNoSuchAlgorithmException.printStackTrace();
    }
    return "";
  }

  public void d()
  {
    if (l())
      this.p.setVolume(0.0F, 0.0F);
  }

  public void e()
  {
    if (l())
      this.p.setVolume(1.0F, 1.0F);
  }

  public void e(String paramString)
  {
    this.m = true;
    if (b(paramString))
    {
      Logging.log("##### playWithCacheOrLoad  using cached path: " + a(paramString));
      a(a(paramString), Boolean.valueOf(true));
      start();
      return;
    }
    Logging.log("##### playWithCacheOrLoad: call start to make video play after loading");
    a(paramString, Boolean.valueOf(true));
    start();
    a(paramString, 1);
  }

  public void f()
  {
    this.m = true;
    if (b(this.k.toString()))
    {
      a(a(this.k.toString()), Boolean.valueOf(false));
      start();
      return;
    }
    a(this.k, Boolean.valueOf(false));
    start();
    a(this.k.toString(), 1);
  }

  public void g()
  {
    Logging.log("### ResumeVideoIfPaused");
    if (this.B > 0)
    {
      if ((b(this.k.toString())) && (this.m))
      {
        a(a(this.k.toString()), Boolean.valueOf(false));
        seekTo(this.B);
        this.o = 3;
      }
      while (true)
      {
        if (this.e != null)
          this.e.c();
        return;
        if (this.m)
        {
          a(this.k, Boolean.valueOf(false));
          start();
          a(this.k.toString(), 1);
        }
      }
    }
    if (b(this.k.toString()))
      a(a(this.k.toString()), Boolean.valueOf(false));
    while (true)
    {
      start();
      return;
      a(this.k);
    }
  }

  public int getAudioSessionId()
  {
    return 0;
  }

  public int getBufferPercentage()
  {
    if (this.p != null)
      return this.u;
    return 0;
  }

  public int getCurrentPosition()
  {
    if (l())
    {
      int i1 = this.p.getCurrentPosition();
      this.i = i1;
      return i1;
    }
    return 0;
  }

  public int getDuration()
  {
    if (l())
    {
      if (this.l > 0)
        return this.l;
      this.l = this.p.getDuration();
      return this.l;
    }
    this.l = -1;
    return this.l;
  }

  public int h()
  {
    if (l())
    {
      this.i = this.p.getCurrentPosition();
      this.B = this.i;
      return this.i;
    }
    return this.B;
  }

  public void i()
  {
    float f1 = getContext().getResources().getDisplayMetrics().density;
    RelativeLayout.LayoutParams localLayoutParams;
    if ((this.c > 0) && (this.d > 0))
    {
      localLayoutParams = new RelativeLayout.LayoutParams((int)(f1 * this.c), (int)(f1 * this.d));
      if (this.q < 0)
        break label132;
      if (this.r < 0)
        break label111;
      localLayoutParams.leftMargin = ((int)(f1 * this.q));
      localLayoutParams.topMargin = ((int)(f1 * this.r));
    }
    while (true)
    {
      setLayoutParams(localLayoutParams);
      return;
      localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      break;
      label111: localLayoutParams.leftMargin = ((int)(f1 * this.q));
      localLayoutParams.addRule(15);
      continue;
      label132: if (this.r >= 0)
      {
        localLayoutParams.topMargin = ((int)(f1 * this.r));
        localLayoutParams.addRule(14);
      }
      else
      {
        localLayoutParams.addRule(13);
      }
    }
  }

  public boolean isPlaying()
  {
    return (l()) && (this.p.isPlaying());
  }

  protected void onAttachedToWindow()
  {
    Logging.log("#### VideoView - onAttachedToWindow");
    this.F = false;
    super.onAttachedToWindow();
  }

  protected void onDetachedFromWindow()
  {
    this.F = true;
    super.onDetachedFromWindow();
  }

  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    Logging.log("#### VideoView - onSurfaceTextureAvailable: " + isAvailable());
    this.G = true;
    this.a = paramSurfaceTexture;
    if (this.n != 0)
      k();
  }

  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    Logging.log("#### VideoView - onSurfaceTextureDestroyed");
    this.G = false;
    this.H = false;
    return true;
  }

  @SuppressLint({"NewApi"})
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    Logging.log("#### VideoView - onSurfaceTextureSizeChanged");
  }

  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.e != null)
      this.e.e();
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
      this.n = 4;
      this.B = getCurrentPosition();
      if ((l()) && (this.p.isPlaying()))
      {
        if (!this.D)
          break label66;
        this.p.pause();
      }
      while (true)
      {
        if (this.e != null)
          this.e.a();
        this.o = 4;
        return;
        label66: c();
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      if (this.e != null)
        this.e.g();
      Logging.log(Log.getStackTraceString(localIllegalStateException));
    }
  }

  public void seekTo(int paramInt)
  {
    if (!r.k(this.A))
    {
      if (this.e != null)
        this.e.f();
      return;
    }
    if (l())
    {
      this.p.seekTo(paramInt);
      this.w = 0;
      return;
    }
    this.w = paramInt;
  }

  public void start()
  {
    try
    {
      if (l())
      {
        this.p.start();
        this.n = 3;
      }
      this.o = 3;
      this.B = 0;
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      if (this.e != null)
        this.e.g();
      Logging.log(Log.getStackTraceString(localIllegalStateException));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.a
 * JD-Core Version:    0.6.2
 */