package textnow.t;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager.WakeLock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;
import textnow.z.u;

public final class a extends Dialog
  implements DialogInterface.OnShowListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, View.OnClickListener, SeekBar.OnSeekBarChangeListener
{
  private static String c = null;
  final Handler a = new Handler();
  Runnable b = new Runnable()
  {
    public final void run()
    {
      a.a(a.this);
    }
  };
  private ImageButton d = null;
  private ImageButton e = null;
  private SeekBar f = null;
  private TextView g = null;
  private TextView h = null;
  private String i = null;
  private MediaPlayer j = null;
  private int k = 0;
  private int l = 0;
  private String m = null;
  private u n;
  private PowerManager.WakeLock o = null;
  private Context p;
  private b q = b.a;
  private b r = b.a;
  private AudioManager s;
  private int t = 0;

  public a(Context paramContext, String paramString)
  {
    this(paramContext, paramString, null);
  }

  public a(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    c = paramString1;
    this.p = paramContext;
    this.m = paramString2;
    this.s = ((AudioManager)this.p.getSystemService("audio"));
    this.o = textnow.v.b.a(paramContext, "vm_playback_lock");
    setOnShowListener(this);
  }

  private void a()
  {
    this.j = new MediaPlayer();
    try
    {
      this.j.setDataSource(c);
      this.j.prepare();
      this.j.setOnErrorListener(this);
      this.j.setOnCompletionListener(this);
      return;
    }
    catch (IOException localIOException)
    {
      d();
      Toast.makeText(getContext(), 2131296417, 0).show();
    }
  }

  @TargetApi(11)
  private void b()
  {
    if (this.j == null)
      a();
    AudioManager localAudioManager;
    int i1;
    if (this.j != null)
      if (this.s != null)
      {
        localAudioManager = this.s;
        if (!this.n.ae())
          break label123;
        i1 = 0;
      }
    while (true)
    {
      localAudioManager.setMode(i1);
      TypedArray localTypedArray = this.p.obtainStyledAttributes(new int[] { 2130772259 });
      this.d.setBackgroundResource(localTypedArray.getResourceId(0, 2130837680));
      localTypedArray.recycle();
      this.j.start();
      if ((this.n.ad()) && (this.o != null) && (!this.o.isHeld()))
        this.o.acquire();
      return;
      label123: if (Build.VERSION.SDK_INT >= 11)
        i1 = 3;
      else
        i1 = 2;
    }
  }

  private void c()
  {
    if (this.j == null)
      return;
    TypedArray localTypedArray = this.p.obtainStyledAttributes(new int[] { 2130772258 });
    this.d.setBackgroundResource(localTypedArray.getResourceId(0, 2130837682));
    localTypedArray.recycle();
    this.j.pause();
    if (this.s != null)
      this.s.setMode(this.t);
    g();
  }

  // ERROR //
  private void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 73	textnow/t/a:j	Landroid/media/MediaPlayer;
    //   4: ifnull +22 -> 26
    //   7: aload_0
    //   8: getfield 73	textnow/t/a:j	Landroid/media/MediaPlayer;
    //   11: invokevirtual 235	android/media/MediaPlayer:stop	()V
    //   14: aload_0
    //   15: getfield 73	textnow/t/a:j	Landroid/media/MediaPlayer;
    //   18: invokevirtual 238	android/media/MediaPlayer:release	()V
    //   21: aload_0
    //   22: aconst_null
    //   23: putfield 73	textnow/t/a:j	Landroid/media/MediaPlayer;
    //   26: aload_0
    //   27: invokespecial 230	textnow/t/a:g	()V
    //   30: return
    //   31: astore_2
    //   32: aload_0
    //   33: aconst_null
    //   34: putfield 73	textnow/t/a:j	Landroid/media/MediaPlayer;
    //   37: goto -11 -> 26
    //   40: astore_1
    //   41: aload_0
    //   42: aconst_null
    //   43: putfield 73	textnow/t/a:j	Landroid/media/MediaPlayer;
    //   46: aload_1
    //   47: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   7	21	31	java/lang/Exception
    //   7	21	40	finally
  }

  private void e()
  {
    switch (2.a[this.q.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      if ((this.l != this.k) && (this.q == b.b))
      {
        this.a.removeCallbacks(this.b);
        this.a.postDelayed(this.b, 1000L);
      }
      return;
      String str5 = this.i;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(this.k / 60);
      arrayOfObject3[1] = Integer.valueOf(this.k % 60);
      String str6 = String.format(str5, arrayOfObject3);
      this.h.setText(str6);
      this.f.setMax(this.k);
      this.f.setProgress(0);
      this.l = 0;
      continue;
      this.l = (1 + this.l);
      String str3 = this.i;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(this.l / 60);
      arrayOfObject2[1] = Integer.valueOf(this.l % 60);
      String str4 = String.format(str3, arrayOfObject2);
      this.g.setText(str4);
      this.f.setProgress(this.l);
      continue;
      String str1 = this.i;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(this.l / 60);
      arrayOfObject1[1] = Integer.valueOf(this.l % 60);
      String str2 = String.format(str1, arrayOfObject1);
      this.g.setText(str2);
    }
  }

  private void f()
  {
    if (isShowing());
    try
    {
      dismiss();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private void g()
  {
    if ((this.o != null) && (this.o.isHeld()))
      this.o.release();
  }

  public final void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      throw new RuntimeException("Did not understand view: " + paramView.getId());
    case 2131558534:
      if (this.q == b.b)
      {
        this.q = b.c;
        c();
        this.a.post(this.b);
      }
      break;
    case 2131558535:
    }
    do
    {
      do
        return;
      while ((this.q != b.c) && (this.q != b.a));
      this.q = b.b;
      b();
      this.a.post(this.b);
      return;
    }
    while (this.s == null);
    boolean bool1 = this.n.ae();
    TypedArray localTypedArray = this.p.obtainStyledAttributes(new int[] { 2130772260, 2130772261 });
    AudioManager localAudioManager;
    int i1;
    if (bool1)
    {
      this.n.k(false);
      this.e.setBackgroundResource(localTypedArray.getResourceId(1, 2130837684));
      this.n.B();
      localAudioManager = this.s;
      boolean bool2 = this.n.ae();
      i1 = 0;
      if (!bool2)
        break label270;
    }
    while (true)
    {
      localAudioManager.setMode(i1);
      localTypedArray.recycle();
      return;
      this.n.k(true);
      this.e.setBackgroundResource(localTypedArray.getResourceId(0, 2130837686));
      break;
      label270: if (Build.VERSION.SDK_INT >= 11)
        i1 = 3;
      else
        i1 = 2;
    }
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    d();
    this.q = b.a;
    e();
    f();
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(getLayoutInflater().inflate(2130903075, null));
    setTitle(this.p.getResources().getString(2131296555));
    getWindow().setLayout(-1, -2);
    this.n = new u(getContext());
    this.d = ((ImageButton)findViewById(2131558534));
    this.d.setOnClickListener(this);
    this.e = ((ImageButton)findViewById(2131558535));
    this.e.setOnClickListener(this);
    TypedArray localTypedArray = this.p.obtainStyledAttributes(new int[] { 2130772260, 2130772261 });
    if (this.n.ae())
    {
      this.e.setBackgroundResource(localTypedArray.getResourceId(0, 2130837686));
      localTypedArray.recycle();
      this.f = ((SeekBar)findViewById(2131558532));
      this.f.setProgress(0);
      this.f.setOnSeekBarChangeListener(this);
      this.i = getContext().getResources().getString(2131296409);
      this.g = ((TextView)findViewById(2131558531));
      this.h = ((TextView)findViewById(2131558533));
      if (this.m != null)
        break label343;
      findViewById(2131558529).setVisibility(8);
    }
    while (true)
    {
      if (this.s != null)
        this.t = this.s.getMode();
      a();
      if (this.j != null)
      {
        this.k = (this.j.getDuration() / 1000);
        new StringBuilder().append("Audio file duration: ").append(this.k).toString();
        e();
      }
      return;
      this.e.setBackgroundResource(localTypedArray.getResourceId(1, 2130837684));
      break;
      label343: ((TextView)findViewById(2131558529)).setText(this.m);
    }
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    Toast.makeText(getContext(), 2131296417, 0).show();
    d();
    f();
    return false;
  }

  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if ((this.q == b.c) || (this.q == b.a))
    {
      this.l = paramInt;
      if (this.j != null)
        this.j.seekTo(paramInt * 1000);
      e();
    }
  }

  public final void onShow(DialogInterface paramDialogInterface)
  {
    this.q = b.b;
    b();
    this.a.post(this.b);
  }

  public final void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    this.r = this.q;
    this.q = b.c;
    c();
    e();
  }

  // ERROR //
  public final void onStop()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 73	textnow/t/a:j	Landroid/media/MediaPlayer;
    //   4: ifnull +22 -> 26
    //   7: aload_0
    //   8: getfield 73	textnow/t/a:j	Landroid/media/MediaPlayer;
    //   11: invokevirtual 235	android/media/MediaPlayer:stop	()V
    //   14: aload_0
    //   15: getfield 73	textnow/t/a:j	Landroid/media/MediaPlayer;
    //   18: invokevirtual 238	android/media/MediaPlayer:release	()V
    //   21: aload_0
    //   22: aconst_null
    //   23: putfield 73	textnow/t/a:j	Landroid/media/MediaPlayer;
    //   26: aload_0
    //   27: getfield 118	textnow/t/a:s	Landroid/media/AudioManager;
    //   30: ifnull +14 -> 44
    //   33: aload_0
    //   34: getfield 118	textnow/t/a:s	Landroid/media/AudioManager;
    //   37: aload_0
    //   38: getfield 91	textnow/t/a:t	I
    //   41: invokevirtual 184	android/media/AudioManager:setMode	(I)V
    //   44: aload_0
    //   45: invokespecial 230	textnow/t/a:g	()V
    //   48: aload_0
    //   49: invokespecial 432	android/app/Dialog:onStop	()V
    //   52: return
    //   53: astore_2
    //   54: aload_0
    //   55: aconst_null
    //   56: putfield 73	textnow/t/a:j	Landroid/media/MediaPlayer;
    //   59: goto -33 -> 26
    //   62: astore_1
    //   63: aload_0
    //   64: aconst_null
    //   65: putfield 73	textnow/t/a:j	Landroid/media/MediaPlayer;
    //   68: aload_1
    //   69: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   7	21	53	java/lang/Exception
    //   7	21	62	finally
  }

  public final void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    this.q = this.r;
    if (this.q == b.b)
      b();
    if (this.q == b.c)
      c();
    e();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.t.a
 * JD-Core Version:    0.6.2
 */