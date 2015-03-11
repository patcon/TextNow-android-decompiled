package com.enflick.android.TextNow.chatheads;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import textnow.z.f;

public class ChatHeadIntentService extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (paramIntent != null)
    {
      Bundle localBundle = paramIntent.getExtras();
      if ((localBundle != null) && (localBundle.containsKey("extra_contact")))
      {
        f localf = (f)localBundle.getSerializable("extra_contact");
        if (localf != null)
          g.a(this).a(localf);
      }
    }
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.chatheads.ChatHeadIntentService
 * JD-Core Version:    0.6.2
 */