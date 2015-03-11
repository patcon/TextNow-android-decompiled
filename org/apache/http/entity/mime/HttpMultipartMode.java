package org.apache.http.entity.mime;

public enum HttpMultipartMode
{
  static
  {
    BROWSER_COMPATIBLE = new HttpMultipartMode("BROWSER_COMPATIBLE", 1);
    HttpMultipartMode[] arrayOfHttpMultipartMode = new HttpMultipartMode[2];
    arrayOfHttpMultipartMode[0] = STRICT;
    arrayOfHttpMultipartMode[1] = BROWSER_COMPATIBLE;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     org.apache.http.entity.mime.HttpMultipartMode
 * JD-Core Version:    0.6.2
 */