package com.flurry.sdk;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public final class bh
  implements bf
{
  private static final String a = bh.class.getSimpleName();

  private boolean a(String paramString1, String paramString2, Bundle paramBundle, String paramString3)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)) || (paramBundle == null) || (TextUtils.isEmpty(paramString3)))
      return false;
    String str = paramBundle.getString(paramString3);
    if (TextUtils.isEmpty(str))
    {
      eo.b(a, paramString1 + ": package=\"" + paramString2 + "\": AndroidManifest.xml should include meta-data node with android:name=\"" + paramString3 + "\" and not empty value for android:value");
      return false;
    }
    eo.a(3, a, paramString1 + ": package=\"" + paramString2 + "\": AndroidManifest.xml has meta-data node with android:name=\"" + paramString3 + "\" and android:value=\"" + str + "\"");
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
      localList = parambj.c();
    }
    while (localList == null);
    Bundle localBundle = dx.d(paramContext);
    String str2 = paramContext.getPackageName();
    Iterator localIterator = localList.iterator();
    boolean bool1 = true;
    if (localIterator.hasNext())
      if (a(str1, str2, localBundle, (String)localIterator.next()))
        break label98;
    label98: for (boolean bool2 = false; ; bool2 = bool1)
    {
      bool1 = bool2;
      break;
      return bool1;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.bh
 * JD-Core Version:    0.6.2
 */