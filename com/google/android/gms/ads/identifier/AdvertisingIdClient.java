package com.google.android.gms.ads.identifier;

import android.content.Context;
import com.google.android.gms.internal.hm;

public final class AdvertisingIdClient
{
  // ERROR //
  static AdvertisingIdClient.Info a(Context paramContext, com.google.android.gms.common.a parama)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 22	com/google/android/gms/common/a:ew	()Landroid/os/IBinder;
    //   4: invokestatic 28	com/google/android/gms/internal/s$a:b	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/s;
    //   7: astore 6
    //   9: new 30	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info
    //   12: dup
    //   13: aload 6
    //   15: invokeinterface 36 1 0
    //   20: aload 6
    //   22: iconst_1
    //   23: invokeinterface 39 2 0
    //   28: invokespecial 42	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info:<init>	(Ljava/lang/String;Z)V
    //   31: astore 7
    //   33: aload_0
    //   34: aload_1
    //   35: invokevirtual 48	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   38: aload 7
    //   40: areturn
    //   41: astore 5
    //   43: new 50	java/io/IOException
    //   46: dup
    //   47: ldc 52
    //   49: invokespecial 55	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   52: athrow
    //   53: astore_3
    //   54: aload_0
    //   55: aload_1
    //   56: invokevirtual 48	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   59: aload_3
    //   60: athrow
    //   61: astore_2
    //   62: new 50	java/io/IOException
    //   65: dup
    //   66: ldc 57
    //   68: invokespecial 55	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   71: athrow
    //   72: astore 8
    //   74: aload 7
    //   76: areturn
    //   77: astore 4
    //   79: goto -20 -> 59
    //
    // Exception table:
    //   from	to	target	type
    //   0	33	41	android/os/RemoteException
    //   0	33	53	finally
    //   43	53	53	finally
    //   62	72	53	finally
    //   0	33	61	java/lang/InterruptedException
    //   33	38	72	java/lang/IllegalArgumentException
    //   54	59	77	java/lang/IllegalArgumentException
  }

  public static AdvertisingIdClient.Info getAdvertisingIdInfo(Context paramContext)
  {
    hm.az("Calling this from your main thread can lead to deadlock");
    return a(paramContext, j(paramContext));
  }

  // ERROR //
  static com.google.android.gms.common.a j(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 80	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   4: ldc 82
    //   6: iconst_0
    //   7: invokevirtual 88	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   10: pop
    //   11: aload_0
    //   12: invokestatic 94	com/google/android/gms/common/GooglePlayServicesUtil:z	(Landroid/content/Context;)V
    //   15: new 18	com/google/android/gms/common/a
    //   18: dup
    //   19: invokespecial 95	com/google/android/gms/common/a:<init>	()V
    //   22: astore 4
    //   24: new 97	android/content/Intent
    //   27: dup
    //   28: ldc 99
    //   30: invokespecial 100	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   33: astore 5
    //   35: aload 5
    //   37: ldc 102
    //   39: invokevirtual 106	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   42: pop
    //   43: aload_0
    //   44: aload 5
    //   46: aload 4
    //   48: iconst_1
    //   49: invokevirtual 110	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   52: ifeq +27 -> 79
    //   55: aload 4
    //   57: areturn
    //   58: astore_1
    //   59: new 76	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   62: dup
    //   63: bipush 9
    //   65: invokespecial 113	com/google/android/gms/common/GooglePlayServicesNotAvailableException:<init>	(I)V
    //   68: athrow
    //   69: astore_3
    //   70: new 50	java/io/IOException
    //   73: dup
    //   74: aload_3
    //   75: invokespecial 116	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   78: athrow
    //   79: new 50	java/io/IOException
    //   82: dup
    //   83: ldc 118
    //   85: invokespecial 55	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   88: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	11	58	android/content/pm/PackageManager$NameNotFoundException
    //   11	15	69	com/google/android/gms/common/GooglePlayServicesNotAvailableException
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.AdvertisingIdClient
 * JD-Core Version:    0.6.2
 */