package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.nf;

public final class i
{
  private final String Mf;

  public i(String paramString)
  {
    this.Mf = ((String)o.i(paramString));
  }

  public final void a(Context paramContext, String paramString1, String paramString2, Throwable paramThrowable)
  {
    StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; (i < arrayOfStackTraceElement.length) && (i < 2); i++)
    {
      localStringBuilder.append(arrayOfStackTraceElement[i].toString());
      localStringBuilder.append("\n");
    }
    nf localnf = new nf(paramContext, 10);
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "GMS_WTF";
    arrayOfString[1] = localStringBuilder.toString();
    localnf.a("GMS_WTF", null, arrayOfString);
    localnf.send();
    if (aC(7))
      Log.wtf(paramString1, paramString2, paramThrowable);
  }

  public final void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    aC(4);
  }

  public final boolean aC(int paramInt)
  {
    return Log.isLoggable(this.Mf, paramInt);
  }

  public final void b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    aC(5);
  }

  public final void c(String paramString1, String paramString2, Throwable paramThrowable)
  {
    aC(6);
  }

  public final void n(String paramString1, String paramString2)
  {
    aC(3);
  }

  public final void o(String paramString1, String paramString2)
  {
    aC(2);
  }

  public final void p(String paramString1, String paramString2)
  {
    aC(5);
  }

  public final void q(String paramString1, String paramString2)
  {
    aC(6);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.i
 * JD-Core Version:    0.6.2
 */