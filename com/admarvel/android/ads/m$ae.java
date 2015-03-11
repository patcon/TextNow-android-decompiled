package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class m$ae
  implements Runnable
{
  private final WeakReference<m> a;
  private final WeakReference<d> b;

  public m$ae(m paramm, d paramd)
  {
    this.a = new WeakReference(paramm);
    this.b = new WeakReference(paramd);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	com/admarvel/android/ads/m$ae:a	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 32	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 34	com/admarvel/android/ads/m
    //   10: astore_2
    //   11: aload_0
    //   12: getfield 25	com/admarvel/android/ads/m$ae:b	Ljava/lang/ref/WeakReference;
    //   15: invokevirtual 32	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   18: checkcast 36	com/admarvel/android/ads/d
    //   21: astore_3
    //   22: aload_2
    //   23: ifnull +149 -> 172
    //   26: aload_3
    //   27: ifnonnull +4 -> 31
    //   30: return
    //   31: aload_2
    //   32: new 38	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 39	java/lang/StringBuilder:<init>	()V
    //   39: aload_2
    //   40: getfield 43	com/admarvel/android/ads/m:s	Ljava/lang/String;
    //   43: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: ldc 49
    //   48: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: invokevirtual 57	com/admarvel/android/ads/m:findViewWithTag	(Ljava/lang/Object;)Landroid/view/View;
    //   57: checkcast 59	com/admarvel/android/ads/a
    //   60: astore 4
    //   62: aload_3
    //   63: ifnull +68 -> 131
    //   66: aload 4
    //   68: ifnull +63 -> 131
    //   71: aload_2
    //   72: getfield 62	com/admarvel/android/ads/m:I	Ljava/lang/String;
    //   75: ifnull +56 -> 131
    //   78: aload_2
    //   79: getfield 62	com/admarvel/android/ads/m:I	Ljava/lang/String;
    //   82: invokevirtual 68	java/lang/String:length	()I
    //   85: ifle +46 -> 131
    //   88: aload_3
    //   89: new 38	java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial 39	java/lang/StringBuilder:<init>	()V
    //   96: aload_2
    //   97: getfield 62	com/admarvel/android/ads/m:I	Ljava/lang/String;
    //   100: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: ldc 70
    //   105: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: aload 4
    //   110: invokevirtual 73	com/admarvel/android/ads/a:h	()I
    //   113: i2f
    //   114: ldc 74
    //   116: fdiv
    //   117: invokevirtual 77	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   120: ldc 79
    //   122: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: invokevirtual 83	com/admarvel/android/ads/d:e	(Ljava/lang/String;)V
    //   131: new 85	android/os/Handler
    //   134: dup
    //   135: invokestatic 91	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   138: invokespecial 94	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   141: aload_2
    //   142: getfield 98	com/admarvel/android/ads/m:O	Lcom/admarvel/android/ads/m$ae;
    //   145: ldc2_w 99
    //   148: invokevirtual 104	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   151: pop
    //   152: return
    //   153: astore_1
    //   154: aload_1
    //   155: invokestatic 110	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   158: invokestatic 115	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   161: return
    //   162: astore 6
    //   164: aload 6
    //   166: invokevirtual 118	java/lang/Exception:printStackTrace	()V
    //   169: goto -38 -> 131
    //   172: return
    //
    // Exception table:
    //   from	to	target	type
    //   0	22	153	java/lang/Exception
    //   31	62	153	java/lang/Exception
    //   131	152	153	java/lang/Exception
    //   164	169	153	java/lang/Exception
    //   71	131	162	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.ae
 * JD-Core Version:    0.6.2
 */