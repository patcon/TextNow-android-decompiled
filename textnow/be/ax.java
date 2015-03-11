package textnow.be;

import java.io.DataInputStream;

final class ax extends bl
{
  public int a;
  public int b;

  private ax(aw paramaw)
  {
    super(paramaw);
  }

  public final void a(y paramy)
  {
    b(paramy);
    try
    {
      this.e = paramy.a.readUnsignedByte();
      this.a = paramy.a.readUnsignedByte();
      this.b = paramy.a.readUnsignedByte();
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.be.ax
 * JD-Core Version:    0.6.2
 */