package textnow.be;

import java.io.DataInputStream;

public final class bg extends ag
{
  public int a;
  public float b;
  public int c;
  public float d;
  public int e;
  public float f;
  public int g;
  public float h;
  public int i;
  public float j;
  public int k;
  public float l;
  public int m;
  public float n;
  public int o;
  public float p;
  public int q;
  public boolean r;

  protected bg(bf parambf)
  {
  }

  public final void a(y paramy)
  {
    super.a(paramy);
    try
    {
      this.a = paramy.a.readUnsignedByte();
      this.b = paramy.d();
      this.c = paramy.a.readUnsignedByte();
      this.d = paramy.d();
      this.e = paramy.a.readUnsignedByte();
      this.f = paramy.d();
      this.g = paramy.a.readUnsignedByte();
      this.h = paramy.d();
      this.i = paramy.a.readUnsignedByte();
      this.j = paramy.d();
      this.k = paramy.a.readUnsignedByte();
      this.l = paramy.d();
      this.m = paramy.a.readUnsignedByte();
      this.n = paramy.d();
      this.o = paramy.a.readUnsignedByte();
      this.p = paramy.d();
      this.q = paramy.a.readUnsignedByte();
      this.r = paramy.a.readBoolean();
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.be.bg
 * JD-Core Version:    0.6.2
 */