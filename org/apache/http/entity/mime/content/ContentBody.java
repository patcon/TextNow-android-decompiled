package org.apache.http.entity.mime.content;

import java.io.OutputStream;

public abstract interface ContentBody extends ContentDescriptor
{
  public abstract String getFilename();

  public abstract void writeTo(OutputStream paramOutputStream);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     org.apache.http.entity.mime.content.ContentBody
 * JD-Core Version:    0.6.2
 */