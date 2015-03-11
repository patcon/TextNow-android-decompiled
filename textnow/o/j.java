package textnow.o;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;

final class j
{
  private int a = 0;
  private File b = Environment.getExternalStorageDirectory();
  private int c = -1;
  private File d;
  private long e;
  private int f;
  private long g;
  private long h;
  private long i;
  private long j;
  private h k;

  public j(h paramh)
  {
    this.k = paramh;
  }

  public final void a()
  {
    this.a = 0;
    this.g = -1L;
    this.i = -1L;
  }

  public final void a(int paramInt)
  {
    this.c = 30;
  }

  public final long b()
  {
    int m = 2;
    StatFs localStatFs = new StatFs(this.b.getAbsolutePath());
    long l1 = localStatFs.getAvailableBlocks();
    long l2 = localStatFs.getBlockSize();
    long l3 = System.currentTimeMillis();
    if ((this.g == -1L) || (l1 != this.h))
    {
      this.g = l3;
      this.h = l1;
    }
    long l4 = l2 * this.h / this.f - (l3 - this.g) / 1000L;
    if ((this.d == null) && (this.c < 0))
    {
      this.a = m;
      return l4;
    }
    if (this.d != null)
    {
      this.d = new File(this.d.getAbsolutePath());
      long l5 = this.d.length();
      if ((this.i == -1L) || (l5 != this.j))
      {
        this.i = l3;
        this.j = l5;
      }
      long l6 = (this.e - l5) / this.f - (l3 - this.i) / 1000L - 1L;
      if (l4 < l6);
      while (true)
      {
        this.a = m;
        return Math.min(l4, l6);
        m = 1;
      }
    }
    this.a = 3;
    return Math.min(l4, this.k.c());
  }

  public final void b(int paramInt)
  {
    this.f = 737;
  }

  public final int c()
  {
    return this.a;
  }

  public final boolean d()
  {
    return new StatFs(this.b.getAbsolutePath()).getAvailableBlocks() > 1;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.o.j
 * JD-Core Version:    0.6.2
 */