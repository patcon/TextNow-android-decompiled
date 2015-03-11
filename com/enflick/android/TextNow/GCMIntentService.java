package com.enflick.android.TextNow;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import com.enflick.android.TextNow.push.PushMessageHandler;
import com.enflick.android.TextNow.tasks.GetNewMessagesTask;
import com.google.android.gcm.GCMBaseIntentService;
import com.google.android.gcm.a;
import textnow.u.r;

public class GCMIntentService extends GCMBaseIntentService
{
  public GCMIntentService()
  {
    super(new String[] { "302791216486" });
  }

  public static void b(Context paramContext)
  {
    try
    {
      int i = Build.VERSION.SDK_INT;
      if (i < 8)
        throw new UnsupportedOperationException("Device must be at least API Level 8 (instead of " + i + ")");
      PackageManager localPackageManager = paramContext.getPackageManager();
      String str;
      try
      {
        localPackageManager.getPackageInfo("com.google.android.gsf", 0);
        str = a.d(paramContext);
        if ("".equals(str))
        {
          a.a(paramContext.getApplicationContext(), new String[] { "302791216486" });
          return;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        throw new UnsupportedOperationException("Device does not have package com.google.android.gsf");
      }
      if ((!a.f(paramContext)) || (!new r(paramContext).Z()))
      {
        PushMessageHandler.registerWithServer(paramContext, str);
        return;
      }
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
    }
  }

  protected final void a()
  {
    new GetNewMessagesTask().b(this);
  }

  public final void a(Context paramContext)
  {
    if (a.f(paramContext))
      PushMessageHandler.registerWithServer(paramContext, "");
  }

  public final void a(Context paramContext, String paramString)
  {
    new StringBuilder().append("Device registered: regId = ").append(paramString).toString();
    PushMessageHandler.registerWithServer(paramContext, paramString);
  }

  public final void a(Intent paramIntent)
  {
    new PushMessageHandler().onMessage(paramIntent, this);
  }

  public final void a(String paramString)
  {
    new StringBuilder().append("Received error: ").append(paramString).toString();
  }

  protected final boolean b(Context paramContext, String paramString)
  {
    new StringBuilder().append("Received recoverable error: ").append(paramString).toString();
    return super.b(paramContext, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.GCMIntentService
 * JD-Core Version:    0.6.2
 */