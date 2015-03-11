package com.flurry.sdk;

import android.text.TextUtils;
import java.io.IOException;
import java.io.OutputStream;

public class ax extends as
{
  protected final aw a;
  protected final String b;
  protected aw.c c;

  public ax(aw paramaw, String paramString)
  {
    this.a = paramaw;
    this.b = paramString;
  }

  protected OutputStream f()
  {
    if (this.c != null)
      return this.c.a();
    if (this.a == null)
      throw new IOException("No cache specified");
    if (TextUtils.isEmpty(this.b))
      throw new IOException("No cache key specified");
    this.c = this.a.b(this.b);
    if (this.c == null)
      throw new IOException("Could not open writer for key: " + this.b);
    return this.c.a();
  }

  protected void g()
  {
    fe.a(this.c);
    this.c = null;
  }

  protected void h()
  {
    if (this.a == null);
    while (TextUtils.isEmpty(this.b))
      return;
    this.a.c(this.b);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ax
 * JD-Core Version:    0.6.2
 */