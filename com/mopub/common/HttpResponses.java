package com.mopub.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class HttpResponses
{
  public static Bitmap asBitmap(DownloadResponse paramDownloadResponse)
  {
    if (paramDownloadResponse == null)
      return null;
    byte[] arrayOfByte = paramDownloadResponse.getByteArray();
    return BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
  }

  public static JSONObject asJsonObject(DownloadResponse paramDownloadResponse)
  {
    if (paramDownloadResponse == null)
      return null;
    try
    {
      JSONObject localJSONObject = new JSONObject(new JSONTokener(asResponseString(paramDownloadResponse)));
      return localJSONObject;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String asResponseString(DownloadResponse paramDownloadResponse)
  {
    if (paramDownloadResponse == null)
      return null;
    try
    {
      String str = new String(paramDownloadResponse.getByteArray(), "UTF-8");
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.HttpResponses
 * JD-Core Version:    0.6.2
 */