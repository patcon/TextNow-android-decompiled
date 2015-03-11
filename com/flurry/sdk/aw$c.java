package com.flurry.sdk;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class aw$c
  implements Closeable
{
  private final fh.a b;
  private final OutputStream c;
  private final GZIPOutputStream d;
  private final aw.a e;
  private boolean f;

  private aw$c(aw paramaw, fh.a parama, boolean paramBoolean)
  {
    if (parama == null)
      throw new IllegalArgumentException("Editor cannot be null");
    this.b = parama;
    this.c = this.b.a(0);
    if (this.b == null)
      throw new IOException("Editor outputstream is null");
    if (paramBoolean)
    {
      this.d = new GZIPOutputStream(this.c);
      if (this.d == null)
        throw new IOException("Gzip outputstream is null");
      this.e = new aw.a(this.d, null);
      return;
    }
    this.d = null;
    this.e = new aw.a(this.c, null);
  }

  public OutputStream a()
  {
    return this.e;
  }

  public void close()
  {
    boolean bool = true;
    if (this.f);
    do
    {
      return;
      this.f = bool;
      fe.a(this.e);
      fe.a(this.d);
      fe.a(this.c);
    }
    while (this.b == null);
    if (this.e == null);
    while (bool)
    {
      try
      {
        this.b.b();
        return;
      }
      catch (IOException localIOException)
      {
        eo.a(3, aw.e(), "Exception closing editor for cache: " + aw.a(this.a), localIOException);
        return;
      }
      bool = aw.a.a(this.e);
    }
    this.b.a();
  }

  protected void finalize()
  {
    super.finalize();
    close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.aw.c
 * JD-Core Version:    0.6.2
 */