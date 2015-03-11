package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast.ApplicationConnectionResult;
import com.google.android.gms.cast.Cast.Listener;
import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.e.e;
import com.google.android.gms.common.internal.l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class ij extends e<in>
{
  private static final Object GL = new Object();
  private static final Object GM = new Object();
  private static final ip Gr = new ip("CastClientImpl");
  private final Cast.Listener EO;
  private double FA;
  private boolean FB;
  private boolean GA;
  private int GB;
  private int GC;
  private final AtomicLong GD;
  private String GE;
  private String GF;
  private Bundle GG;
  private Map<Long, BaseImplementation.b<Status>> GH;
  private ij.b GI;
  private BaseImplementation.b<Cast.ApplicationConnectionResult> GJ;
  private BaseImplementation.b<Status> GK;
  private ApplicationMetadata Gs;
  private final CastDevice Gt;
  private final Map<String, Cast.MessageReceivedCallback> Gu;
  private final long Gv;
  private ij.c Gw;
  private String Gx;
  private boolean Gy;
  private boolean Gz;
  private final Handler mHandler;

  public ij(Context paramContext, Looper paramLooper, CastDevice paramCastDevice, long paramLong, Cast.Listener paramListener, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, null);
    this.Gt = paramCastDevice;
    this.EO = paramListener;
    this.Gv = paramLong;
    this.mHandler = new Handler(paramLooper);
    this.Gu = new HashMap();
    this.GD = new AtomicLong(0L);
    this.GH = new HashMap();
    fB();
    this.GI = new ij.b(this, null);
    registerConnectionFailedListener(this.GI);
  }

  private void a(ig paramig)
  {
    String str = paramig.fy();
    if (!ik.a(str, this.Gx))
      this.Gx = str;
    for (boolean bool = true; ; bool = false)
    {
      ip localip = Gr;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Boolean.valueOf(bool);
      arrayOfObject[1] = Boolean.valueOf(this.Gy);
      localip.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", arrayOfObject);
      if ((this.EO != null) && ((bool) || (this.Gy)))
        this.EO.onApplicationStatusChanged();
      this.Gy = false;
      return;
    }
  }

  private void a(il paramil)
  {
    this.Gs = paramil.getApplicationMetadata();
    double d = paramil.fE();
    if ((d != (0.0D / 0.0D)) && (d != this.FA))
      this.FA = d;
    for (boolean bool1 = true; ; bool1 = false)
    {
      boolean bool2 = paramil.fM();
      if (bool2 != this.FB)
      {
        this.FB = bool2;
        bool1 = true;
      }
      ip localip1 = Gr;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Boolean.valueOf(bool1);
      arrayOfObject1[1] = Boolean.valueOf(this.Gz);
      localip1.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", arrayOfObject1);
      if ((this.EO != null) && ((bool1) || (this.Gz)))
        this.EO.onVolumeChanged();
      int i = paramil.fN();
      if (i != this.GB)
        this.GB = i;
      for (boolean bool3 = true; ; bool3 = false)
      {
        ip localip2 = Gr;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Boolean.valueOf(bool3);
        arrayOfObject2[1] = Boolean.valueOf(this.Gz);
        localip2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", arrayOfObject2);
        if ((this.EO != null) && ((bool3) || (this.Gz)))
          this.EO.W(this.GB);
        int j = paramil.fO();
        if (j != this.GC)
          this.GC = j;
        for (boolean bool4 = true; ; bool4 = false)
        {
          ip localip3 = Gr;
          Object[] arrayOfObject3 = new Object[2];
          arrayOfObject3[0] = Boolean.valueOf(bool4);
          arrayOfObject3[1] = Boolean.valueOf(this.Gz);
          localip3.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", arrayOfObject3);
          if ((this.EO != null) && ((bool4) || (this.Gz)))
            this.EO.X(this.GC);
          this.Gz = false;
          return;
        }
      }
    }
  }

  private void c(BaseImplementation.b<Cast.ApplicationConnectionResult> paramb)
  {
    synchronized (GL)
    {
      if (this.GJ != null)
        this.GJ.b(new ij.a(new Status(2002)));
      this.GJ = paramb;
      return;
    }
  }

  private void e(BaseImplementation.b<Status> paramb)
  {
    synchronized (GM)
    {
      if (this.GK != null)
      {
        paramb.b(new Status(2001));
        return;
      }
      this.GK = paramb;
      return;
    }
  }

  private void fB()
  {
    this.GA = false;
    this.GB = -1;
    this.GC = -1;
    this.Gs = null;
    this.Gx = null;
    this.FA = 0.0D;
    this.FB = false;
  }

  private void fF()
  {
    Gr.b("removing all MessageReceivedCallbacks", new Object[0]);
    synchronized (this.Gu)
    {
      this.Gu.clear();
      return;
    }
  }

  private void fG()
  {
    if ((!this.GA) || (this.Gw == null) || (this.Gw.fL()))
      throw new IllegalStateException("Not connected to a device");
  }

  public final void G(boolean paramBoolean)
  {
    ((in)gS()).a(paramBoolean, this.FA, this.FB);
  }

  protected final in L(IBinder paramIBinder)
  {
    return in.a.M(paramIBinder);
  }

  public final void a(double paramDouble)
  {
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble)))
      throw new IllegalArgumentException("Volume cannot be " + paramDouble);
    ((in)gS()).a(paramDouble, this.FA, this.FB);
  }

  protected final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    ip localip = Gr;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    localip.b("in onPostInitHandler; statusCode=%d", arrayOfObject);
    if ((paramInt == 0) || (paramInt == 1001))
    {
      this.GA = true;
      this.Gy = true;
      this.Gz = true;
    }
    while (true)
    {
      if (paramInt == 1001)
      {
        this.GG = new Bundle();
        this.GG.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
        paramInt = 0;
      }
      super.a(paramInt, paramIBinder, paramBundle);
      return;
      this.GA = false;
    }
  }

  protected final void a(l paraml, e.e parame)
  {
    Bundle localBundle = new Bundle();
    ip localip = Gr;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.GE;
    arrayOfObject[1] = this.GF;
    localip.b("getServiceFromBroker(): mLastApplicationId=%s, mLastSessionId=%s", arrayOfObject);
    this.Gt.putInBundle(localBundle);
    localBundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.Gv);
    if (this.GE != null)
    {
      localBundle.putString("last_application_id", this.GE);
      if (this.GF != null)
        localBundle.putString("last_session_id", this.GF);
    }
    this.Gw = new ij.c(this, null);
    paraml.a(parame, 6171000, getContext().getPackageName(), this.Gw.asBinder(), localBundle);
  }

  public final void a(String paramString, Cast.MessageReceivedCallback paramMessageReceivedCallback)
  {
    ik.aF(paramString);
    aE(paramString);
    if (paramMessageReceivedCallback != null);
    synchronized (this.Gu)
    {
      this.Gu.put(paramString, paramMessageReceivedCallback);
      ((in)gS()).aI(paramString);
      return;
    }
  }

  public final void a(String paramString, LaunchOptions paramLaunchOptions, BaseImplementation.b<Cast.ApplicationConnectionResult> paramb)
  {
    c(paramb);
    ((in)gS()).a(paramString, paramLaunchOptions);
  }

  public final void a(String paramString, BaseImplementation.b<Status> paramb)
  {
    e(paramb);
    ((in)gS()).aH(paramString);
  }

  public final void a(String paramString1, String paramString2, BaseImplementation.b<Status> paramb)
  {
    if (TextUtils.isEmpty(paramString2))
      throw new IllegalArgumentException("The message payload cannot be null or empty");
    if (paramString2.length() > 65536)
      throw new IllegalArgumentException("Message exceeds maximum size");
    ik.aF(paramString1);
    fG();
    long l = this.GD.incrementAndGet();
    try
    {
      this.GH.put(Long.valueOf(l), paramb);
      ((in)gS()).a(paramString1, paramString2, l);
      return;
    }
    catch (Throwable localThrowable)
    {
      this.GH.remove(Long.valueOf(l));
      throw localThrowable;
    }
  }

  public final void a(String paramString, boolean paramBoolean, BaseImplementation.b<Cast.ApplicationConnectionResult> paramb)
  {
    c(paramb);
    ((in)gS()).f(paramString, paramBoolean);
  }

  public final void aE(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    synchronized (this.Gu)
    {
      Cast.MessageReceivedCallback localMessageReceivedCallback = (Cast.MessageReceivedCallback)this.Gu.remove(paramString);
      if (localMessageReceivedCallback == null);
    }
    try
    {
      ((in)gS()).aJ(paramString);
      return;
      localObject = finally;
      throw localObject;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      ip localip = Gr;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString;
      arrayOfObject[1] = localIllegalStateException.getMessage();
      localip.a(localIllegalStateException, "Error unregistering namespace (%s): %s", arrayOfObject);
    }
  }

  public final void b(String paramString1, String paramString2, BaseImplementation.b<Cast.ApplicationConnectionResult> paramb)
  {
    c(paramb);
    ((in)gS()).l(paramString1, paramString2);
  }

  public final void d(BaseImplementation.b<Status> paramb)
  {
    e(paramb);
    ((in)gS()).fP();
  }

  public final void disconnect()
  {
    ip localip1 = Gr;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = this.Gw;
    arrayOfObject1[1] = Boolean.valueOf(isConnected());
    localip1.b("disconnect(); ServiceListener=%s, isConnected=%b", arrayOfObject1);
    ij.c localc = this.Gw;
    this.Gw = null;
    if ((localc == null) || (!localc.fK()))
    {
      Gr.b("already disposed, so short-circuiting", new Object[0]);
      return;
    }
    fF();
    try
    {
      if ((isConnected()) || (isConnecting()))
        ((in)gS()).disconnect();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ip localip2 = Gr;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localRemoteException.getMessage();
      localip2.a(localRemoteException, "Error while disconnecting the controller interface: %s", arrayOfObject2);
      return;
    }
    finally
    {
      super.disconnect();
    }
  }

  public final Bundle fC()
  {
    if (this.GG != null)
    {
      Bundle localBundle = this.GG;
      this.GG = null;
      return localBundle;
    }
    return super.fC();
  }

  public final void fD()
  {
    ((in)gS()).fD();
  }

  public final double fE()
  {
    fG();
    return this.FA;
  }

  public final ApplicationMetadata getApplicationMetadata()
  {
    fG();
    return this.Gs;
  }

  public final String getApplicationStatus()
  {
    fG();
    return this.Gx;
  }

  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.cast.internal.ICastDeviceController";
  }

  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
  }

  public final boolean isMute()
  {
    fG();
    return this.FB;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ij
 * JD-Core Version:    0.6.2
 */