package textnow.o;

import android.annotation.SuppressLint;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import textnow.q.g;

public final class c extends Dialog
  implements View.OnClickListener, i
{
  private int A = 0;
  PowerManager.WakeLock a;
  h b;
  boolean c = false;
  String d = null;
  long e = -1L;
  j f;
  Uri g;
  File h;
  String i;
  final Handler j = new Handler();
  Runnable k = new Runnable()
  {
    public final void run()
    {
      c.a(c.this);
    }
  };
  Button l;
  Button m;
  Button n;
  Button o;
  Button p;
  Button q;
  Button r;
  ProgressBar s;
  TextView t;
  TextView u;
  private BroadcastReceiver v = null;
  private e w = null;
  private d x = null;
  private File y = null;
  private boolean z = false;

  public c(Context paramContext, e parame)
  {
    super(paramContext);
    this.w = parame;
  }

  public c(Context paramContext, e parame, File paramFile, int paramInt)
  {
    super(paramContext);
    this.w = parame;
    if (paramInt <= 0)
      throw new RuntimeException("Audio file length must be > 0");
    this.y = paramFile;
    this.A = paramInt;
  }

  private void a()
  {
    if (this.b.d() == 0);
    while (true)
    {
      return;
      try
      {
        File localFile = this.b.e();
        long l1 = 1000L * this.b.d();
        Uri localUri = g.a(getContext(), localFile, l1);
        if (localUri != null)
        {
          this.g = localUri;
          this.h = this.b.e();
          return;
        }
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
      }
    }
  }

  private void b()
  {
    int i1 = this.b.a();
    int i2;
    int i3;
    label35: long l1;
    label49: String str2;
    if ((i1 == 1) || (i1 == 2))
    {
      i2 = 1;
      if (this.b.d() != 0)
        break label143;
      i3 = this.A;
      if (i2 == 0)
        break label154;
      l1 = this.b.b();
      String str1 = this.i;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Long.valueOf(l1 / 60L);
      arrayOfObject1[1] = Long.valueOf(l1 % 60L);
      str2 = String.format(str1, arrayOfObject1);
      if (i1 != 2)
        break label161;
      this.s.setProgress((int)(l1 * 100L / i3));
    }
    while (true)
    {
      if (i2 != 0)
        this.j.postDelayed(this.k, 1000L);
      return;
      i2 = 0;
      break;
      label143: i3 = this.b.d();
      break label35;
      label154: l1 = i3;
      break label49;
      label161: if (i1 == 1)
      {
        this.s.setProgress((int)(l1 * 100L / 30L));
        this.t.setText(str2);
        long l2 = this.f.b();
        if (l2 <= 0L)
        {
          this.c = true;
          switch (this.f.c())
          {
          default:
            this.d = null;
          case 2:
          case 1:
          }
          while (true)
          {
            this.b.i();
            break;
            this.d = getContext().getResources().getString(2131492995);
            continue;
            this.d = getContext().getResources().getString(2131492996);
          }
        }
        StringBuilder localStringBuilder = new StringBuilder().append("- ");
        String str3 = this.i;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf((int)l2 / 60);
        arrayOfObject2[1] = Integer.valueOf((int)l2 % 60);
        String str4 = String.format(str3, arrayOfObject2);
        this.u.setText(str4);
      }
    }
  }

  private void c()
  {
    switch (this.b.a())
    {
    default:
      return;
    case 0:
      if (this.z)
      {
        setTitle(2131492989);
        this.t.setText("0:00");
        TextView localTextView4 = this.u;
        String str4 = this.i;
        Object[] arrayOfObject4 = new Object[2];
        arrayOfObject4[0] = Integer.valueOf(0);
        arrayOfObject4[1] = Integer.valueOf(this.A);
        localTextView4.setText(String.format(str4, arrayOfObject4));
        this.s.setProgress(0);
        this.t.setVisibility(8);
        this.u.setVisibility(8);
        this.s.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setVisibility(0);
        this.n.setVisibility(8);
        this.o.setVisibility(0);
        this.p.setVisibility(8);
        this.q.setVisibility(8);
        this.r.setVisibility(0);
        this.l.requestFocus();
      }
      while (this.d != null)
      {
        setTitle(this.d);
        return;
        if (this.b.d() == 0)
        {
          setTitle(2131492990);
          this.t.setText("0:00");
          TextView localTextView3 = this.u;
          String str3 = this.i;
          Object[] arrayOfObject3 = new Object[2];
          arrayOfObject3[0] = Integer.valueOf(0);
          arrayOfObject3[1] = Integer.valueOf(30);
          localTextView3.setText(String.format(str3, arrayOfObject3));
          this.s.setProgress(0);
          this.t.setVisibility(0);
          this.u.setVisibility(0);
          this.s.setVisibility(0);
          this.l.setVisibility(0);
          this.m.setVisibility(0);
          this.n.setVisibility(8);
          this.o.setVisibility(8);
          this.p.setVisibility(8);
          this.q.setVisibility(8);
          this.r.setVisibility(8);
          this.l.requestFocus();
        }
        else
        {
          setTitle(2131492994);
          this.t.setText("0:00");
          TextView localTextView2 = this.u;
          String str2 = this.i;
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Integer.valueOf(this.b.d() / 60);
          arrayOfObject2[1] = Integer.valueOf(this.b.d() % 60);
          localTextView2.setText(String.format(str2, arrayOfObject2));
          this.s.setProgress(0);
          this.t.setVisibility(0);
          this.u.setVisibility(0);
          this.s.setVisibility(0);
          this.l.setVisibility(8);
          this.m.setVisibility(8);
          this.n.setVisibility(0);
          this.o.setVisibility(0);
          this.p.setVisibility(0);
          this.q.setVisibility(8);
          this.r.setVisibility(8);
          this.n.requestFocus();
        }
      }
    case 1:
      setTitle(2131492993);
      this.l.setVisibility(8);
      this.m.setVisibility(8);
      this.n.setVisibility(8);
      this.o.setVisibility(8);
      this.p.setVisibility(8);
      this.q.setVisibility(0);
      this.r.setVisibility(8);
      this.q.requestFocus();
      b();
      return;
    case 2:
    }
    setTitle(2131493293);
    this.t.setText("0:00");
    if (this.z);
    for (int i1 = this.A; ; i1 = this.b.d())
    {
      TextView localTextView1 = this.u;
      String str1 = this.i;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(i1 / 60);
      arrayOfObject1[1] = Integer.valueOf(i1 % 60);
      localTextView1.setText(String.format(str1, arrayOfObject1));
      this.l.setVisibility(8);
      this.m.setVisibility(8);
      this.n.setVisibility(8);
      this.o.setVisibility(8);
      this.p.setVisibility(8);
      this.q.setVisibility(0);
      this.r.setVisibility(8);
      this.q.requestFocus();
      b();
      return;
    }
  }

  @SuppressLint({"Wakelock"})
  public final void a(int paramInt)
  {
    if ((paramInt == 2) || (paramInt == 1))
    {
      this.c = false;
      this.d = null;
      this.a.acquire();
    }
    while (true)
    {
      c();
      return;
      if (this.a.isHeld())
        this.a.release();
    }
  }

  public final void a(d paramd)
  {
    this.x = paramd;
  }

  public final void b(int paramInt)
  {
    Resources localResources = getContext().getResources();
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = null;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      if (localObject != null)
        new AlertDialog.Builder(getContext()).setMessage((CharSequence)localObject).setPositiveButton(2131493002, null).setCancelable(false).show();
      return;
      localObject = localResources.getString(2131493042);
      continue;
      localObject = localResources.getString(2131493009);
    }
  }

  public final void onClick(View paramView)
  {
    if (!paramView.isEnabled());
    String str;
    File localFile;
    do
    {
      do
      {
        return;
        switch (paramView.getId())
        {
        case 2131165301:
        case 2131165302:
        default:
          return;
        case 2131165300:
          com.enflick.android.TextNow.ads.a.b("play_voicemail");
          if (!this.z)
            break label405;
          str = this.y.getAbsolutePath();
        case 2131165303:
        case 2131165308:
        case 2131165306:
        case 2131165305:
        case 2131165304:
        case 2131165307:
        }
      }
      while (TextUtils.isEmpty(str));
      localFile = new File(str);
      if (localFile.exists())
        break;
      new StringBuilder().append("File does not exist: ").append(localFile.getAbsolutePath()).toString();
      Toast.makeText(getContext(), 2131493402, 0).show();
      return;
      com.enflick.android.TextNow.ads.a.b("record_voicemail");
      this.f.a();
      if (!Environment.getExternalStorageState().equals("mounted"))
      {
        this.c = true;
        this.d = getContext().getResources().getString(2131492997);
        c();
        return;
      }
      if (!this.f.d())
      {
        this.c = true;
        this.d = getContext().getResources().getString(2131492995);
        c();
        return;
      }
      Intent localIntent1 = new Intent("com.android.music.musicservicecommand");
      localIntent1.putExtra("command", "pause");
      getContext().sendBroadcast(localIntent1);
      this.f.b(5900);
      this.f.a(30);
      this.b.a(getContext());
      this.z = false;
      return;
      dismiss();
      this.b.f();
    }
    while (this.x == null);
    this.x.a();
    return;
    if (!Build.MANUFACTURER.equalsIgnoreCase("amazon"))
    {
      Intent localIntent2 = new Intent("android.intent.action.VIEW");
      localIntent2.setDataAndType(Uri.fromFile(localFile), "audio/*");
      getContext().startActivity(localIntent2);
      return;
    }
    new a(getContext(), str).show();
    return;
    label405: this.b.h();
    return;
    this.b.i();
    return;
    this.b.i();
    a();
    if ((this.w != null) && (this.g != null))
    {
      new StringBuilder().append("Result Uri: ").append(this.g.getPath()).toString();
      this.w.a(this.g);
    }
    dismiss();
    return;
    com.enflick.android.TextNow.ads.a.b("discard_voicemail");
    this.b.f();
    if (this.y != null)
      this.z = true;
    c();
    return;
    this.z = false;
    c();
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903072);
    getWindow().setLayout(-1, -2);
    setCanceledOnTouchOutside(false);
    this.i = getContext().getResources().getString(2131493003);
    this.b = new h();
    this.b.a(this);
    this.f = new j(this.b);
    this.a = ((PowerManager)getContext().getSystemService("power")).newWakeLock(6, "TextNowAudioRecorder");
    this.l = ((Button)findViewById(2131165303));
    this.m = ((Button)findViewById(2131165308));
    this.n = ((Button)findViewById(2131165305));
    this.o = ((Button)findViewById(2131165300));
    this.p = ((Button)findViewById(2131165304));
    this.q = ((Button)findViewById(2131165306));
    this.r = ((Button)findViewById(2131165307));
    this.s = ((ProgressBar)findViewById(2131165298));
    this.t = ((TextView)findViewById(2131165297));
    this.u = ((TextView)findViewById(2131165299));
    this.l.setOnClickListener(this);
    this.m.setOnClickListener(this);
    this.n.setOnClickListener(this);
    this.o.setOnClickListener(this);
    this.p.setOnClickListener(this);
    this.q.setOnClickListener(this);
    this.r.setOnClickListener(this);
    if (this.v == null)
    {
      this.v = new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          String str = paramAnonymousIntent.getAction();
          if (str.equals("android.intent.action.MEDIA_EJECT"))
            c.this.b.f();
          while (!str.equals("android.intent.action.MEDIA_MOUNTED"))
            return;
          c.this.c = false;
          c.b(c.this);
        }
      };
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.MEDIA_EJECT");
      localIntentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
      localIntentFilter.addDataScheme("file");
      getContext().registerReceiver(this.v, localIntentFilter);
    }
    if (paramBundle != null)
    {
      Bundle localBundle = paramBundle.getBundle("recorder_state");
      if (localBundle != null)
      {
        this.b.b(localBundle);
        this.c = localBundle.getBoolean("sample_interrupted", false);
        this.e = localBundle.getLong("max_file_size", -1L);
      }
    }
    if (this.y != null)
      this.z = true;
    c();
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      switch (this.b.a())
      {
      default:
      case 0:
      case 2:
      case 1:
      }
      while (true)
      {
        return true;
        this.b.a(false);
        if (this.x != null)
          this.x.a();
        dismiss();
        continue;
        this.b.i();
        a();
        continue;
        this.b.g();
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public final Bundle onSaveInstanceState()
  {
    Bundle localBundle1 = super.onSaveInstanceState();
    if (this.b.d() == 0)
      return localBundle1;
    Bundle localBundle2 = new Bundle();
    this.b.a(localBundle2);
    localBundle2.putBoolean("sample_interrupted", this.c);
    localBundle2.putLong("max_file_size", this.e);
    localBundle1.putBundle("recorder_state", localBundle2);
    return localBundle1;
  }

  public final void onStop()
  {
    this.b.i();
    if (this.v != null)
    {
      getContext().unregisterReceiver(this.v);
      this.v = null;
    }
    super.onStop();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.o.c
 * JD-Core Version:    0.6.2
 */