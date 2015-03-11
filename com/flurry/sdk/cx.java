package com.flurry.sdk;

import com.flurry.android.FlurryAgent;
import java.util.HashMap;
import java.util.Map;

public class cx
  implements dq.a, Thread.UncaughtExceptionHandler
{
  private static final String a = cx.class.getSimpleName();
  private static cx b;
  private final HashMap<String, Map<String, String>> c = new HashMap();
  private boolean d;

  private cx()
  {
    ec.a().a(this);
    d();
  }

  public static cx a()
  {
    try
    {
      if (b == null)
        b = new cx();
      cx localcx = b;
      return localcx;
    }
    finally
    {
    }
  }

  private void d()
  {
    dq localdq = dp.a();
    this.d = ((Boolean)localdq.a("CaptureUncaughtExceptions")).booleanValue();
    localdq.a("CaptureUncaughtExceptions", this);
    eo.a(4, a, "initSettings, CrashReportingEnabled = " + this.d);
    String str = (String)localdq.a("VersionName");
    localdq.a("VersionName", this);
    eb.a(str);
    eo.a(4, a, "initSettings, VersionName = " + str);
  }

  public void a(String paramString)
  {
    dj localdj = dl.a().c();
    if (localdj != null)
      localdj.a(paramString, null, false);
  }

  public void a(String paramString, Object paramObject)
  {
    if (paramString.equals("CaptureUncaughtExceptions"))
    {
      this.d = ((Boolean)paramObject).booleanValue();
      eo.a(4, a, "onSettingUpdate, CrashReportingEnabled = " + this.d);
      return;
    }
    if (paramString.equals("VersionName"))
    {
      String str = (String)paramObject;
      eb.a(str);
      eo.a(4, a, "onSettingUpdate, VersionName = " + str);
      return;
    }
    eo.a(6, a, "onSettingUpdate internal error!");
  }

  @Deprecated
  public void a(String paramString1, String paramString2, String paramString3)
  {
    StackTraceElement[] arrayOfStackTraceElement1 = Thread.currentThread().getStackTrace();
    StackTraceElement[] arrayOfStackTraceElement2;
    if ((arrayOfStackTraceElement1 != null) && (arrayOfStackTraceElement1.length > 2))
    {
      arrayOfStackTraceElement2 = new StackTraceElement[-2 + arrayOfStackTraceElement1.length];
      System.arraycopy(arrayOfStackTraceElement1, 2, arrayOfStackTraceElement2, 0, arrayOfStackTraceElement2.length);
    }
    while (true)
    {
      Throwable localThrowable = new Throwable(paramString2);
      localThrowable.setStackTrace(arrayOfStackTraceElement2);
      dj localdj = dl.a().c();
      if (localdj != null)
        localdj.a(paramString1, paramString2, paramString3, localThrowable);
      return;
      arrayOfStackTraceElement2 = arrayOfStackTraceElement1;
    }
  }

  public void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    dj localdj = dl.a().c();
    if (localdj != null)
      localdj.a(paramString1, paramString2, paramThrowable.getClass().getName(), paramThrowable);
  }

  public void a(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    if (paramMap == null)
      paramMap = new HashMap();
    if (paramMap.size() >= 10)
    {
      eo.d(a, "MaxOriginParams exceeded: " + paramMap.size());
      return;
    }
    paramMap.put("flurryOriginVersion", paramString2);
    synchronized (this.c)
    {
      if ((this.c.size() >= 10) && (!this.c.containsKey(paramString1)))
      {
        eo.d(a, "MaxOrigins exceeded: " + this.c.size());
        return;
      }
    }
    this.c.put(paramString1, paramMap);
  }

  public void a(String paramString, Map<String, String> paramMap)
  {
    dj localdj = dl.a().c();
    if (localdj != null)
      localdj.a(paramString, paramMap, false);
  }

  public void a(String paramString, Map<String, String> paramMap, boolean paramBoolean)
  {
    dj localdj = dl.a().c();
    if (localdj != null)
      localdj.a(paramString, paramMap, paramBoolean);
  }

  public void a(String paramString, boolean paramBoolean)
  {
    dj localdj = dl.a().c();
    if (localdj != null)
      localdj.a(paramString, null, paramBoolean);
  }

  public void a(boolean paramBoolean)
  {
    eo.a(paramBoolean);
  }

  public HashMap<String, Map<String, String>> b()
  {
    synchronized (this.c)
    {
      HashMap localHashMap2 = new HashMap(this.c);
      return localHashMap2;
    }
  }

  public void b(String paramString)
  {
    dj localdj = dl.a().c();
    if (localdj != null)
      localdj.a(paramString, null);
  }

  public void b(String paramString, Map<String, String> paramMap)
  {
    dj localdj = dl.a().c();
    if (localdj != null)
      localdj.a(paramString, paramMap);
  }

  public void c()
  {
    dj localdj = dl.a().c();
    if (localdj != null)
      localdj.e();
  }

  public void c(String paramString)
  {
    dj localdj = dl.a().c();
    if (localdj != null)
      localdj.a(paramString, null, false);
  }

  public void c(String paramString, Map<String, String> paramMap)
  {
    dj localdj = dl.a().c();
    if (localdj != null)
      localdj.a(paramString, paramMap, false);
  }

  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    paramThrowable.printStackTrace();
    String str;
    if (this.d)
    {
      str = "";
      StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
      if ((arrayOfStackTraceElement == null) || (arrayOfStackTraceElement.length <= 0))
        break label106;
      StringBuilder localStringBuilder = new StringBuilder();
      if (paramThrowable.getMessage() != null)
        localStringBuilder.append(" (" + paramThrowable.getMessage() + ")\n");
      str = localStringBuilder.toString();
    }
    while (true)
    {
      FlurryAgent.onError("uncaught", str, paramThrowable);
      dl.a().d();
      dz.a().g();
      return;
      label106: if (paramThrowable.getMessage() != null)
        str = paramThrowable.getMessage();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.cx
 * JD-Core Version:    0.6.2
 */