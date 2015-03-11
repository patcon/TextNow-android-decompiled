package com.admarvel.android.util.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.admarvel.android.ads.AdFetcher.Adtype;
import com.admarvel.android.ads.AdMarvelAd;
import java.util.Map;

public class b
{
  public static String a(String paramString1, String paramString2)
  {
    try
    {
      Object localObject = a.a(null, "readData").a(Class.forName("com.admarvel.android.offlinesdk.AdmarvelOfflineUtils")).a(String.class, paramString1).a(String.class, paramString2).a();
      if ((localObject != null) && ((localObject instanceof String)))
      {
        String str = (String)localObject;
        return str;
      }
    }
    catch (Exception localException)
    {
      return null;
    }
    return null;
  }

  // ERROR //
  public static void a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aconst_null
    //   4: ldc 42
    //   6: invokestatic 19	com/admarvel/android/util/a/a:a	(Ljava/lang/Object;Ljava/lang/String;)Lcom/admarvel/android/util/a/c$a;
    //   9: ldc 21
    //   11: invokestatic 27	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   14: invokevirtual 32	com/admarvel/android/util/a/c$a:a	(Ljava/lang/Class;)Lcom/admarvel/android/util/a/c$a;
    //   17: invokevirtual 40	com/admarvel/android/util/a/c$a:a	()Ljava/lang/Object;
    //   20: pop
    //   21: ldc 2
    //   23: monitorexit
    //   24: return
    //   25: astore_1
    //   26: ldc 2
    //   28: monitorexit
    //   29: aload_1
    //   30: athrow
    //   31: astore_0
    //   32: goto -11 -> 21
    //
    // Exception table:
    //   from	to	target	type
    //   3	21	25	finally
    //   3	21	31	java/lang/Exception
  }

  public static void a(Activity paramActivity, String paramString)
  {
    try
    {
      a.a(null, "initializeOfflineSDK").a(Class.forName("com.admarvel.android.offlinesdk.AdmarvelOfflineUtils")).a(Activity.class, paramActivity).a(String.class, paramString).a();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  // ERROR //
  public static void b(Activity paramActivity, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aconst_null
    //   4: ldc 50
    //   6: invokestatic 19	com/admarvel/android/util/a/a:a	(Ljava/lang/Object;Ljava/lang/String;)Lcom/admarvel/android/util/a/c$a;
    //   9: ldc 21
    //   11: invokestatic 27	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   14: invokevirtual 32	com/admarvel/android/util/a/c$a:a	(Ljava/lang/Class;)Lcom/admarvel/android/util/a/c$a;
    //   17: ldc 47
    //   19: aload_0
    //   20: invokevirtual 37	com/admarvel/android/util/a/c$a:a	(Ljava/lang/Class;Ljava/lang/Object;)Lcom/admarvel/android/util/a/c$a;
    //   23: ldc 34
    //   25: aload_1
    //   26: invokevirtual 37	com/admarvel/android/util/a/c$a:a	(Ljava/lang/Class;Ljava/lang/Object;)Lcom/admarvel/android/util/a/c$a;
    //   29: invokevirtual 40	com/admarvel/android/util/a/c$a:a	()Ljava/lang/Object;
    //   32: pop
    //   33: ldc 2
    //   35: monitorexit
    //   36: return
    //   37: astore_3
    //   38: ldc 2
    //   40: monitorexit
    //   41: aload_3
    //   42: athrow
    //   43: astore_2
    //   44: goto -11 -> 33
    //
    // Exception table:
    //   from	to	target	type
    //   3	33	37	finally
    //   3	33	43	java/lang/Exception
  }

  public String a(AdFetcher.Adtype paramAdtype, Context paramContext, String paramString1, int paramInt1, String paramString2, Map<String, Object> paramMap, String paramString3, String paramString4, int paramInt2, String paramString5, boolean paramBoolean1, Handler paramHandler, boolean paramBoolean2)
  {
    try
    {
      c.a locala = a.a(Class.forName("com.admarvel.android.offlinesdk.AdMarvelOfflineAdFetcher").newInstance(), "fetchAdFromLocal");
      locala.a(AdFetcher.Adtype.class, paramAdtype);
      locala.a(Context.class, paramContext);
      locala.a(String.class, paramString1);
      locala.a(Integer.TYPE, Integer.valueOf(paramInt1));
      locala.a(String.class, paramString2);
      locala.a(Map.class, paramMap);
      locala.a(String.class, paramString3);
      locala.a(String.class, paramString4);
      locala.a(Integer.TYPE, Integer.valueOf(paramInt2));
      locala.a(String.class, paramString5);
      locala.a(Boolean.TYPE, Boolean.valueOf(paramBoolean1));
      locala.a(Handler.class, paramHandler);
      locala.a(Boolean.TYPE, Boolean.valueOf(paramBoolean2));
      Object localObject = locala.a();
      if ((localObject != null) && ((localObject instanceof String)))
      {
        String str = (String)localObject;
        return str;
      }
    }
    catch (Exception localException)
    {
      return null;
    }
    return null;
  }

  public void a(AdMarvelAd paramAdMarvelAd, Context paramContext, Handler paramHandler)
  {
    try
    {
      c.a locala = a.a(Class.forName("com.admarvel.android.offlinesdk.AdmarvelOfflineUtils").newInstance(), "firePixel");
      locala.a(AdMarvelAd.class, paramAdMarvelAd);
      locala.a(Context.class, paramContext);
      locala.a(Handler.class, paramHandler);
      locala.a();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public void a(String paramString, Context paramContext, Handler paramHandler)
  {
    try
    {
      c.a locala = a.a(Class.forName("com.admarvel.android.offlinesdk.AdmarvelOfflineUtils").newInstance(), "firePixel");
      locala.a(String.class, paramString);
      locala.a(Context.class, paramContext);
      locala.a(Handler.class, paramHandler);
      locala.a();
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.a.b
 * JD-Core Version:    0.6.2
 */