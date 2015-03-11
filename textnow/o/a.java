package textnow.o;

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
import android.os.Bundle;
import android.os.Handler;
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
  private Context n;
  private b o = b.a;
  private b p = b.a;
  private AudioManager q;
  private int r = 0;
  private boolean s = true;

  public a(Context paramContext, String paramString)
  {
    super(paramContext);
    c = paramString;
    this.n = paramContext;
    setOnShowListener(this);
  }

  public a(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    c = paramString1;
    this.n = paramContext;
    this.m = paramString2;
    this.q = ((AudioManager)this.n.getSystemService("audio"));
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
      Toast.makeText(getContext(), 2131493011, 0).show();
    }
  }

  private void b()
  {
    if (this.j == null)
      a();
    if (this.j != null)
    {
      if (this.q != null)
      {
        this.q.setMode(2);
        this.q.setSpeakerphoneOn(this.s);
      }
      TypedArray localTypedArray = this.n.obtainStyledAttributes(new int[] { 2130772179 });
      this.d.setBackgroundResource(localTypedArray.getResourceId(0, 2130837730));
      localTypedArray.recycle();
      this.j.start();
    }
  }

  private void c()
  {
    if (this.j == null);
    do
    {
      return;
      TypedArray localTypedArray = this.n.obtainStyledAttributes(new int[] { 2130772178 });
      this.d.setBackgroundResource(localTypedArray.getResourceId(0, 2130837732));
      localTypedArray.recycle();
      this.j.pause();
    }
    while (this.q == null);
    this.q.setMode(this.r);
  }

  // ERROR //
  private void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 68	textnow/o/a:j	Landroid/media/MediaPlayer;
    //   4: ifnull +22 -> 26
    //   7: aload_0
    //   8: getfield 68	textnow/o/a:j	Landroid/media/MediaPlayer;
    //   11: invokevirtual 199	android/media/MediaPlayer:stop	()V
    //   14: aload_0
    //   15: getfield 68	textnow/o/a:j	Landroid/media/MediaPlayer;
    //   18: invokevirtual 202	android/media/MediaPlayer:release	()V
    //   21: aload_0
    //   22: aconst_null
    //   23: putfield 68	textnow/o/a:j	Landroid/media/MediaPlayer;
    //   26: return
    //   27: astore_2
    //   28: aload_0
    //   29: aconst_null
    //   30: putfield 68	textnow/o/a:j	Landroid/media/MediaPlayer;
    //   33: return
    //   34: astore_1
    //   35: aload_0
    //   36: aconst_null
    //   37: putfield 68	textnow/o/a:j	Landroid/media/MediaPlayer;
    //   40: aload_1
    //   41: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   7	21	27	java/lang/Exception
    //   7	21	34	finally
  }

  private void e()
  {
    switch (2.a[this.o.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      if ((this.l != this.k) && (this.o == b.b))
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

  public final void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      throw new RuntimeException("Did not understand view: " + paramView.getId());
    case 2131165300:
      if (this.o == b.b)
      {
        this.o = b.c;
        c();
        this.a.post(this.b);
      }
      break;
    case 2131165301:
    }
    do
    {
      do
        return;
      while ((this.o != b.c) && (this.o != b.a));
      this.o = b.b;
      b();
      this.a.post(this.b);
      return;
    }
    while (this.q == null);
    TypedArray localTypedArray = this.n.obtainStyledAttributes(new int[] { 2130772180, 2130772181 });
    if (this.s)
    {
      this.q.setSpeakerphoneOn(false);
      this.s = false;
      this.e.setBackgroundResource(localTypedArray.getResourceId(1, 2130837734));
    }
    while (true)
    {
      localTypedArray.recycle();
      return;
      this.q.setSpeakerphoneOn(true);
      this.s = true;
      this.e.setBackgroundResource(localTypedArray.getResourceId(0, 2130837736));
    }
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    d();
    this.o = b.a;
    e();
    dismiss();
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(getLayoutInflater().inflate(2130903071, null));
    setTitle(this.n.getResources().getString(2131493143));
    getWindow().setLayout(-1, -2);
    this.d = ((ImageButton)findViewById(2131165300));
    this.d.setOnClickListener(this);
    this.e = ((ImageButton)findViewById(2131165301));
    this.e.setOnClickListener(this);
    this.f = ((SeekBar)findViewById(2131165298));
    this.f.setProgress(0);
    this.f.setOnSeekBarChangeListener(this);
    this.i = getContext().getResources().getString(2131493003);
    this.g = ((TextView)findViewById(2131165297));
    this.h = ((TextView)findViewById(2131165299));
    if (this.m == null)
      findViewById(2131165295).setVisibility(8);
    while (true)
    {
      getWindow().setVolumeControlStream(0);
      if (this.q != null)
        this.r = this.q.getMode();
      a();
      if (this.j != null)
      {
        this.k = (this.j.getDuration() / 1000);
        new StringBuilder().append("Audio file duration: ").append(this.k).toString();
        e();
      }
      return;
      ((TextView)findViewById(2131165295)).setText(this.m);
    }
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    Toast.makeText(getContext(), 2131493011, 0).show();
    d();
    dismiss();
    return false;
  }

  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if ((this.o == b.c) || (this.o == b.a))
    {
      this.l = paramInt;
      if (this.j != null)
        this.j.seekTo(paramInt * 1000);
      e();
    }
  }

  public final void onShow(DialogInterface paramDialogInterface)
  {
    this.o = b.b;
    b();
    this.a.post(this.b);
  }

  public final void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    this.p = this.o;
    this.o = b.c;
    c();
    e();
  }

  // ERROR //
  public final void onStop()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 68	textnow/o/a:j	Landroid/media/MediaPlayer;
    //   4: ifnull +22 -> 26
    //   7: aload_0
    //   8: getfield 68	textnow/o/a:j	Landroid/media/MediaPlayer;
    //   11: invokevirtual 199	android/media/MediaPlayer:stop	()V
    //   14: aload_0
    //   15: getfield 68	textnow/o/a:j	Landroid/media/MediaPlayer;
    //   18: invokevirtual 202	android/media/MediaPlayer:release	()V
    //   21: aload_0
    //   22: aconst_null
    //   23: putfield 68	textnow/o/a:j	Landroid/media/MediaPlayer;
    //   26: aload_0
    //   27: getfield 118	textnow/o/a:q	Landroid/media/AudioManager;
    //   30: ifnull +14 -> 44
    //   33: aload_0
    //   34: getfield 118	textnow/o/a:q	Landroid/media/AudioManager;
    //   37: aload_0
    //   38: getfield 84	textnow/o/a:r	I
    //   41: invokevirtual 162	android/media/AudioManager:setMode	(I)V
    //   44: aload_0
    //   45: invokespecial 386	android/app/Dialog:onStop	()V
    //   48: return
    //   49: astore_2
    //   50: aload_0
    //   51: aconst_null
    //   52: putfield 68	textnow/o/a:j	Landroid/media/MediaPlayer;
    //   55: goto -29 -> 26
    //   58: astore_1
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 68	textnow/o/a:j	Landroid/media/MediaPlayer;
    //   64: aload_1
    //   65: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   7	21	49	java/lang/Exception
    //   7	21	58	finally
  }

  public final void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    this.o = this.p;
    if (this.o == b.b)
      b();
    if (this.o == b.c)
      c();
    e();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.o.a
 * JD-Core Version:    0.6.2
 */