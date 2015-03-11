package com.flurry.sdk;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public final class bd
  implements bf
{
  private static final String a = bd.class.getSimpleName();

  private boolean a(String paramString1, String paramString2, bc parambc)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)) || (parambc == null))
      return false;
    boolean bool1;
    try
    {
      boolean bool2 = TextUtils.isEmpty(parambc.c());
      bool1 = false;
      if (!bool2)
      {
        Class.forName(parambc.c());
        bool1 = true;
      }
      if (!bool1)
      {
        eo.b(a, paramString1 + ": package=\"" + paramString2 + "\": apk should include ad provider library with name=\"" + parambc.a() + "\" and version=\"" + parambc.b() + "\" or higher");
        return bool1;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        eo.a(6, a, "failed to find third party ad provider api with exception: ", localClassNotFoundException);
        bool1 = false;
      }
    }
    catch (ExceptionInInitializerError localExceptionInInitializerError)
    {
      while (true)
      {
        eo.a(6, a, "failed to initialize third party ad provider api with exception: ", localExceptionInInitializerError);
        bool1 = false;
      }
    }
    catch (LinkageError localLinkageError)
    {
      while (true)
      {
        eo.a(6, a, "failed to link third party ad provider api with exception: ", localLinkageError);
        bool1 = false;
      }
      eo.a(3, a, paramString1 + ": package=\"" + paramString2 + "\": apk has ad provider library with name=\"" + parambc.a() + "\" and version=\"" + parambc.b() + "\" or higher");
    }
    return bool1;
  }

  public final boolean a(Context paramContext, bj parambj)
  {
    if (parambj == null);
    String str1;
    List localList;
    do
    {
      do
      {
        return false;
        str1 = parambj.a();
      }
      while (TextUtils.isEmpty(str1));
      localList = parambj.b();
    }
    while (localList == null);
    String str2 = paramContext.getPackageName();
    Iterator localIterator = localList.iterator();
    boolean bool1 = true;
    if (localIterator.hasNext())
      if (a(str1, str2, (bc)localIterator.next()))
        break label90;
    label90: for (boolean bool2 = false; ; bool2 = bool1)
    {
      bool1 = bool2;
      break;
      return bool1;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bd
 * JD-Core Version:    0.6.2
 */