package com.enflick.android.TextNow.activities.phone;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.media.AudioManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.provider.CallLog.Calls;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.support.v4.content.m;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.activities.WelcomeActivity;
import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.ali.XMLTree;
import cz.acrobits.libsoftphone.Instance;
import cz.acrobits.libsoftphone.Instance.Audio;
import cz.acrobits.libsoftphone.Instance.Calls;
import cz.acrobits.libsoftphone.Instance.Log;
import cz.acrobits.libsoftphone.Instance.Registration;
import cz.acrobits.libsoftphone.Instance.Settings;
import cz.acrobits.libsoftphone.Instance.System;
import cz.acrobits.libsoftphone.Observer;
import cz.acrobits.libsoftphone.Preferences;
import cz.acrobits.libsoftphone.Preferences.Key;
import cz.acrobits.libsoftphone.Preferences.ROKey;
import cz.acrobits.libsoftphone.data.AudioRoute;
import cz.acrobits.libsoftphone.data.Call.DesiredMedia;
import cz.acrobits.libsoftphone.data.Call.History.Record;
import cz.acrobits.libsoftphone.data.Call.HoldState;
import cz.acrobits.libsoftphone.data.Call.HoldStates;
import cz.acrobits.libsoftphone.data.Call.State;
import cz.acrobits.libsoftphone.data.Callee;
import cz.acrobits.libsoftphone.data.DnsSrvRecord;
import cz.acrobits.libsoftphone.data.Network;
import cz.acrobits.libsoftphone.data.PushTestScheduleResult;
import cz.acrobits.libsoftphone.data.RegistrationState;
import cz.acrobits.util.CpuFeatures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import textnow.v.c;
import textnow.z.f;
import textnow.z.p;
import textnow.z.u;

public final class h
  implements SensorEventListener, l, Observer
{
  private static boolean a;
  private static h i;
  private static PowerManager.WakeLock m;
  private static PowerManager.WakeLock n;
  private static WifiManager.WifiLock o;
  private a b;
  private String c = null;
  private AudioRoute d;
  private boolean e = this.h.getPackageManager().hasSystemFeature("android.hardware.telephony");
  private Set<j> f = new HashSet();
  private y g;
  private TextNowApp h = TextNowApp.a();
  private w j;
  private d k;
  private int l = 0;
  private w p = null;
  private Map<String, w> q = new HashMap();
  private boolean r = false;
  private ContentProviderResult[] s;
  private String t = null;
  private String u = null;
  private boolean v = false;
  private BroadcastReceiver w = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (paramAnonymousIntent.getStringExtra("state").equals(TelephonyManager.EXTRA_STATE_IDLE))
      {
        h.a(h.this);
        h.b(h.this);
      }
    }
  };

  static
  {
    if (((!Build.MANUFACTURER.equalsIgnoreCase("amazon")) || (Build.MODEL.equalsIgnoreCase("KFOT"))) && (!Build.MODEL.equalsIgnoreCase("BNRV200")) && (!Build.MODEL.equalsIgnoreCase("BNTV250")) && (!Build.MODEL.equalsIgnoreCase("BNTV250A")));
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      m = null;
      n = null;
      o = null;
      return;
    }
  }

  @SuppressLint({"InlinedApi"})
  private h()
  {
    TextNowApp localTextNowApp = this.h;
    new StringBuilder().append("Initialized softphone with accountId: ").append(this.c).toString();
    Instance.init(localTextNowApp, Preferences.class);
    Instance.setObserver(this);
    if (textnow.v.a.a)
      Instance.Log.setEnabled(true);
    if (textnow.v.b.b())
      Instance.preferences.volumeBoostPlayback.set(Integer.valueOf(6));
    if (textnow.v.b.c())
      Instance.preferences.samplingRateOverride.overrideDefault(Integer.valueOf(32000));
    p localp;
    int i1;
    label405: b localb2;
    if (textnow.v.b.d())
    {
      Instance.preferences.volumeBoostMicrophone.set(Integer.valueOf(6));
      if ((0x4 & CpuFeatures.getCpuFeatures()) != 0)
      {
        Preferences localPreferences1 = Instance.preferences;
        localPreferences1.getClass();
        new Preferences.Key(localPreferences1, "echoSuppressionEnabled").set(Boolean.valueOf(true));
        Preferences localPreferences2 = Instance.preferences;
        localPreferences2.getClass();
        new Preferences.Key(localPreferences2, "bns").set(Boolean.valueOf(true));
      }
      if (textnow.v.b.a(c.h))
      {
        Instance.preferences.legacyAudio.set(Boolean.valueOf(true));
        Instance.preferences.samplingRateOverride.overrideDefault(Integer.valueOf(8000));
      }
      Instance.Settings.flushChanges();
      m();
      this.g = y.a(this.h);
      this.h.getSystemService("power");
      WifiManager localWifiManager = (WifiManager)this.h.getSystemService("wifi");
      if (Build.VERSION.SDK_INT >= 12)
        o = localWifiManager.createWifiLock(3, "in call wifi lock");
      localp = new p(this.h);
      b localb1 = new b();
      if (!textnow.v.a.a)
        break label507;
      i1 = a.a;
      localb2 = localb1.a(i1);
      if (!textnow.v.a.a)
        break label517;
    }
    label517: for (int i2 = a.b; ; i2 = localp.i())
    {
      this.b = localb2.b(i2).a();
      n = textnow.v.b.a(this.h, "call_proximity_lock");
      m = a(this.h);
      return;
      if ("LG-LG870".equalsIgnoreCase(Build.MODEL))
      {
        Instance.preferences.volumeBoostMicrophone.set(Integer.valueOf(1));
        break;
      }
      Instance.preferences.volumeBoostMicrophone.set(Integer.valueOf(3));
      break;
      label507: i1 = localp.h();
      break label405;
    }
  }

  public static void D()
  {
    for (String str : Instance.Log.get().replace("\r", "").split("\n\n"))
      new StringBuilder().append(str).append("\n\n").toString();
    Instance.Log.clear();
  }

  public static String E()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (String str : Instance.Log.get().replace("\r", "").split("\n\n"))
      localStringBuffer.append(str + "\n\n");
    return localStringBuffer.toString();
  }

  private boolean M()
  {
    if (this.c == null);
    while (true)
    {
      return false;
      try
      {
        RegistrationState localRegistrationState1 = Instance.Registration.getRegistrationState(this.c);
        RegistrationState localRegistrationState2 = RegistrationState.Registered;
        if (localRegistrationState1 == localRegistrationState2)
          return true;
      }
      catch (LinkageError localLinkageError)
      {
      }
    }
    return false;
  }

  private void N()
  {
    if (this.k == null);
    while (this.k.c())
      return;
    Instance.Calls.setActiveGroup("null");
    a(this.k.b().a(), i.a);
  }

  private void O()
  {
    if (this.k == null);
    while (true)
    {
      return;
      if (!this.k.c())
      {
        Instance.Calls.setActiveGroup(this.k.a());
        Iterator localIterator = this.k.d().iterator();
        while (localIterator.hasNext())
          h(((w)localIterator.next()).a());
      }
    }
  }

  private void P()
  {
    R();
    com.enflick.android.TextNow.wear.a.a(this.h);
    if ((this.j != null) && (!this.j.e()))
    {
      Instance.Audio.setCallAudioRoute(this.d);
      this.j.f();
      this.j.g();
      d(Call.State.Established);
    }
  }

  private void Q()
  {
    if (this.v)
      return;
    final Handler localHandler = new Handler();
    localHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        if ((h.f(h.this) == null) || (h.f(h.this).isEmpty()))
        {
          h.g(h.this);
          h.h(h.this);
          com.enflick.android.TextNow.wear.a.a(h.e(h.this));
          h.a(h.this, false);
          return;
        }
        if ((h.i(h.this) != null) && (h.i(h.this).e()))
        {
          com.enflick.android.TextNow.wear.a.a(h.e(h.this));
          localHandler.postDelayed(this, 5000L);
          return;
        }
        w localw = h.this.I();
        if (localw != null)
          com.enflick.android.TextNow.wear.a.a(h.e(h.this), localw.b(), localw.a());
        localHandler.postDelayed(this, 5000L);
      }
    }
    , 5000L);
    this.v = true;
  }

  private static void R()
  {
    if ((m != null) && (m.isHeld()))
      m.release();
  }

  private static void S()
  {
    if ((o != null) && (!o.isHeld()))
      o.acquire();
  }

  private void T()
  {
    if ((n != null) && (!n.isHeld()))
    {
      n.acquire();
      Q();
    }
  }

  private static void U()
  {
    if ((n != null) && (n.isHeld()))
      n.release();
  }

  private static PowerManager.WakeLock a(Context paramContext)
  {
    try
    {
      if (m == null)
      {
        PowerManager.WakeLock localWakeLock2 = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(268435482, "CallManagerWakeLock");
        m = localWakeLock2;
        localWakeLock2.setReferenceCounted(false);
      }
      PowerManager.WakeLock localWakeLock1 = m;
      return localWakeLock1;
    }
    finally
    {
    }
  }

  public static h a()
  {
    if (!a)
      throw new n();
    if (i == null);
    try
    {
      i = new h();
      return i;
    }
    catch (LinkageError localLinkageError)
    {
      a = false;
      throw new n(localLinkageError);
    }
  }

  private void a(final w paramw, final int paramInt1, final int paramInt2, boolean paramBoolean)
  {
    new AsyncTask()
    {
    }
    .execute(new Void[0]);
  }

  private void a(String paramString, i parami)
  {
    Iterator localIterator = new HashSet(this.f).iterator();
    while (localIterator.hasNext())
      ((j)localIterator.next()).a(paramString, parami);
  }

  private void a(String paramString, w paramw)
  {
    new StringBuilder().append("Adding callId: ").append(paramString).append(" for call: ").append(paramw.toString()).toString();
    this.q.put(paramString, paramw);
  }

  private void a(String paramString, f paramf)
  {
    Intent localIntent = new Intent("incoming_call");
    Bundle localBundle = new Bundle();
    localBundle.putString("callid", paramString);
    localBundle.putSerializable("contact", paramf);
    localIntent.putExtras(localBundle);
    m.a(this.h).a(localIntent);
  }

  private void a(String paramString, textnow.z.h paramh, boolean paramBoolean)
  {
    Iterator localIterator = new HashSet(this.f).iterator();
    while (localIterator.hasNext())
      ((j)localIterator.next()).a(paramString, paramh, paramBoolean);
  }

  private void a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    new StringBuilder().append("onCallEnded for: ").append(paramString).append(" mActiveCall is ").append(this.j).toString();
    textnow.z.h localh;
    label249: i locali;
    if (this.j == null)
    {
      localh = null;
      if (this.j != null)
        new StringBuilder().append("Current active call is call id: [").append(this.j.a()).append("] arg is [").append(paramString).append("]").toString();
      if ((this.j == null) || (!this.j.a().equals(paramString)) || ((!paramBoolean2) && (K())))
        break label382;
      m();
      this.j.h();
      if (this.j != null)
      {
        this.j.b(paramBoolean1);
        int i1 = (int)(0.5D + (this.j.k() - this.j.j()) / 1000L);
        if (this.j.o() != null)
        {
          ContentValues localContentValues = new ContentValues();
          localContentValues.put("message_text", String.valueOf(i1));
          this.h.getContentResolver().update(this.j.o(), localContentValues, null, null);
        }
      }
      A();
      if (!paramBoolean1)
        break label371;
      a(paramString, localh, true);
      if (this.q.isEmpty())
        break label427;
      this.j = ((w)this.q.values().iterator().next());
      if (Instance.Calls.getHoldStates(this.j.a()).local != Call.HoldState.Held)
        break label419;
      locali = i.a;
      label311: a(this.j.a(), locali);
      new StringBuilder().append("onCallEnded assigning call id: ").append(this.j.a()).toString();
    }
    while (true)
    {
      com.enflick.android.TextNow.wear.a.a(this.h);
      return;
      localh = this.j.n();
      break;
      label371: a(paramString, localh, false);
      break label249;
      label382: new StringBuilder().append("Closing not current call call id: ").append(paramString).toString();
      i(paramString);
      a(paramString, localh, false);
      break label249;
      label419: locali = i.b;
      break label311;
      label427: this.j = null;
      textnow.aa.a.a(this.h).c();
      U();
      R();
      if ((o != null) && (o.isHeld()))
        o.release();
    }
  }

  public static void a(boolean paramBoolean)
  {
    Instance.Log.setEnabled(paramBoolean);
  }

  public static boolean a(Call.State paramState)
  {
    try
    {
      boolean bool;
      if ((paramState != Call.State.Trying) && (paramState != Call.State.Ringing))
      {
        Call.State localState = Call.State.IncomingTrying;
        bool = false;
        if (paramState != localState);
      }
      else
      {
        bool = true;
      }
      return bool;
    }
    catch (LinkageError localLinkageError)
    {
    }
    return false;
  }

  public static void b()
  {
    try
    {
      Instance.System.applicationWillEnterForeground();
      Instance.System.applicationDidBecomeActive();
      return;
    }
    catch (Throwable localThrowable)
    {
      a = false;
    }
  }

  private void b(long paramLong)
  {
    Iterator localIterator = new HashSet(this.f).iterator();
    while (localIterator.hasNext())
      ((j)localIterator.next()).a(paramLong);
  }

  public static boolean b(Call.State paramState)
  {
    try
    {
      Call.State localState = Call.State.Established;
      boolean bool = false;
      if (paramState == localState)
        bool = true;
      return bool;
    }
    catch (LinkageError localLinkageError)
    {
    }
    return false;
  }

  public static void c()
  {
    try
    {
      Instance.System.applicationWillResignActive();
      Instance.System.applicationDidEnterBackground();
      return;
    }
    catch (Throwable localThrowable)
    {
      a = false;
    }
  }

  public static boolean c(Call.State paramState)
  {
    return (a(paramState)) || (b(paramState));
  }

  private void d(Call.State paramState)
  {
    Iterator localIterator = new HashSet(this.f).iterator();
    while (localIterator.hasNext())
      ((j)localIterator.next()).a();
  }

  private static void d(boolean paramBoolean)
  {
    AndroidUtil.runAsMainThread(new Runnable()
    {
      public final void run()
      {
        try
        {
          Context localContext = TextNowApp.a().getApplicationContext();
          u localu = new u(localContext);
          p localp = new p(localContext);
          String str1 = localp.v();
          if (str1 == null)
            str1 = localu.F();
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = localu.G();
          arrayOfObject[1] = localu.H();
          arrayOfObject[2] = str1;
          XMLTree localXMLTree = XMLTree.parse(String.format("<account><username>%1$s</username><password>%2$s</password><host>%3$s</host><keepAwake>1</keepAwake><dtmfOrder>rfc2833,audio</dtmfOrder><natTraversal>auto</natTraversal><ringingTone>periodic(sine(2000ms,2000,440Hz,480Hz),silence(4000ms))</ringingTone></account>", arrayOfObject));
          String str2 = localp.u();
          if (str2 != null)
            localXMLTree.setChildValue("proxy", str2);
          localXMLTree.setAttribute("id", "TextNow SIP Account");
          String str3 = localp.t();
          if (str3 == null)
            str3 = localp.s();
          localXMLTree.setChildValue("codecOrder3G", str3);
          localXMLTree.setChildValue("codecOrder", str3);
          String str4 = Instance.Registration.saveAccount(localXMLTree, this.a);
          new StringBuilder().append("Saved account: ").append(str4).toString();
          return;
        }
        catch (LinkageError localLinkageError)
        {
          h.c(false);
          return;
        }
        catch (Throwable localThrowable)
        {
          h.c(false);
        }
      }
    });
  }

  public static boolean d()
  {
    if (a);
    try
    {
      a();
      return a;
    }
    catch (n localn)
    {
      while (true)
        a = false;
    }
  }

  // ERROR //
  public static boolean e()
  {
    // Byte code:
    //   0: invokestatic 833	com/enflick/android/TextNow/activities/phone/h:d	()Z
    //   3: istore_0
    //   4: iconst_0
    //   5: istore_1
    //   6: iload_0
    //   7: ifeq +24 -> 31
    //   10: invokestatic 831	com/enflick/android/TextNow/activities/phone/h:a	()Lcom/enflick/android/TextNow/activities/phone/h;
    //   13: invokespecial 835	com/enflick/android/TextNow/activities/phone/h:M	()Z
    //   16: istore 4
    //   18: iconst_0
    //   19: istore_1
    //   20: iload 4
    //   22: ifne +9 -> 31
    //   25: iconst_0
    //   26: invokestatic 837	com/enflick/android/TextNow/activities/phone/h:d	(Z)V
    //   29: iconst_1
    //   30: istore_1
    //   31: iload_1
    //   32: ireturn
    //   33: astore_2
    //   34: new 144	java/lang/StringBuilder
    //   37: dup
    //   38: invokespecial 145	java/lang/StringBuilder:<init>	()V
    //   41: ldc_w 839
    //   44: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: aload_2
    //   48: invokevirtual 840	java/lang/Exception:toString	()Ljava/lang/String;
    //   51: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: pop
    //   58: iconst_0
    //   59: ireturn
    //   60: astore 5
    //   62: iconst_0
    //   63: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   10	18	33	java/lang/Exception
    //   25	29	33	java/lang/Exception
    //   25	29	60	com/enflick/android/TextNow/activities/phone/n
  }

  public static void f()
  {
    d(true);
  }

  public static void g()
  {
    AndroidUtil.runAsMainThread(new Runnable()
    {
      public final void run()
      {
        try
        {
          Instance.Registration.unregister(null);
          h.a().A();
          h.a();
          h.i();
          return;
        }
        catch (LinkageError localLinkageError)
        {
          h.c(false);
          return;
        }
        catch (Throwable localThrowable)
        {
          h.c(false);
        }
      }
    });
  }

  private void g(String paramString)
  {
    if ((w)this.q.get(paramString) == null)
      return;
    Instance.Calls.hold(paramString, true);
    a(paramString, i.a);
  }

  private void h(String paramString)
  {
    if ((w)this.q.get(paramString) == null)
      return;
    Instance.Calls.hold(paramString, false);
    a(paramString, i.b);
  }

  public static boolean h()
  {
    try
    {
      AudioRoute[] arrayOfAudioRoute = Instance.Audio.getAvailableCallAudioRoutes();
      for (int i1 = 0; ; i1++)
      {
        int i2 = arrayOfAudioRoute.length;
        boolean bool = false;
        if (i1 < i2)
        {
          String str1 = arrayOfAudioRoute[i1].name();
          String str2 = AudioRoute.BluetoothSCO.name();
          if (str1 == str2)
            bool = true;
        }
        else
        {
          return bool;
        }
      }
    }
    catch (LinkageError localLinkageError)
    {
    }
    return false;
  }

  public static void i()
  {
    Instance.setObserver(null);
  }

  private void i(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    do
    {
      w localw1;
      do
      {
        do
          return;
        while (!this.q.containsKey(paramString));
        Instance.Calls.hangup(paramString);
        Instance.Calls.close(paramString);
        localw1 = (w)this.q.get(paramString);
        new StringBuilder().append("Removing callId: ").append(paramString).toString();
        w localw2 = (w)this.q.remove(paramString);
        if (localw2 != null)
          this.p = localw2;
      }
      while (!K());
      if (this.k.c(localw1))
        this.k.b(localw1);
    }
    while (this.k.e() > 1);
    this.k = null;
    com.enflick.android.TextNow.ads.b.a("place_conference_call", "max_size", String.valueOf(this.l));
    this.l = 0;
  }

  public static AudioRoute n()
  {
    return Instance.Audio.getCallAudioRoute();
  }

  public static boolean w()
  {
    boolean bool1 = Instance.Audio.isMute();
    if (!bool1);
    for (boolean bool2 = true; ; bool2 = false)
    {
      Instance.Audio.setMute(bool2);
      if (bool1)
        break;
      return true;
    }
    return false;
  }

  public static boolean x()
  {
    return Instance.Audio.isMute();
  }

  public final void A()
  {
    if (this.j != null)
    {
      if (K())
      {
        Iterator localIterator = new ArrayList(this.k.d()).iterator();
        while (localIterator.hasNext())
        {
          w localw = (w)localIterator.next();
          new StringBuilder().append("closeCurrentCall closing call for callId: ").append(this.j.a()).toString();
          i(localw.a());
        }
      }
      new StringBuilder().append("closeCurrentCall closing call for callId: ").append(this.j.a()).toString();
      i(this.j.a());
      this.j = null;
    }
  }

  public final void B()
  {
    if (this.g != null)
      this.g.b();
  }

  public final void C()
  {
    if ((this.j == null) && (H() > 0))
      this.j = ((w)this.q.values().iterator().next());
    if (y() != Call.State.IncomingRinging);
    w localw;
    do
    {
      return;
      Iterator localIterator;
      while (!localIterator.hasNext())
        localIterator = this.q.values().iterator();
      localw = (w)localIterator.next();
    }
    while (y() != Call.State.IncomingRinging);
    Instance.Calls.getCallee(localw.a());
    a(localw.a(), localw.b());
  }

  public final w F()
  {
    return this.p;
  }

  public final Collection<w> G()
  {
    return new HashSet(this.q.values());
  }

  public final int H()
  {
    return this.q.size();
  }

  public final w I()
  {
    Iterator localIterator = this.q.values().iterator();
    while (localIterator.hasNext())
    {
      w localw = (w)localIterator.next();
      if (Call.State.IncomingRinging == Instance.Calls.getCallState(localw.a()))
        return localw;
    }
    return null;
  }

  public final void J()
  {
    if (this.q.isEmpty());
    while (true)
    {
      return;
      Iterator localIterator = this.q.values().iterator();
      while (localIterator.hasNext())
        ((w)localIterator.next()).toString();
    }
  }

  public final boolean K()
  {
    return (this.k != null) && (!this.k.c());
  }

  public final boolean L()
  {
    return this.k.e() >= 10;
  }

  public final void a(long paramLong)
  {
    if ((this.j != null) && (this.j.c()) && (!this.j.d()))
    {
      int i1 = (int)(paramLong / 60L);
      if (new u(this.h).E() - i1 <= 0)
      {
        b(paramLong);
        b(true);
        return;
      }
    }
    b(paramLong);
  }

  public final void a(a parama)
  {
    this.b = parama;
  }

  public final void a(j paramj)
  {
    if (!this.f.contains(paramj))
      this.f.add(paramj);
  }

  public final void a(AudioRoute paramAudioRoute)
  {
    this.d = paramAudioRoute;
    Instance.Audio.setCallAudioRoute(this.d);
  }

  public final void a(String paramString)
  {
    J();
    w localw = (w)this.q.get(paramString);
    if (localw == null)
    {
      new StringBuilder().append("Couldn't find call to answer for callId: ").append(paramString).toString();
      return;
    }
    Call.State localState = Instance.Calls.getCallState(localw.a());
    if (localState != Call.State.IncomingRinging)
    {
      new StringBuilder().append("Call is not ringing for callId: ").append(paramString).append(" State: ").append(localState.toString()).toString();
      return;
    }
    new StringBuilder().append("answer call from id: ").append(localw.a()).append(" number: ").append(localw.b().a()).toString();
    if (this.j != null)
    {
      if (!K())
        break label246;
      N();
    }
    while (true)
    {
      this.g.b();
      this.j = localw;
      new StringBuilder().append("answerCall assigning call id: ").append(this.j.a()).toString();
      if (Instance.Calls.answerIncomingCall(this.j.a(), Call.DesiredMedia.voiceOnly()))
        break;
      new StringBuilder().append("Couldn't answer call for callId: ").append(this.j.a()).toString();
      A();
      a(paramString, null, false);
      return;
      label246: g(this.j.a());
    }
    S();
    if (new u(this.h).ad())
      T();
    a(this.j, 100, 1, true);
  }

  public final boolean a(Activity paramActivity, f paramf, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.CALL");
    localIntent.setClassName("com.android.phone", "com.android.phone.OutgoingCallBroadcaster");
    if ((!TextUtils.isEmpty(paramString)) && (paramString.startsWith("+")))
      paramString = paramString.substring(1);
    Object localObject = paramf.a();
    String str = paramf.g();
    this.t = paramString;
    this.u = ((String)localObject);
    ArrayList localArrayList = new ArrayList();
    int i1 = localArrayList.size();
    localArrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
    localArrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", i1).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", paramString).withValue("data2", Integer.valueOf(0)).withValue("data3", "TextNow Proxy").build());
    ContentProviderOperation.Builder localBuilder = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", i1).withValue("mimetype", "vnd.android.cursor.item/name");
    if (TextUtils.isEmpty(str));
    while (true)
    {
      localArrayList.add(localBuilder.withValue("data1", localObject).build());
      try
      {
        this.s = this.h.getContentResolver().applyBatch("com.android.contacts", localArrayList);
        label250: if (!this.r)
        {
          this.h.registerReceiver(this.w, new IntentFilter("android.intent.action.PHONE_STATE"));
          this.r = true;
        }
        localIntent.setData(Uri.parse("tel:" + paramString));
        try
        {
          paramActivity.startActivity(localIntent);
          a(new w("cdma", paramf, true, null), 102, 2, true);
          return true;
          localObject = str;
        }
        catch (Exception localException2)
        {
          return false;
        }
      }
      catch (Exception localException1)
      {
        break label250;
      }
    }
  }

  public final boolean a(com.enflick.android.TextNow.tasks.b paramb)
  {
    return this.b.a(paramb);
  }

  public final boolean a(f paramf, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramf == null) || (TextUtils.isEmpty(paramf.a())))
      return false;
    new StringBuilder().append("trying to call: ").append(paramf.a()).toString();
    String str1;
    if (paramBoolean1)
      str1 = "textnow";
    while (true)
    {
      com.enflick.android.TextNow.ads.b.a("place_call", "contact_type", str1);
      if ((this.j != null) && (!paramBoolean2))
      {
        new StringBuilder().append("call currently active, closing: ").append(this.j.a()).append(" number: ").append(this.j.b().a()).toString();
        A();
      }
      this.g.b();
      String str2 = paramf.a();
      if (str2.endsWith("@textnow.me"))
        str2 = str2.substring(0, str2.indexOf("@textnow.me"));
      String str3 = Instance.Calls.call(null, str2, Call.DesiredMedia.voiceOnly());
      int i2;
      label183: CountDownLatch localCountDownLatch;
      if (TextUtils.isEmpty(str3))
      {
        i2 = 0;
        if (i2 != 5)
        {
          new StringBuilder().append("No network, trying again... isRegistered: ").append(M()).toString();
          localCountDownLatch = new CountDownLatch(1);
        }
      }
      try
      {
        localCountDownLatch.await(1L, TimeUnit.SECONDS);
        label233: str3 = Instance.Calls.call(null, str2, Call.DesiredMedia.voiceOnly());
        i2++;
        if (TextUtils.isEmpty(str3))
          break label183;
        String str4 = str3;
        if (TextUtils.isEmpty(str4))
        {
          a("", null, false);
          return false;
          str1 = "phone";
          continue;
          str4 = str3;
        }
        this.j = new w(str4, paramf, true, this);
        new StringBuilder().append("placeCall assigning call id: ").append(this.j.a()).toString();
        this.j.a(paramBoolean1);
        a(this.j.a(), this.j);
        S();
        if (new u(this.h).ad())
          T();
        w localw = this.j;
        if (paramBoolean1);
        for (int i1 = 102; ; i1 = 103)
        {
          a(localw, i1, 2, true);
          d(Call.State.Trying);
          if (textnow.v.b.a(c.h))
            a(AudioRoute.Receiver);
          return true;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        break label233;
      }
    }
  }

  public final void b(j paramj)
  {
    this.f.remove(paramj);
  }

  public final boolean b(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    this.g.b();
    com.enflick.android.TextNow.wear.a.a(this.h);
    w localw = f(paramString);
    Instance.Calls.rejectIncomingCall(paramString);
    new StringBuilder().append("rejectCall closing call for callId: ").append(paramString).toString();
    i(paramString);
    a(localw, 101, 1, true);
    if (!this.q.isEmpty())
    {
      this.j = ((w)this.q.values().iterator().next());
      if (K())
        O();
    }
    while (true)
    {
      return true;
      h(this.j.a());
      continue;
      this.j = null;
    }
  }

  public final boolean b(boolean paramBoolean)
  {
    if (this.j == null)
    {
      m();
      a("", null, paramBoolean);
    }
    do
    {
      return false;
      new StringBuilder().append("hanging up current call: ").append(this.j.a()).toString();
    }
    while (Instance.Calls.getCallState(this.j.a()) == Call.State.IncomingRinging);
    a(this.j.a(), paramBoolean, true);
    return true;
  }

  public final void c(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return;
    Instance.Calls.rejectIncomingCall(paramString);
    a(paramString, false, false);
  }

  public final boolean d(String paramString)
  {
    w localw = (w)this.q.get(paramString);
    if ((K()) && (this.k.c(localw)))
      return (Instance.Calls.getActiveGroup() == null) || (!Instance.Calls.getActiveGroup().equals(this.k.a()));
    Call.HoldStates localHoldStates = Instance.Calls.getHoldStates(paramString);
    return (localHoldStates.local == Call.HoldState.Held) || (localHoldStates.remote == Call.HoldState.Held);
  }

  public final String e(String paramString)
  {
    Iterator localIterator = this.q.values().iterator();
    while (localIterator.hasNext())
    {
      w localw = (w)localIterator.next();
      if (paramString.equals(localw.b().a()))
        return localw.a();
    }
    return null;
  }

  public final w f(String paramString)
  {
    return (w)this.q.get(paramString);
  }

  public final void handleThrowable(Throwable paramThrowable)
  {
    Log.getStackTraceString(paramThrowable);
  }

  public final void j()
  {
    Instance.setObserver(this);
  }

  public final a k()
  {
    return this.b;
  }

  public final boolean l()
  {
    return this.e;
  }

  public final void m()
  {
    if (h())
      this.d = AudioRoute.BluetoothSCO;
    while (true)
    {
      Instance.Audio.setCallAudioRoute(this.d);
      return;
      if (this.e)
      {
        this.d = AudioRoute.Receiver;
      }
      else
      {
        AudioManager localAudioManager = (AudioManager)this.h.getSystemService("audio");
        if ((localAudioManager != null) && (localAudioManager.isWiredHeadsetOn()))
          this.d = AudioRoute.Receiver;
        else
          this.d = AudioRoute.Speaker;
      }
    }
  }

  public final AudioRoute o()
  {
    return this.d;
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onAudioRouteChanged(AudioRoute paramAudioRoute)
  {
  }

  public final void onBalance(String paramString)
  {
  }

  public final void onCallHoldStateChanged(String paramString)
  {
    if (!d())
      return;
    if (d(paramString))
    {
      a(paramString, i.a);
      return;
    }
    a(paramString, i.b);
  }

  public final void onCallRate(String paramString)
  {
  }

  public final void onCallRepositoryChanged()
  {
  }

  public final void onCallStateChanged(String paramString)
  {
    if (!d());
    do
    {
      return;
      if (!this.q.containsKey(paramString))
        new StringBuilder().append("onCallStateChanged -- do not have: ").append(paramString).toString();
      if (this.j != null)
        new StringBuilder().append("onCallStateChanged Current active call is call id: ").append(this.j.a()).toString();
    }
    while (Instance.Calls.getHoldStates(paramString).remote == Call.HoldState.Held);
    Call.State localState = Instance.Calls.getCallState(paramString);
    new StringBuilder().append("State changed to ").append(Call.State.getLabel(localState).toString()).append(" for id ").append(paramString).toString();
    switch (7.a[localState.ordinal()])
    {
    case 4:
    default:
      return;
    case 1:
    case 2:
    case 3:
      d(localState);
      return;
    case 5:
      com.enflick.android.TextNow.ads.b.a("receive_call", "result", "picked_up");
      P();
      return;
    case 6:
    case 7:
    case 8:
      R();
      this.g.b();
      a(paramString, false, false);
      return;
    case 9:
      com.enflick.android.TextNow.ads.b.a("receive_call", "result", "missed");
    case 10:
    case 11:
    }
    this.g.b();
    R();
    String str = new String(paramString);
    Intent localIntent = new Intent("incoming_call");
    Bundle localBundle = new Bundle();
    localBundle.putString("callid", str);
    localBundle.putBoolean("to_dismiss", true);
    localIntent.putExtras(localBundle);
    m.a(this.h).a(localIntent);
    a(paramString, false, false);
  }

  public final boolean onCallThroughResult(String paramString, Callee paramCallee)
  {
    return false;
  }

  public final void onDnsSrvQueryDone(long paramLong, DnsSrvRecord[] paramArrayOfDnsSrvRecord)
  {
  }

  public final boolean onGsmDirectDial(String paramString1, String paramString2)
  {
    return false;
  }

  public final void onIncomingCall(String paramString1, String paramString2)
  {
    new StringBuilder().append("CallManager::onIncomingCall for accountId: ").append(paramString1).toString();
    if (!d());
    while (TextUtils.isEmpty(paramString2))
      return;
    new StringBuilder().append("incoming call: id ").append(paramString2).toString();
    Call.History.Record localRecord = Instance.Calls.getHistoryRecord(paramString2);
    StringBuilder localStringBuilder = new StringBuilder().append("incoming call contact: ");
    String str1;
    String str2;
    String str3;
    if (localRecord != null)
    {
      str1 = localRecord.title + " " + localRecord.callee.humanReadable();
      localStringBuilder.append(str1).toString();
      if (localRecord.callee == null)
        break label469;
      str2 = localRecord.callee.canonical();
      str3 = textnow.v.b.b(str2);
      if (str3 == null)
        break label602;
    }
    while (true)
    {
      ContentResolver localContentResolver;
      String[] arrayOfString;
      if (!TextUtils.isEmpty(str3))
      {
        localContentResolver = this.h.getContentResolver();
        arrayOfString = new String[3];
        arrayOfString[0] = str3;
        arrayOfString[1] = ("1" + str3);
        arrayOfString[2] = ("+1" + str3);
      }
      for (textnow.z.h localh = textnow.z.h.a(localContentResolver, arrayOfString); ; localh = null)
      {
        f localf = new f(str3, 2, "", null, true);
        if (localh != null)
          localf.b(localh.e());
        Instance.Calls.notifyIncomingRinging(paramString2);
        a(paramString2, new w(paramString2, localf, false, this));
        if (textnow.v.b.k(this.h))
          if (KeyguardDialerActivity.a);
        while (true)
        {
          u localu;
          String str4;
          try
          {
            KeyguardDialerActivity.a(this.h);
            localu = new u(this.h);
            if (!textnow.v.b.h(this.h))
              break label586;
            Uri localUri = RingtoneManager.getActualDefaultRingtoneUri(this.h, 1);
            if (localUri == null)
              break label578;
            str4 = localUri.toString();
            if ((localh != null) && (!TextUtils.isEmpty(localh.m())) && ((!localh.m().startsWith("android.resource")) || ((!textnow.v.b.h(this.h)) && (str4 == null))))
              str4 = localh.m();
            if (H() < 2)
            {
              this.g.a(str4);
              this.g.a();
            }
            com.enflick.android.TextNow.wear.a.a(this.h, localf, paramString2);
            Q();
            return;
            str1 = "null";
            break;
            label469: str2 = "";
          }
          catch (n localn)
          {
            localn.printStackTrace();
            continue;
          }
          a(paramString2, localf);
          continue;
          if ((m != null) && (!m.isHeld()))
            m.acquire();
          if (!TextNowApp.c())
          {
            Intent localIntent = new Intent(this.h, WelcomeActivity.class);
            localIntent.addFlags(269484032);
            this.h.startActivity(localIntent);
          }
          else
          {
            a(new String(paramString2), localf);
            continue;
            label578: str4 = "";
            continue;
            label586: str4 = localu.u();
          }
        }
      }
      label602: str3 = str2;
    }
  }

  public final void onIncomingMessage(String paramString, long paramLong)
  {
  }

  public final void onMediaStatusChanged(String paramString)
  {
  }

  public final void onMessageStateChanged(long paramLong)
  {
  }

  public final void onNetworkChangeDetected(Network paramNetwork)
  {
  }

  public final void onPushTestArrived(String paramString)
  {
  }

  public final void onPushTestScheduled(String paramString, PushTestScheduleResult paramPushTestScheduleResult)
  {
  }

  public final void onRegistrationErrorMessage(String paramString1, String paramString2)
  {
    this.c = paramString1;
    new StringBuilder().append("registering sip failed: ").append(paramString2).append(" for accountId: ").append(this.c).toString();
  }

  public final void onRegistrationStateChanged(String paramString)
  {
  }

  public final void onSecurityStatusChanged(String paramString)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
  }

  public final void onTransferOffered(String paramString)
  {
  }

  public final void onTransferResult(String paramString, boolean paramBoolean)
  {
  }

  public final void onVoicemail(String paramString)
  {
  }

  public final w p()
  {
    return this.j;
  }

  public final d q()
  {
    return this.k;
  }

  public final void r()
  {
    if (this.j == null)
      return;
    w localw2;
    if (K())
      if (this.k.c(this.j))
      {
        N();
        Iterator localIterator2 = this.q.values().iterator();
        do
        {
          if (!localIterator2.hasNext())
            break;
          localw2 = (w)localIterator2.next();
        }
        while (this.k.c(localw2));
      }
    while (true)
    {
      h(localw2.a());
      this.j = localw2;
      return;
      O();
      g(this.j.a());
      this.j = this.k.b();
      return;
      Iterator localIterator1 = this.q.values().iterator();
      w localw1;
      do
      {
        if (!localIterator1.hasNext())
          break;
        localw1 = (w)localIterator1.next();
      }
      while (localw1.a() == this.j.a());
      while (localw1 != null)
      {
        this.j = localw1;
        String str1 = this.j.a();
        String str2 = localw1.a();
        new StringBuilder().append("Changing from callId: ").append(str1).append(" to callId: ").append(str2).toString();
        g(str1);
        h(str2);
        return;
        localw1 = null;
      }
      break;
      localw2 = null;
    }
  }

  public final String ringtoneForCall(String paramString, Callee paramCallee)
  {
    return null;
  }

  public final String ringtoneForMessage(String paramString, Callee paramCallee)
  {
    return null;
  }

  public final void s()
  {
    if (this.j == null)
      return;
    w localw;
    if (K())
      if (this.k.c(this.j))
      {
        Iterator localIterator2 = this.q.values().iterator();
        while (true)
          if (localIterator2.hasNext())
          {
            localw = (w)localIterator2.next();
            if (!this.k.c(localw))
              if (localw != null)
              {
                this.k.a(localw);
                Instance.Calls.moveCall(localw.a(), this.k.a());
              }
          }
      }
    while (true)
    {
      O();
      this.l = this.k.e();
      return;
      localw = null;
      break;
      localw = this.j;
      break;
      this.k = new d(this.j.a());
      this.k.a(this.q.values());
      Iterator localIterator1 = this.q.values().iterator();
      while (localIterator1.hasNext())
        Instance.Calls.moveCall(((w)localIterator1.next()).a(), this.k.a());
    }
  }

  public final long t()
  {
    if ((this.j != null) && (this.j.e()))
      return SystemClock.uptimeMillis() - this.j.j();
    return 0L;
  }

  public final void u()
  {
    boolean bool1 = true;
    if (this.j == null)
      return;
    if (K())
    {
      if ((Instance.Calls.getActiveGroup() == null) || (!Instance.Calls.getActiveGroup().equals(this.k.a())))
      {
        Instance.Calls.setActiveGroup(this.k.a());
        return;
      }
      Instance.Calls.setActiveGroup("null");
      return;
    }
    boolean bool2;
    if (Instance.Calls.getHoldStates(this.j.a()).local == Call.HoldState.Held)
    {
      bool2 = bool1;
      if (bool2)
        break label102;
    }
    while (true)
    {
      Instance.Calls.hold(this.j.a(), bool1);
      return;
      bool2 = false;
      break;
      label102: bool1 = false;
    }
  }

  public final void v()
  {
    if (this.d == AudioRoute.Speaker)
    {
      this.d = AudioRoute.Receiver;
      Instance.Audio.setCallAudioRoute(this.d);
    }
    while (this.d != AudioRoute.Receiver)
      return;
    this.d = AudioRoute.Speaker;
    Instance.Audio.setCallAudioRoute(this.d);
  }

  public final Call.State y()
  {
    if (this.j == null)
      return Call.State.Unknown;
    return Instance.Calls.getCallState(this.j.a());
  }

  public final boolean z()
  {
    if (this.j == null)
      return false;
    return d(this.j.a());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.h
 * JD-Core Version:    0.6.2
 */