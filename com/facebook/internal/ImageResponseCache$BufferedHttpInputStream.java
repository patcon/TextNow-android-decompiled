package com.facebook.internal;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;

class ImageResponseCache$BufferedHttpInputStream extends BufferedInputStream
{
  HttpURLConnection connection;

  ImageResponseCache$BufferedHttpInputStream(InputStream paramInputStream, HttpURLConnection paramHttpURLConnection)
  {
    super(paramInputStream, 8192);
    this.connection = paramHttpURLConnection;
  }

  public void close()
  {
    super.close();
    Utility.disconnectQuietly(this.connection);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.ImageResponseCache.BufferedHttpInputStream
 * JD-Core Version:    0.6.2
 */