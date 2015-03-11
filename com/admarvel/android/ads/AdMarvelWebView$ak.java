package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class AdMarvelWebView$ak
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;
  private final WeakReference<AdMarvelInternalWebView> b;

  public AdMarvelWebView$ak(AdMarvelWebView paramAdMarvelWebView, AdMarvelInternalWebView paramAdMarvelInternalWebView)
  {
    this.a = new WeakReference(paramAdMarvelWebView);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	com/admarvel/android/ads/AdMarvelWebView$ak:a	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 32	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: checkcast 34	com/admarvel/android/ads/AdMarvelWebView
    //   10: astore_2
    //   11: aload_0
    //   12: getfield 25	com/admarvel/android/ads/AdMarvelWebView$ak:b	Ljava/lang/ref/WeakReference;
    //   15: invokevirtual 32	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   18: checkcast 36	com/admarvel/android/ads/AdMarvelInternalWebView
    //   21: astore_3
    //   22: aload_2
    //   23: ifnull +148 -> 171
    //   26: aload_3
    //   27: ifnonnull +4 -> 31
    //   30: return
    //   31: aload_2
    //   32: new 38	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 39	java/lang/StringBuilder:<init>	()V
    //   39: aload_2
    //   40: getfield 43	com/admarvel/android/ads/AdMarvelWebView:e	Ljava/lang/String;
    //   43: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: ldc 49
    //   48: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: invokevirtual 57	com/admarvel/android/ads/AdMarvelWebView:findViewWithTag	(Ljava/lang/Object;)Landroid/view/View;
    //   57: checkcast 59	com/admarvel/android/ads/f
    //   60: astore 4
    //   62: aload_3
    //   63: ifnull +73 -> 136
    //   66: aload 4
    //   68: ifnull +68 -> 136
    //   71: aload_2
    //   72: invokestatic 63	com/admarvel/android/ads/AdMarvelWebView:O	(Lcom/admarvel/android/ads/AdMarvelWebView;)Ljava/lang/String;
    //   75: ifnull +61 -> 136
    //   78: aload_2
    //   79: invokestatic 63	com/admarvel/android/ads/AdMarvelWebView:O	(Lcom/admarvel/android/ads/AdMarvelWebView;)Ljava/lang/String;
    //   82: invokevirtual 69	java/lang/String:length	()I
    //   85: ifle +51 -> 136
    //   88: aload_3
    //   89: new 38	java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial 39	java/lang/StringBuilder:<init>	()V
    //   96: ldc 71
    //   98: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: aload_2
    //   102: invokestatic 63	com/admarvel/android/ads/AdMarvelWebView:O	(Lcom/admarvel/android/ads/AdMarvelWebView;)Ljava/lang/String;
    //   105: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: ldc 73
    //   110: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: aload 4
    //   115: invokevirtual 76	com/admarvel/android/ads/f:h	()I
    //   118: i2f
    //   119: ldc 77
    //   121: fdiv
    //   122: invokevirtual 80	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   125: ldc 82
    //   127: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: invokevirtual 86	com/admarvel/android/ads/AdMarvelInternalWebView:loadUrl	(Ljava/lang/String;)V
    //   136: aload_2
    //   137: invokestatic 90	com/admarvel/android/ads/AdMarvelWebView:d	(Lcom/admarvel/android/ads/AdMarvelWebView;)Landroid/os/Handler;
    //   140: aload_2
    //   141: invokestatic 94	com/admarvel/android/ads/AdMarvelWebView:H	(Lcom/admarvel/android/ads/AdMarvelWebView;)Lcom/admarvel/android/ads/AdMarvelWebView$ak;
    //   144: ldc2_w 95
    //   147: invokevirtual 102	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   150: pop
    //   151: return
    //   152: astore_1
    //   153: aload_1
    //   154: invokestatic 108	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   157: invokestatic 113	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   160: return
    //   161: astore 6
    //   163: aload 6
    //   165: invokevirtual 116	java/lang/Exception:printStackTrace	()V
    //   168: goto -32 -> 136
    //   171: return
    //
    // Exception table:
    //   from	to	target	type
    //   0	22	152	java/lang/Exception
    //   31	62	152	java/lang/Exception
    //   136	151	152	java/lang/Exception
    //   163	168	152	java/lang/Exception
    //   71	136	161	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.ak
 * JD-Core Version:    0.6.2
 */