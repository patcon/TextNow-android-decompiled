package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import textnow.e.c;
import textnow.e.m;

final class ai extends ag
{
  static boolean a = false;
  final m<aj> b = new m();
  final m<aj> c = new m();
  final String d;
  v e;
  boolean f;
  boolean g;
  boolean h;

  ai(String paramString, v paramv, boolean paramBoolean)
  {
    this.d = paramString;
    this.e = paramv;
    this.f = paramBoolean;
  }

  private aj c(int paramInt, Bundle paramBundle, ah<Object> paramah)
  {
    aj localaj = new aj(this, paramInt, paramBundle, paramah);
    localaj.d = paramah.onCreateLoader(paramInt, paramBundle);
    return localaj;
  }

  private aj d(int paramInt, Bundle paramBundle, ah<Object> paramah)
  {
    try
    {
      this.h = true;
      aj localaj = c(paramInt, paramBundle, paramah);
      a(localaj);
      return localaj;
    }
    finally
    {
      this.h = false;
    }
  }

  public final <D> j<D> a(int paramInt, Bundle paramBundle, ah<D> paramah)
  {
    if (this.h)
      throw new IllegalStateException("Called while creating a loader");
    aj localaj = (aj)this.b.a(paramInt);
    if (a)
      new StringBuilder().append("initLoader in ").append(this).append(": args=").append(null).toString();
    if (localaj == null)
    {
      localaj = d(paramInt, null, paramah);
      if (a)
        new StringBuilder().append("  Created new loader ").append(localaj).toString();
    }
    while (true)
    {
      if ((localaj.e) && (this.f))
        localaj.a(localaj.d, localaj.g);
      return localaj.d;
      if (a)
        new StringBuilder().append("  Re-using existing loader ").append(localaj).toString();
      localaj.c = paramah;
    }
  }

  public final void a(int paramInt)
  {
    if (this.h)
      throw new IllegalStateException("Called while creating a loader");
    if (a)
      new StringBuilder().append("destroyLoader in ").append(this).append(" of ").append(paramInt).toString();
    int i = this.b.f(paramInt);
    if (i >= 0)
    {
      aj localaj2 = (aj)this.b.e(i);
      this.b.c(i);
      localaj2.c();
    }
    int j = this.c.f(paramInt);
    if (j >= 0)
    {
      aj localaj1 = (aj)this.c.e(j);
      this.c.c(j);
      localaj1.c();
    }
    if ((this.e != null) && (!a()))
      this.e.mFragments.e();
  }

  final void a(aj paramaj)
  {
    this.b.a(paramaj.a, paramaj);
    if (this.f)
      paramaj.a();
  }

  final void a(v paramv)
  {
    this.e = paramv;
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    if (this.b.a() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      String str2 = paramString + "    ";
      for (int j = 0; j < this.b.a(); j++)
      {
        aj localaj2 = (aj)this.b.e(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.b.d(j));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localaj2.toString());
        localaj2.a(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
    }
    if (this.c.a() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      String str1 = paramString + "    ";
      while (i < this.c.a())
      {
        aj localaj1 = (aj)this.c.e(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.c.d(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localaj1.toString());
        localaj1.a(str1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i++;
      }
    }
  }

  public final boolean a()
  {
    int i = this.b.a();
    int j = 0;
    boolean bool1 = false;
    if (j < i)
    {
      aj localaj = (aj)this.b.e(j);
      if ((localaj.h) && (!localaj.f));
      for (boolean bool2 = true; ; bool2 = false)
      {
        bool1 |= bool2;
        j++;
        break;
      }
    }
    return bool1;
  }

  public final <D> j<D> b(int paramInt, Bundle paramBundle, ah<D> paramah)
  {
    if (this.h)
      throw new IllegalStateException("Called while creating a loader");
    aj localaj1 = (aj)this.b.a(1);
    if (a)
      new StringBuilder().append("restartLoader in ").append(this).append(": args=").append(null).toString();
    if (localaj1 != null)
    {
      aj localaj2 = (aj)this.c.a(1);
      if (localaj2 == null)
        break label269;
      if (!localaj1.e)
        break label163;
      if (a)
        new StringBuilder().append("  Removing last inactive loader: ").append(localaj1).toString();
      localaj2.f = false;
      localaj2.c();
    }
    while (true)
    {
      localaj1.d.abandon();
      this.c.a(1, localaj1);
      while (true)
      {
        return d(1, null, paramah).d;
        label163: if (localaj1.h)
          break;
        this.b.a(1, null);
        localaj1.c();
      }
      if (localaj1.n != null)
      {
        if (a)
          new StringBuilder().append("  Removing pending loader: ").append(localaj1.n).toString();
        localaj1.n.c();
        localaj1.n = null;
      }
      localaj1.n = c(1, null, paramah);
      return localaj1.n.d;
      label269: if (a)
        new StringBuilder().append("  Making last loader inactive: ").append(localaj1).toString();
    }
  }

  final void b()
  {
    if (a)
      new StringBuilder().append("Starting in ").append(this).toString();
    if (this.f)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder().append("Called doStart when already started: ").append(this).toString();
    }
    while (true)
    {
      return;
      this.f = true;
      for (int i = -1 + this.b.a(); i >= 0; i--)
        ((aj)this.b.e(i)).a();
    }
  }

  final void c()
  {
    if (a)
      new StringBuilder().append("Stopping in ").append(this).toString();
    if (!this.f)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder().append("Called doStop when not started: ").append(this).toString();
      return;
    }
    for (int i = -1 + this.b.a(); i >= 0; i--)
      ((aj)this.b.e(i)).b();
    this.f = false;
  }

  final void d()
  {
    if (a)
      new StringBuilder().append("Retaining in ").append(this).toString();
    if (!this.f)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder().append("Called doRetain when not started: ").append(this).toString();
    }
    while (true)
    {
      return;
      this.g = true;
      this.f = false;
      for (int i = -1 + this.b.a(); i >= 0; i--)
      {
        aj localaj = (aj)this.b.e(i);
        if (a)
          new StringBuilder().append("  Retaining: ").append(localaj).toString();
        localaj.i = true;
        localaj.j = localaj.h;
        localaj.h = false;
        localaj.c = null;
      }
    }
  }

  final void e()
  {
    if (this.g)
    {
      if (a)
        new StringBuilder().append("Finished Retaining in ").append(this).toString();
      this.g = false;
      for (int i = -1 + this.b.a(); i >= 0; i--)
      {
        aj localaj = (aj)this.b.e(i);
        if (localaj.i)
        {
          if (a)
            new StringBuilder().append("  Finished Retaining: ").append(localaj).toString();
          localaj.i = false;
          if ((localaj.h != localaj.j) && (!localaj.h))
            localaj.b();
        }
        if ((localaj.h) && (localaj.e) && (!localaj.k))
          localaj.a(localaj.d, localaj.g);
      }
    }
  }

  final void f()
  {
    for (int i = -1 + this.b.a(); i >= 0; i--)
      ((aj)this.b.e(i)).k = true;
  }

  final void g()
  {
    for (int i = -1 + this.b.a(); i >= 0; i--)
    {
      aj localaj = (aj)this.b.e(i);
      if ((localaj.h) && (localaj.k))
      {
        localaj.k = false;
        if (localaj.e)
          localaj.a(localaj.d, localaj.g);
      }
    }
  }

  final void h()
  {
    if (!this.g)
    {
      if (a)
        new StringBuilder().append("Destroying Active in ").append(this).toString();
      for (int j = -1 + this.b.a(); j >= 0; j--)
        ((aj)this.b.e(j)).c();
      this.b.b();
    }
    if (a)
      new StringBuilder().append("Destroying Inactive in ").append(this).toString();
    for (int i = -1 + this.c.a(); i >= 0; i--)
      ((aj)this.c.e(i)).c();
    this.c.b();
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    c.a(this.e, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ai
 * JD-Core Version:    0.6.2
 */