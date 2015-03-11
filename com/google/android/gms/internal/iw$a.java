package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class iw$a extends ix.a
{
  private final int FW;
  private Activity og;

  public iw$a(int paramInt, Activity paramActivity)
  {
    this.FW = paramInt;
    this.og = paramActivity;
  }

  private void setActivity(Activity paramActivity)
  {
    this.og = paramActivity;
  }

  public final void g(int paramInt, Bundle paramBundle)
  {
    PendingIntent localPendingIntent1;
    if (paramInt == 1)
    {
      Intent localIntent = new Intent();
      localIntent.putExtras(paramBundle);
      localPendingIntent1 = this.og.createPendingResult(this.FW, localIntent, 1073741824);
      if (localPendingIntent1 != null);
    }
    while (true)
    {
      return;
      try
      {
        localPendingIntent1.send(1);
        return;
      }
      catch (PendingIntent.CanceledException localCanceledException1)
      {
        return;
      }
      PendingIntent localPendingIntent2 = null;
      if (paramBundle != null)
        localPendingIntent2 = (PendingIntent)paramBundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT");
      ConnectionResult localConnectionResult = new ConnectionResult(paramInt, localPendingIntent2);
      if (localConnectionResult.hasResolution())
        try
        {
          localConnectionResult.startResolutionForResult(this.og, this.FW);
          return;
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          return;
        }
      try
      {
        PendingIntent localPendingIntent3 = this.og.createPendingResult(this.FW, new Intent(), 1073741824);
        if (localPendingIntent3 != null)
        {
          localPendingIntent3.send(1);
          return;
        }
      }
      catch (PendingIntent.CanceledException localCanceledException2)
      {
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iw.a
 * JD-Core Version:    0.6.2
 */