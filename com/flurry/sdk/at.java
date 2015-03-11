package com.flurry.sdk;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class at extends as
{
  private final File a;
  private OutputStream b;

  public at(File paramFile)
  {
    this.a = paramFile;
  }

  protected OutputStream f()
  {
    if (this.b != null)
      return this.b;
    if (this.a == null)
      throw new IOException("No file specified");
    this.b = new FileOutputStream(this.a);
    return this.b;
  }

  protected void g()
  {
    fe.a(this.b);
    this.b = null;
  }

  protected void h()
  {
    if (this.a == null)
      return;
    this.a.delete();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.at
 * JD-Core Version:    0.6.2
 */