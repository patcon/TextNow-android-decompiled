package com.flurry.sdk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class fh$a
{
  private final fh.b b;
  private final boolean[] c;
  private boolean d;
  private boolean e;

  private fh$a(fh paramfh, fh.b paramb)
  {
    this.b = paramb;
    if (fh.b.d(paramb));
    for (boolean[] arrayOfBoolean = null; ; arrayOfBoolean = new boolean[fh.e(paramfh)])
    {
      this.c = arrayOfBoolean;
      return;
    }
  }

  public final OutputStream a(int paramInt)
  {
    synchronized (this.a)
    {
      if (fh.b.a(this.b) != this)
        throw new IllegalStateException();
    }
    if (!fh.b.d(this.b))
      this.c[paramInt] = true;
    File localFile = this.b.b(paramInt);
    try
    {
      FileOutputStream localFileOutputStream1 = new FileOutputStream(localFile);
      localObject2 = localFileOutputStream1;
      fh.a.a locala = new fh.a.a(this, (OutputStream)localObject2, null);
      return locala;
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      while (true)
      {
        Object localObject2;
        fh.f(this.a).mkdirs();
        try
        {
          FileOutputStream localFileOutputStream2 = new FileOutputStream(localFile);
          localObject2 = localFileOutputStream2;
        }
        catch (FileNotFoundException localFileNotFoundException2)
        {
          OutputStream localOutputStream = fh.b();
          return localOutputStream;
        }
      }
    }
  }

  public final void a()
  {
    if (this.d)
    {
      fh.a(this.a, this, false);
      this.a.c(fh.b.c(this.b));
    }
    while (true)
    {
      this.e = true;
      return;
      fh.a(this.a, this, true);
    }
  }

  public final void b()
  {
    fh.a(this.a, this, false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fh.a
 * JD-Core Version:    0.6.2
 */