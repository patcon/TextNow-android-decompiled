package com.facebook.internal;

import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

final class FileLruCache$StreamHeader
{
  private static final int HEADER_VERSION;

  static JSONObject readHeader(InputStream paramInputStream)
  {
    int i = 0;
    if (paramInputStream.read() != 0)
      return null;
    int j = 0;
    int k = 0;
    while (j < 3)
    {
      int n = paramInputStream.read();
      if (n == -1)
      {
        Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: stream.read returned -1 while reading header size");
        return null;
      }
      k = (k << 8) + (n & 0xFF);
      j++;
    }
    byte[] arrayOfByte = new byte[k];
    while (i < arrayOfByte.length)
    {
      int m = paramInputStream.read(arrayOfByte, i, arrayOfByte.length - i);
      if (m <= 0)
      {
        Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: stream.read stopped at " + Integer.valueOf(i) + " when expected " + arrayOfByte.length);
        return null;
      }
      i += m;
    }
    JSONTokener localJSONTokener = new JSONTokener(new String(arrayOfByte));
    try
    {
      Object localObject = localJSONTokener.nextValue();
      if (!(localObject instanceof JSONObject))
      {
        Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: expected JSONObject, got " + localObject.getClass().getCanonicalName());
        return null;
      }
      JSONObject localJSONObject = (JSONObject)localObject;
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      throw new IOException(localJSONException.getMessage());
    }
  }

  static void writeHeader(OutputStream paramOutputStream, JSONObject paramJSONObject)
  {
    byte[] arrayOfByte = paramJSONObject.toString().getBytes();
    paramOutputStream.write(0);
    paramOutputStream.write(0xFF & arrayOfByte.length >> 16);
    paramOutputStream.write(0xFF & arrayOfByte.length >> 8);
    paramOutputStream.write(0xFF & arrayOfByte.length >> 0);
    paramOutputStream.write(arrayOfByte);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FileLruCache.StreamHeader
 * JD-Core Version:    0.6.2
 */