package com.mopub.nativeads;

final class CustomEventNativeAdapter
{
  static final String RESPONSE_BODY_KEY = "response_body_key";

  // ERROR //
  public static void loadNativeAd(android.content.Context paramContext, java.util.Map<String, Object> paramMap, com.mopub.common.DownloadResponse paramDownloadResponse, CustomEventNative.CustomEventNativeListener paramCustomEventNativeListener)
  {
    // Byte code:
    //   0: aload_2
    //   1: getstatic 22	com/mopub/common/util/ResponseHeader:CUSTOM_EVENT_DATA	Lcom/mopub/common/util/ResponseHeader;
    //   4: invokevirtual 28	com/mopub/common/DownloadResponse:getFirstHeader	(Lcom/mopub/common/util/ResponseHeader;)Ljava/lang/String;
    //   7: astore 4
    //   9: aload_2
    //   10: getstatic 31	com/mopub/common/util/ResponseHeader:CUSTOM_EVENT_NAME	Lcom/mopub/common/util/ResponseHeader;
    //   13: invokevirtual 28	com/mopub/common/DownloadResponse:getFirstHeader	(Lcom/mopub/common/util/ResponseHeader;)Ljava/lang/String;
    //   16: astore 5
    //   18: aload 5
    //   20: invokestatic 37	com/mopub/nativeads/factories/CustomEventNativeFactory:create	(Ljava/lang/String;)Lcom/mopub/nativeads/CustomEventNative;
    //   23: astore 7
    //   25: new 39	java/util/HashMap
    //   28: dup
    //   29: invokespecial 40	java/util/HashMap:<init>	()V
    //   32: astore 8
    //   34: aload 4
    //   36: invokestatic 46	com/mopub/common/util/Json:jsonStringToMap	(Ljava/lang/String;)Ljava/util/Map;
    //   39: astore 11
    //   41: aload 11
    //   43: astore 8
    //   45: aload 8
    //   47: ldc 8
    //   49: aload_2
    //   50: invokestatic 52	com/mopub/common/HttpResponses:asResponseString	(Lcom/mopub/common/DownloadResponse;)Ljava/lang/String;
    //   53: invokeinterface 58 3 0
    //   58: pop
    //   59: aload 7
    //   61: aload_0
    //   62: aload_3
    //   63: aload_1
    //   64: aload 8
    //   66: invokevirtual 63	com/mopub/nativeads/CustomEventNative:loadNativeAd	(Landroid/content/Context;Lcom/mopub/nativeads/CustomEventNative$CustomEventNativeListener;Ljava/util/Map;Ljava/util/Map;)V
    //   69: return
    //   70: astore 6
    //   72: new 65	java/lang/StringBuilder
    //   75: dup
    //   76: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   79: ldc 68
    //   81: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: aload 5
    //   86: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokestatic 82	com/mopub/common/logging/MoPubLog:w	(Ljava/lang/String;)V
    //   95: aload_3
    //   96: getstatic 88	com/mopub/nativeads/NativeErrorCode:NATIVE_ADAPTER_NOT_FOUND	Lcom/mopub/nativeads/NativeErrorCode;
    //   99: invokeinterface 94 2 0
    //   104: return
    //   105: astore 9
    //   107: new 65	java/lang/StringBuilder
    //   110: dup
    //   111: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   114: ldc 96
    //   116: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: aload 4
    //   121: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   127: aload 9
    //   129: invokestatic 99	com/mopub/common/logging/MoPubLog:w	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   132: goto -87 -> 45
    //
    // Exception table:
    //   from	to	target	type
    //   18	25	70	java/lang/Exception
    //   34	41	105	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.CustomEventNativeAdapter
 * JD-Core Version:    0.6.2
 */