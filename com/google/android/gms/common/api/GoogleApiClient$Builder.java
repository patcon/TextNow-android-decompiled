package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.v;
import android.support.v4.app.y;
import android.view.View;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hm;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class GoogleApiClient$Builder
{
  private Looper DF;
  private final Set<String> DH = new HashSet();
  private int DI;
  private View DJ;
  private String DK;
  private final Map<Api<?>, Api.ApiOptions> DL = new HashMap();
  private v DM;
  private GoogleApiClient.OnConnectionFailedListener DN;
  private final Set<GoogleApiClient.ConnectionCallbacks> DO = new HashSet();
  private final Set<GoogleApiClient.OnConnectionFailedListener> DP = new HashSet();
  private final Context mContext;
  private String yQ;

  public GoogleApiClient$Builder(Context paramContext)
  {
    this.mContext = paramContext;
    this.DF = paramContext.getMainLooper();
    this.DK = paramContext.getPackageName();
  }

  public GoogleApiClient$Builder(Context paramContext, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this(paramContext);
    hm.b(paramConnectionCallbacks, "Must provide a connected listener");
    this.DO.add(paramConnectionCallbacks);
    hm.b(paramOnConnectionFailedListener, "Must provide a connection failed listener");
    this.DP.add(paramOnConnectionFailedListener);
  }

  private d eJ()
  {
    y localy = this.DM.getSupportFragmentManager();
    if (localy.c() != null)
    {
      Iterator localIterator = localy.c().iterator();
      while (localIterator.hasNext())
      {
        Fragment localFragment = (Fragment)localIterator.next();
        if (((localFragment instanceof d)) && (localFragment.isAdded()) && (!((d)localFragment).isInitialized()))
          return (d)localFragment;
      }
    }
    d locald = new d();
    localy.a().a(locald, null).a();
    return locald;
  }

  public final Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> paramApi)
  {
    this.DL.put(paramApi, null);
    List localList = paramApi.eA();
    int i = localList.size();
    for (int j = 0; j < i; j++)
      this.DH.add(((Scope)localList.get(j)).eP());
    return this;
  }

  public final <O extends Api.ApiOptions.HasOptions> Builder addApi(Api<O> paramApi, O paramO)
  {
    hm.b(paramO, "Null options are not permitted for this Api");
    this.DL.put(paramApi, paramO);
    List localList = paramApi.eA();
    int i = localList.size();
    for (int j = 0; j < i; j++)
      this.DH.add(((Scope)localList.get(j)).eP());
    return this;
  }

  public final Builder addConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.DO.add(paramConnectionCallbacks);
    return this;
  }

  public final Builder addOnConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.DP.add(paramOnConnectionFailedListener);
    return this;
  }

  public final Builder addScope(Scope paramScope)
  {
    this.DH.add(paramScope.eP());
    return this;
  }

  public final GoogleApiClient build()
  {
    if (!this.DL.isEmpty());
    for (boolean bool = true; ; bool = false)
    {
      hm.b(bool, "must call addApi() to add at least one API");
      v localv = this.DM;
      d locald = null;
      if (localv != null)
        locald = eJ();
      c localc = new c(this.mContext, this.DF, eI(), this.DL, locald, this.DO, this.DP);
      if (locald != null)
        locald.a(localc, this.DN);
      return localc;
    }
  }

  public final gy eI()
  {
    return new gy(this.yQ, this.DH, this.DI, this.DJ, this.DK);
  }

  public final Builder enableAutoManage(v paramv, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.DM = ((v)hm.b(paramv, "Null activity is not permitted."));
    this.DN = paramOnConnectionFailedListener;
    return this;
  }

  public final Builder setAccountName(String paramString)
  {
    this.yQ = paramString;
    return this;
  }

  public final Builder setGravityForPopups(int paramInt)
  {
    this.DI = paramInt;
    return this;
  }

  public final Builder setHandler(Handler paramHandler)
  {
    hm.b(paramHandler, "Handler must not be null");
    this.DF = paramHandler.getLooper();
    return this;
  }

  public final Builder setViewForPopups(View paramView)
  {
    this.DJ = paramView;
    return this;
  }

  public final Builder useDefaultAccount()
  {
    return setAccountName("<<default account>>");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.GoogleApiClient.Builder
 * JD-Core Version:    0.6.2
 */