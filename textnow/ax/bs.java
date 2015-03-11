package textnow.ax;

import java.io.DataInputStream;

public final class bs extends ag
{
  public float a;
  public int b;
  public float c;
  public int d;
  public float e;
  public int f;
  public float g;
  public int h;
  public boolean i;

  protected bs(br parambr)
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
      this.i = paramy.a.readBoolean();
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.bs
 * JD-Core Version:    0.6.2
 */