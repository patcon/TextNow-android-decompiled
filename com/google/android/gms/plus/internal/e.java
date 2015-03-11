package com.google.android.gms.plus.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.hb;
import com.google.android.gms.internal.hb.c;
import com.google.android.gms.internal.hb.e;
import com.google.android.gms.internal.hb.g;
import com.google.android.gms.internal.hg;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.ie;
import com.google.android.gms.internal.kp;
import com.google.android.gms.internal.ks;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class e extends hb<d>
{
  private Person abJ;
  private final h abK;

  public e(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, h paramh)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramh.jZ());
    this.abK = paramh;
  }

  @Deprecated
  public e(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener, h paramh)
  {
    this(paramContext, paramContext.getMainLooper(), new hb.c(paramConnectionCallbacks), new hb.g(paramOnConnectionFailedListener), paramh);
  }

  public hg a(a.d<People.LoadPeopleResult> paramd, int paramInt, String paramString)
  {
    cn();
    e.e locale = new e.e(this, paramd);
    try
    {
      hg localhg = ((d)ft()).a(locale, 1, paramInt, -1, paramString);
      return localhg;
    }
    catch (RemoteException localRemoteException)
    {
      locale.a(DataHolder.af(8), null);
    }
    return null;
  }

  protected void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    if ((paramInt == 0) && (paramBundle != null) && (paramBundle.containsKey("loaded_person")))
      this.abJ = ks.i(paramBundle.getByteArray("loaded_person"));
    super.a(paramInt, paramIBinder, paramBundle);
  }

  public void a(a.d<Moments.LoadMomentsResult> paramd, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
  {
    cn();
    e.b localb;
    if (paramd != null)
      localb = new e.b(this, paramd);
    try
    {
      while (true)
      {
        ((d)ft()).a(localb, paramInt, paramString1, paramUri, paramString2, paramString3);
        return;
        localb = null;
      }
    }
    catch (RemoteException localRemoteException)
    {
      localb.a(DataHolder.af(8), null, null);
    }
  }

  public void a(a.d<Status> paramd, Moment paramMoment)
  {
    cn();
    e.a locala;
    if (paramd != null)
      locala = new e.a(this, paramd);
    try
    {
      while (true)
      {
        ie localie = ie.a((kp)paramMoment);
        ((d)ft()).a(locala, localie);
        return;
        locala = null;
      }
    }
    catch (RemoteException localRemoteException)
    {
      if (locala == null)
        throw new IllegalStateException(localRemoteException);
      locala.am(new Status(8, null, null));
    }
  }

  public void a(a.d<People.LoadPeopleResult> paramd, Collection<String> paramCollection)
  {
    cn();
    e.e locale = new e.e(this, paramd);
    try
    {
      ((d)ft()).a(locale, new ArrayList(paramCollection));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      locale.a(DataHolder.af(8), null);
    }
  }

  protected void a(hi paramhi, hb.e parame)
  {
    Bundle localBundle = this.abK.kh();
    localBundle.putStringArray("request_visible_actions", this.abK.ka());
    paramhi.a(parame, 5089000, this.abK.kd(), this.abK.kc(), fs(), this.abK.getAccountName(), localBundle);
  }

  protected d bn(IBinder paramIBinder)
  {
    return d.a.bm(paramIBinder);
  }

  protected String bu()
  {
    return "com.google.android.gms.plus.service.START";
  }

  protected String bv()
  {
    return "com.google.android.gms.plus.internal.IPlusService";
  }

  public boolean by(String paramString)
  {
    return Arrays.asList(fs()).contains(paramString);
  }

  public void clearDefaultAccount()
  {
    cn();
    try
    {
      this.abJ = null;
      ((d)ft()).clearDefaultAccount();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void d(a.d<People.LoadPeopleResult> paramd, String[] paramArrayOfString)
  {
    a(paramd, Arrays.asList(paramArrayOfString));
  }

  public String getAccountName()
  {
    cn();
    try
    {
      String str = ((d)ft()).getAccountName();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public Person getCurrentPerson()
  {
    cn();
    return this.abJ;
  }

  public void k(a.d<Moments.LoadMomentsResult> paramd)
  {
    a(paramd, 20, null, null, null, "me");
  }

  public void l(a.d<People.LoadPeopleResult> paramd)
  {
    cn();
    e.e locale = new e.e(this, paramd);
    try
    {
      ((d)ft()).a(locale, 2, 1, -1, null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      locale.a(DataHolder.af(8), null);
    }
  }

  public void m(a.d<Status> paramd)
  {
    cn();
    clearDefaultAccount();
    e.g localg = new e.g(this, paramd);
    try
    {
      ((d)ft()).b(localg);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localg.h(8, null);
    }
  }

  public hg r(a.d<People.LoadPeopleResult> paramd, String paramString)
  {
    return a(paramd, 0, paramString);
  }

  public void removeMoment(String paramString)
  {
    cn();
    try
    {
      ((d)ft()).removeMoment(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.e
 * JD-Core Version:    0.6.2
 */