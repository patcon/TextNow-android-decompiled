package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.Iterator;
import java.util.List;

public class MultipleInstallBroadcastReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Iterator localIterator = paramContext.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0).iterator();
    while (localIterator.hasNext())
    {
      ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
      String str = paramIntent.getAction();
      if ((localResolveInfo.activityInfo.packageName.equals(paramContext.getPackageName())) && ("com.android.vending.INSTALL_REFERRER".equals(str)) && (!getClass().getName().equals(localResolveInfo.activityInfo.name)))
      {
        new StringBuilder().append("trigger onReceive: class: ").append(localResolveInfo.activityInfo.name).toString();
        try
        {
          ((BroadcastReceiver)Class.forName(localResolveInfo.activityInfo.name).newInstance()).onReceive(paramContext, paramIntent);
        }
        catch (Throwable localThrowable)
        {
          new StringBuilder().append("error in BroadcastReceiver ").append(localResolveInfo.activityInfo.name).toString();
        }
      }
    }
    new AppsFlyerLib().onReceive(paramContext, paramIntent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.MultipleInstallBroadcastReceiver
 * JD-Core Version:    0.6.2
 */