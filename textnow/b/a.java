package textnow.b;

import java.util.Timer;

public abstract class a
{
  private Timer a;
  private long b = 1000L;

  public abstract void a();

  public final void b()
  {
    if (this.a != null)
    {
      this.a.cancel();
      this.a = null;
    }
    this.a = new Timer();
    this.a.schedule(new b(this, (byte)0), this.b);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.b.a
 * JD-Core Version:    0.6.2
 */