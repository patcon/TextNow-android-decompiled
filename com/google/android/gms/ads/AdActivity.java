package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.eu;

public final class AdActivity extends Activity
{
  public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
  public static final String SIMPLE_CLASS_NAME = "AdActivity";
  private cn kr;

  private void S()
  {
    if (this.kr != null);
    try
    {
      this.kr.S();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not forward setContentViewSet to ad overlay:", localRemoteException);
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kr = cm.a(this);
    if (this.kr == null)
    {
      eu.D("Could not create ad overlay.");
      finish();
      return;
    }
    try
    {
      this.kr.onCreate(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not forward onCreate to ad overlay:", localRemoteException);
      finish();
    }
  }

  protected final void onDestroy()
  {
    try
    {
      if (this.kr != null)
        this.kr.onDestroy();
      super.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        eu.c("Could not forward onDestroy to ad overlay:", localRemoteException);
    }
  }

  protected final void onPause()
  {
    try
    {
      if (this.kr != null)
        this.kr.onPause();
      super.onPause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        eu.c("Could not forward onPause to ad overlay:", localRemoteException);
        finish();
      }
    }
  }

  protected final void onRestart()
  {
    super.onRestart();
    try
    {
      if (this.kr != null)
        this.kr.onRestart();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not forward onRestart to ad overlay:", localRemoteException);
      finish();
    }
  }

  protected final void onResume()
  {
    super.onResume();
    try
    {
      if (this.kr != null)
        this.kr.onResume();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not forward onResume to ad overlay:", localRemoteException);
      finish();
    }
  }

  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      if (this.kr != null)
        this.kr.onSaveInstanceState(paramBundle);
      super.onSaveInstanceState(paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        eu.c("Could not forward onSaveInstanceState to ad overlay:", localRemoteException);
        finish();
      }
    }
  }

  protected final void onStart()
  {
    super.onStart();
    try
    {
      if (this.kr != null)
        this.kr.onStart();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      eu.c("Could not forward onStart to ad overlay:", localRemoteException);
      finish();
    }
  }

  protected final void onStop()
  {
    try
    {
      if (this.kr != null)
        this.kr.onStop();
      super.onStop();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        eu.c("Could not forward onStop to ad overlay:", localRemoteException);
        finish();
      }
    }
  }

  public final void setContentView(int paramInt)
  {
    super.setContentView(paramInt);
    S();
  }

  public final void setContentView(View paramView)
  {
    super.setContentView(paramView);
    S();
  }

  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(paramView, paramLayoutParams);
    S();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdActivity
 * JD-Core Version:    0.6.2
 */