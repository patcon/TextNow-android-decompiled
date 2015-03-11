package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class AdMarvelActivity$s
  implements Runnable
{
  private final WeakReference<AdMarvelActivity> a;
  private final WeakReference<d> b;

  public AdMarvelActivity$s(AdMarvelActivity paramAdMarvelActivity, d paramd)
  {
    this.a = new WeakReference(paramAdMarvelActivity);
    this.b = new WeakReference(paramd);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	com/admarvel/android/ads/AdMarvelActivity$s:a	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 32	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 34	com/admarvel/android/ads/AdMarvelActivity
    //   10: astore_2
    //   11: aload_0
    //   12: getfield 25	com/admarvel/android/ads/AdMarvelActivity$s:b	Ljava/lang/ref/WeakReference;
    //   15: invokevirtual 32	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   18: checkcast 36	com/admarvel/android/ads/d
    //   21: astore_3
    //   22: aload_2
    //   23: ifnull +203 -> 226
    //   26: aload_3
    //   27: ifnonnull +4 -> 31
    //   30: return
    //   31: aload_2
    //   32: getstatic 39	com/admarvel/android/ads/AdMarvelActivity:a	I
    //   35: invokevirtual 43	com/admarvel/android/ads/AdMarvelActivity:findViewById	(I)Landroid/view/View;
    //   38: checkcast 45	android/widget/RelativeLayout
    //   41: new 47	java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   48: aload_2
    //   49: getfield 52	com/admarvel/android/ads/AdMarvelActivity:e	Ljava/lang/String;
    //   52: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: ldc 58
    //   57: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokevirtual 66	android/widget/RelativeLayout:findViewWithTag	(Ljava/lang/Object;)Landroid/view/View;
    //   66: checkcast 68	com/admarvel/android/ads/j
    //   69: astore 4
    //   71: aload_3
    //   72: ifnull +80 -> 152
    //   75: aload 4
    //   77: ifnull +75 -> 152
    //   80: aload_2
    //   81: getfield 72	com/admarvel/android/ads/AdMarvelActivity:g	Z
    //   84: ifeq +93 -> 177
    //   87: aload_2
    //   88: getfield 75	com/admarvel/android/ads/AdMarvelActivity:k	Ljava/lang/String;
    //   91: ifnull +61 -> 152
    //   94: aload_2
    //   95: getfield 75	com/admarvel/android/ads/AdMarvelActivity:k	Ljava/lang/String;
    //   98: invokevirtual 81	java/lang/String:length	()I
    //   101: ifle +51 -> 152
    //   104: aload_3
    //   105: new 47	java/lang/StringBuilder
    //   108: dup
    //   109: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   112: ldc 83
    //   114: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: aload_2
    //   118: getfield 75	com/admarvel/android/ads/AdMarvelActivity:k	Ljava/lang/String;
    //   121: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: ldc 85
    //   126: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: aload 4
    //   131: invokevirtual 88	com/admarvel/android/ads/j:getCurrentPosition	()I
    //   134: i2f
    //   135: ldc 89
    //   137: fdiv
    //   138: invokevirtual 92	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   141: ldc 94
    //   143: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   149: invokevirtual 98	com/admarvel/android/ads/d:loadUrl	(Ljava/lang/String;)V
    //   152: aload_2
    //   153: getfield 102	com/admarvel/android/ads/AdMarvelActivity:d	Landroid/os/Handler;
    //   156: aload_2
    //   157: invokestatic 106	com/admarvel/android/ads/AdMarvelActivity:q	(Lcom/admarvel/android/ads/AdMarvelActivity;)Lcom/admarvel/android/ads/AdMarvelActivity$s;
    //   160: ldc2_w 107
    //   163: invokevirtual 114	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   166: pop
    //   167: return
    //   168: astore_1
    //   169: aload_1
    //   170: invokestatic 120	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   173: invokestatic 125	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   176: return
    //   177: aload_3
    //   178: new 47	java/lang/StringBuilder
    //   181: dup
    //   182: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   185: ldc 127
    //   187: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: aload 4
    //   192: invokevirtual 88	com/admarvel/android/ads/j:getCurrentPosition	()I
    //   195: sipush 1000
    //   198: idiv
    //   199: invokevirtual 130	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   202: ldc 94
    //   204: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   210: invokevirtual 98	com/admarvel/android/ads/d:loadUrl	(Ljava/lang/String;)V
    //   213: goto -61 -> 152
    //   216: astore 6
    //   218: aload 6
    //   220: invokevirtual 133	java/lang/Exception:printStackTrace	()V
    //   223: goto -71 -> 152
    //   226: return
    //
    // Exception table:
    //   from	to	target	type
    //   0	22	168	java/lang/Exception
    //   31	71	168	java/lang/Exception
    //   152	167	168	java/lang/Exception
    //   218	223	168	java/lang/Exception
    //   80	152	216	java/lang/Exception
    //   177	213	216	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.s
 * JD-Core Version:    0.6.2
 */