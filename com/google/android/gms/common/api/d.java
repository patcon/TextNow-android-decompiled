package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.v;
import android.support.v4.app.y;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

public class d extends Fragment
  implements DialogInterface.OnCancelListener, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  private GoogleApiClient.OnConnectionFailedListener DN;
  private GoogleApiClient Et;
  private ConnectionResult Eu;
  private boolean Ev;

  public void a(GoogleApiClient paramGoogleApiClient, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.Et = paramGoogleApiClient;
    this.Et.registerConnectionCallbacks(this);
    this.DN = paramOnConnectionFailedListener;
    this.Et.registerConnectionCallbacks(this);
    this.Et.registerConnectionFailedListener(this);
  }

  public boolean isInitialized()
  {
    return this.Et != null;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    switch (paramInt1)
    {
    default:
      i = 0;
    case 2:
    case 1:
    }
    while (true)
    {
      if (i == 0)
        break label72;
      this.Et.connect();
      this.Ev = false;
      return;
      if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(getActivity()) != 0)
        break;
      continue;
      if (paramInt2 != -1)
        break;
    }
    label72: this.DN.onConnectionFailed(this.Eu);
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.Ev = false;
    this.DN.onConnectionFailed(this.Eu);
  }

  public void onConnected(Bundle paramBundle)
  {
    this.Ev = false;
  }

  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    this.Eu = paramConnectionResult;
    if (this.Ev)
      return;
    int i = getActivity().getSupportFragmentManager().c().indexOf(this);
    if (paramConnectionResult.hasResolution())
    {
      int j = 1 + (i + 1 << 16);
      try
      {
        paramConnectionResult.startResolutionForResult(getActivity(), j);
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        this.Et.connect();
        return;
      }
    }
    if (GooglePlayServicesUtil.isUserRecoverableError(paramConnectionResult.getErrorCode()))
    {
      GooglePlayServicesUtil.b(paramConnectionResult.getErrorCode(), getActivity(), this, 2, this);
      return;
    }
    this.DN.onConnectionFailed(this.Eu);
  }

  public void onConnectionSuspended(int paramInt)
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      this.Ev = paramBundle.getBoolean("resolving_error", false);
      int i = paramBundle.getInt("connection_result_status");
      if (i != 0)
        this.Eu = new ConnectionResult(i, (PendingIntent)paramBundle.getParcelable("resolution_pending_intent"));
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("resolving_error", this.Ev);
    if (this.Eu != null)
    {
      paramBundle.putInt("connection_result_status", this.Eu.getErrorCode());
      paramBundle.putParcelable("resolution_pending_intent", this.Eu.getResolution());
    }
  }

  public void onStart()
  {
    super.onStart();
    if ((!this.Ev) && (this.Et != null))
      this.Et.connect();
  }

  public void onStop()
  {
    super.onStop();
    if (this.Et != null)
      this.Et.disconnect();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.d
 * JD-Core Version:    0.6.2
 */