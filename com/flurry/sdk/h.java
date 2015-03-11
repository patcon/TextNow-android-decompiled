package com.flurry.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class h
{
  private static final String a = h.class.getSimpleName();
  private static final List<String> b = Arrays.asList(new String[] { "com.android.chrome", "org.mozilla.firefox", "mobi.mgeek.TunnyBrowser", "com.UCMobile.intl", "com.opera.mini.android", "com.jiubang.browser", "com.opera.browser", "com.uc.browser.en", "acr.browser.barebones", "com.boatbrowser.free", "com.mx.browser", "com.ilegendsoft.mercury", "gpc.myweb.hinet.net.PopupWeb", "mobi.browser.flashfox", "com.baidu.browser.inter", "com.sec.webbrowserminiapp", "com.android.browser", "com.android.vending" });

  public static Intent a(Context paramContext, String paramString)
  {
    if ((paramContext != null) && (!TextUtils.isEmpty(paramString)))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      ActivityInfo localActivityInfo = a(paramContext.getPackageManager(), localIntent);
      if (localActivityInfo != null)
        return a(localActivityInfo, localIntent);
    }
    return null;
  }

  private static Intent a(ActivityInfo paramActivityInfo, Intent paramIntent)
  {
    eo.a(3, a, "Launching App in package: " + paramActivityInfo.packageName);
    ComponentName localComponentName = new ComponentName(paramActivityInfo.applicationInfo.packageName, paramActivityInfo.name);
    paramIntent.addCategory("android.intent.category.LAUNCHER");
    paramIntent.setComponent(localComponentName);
    return paramIntent;
  }

  private static ActivityInfo a(PackageManager paramPackageManager, Intent paramIntent)
  {
    if ((paramPackageManager == null) || (paramIntent == null))
      return null;
    List localList = paramPackageManager.queryIntentActivities(paramIntent, 65536);
    if ((localList != null) && (localList.size() > 0))
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        String str = ((ResolveInfo)localIterator.next()).activityInfo.packageName;
        if (b(str))
          localIterator.remove();
        else
          eo.a(3, a, "Package not blacklisted: " + str);
      }
    }
    if (localList.size() > 0)
      return ((ResolveInfo)localList.get(0)).activityInfo;
    return null;
  }

  private static boolean a(String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    boolean bool2 = false;
    if (!bool1)
      if (!"com.android.vending".equalsIgnoreCase(paramString))
      {
        boolean bool3 = "com.google.market".equalsIgnoreCase(paramString);
        bool2 = false;
        if (!bool3);
      }
      else
      {
        bool2 = true;
      }
    return bool2;
  }

  public static Intent b(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString)))
      return null;
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    List localList = localPackageManager.queryIntentActivities(localIntent, 65536);
    if ((localList != null) && (localList.size() > 0))
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ActivityInfo localActivityInfo = ((ResolveInfo)localIterator.next()).activityInfo;
        if (a(localActivityInfo.packageName))
          return a(localActivityInfo, localIntent);
      }
    }
    return null;
  }

  private static boolean b(String paramString)
  {
    return b.contains(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.h
 * JD-Core Version:    0.6.2
 */