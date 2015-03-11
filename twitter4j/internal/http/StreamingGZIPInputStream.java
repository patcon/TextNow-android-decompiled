package twitter4j.internal.http;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;

final class StreamingGZIPInputStream extends GZIPInputStream
{
  private final InputStream wrapped;

  public StreamingGZIPInputStream(InputStream paramInputStream)
  {
    super(paramInputStream);
    this.wrapped = paramInputStream;
  }

  public final int available()
  {
    return this.wrapped.available();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.http.StreamingGZIPInputStream
 * JD-Core Version:    0.6.2
 */