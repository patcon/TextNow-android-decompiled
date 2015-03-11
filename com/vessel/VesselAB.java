package com.vessel;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.vessel.a.b;
import com.vessel.a.c;
import com.vessel.a.f;
import com.vessel.enums.VesselEnums.TestVariation;
import com.vessel.interfaces.ABListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import textnow.b.a;

public final class VesselAB
{
  static long e = 0L;
  static long f = 0L;
  private static VesselAB g = new VesselAB();
  VesselSDK a = null;
  protected boolean b = false;
  protected HashSet<String> c = new HashSet();
  Context d = null;
  private HashMap<String, f> h = new HashMap();
  private ConcurrentHashMap<String, Long> i = new ConcurrentHashMap();
  private HashMap<String, ABListener> j = new HashMap();

  protected static VesselAB a(VesselSDK paramVesselSDK, Context paramContext)
  {
    if (g.a == null)
      g.a = paramVesselSDK;
    if (g.d == null)
      g.d = paramContext;
    return g;
  }

  private void a(String paramString, ABListener paramABListener)
  {
    try
    {
      if (!a(paramString))
      {
        paramABListener.testNotAvailable(VesselEnums.TestVariation.NOTAVAILABLE);
        return;
      }
      f localf = (f)this.h.get(paramString);
      paramABListener.testAvailable(localf.c(), localf.d());
      return;
    }
    finally
    {
    }
  }

  private void a(final String paramString1, final String paramString2, final JSONObject paramJSONObject)
  {
    try
    {
      new Thread(new Runnable()
      {
        // ERROR //
        public final void run()
        {
          // Byte code:
          //   0: aload_0
          //   1: getfield 21	com/vessel/VesselAB$3:d	Lcom/vessel/VesselAB;
          //   4: invokestatic 36	com/vessel/VesselAB:c	(Lcom/vessel/VesselAB;)Ljava/util/HashMap;
          //   7: aload_0
          //   8: getfield 23	com/vessel/VesselAB$3:a	Ljava/lang/String;
          //   11: invokevirtual 42	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
          //   14: checkcast 44	com/vessel/a/f
          //   17: astore_2
          //   18: new 46	org/json/JSONArray
          //   21: dup
          //   22: invokespecial 47	org/json/JSONArray:<init>	()V
          //   25: astore_3
          //   26: aload_2
          //   27: ifnull +55 -> 82
          //   30: new 49	org/json/JSONObject
          //   33: dup
          //   34: invokespecial 50	org/json/JSONObject:<init>	()V
          //   37: astore 4
          //   39: aload 4
          //   41: ldc 52
          //   43: aload_2
          //   44: invokevirtual 55	com/vessel/a/f:c	()Ljava/lang/String;
          //   47: invokevirtual 59	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
          //   50: pop
          //   51: aload 4
          //   53: ldc 61
          //   55: aload_2
          //   56: invokevirtual 64	com/vessel/a/f:a	()Ljava/lang/Object;
          //   59: invokevirtual 59	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
          //   62: pop
          //   63: aload 4
          //   65: ldc 66
          //   67: aload_2
          //   68: invokevirtual 68	com/vessel/a/f:b	()Ljava/lang/Object;
          //   71: invokevirtual 59	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
          //   74: pop
          //   75: aload_3
          //   76: aload 4
          //   78: invokevirtual 71	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
          //   81: pop
          //   82: aload_0
          //   83: getfield 25	com/vessel/VesselAB$3:b	Ljava/lang/String;
          //   86: aload_3
          //   87: aload_0
          //   88: getfield 27	com/vessel/VesselAB$3:c	Lorg/json/JSONObject;
          //   91: invokestatic 76	com/vessel/a/c:a	(Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONObject;)Ljava/lang/String;
          //   94: astore 10
          //   96: aload 10
          //   98: invokestatic 82	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
          //   101: ifeq +4 -> 105
          //   104: return
          //   105: aload_0
          //   106: getfield 21	com/vessel/VesselAB$3:d	Lcom/vessel/VesselAB;
          //   109: getfield 85	com/vessel/VesselAB:d	Landroid/content/Context;
          //   112: invokestatic 90	com/vessel/a/b:a	(Landroid/content/Context;)Lcom/vessel/a/b;
          //   115: aload 10
          //   117: invokevirtual 93	com/vessel/a/b:b	(Ljava/lang/String;)V
          //   120: new 95	java/lang/StringBuilder
          //   123: dup
          //   124: invokespecial 96	java/lang/StringBuilder:<init>	()V
          //   127: aload_0
          //   128: getfield 25	com/vessel/VesselAB$3:b	Ljava/lang/String;
          //   131: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   134: ldc 102
          //   136: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   139: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   142: pop
          //   143: aload_0
          //   144: getfield 21	com/vessel/VesselAB$3:d	Lcom/vessel/VesselAB;
          //   147: getfield 108	com/vessel/VesselAB:a	Lcom/vessel/VesselSDK;
          //   150: ifnull +18 -> 168
          //   153: aload_0
          //   154: getfield 21	com/vessel/VesselAB$3:d	Lcom/vessel/VesselAB;
          //   157: getfield 108	com/vessel/VesselAB:a	Lcom/vessel/VesselSDK;
          //   160: invokevirtual 112	com/vessel/VesselSDK:d	()V
          //   163: return
          //   164: astore_1
          //   165: return
          //   166: astore 5
          //   168: return
          //
          // Exception table:
          //   from	to	target	type
          //   0	26	164	java/lang/Exception
          //   30	39	164	java/lang/Exception
          //   82	104	164	java/lang/Exception
          //   105	163	164	java/lang/Exception
          //   39	82	166	java/lang/Exception
        }
      }
      , "checkpoint_reporter").start();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void a(final String paramString, final JSONObject paramJSONObject)
  {
    try
    {
      new Thread(new Runnable()
      {
        public final void run()
        {
          try
          {
            String str = c.a(paramString, VesselAB.b(VesselAB.this), paramJSONObject);
            if (TextUtils.isEmpty(str))
              return;
            b.a(VesselAB.this.d).b(str);
            new StringBuilder().append(paramString).append(" saved successfully.").toString();
            if (VesselAB.this.a != null)
            {
              VesselAB.this.a.d();
              return;
            }
          }
          catch (Exception localException)
          {
          }
        }
      }
      , "checkpoint_reporter").start();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private boolean a(String paramString)
  {
    try
    {
      if ((this.h == null) || (!this.h.containsKey(paramString)))
      {
        new StringBuilder().append(paramString).append(" is not available for this device.").toString();
        return false;
      }
      return true;
    }
    finally
    {
    }
  }

  public static void activateTest(final String paramString)
  {
    if (!d());
    while (!g.a(paramString))
      return;
    synchronized (g)
    {
      if ((g.c != null) && (g.c.contains(paramString)))
      {
        new StringBuilder().append(paramString).append("already active.").toString();
        return;
      }
    }
    final f localf = (f)g.h.get(paramString);
    if (localf == null)
      return;
    ???.c.add(paramString);
    new Thread(new Runnable()
    {
      public final void run()
      {
        try
        {
          b localb = b.a(VesselAB.this.d);
          localb.a(localf.c());
          String str = c.a(localf);
          if (TextUtils.isEmpty(str))
            return;
          new StringBuilder().append(paramString).append(" is now activated").toString();
          if (!TextUtils.isEmpty(str))
          {
            localb.b(str);
            if (VesselAB.this.a != null)
            {
              VesselAB.this.a.d();
              return;
            }
          }
        }
        catch (Exception localException)
        {
        }
      }
    }).start();
  }

  private boolean b(String paramString)
  {
    try
    {
      if ((this.c == null) || (!this.c.contains(paramString)))
      {
        new StringBuilder().append(paramString).append(" is not active, Call VesselAB.activateTest(TEST_NAME) to activate this test").toString();
        return false;
      }
      return true;
    }
    finally
    {
    }
  }

  private JSONArray c()
  {
    try
    {
      JSONArray localJSONArray = new JSONArray();
      if ((this.c != null) && (this.h != null))
      {
        Iterator localIterator = this.c.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          f localf = (f)this.h.get(str);
          if (localf != null)
          {
            JSONObject localJSONObject = new JSONObject();
            try
            {
              localJSONObject.put("name", localf.c());
              localJSONObject.put("test_id", localf.a());
              localJSONObject.put("variation_id", localf.b());
              localJSONArray.put(localJSONObject);
            }
            catch (JSONException localJSONException)
            {
            }
          }
        }
      }
      return localJSONArray;
    }
    finally
    {
    }
  }

  private static boolean d()
  {
    if (g != null);
    for (int k = 1; (k != 0) && (g.a != null) && (g.a.a()); k = 0)
      return true;
    return false;
  }

  public static void discardAllSession()
  {
    if ((isAnyTestActive()) && (g.i != null))
      g.i.clear();
  }

  public static void endAllSessions()
  {
    if (isAnyTestActive())
      new Thread(new Runnable()
      {
        public final void run()
        {
          try
          {
            HashMap localHashMap = new HashMap(VesselAB.a(VesselAB.this));
            VesselAB.a(VesselAB.this).clear();
            List localList = c.a(localHashMap, this.a, VesselAB.b(VesselAB.this));
            if (localList == null)
              return;
            b.a(VesselAB.this.d).a(localList);
            if (VesselAB.this.a != null)
            {
              VesselAB.this.a.d();
              return;
            }
          }
          catch (Exception localException)
          {
          }
        }
      }).start();
  }

  public static void endSession(final String paramString)
  {
    if ((isAnyTestActive()) && (!TextUtils.isEmpty(paramString)) && (g.i != null) && (g.i.containsKey(paramString)))
      new Thread(new Runnable()
      {
        public final void run()
        {
          try
          {
            if ((VesselAB.a(VesselAB.this) != null) && (!VesselAB.a(VesselAB.this).isEmpty()) && (VesselAB.a(VesselAB.this).containsKey(paramString)))
            {
              long l = ((Long)VesselAB.a(VesselAB.this).get(paramString)).longValue();
              if (l > 0L)
              {
                JSONObject localJSONObject = c.a(paramString, l, this.b, VesselAB.b(VesselAB.this));
                if (localJSONObject == null)
                  return;
                b.a(VesselAB.this.d).b(localJSONObject.toString());
                if (VesselAB.this.a != null)
                  VesselAB.this.a.d();
              }
            }
            else
            {
              new StringBuilder("No session with name ").append(paramString).append(" in progress.").toString();
            }
            return;
          }
          catch (Exception localException)
          {
          }
        }
      }).start();
  }

  public static long getTestId(String paramString)
  {
    if (isTestActive(paramString))
      try
      {
        f localf = (f)g.h.get(paramString);
        if (localf != null)
        {
          long l = ((Long)localf.a()).longValue();
          return l;
        }
      }
      catch (Exception localException)
      {
      }
    return 0L;
  }

  public static long getValue(String paramString1, String paramString2, long paramLong)
  {
    String str;
    if (isTestActive(paramString1))
    {
      f localf = (f)g.h.get(paramString1);
      if (localf != null)
      {
        str = localf.a(paramString2);
        if (TextUtils.isEmpty(str));
      }
    }
    try
    {
      long l = Long.parseLong(str);
      paramLong = l;
      return paramLong;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return paramLong;
  }

  public static String getValue(String paramString1, String paramString2, String paramString3)
  {
    if (isTestActive(paramString1))
    {
      f localf = (f)g.h.get(paramString1);
      if (localf != null)
      {
        String str = localf.a(paramString2);
        if (!TextUtils.isEmpty(str))
          paramString3 = str;
      }
    }
    return paramString3;
  }

  public static void getVariationForTest(String paramString, ABListener paramABListener)
  {
    if (paramABListener != null);
    while (true)
    {
      try
      {
        boolean bool = TextUtils.isEmpty(paramString);
        if (bool)
          return;
        if (paramABListener == null)
          continue;
        synchronized (g)
        {
          if (???.b)
            ???.a(paramString, paramABListener);
        }
      }
      finally
      {
      }
      ???.j.put(paramString, paramABListener);
    }
  }

  public static boolean isAnyTestActive()
  {
    return (d()) && (g.c != null) && (g.c.size() > 0);
  }

  public static boolean isTestActive(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    while ((!d()) || (!g.a(paramString)) || (!g.b(paramString)))
      return false;
    return true;
  }

  public static boolean isTestVariationRunning(String paramString, VesselEnums.TestVariation paramTestVariation)
  {
    if ((paramString == null) || (paramTestVariation == null))
      return false;
    if (isTestActive(paramString))
    {
      f localf = (f)g.h.get(paramString);
      if (localf != null)
        return (paramString.equals(localf.c())) && (localf.d() == paramTestVariation);
    }
    return false;
  }

  public static void onPause(Activity paramActivity)
  {
    String str;
    VesselAB localVesselAB;
    if (d())
    {
      str = null;
      if (paramActivity != null)
        str = paramActivity.getClass().getSimpleName();
      localVesselAB = g;
    }
    try
    {
      long l = System.currentTimeMillis() / 1000L;
      if (isAnyTestActive())
      {
        if (l - f > 0L)
        {
          f = l;
          new a()
          {
            public final void a()
            {
              if (System.currentTimeMillis() / 1000L - VesselAB.e > 1L)
              {
                VesselAB.endSession("__vse_app_ses__");
                VesselAB.e = 0L;
                VesselAB.f = 0L;
              }
            }
          }
          .b();
        }
        endSession(str);
      }
      if ((localVesselAB.a != null) && (localVesselAB.a.a()))
        localVesselAB.a.c();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static void onResume(Activity paramActivity)
  {
    if (d())
    {
      String str = null;
      if (paramActivity != null)
        str = paramActivity.getClass().getSimpleName();
      VesselAB localVesselAB = g;
      long l = System.currentTimeMillis() / 1000L;
      if (isAnyTestActive())
      {
        if (l - e > 0L)
        {
          e = l;
          if (l - f > 1L)
            startSession("__vse_app_ses__");
        }
        startSession(str);
        reportCheckpoint(str);
      }
      if ((localVesselAB.a != null) && (localVesselAB.a.a()))
        localVesselAB.a.c();
    }
  }

  public static void reportCheckpoint(String paramString)
  {
    if ((isAnyTestActive()) && (!TextUtils.isEmpty(paramString)))
      g.a(paramString, null);
  }

  public static void reportCheckpoint(String paramString1, String paramString2)
  {
    if ((isTestActive(paramString1)) && (!TextUtils.isEmpty(paramString2)))
      g.a(paramString1, paramString2, null);
  }

  public static void reportCheckpoint(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    if ((isTestActive(paramString1)) && (!TextUtils.isEmpty(paramString2)) && (paramJSONObject != null))
      g.a(paramString1, paramString2, paramJSONObject);
  }

  public static void reportCheckpoint(String paramString, JSONObject paramJSONObject)
  {
    if ((isAnyTestActive()) && (!TextUtils.isEmpty(paramString)) && (paramJSONObject != null))
      g.a(paramString, paramJSONObject);
  }

  public static void startSession(String paramString)
  {
    long l;
    if ((isAnyTestActive()) && (!TextUtils.isEmpty(paramString)) && (g.i != null))
    {
      int k = g.i.size();
      l = System.nanoTime();
      if (k < 20)
      {
        if (!g.i.containsKey(paramString))
          break label87;
        if (!paramString.equalsIgnoreCase("__vse_app_ses__"))
          new StringBuilder().append(paramString).append(" session already started.").toString();
      }
    }
    return;
    label87: g.i.put(paramString, Long.valueOf(l));
  }

  public static VesselEnums.TestVariation whichVariation(String paramString)
  {
    if (isTestActive(paramString))
      return ((f)g.h.get(paramString)).d();
    return VesselEnums.TestVariation.NOTAVAILABLE;
  }

  protected final void a()
  {
    try
    {
      this.b = true;
      try
      {
        if ((this.j != null) && (!this.j.isEmpty()))
        {
          Iterator localIterator = new HashMap(this.j).entrySet().iterator();
          while (localIterator.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)localIterator.next();
            ABListener localABListener = (ABListener)localEntry.getValue();
            String str = (String)localEntry.getKey();
            a(str, localABListener);
            this.j.remove(str);
          }
        }
      }
      finally
      {
      }
    }
    finally
    {
    }
  }

  protected final void b()
  {
    try
    {
      if ((this.a == null) || (!this.a.a()))
        return;
      try
      {
        HashMap localHashMap = b.a(this.d).a();
        if ((this.h != null) && (this.h.size() > 0))
          this.h.clear();
        if ((this.c != null) && (this.c.size() > 0))
          this.c.clear();
        if (this.h != null)
        {
          this.h.putAll(localHashMap);
          Iterator localIterator = this.h.entrySet().iterator();
          while (localIterator.hasNext())
          {
            f localf = (f)((Map.Entry)localIterator.next()).getValue();
            if (localf.f())
              this.c.add(localf.c());
          }
        }
      }
      catch (Exception localException)
      {
        localException.getMessage();
        return;
      }
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.vessel.VesselAB
 * JD-Core Version:    0.6.2
 */