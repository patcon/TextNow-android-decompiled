package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.support.v4.app.k;
import android.support.v4.app.n;
import android.support.v4.app.s;
import android.support.v4.app.z;
import android.support.v4.content.j;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.o;

public class d extends Fragment
  implements DialogInterface.OnCancelListener, aa<ConnectionResult>
{
  private boolean JB;
  private int JC = -1;
  private ConnectionResult JD;
  private final Handler JE = new Handler(Looper.getMainLooper());
  private final SparseArray<d.b> JF = new SparseArray();

  public static d a(k paramk)
  {
    o.aT("Must be called from main thread of process");
    n localn = paramk.getSupportFragmentManager();
    try
    {
      d locald = (d)localn.a("GmsSupportLifecycleFragment");
      if ((locald == null) || (locald.isRemoving()))
      {
        locald = new d();
        localn.a().a(locald, "GmsSupportLifecycleFragment").a();
        localn.b();
      }
      return locald;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", localClassCastException);
    }
  }

  private void a(int paramInt, ConnectionResult paramConnectionResult)
  {
    if (!this.JB)
    {
      this.JB = true;
      this.JC = paramInt;
      this.JD = paramConnectionResult;
      this.JE.post(new d.c(this, paramInt, paramConnectionResult));
    }
  }

  private void an(int paramInt)
  {
    if (paramInt == this.JC)
      gu();
  }

  private void b(int paramInt, ConnectionResult paramConnectionResult)
  {
    d.b localb = (d.b)this.JF.get(paramInt);
    if (localb != null)
    {
      al(paramInt);
      GoogleApiClient.OnConnectionFailedListener localOnConnectionFailedListener = localb.JJ;
      if (localOnConnectionFailedListener != null)
        localOnConnectionFailedListener.onConnectionFailed(paramConnectionResult);
    }
    gu();
  }

  private void gu()
  {
    int i = 0;
    this.JB = false;
    this.JC = -1;
    this.JD = null;
    z localz = getLoaderManager();
    while (i < this.JF.size())
    {
      int j = this.JF.keyAt(i);
      d.a locala = am(j);
      if (locala != null)
        locala.gv();
      localz.a(j, null, this);
      i++;
    }
  }

  public void a(int paramInt, GoogleApiClient paramGoogleApiClient, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    o.b(paramGoogleApiClient, "GoogleApiClient instance cannot be null");
    if (this.JF.indexOfKey(paramInt) < 0);
    for (boolean bool = true; ; bool = false)
    {
      o.a(bool, "Already managing a GoogleApiClient with id " + paramInt);
      d.b localb = new d.b(paramGoogleApiClient, paramOnConnectionFailedListener, null);
      this.JF.put(paramInt, localb);
      if (getActivity() != null)
        getLoaderManager().a(paramInt, null, this);
      return;
    }
  }

  public void a(j<ConnectionResult> paramj, ConnectionResult paramConnectionResult)
  {
    if (paramConnectionResult.isSuccess())
    {
      an(paramj.getId());
      return;
    }
    a(paramj.getId(), paramConnectionResult);
  }

  public GoogleApiClient ak(int paramInt)
  {
    if (getActivity() != null)
    {
      d.a locala = am(paramInt);
      if (locala != null)
        return locala.JG;
    }
    return null;
  }

  public void al(int paramInt)
  {
    getLoaderManager().a(paramInt);
    this.JF.remove(paramInt);
  }

  d.a am(int paramInt)
  {
    try
    {
      d.a locala = (d.a)getLoaderManager().b(paramInt);
      return locala;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalStateException("Unknown loader in SupportLifecycleFragment", localClassCastException);
    }
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
        break label62;
      gu();
      return;
      if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(getActivity()) != 0)
        break;
      continue;
      if (paramInt2 != -1)
        break;
    }
    label62: b(this.JC, this.JD);
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    int i = 0;
    if (i < this.JF.size())
    {
      int j = this.JF.keyAt(i);
      d.a locala = am(j);
      if ((locala != null) && (((d.b)this.JF.valueAt(i)).JG != locala.JG))
        getLoaderManager().b(j, null, this);
      while (true)
      {
        i++;
        break;
        getLoaderManager().a(j, null, this);
      }
    }
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    b(this.JC, this.JD);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      this.JB = paramBundle.getBoolean("resolving_error", false);
      this.JC = paramBundle.getInt("failed_client_id", -1);
      if (this.JC >= 0)
        this.JD = new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
    }
  }

  public j<ConnectionResult> onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return new d.a(getActivity(), ((d.b)this.JF.get(paramInt)).JG);
  }

  public void onLoaderReset(j<ConnectionResult> paramj)
  {
    if (paramj.getId() == this.JC)
      gu();
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("resolving_error", this.JB);
    if (this.JC >= 0)
    {
      paramBundle.putInt("failed_client_id", this.JC);
      paramBundle.putInt("failed_status", this.JD.getErrorCode());
      paramBundle.putParcelable("failed_resolution", this.JD.getResolution());
    }
  }

  public void onStart()
  {
    super.onStart();
    if (!this.JB)
      for (int i = 0; i < this.JF.size(); i++)
        getLoaderManager().a(this.JF.keyAt(i), null, this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.d
 * JD-Core Version:    0.6.2
 */