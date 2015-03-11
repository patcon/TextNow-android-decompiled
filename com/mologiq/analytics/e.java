package com.mologiq.analytics;

import android.content.Context;

public final class e
{
  public static e a;
  private final String b;
  private final boolean c;

  private e(Context paramContext)
  {
    String str;
    try
    {
      Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
      Class.forName("com.google.android.gms.common.GooglePlayServicesNotAvailableException");
      Class.forName("com.google.android.gms.common.GooglePlayServicesRepairableException");
      if (i != 0)
      {
        h localh = new h(this, paramContext);
        this.b = h.a(localh);
        this.c = localh.a();
        return;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
        i = 0;
      str = null;
    }
    try
    {
      g localg = b(paramContext);
      str = localg.a();
      boolean bool2 = localg.a(true);
      bool1 = bool2;
      this.b = str;
      this.c = bool1;
      return;
    }
    catch (Exception localException)
    {
      while (true)
        boolean bool1 = false;
    }
  }

  public static e a(Context paramContext)
  {
    if (a == null)
      a = new e(paramContext);
    return a;
  }

  // ERROR //
  @android.annotation.SuppressLint({"NewApi"})
  private static g b(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 71	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   3: invokestatic 74	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   6: if_acmpne +13 -> 19
    //   9: new 76	java/lang/IllegalStateException
    //   12: dup
    //   13: ldc 78
    //   15: invokespecial 81	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   18: athrow
    //   19: aload_0
    //   20: invokevirtual 87	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   23: ldc 89
    //   25: iconst_0
    //   26: invokevirtual 95	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   29: pop
    //   30: new 97	com/mologiq/analytics/f
    //   33: dup
    //   34: iconst_0
    //   35: invokespecial 100	com/mologiq/analytics/f:<init>	(B)V
    //   38: astore_3
    //   39: new 102	android/content/Intent
    //   42: dup
    //   43: ldc 104
    //   45: invokespecial 105	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   48: astore 4
    //   50: aload 4
    //   52: ldc 107
    //   54: invokevirtual 111	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   57: pop
    //   58: aload_0
    //   59: aload 4
    //   61: aload_3
    //   62: iconst_1
    //   63: invokevirtual 115	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   66: ifeq +42 -> 108
    //   69: new 51	com/mologiq/analytics/g
    //   72: dup
    //   73: aload_3
    //   74: invokevirtual 118	com/mologiq/analytics/f:a	()Landroid/os/IBinder;
    //   77: invokespecial 121	com/mologiq/analytics/g:<init>	(Landroid/os/IBinder;)V
    //   80: astore 6
    //   82: aload_0
    //   83: aload_3
    //   84: invokevirtual 125	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   87: aload 6
    //   89: areturn
    //   90: astore_1
    //   91: aload_1
    //   92: athrow
    //   93: astore 8
    //   95: aload 8
    //   97: athrow
    //   98: astore 7
    //   100: aload_0
    //   101: aload_3
    //   102: invokevirtual 125	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   105: aload 7
    //   107: athrow
    //   108: new 127	java/io/IOException
    //   111: dup
    //   112: ldc 129
    //   114: invokespecial 130	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   117: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   19	30	90	java/lang/Exception
    //   69	82	93	java/lang/Exception
    //   69	82	98	finally
    //   95	98	98	finally
  }

  public final String a()
  {
    return this.b;
  }

  public final boolean b()
  {
    return this.c;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.e
 * JD-Core Version:    0.6.2
 */