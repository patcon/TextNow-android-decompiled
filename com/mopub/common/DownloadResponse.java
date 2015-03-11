package com.mopub.common;

import com.mopub.common.util.ResponseHeader;
import org.apache.http.Header;

public class DownloadResponse
{
  private byte[] mBytes;
  private final long mContentLength;
  private final Header[] mHeaders;
  private final int mStatusCode;

  // ERROR //
  public DownloadResponse(org.apache.http.HttpResponse paramHttpResponse)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 17	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: iconst_0
    //   6: newarray byte
    //   8: putfield 19	com/mopub/common/DownloadResponse:mBytes	[B
    //   11: new 21	java/io/ByteArrayOutputStream
    //   14: dup
    //   15: invokespecial 22	java/io/ByteArrayOutputStream:<init>	()V
    //   18: astore_2
    //   19: new 24	java/io/BufferedInputStream
    //   22: dup
    //   23: aload_1
    //   24: invokeinterface 30 1 0
    //   29: invokeinterface 36 1 0
    //   34: invokespecial 39	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   37: astore_3
    //   38: aload_3
    //   39: aload_2
    //   40: invokestatic 45	com/mopub/common/util/Streams:copyContent	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   43: aload_0
    //   44: aload_2
    //   45: invokevirtual 49	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   48: putfield 19	com/mopub/common/DownloadResponse:mBytes	[B
    //   51: aload_3
    //   52: invokestatic 53	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   55: aload_2
    //   56: invokestatic 53	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   59: aload_0
    //   60: aload_1
    //   61: invokeinterface 57 1 0
    //   66: invokeinterface 63 1 0
    //   71: putfield 65	com/mopub/common/DownloadResponse:mStatusCode	I
    //   74: aload_0
    //   75: aload_0
    //   76: getfield 19	com/mopub/common/DownloadResponse:mBytes	[B
    //   79: arraylength
    //   80: i2l
    //   81: putfield 67	com/mopub/common/DownloadResponse:mContentLength	J
    //   84: aload_0
    //   85: aload_1
    //   86: invokeinterface 71 1 0
    //   91: putfield 73	com/mopub/common/DownloadResponse:mHeaders	[Lorg/apache/http/Header;
    //   94: return
    //   95: astore 4
    //   97: aconst_null
    //   98: astore_3
    //   99: aload_3
    //   100: invokestatic 53	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   103: aload_2
    //   104: invokestatic 53	com/mopub/common/util/Streams:closeStream	(Ljava/io/Closeable;)V
    //   107: aload 4
    //   109: athrow
    //   110: astore 4
    //   112: goto -13 -> 99
    //
    // Exception table:
    //   from	to	target	type
    //   19	38	95	finally
    //   38	51	110	finally
  }

  public byte[] getByteArray()
  {
    return this.mBytes;
  }

  public long getContentLength()
  {
    return this.mContentLength;
  }

  public String getFirstHeader(ResponseHeader paramResponseHeader)
  {
    for (Header localHeader : this.mHeaders)
      if (localHeader.getName().equals(paramResponseHeader.getKey()))
        return localHeader.getValue();
    return null;
  }

  public int getStatusCode()
  {
    return this.mStatusCode;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.DownloadResponse
 * JD-Core Version:    0.6.2
 */