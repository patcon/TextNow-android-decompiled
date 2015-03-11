package com.enflick.android.TextNow.pullservice;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.tasks.GetNewMessagesTask;
import textnow.z.u;

public class TNPullService extends IntentService
{
  private static PowerManager.WakeLock a = null;

  public TNPullService()
  {
    super("TNPullService");
  }

  public static void a(Context paramContext)
  {
    b(paramContext).acquire();
  }

  private static PowerManager.WakeLock b(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        PowerManager.WakeLock localWakeLock2 = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "com.enflick.android.TextNow.pullservicelock");
        a = localWakeLock2;
        localWakeLock2.setReferenceCounted(true);
      }
      PowerManager.WakeLock localWakeLock1 = a;
      return localWakeLock1;
    }
    finally
    {
    }
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    try
    {
      u localu = new u(this);
      if ((localu.l()) && (!TextUtils.isEmpty(localu.m())))
      {
        new GetNewMessagesTask(true, false).b(this);
        TextNowApp.a().d();
      }
      while (true)
      {
        PowerManager.WakeLock localWakeLock2;
        return;
        TextNowApp.b();
        stopSelf();
      }
    }
    finally
    {
      PowerManager.WakeLock localWakeLock1 = b(this);
      if ((localWakeLock1 != null) && (localWakeLock1.isHeld()))
        localWakeLock1.release();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.pullservice.TNPullService
 * JD-Core Version:    0.6.2
 */