package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

final class lr$b extends lr.a
{
  private final int FW;

  public lr$b(lr paramlr, int paramInt)
  {
    super(null);
    this.FW = paramInt;
  }

  public final void a(int paramInt, FullWallet paramFullWallet, Bundle paramBundle)
  {
    PendingIntent localPendingIntent1 = null;
    if (paramBundle != null)
      localPendingIntent1 = (PendingIntent)paramBundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
    ConnectionResult localConnectionResult = new ConnectionResult(paramInt, localPendingIntent1);
    if (localConnectionResult.hasResolution());
    try
    {
      localConnectionResult.startResolutionForResult(lr.b(this.akM), this.FW);
      Intent localIntent;
      PendingIntent localPendingIntent2;
      do
      {
        return;
        localIntent = new Intent();
        if (!localConnectionResult.isSuccess())
          break;
        i = -1;
        localIntent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", paramFullWallet);
        localPendingIntent2 = lr.b(this.akM).createPendingResult(this.FW, localIntent, 1073741824);
      }
      while (localPendingIntent2 == null);
      try
      {
        localPendingIntent2.send(i);
        return;
      }
      catch (PendingIntent.CanceledException localCanceledException)
      {
        return;
      }
      if (paramInt == 408);
      for (int i = 0; ; i = 1)
      {
        localIntent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", paramInt);
        break;
      }
    }
    catch (IntentSender.SendIntentException localSendIntentException)
    {
    }
  }

  public final void a(int paramInt, MaskedWallet paramMaskedWallet, Bundle paramBundle)
  {
    PendingIntent localPendingIntent1 = null;
    if (paramBundle != null)
      localPendingIntent1 = (PendingIntent)paramBundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
    ConnectionResult localConnectionResult = new ConnectionResult(paramInt, localPendingIntent1);
    if (localConnectionResult.hasResolution());
    try
    {
      localConnectionResult.startResolutionForResult(lr.b(this.akM), this.FW);
      Intent localIntent;
      PendingIntent localPendingIntent2;
      do
      {
        return;
        localIntent = new Intent();
        if (!localConnectionResult.isSuccess())
          break;
        i = -1;
        localIntent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", paramMaskedWallet);
        localPendingIntent2 = lr.b(this.akM).createPendingResult(this.FW, localIntent, 1073741824);
      }
      while (localPendingIntent2 == null);
      try
      {
        localPendingIntent2.send(i);
        return;
      }
      catch (PendingIntent.CanceledException localCanceledException)
      {
        return;
      }
      if (paramInt == 408);
      for (int i = 0; ; i = 1)
      {
        localIntent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", paramInt);
        break;
      }
    }
    catch (IntentSender.SendIntentException localSendIntentException)
    {
    }
  }

  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", paramBoolean);
    PendingIntent localPendingIntent = lr.b(this.akM).createPendingResult(this.FW, localIntent, 1073741824);
    if (localPendingIntent == null)
      return;
    try
    {
      localPendingIntent.send(-1);
      return;
    }
    catch (PendingIntent.CanceledException localCanceledException)
    {
    }
  }

  public final void i(int paramInt, Bundle paramBundle)
  {
    hm.b(paramBundle, "Bundle should not be null");
    ConnectionResult localConnectionResult = new ConnectionResult(paramInt, (PendingIntent)paramBundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
    if (localConnectionResult.hasResolution());
    try
    {
      localConnectionResult.startResolutionForResult(lr.b(this.akM), this.FW);
      PendingIntent localPendingIntent;
      do
      {
        return;
        new StringBuilder().append("Create Wallet Objects confirmation UI will not be shown connection result: ").append(localConnectionResult).toString();
        Intent localIntent = new Intent();
        localIntent.putExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413);
        localPendingIntent = lr.b(this.akM).createPendingResult(this.FW, localIntent, 1073741824);
      }
      while (localPendingIntent == null);
      try
      {
        localPendingIntent.send(1);
        return;
      }
      catch (PendingIntent.CanceledException localCanceledException)
      {
      }
    }
    catch (IntentSender.SendIntentException localSendIntentException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lr.b
 * JD-Core Version:    0.6.2
 */