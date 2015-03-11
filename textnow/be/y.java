package textnow.be;

import java.io.DataInputStream;
import java.io.InputStream;

public final class y
{
  DataInputStream a;

  public y(InputStream paramInputStream)
  {
    this.a = new DataInputStream(paramInputStream);
  }

  public final int a()
  {
    return Integer.reverseBytes(this.a.readInt());
  }

  public final int b()
  {
    return this.a.readUnsignedByte();
  }

  public final String c()
  {
    byte[] arrayOfByte = new byte[this.a.readUnsignedByte() | this.a.readUnsignedByte() << 8];
    this.a.readFully(arrayOfByte);
    return new String(arrayOfByte, "UTF8");
  }

  public final float d()
  {
    return Float.intBitsToFloat(Integer.reverseBytes(this.a.readInt()));
  }

  public final boolean e()
  {
    return this.a.readBoolean();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.be.y
 * JD-Core Version:    0.6.2
 */