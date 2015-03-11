package com.enflick.android.TextNow.tasks;

public class FacebookCreateTask extends c
{
  private String d;

  public FacebookCreateTask(String paramString)
  {
    this.d = paramString;
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: getstatic 24	textnow/v/l:a	Lcom/facebook/model/GraphUser;
    //   3: ifnonnull +15 -> 18
    //   6: aload_0
    //   7: iconst_1
    //   8: invokevirtual 27	com/enflick/android/TextNow/tasks/FacebookCreateTask:a	(Z)V
    //   11: aload_0
    //   12: ldc 29
    //   14: invokevirtual 31	com/enflick/android/TextNow/tasks/FacebookCreateTask:a	(Ljava/lang/String;)V
    //   17: return
    //   18: bipush 236
    //   20: invokestatic 37	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   23: iconst_1
    //   24: invokevirtual 41	java/util/Calendar:get	(I)I
    //   27: iadd
    //   28: istore_1
    //   29: new 43	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   36: iload_1
    //   37: invokevirtual 48	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   40: ldc 50
    //   42: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: astore_2
    //   49: getstatic 24	textnow/v/l:a	Lcom/facebook/model/GraphUser;
    //   52: invokeinterface 62 1 0
    //   57: astore_3
    //   58: getstatic 24	textnow/v/l:a	Lcom/facebook/model/GraphUser;
    //   61: invokeinterface 65 1 0
    //   66: astore 4
    //   68: aload_3
    //   69: invokestatic 71	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   72: ifne +11 -> 83
    //   75: aload 4
    //   77: invokestatic 71	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   80: ifeq +15 -> 95
    //   83: aload_0
    //   84: iconst_1
    //   85: invokevirtual 27	com/enflick/android/TextNow/tasks/FacebookCreateTask:a	(Z)V
    //   88: aload_0
    //   89: ldc 73
    //   91: invokevirtual 31	com/enflick/android/TextNow/tasks/FacebookCreateTask:a	(Ljava/lang/String;)V
    //   94: return
    //   95: getstatic 24	textnow/v/l:a	Lcom/facebook/model/GraphUser;
    //   98: invokeinterface 77 1 0
    //   103: ldc 79
    //   105: invokevirtual 85	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   108: astore 6
    //   110: getstatic 24	textnow/v/l:a	Lcom/facebook/model/GraphUser;
    //   113: invokeinterface 77 1 0
    //   118: ldc 87
    //   120: invokevirtual 85	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   123: ldc 89
    //   125: invokevirtual 95	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   128: istore 25
    //   130: iload 25
    //   132: ifeq +215 -> 347
    //   135: iconst_1
    //   136: istore 26
    //   138: iload 26
    //   140: istore 8
    //   142: getstatic 24	textnow/v/l:a	Lcom/facebook/model/GraphUser;
    //   145: invokeinterface 98 1 0
    //   150: astore 19
    //   152: aload 19
    //   154: invokestatic 71	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   157: ifne +388 -> 545
    //   160: new 100	java/text/SimpleDateFormat
    //   163: dup
    //   164: ldc 102
    //   166: getstatic 108	java/util/Locale:ENGLISH	Ljava/util/Locale;
    //   169: invokespecial 111	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   172: aload 19
    //   174: invokevirtual 115	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   177: astore 22
    //   179: invokestatic 37	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   182: astore 23
    //   184: aload 23
    //   186: aload 22
    //   188: invokevirtual 119	java/util/Calendar:setTime	(Ljava/util/Date;)V
    //   191: aload 23
    //   193: iconst_1
    //   194: invokevirtual 41	java/util/Calendar:get	(I)I
    //   197: istore_1
    //   198: new 100	java/text/SimpleDateFormat
    //   201: dup
    //   202: ldc 121
    //   204: getstatic 108	java/util/Locale:ENGLISH	Ljava/util/Locale;
    //   207: invokespecial 111	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   210: aload 22
    //   212: invokevirtual 125	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   215: astore 24
    //   217: aload 24
    //   219: astore 20
    //   221: iload_1
    //   222: istore 21
    //   224: aload 20
    //   226: astore 11
    //   228: iload 21
    //   230: istore 12
    //   232: new 127	com/enflick/android/TextNow/api/users/af
    //   235: dup
    //   236: aload_0
    //   237: getfield 13	com/enflick/android/TextNow/tasks/FacebookCreateTask:d	Ljava/lang/String;
    //   240: getstatic 24	textnow/v/l:a	Lcom/facebook/model/GraphUser;
    //   243: invokeinterface 130 1 0
    //   248: invokestatic 136	com/facebook/Session:getActiveSession	()Lcom/facebook/Session;
    //   251: invokevirtual 139	com/facebook/Session:getAccessToken	()Ljava/lang/String;
    //   254: aload 6
    //   256: aload_3
    //   257: aload 4
    //   259: invokespecial 142	com/enflick/android/TextNow/api/users/af:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   262: astore 13
    //   264: aload 13
    //   266: aload 11
    //   268: putfield 145	com/enflick/android/TextNow/api/users/af:g	Ljava/lang/String;
    //   271: aload 13
    //   273: iload 8
    //   275: putfield 149	com/enflick/android/TextNow/api/users/af:f	I
    //   278: new 151	com/enflick/android/TextNow/api/users/UsersPut
    //   281: dup
    //   282: aload_0
    //   283: getfield 154	com/enflick/android/TextNow/tasks/FacebookCreateTask:a	Landroid/content/Context;
    //   286: invokespecial 157	com/enflick/android/TextNow/api/users/UsersPut:<init>	(Landroid/content/Context;)V
    //   289: aload 13
    //   291: invokevirtual 161	com/enflick/android/TextNow/api/users/UsersPut:runSync	(Lcom/enflick/android/TextNow/api/common/c;)Ltextnow/x/i;
    //   294: astore 14
    //   296: aload_0
    //   297: aload 14
    //   299: invokevirtual 164	com/enflick/android/TextNow/tasks/FacebookCreateTask:a	(Ltextnow/x/i;)Z
    //   302: ifeq +84 -> 386
    //   305: ldc 166
    //   307: aload_0
    //   308: invokevirtual 169	com/enflick/android/TextNow/tasks/FacebookCreateTask:j	()Ljava/lang/String;
    //   311: invokevirtual 95	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   314: ifne -297 -> 17
    //   317: ldc 171
    //   319: aload_0
    //   320: invokevirtual 169	com/enflick/android/TextNow/tasks/FacebookCreateTask:j	()Ljava/lang/String;
    //   323: invokevirtual 95	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   326: pop
    //   327: return
    //   328: astore 5
    //   330: aload 5
    //   332: invokevirtual 174	org/json/JSONException:printStackTrace	()V
    //   335: aload_0
    //   336: iconst_1
    //   337: invokevirtual 27	com/enflick/android/TextNow/tasks/FacebookCreateTask:a	(Z)V
    //   340: aload_0
    //   341: ldc 176
    //   343: invokevirtual 31	com/enflick/android/TextNow/tasks/FacebookCreateTask:a	(Ljava/lang/String;)V
    //   346: return
    //   347: iconst_2
    //   348: istore 26
    //   350: goto -212 -> 138
    //   353: astore 7
    //   355: aload 7
    //   357: invokevirtual 174	org/json/JSONException:printStackTrace	()V
    //   360: iconst_0
    //   361: istore 8
    //   363: goto -221 -> 142
    //   366: astore 9
    //   368: iload_1
    //   369: istore 10
    //   371: aload 9
    //   373: invokevirtual 177	java/text/ParseException:printStackTrace	()V
    //   376: aload_2
    //   377: astore 11
    //   379: iload 10
    //   381: istore 12
    //   383: goto -151 -> 232
    //   386: aload 14
    //   388: invokevirtual 183	textnow/x/i:c	()Ljava/lang/Object;
    //   391: checkcast 185	com/enflick/android/TextNow/api/responsemodel/Session
    //   394: getfield 188	com/enflick/android/TextNow/api/responsemodel/Session:sessionId	Ljava/lang/String;
    //   397: astore 15
    //   399: new 190	textnow/z/u
    //   402: dup
    //   403: aload_0
    //   404: getfield 154	com/enflick/android/TextNow/tasks/FacebookCreateTask:a	Landroid/content/Context;
    //   407: invokespecial 191	textnow/z/u:<init>	(Landroid/content/Context;)V
    //   410: astore 16
    //   412: aload 16
    //   414: invokevirtual 194	textnow/z/u:b	()Ljava/lang/String;
    //   417: astore 17
    //   419: aload 17
    //   421: invokestatic 71	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   424: ifne +38 -> 462
    //   427: aload_0
    //   428: getfield 13	com/enflick/android/TextNow/tasks/FacebookCreateTask:d	Ljava/lang/String;
    //   431: aload 17
    //   433: invokevirtual 95	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   436: ifne +26 -> 462
    //   439: aload 16
    //   441: invokevirtual 196	textnow/z/u:a	()V
    //   444: aload 16
    //   446: invokevirtual 199	textnow/z/u:B	()V
    //   449: new 190	textnow/z/u
    //   452: dup
    //   453: aload_0
    //   454: getfield 154	com/enflick/android/TextNow/tasks/FacebookCreateTask:a	Landroid/content/Context;
    //   457: invokespecial 191	textnow/z/u:<init>	(Landroid/content/Context;)V
    //   460: astore 16
    //   462: aload 16
    //   464: getstatic 24	textnow/v/l:a	Lcom/facebook/model/GraphUser;
    //   467: invokeinterface 130 1 0
    //   472: invokevirtual 201	textnow/z/u:f	(Ljava/lang/String;)V
    //   475: aload_0
    //   476: getfield 13	com/enflick/android/TextNow/tasks/FacebookCreateTask:d	Ljava/lang/String;
    //   479: invokestatic 71	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   482: ifne +12 -> 494
    //   485: aload 16
    //   487: aload_0
    //   488: getfield 13	com/enflick/android/TextNow/tasks/FacebookCreateTask:d	Ljava/lang/String;
    //   491: invokevirtual 202	textnow/z/u:a	(Ljava/lang/String;)V
    //   494: aload 16
    //   496: aload_3
    //   497: invokevirtual 204	textnow/z/u:g	(Ljava/lang/String;)V
    //   500: aload 16
    //   502: aload 4
    //   504: invokevirtual 206	textnow/z/u:j	(Ljava/lang/String;)V
    //   507: aload 16
    //   509: iload 8
    //   511: invokevirtual 209	textnow/z/u:c	(I)V
    //   514: aload 16
    //   516: iload 12
    //   518: invokevirtual 211	textnow/z/u:b	(I)V
    //   521: aload 16
    //   523: aload 15
    //   525: invokevirtual 214	textnow/z/u:l	(Ljava/lang/String;)V
    //   528: aload 16
    //   530: iconst_1
    //   531: invokevirtual 216	textnow/z/u:c	(Z)V
    //   534: aload 16
    //   536: invokevirtual 219	textnow/z/u:K	()V
    //   539: aload 16
    //   541: invokevirtual 199	textnow/z/u:B	()V
    //   544: return
    //   545: aload_2
    //   546: astore 20
    //   548: iload_1
    //   549: istore 21
    //   551: goto -327 -> 224
    //
    // Exception table:
    //   from	to	target	type
    //   95	110	328	org/json/JSONException
    //   110	130	353	org/json/JSONException
    //   142	217	366	java/text/ParseException
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.FacebookCreateTask
 * JD-Core Version:    0.6.2
 */