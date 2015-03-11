package textnow.bd;

final class t
  implements bh
{
  // ERROR //
  public final void a(java.lang.String paramString, bi parambi)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 20	org/apache/http/impl/client/DefaultHttpClient
    //   5: dup
    //   6: invokespecial 21	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   9: astore 4
    //   11: aload 4
    //   13: invokeinterface 27 1 0
    //   18: invokeinterface 32 1 0
    //   23: new 34	org/apache/http/client/methods/HttpGet
    //   26: dup
    //   27: aload_1
    //   28: invokespecial 37	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   31: astore 5
    //   33: aload 4
    //   35: aload 5
    //   37: invokeinterface 41 2 0
    //   42: invokeinterface 47 1 0
    //   47: astore_3
    //   48: aload_3
    //   49: ifnonnull +60 -> 109
    //   52: aload_2
    //   53: ldc 49
    //   55: invokeinterface 53 2 0
    //   60: return
    //   61: astore 8
    //   63: new 34	org/apache/http/client/methods/HttpGet
    //   66: dup
    //   67: aload_1
    //   68: ldc 55
    //   70: invokestatic 61	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   73: invokespecial 37	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   76: astore 5
    //   78: goto -45 -> 33
    //   81: astore 9
    //   83: aload_2
    //   84: new 63	java/lang/StringBuilder
    //   87: dup
    //   88: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   91: ldc 66
    //   93: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: aload_1
    //   97: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: invokeinterface 53 2 0
    //   108: return
    //   109: aload_2
    //   110: new 76	java/io/BufferedInputStream
    //   113: dup
    //   114: aload_3
    //   115: invokeinterface 82 1 0
    //   120: invokespecial 85	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   123: invokeinterface 87 2 0
    //   128: aload_3
    //   129: ifnull +9 -> 138
    //   132: aload_3
    //   133: invokeinterface 90 1 0
    //   138: aload 4
    //   140: invokeinterface 27 1 0
    //   145: invokeinterface 32 1 0
    //   150: return
    //   151: astore 6
    //   153: aload_2
    //   154: new 63	java/lang/StringBuilder
    //   157: dup
    //   158: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   161: ldc 92
    //   163: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: aload_1
    //   167: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: ldc 94
    //   172: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: aload 6
    //   177: invokevirtual 97	java/io/IOException:getMessage	()Ljava/lang/String;
    //   180: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   186: invokeinterface 53 2 0
    //   191: aload 6
    //   193: invokevirtual 100	java/io/IOException:printStackTrace	()V
    //   196: goto -68 -> 128
    //   199: astore 7
    //   201: goto -63 -> 138
    //
    // Exception table:
    //   from	to	target	type
    //   23	33	61	java/lang/IllegalArgumentException
    //   63	78	81	java/io/UnsupportedEncodingException
    //   33	48	151	java/io/IOException
    //   52	60	151	java/io/IOException
    //   109	128	151	java/io/IOException
    //   132	138	199	java/io/IOException
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.t
 * JD-Core Version:    0.6.2
 */