package com.enflick.android.TextNow.tasks;

import android.content.Context;
import android.content.Intent;
import com.enflick.android.TextNow.TextNowApp;
import java.io.Serializable;
import textnow.s.i;

public abstract class c
  implements Serializable, Runnable
{
  static volatile int c = 0;
  protected Context a;
  int b;
  private boolean d = false;
  private int e = -1;
  private String f = null;
  private Class<?> g;

  public c()
  {
    int i = c;
    c = i + 1;
    this.b = i;
  }

  public final int a(Context paramContext, Class<?> paramClass)
  {
    this.g = paramClass;
    Intent localIntent = new Intent(paramContext, TNTaskService.class);
    localIntent.putExtra("task", this);
    paramContext.startService(localIntent);
    return this.b;
  }

  protected final void a(int paramInt)
  {
    this.e = paramInt;
  }

  public final void a(Context paramContext)
  {
    this.a = paramContext;
  }

  protected final void a(String paramString)
  {
    this.f = paramString;
  }

  protected final void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  protected final boolean a(i parami)
  {
    this.e = parami.d();
    if (this.e != 200)
    {
      this.d = true;
      Object localObject = parami.c();
      if ((localObject instanceof String))
        this.f = ((String)localObject);
      if ((this.e == 401) && (("UNAUTHENTICATED".equals(this.f)) || ("AUTHENTICATION_FAILED".equals(this.f))))
        TextNowApp.b();
      return true;
    }
    return false;
  }

  public final int b(Context paramContext)
  {
    return a(paramContext, paramContext.getClass());
  }

  public final void c(Context paramContext)
  {
    new StringBuilder().append("Starting task ").append(getClass().getSimpleName()).append(" synchronously").toString();
    this.a = paramContext;
    run();
  }

  protected boolean d_()
  {
    return false;
  }

  public final int e()
  {
    return this.b;
  }

  public final Class<?> f()
  {
    return this.g;
  }

  public final Context g()
  {
    return this.a;
  }

  public final boolean h()
  {
    return this.d;
  }

  public final int i()
  {
    return this.e;
  }

  public final String j()
  {
    return this.f;
  }

  public String toString()
  {
    return getClass().getSimpleName() + " taskId:" + this.b + " errorOccured:" + this.d + " statusCode:" + this.e + " errorCode:" + this.f;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.c
 * JD-Core Version:    0.6.2
 */