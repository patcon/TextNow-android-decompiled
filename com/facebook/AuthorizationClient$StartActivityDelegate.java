package com.facebook;

import android.app.Activity;
import android.content.Intent;

abstract interface AuthorizationClient$StartActivityDelegate
{
  public abstract Activity getActivityContext();

  public abstract void startActivityForResult(Intent paramIntent, int paramInt);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.AuthorizationClient.StartActivityDelegate
 * JD-Core Version:    0.6.2
 */