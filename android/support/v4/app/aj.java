package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.j;
import android.support.v4.content.l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import textnow.e.c;
import textnow.e.m;

final class aj
  implements l<Object>
{
  final int a;
  final Bundle b;
  ah<Object> c;
  j<Object> d;
  boolean e;
  boolean f;
  Object g;
  boolean h;
  boolean i;
  boolean j;
  boolean k;
  boolean l;
  boolean m;
  aj n;

  public aj(int paramInt, Bundle paramBundle, ah<Object> paramah)
  {
    this.a = paramBundle;
    this.b = paramah;
    Object localObject;
    this.c = localObject;
  }

  final void a()
  {
    if ((this.i) && (this.j))
      this.h = true;
    do
    {
      do
        return;
      while (this.h);
      this.h = true;
      if (ai.a)
        new StringBuilder().append("  Starting: ").append(this).toString();
      if ((this.d == null) && (this.c != null))
        this.d = this.c.onCreateLoader(this.a, this.b);
    }
    while (this.d == null);
    if ((this.d.getClass().isMemberClass()) && (!Modifier.isStatic(this.d.getClass().getModifiers())))
      throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.d);
    if (!this.m)
    {
      this.d.registerListener(this.a, this);
      this.m = true;
    }
    this.d.startLoading();
  }

  final void a(j<Object> paramj, Object paramObject)
  {
    String str2;
    if (this.c != null)
    {
      if (this.o.e == null)
        break label159;
      str2 = this.o.e.mFragments.u;
      this.o.e.mFragments.u = "onLoadFinished";
    }
    label159: for (String str1 = str2; ; str1 = null)
      try
      {
        if (ai.a)
          new StringBuilder().append("  onLoadFinished in ").append(paramj).append(": ").append(paramj.dataToString(paramObject)).toString();
        this.c.onLoadFinished(paramj, paramObject);
        if (this.o.e != null)
          this.o.e.mFragments.u = str1;
        this.f = true;
        return;
      }
      finally
      {
        if (this.o.e != null)
          this.o.e.mFragments.u = str1;
      }
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    while (true)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(this.a);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(this.b);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCallbacks=");
      paramPrintWriter.println(this.c);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(this.d);
      if (this.d != null)
        this.d.dump(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      if ((this.e) || (this.f))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mHaveData=");
        paramPrintWriter.print(this.e);
        paramPrintWriter.print("  mDeliveredData=");
        paramPrintWriter.println(this.f);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mData=");
        paramPrintWriter.println(this.g);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.h);
      paramPrintWriter.print(" mReportNextStart=");
      paramPrintWriter.print(this.k);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(this.l);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mRetaining=");
      paramPrintWriter.print(this.i);
      paramPrintWriter.print(" mRetainingStarted=");
      paramPrintWriter.print(this.j);
      paramPrintWriter.print(" mListenerRegistered=");
      paramPrintWriter.println(this.m);
      if (this.n == null)
        break;
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Pending Loader ");
      paramPrintWriter.print(this.n);
      paramPrintWriter.println(":");
      this = this.n;
      paramString = paramString + "  ";
    }
  }

  final void b()
  {
    if (ai.a)
      new StringBuilder().append("  Stopping: ").append(this).toString();
    this.h = false;
    if ((!this.i) && (this.d != null) && (this.m))
    {
      this.m = false;
      this.d.unregisterListener(this);
      this.d.stopLoading();
    }
  }

  final void c()
  {
    if (ai.a)
      new StringBuilder().append("  Destroying: ").append(this).toString();
    this.l = true;
    boolean bool = this.f;
    this.f = false;
    String str1;
    if ((this.c != null) && (this.d != null) && (this.e) && (bool))
    {
      if (ai.a)
        new StringBuilder().append("  Reseting: ").append(this).toString();
      if (this.o.e == null)
        break label264;
      String str2 = this.o.e.mFragments.u;
      this.o.e.mFragments.u = "onLoaderReset";
      str1 = str2;
    }
    while (true)
      label264: 
      try
      {
        this.c.onLoaderReset(this.d);
        if (this.o.e != null)
          this.o.e.mFragments.u = str1;
        this.c = null;
        this.g = null;
        this.e = false;
        if (this.d != null)
        {
          if (this.m)
          {
            this.m = false;
            this.d.unregisterListener(this);
          }
          this.d.reset();
        }
        if (this.n != null)
          this = this.n;
      }
      finally
      {
        if (this.o.e != null)
          this.o.e.mFragments.u = str1;
      }
  }

  public final void onLoadComplete(j<Object> paramj, Object paramObject)
  {
    if (ai.a)
      new StringBuilder().append("onLoadComplete: ").append(this).toString();
    if (this.l);
    do
    {
      return;
      if (this.o.b.a(this.a) != this)
        return;
      aj localaj1 = this.n;
      if (localaj1 != null)
      {
        if (ai.a)
          new StringBuilder().append("  Switching to pending loader: ").append(localaj1).toString();
        this.n = null;
        this.o.b.a(this.a, null);
        c();
        this.o.a(localaj1);
        return;
      }
      if ((this.g != paramObject) || (!this.e))
      {
        this.g = paramObject;
        this.e = true;
        if (this.h)
          a(paramj, paramObject);
      }
      aj localaj2 = (aj)this.o.c.a(this.a);
      if ((localaj2 != null) && (localaj2 != this))
      {
        localaj2.f = false;
        localaj2.c();
        this.o.c.b(this.a);
      }
    }
    while ((this.o.e == null) || (this.o.a()));
    this.o.e.mFragments.e();
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(this.a);
    localStringBuilder.append(" : ");
    c.a(this.d, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.aj
 * JD-Core Version:    0.6.2
 */