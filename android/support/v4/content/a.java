package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import textnow.e.n;

public abstract class a<D> extends j<D>
{
  volatile a<D>.b a;
  volatile a<D>.b b;
  long c;
  long d = -10000L;
  Handler e;

  public a(Context paramContext)
  {
    super(paramContext);
  }

  final void a(a<D>.b parama, D paramD)
  {
    a(paramD);
    if (this.b == parama)
    {
      rollbackContentChanged();
      this.d = SystemClock.uptimeMillis();
      this.b = null;
      b();
    }
  }

  public void a(D paramD)
  {
  }

  public final boolean a()
  {
    if (this.a != null)
    {
      if (this.b != null)
      {
        if (this.a.b)
        {
          this.a.b = false;
          this.e.removeCallbacks(this.a);
        }
        this.a = null;
      }
    }
    else
      return false;
    if (this.a.b)
    {
      this.a.b = false;
      this.e.removeCallbacks(this.a);
      this.a = null;
      return false;
    }
    boolean bool = this.a.a(false);
    if (bool)
      this.b = this.a;
    this.a = null;
    return bool;
  }

  final void b()
  {
    if ((this.b == null) && (this.a != null))
    {
      if (this.a.b)
      {
        this.a.b = false;
        this.e.removeCallbacks(this.a);
      }
      if ((this.c > 0L) && (SystemClock.uptimeMillis() < this.d + this.c))
      {
        this.a.b = true;
        this.e.postAtTime(this.a, this.d + this.c);
      }
    }
    else
    {
      return;
    }
    this.a.a(p.d, null);
  }

  public abstract D c();

  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    if (this.a != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTask=");
      paramPrintWriter.print(this.a);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.a.b);
    }
    if (this.b != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCancellingTask=");
      paramPrintWriter.print(this.b);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.b.b);
    }
    if (this.c != 0L)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mUpdateThrottle=");
      n.a(this.c, paramPrintWriter);
      paramPrintWriter.print(" mLastLoadCompleteTime=");
      n.a(this.d, SystemClock.uptimeMillis(), paramPrintWriter);
      paramPrintWriter.println();
    }
  }

  protected void onForceLoad()
  {
    super.onForceLoad();
    a();
    this.a = new b(this);
    b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.content.a
 * JD-Core Version:    0.6.2
 */