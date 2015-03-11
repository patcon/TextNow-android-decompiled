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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
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
import textnow.u.n;
import textnow.u.r;

public final class d
  implements SensorEventListener, h, Observer
{
  private static boolean a;
  private static d i;
  private static PowerManager.WakeLock m;
  private static PowerManager.WakeLock n;
  private static WifiManager.WifiLock o;
  private a b;
  private String c = null;
  private AudioRoute d;
  private boolean e = this.h.getPackageManager().hasSystemFeature("android.hardware.telephony");
  private Set<f> f = new HashSet();
  private u g;
  private TextNowApp h = TextNowApp.a();
  private s j;
  private c k;
  private int l = 0;
  private s p = null;
  private Map<String, s> q = new HashMap();
  private boolean r = false;
  private ContentProviderResult[] s;
  private String t = null;
  private String u = null;
  private BroadcastReceiver v = new BroadcastReceiver()
  {
    public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (paramAnonymousIntent.getStringExtra("state").equals(TelephonyManager.EXTRA_STATE_IDLE))
      {
        d.a(d.this);
        d.b(d.this);
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
  private d()
  {
    TextNowApp localTextNowApp = this.h;
    new StringBuilder().append("Initialized softphone with accountId: ").append(this.c).toString();
    Instance.init(localTextNowApp, Preferences.class);
    Instance.setObserver(this);
    if (textnow.q.a.a)
      Instance.Log.setEnabled(true);
    if (textnow.q.b.b())
      Instance.preferences.volumeBoostPlayback.set(Integer.valueOf(6));
    if (textnow.q.b.c())
      Instance.preferences.samplingRateOverride.overrideDefault(Integer.valueOf(32000));
    PowerManager localPowerManager;
    n localn;
    int i1;
    label403: int i2;
    if (textnow.q.b.d())
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
      if (textnow.q.b.a(textnow.q.c.g))
      {
        Instance.preferences.legacyAudio.set(Boolean.valueOf(true));
        Instance.preferences.samplingRateOverride.overrideDefault(Integer.valueOf(8000));
      }
      Instance.Settings.flushChanges();
      m();
      this.g = u.a(this.h);
      localPowerManager = (PowerManager)this.h.getSystemService("power");
      WifiManager localWifiManager = (WifiManager)this.h.getSystemService("wifi");
      if (Build.VERSION.SDK_INT >= 12)
        o = localWifiManager.createWifiLock(3, "in call wifi lock");
      localn = new n(this.h);
      b localb1 = new b();
      if (!textnow.q.a.a)
        break label579;
      i1 = a.a;
      b localb2 = localb1.a(i1);
      if (!textnow.q.a.a)
        break label592;
      i2 = a.b;
      label423: this.b = localb2.b(i2).a();
    }
    while (true)
    {
      boolean bool;
      try
      {
        int i3 = ((Integer)PowerManager.class.getDeclaredField("PROXIMITY_SCREEN_OFF_WAKE_LOCK").get(null)).intValue();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 17)
        {
          Class localClass = localPowerManager.getClass();
          Class[] arrayOfClass = new Class[1];
          arrayOfClass[0] = Integer.TYPE;
          Method localMethod = localClass.getDeclaredMethod("isWakeLockLevelSupported", arrayOfClass);
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(i3);
          bool = ((Boolean)localMethod.invoke(localPowerManager, arrayOfObject)).booleanValue();
          break label668;
          if (i5 != 0)
          {
            PowerManager.WakeLock localWakeLock = localPowerManager.newWakeLock(i3, "On Call Proximity Lock");
            n = localWakeLock;
            localWakeLock.setReferenceCounted(false);
          }
          return;
          Instance.preferences.volumeBoostMicrophone.set(Integer.valueOf(3));
          break;
          label579: i1 = localn.b(a.a);
          break label403;
          label592: i2 = localn.d(a.b);
          break label423;
        }
        i5 = 0;
        if (i4 < 14)
          continue;
        int i6 = ((Integer)localPowerManager.getClass().getDeclaredMethod("getSupportedWakeLockFlags", new Class[0]).invoke(localPowerManager, new Object[0])).intValue();
        if ((i6 & i3) != 0)
          bool = true;
        else
          bool = false;
      }
      catch (Exception localException)
      {
        return;
      }
      label668: int i5 = bool;
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

  private boolean L()
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

  private void M()
  {
    if (this.k == null);
    while (this.k.c())
      return;
    Instance.Calls.setActiveGroup("null");
    a(this.k.b().a(), e.a);
  }

  private void N()
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
          h(((s)localIterator.next()).a());
      }
    }
  }

  private void O()
  {
    P();
    if ((this.j != null) && (!this.j.e()))
    {
      Instance.Audio.setCallAudioRoute(this.d);
      this.j.f();
      this.j.g();
      d(Call.State.Established);
    }
  }

  private void P()
  {
    if (a(this.h).isHeld())
      a(this.h).release();
  }

  private static void Q()
  {
    if ((o != null) && (!o.isHeld()))
      o.acquire();
  }

  private static void R()
  {
    if ((n != null) && (!n.isHeld()))
      n.acquire();
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

  public static d a()
  {
    if (!a)
      throw new j();
    if (i == null);
    try
    {
      i = new d();
      return i;
    }
    catch (LinkageError localLinkageError)
    {
      a = false;
      throw new j(localLinkageError);
    }
  }

  private void a(final s params, final int paramInt1, final int paramInt2, boolean paramBoolean)
  {
    new AsyncTask()
    {
    }
    .execute(new Void[0]);
  }

  private void a(String paramString, e parame)
  {
    Iterator localIterator = new HashSet(this.f).iterator();
    while (localIterator.hasNext())
      ((f)localIterator.next()).a(paramString, parame);
  }

  private void a(String paramString, s params)
  {
    new StringBuilder().append("Adding callId: ").append(paramString).append(" for call: ").append(params.toString()).toString();
    this.q.put(paramString, params);
  }

  private void a(String paramString, textnow.u.d paramd)
  {
    Intent localIntent = new Intent("incoming_call");
    Bundle localBundle = new Bundle();
    localBundle.putString("callid", paramString);
    localBundle.putSerializable("contact", paramd);
    localIntent.putExtras(localBundle);
    m.a(this.h).a(localIntent);
  }

  private void a(String paramString, textnow.u.f paramf, boolean paramBoolean)
  {
    Iterator localIterator = new HashSet(this.f).iterator();
    while (localIterator.hasNext())
      ((f)localIterator.next()).a(paramString, paramf, paramBoolean);
  }

  private void a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    new StringBuilder().append("onCallEnded for: ").append(paramString).append(" mActiveCall is ").append(this.j).toString();
    textnow.u.f localf;
    label249: e locale;
    if (this.j == null)
    {
      localf = null;
      if (this.j != null)
        new StringBuilder().append("Current active call is call id: [").append(this.j.a()).append("] arg is [").append(paramString).append("]").toString();
      if ((this.j == null) || (!this.j.a().equals(paramString)) || ((!paramBoolean2) && (J())))
        break label375;
      m();
      this.j.h();
      if (this.j != null)
      {
        this.j.b(paramBoolean1);
        int i1 = (int)(0.5D + (this.j.k() - this.j.j()) / 1000L);
        if (this.j.n() != null)
        {
          ContentValues localContentValues = new ContentValues();
          localContentValues.put("message_text", String.valueOf(i1));
          this.h.getContentResolver().update(this.j.n(), localContentValues, null, null);
        }
      }
      A();
      if (!paramBoolean1)
        break label364;
      a(paramString, localf, true);
      if (this.q.isEmpty())
        break label420;
      this.j = ((s)this.q.values().iterator().next());
      if (Instance.Calls.getHoldStates(this.j.a()).local != Call.HoldState.Held)
        break label412;
      locale = e.a;
      label311: a(this.j.a(), locale);
      new StringBuilder().append("onCallEnded assigning call id: ").append(this.j.a()).toString();
    }
    label364: label375: 
    do
    {
      return;
      localf = this.j.m();
      break;
      a(paramString, localf, false);
      break label249;
      new StringBuilder().append("Closing not current call call id: ").append(paramString).toString();
      i(paramString);
      a(paramString, localf, false);
      break label249;
      locale = e.b;
      break label311;
      this.j = null;
      if ((n != null) && (n.isHeld()))
        n.release();
    }
    while ((o == null) || (!o.isHeld()));
    label412: label420: o.release();
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
      ((f)localIterator.next()).a(paramLong);
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
      ((f)localIterator.next()).a();
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
          r localr = new r(localContext);
          n localn = new n(localContext);
          String str1 = localn.f();
          if (str1 == null)
            str1 = localr.D();
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = localr.E();
          arrayOfObject[1] = localr.F();
          arrayOfObject[2] = str1;
          XMLTree localXMLTree = XMLTree.parse(String.format("<account><username>%1$s</username><password>%2$s</password><host>%3$s</host><keepAwake>1</keepAwake><dtmfOrder>rfc2833,audio</dtmfOrder><natTraversal>auto</natTraversal><ringingTone>periodic(sine(2000ms,2000,440Hz,480Hz),silence(4000ms))</ringingTone></account>", arrayOfObject));
          String str2 = localn.e();
          if (str2 != null)
            localXMLTree.setChildValue("proxy", str2);
          localXMLTree.setAttribute("id", "TextNow SIP Account");
          String str3 = localn.d();
          if (str3 == null)
            str3 = localn.c();
          localXMLTree.setChildValue("codecOrder3G", str3);
          localXMLTree.setChildValue("codecOrder", str3);
          String str4 = Instance.Registration.saveAccount(localXMLTree, this.a);
          new StringBuilder().append("Saved account: ").append(str4).toString();
          return;
        }
        catch (LinkageError localLinkageError)
        {
          d.c(false);
          return;
        }
        catch (Throwable localThrowable)
        {
          d.c(false);
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
    catch (j localj)
    {
      while (true)
        a = false;
    }
  }

  // ERROR //
  public static boolean e()
  {
    // Byte code:
    //   0: invokestatic 838	com/enflick/android/TextNow/activities/phone/d:d	()Z
    //   3: istore_0
    //   4: iconst_0
    //   5: istore_1
    //   6: iload_0
    //   7: ifeq +24 -> 31
    //   10: invokestatic 836	com/enflick/android/TextNow/activities/phone/d:a	()Lcom/enflick/android/TextNow/activities/phone/d;
    //   13: invokespecial 840	com/enflick/android/TextNow/activities/phone/d:L	()Z
    //   16: istore 4
    //   18: iconst_0
    //   19: istore_1
    //   20: iload 4
    //   22: ifne +9 -> 31
    //   25: iconst_0
    //   26: invokestatic 842	com/enflick/android/TextNow/activities/phone/d:d	(Z)V
    //   29: iconst_1
    //   30: istore_1
    //   31: iload_1
    //   32: ireturn
    //   33: astore_2
    //   34: new 143	java/lang/StringBuilder
    //   37: dup
    //   38: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   41: ldc_w 844
    //   44: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: aload_2
    //   48: invokevirtual 845	java/lang/Exception:toString	()Ljava/lang/String;
    //   51: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
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
    //   25	29	60	com/enflick/android/TextNow/activities/phone/j
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
          d.a().A();
          d.a();
          d.i();
          return;
        }
        catch (LinkageError localLinkageError)
        {
          d.c(false);
          return;
        }
        catch (Throwable localThrowable)
        {
          d.c(false);
        }
      }
    });
  }

  private void g(String paramString)
  {
    if ((s)this.q.get(paramString) == null)
      return;
    Instance.Calls.hold(paramString, true);
    a(paramString, e.a);
  }

  private void h(String paramString)
  {
    if ((s)this.q.get(paramString) == null)
      return;
    Instance.Calls.hold(paramString, false);
    a(paramString, e.b);
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
      s locals1;
      do
      {
        do
          return;
        while (!this.q.containsKey(paramString));
        Instance.Calls.hangup(paramString);
        Instance.Calls.close(paramString);
        locals1 = (s)this.q.get(paramString);
        new StringBuilder().append("Removing callId: ").append(paramString).toString();
        s locals2 = (s)this.q.remove(paramString);
        if (locals2 != null)
          this.p = locals2;
      }
      while (!J());
      if (this.k.c(locals1))
        this.k.b(locals1);
    }
    while (this.k.e() > 1);
    this.k = null;
    com.enflick.android.TextNow.ads.a.a("place_conference_call", "max_size", String.valueOf(this.l));
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
      if (J())
      {
        Iterator localIterator = new ArrayList(this.k.d()).iterator();
        while (localIterator.hasNext())
        {
          s locals = (s)localIterator.next();
          new StringBuilder().append("closeCurrentCall closing call for callId: ").append(this.j.a()).toString();
          i(locals.a());
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
      this.j = ((s)this.q.values().iterator().next());
    if (y() != Call.State.IncomingRinging);
    s locals;
    do
    {
      return;
      Iterator localIterator;
      while (!localIterator.hasNext())
        localIterator = this.q.values().iterator();
      locals = (s)localIterator.next();
    }
    while (y() != Call.State.IncomingRinging);
    Instance.Calls.getCallee(locals.a());
    a(locals.a(), locals.b());
  }

  public final s F()
  {
    return this.p;
  }

  public final Collection<s> G()
  {
    return new HashSet(this.q.values());
  }

  public final int H()
  {
    return this.q.size();
  }

  public final void I()
  {
    if (this.q.isEmpty());
    while (true)
    {
      return;
      Iterator localIterator = this.q.values().iterator();
      while (localIterator.hasNext())
        ((s)localIterator.next()).toString();
    }
  }

  public final boolean J()
  {
    return (this.k != null) && (!this.k.c());
  }

  public final boolean K()
  {
    return this.k.e() >= 10;
  }

  public final void a(long paramLong)
  {
    if ((this.j != null) && (this.j.c()) && (!this.j.d()))
    {
      int i1 = (int)(paramLong / 60L);
      if (new r(this.h).C() - i1 <= 0)
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

  public final void a(f paramf)
  {
    if (!this.f.contains(paramf))
      this.f.add(paramf);
  }

  public final void a(AudioRoute paramAudioRoute)
  {
    this.d = paramAudioRoute;
    Instance.Audio.setCallAudioRoute(this.d);
  }

  public final void a(String paramString)
  {
    I();
    s locals = (s)this.q.get(paramString);
    if (locals == null)
    {
      new StringBuilder().append("Couldn't find call to answer for callId: ").append(paramString).toString();
      return;
    }
    Call.State localState = Instance.Calls.getCallState(locals.a());
    if (localState != Call.State.IncomingRinging)
    {
      new StringBuilder().append("Call is not ringing for callId: ").append(paramString).append(" State: ").append(localState.toString()).toString();
      return;
    }
    new StringBuilder().append("answer call from id: ").append(locals.a()).append(" number: ").append(locals.b().a()).toString();
    if (this.j != null)
    {
      if (!J())
        break label246;
      M();
    }
    while (true)
    {
      this.g.b();
      this.j = locals;
      new StringBuilder().append("answerCall assigning call id: ").append(this.j.a()).toString();
      if (Instance.Calls.answerIncomingCall(this.j.a(), Call.DesiredMedia.voiceOnly()))
        break;
      new StringBuilder().append("Couldn't answer call for callId: ").append(this.j.a()).toString();
      A();
      a(paramString, null, false);
      return;
      label246: g(this.j.a());
    }
    Q();
    if (new r(this.h).ae())
      R();
    a(this.j, 100, 1, true);
  }

  public final boolean a(Activity paramActivity, textnow.u.d paramd, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.CALL");
    localIntent.setClassName("com.android.phone", "com.android.phone.OutgoingCallBroadcaster");
    if ((!TextUtils.isEmpty(paramString)) && (paramString.startsWith("+")))
      paramString = paramString.substring(1);
    Object localObject = paramd.a();
    String str = paramd.g();
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
          this.h.registerReceiver(this.v, new IntentFilter("android.intent.action.PHONE_STATE"));
          this.r = true;
        }
        localIntent.setData(Uri.parse("tel:" + paramString));
        try
        {
          paramActivity.startActivity(localIntent);
          a(new s("cdma", paramd, true, null), 102, 2, true);
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

  public final boolean a(textnow.u.d paramd, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramd == null) || (TextUtils.isEmpty(paramd.a())))
      return false;
    new StringBuilder().append("trying to call: ").append(paramd.a()).toString();
    String str1;
    if (paramBoolean1)
      str1 = "textnow";
    while (true)
    {
      com.enflick.android.TextNow.ads.a.a("place_call", "contact_type", str1);
      if ((this.j != null) && (!paramBoolean2))
      {
        new StringBuilder().append("call currently active, closing: ").append(this.j.a()).append(" number: ").append(this.j.b().a()).toString();
        A();
      }
      this.g.b();
      String str2 = paramd.a();
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
          new StringBuilder().append("No network, trying again... isRegistered: ").append(L()).toString();
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
        this.j = new s(str4, paramd, true, this);
        new StringBuilder().append("placeCall assigning call id: ").append(this.j.a()).toString();
        this.j.a(paramBoolean1);
        a(this.j.a(), this.j);
        Q();
        if (new r(this.h).ae())
          R();
        s locals = this.j;
        if (paramBoolean1);
        for (int i1 = 102; ; i1 = 103)
        {
          a(locals, i1, 2, true);
          d(Call.State.Trying);
          if (textnow.q.b.a(textnow.q.c.g))
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

  public final void b(f paramf)
  {
    this.f.remove(paramf);
  }

  public final boolean b(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    this.g.b();
    s locals = f(paramString);
    Instance.Calls.rejectIncomingCall(paramString);
    new StringBuilder().append("rejectCall closing call for callId: ").append(paramString).toString();
    i(paramString);
    a(locals, 101, 1, true);
    if (!this.q.isEmpty())
    {
      this.j = ((s)this.q.values().iterator().next());
      if (J())
        N();
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
    s locals = (s)this.q.get(paramString);
    if ((J()) && (this.k.c(locals)))
      return (Instance.Calls.getActiveGroup() == null) || (!Instance.Calls.getActiveGroup().equals(this.k.a()));
    Call.HoldStates localHoldStates = Instance.Calls.getHoldStates(paramString);
    return (localHoldStates.local == Call.HoldState.Held) || (localHoldStates.remote == Call.HoldState.Held);
  }

  public final String e(String paramString)
  {
    Iterator localIterator = this.q.values().iterator();
    while (localIterator.hasNext())
    {
      s locals = (s)localIterator.next();
      if (paramString.equals(locals.b().a()))
        return locals.a();
    }
    return null;
  }

  public final s f(String paramString)
  {
    return (s)this.q.get(paramString);
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
      a(paramString, e.a);
      return;
    }
    a(paramString, e.b);
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
    switch (6.a[localState.ordinal()])
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
      com.enflick.android.TextNow.ads.a.a("receive_call", "result", "picked_up");
      O();
      return;
    case 6:
    case 7:
    case 8:
      P();
      this.g.b();
      a(paramString, false, false);
      return;
    case 9:
      com.enflick.android.TextNow.ads.a.a("receive_call", "result", "missed");
    case 10:
    case 11:
    }
    this.g.b();
    P();
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
    label119: String str2;
    String str3;
    if (localRecord != null)
    {
      str1 = localRecord.title + " " + localRecord.callee.humanReadable();
      localStringBuilder.append(str1).toString();
      if (localRecord.callee == null)
        break label455;
      str2 = localRecord.callee.canonical();
      str3 = textnow.q.b.b(str2);
      if (str3 == null)
        break label567;
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
      for (textnow.u.f localf = textnow.u.f.a(localContentResolver, arrayOfString); ; localf = null)
      {
        textnow.u.d locald = new textnow.u.d(str3, 2, "", null, true);
        if (localf != null)
          locald.b(localf.e());
        Instance.Calls.notifyIncomingRinging(paramString2);
        a(paramString2, new s(paramString2, locald, false, this));
        if (textnow.q.b.l(this.h))
          if (KeyguardDialerActivity.b);
        while (true)
        {
          r localr;
          String str4;
          try
          {
            KeyguardDialerActivity.a(this.h);
            localr = new r(this.h);
            if (!textnow.q.b.i(this.h))
              break label551;
            Uri localUri = RingtoneManager.getActualDefaultRingtoneUri(this.h, 1);
            if (localUri == null)
              break label543;
            str4 = localUri.toString();
            if ((localf != null) && (!TextUtils.isEmpty(localf.m())) && ((!localf.m().startsWith("android.resource")) || ((!textnow.q.b.i(this.h)) && (str4 == null))))
              str4 = localf.m();
            if (H() >= 2)
              break;
            this.g.a(str4);
            this.g.a();
            return;
            str1 = "null";
            break label119;
            label455: str2 = "";
          }
          catch (j localj)
          {
            localj.printStackTrace();
            continue;
          }
          a(paramString2, locald);
          continue;
          if (!TextNowApp.c())
          {
            Intent localIntent = new Intent(this.h, WelcomeActivity.class);
            localIntent.addFlags(269484032);
            this.h.startActivity(localIntent);
          }
          else
          {
            a(new String(paramString2), locald);
            continue;
            label543: str4 = "";
            continue;
            label551: str4 = localr.w();
          }
        }
      }
      label567: str3 = str2;
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

  public final s p()
  {
    return this.j;
  }

  public final c q()
  {
    return this.k;
  }

  public final void r()
  {
    if (this.j == null)
      return;
    s locals2;
    if (J())
      if (this.k.c(this.j))
      {
        M();
        Iterator localIterator2 = this.q.values().iterator();
        do
        {
          if (!localIterator2.hasNext())
            break;
          locals2 = (s)localIterator2.next();
        }
        while (this.k.c(locals2));
      }
    while (true)
    {
      h(locals2.a());
      this.j = locals2;
      return;
      N();
      g(this.j.a());
      this.j = this.k.b();
      return;
      Iterator localIterator1 = this.q.values().iterator();
      s locals1;
      do
      {
        if (!localIterator1.hasNext())
          break;
        locals1 = (s)localIterator1.next();
      }
      while (locals1.a() == this.j.a());
      while (locals1 != null)
      {
        this.j = locals1;
        String str1 = this.j.a();
        String str2 = locals1.a();
        new StringBuilder().append("Changing from callId: ").append(str1).append(" to callId: ").append(str2).toString();
        g(str1);
        h(str2);
        return;
        locals1 = null;
      }
      break;
      locals2 = null;
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
    s locals;
    if (J())
      if (this.k.c(this.j))
      {
        Iterator localIterator2 = this.q.values().iterator();
        while (true)
          if (localIterator2.hasNext())
          {
            locals = (s)localIterator2.next();
            if (!this.k.c(locals))
              if (locals != null)
              {
                this.k.a(locals);
                Instance.Calls.moveCall(locals.a(), this.k.a());
              }
          }
      }
    while (true)
    {
      N();
      this.l = this.k.e();
      return;
      locals = null;
      break;
      locals = this.j;
      break;
      this.k = new c(this.j.a());
      this.k.a(this.q.values());
      Iterator localIterator1 = this.q.values().iterator();
      while (localIterator1.hasNext())
        Instance.Calls.moveCall(((s)localIterator1.next()).a(), this.k.a());
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
    if (J())
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.d
 * JD-Core Version:    0.6.2
 */