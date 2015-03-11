package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public abstract interface r extends IInterface
{
  public abstract Bundle a(String paramString, Bundle paramBundle);

  public abstract Bundle a(String paramString1, String paramString2, Bundle paramBundle);

  public abstract AccountChangeEventsResponse a(AccountChangeEventsRequest paramAccountChangeEventsRequest);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.r
 * JD-Core Version:    0.6.2
 */