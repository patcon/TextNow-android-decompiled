package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationServerParameters;
import java.util.Map;

public final class bs extends bt.a
{
  private Map<Class<? extends com.google.android.gms.ads.mediation.NetworkExtras>, com.google.android.gms.ads.mediation.NetworkExtras> nQ;

  private <NETWORK_EXTRAS extends com.google.ads.mediation.NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> bu n(String paramString)
  {
    try
    {
      Class localClass = Class.forName(paramString, false, bs.class.getClassLoader());
      if (com.google.ads.mediation.MediationAdapter.class.isAssignableFrom(localClass))
      {
        com.google.ads.mediation.MediationAdapter localMediationAdapter = (com.google.ads.mediation.MediationAdapter)localClass.newInstance();
        return new bz(localMediationAdapter, (com.google.ads.mediation.NetworkExtras)this.nQ.get(localMediationAdapter.getAdditionalParametersType()));
      }
      if (com.google.android.gms.ads.mediation.MediationAdapter.class.isAssignableFrom(localClass))
        return new bx((com.google.android.gms.ads.mediation.MediationAdapter)localClass.newInstance());
      eu.D("Could not instantiate mediation adapter: " + paramString + " (not a valid adapter).");
      throw new RemoteException();
    }
    catch (Throwable localThrowable)
    {
      eu.D("Could not instantiate mediation adapter: " + paramString + ". " + localThrowable.getMessage());
    }
    throw new RemoteException();
  }

  public final void c(Map<Class<? extends com.google.android.gms.ads.mediation.NetworkExtras>, com.google.android.gms.ads.mediation.NetworkExtras> paramMap)
  {
    this.nQ = paramMap;
  }

  public final bu m(String paramString)
  {
    return n(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bs
 * JD-Core Version:    0.6.2
 */