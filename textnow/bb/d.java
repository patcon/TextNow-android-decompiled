package textnow.bb;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class d
  implements l
{
  private final m a;

  public d()
  {
    this(new e());
  }

  private d(m paramm)
  {
    this.a = paramm;
  }

  public HttpURLConnection a(String paramString)
  {
    return (HttpURLConnection)new URL(paramString).openConnection();
  }

  public final void a(OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    paramOutputStream.write(paramArrayOfByte);
  }

  public final void a(HttpURLConnection paramHttpURLConnection, g paramg, String paramString)
  {
    paramHttpURLConnection.setRequestMethod(paramg.c());
    paramHttpURLConnection.setDoOutput(paramg.b());
    paramHttpURLConnection.setDoInput(paramg.a());
    if (paramString != null)
      paramHttpURLConnection.setRequestProperty("Content-Type", paramString);
    paramHttpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
  }

  public boolean a(i parami)
  {
    j localj = parami.a();
    if (this.a.a())
    {
      this.a.a("BasicRequestHandler.onError got");
      parami.printStackTrace();
    }
    return (localj != null) && (localj.a() > 0);
  }

  public final byte[] a(InputStream paramInputStream)
  {
    byte[] arrayOfByte = new byte[16384];
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    localByteArrayOutputStream.flush();
    return localByteArrayOutputStream.toByteArray();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bb.d
 * JD-Core Version:    0.6.2
 */