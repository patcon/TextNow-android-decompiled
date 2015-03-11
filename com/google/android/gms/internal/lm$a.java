package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class lm$a extends ln.a
{
  private final int Lu;
  private Activity nr;

  public lm$a(int paramInt, Activity paramActivity)
  {
    this.Lu = paramInt;
    this.nr = paramActivity;
  }

  private void setActivity(Activity paramActivity)
  {
    this.nr = paramActivity;
  }

  public final void g(int paramInt, Bundle paramBundle)
  {
    PendingIntent localPendingIntent1;
    if (paramInt == 1)
    {
      Intent localIntent = new Intent();
      localIntent.putExtras(paramBundle);
      localPendingIntent1 = this.nr.createPendingResult(this.Lu, localIntent, 1073741824);
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
          localConnectionResult.startResolutionForResult(this.nr, this.Lu);
          return;
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          return;
        }
      try
      {
        PendingIntent localPendingIntent3 = this.nr.createPendingResult(this.Lu, new Intent(), 1073741824);
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lm.a
 * JD-Core Version:    0.6.2
 */