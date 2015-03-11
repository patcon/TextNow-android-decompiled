package textnow.t;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaRecorder;
import android.media.MediaRecorder.OnInfoListener;
import android.os.Bundle;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class h
  implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaRecorder.OnInfoListener
{
  int a = 0;
  i b = null;
  long c = 0L;
  int d = 0;
  File e = null;
  f f = null;
  MediaPlayer g = null;

  private void a(int paramInt)
  {
    if (paramInt == this.a)
      return;
    this.a = paramInt;
    b(this.a);
  }

  private void b(int paramInt)
  {
    if (this.b != null)
      this.b.a(paramInt);
  }

  private void c(int paramInt)
  {
    if (this.b != null)
      this.b.b(paramInt);
  }

  public final int a()
  {
    return this.a;
  }

  public final void a(Context paramContext)
  {
    i();
    if (this.e == null)
    {
      String str1 = Environment.getExternalStorageDirectory() + "/TextNow/TextNow VM";
      File localFile = new File(str1);
      if ((!localFile.exists()) && (!localFile.mkdirs()))
      {
        c(1);
        return;
      }
      String str2 = str1 + "/" + new SimpleDateFormat(paramContext.getString(2131296795)).format(Long.valueOf(new Date().getTime())) + ".wav";
      new StringBuilder().append("Will record to: ").append(str2).toString();
      this.e = new File(str2);
      if (this.e == null)
      {
        c(1);
        return;
      }
    }
    this.f = f.a(Boolean.valueOf(false));
    this.f.a(this.e.getAbsolutePath());
    this.f.a();
    try
    {
      this.f.d();
      this.c = System.currentTimeMillis();
      a(1);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      if (((AudioManager)paramContext.getSystemService("audio")).getMode() != 2)
        break label273;
    }
    int i = 1;
    if (i != 0)
      c(3);
    while (true)
    {
      this.f.c();
      this.f.b();
      this.f = null;
      return;
      label273: i = 0;
      break;
      c(2);
    }
  }

  public final void a(Bundle paramBundle)
  {
    paramBundle.putString("sample_path", this.e.getAbsolutePath());
    paramBundle.putInt("sample_length", this.d);
  }

  public final void a(i parami)
  {
    this.b = parami;
  }

  public final void a(boolean paramBoolean)
  {
    i();
    if (this.e != null)
      this.e.delete();
    this.e = null;
    this.d = 0;
    if (paramBoolean)
      b(0);
  }

  public final int b()
  {
    if ((this.a == 1) || (this.a == 2))
      return (int)((System.currentTimeMillis() - this.c) / 1000L);
    return 0;
  }

  public final void b(Bundle paramBundle)
  {
    String str = paramBundle.getString("sample_path");
    if (str == null);
    int i;
    File localFile;
    do
    {
      do
      {
        return;
        i = paramBundle.getInt("sample_length", -1);
      }
      while (i == -1);
      localFile = new File(str);
    }
    while ((!localFile.exists()) || ((this.e != null) && (this.e.getAbsolutePath().compareTo(localFile.getAbsolutePath()) == 0)));
    a(true);
    this.e = localFile;
    this.d = i;
    b(0);
  }

  public final int c()
  {
    if (this.a == 1)
      return 30 - (int)((System.currentTimeMillis() - this.c) / 1000L);
    return 30;
  }

  public final int d()
  {
    return this.d;
  }

  public final File e()
  {
    return this.e;
  }

  public final void f()
  {
    a(true);
  }

  public final void g()
  {
    i();
    this.d = 0;
    b(0);
  }

  public final void h()
  {
    File localFile = this.e;
    i();
    this.g = new MediaPlayer();
    try
    {
      this.g.setDataSource(localFile.getAbsolutePath());
      this.g.setOnCompletionListener(this);
      this.g.setOnErrorListener(this);
      this.g.prepare();
      this.g.start();
      this.c = System.currentTimeMillis();
      a(2);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      c(2);
      this.g = null;
      return;
    }
    catch (IOException localIOException)
    {
      c(1);
      this.g = null;
    }
  }

  public final void i()
  {
    if (this.f != null)
    {
      this.f.e();
      this.f.b();
      this.f = null;
      this.d = ((int)((System.currentTimeMillis() - this.c) / 1000L));
      a(0);
    }
    if (this.g != null)
    {
      this.g.stop();
      this.g.release();
      this.g = null;
      a(0);
    }
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    i();
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    i();
    c(1);
    return true;
  }

  public final void onInfo(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2)
  {
    if (paramInt1 == 800)
      i();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.t.h
 * JD-Core Version:    0.6.2
 */