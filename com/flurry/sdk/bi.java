package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public final class bi
  implements bf
{
  private static final String a = bi.class.getSimpleName();

  private boolean a(String paramString1, PackageManager paramPackageManager, String paramString2, String paramString3)
  {
    if ((TextUtils.isEmpty(paramString1)) || (paramPackageManager == null) || (TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString3)))
      return false;
    if (-1 == paramPackageManager.checkPermission(paramString3, paramString2))
    {
      eo.b(a, paramString1 + ": package=\"" + paramString2 + "\": AndroidManifest.xml should include uses-permission node with " + "android:name=\"" + paramString3 + "\"");
      return false;
    }
    eo.a(3, a, paramString1 + ": package=\"" + paramString2 + "\": AndroidManifest.xml has uses-permission node with " + "android:name=\"" + paramString3 + "\"");
    return true;
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
      localList = parambj.d();
    }
    while (localList == null);
    PackageManager localPackageManager = paramContext.getPackageManager();
    String str2 = paramContext.getPackageName();
    Iterator localIterator = localList.iterator();
    boolean bool1 = true;
    if (localIterator.hasNext())
      if (a(str1, localPackageManager, str2, (String)localIterator.next()))
        break label98;
    label98: for (boolean bool2 = false; ; bool2 = bool1)
    {
      bool1 = bool2;
      break;
      return bool1;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bi
 * JD-Core Version:    0.6.2
 */