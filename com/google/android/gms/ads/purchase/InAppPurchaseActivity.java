package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.dd;
import com.google.android.gms.internal.di;
import com.google.android.gms.internal.eu;

public final class InAppPurchaseActivity extends Activity
{
  public static final String CLASS_NAME = "com.google.android.gms.ads.purchase.InAppPurchaseActivity";
  public static final String SIMPLE_CLASS_NAME = "InAppPurchaseActivity";
  private dd tb;

  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      if (this.tb != null)
        this.tb.onActivityResult(paramInt1, paramInt2, paramIntent);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        eu.c("Could not forward onActivityResult to in-app purchase manager:", localRemoteException);
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.tb = di.d(this);
    if (this.tb == null)
    {
      eu.D("Could not create in-app purchase manager.");
      finish();
      return;
    }
    try
    {
      this.tb.onCreate();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not forward onCreate to in-app purchase manager:", localRemoteException);
      finish();
    }
  }

  protected final void onDestroy()
  {
    try
    {
      if (this.tb != null)
        this.tb.onDestroy();
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        eu.c("Could not forward onDestroy to in-app purchase manager:", localRemoteException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.purchase.InAppPurchaseActivity
 * JD-Core Version:    0.6.2
 */