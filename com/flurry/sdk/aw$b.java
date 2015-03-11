package com.flurry.sdk;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class aw$b
  implements Closeable
{
  private final fh.c b;
  private final InputStream c;
  private final GZIPInputStream d;
  private final BufferedInputStream e;
  private boolean f;

  private aw$b(aw paramaw, fh.c paramc, boolean paramBoolean)
  {
    if (paramc == null)
      throw new IllegalArgumentException("Snapshot cannot be null");
    this.b = paramc;
    this.c = this.b.a(0);
    if (this.c == null)
      throw new IOException("Snapshot inputstream is null");
    if (paramBoolean)
    {
      this.d = new GZIPInputStream(this.c);
      if (this.d == null)
        throw new IOException("Gzip inputstream is null");
      this.e = new BufferedInputStream(this.d);
      return;
    }
    this.d = null;
    this.e = new BufferedInputStream(this.c);
  }

  public InputStream a()
  {
    return this.e;
  }

  public void close()
  {
    if (this.f)
      return;
    this.f = true;
    fe.a(this.e);
    fe.a(this.d);
    fe.a(this.c);
    fe.a(this.b);
  }

  protected void finalize()
  {
    super.finalize();
    close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.aw.b
 * JD-Core Version:    0.6.2
 */