package textnow.bi;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

public abstract interface l
{
  public abstract HttpURLConnection a(String paramString);

  public abstract void a(OutputStream paramOutputStream, byte[] paramArrayOfByte);

  public abstract void a(HttpURLConnection paramHttpURLConnection, g paramg, String paramString);

  public abstract boolean a(i parami);

  public abstract byte[] a(InputStream paramInputStream);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bi.l
 * JD-Core Version:    0.6.2
 */