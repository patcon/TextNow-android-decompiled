package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.k;
import android.view.View;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class GoogleApiClient$Builder
{
  private String Dd;
  private Looper IH;
  private final Set<String> IJ = new HashSet();
  private int IK;
  private View IL;
  private String IM;
  private final Map<Api<?>, Api.ApiOptions> IN = new HashMap();
  private k IO;
  private int IP = -1;
  private GoogleApiClient.OnConnectionFailedListener IQ;
  private int IR = 2;
  private final Set<GoogleApiClient.ConnectionCallbacks> IS = new HashSet();
  private final Set<GoogleApiClient.OnConnectionFailedListener> IT = new HashSet();
  private final Context mContext;

  public GoogleApiClient$Builder(Context paramContext)
  {
    this.mContext = paramContext;
    this.IH = paramContext.getMainLooper();
    this.IM = paramContext.getPackageName();
  }

  public GoogleApiClient$Builder(Context paramContext, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this(paramContext);
    o.b(paramConnectionCallbacks, "Must provide a connected listener");
    this.IS.add(paramConnectionCallbacks);
    o.b(paramOnConnectionFailedListener, "Must provide a connection failed listener");
    this.IT.add(paramOnConnectionFailedListener);
  }

  private GoogleApiClient gl()
  {
    d locald = d.a(this.IO);
    Object localObject = locald.ak(this.IP);
    if (localObject == null)
      localObject = new b(this.mContext.getApplicationContext(), this.IH, gk(), this.IN, this.IS, this.IT, this.IP, this.IR);
    locald.a(this.IP, (GoogleApiClient)localObject, this.IQ);
    return localObject;
  }

  public final Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> paramApi)
  {
    this.IN.put(paramApi, null);
    List localList = paramApi.gd();
    int i = localList.size();
    for (int j = 0; j < i; j++)
      this.IJ.add(((Scope)localList.get(j)).gs());
    return this;
  }

  public final <O extends Api.ApiOptions.HasOptions> Builder addApi(Api<O> paramApi, O paramO)
  {
    o.b(paramO, "Null options are not permitted for this Api");
    this.IN.put(paramApi, paramO);
    List localList = paramApi.gd();
    int i = localList.size();
    for (int j = 0; j < i; j++)
      this.IJ.add(((Scope)localList.get(j)).gs());
    return this;
  }

  public final Builder addConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.IS.add(paramConnectionCallbacks);
    return this;
  }

  public final Builder addOnConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.IT.add(paramOnConnectionFailedListener);
    return this;
  }

  public final Builder addScope(Scope paramScope)
  {
    this.IJ.add(paramScope.gs());
    return this;
  }

  public final GoogleApiClient build()
  {
    if (!this.IN.isEmpty());
    for (boolean bool = true; ; bool = false)
    {
      o.b(bool, "must call addApi() to add at least one API");
      if (this.IP < 0)
        break;
      return gl();
    }
    return new b(this.mContext, this.IH, gk(), this.IN, this.IS, this.IT, -1, this.IR);
  }

  public final Builder enableAutoManage(k paramk, int paramInt, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    if (paramInt >= 0);
    for (boolean bool = true; ; bool = false)
    {
      o.b(bool, "clientId must be non-negative");
      this.IP = paramInt;
      this.IO = ((k)o.b(paramk, "Null activity is not permitted."));
      this.IQ = paramOnConnectionFailedListener;
      return this;
    }
  }

  public final ClientSettings gk()
  {
    return new ClientSettings(this.Dd, this.IJ, this.IK, this.IL, this.IM);
  }

  public final Builder setAccountName(String paramString)
  {
    this.Dd = paramString;
    return this;
  }

  public final Builder setGravityForPopups(int paramInt)
  {
    this.IK = paramInt;
    return this;
  }

  public final Builder setHandler(Handler paramHandler)
  {
    o.b(paramHandler, "Handler must not be null");
    this.IH = paramHandler.getLooper();
    return this;
  }

  public final Builder setViewForPopups(View paramView)
  {
    this.IL = paramView;
    return this;
  }

  public final Builder useDefaultAccount()
  {
    return setAccountName("<<default account>>");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.GoogleApiClient.Builder
 * JD-Core Version:    0.6.2
 */