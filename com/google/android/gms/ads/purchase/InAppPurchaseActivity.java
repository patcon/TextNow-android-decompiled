package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ei;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.gs;

public final class InAppPurchaseActivity extends Activity
{
  public static final String CLASS_NAME = "com.google.android.gms.ads.purchase.InAppPurchaseActivity";
  public static final String SIMPLE_CLASS_NAME = "InAppPurchaseActivity";
  private ei xk;

  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      if (this.xk != null)
        this.xk.onActivityResult(paramInt1, paramInt2, paramIntent);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        gs.d("Could not forward onActivityResult to in-app purchase manager:", localRemoteException);
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.xk = en.e(this);
    if (this.xk == null)
    {
      gs.W("Could not create in-app purchase manager.");
      finish();
      return;
    }
    try
    {
      this.xk.onCreate();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gs.d("Could not forward onCreate to in-app purchase manager:", localRemoteException);
      finish();
    }
  }

  protected final void onDestroy()
  {
    try
    {
      if (this.xk != null)
        this.xk.onDestroy();
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        gs.d("Could not forward onDestroy to in-app purchase manager:", localRemoteException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.purchase.InAppPurchaseActivity
 * JD-Core Version:    0.6.2
 */