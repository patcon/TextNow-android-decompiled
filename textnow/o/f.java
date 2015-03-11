package textnow.o;

import android.media.AudioRecord;
import android.media.AudioRecord.OnRecordPositionUpdateListener;
import android.media.MediaRecorder;
import android.os.Handler;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class f
{
  private static final int[] a = { 8000 };
  private boolean b;
  private AudioRecord c = null;
  private MediaRecorder d = null;
  private int e = 0;
  private String f = null;
  private g g;
  private RandomAccessFile h;
  private short i;
  private int j;
  private short k;
  private int l;
  private int m;
  private int n;
  private int o;
  private byte[] p;
  private int q;
  private AudioRecord.OnRecordPositionUpdateListener r = new AudioRecord.OnRecordPositionUpdateListener()
  {
    public final void onMarkerReached(AudioRecord paramAnonymousAudioRecord)
    {
    }

    public final void onPeriodicNotification(AudioRecord paramAnonymousAudioRecord)
    {
      f.b(f.this).read(f.a(f.this), 0, f.a(f.this).length);
      while (true)
      {
        int j;
        try
        {
          f.c(f.this).write(f.a(f.this));
          f.a(f.this, f.a(f.this).length);
          int i = f.d(f.this);
          j = 0;
          if (i == 16)
          {
            if (j < f.a(f.this).length / 2)
            {
              int k = f.a(f.this, f.a(f.this)[(j * 2)], f.a(f.this)[(1 + j * 2)]);
              if (k <= f.e(f.this))
                break label219;
              f.b(f.this, k);
              break label219;
            }
          }
          else if (j < f.a(f.this).length)
          {
            if (f.a(f.this)[j] > f.e(f.this))
              f.b(f.this, f.a(f.this)[j]);
            j++;
            continue;
          }
        }
        catch (IOException localIOException)
        {
          f.class.getName();
        }
        return;
        label219: j++;
      }
    }
  };

  private f(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      this.b = paramBoolean;
      if (!this.b)
        break label301;
      this.k = 16;
      this.i = 1;
      this.m = 1;
      this.j = paramInt2;
      this.n = 2;
      this.o = (paramInt2 * 120 / 1000);
      this.l = (2 * this.o * this.k * this.i / 8);
      if (this.l < AudioRecord.getMinBufferSize(paramInt2, 16, 2))
      {
        this.l = AudioRecord.getMinBufferSize(paramInt2, 16, 2);
        this.o = (this.l / (2 * this.k * this.i / 8));
        f.class.getName();
        new StringBuilder().append("Increasing buffer size to ").append(Integer.toString(this.l)).toString();
      }
      this.c = new AudioRecord(1, paramInt2, 16, 2, this.l);
      if (this.c.getState() == 1)
        break label260;
      throw new Exception("AudioRecord initialization failed");
    }
    catch (Exception localException)
    {
      if (localException.getMessage() == null)
        break label339;
    }
    f.class.getName();
    localException.getMessage();
    while (true)
    {
      this.g = g.d;
      return;
      label260: this.c.setRecordPositionUpdateListener(this.r);
      this.c.setPositionNotificationPeriod(this.o);
      while (true)
      {
        this.e = 0;
        this.f = null;
        this.g = g.a;
        return;
        label301: this.d = new MediaRecorder();
        this.d.setAudioSource(1);
        this.d.setOutputFormat(1);
        this.d.setAudioEncoder(1);
      }
      label339: f.class.getName();
    }
  }

  public static f a(Boolean paramBoolean)
  {
    if (paramBoolean.booleanValue())
      return new f(false, 1, a[3], 16, 2);
    int i2;
    label89: label95: for (int i1 = 0; ; i1 = i2)
    {
      f localf = new f(true, 1, a[i1], 16, 2);
      i2 = i1 + 1;
      int i3;
      if (i2 < a.length)
      {
        i3 = 1;
        if (localf.g == g.a)
          break label89;
      }
      for (int i4 = 1; ; i4 = 0)
      {
        if ((i3 & i4) != 0)
          break label95;
        return localf;
        i3 = 0;
        break;
      }
    }
  }

  public final void a()
  {
    int i1 = 1;
    try
    {
      if (this.g == g.a)
        if (this.b)
        {
          if (this.c.getState() != i1)
            break label353;
          i2 = i1;
          if (this.f == null)
            break label359;
          if ((i1 & i2) != 0)
          {
            this.h = new RandomAccessFile(this.f, "rw");
            this.h.setLength(0L);
            this.h.writeBytes("RIFF");
            this.h.writeInt(0);
            this.h.writeBytes("WAVE");
            this.h.writeBytes("fmt ");
            this.h.writeInt(Integer.reverseBytes(16));
            this.h.writeShort(Short.reverseBytes((short)1));
            this.h.writeShort(Short.reverseBytes(this.i));
            this.h.writeInt(Integer.reverseBytes(this.j));
            this.h.writeInt(Integer.reverseBytes(this.j * this.k * this.i / 8));
            this.h.writeShort(Short.reverseBytes((short)(this.i * this.k / 8)));
            this.h.writeShort(Short.reverseBytes(this.k));
            this.h.writeBytes("data");
            this.h.writeInt(0);
            this.p = new byte[this.o * this.k / 8 * this.i];
            this.g = g.b;
            return;
          }
          f.class.getName();
          this.g = g.d;
          return;
        }
    }
    catch (Exception localException)
    {
      while (true)
      {
        if (localException.getMessage() != null)
        {
          f.class.getName();
          localException.getMessage();
        }
        while (true)
        {
          this.g = g.d;
          return;
          this.d.prepare();
          this.g = g.b;
          return;
          f.class.getName();
          b();
          this.g = g.d;
          return;
          f.class.getName();
        }
        label353: int i2 = 0;
        continue;
        label359: i1 = 0;
      }
    }
  }

  public final void a(String paramString)
  {
    try
    {
      if (this.g == g.a)
      {
        this.f = paramString;
        if (!this.b)
          this.d.setOutputFile(this.f);
      }
      return;
    }
    catch (Exception localException)
    {
      if (localException.getMessage() == null)
        break label61;
    }
    f.class.getName();
    localException.getMessage();
    while (true)
    {
      this.g = g.d;
      return;
      label61: f.class.getName();
    }
  }

  public final void b()
  {
    if (this.g == g.c)
    {
      e();
      if (!this.b)
        break label97;
      if (this.c != null)
        this.c.release();
    }
    label97: 
    while (this.d == null)
      while (true)
      {
        return;
        int i1;
        if (this.g == g.b)
        {
          i1 = 1;
          if ((i1 & this.b) == 0)
            break;
        }
        try
        {
          this.h.close();
          new File(this.f).delete();
          break;
          i1 = 0;
        }
        catch (IOException localIOException)
        {
          while (true)
            f.class.getName();
        }
      }
    this.d.release();
  }

  public final void c()
  {
    try
    {
      if (this.g != g.d)
      {
        b();
        this.f = null;
        this.e = 0;
        if (this.b)
          this.c = new AudioRecord(this.m, this.j, 1 + this.i, this.n, this.l);
        while (true)
        {
          this.g = g.a;
          return;
          this.d = new MediaRecorder();
          this.d.setAudioSource(1);
          this.d.setOutputFormat(1);
          this.d.setAudioEncoder(1);
        }
      }
    }
    catch (Exception localException)
    {
      f.class.getName();
      localException.getMessage();
      this.g = g.d;
    }
  }

  public final void d()
  {
    if (this.g == g.b)
    {
      if (this.b)
      {
        this.q = 0;
        this.c.startRecording();
        new Handler().postDelayed(new Runnable()
        {
          public final void run()
          {
            f.b(f.this).read(f.a(f.this), 0, f.a(f.this).length);
          }
        }
        , 1500L);
      }
      while (true)
      {
        this.g = g.c;
        return;
        this.d.start();
      }
    }
    f.class.getName();
    this.g = g.d;
  }

  public final void e()
  {
    if (this.g == g.c)
    {
      if (this.b)
        this.c.stop();
      while (true)
      {
        try
        {
          this.h.seek(4L);
          this.h.writeInt(Integer.reverseBytes(36 + this.q));
          this.h.seek(40L);
          this.h.writeInt(Integer.reverseBytes(this.q));
          this.h.close();
          this.g = g.e;
          return;
        }
        catch (IOException localIOException)
        {
          f.class.getName();
          this.g = g.d;
          continue;
        }
        this.d.stop();
      }
    }
    f.class.getName();
    this.g = g.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.o.f
 * JD-Core Version:    0.6.2
 */