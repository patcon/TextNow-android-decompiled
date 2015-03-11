package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Locale;

public final class el
{
  private static final Object qp = new Object();
  private static String se;

  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    synchronized (qp)
    {
      if ((se == null) && (!TextUtils.isEmpty(paramString1)))
        b(paramContext, paramString1, paramString2);
      String str = se;
      return str;
    }
  }

  private static void b(Context paramContext, String paramString1, String paramString2)
  {
    BigInteger localBigInteger2;
    try
    {
      ClassLoader localClassLoader = paramContext.createPackageContext(paramString2, 3).getClassLoader();
      Class localClass = Class.forName("com.google.ads.mediation.MediationAdapter", false, localClassLoader);
      BigInteger localBigInteger1 = new BigInteger(new byte[1]);
      String[] arrayOfString = paramString1.split(",");
      localBigInteger2 = localBigInteger1;
      for (int i = 0; i < arrayOfString.length; i++)
        if (eo.a(localClassLoader, localClass, arrayOfString[i]))
          localBigInteger2 = localBigInteger2.setBit(i);
    }
    catch (Throwable localThrowable)
    {
      se = "err";
      return;
    }
    se = String.format(Locale.US, "%X", new Object[] { localBigInteger2 });
  }

  public static String bP()
  {
    synchronized (qp)
    {
      String str = se;
      return str;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.el
 * JD-Core Version:    0.6.2
 */