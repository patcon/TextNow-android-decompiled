package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import textnow.e.c;
import textnow.e.p;

final class ab extends z
{
  static boolean a = false;
  final p<ac> b = new p();
  final p<ac> c = new p();
  final String d;
  k e;
  boolean f;
  boolean g;
  boolean h;

  ab(String paramString, k paramk, boolean paramBoolean)
  {
    this.d = paramString;
    this.e = paramk;
    this.f = paramBoolean;
  }

  private ac c(int paramInt, Bundle paramBundle, aa<Object> paramaa)
  {
    ac localac = new ac(this, paramInt, paramBundle, paramaa);
    localac.d = paramaa.onCreateLoader(paramInt, paramBundle);
    return localac;
  }

  private ac d(int paramInt, Bundle paramBundle, aa<Object> paramaa)
  {
    try
    {
      this.h = true;
      ac localac = c(paramInt, paramBundle, paramaa);
      a(localac);
      return localac;
    }
    finally
    {
      this.h = false;
    }
  }

  public final <D> j<D> a(int paramInt, Bundle paramBundle, aa<D> paramaa)
  {
    if (this.h)
      throw new IllegalStateException("Called while creating a loader");
    ac localac = (ac)this.b.a(paramInt);
    if (a)
      new StringBuilder().append("initLoader in ").append(this).append(": args=").append(null).toString();
    if (localac == null)
    {
      localac = d(paramInt, null, paramaa);
      if (a)
        new StringBuilder().append("  Created new loader ").append(localac).toString();
    }
    while (true)
    {
      if ((localac.e) && (this.f))
        localac.a(localac.d, localac.g);
      return localac.d;
      if (a)
        new StringBuilder().append("  Re-using existing loader ").append(localac).toString();
      localac.c = paramaa;
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
      ac localac2 = (ac)this.b.e(i);
      this.b.c(i);
      localac2.c();
    }
    int j = this.c.f(paramInt);
    if (j >= 0)
    {
      ac localac1 = (ac)this.c.e(j);
      this.c.c(j);
      localac1.c();
    }
    if ((this.e != null) && (!a()))
      this.e.mFragments.e();
  }

  final void a(ac paramac)
  {
    this.b.a(paramac.a, paramac);
    if (this.f)
      paramac.a();
  }

  final void a(k paramk)
  {
    this.e = paramk;
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
        ac localac2 = (ac)this.b.e(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.b.d(j));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localac2.toString());
        localac2.a(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
    }
    if (this.c.a() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      String str1 = paramString + "    ";
      while (i < this.c.a())
      {
        ac localac1 = (ac)this.c.e(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.c.d(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localac1.toString());
        localac1.a(str1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
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
      ac localac = (ac)this.b.e(j);
      if ((localac.h) && (!localac.f));
      for (boolean bool2 = true; ; bool2 = false)
      {
        bool1 |= bool2;
        j++;
        break;
      }
    }
    return bool1;
  }

  public final <D> j<D> b(int paramInt)
  {
    if (this.h)
      throw new IllegalStateException("Called while creating a loader");
    ac localac = (ac)this.b.a(paramInt);
    if (localac != null)
    {
      if (localac.n != null)
        return localac.n.d;
      return localac.d;
    }
    return null;
  }

  public final <D> j<D> b(int paramInt, Bundle paramBundle, aa<D> paramaa)
  {
    if (this.h)
      throw new IllegalStateException("Called while creating a loader");
    ac localac1 = (ac)this.b.a(paramInt);
    if (a)
      new StringBuilder().append("restartLoader in ").append(this).append(": args=").append(null).toString();
    if (localac1 != null)
    {
      ac localac2 = (ac)this.c.a(paramInt);
      if (localac2 == null)
        break label269;
      if (!localac1.e)
        break label163;
      if (a)
        new StringBuilder().append("  Removing last inactive loader: ").append(localac1).toString();
      localac2.f = false;
      localac2.c();
    }
    while (true)
    {
      localac1.d.abandon();
      this.c.a(paramInt, localac1);
      while (true)
      {
        return d(paramInt, null, paramaa).d;
        label163: if (localac1.h)
          break;
        this.b.a(paramInt, null);
        localac1.c();
      }
      if (localac1.n != null)
      {
        if (a)
          new StringBuilder().append("  Removing pending loader: ").append(localac1.n).toString();
        localac1.n.c();
        localac1.n = null;
      }
      localac1.n = c(paramInt, null, paramaa);
      return localac1.n.d;
      label269: if (a)
        new StringBuilder().append("  Making last loader inactive: ").append(localac1).toString();
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
        ((ac)this.b.e(i)).a();
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
      ((ac)this.b.e(i)).b();
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
        ac localac = (ac)this.b.e(i);
        if (a)
          new StringBuilder().append("  Retaining: ").append(localac).toString();
        localac.i = true;
        localac.j = localac.h;
        localac.h = false;
        localac.c = null;
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
        ac localac = (ac)this.b.e(i);
        if (localac.i)
        {
          if (a)
            new StringBuilder().append("  Finished Retaining: ").append(localac).toString();
          localac.i = false;
          if ((localac.h != localac.j) && (!localac.h))
            localac.b();
        }
        if ((localac.h) && (localac.e) && (!localac.k))
          localac.a(localac.d, localac.g);
      }
    }
  }

  final void f()
  {
    for (int i = -1 + this.b.a(); i >= 0; i--)
      ((ac)this.b.e(i)).k = true;
  }

  final void g()
  {
    for (int i = -1 + this.b.a(); i >= 0; i--)
    {
      ac localac = (ac)this.b.e(i);
      if ((localac.h) && (localac.k))
      {
        localac.k = false;
        if (localac.e)
          localac.a(localac.d, localac.g);
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
        ((ac)this.b.e(j)).c();
      this.b.b();
    }
    if (a)
      new StringBuilder().append("Destroying Inactive in ").append(this).toString();
    for (int i = -1 + this.c.a(); i >= 0; i--)
      ((ac)this.c.e(i)).c();
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ab
 * JD-Core Version:    0.6.2
 */