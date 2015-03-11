package textnow.ax;

import java.io.DataInputStream;

public class bl extends ag
{
  public int e;
  public float f;
  public int g;
  public float h;
  public int i;
  public int j;
  public float k;
  public int l;
  public float m;
  public int n;
  public float o;
  public int p;
  public float q;
  public int r;
  public boolean s;

  protected bl(bk parambk)
  {
  }

  public void a(y paramy)
  {
    super.a(paramy);
    try
    {
      this.e = paramy.a.readUnsignedByte();
      this.f = paramy.d();
      this.g = paramy.a.readUnsignedByte();
      this.h = paramy.d();
      this.i = paramy.a.readUnsignedByte();
      this.j = 0;
      this.k = paramy.d();
      this.l = paramy.a.readUnsignedByte();
      this.m = paramy.d();
      this.n = paramy.a.readUnsignedByte();
      this.o = paramy.d();
      this.p = paramy.a.readUnsignedByte();
      this.q = paramy.d();
      this.r = paramy.a.readUnsignedByte();
      this.s = paramy.a.readBoolean();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  protected final void b(y paramy)
  {
    super.a(paramy);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.bl
 * JD-Core Version:    0.6.2
 */