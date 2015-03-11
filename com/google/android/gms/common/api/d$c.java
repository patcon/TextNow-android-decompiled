package com.google.android.gms.common.api;

import android.content.IntentSender.SendIntentException;
import android.support.v4.app.k;
import android.support.v4.app.n;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

class d$c
  implements Runnable
{
  private final int JK;
  private final ConnectionResult JL;

  public d$c(d paramd, int paramInt, ConnectionResult paramConnectionResult)
  {
    this.JK = paramInt;
    this.JL = paramConnectionResult;
  }

  public void run()
  {
    if (this.JL.hasResolution())
      try
      {
        int i = 1 + (1 + this.JM.getActivity().getSupportFragmentManager().d().indexOf(this.JM) << 16);
        this.JL.startResolutionForResult(this.JM.getActivity(), i);
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        d.a(this.JM);
        return;
      }
    if (GooglePlayServicesUtil.isUserRecoverableError(this.JL.getErrorCode()))
    {
      GooglePlayServicesUtil.showErrorDialogFragment(this.JL.getErrorCode(), this.JM.getActivity(), this.JM, 2, this.JM);
      return;
    }
    d.a(this.JM, this.JK, this.JL);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.d.c
 * JD-Core Version:    0.6.2
 */