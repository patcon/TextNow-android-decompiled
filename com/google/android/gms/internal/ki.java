package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.e;

public final class ki
  implements Account
{
  private static e a(GoogleApiClient paramGoogleApiClient, Api.c<e> paramc)
  {
    boolean bool1 = true;
    boolean bool2;
    e locale;
    if (paramGoogleApiClient != null)
    {
      bool2 = bool1;
      hm.b(bool2, "GoogleApiClient parameter is required.");
      hm.a(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      locale = (e)paramGoogleApiClient.a(paramc);
      if (locale == null)
        break label56;
    }
    while (true)
    {
      hm.a(bool1, "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
      return locale;
      bool2 = false;
      break;
      label56: bool1 = false;
    }
  }

  public final void clearDefaultAccount(GoogleApiClient paramGoogleApiClient)
  {
    a(paramGoogleApiClient, Plus.yH).clearDefaultAccount();
  }

  public final String getAccountName(GoogleApiClient paramGoogleApiClient)
  {
    return a(paramGoogleApiClient, Plus.yH).getAccountName();
  }

  public final PendingResult<Status> revokeAccessAndDisconnect(GoogleApiClient paramGoogleApiClient)
  {
    // Byte code:
    //   0: aload_1
    //   1: new 58	com/google/android/gms/internal/ki$1
    //   4: dup
    //   5: aload_0
    //   6: invokespecial 61	com/google/android/gms/internal/ki$1:<init>	(Lcom/google/android/gms/internal/ki;)V
    //   9: invokeinterface 64 2 0
    //   14: areturn
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ki
 * JD-Core Version:    0.6.2
 */