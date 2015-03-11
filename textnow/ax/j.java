package textnow.ax;

import java.io.DataInputStream;

public final class j extends ag
{
  public float a;
  public int b;
  public float c;
  public int d;
  public float e;
  public int f;
  public float g;
  public int h;
  public int i;
  public boolean j;

  protected j(i parami)
  {
  }

  public final void a(y paramy)
  {
    super.a(paramy);
    try
    {
      this.a = paramy.d();
      this.b = paramy.a.readUnsignedByte();
      this.c = paramy.d();
      this.d = paramy.a.readUnsignedByte();
      this.e = paramy.d();
      this.f = paramy.a.readUnsignedByte();
      this.g = paramy.d();
      this.h = paramy.a.readUnsignedByte();
      this.i = ((int)paramy.d());
      this.j = paramy.a.readBoolean();
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.j
 * JD-Core Version:    0.6.2
 */