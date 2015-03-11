package textnow.be;

import java.io.DataInputStream;

final class bj extends ag
{
  public float a;
  public int b;
  public float c;
  public int d;
  public float e;
  public int f;
  public float g;
  public int h;
  public float i;
  public int j;
  public float k;
  public int l;
  public boolean m;
  public int n;

  private bj(bi parambi)
  {
  }

  public final void a(y paramy)
  {
    super.a(paramy);
    try
    {
      this.n = paramy.a.readUnsignedByte();
      this.i = paramy.d();
      this.j = paramy.a.readUnsignedByte();
      this.k = paramy.d();
      this.l = paramy.a.readUnsignedByte();
      paramy.d();
      paramy.a.readUnsignedByte();
      this.a = paramy.d();
      this.b = paramy.a.readUnsignedByte();
      this.c = paramy.d();
      this.d = paramy.a.readUnsignedByte();
      this.e = paramy.d();
      this.f = paramy.a.readUnsignedByte();
      this.g = paramy.d();
      this.h = paramy.a.readUnsignedByte();
      this.m = paramy.a.readBoolean();
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.be.bj
 * JD-Core Version:    0.6.2
 */