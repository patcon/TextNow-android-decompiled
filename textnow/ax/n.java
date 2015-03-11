package textnow.ax;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tremorvideo.sdk.android.videoad.bd;
import com.tremorvideo.sdk.android.videoad.eh;
import com.tremorvideo.sdk.android.videoad.r;

public final class n
{
  o a;
  RelativeLayout b;
  aj c;
  boolean d;
  p e;
  int f = 0;
  int g = 0;
  Context h;
  long i = 0L;
  long j = 0L;
  ProgressBar k;
  volatile boolean l = false;
  volatile ai m = null;
  public ai n = null;
  public ai o = null;
  public int p = -1;
  public int q = -1;
  public int r = 0;
  private e s;
  private boolean t = false;
  private boolean u = false;
  private boolean v = false;
  private q w;
  private TextView x;
  private RelativeLayout.LayoutParams y;
  private int z = -1;

  public n(Context paramContext, aj paramaj, e parame)
  {
    this.s = parame;
    this.h = paramContext;
    this.c = paramaj;
    this.d = false;
    this.b = new RelativeLayout(paramContext);
    k();
  }

  private void a(ai paramai)
  {
    this.l = true;
    this.j = 0L;
    if ((this.n != null) && (this.n.a != null))
      j();
    if (paramai.a != null)
    {
      this.w = new q(this.h, this);
      this.w.a(paramai.a.b(), paramai.e());
      this.l = false;
      this.v = false;
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams2.addRule(10);
      localLayoutParams2.addRule(12);
      localLayoutParams2.addRule(11);
      localLayoutParams2.addRule(9);
      this.b.removeAllViews();
      this.b.addView(this.w, localLayoutParams2);
    }
    while (true)
    {
      this.n = paramai;
      this.f = 0;
      this.g = this.a.getDuration();
      a(true);
      return;
      k();
      m();
      if (paramai.f() == true)
      {
        Uri localUri = Uri.parse(paramai.e());
        this.a.setVideoURI(localUri);
        this.k = new ProgressBar(this.a.getContext(), null, 16842874);
        RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(100, 100);
        localLayoutParams1.addRule(13);
        this.b.addView(this.k, localLayoutParams1);
        this.t = false;
        this.u = true;
        this.v = false;
      }
      else
      {
        this.a.setVideoPath(paramai.e());
        this.t = false;
        this.u = false;
        this.v = false;
      }
    }
  }

  private void a(boolean paramBoolean)
  {
    try
    {
      this.d = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void k()
  {
    this.a = new o(this, this.h);
    this.a.setBackgroundColor(0);
    this.a.setId(48879);
    l();
    this.a.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
    {
      public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
      {
        n.this.f = n.this.g;
        if ((!n.this.a.a) && (!n.a(n.this)))
        {
          if (n.this.c != null)
            n.this.c.a(ae.c);
          if (n.this.e != null)
            n.this.e.c();
        }
        n.a(n.this, false);
        n.b(n.this, false);
      }
    });
    this.a.setOnPreparedListener(new MediaPlayer.OnPreparedListener()
    {
      public final void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
      {
        if (n.this.a == null);
        do
        {
          do
          {
            return;
            if (n.this.m != null)
            {
              n.this.a.post(new Runnable()
              {
                public final void run()
                {
                  ai localai = n.this.m;
                  n.this.m = null;
                  n.a(n.this, localai);
                }
              });
              return;
            }
          }
          while (n.a(n.this) == true);
          n.this.i = 200L;
          n.this.l = false;
          n.this.g = n.this.a.getDuration();
        }
        while (!n.this.d);
        p localp;
        if (n.this.e != null)
          localp = n.this.e;
        for (boolean bool = localp.a(); ; bool = true)
        {
          n.b(n.this);
          if (!bool)
            break;
          n.this.a.start();
          if (n.c(n.this) == true)
            n.b(n.this, true);
          if ((n.this.k != null) && (n.this.k.isShown()))
            n.this.k.setVisibility(8);
          if (n.d(n.this) == -1)
            break;
          n.this.a.seekTo(n.d(n.this));
          n.a(n.this, -1);
          return;
        }
      }
    });
    this.a.setOnErrorListener(new MediaPlayer.OnErrorListener()
    {
      public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        r.d("Media Player Error: " + paramAnonymousInt1 + " Extra: " + paramAnonymousInt2);
        if (!n.this.a.a)
        {
          if (n.c(n.this) != true)
            break label64;
          n.this.i();
        }
        label64: 
        do
        {
          return true;
          n.this.a.a = true;
        }
        while (n.this.e == null);
        n.this.e.b();
        return true;
      }
    });
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams.addRule(10);
    localLayoutParams.addRule(12);
    localLayoutParams.addRule(11);
    localLayoutParams.addRule(9);
    this.b.removeAllViews();
    this.b.addView(this.a, localLayoutParams);
  }

  private void l()
  {
    this.a.setVisibility(8);
  }

  private void m()
  {
    this.a.setVisibility(0);
  }

  public final void a(int paramInt)
  {
    if (this.d)
      this.a.postDelayed(new Runnable()
      {
        public final void run()
        {
          if (!n.c(n.this))
          {
            int i = n.this.f;
            n.this.a.pause();
            n.this.a.setVisibility(4);
            n.this.a.setVisibility(0);
            n.this.a.seekTo(i);
            n.this.a.start();
          }
        }
      }
      , 0L);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2);
    this.a.getHolder().setFixedSize(paramInt1, paramInt2);
  }

  public final void a(long paramLong)
  {
    this.i = Math.max(0L, this.i - paramLong);
    long l1;
    if (this.l)
    {
      l1 = this.j;
      this.j = (paramLong + this.j);
      if (this.u != true)
        break label110;
      if ((l1 < 10000L) && (this.j >= 20000L))
        i();
    }
    while (true)
    {
      if ((this.n != null) && (this.n.a != null) && (this.w != null))
      {
        this.w.d();
        this.f = this.w.getProgress();
      }
      return;
      label110: if ((l1 < 10000L) && (this.j >= 10000L))
        if (this.u == true)
        {
          i();
        }
        else
        {
          r.d("Unknown error while loading video...");
          this.e.b();
        }
    }
  }

  public final void a(MotionEvent paramMotionEvent)
  {
    if ((this.w != null) && (this.b != null))
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.b.getLayoutParams();
      if (localLayoutParams != null)
      {
        float f1 = paramMotionEvent.getX() - localLayoutParams.leftMargin;
        float f2 = paramMotionEvent.getY() - localLayoutParams.topMargin;
        if ((f1 > 0.0F) && (f1 < localLayoutParams.width) && (f2 > 0.0F) && (f2 < localLayoutParams.height))
        {
          MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
          localMotionEvent.setLocation(f1, f2);
          this.w.dispatchTouchEvent(localMotionEvent);
          localMotionEvent.recycle();
        }
      }
    }
  }

  public final void a(String paramString)
  {
    if (this.s != null)
    {
      bd localbd = this.s.c();
      if (localbd != null)
        localbd.b(paramString);
    }
  }

  public final void a(ai paramai, int paramInt1, int paramInt2)
  {
    this.z = paramInt1;
    if (this.l)
    {
      this.m = paramai;
      return;
    }
    this.p = paramInt2;
    a(paramai);
  }

  public final boolean a()
  {
    try
    {
      boolean bool = this.d;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean b()
  {
    if (this.i > 0L)
      return true;
    if (this.u)
      return false;
    return this.l;
  }

  public final boolean b(int paramInt)
  {
    if (!this.t);
    int i2;
    int i3;
    do
    {
      do
      {
        do
        {
          int i1;
          do
          {
            return false;
            i1 = this.a.getDuration();
          }
          while (i1 <= 0);
          i2 = this.a.getCurrentPosition();
          i3 = i1 / 4;
          switch (paramInt)
          {
          default:
            return false;
          case 1:
          case 2:
          case 3:
          }
        }
        while (i2 <= i3);
        return true;
      }
      while (i2 <= i3 * 2);
      return true;
    }
    while (i2 <= i3 * 3);
    return true;
  }

  public final void c()
  {
    l();
    if ((this.n != null) && (this.n.a != null))
    {
      j();
      this.n = null;
    }
    while (true)
    {
      a(false);
      this.f = 0;
      this.g = 0;
      return;
      this.a.stopPlayback();
    }
  }

  public final void d()
  {
    if ((this.n != null) && (this.n.a != null) && (this.w != null))
      this.w.b();
    while (true)
    {
      a(false);
      return;
      if (this.a != null)
        this.a.pause();
    }
  }

  public final void e()
  {
    this.r = this.a.getCurrentPosition();
    this.o = this.n;
    this.q = this.p;
    d();
  }

  public final int f()
  {
    try
    {
      o localo = this.a;
      i1 = 0;
      if (localo != null)
      {
        ai localai = this.n;
        i1 = 0;
        if (localai != null)
        {
          eh localeh = this.n.a;
          i1 = 0;
          if (localeh == null)
          {
            int i2 = this.a.getCurrentPosition();
            i1 = i2;
          }
        }
      }
      if (i1 > this.f)
        this.f = i1;
      return this.f;
    }
    catch (Exception localException)
    {
      while (true)
        int i1 = 0;
    }
  }

  public final int g()
  {
    if ((this.g <= 0) && (this.a != null))
      this.g = this.a.getDuration();
    return this.g;
  }

  public final void h()
  {
    if (!this.v)
    {
      if ((this.n == null) || (this.n.a == null))
        break label75;
      if (this.w != null)
      {
        this.w.c();
        a(true);
      }
    }
    while (true)
    {
      if ((this.k != null) && (this.k.isShown()))
        this.k.setVisibility(8);
      a(true);
      return;
      label75: if ((this.a != null) && (!this.a.isPlaying()))
      {
        int i1 = this.a.getCurrentPosition();
        int i2 = g();
        if ((i1 != this.f) && (this.f < i2))
          this.a.seekTo(this.f);
        this.a.start();
      }
    }
  }

  public final void i()
  {
    if ((this.b != null) && (!this.v))
    {
      this.l = false;
      this.v = true;
      this.t = false;
      this.x = new TextView(this.a.getContext(), null, 16842817);
      this.x.setText("Playback Error!");
      this.y = new RelativeLayout.LayoutParams(-2, -2);
      this.y.addRule(13);
      this.x.setPadding(10, 5, 10, 5);
      ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(new float[] { 10.0F, 10.0F, 10.0F, 10.0F, 10.0F, 10.0F, 10.0F, 10.0F }, null, null));
      localShapeDrawable.getPaint().setColor(-12303292);
      this.x.setBackgroundDrawable(localShapeDrawable);
      this.x.setTextColor(-1);
      ((Activity)this.b.getContext()).runOnUiThread(new Runnable()
      {
        public final void run()
        {
          if ((n.this.k != null) && (n.this.k.isShown()))
            n.this.k.setVisibility(8);
          n.this.b.addView(n.e(n.this), n.f(n.this));
          if ((n.this.a != null) && (n.this.a.isPlaying()))
            n.this.a.stopPlayback();
        }
      });
    }
  }

  public final void j()
  {
    this.w.stopLoading();
    this.w.a();
    if (this.w.getParent() == this.b)
      this.b.removeView(this.w);
    this.w.loadData("", "text/html", "UTF-8");
    this.w = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.n
 * JD-Core Version:    0.6.2
 */