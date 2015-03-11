package com.google.android.gms.plus.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.e.c;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.nw;
import com.google.android.gms.internal.nz;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class e extends com.google.android.gms.common.internal.e<d>
{
  private Person alt;
  private final h alu;

  public e(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, h paramh)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramh.ng());
    this.alu = paramh;
  }

  @Deprecated
  public e(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener, h paramh)
  {
    this(paramContext, paramContext.getMainLooper(), new e.c(paramConnectionCallbacks), new com.google.android.gms.common.internal.e.g(paramOnConnectionFailedListener), paramh);
  }

  public j a(BaseImplementation.b<People.LoadPeopleResult> paramb, int paramInt, String paramString)
  {
    dJ();
    e.e locale = new e.e(this, paramb);
    try
    {
      j localj = ((d)gS()).a(locale, 1, paramInt, -1, paramString);
      return localj;
    }
    catch (RemoteException localRemoteException)
    {
      locale.a(DataHolder.as(8), null);
    }
    return null;
  }

  protected void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    if ((paramInt == 0) && (paramBundle != null) && (paramBundle.containsKey("loaded_person")))
      this.alt = nz.i(paramBundle.getByteArray("loaded_person"));
    super.a(paramInt, paramIBinder, paramBundle);
  }

  public void a(BaseImplementation.b<Moments.LoadMomentsResult> paramb, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
  {
    dJ();
    e.b localb;
    if (paramb != null)
      localb = new e.b(this, paramb);
    try
    {
      while (true)
      {
        ((d)gS()).a(localb, paramInt, paramString1, paramUri, paramString2, paramString3);
        return;
        localb = null;
      }
    }
    catch (RemoteException localRemoteException)
    {
      localb.a(DataHolder.as(8), null, null);
    }
  }

  public void a(BaseImplementation.b<Status> paramb, Moment paramMoment)
  {
    dJ();
    e.a locala;
    if (paramb != null)
      locala = new e.a(this, paramb);
    try
    {
      while (true)
      {
        jp localjp = jp.a((nw)paramMoment);
        ((d)gS()).a(locala, localjp);
        return;
        locala = null;
      }
    }
    catch (RemoteException localRemoteException)
    {
      if (locala == null)
        throw new IllegalStateException(localRemoteException);
      locala.aB(new Status(8, null, null));
    }
  }

  public void a(BaseImplementation.b<People.LoadPeopleResult> paramb, Collection<String> paramCollection)
  {
    dJ();
    e.e locale = new e.e(this, paramb);
    try
    {
      ((d)gS()).a(locale, new ArrayList(paramCollection));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      locale.a(DataHolder.as(8), null);
    }
  }

  protected void a(l paraml, com.google.android.gms.common.internal.e.e parame)
  {
    Bundle localBundle = this.alu.no();
    localBundle.putStringArray("request_visible_actions", this.alu.nh());
    paraml.a(parame, 6171000, this.alu.nk(), this.alu.nj(), gR(), this.alu.getAccountName(), localBundle);
  }

  protected d bH(IBinder paramIBinder)
  {
    return d.a.bG(paramIBinder);
  }

  public boolean cg(String paramString)
  {
    return Arrays.asList(gR()).contains(paramString);
  }

  public void clearDefaultAccount()
  {
    dJ();
    try
    {
      this.alt = null;
      ((d)gS()).clearDefaultAccount();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void d(BaseImplementation.b<People.LoadPeopleResult> paramb, String[] paramArrayOfString)
  {
    a(paramb, Arrays.asList(paramArrayOfString));
  }

  public String getAccountName()
  {
    dJ();
    try
    {
      String str = ((d)gS()).getAccountName();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public Person getCurrentPerson()
  {
    dJ();
    return this.alt;
  }

  protected String getServiceDescriptor()
  {
    return "com.google.android.gms.plus.internal.IPlusService";
  }

  protected String getStartServiceAction()
  {
    return "com.google.android.gms.plus.service.START";
  }

  public void k(BaseImplementation.b<Moments.LoadMomentsResult> paramb)
  {
    a(paramb, 20, null, null, null, "me");
  }

  public void l(BaseImplementation.b<People.LoadPeopleResult> paramb)
  {
    dJ();
    e.e locale = new e.e(this, paramb);
    try
    {
      ((d)gS()).a(locale, 2, 1, -1, null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      locale.a(DataHolder.as(8), null);
    }
  }

  public void m(BaseImplementation.b<Status> paramb)
  {
    dJ();
    clearDefaultAccount();
    e.g localg = new e.g(this, paramb);
    try
    {
      ((d)gS()).b(localg);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localg.h(8, null);
    }
  }

  public j r(BaseImplementation.b<People.LoadPeopleResult> paramb, String paramString)
  {
    return a(paramb, 0, paramString);
  }

  public void removeMoment(String paramString)
  {
    dJ();
    try
    {
      ((d)gS()).removeMoment(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.e
 * JD-Core Version:    0.6.2
 */