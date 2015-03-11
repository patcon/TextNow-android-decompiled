package textnow.q;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class n
{
  public static void a(InputStream paramInputStream)
  {
    if (paramInputStream != null);
    try
    {
      paramInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public static void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    a(paramInputStream, paramOutputStream, new byte[16384]);
  }

  public static void a(InputStream paramInputStream, OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    while (true)
    {
      int i = paramInputStream.read(paramArrayOfByte);
      if (i == -1)
        break;
      paramOutputStream.write(paramArrayOfByte, 0, i);
    }
  }

  public static void a(OutputStream paramOutputStream)
  {
    if (paramOutputStream != null);
    try
    {
      paramOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.n
 * JD-Core Version:    0.6.2
 */