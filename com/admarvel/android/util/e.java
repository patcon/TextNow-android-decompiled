package com.admarvel.android.util;

import android.content.Context;
import com.admarvel.android.ads.AdMarvelUtils;
import java.lang.ref.WeakReference;

public class e
{
  public static e a;
  private String b = "VALUE_NOT_DEFINED";
  private int c;
  private final WeakReference<Context> d;

  private e(Context paramContext)
  {
    this.d = new WeakReference(paramContext);
    try
    {
      Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
      Class.forName("com.google.android.gms.common.GooglePlayServicesNotAvailableException");
      Class.forName("com.google.android.gms.common.GooglePlayServicesRepairableException");
      j = i;
      if (j != 0)
      {
        e.e locale = new e.e(this, paramContext);
        String str = e.e.a(locale);
        boolean bool = locale.a();
        if ((str != null) && (str.length() > 0))
        {
          a(str);
          if (bool == i)
          {
            int m = i;
            a(m);
            if ((this.b == null) || (!this.b.equals("VALUE_NOT_DEFINED")))
              break label263;
            Logging.log("Not able to fetch GoogleAdv Id form google service library trying form gms IAdvertisingIdService" + this.b);
            k = 0;
            if (k == 0)
            {
              b();
              Logging.log("Fetching from IAdvertisingIdService ");
              a(AdMarvelUtils.getPreferenceValueString(paramContext, "google_advid_preference", "google_adv_id_from_service"));
              Logging.log("GoogleAdv Id form google gms IAdvertisingIdService " + this.b);
              if (AdMarvelUtils.getPreferenceValueBoolean(paramContext, "google_advid_preference", "google_play_service_opt_out_id") != i)
                break label378;
              this.c = i;
              Logging.log("OptOut form google gms IAdvertisingIdService" + this.c);
            }
          }
        }
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        int j = 0;
        continue;
        int n = 0;
        continue;
        label263: if (AdMarvelUtils.getPreferenceValueBoolean(paramContext, "google_advid_preference", "google_play_service_opt_out_id") == i);
        for (int i1 = i; ; i1 = 0)
        {
          this.c = i1;
          Logging.log("GoogleAdv Id form google service library " + this.b);
          Logging.log("OptOut form google service library " + this.c);
          k = j;
          break;
        }
        Logging.log("Not able to fetch GoogleAdv Id form google service library trying form gms IAdvertisingIdService" + this.b);
        int k = 0;
        continue;
        label378: i = 0;
        continue;
        k = j;
      }
    }
  }

  public static void a()
  {
    a = null;
  }

  public static e c(Context paramContext)
  {
    if ((a == null) || ((a != null) && (a.b.equals("VALUE_NOT_DEFINED"))))
    {
      a = null;
      a = new e(paramContext);
    }
    if (a.b.equals("VALUE_NOT_DEFINED"))
      a.b = AdMarvelUtils.getPreferenceValueString(paramContext, "google_advid_preference", "google_adv_id_from_service");
    return a;
  }

  // ERROR //
  private static void e(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 137	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   3: invokestatic 140	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   6: if_acmpne +13 -> 19
    //   9: new 142	java/lang/IllegalStateException
    //   12: dup
    //   13: ldc 144
    //   15: invokespecial 146	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   18: athrow
    //   19: aload_0
    //   20: invokevirtual 152	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   23: ldc 154
    //   25: iconst_0
    //   26: invokevirtual 160	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   29: pop
    //   30: new 162	com/admarvel/android/util/e$b
    //   33: dup
    //   34: aconst_null
    //   35: invokespecial 165	com/admarvel/android/util/e$b:<init>	(Lcom/admarvel/android/util/e$1;)V
    //   38: astore_3
    //   39: new 167	android/content/Intent
    //   42: dup
    //   43: ldc 169
    //   45: invokespecial 170	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   48: astore 4
    //   50: aload 4
    //   52: ldc 172
    //   54: invokevirtual 176	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   57: pop
    //   58: aload_0
    //   59: aload 4
    //   61: aload_3
    //   62: iconst_1
    //   63: invokevirtual 180	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   66: ifeq +72 -> 138
    //   69: new 182	com/admarvel/android/util/e$c
    //   72: dup
    //   73: aload_3
    //   74: invokevirtual 185	com/admarvel/android/util/e$b:a	()Landroid/os/IBinder;
    //   77: invokespecial 188	com/admarvel/android/util/e$c:<init>	(Landroid/os/IBinder;)V
    //   80: astore 6
    //   82: new 190	com/admarvel/android/util/e$a
    //   85: dup
    //   86: aload 6
    //   88: invokevirtual 192	com/admarvel/android/util/e$c:a	()Ljava/lang/String;
    //   91: aload 6
    //   93: iconst_1
    //   94: aload_0
    //   95: invokevirtual 195	com/admarvel/android/util/e$c:a	(ZLandroid/content/Context;)Z
    //   98: invokespecial 198	com/admarvel/android/util/e$a:<init>	(Ljava/lang/String;Z)V
    //   101: astore 7
    //   103: getstatic 123	com/admarvel/android/util/e:a	Lcom/admarvel/android/util/e;
    //   106: aload 7
    //   108: invokevirtual 199	com/admarvel/android/util/e$a:a	()Ljava/lang/String;
    //   111: invokevirtual 63	com/admarvel/android/util/e:a	(Ljava/lang/String;)V
    //   114: aload_0
    //   115: aload_3
    //   116: invokevirtual 203	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
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
    //   132: invokevirtual 203	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   135: aload 8
    //   137: athrow
    //   138: new 205	java/io/IOException
    //   141: dup
    //   142: ldc 207
    //   144: invokespecial 208	java/io/IOException:<init>	(Ljava/lang/String;)V
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
        new Thread(new e.d(this, localContext)).start();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.e
 * JD-Core Version:    0.6.2
 */