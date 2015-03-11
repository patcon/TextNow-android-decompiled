package com.google.android.gms.auth;

import android.content.Intent;

public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException
{
  private final int yY;

  GooglePlayServicesAvailabilityException(int paramInt, String paramString, Intent paramIntent)
  {
    super(paramString, paramIntent);
    this.yY = paramInt;
  }

  public int getConnectionStatusCode()
  {
    return this.yY;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.GooglePlayServicesAvailabilityException
 * JD-Core Version:    0.6.2
 */