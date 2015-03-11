package com.admarvel.android.util;

import android.content.Context;
import com.admarvel.android.ads.Version;
import java.lang.ref.WeakReference;

public class k
{
  public static k a;
  private String b = "VALUE_NOT_DEFINED";
  private int c;
  private final WeakReference<Context> d;

  private k(Context paramContext)
  {
    this.d = new WeakReference(paramContext);
    try
    {
      Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
      k = i;
      if (k != 0)
      {
        k.e locale = new k.e(this, paramContext);
        String str = k.e.a(locale);
        int m = locale.a();
        if ((str != null) && (str.length() > 0))
        {
          a(str);
          if (m == i)
          {
            a(i);
            if ((this.b == null) || (!this.b.equals("VALUE_NOT_DEFINED")))
              break label204;
            Logging.log("Not able to fetch GoogleAdv Id form google service library trying form gms IAdvertisingIdService" + this.b);
            if ((j == 0) && (Version.getAndroidSDKVersion() > 8))
            {
              Logging.log("Fetching from IAdvertisingIdService ");
              b();
            }
            return;
          }
        }
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        int k = 0;
        continue;
        i = 0;
        continue;
        Logging.log("Not able to fetch GoogleAdv Id form google service library trying form gms IAdvertisingIdService" + this.b);
        j = 0;
        continue;
        label204: j = k;
      }
    }
  }

  public static void a()
  {
    a = null;
  }

  public static k c(Context paramContext)
  {
    if ((a == null) || ((a != null) && (a.b.equals("VALUE_NOT_DEFINED"))))
    {
      a = null;
      a = new k(paramContext);
    }
    return a;
  }

  // ERROR //
  private static void e(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 112	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   3: invokestatic 115	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   6: if_acmpne +13 -> 19
    //   9: new 117	java/lang/IllegalStateException
    //   12: dup
    //   13: ldc 119
    //   15: invokespecial 121	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   18: athrow
    //   19: aload_0
    //   20: invokevirtual 127	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   23: ldc 129
    //   25: iconst_0
    //   26: invokevirtual 135	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   29: pop
    //   30: new 137	com/admarvel/android/util/k$b
    //   33: dup
    //   34: aconst_null
    //   35: invokespecial 140	com/admarvel/android/util/k$b:<init>	(Lcom/admarvel/android/util/k$1;)V
    //   38: astore_3
    //   39: new 142	android/content/Intent
    //   42: dup
    //   43: ldc 144
    //   45: invokespecial 145	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   48: astore 4
    //   50: aload 4
    //   52: ldc 147
    //   54: invokevirtual 151	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   57: pop
    //   58: aload_0
    //   59: aload 4
    //   61: aload_3
    //   62: iconst_1
    //   63: invokevirtual 155	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   66: ifeq +72 -> 138
    //   69: new 157	com/admarvel/android/util/k$c
    //   72: dup
    //   73: aload_3
    //   74: invokevirtual 160	com/admarvel/android/util/k$b:a	()Landroid/os/IBinder;
    //   77: invokespecial 163	com/admarvel/android/util/k$c:<init>	(Landroid/os/IBinder;)V
    //   80: astore 6
    //   82: new 165	com/admarvel/android/util/k$a
    //   85: dup
    //   86: aload 6
    //   88: invokevirtual 167	com/admarvel/android/util/k$c:a	()Ljava/lang/String;
    //   91: aload 6
    //   93: iconst_1
    //   94: aload_0
    //   95: invokevirtual 170	com/admarvel/android/util/k$c:a	(ZLandroid/content/Context;)Z
    //   98: invokespecial 173	com/admarvel/android/util/k$a:<init>	(Ljava/lang/String;Z)V
    //   101: astore 7
    //   103: getstatic 98	com/admarvel/android/util/k:a	Lcom/admarvel/android/util/k;
    //   106: aload 7
    //   108: invokevirtual 174	com/admarvel/android/util/k$a:a	()Ljava/lang/String;
    //   111: putfield 24	com/admarvel/android/util/k:b	Ljava/lang/String;
    //   114: aload_0
    //   115: aload_3
    //   116: invokevirtual 178	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   119: return
    //   120: astore_1
    //   121: aload_1
    //   122: athrow
    //   123: astore 9
    //   125: aload 9
    //   127: athrow
    //   128: astore 8
    //   130: aload_0
    //   131: aload_3
    //   132: invokevirtual 178	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   135: aload 8
    //   137: athrow
    //   138: new 180	java/io/IOException
    //   141: dup
    //   142: ldc 182
    //   144: invokespecial 183	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   147: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   19	30	120	java/lang/Exception
    //   69	114	123	java/lang/Exception
    //   69	114	128	finally
    //   125	128	128	finally
  }

  public int a(Context paramContext)
  {
    return this.c;
  }

  public void a(int paramInt)
  {
    this.c = paramInt;
  }

  public void a(String paramString)
  {
    this.b = paramString;
  }

  public String b(Context paramContext)
  {
    if (this.b != null)
      return this.b;
    return "VALUE_NOT_DEFINED";
  }

  public void b()
  {
    if (this.d != null);
    for (Context localContext = (Context)this.d.get(); ; localContext = null)
    {
      if (localContext != null)
        new Thread(new k.d(this, localContext)).start();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.k
 * JD-Core Version:    0.6.2
 */