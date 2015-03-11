package com.enflick.android.TextNow.activities.phone;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import cz.acrobits.libsoftphone.Instance.Calls;
import cz.acrobits.libsoftphone.data.Call.Statistics;
import textnow.u.f;

public final class s
  implements Comparable<s>
{
  private final String a;
  private final textnow.u.d b;
  private final boolean c;
  private boolean d = false;
  private long e;
  private long f = 0L;
  private boolean g = false;
  private boolean h = false;
  private f i;
  private Uri j;
  private g k;

  public s(String paramString, textnow.u.d paramd, boolean paramBoolean, h paramh)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("call id can't be empty");
    this.a = paramString;
    this.b = paramd;
    this.c = paramBoolean;
    this.k = new g(paramh);
    this.e = SystemClock.uptimeMillis();
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(Uri paramUri)
  {
    this.j = paramUri;
  }

  public final void a(f paramf)
  {
    this.i = paramf;
  }

  public final void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public final boolean a(s params)
  {
    return this.e < params.e;
  }

  public final textnow.u.d b()
  {
    return this.b;
  }

  public final void b(boolean paramBoolean)
  {
    if (this.g)
    {
      this.f = SystemClock.uptimeMillis();
      this.g = false;
    }
    this.h = paramBoolean;
  }

  public final boolean c()
  {
    return this.c;
  }

  public final boolean d()
  {
    return this.d;
  }

  public final boolean e()
  {
    return this.g;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == null);
    while (!(paramObject instanceof s))
      return false;
    return this.a.equals(((s)paramObject).a);
  }

  public final void f()
  {
    this.e = SystemClock.uptimeMillis();
    this.g = true;
  }

  public final void g()
  {
    try
    {
      this.k.a(d.a());
      this.k.a();
      this.k.b();
      return;
    }
    catch (j localj)
    {
    }
  }

  public final void h()
  {
    this.k.c();
    this.k.a();
  }

  public final boolean i()
  {
    return this.h;
  }

  public final long j()
  {
    return this.e;
  }

  public final long k()
  {
    return this.f;
  }

  public final Call.Statistics l()
  {
    return Instance.Calls.getStatistics(this.a);
  }

  public final f m()
  {
    return this.i;
  }

  public final Uri n()
  {
    return this.j;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append("Id: ").append(this.a).append(" Number: ").append(this.b.a()).append(" Started: ").append(this.e).append(" Ended: ").append(this.f).append(" Conversation: ");
    if (this.i == null);
    for (String str = "null"; ; str = this.i.toString())
      return str;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.s
 * JD-Core Version:    0.6.2
 */