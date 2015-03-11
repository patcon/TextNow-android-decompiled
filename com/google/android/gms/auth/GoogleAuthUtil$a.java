package com.google.android.gms.auth;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;

class GoogleAuthUtil$a extends Handler
{
  private final Context mD;

  GoogleAuthUtil$a(Context paramContext)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.mD);
      if (GooglePlayServicesUtil.isUserRecoverableError(i))
        GooglePlayServicesUtil.showErrorNotification(i, this.mD);
      return;
    }
    Log.wtf("GoogleAuthUtil", "Don't know how to handle this message: " + paramMessage.what);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.GoogleAuthUtil.a
 * JD-Core Version:    0.6.2
 */