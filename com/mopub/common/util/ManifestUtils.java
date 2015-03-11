package com.mopub.common.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.widget.Toast;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.MoPubActivity;
import com.mopub.mobileads.MraidActivity;
import com.mopub.mobileads.MraidVideoPlayerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManifestUtils
{
  private static final List<Class<? extends Activity>> REQUIRED_NATIVE_SDK_ACTIVITIES;
  private static final List<Class<? extends Activity>> REQUIRED_WEB_VIEW_SDK_ACTIVITIES;

  static
  {
    ArrayList localArrayList1 = new ArrayList(4);
    REQUIRED_WEB_VIEW_SDK_ACTIVITIES = localArrayList1;
    localArrayList1.add(MoPubActivity.class);
    REQUIRED_WEB_VIEW_SDK_ACTIVITIES.add(MraidActivity.class);
    REQUIRED_WEB_VIEW_SDK_ACTIVITIES.add(MraidVideoPlayerActivity.class);
    REQUIRED_WEB_VIEW_SDK_ACTIVITIES.add(MoPubBrowser.class);
    ArrayList localArrayList2 = new ArrayList(1);
    REQUIRED_NATIVE_SDK_ACTIVITIES = localArrayList2;
    localArrayList2.add(MoPubBrowser.class);
  }

  public static void checkNativeActivitiesDeclared(Context paramContext)
  {
    displayWarningForMissingActivities(paramContext, REQUIRED_NATIVE_SDK_ACTIVITIES);
  }

  public static void checkWebViewActivitiesDeclared(Context paramContext)
  {
    displayWarningForMissingActivities(paramContext, REQUIRED_WEB_VIEW_SDK_ACTIVITIES);
  }

  static void displayWarningForMissingActivities(Context paramContext, List<Class<? extends Activity>> paramList)
  {
    if (paramContext == null);
    List localList;
    do
    {
      return;
      localList = getUndeclaredActivities(paramContext, paramList);
    }
    while (localList.isEmpty());
    if (isDebuggable(paramContext))
    {
      Toast localToast = Toast.makeText(paramContext, "ERROR: YOUR MOPUB INTEGRATION IS INCOMPLETE.\nCheck logcat and update your AndroidManifest.xml with the correct activities.", 1);
      localToast.setGravity(7, 0, 0);
      localToast.show();
    }
    logMissingActivities(localList);
  }

  @Deprecated
  static List<Class<? extends Activity>> getRequiredNativeSdkActivities()
  {
    return REQUIRED_NATIVE_SDK_ACTIVITIES;
  }

  @Deprecated
  static List<Class<? extends Activity>> getRequiredWebViewSdkActivities()
  {
    return REQUIRED_WEB_VIEW_SDK_ACTIVITIES;
  }

  private static List<String> getUndeclaredActivities(Context paramContext, List<Class<? extends Activity>> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Class localClass = (Class)localIterator.next();
      if (!IntentUtils.deviceCanHandleIntent(paramContext, new Intent(paramContext, localClass)))
        localArrayList.add(localClass.getName());
    }
    return localArrayList;
  }

  static boolean isDebuggable(Context paramContext)
  {
    if ((paramContext == null) || (paramContext.getApplicationInfo() == null))
      return false;
    return Utils.bitMaskContainsFlag(paramContext.getApplicationInfo().flags, 2);
  }

  private static void logMissingActivities(List<String> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder("AndroidManifest permissions for the following required MoPub activities are missing:\n");
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localStringBuilder.append("\n\t").append(str);
    }
    localStringBuilder.append("\n\nPlease update your manifest to include them.");
    MoPubLog.w(localStringBuilder.toString());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.ManifestUtils
 * JD-Core Version:    0.6.2
 */