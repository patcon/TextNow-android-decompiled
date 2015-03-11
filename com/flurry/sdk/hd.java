package com.flurry.sdk;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.ref.SoftReference;

public class hd
{
  static final int a = hj.a.a();
  static final int b = hf.a.a();
  protected static final ThreadLocal<SoftReference<si>> c = new ThreadLocal();
  protected sb d = sb.a();
  protected sa e = sa.a();
  protected hn f;
  protected int g = a;
  protected int h = b;
  protected id i;
  protected if j;
  protected ik k;

  public hd()
  {
    this(null);
  }

  public hd(hn paramhn)
  {
    this.f = paramhn;
  }

  public hd a(hj.a parama)
  {
    this.g |= parama.c();
    return this;
  }

  public hd a(hn paramhn)
  {
    this.f = paramhn;
    return this;
  }

  public hf a(OutputStream paramOutputStream, hc paramhc)
  {
    ie localie = a(paramOutputStream, false);
    localie.a(paramhc);
    if (paramhc == hc.a)
    {
      if (this.k != null)
        paramOutputStream = this.k.a(localie, paramOutputStream);
      return a(paramOutputStream, localie);
    }
    Writer localWriter = a(paramOutputStream, paramhc, localie);
    if (this.k != null)
      localWriter = this.k.a(localie, localWriter);
    return a(localWriter, localie);
  }

  protected hf a(OutputStream paramOutputStream, ie paramie)
  {
    hz localhz = new hz(paramie, this.h, this.f, paramOutputStream);
    if (this.i != null)
      localhz.a(this.i);
    return localhz;
  }

  public hf a(Writer paramWriter)
  {
    ie localie = a(paramWriter, false);
    if (this.k != null)
      paramWriter = this.k.a(localie, paramWriter);
    return a(paramWriter, localie);
  }

  protected hf a(Writer paramWriter, ie paramie)
  {
    ib localib = new ib(paramie, this.h, this.f, paramWriter);
    if (this.i != null)
      localib.a(this.i);
    return localib;
  }

  public hj a(InputStream paramInputStream)
  {
    ie localie = a(paramInputStream, false);
    if (this.j != null)
      paramInputStream = this.j.a(localie, paramInputStream);
    return a(paramInputStream, localie);
  }

  protected hj a(InputStream paramInputStream, ie paramie)
  {
    return new hr(paramie, paramInputStream).a(this.g, this.f, this.e, this.d);
  }

  public hj a(Reader paramReader)
  {
    ie localie = a(paramReader, false);
    if (this.j != null)
      paramReader = this.j.a(localie, paramReader);
    return a(paramReader, localie);
  }

  protected hj a(Reader paramReader, ie paramie)
  {
    return new hy(paramie, this.g, paramReader, this.f, this.d.a(b(hj.a.j), b(hj.a.i)));
  }

  public hn a()
  {
    return this.f;
  }

  protected ie a(Object paramObject, boolean paramBoolean)
  {
    return new ie(b(), paramObject, paramBoolean);
  }

  protected Writer a(OutputStream paramOutputStream, hc paramhc, ie paramie)
  {
    if (paramhc == hc.a)
      return new io(paramie, paramOutputStream);
    return new OutputStreamWriter(paramOutputStream, paramhc.a());
  }

  public si b()
  {
    SoftReference localSoftReference = (SoftReference)c.get();
    if (localSoftReference == null);
    for (si localsi = null; ; localsi = (si)localSoftReference.get())
    {
      if (localsi == null)
      {
        localsi = new si();
        c.set(new SoftReference(localsi));
      }
      return localsi;
    }
  }

  public final boolean b(hj.a parama)
  {
    return (this.g & parama.c()) != 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hd
 * JD-Core Version:    0.6.2
 */