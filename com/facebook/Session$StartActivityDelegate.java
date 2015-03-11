package com.facebook;

import android.app.Activity;
import android.content.Intent;

abstract interface Session$StartActivityDelegate
{
  public abstract Activity getActivityContext();

  public abstract void startActivityForResult(Intent paramIntent, int paramInt);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.Session.StartActivityDelegate
 * JD-Core Version:    0.6.2
 */