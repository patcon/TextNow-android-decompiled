package com.flurry.sdk;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.List;

public final class bb
  implements bf
{
  private static final String a = bb.class.getSimpleName();
  private static final SparseArray<String> b = a();

  @TargetApi(13)
  private static SparseArray<String> a()
  {
    SparseArray localSparseArray = new SparseArray();
    localSparseArray.append(1, "mcc");
    localSparseArray.append(2, "mnc");
    localSparseArray.append(4, "locale");
    localSparseArray.append(8, "touchscreen");
    localSparseArray.append(16, "keyboard");
    localSparseArray.append(32, "keyboardHidden");
    localSparseArray.append(64, "navigation");
    localSparseArray.append(128, "orientation");
    localSparseArray.append(256, "screenLayout");
    localSparseArray.append(512, "uiMode");
    localSparseArray.append(1024, "screenSize");
    localSparseArray.append(2048, "smallestScreenSize");
    return localSparseArray;
  }

  private boolean a(String paramString1, PackageManager paramPackageManager, String paramString2, ActivityInfo paramActivityInfo)
  {
    if ((TextUtils.isEmpty(paramString1)) || (paramPackageManager == null) || (TextUtils.isEmpty(paramString2)) || (paramActivityInfo == null) || (TextUtils.isEmpty(paramActivityInfo.name)))
      return false;
    ActivityInfo localActivityInfo = cb.a(paramPackageManager, new ComponentName(paramString2, paramActivityInfo.name));
    if (localActivityInfo == null)
    {
      eo.b(a, paramString1 + ": package=\"" + paramString2 + "\": AndroidManifest.xml should include activity node with android:name=\"" + paramActivityInfo.name + "\"");
      return false;
    }
    eo.a(3, a, paramString1 + ": package=\"" + paramString2 + "\": AndroidManifest.xml has activity node with android:name=\"" + paramActivityInfo.name + "\"");
    int i = paramActivityInfo.configChanges;
    boolean bool;
    if (i != 0)
    {
      int j = cb.a(localActivityInfo);
      SparseArray localSparseArray = b();
      int k = 0;
      bool = true;
      if (k < localSparseArray.size())
      {
        int m = localSparseArray.keyAt(k);
        if ((m & i) != 0)
        {
          if ((m & j) != 0)
            break label296;
          eo.b(a, paramString1 + ": package=\"" + paramString2 + "\": AndroidManifest.xml activity node with android:name=\"" + paramActivityInfo.name + "\" should include android:configChanges value=\"" + (String)localSparseArray.valueAt(k) + "\"");
          bool = false;
        }
        while (true)
        {
          k++;
          break;
          label296: eo.a(3, a, paramString1 + ": package=\"" + paramString2 + "\": AndroidManifest.xml activity node with " + "android:name=\"" + paramActivityInfo.name + "\" has android:configChanges value=\"" + (String)localSparseArray.valueAt(k) + "\"");
        }
      }
    }
    else
    {
      bool = true;
    }
    return bool;
  }

  private static SparseArray<String> b()
  {
    return b;
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
      localList = parambj.e();
    }
    while (localList == null);
    PackageManager localPackageManager = paramContext.getPackageManager();
    String str2 = paramContext.getPackageName();
    Iterator localIterator = localList.iterator();
    boolean bool1 = true;
    if (localIterator.hasNext())
      if (a(str1, localPackageManager, str2, (ActivityInfo)localIterator.next()))
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
 * Qualified Name:     com.flurry.sdk.bb
 * JD-Core Version:    0.6.2
 */