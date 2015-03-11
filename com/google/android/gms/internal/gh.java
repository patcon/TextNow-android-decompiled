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
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class gh extends hb<gl>
{
  private static final gn BG = new gn("CastClientImpl");
  private static final Object Ca = new Object();
  private static final Object Cb = new Object();
  private double AP;
  private boolean AQ;
  private final Cast.Listener Ae;
  private ApplicationMetadata BH;
  private final CastDevice BI;
  private final gm BJ;
  private final Map<String, Cast.MessageReceivedCallback> BK;
  private final long BL;
  private String BM;
  private boolean BN;
  private boolean BO;
  private boolean BP;
  private AtomicBoolean BQ;
  private int BR;
  private final AtomicLong BS;
  private String BT;
  private String BU;
  private Bundle BV;
  private Map<Long, a.d<Status>> BW;
  private gh.b BX;
  private a.d<Cast.ApplicationConnectionResult> BY;
  private a.d<Status> BZ;
  private final Handler mHandler;

  public gh(Context paramContext, Looper paramLooper, CastDevice paramCastDevice, long paramLong, Cast.Listener paramListener, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, null);
    this.BI = paramCastDevice;
    this.Ae = paramListener;
    this.BL = paramLong;
    this.mHandler = new Handler(paramLooper);
    this.BK = new HashMap();
    this.BP = false;
    this.BR = -1;
    this.BH = null;
    this.BM = null;
    this.BQ = new AtomicBoolean(false);
    this.AP = 0.0D;
    this.AQ = false;
    this.BS = new AtomicLong(0L);
    this.BW = new HashMap();
    this.BX = new gh.b(this, null);
    registerConnectionFailedListener(this.BX);
    this.BJ = new gm.a()
    {
      private boolean X(int paramAnonymousInt)
      {
        synchronized (gh.em())
        {
          if (gh.i(gh.this) != null)
          {
            gh.i(gh.this).a(new Status(paramAnonymousInt));
            gh.b(gh.this, null);
            return true;
          }
          return false;
        }
      }

      private void b(long paramAnonymousLong, int paramAnonymousInt)
      {
        synchronized (gh.h(gh.this))
        {
          a.d locald = (a.d)gh.h(gh.this).remove(Long.valueOf(paramAnonymousLong));
          if (locald != null)
            locald.a(new Status(paramAnonymousInt));
          return;
        }
      }

      public void T(int paramAnonymousInt)
      {
        gn localgn = gh.ek();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramAnonymousInt);
        localgn.b("ICastDeviceControllerListener.onDisconnected: %d", arrayOfObject);
        gh.a(gh.this, false);
        gh.b(gh.this).set(false);
        gh.a(gh.this, null);
        if (paramAnonymousInt != 0)
          gh.this.an(2);
      }

      public void U(int paramAnonymousInt)
      {
        synchronized (gh.el())
        {
          if (gh.c(gh.this) != null)
          {
            gh.c(gh.this).a(new gh.a(new Status(paramAnonymousInt)));
            gh.a(gh.this, null);
          }
          return;
        }
      }

      public void V(int paramAnonymousInt)
      {
        X(paramAnonymousInt);
      }

      public void W(int paramAnonymousInt)
      {
        X(paramAnonymousInt);
      }

      public void a(ApplicationMetadata paramAnonymousApplicationMetadata, String paramAnonymousString1, String paramAnonymousString2, boolean paramAnonymousBoolean)
      {
        gh.a(gh.this, paramAnonymousApplicationMetadata);
        gh.a(gh.this, paramAnonymousApplicationMetadata.getApplicationId());
        gh.b(gh.this, paramAnonymousString2);
        synchronized (gh.el())
        {
          if (gh.c(gh.this) != null)
          {
            gh.c(gh.this).a(new gh.a(new Status(0), paramAnonymousApplicationMetadata, paramAnonymousString1, paramAnonymousString2, paramAnonymousBoolean));
            gh.a(gh.this, null);
          }
          return;
        }
      }

      public void a(String paramAnonymousString, double paramAnonymousDouble, boolean paramAnonymousBoolean)
      {
        gh.ek().b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
      }

      public void a(String paramAnonymousString, long paramAnonymousLong)
      {
        b(paramAnonymousLong, 0);
      }

      public void a(String paramAnonymousString, long paramAnonymousLong, int paramAnonymousInt)
      {
        b(paramAnonymousLong, paramAnonymousInt);
      }

      public void b(final ge paramAnonymousge)
      {
        gh.ek().b("onApplicationStatusChanged", new Object[0]);
        gh.e(gh.this).post(new Runnable()
        {
          public void run()
          {
            gh.a(gh.this, paramAnonymousge);
          }
        });
      }

      public void b(final gj paramAnonymousgj)
      {
        gh.ek().b("onDeviceStatusChanged", new Object[0]);
        gh.e(gh.this).post(new Runnable()
        {
          public void run()
          {
            gh.a(gh.this, paramAnonymousgj);
          }
        });
      }

      public void b(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        gn localgn = gh.ek();
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramAnonymousString;
        arrayOfObject[1] = Integer.valueOf(paramAnonymousArrayOfByte.length);
        localgn.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", arrayOfObject);
      }

      public void g(final String paramAnonymousString1, final String paramAnonymousString2)
      {
        gh.ek().b("Receive (type=text, ns=%s) %s", new Object[] { paramAnonymousString1, paramAnonymousString2 });
        gh.e(gh.this).post(new Runnable()
        {
          public void run()
          {
            synchronized (gh.f(gh.this))
            {
              Cast.MessageReceivedCallback localMessageReceivedCallback = (Cast.MessageReceivedCallback)gh.f(gh.this).get(paramAnonymousString1);
              if (localMessageReceivedCallback != null)
              {
                localMessageReceivedCallback.onMessageReceived(gh.g(gh.this), paramAnonymousString1, paramAnonymousString2);
                return;
              }
            }
            gn localgn = gh.ek();
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = paramAnonymousString1;
            localgn.b("Discarded message for unknown namespace '%s'", arrayOfObject);
          }
        });
      }

      public void onApplicationDisconnected(final int paramAnonymousInt)
      {
        gh.a(gh.this, null);
        gh.b(gh.this, null);
        X(paramAnonymousInt);
        if (gh.d(gh.this) != null)
          gh.e(gh.this).post(new Runnable()
          {
            public void run()
            {
              if (gh.d(gh.this) != null)
                gh.d(gh.this).onApplicationDisconnected(paramAnonymousInt);
            }
          });
      }
    };
  }

  private void a(ge paramge)
  {
    String str = paramge.ec();
    if (!gi.a(str, this.BM))
      this.BM = str;
    for (boolean bool = true; ; bool = false)
    {
      gn localgn = BG;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Boolean.valueOf(bool);
      arrayOfObject[1] = Boolean.valueOf(this.BN);
      localgn.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", arrayOfObject);
      if ((this.Ae != null) && ((bool) || (this.BN)))
        this.Ae.onApplicationStatusChanged();
      this.BN = false;
      return;
    }
  }

  private void a(gj paramgj)
  {
    double d = paramgj.eh();
    if ((d != (0.0D / 0.0D)) && (d != this.AP))
      this.AP = d;
    for (boolean bool1 = true; ; bool1 = false)
    {
      boolean bool2 = paramgj.en();
      if (bool2 != this.AQ)
      {
        this.AQ = bool2;
        bool1 = true;
      }
      gn localgn1 = BG;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Boolean.valueOf(bool1);
      arrayOfObject1[1] = Boolean.valueOf(this.BO);
      localgn1.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", arrayOfObject1);
      if ((this.Ae != null) && ((bool1) || (this.BO)))
        this.Ae.onVolumeChanged();
      int i = paramgj.eo();
      if (i != this.BR)
        this.BR = i;
      for (boolean bool3 = true; ; bool3 = false)
      {
        gn localgn2 = BG;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Boolean.valueOf(bool3);
        arrayOfObject2[1] = Boolean.valueOf(this.BO);
        localgn2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", arrayOfObject2);
        if ((this.Ae != null) && ((bool3) || (this.BO)))
          this.Ae.O(this.BR);
        this.BO = false;
        return;
      }
    }
  }

  private void c(a.d<Cast.ApplicationConnectionResult> paramd)
  {
    synchronized (Ca)
    {
      if (this.BY != null)
        this.BY.a(new gh.a(new Status(2002)));
      this.BY = paramd;
      return;
    }
  }

  private void e(a.d<Status> paramd)
  {
    synchronized (Cb)
    {
      if (this.BZ != null)
      {
        paramd.a(new Status(2001));
        return;
      }
      this.BZ = paramd;
      return;
    }
  }

  private void ei()
  {
    BG.b("removing all MessageReceivedCallbacks", new Object[0]);
    synchronized (this.BK)
    {
      this.BK.clear();
      return;
    }
  }

  private void ej()
  {
    if ((!this.BP) || (this.BQ.get()))
      throw new IllegalStateException("Not connected to a device");
  }

  protected final gl G(IBinder paramIBinder)
  {
    return gl.a.H(paramIBinder);
  }

  public final void a(double paramDouble)
  {
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble)))
      throw new IllegalArgumentException("Volume cannot be " + paramDouble);
    ((gl)ft()).a(paramDouble, this.AP, this.AQ);
  }

  protected final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    gn localgn = BG;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    localgn.b("in onPostInitHandler; statusCode=%d", arrayOfObject);
    if ((paramInt == 0) || (paramInt == 1001))
    {
      this.BP = true;
      this.BN = true;
      this.BO = true;
    }
    while (true)
    {
      if (paramInt == 1001)
      {
        this.BV = new Bundle();
        this.BV.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
        paramInt = 0;
      }
      super.a(paramInt, paramIBinder, paramBundle);
      return;
      this.BP = false;
    }
  }

  protected final void a(hi paramhi, hb.e parame)
  {
    Bundle localBundle = new Bundle();
    gn localgn = BG;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.BT;
    arrayOfObject[1] = this.BU;
    localgn.b("getServiceFromBroker(): mLastApplicationId=%s, mLastSessionId=%s", arrayOfObject);
    this.BI.putInBundle(localBundle);
    localBundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.BL);
    if (this.BT != null)
    {
      localBundle.putString("last_application_id", this.BT);
      if (this.BU != null)
        localBundle.putString("last_session_id", this.BU);
    }
    paramhi.a(parame, 5089000, getContext().getPackageName(), this.BJ.asBinder(), localBundle);
  }

  public final void a(String paramString, Cast.MessageReceivedCallback paramMessageReceivedCallback)
  {
    gi.ak(paramString);
    aj(paramString);
    if (paramMessageReceivedCallback != null);
    synchronized (this.BK)
    {
      this.BK.put(paramString, paramMessageReceivedCallback);
      ((gl)ft()).an(paramString);
      return;
    }
  }

  public final void a(String paramString, LaunchOptions paramLaunchOptions, a.d<Cast.ApplicationConnectionResult> paramd)
  {
    c(paramd);
    ((gl)ft()).a(paramString, paramLaunchOptions);
  }

  public final void a(String paramString, a.d<Status> paramd)
  {
    e(paramd);
    ((gl)ft()).am(paramString);
  }

  public final void a(String paramString1, String paramString2, a.d<Status> paramd)
  {
    if (TextUtils.isEmpty(paramString2))
      throw new IllegalArgumentException("The message payload cannot be null or empty");
    if (paramString2.length() > 65536)
      throw new IllegalArgumentException("Message exceeds maximum size");
    gi.ak(paramString1);
    ej();
    long l = this.BS.incrementAndGet();
    ((gl)ft()).a(paramString1, paramString2, l);
    this.BW.put(Long.valueOf(l), paramd);
  }

  public final void a(String paramString, boolean paramBoolean, a.d<Cast.ApplicationConnectionResult> paramd)
  {
    c(paramd);
    ((gl)ft()).e(paramString, paramBoolean);
  }

  public final void aj(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    synchronized (this.BK)
    {
      Cast.MessageReceivedCallback localMessageReceivedCallback = (Cast.MessageReceivedCallback)this.BK.remove(paramString);
      if (localMessageReceivedCallback == null);
    }
    try
    {
      ((gl)ft()).ao(paramString);
      return;
      localObject = finally;
      throw localObject;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      gn localgn = BG;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString;
      arrayOfObject[1] = localIllegalStateException.getMessage();
      localgn.a(localIllegalStateException, "Error unregistering namespace (%s): %s", arrayOfObject);
    }
  }

  public final void b(String paramString1, String paramString2, a.d<Cast.ApplicationConnectionResult> paramd)
  {
    c(paramd);
    ((gl)ft()).h(paramString1, paramString2);
  }

  protected final String bu()
  {
    return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
  }

  protected final String bv()
  {
    return "com.google.android.gms.cast.internal.ICastDeviceController";
  }

  public final void d(a.d<Status> paramd)
  {
    e(paramd);
    ((gl)ft()).ep();
  }

  public final void disconnect()
  {
    gn localgn1 = BG;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Boolean.valueOf(this.BQ.get());
    arrayOfObject1[1] = Boolean.valueOf(isConnected());
    localgn1.b("disconnect(); mDisconnecting=%b, isConnected=%b", arrayOfObject1);
    if (this.BQ.getAndSet(true))
    {
      BG.b("mDisconnecting is set, so short-circuiting", new Object[0]);
      return;
    }
    ei();
    try
    {
      if ((isConnected()) || (isConnecting()))
        ((gl)ft()).disconnect();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      gn localgn2 = BG;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localRemoteException.getMessage();
      localgn2.a(localRemoteException, "Error while disconnecting the controller interface: %s", arrayOfObject2);
      return;
    }
    finally
    {
      super.disconnect();
    }
  }

  public final Bundle ef()
  {
    if (this.BV != null)
    {
      Bundle localBundle = this.BV;
      this.BV = null;
      return localBundle;
    }
    return super.ef();
  }

  public final void eg()
  {
    ((gl)ft()).eg();
  }

  public final double eh()
  {
    ej();
    return this.AP;
  }

  public final ApplicationMetadata getApplicationMetadata()
  {
    ej();
    return this.BH;
  }

  public final String getApplicationStatus()
  {
    ej();
    return this.BM;
  }

  public final boolean isMute()
  {
    ej();
    return this.AQ;
  }

  public final void y(boolean paramBoolean)
  {
    ((gl)ft()).a(paramBoolean, this.AP, this.AQ);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gh
 * JD-Core Version:    0.6.2
 */