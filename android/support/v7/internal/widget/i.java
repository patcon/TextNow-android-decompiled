package android.support.v7.internal.widget;

import android.os.AsyncTask;

final class i extends AsyncTask<Object, Void, Void>
{
  private i(d paramd)
  {
  }

  // ERROR //
  private Void a(Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_1
    //   3: iconst_0
    //   4: aaload
    //   5: checkcast 28	java/util/List
    //   8: astore_3
    //   9: aload_1
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast 30	java/lang/String
    //   15: astore 4
    //   17: aload_0
    //   18: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   21: invokestatic 35	android/support/v7/internal/widget/d:a	(Landroid/support/v7/internal/widget/d;)Landroid/content/Context;
    //   24: aload 4
    //   26: iconst_0
    //   27: invokevirtual 41	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   30: astore 8
    //   32: invokestatic 47	android/util/Xml:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
    //   35: astore 9
    //   37: aload 9
    //   39: aload 8
    //   41: aconst_null
    //   42: invokeinterface 53 3 0
    //   47: aload 9
    //   49: ldc 55
    //   51: iconst_1
    //   52: invokestatic 61	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   55: invokeinterface 65 3 0
    //   60: aload 9
    //   62: aconst_null
    //   63: ldc 67
    //   65: invokeinterface 71 3 0
    //   70: pop
    //   71: aload_3
    //   72: invokeinterface 75 1 0
    //   77: istore 29
    //   79: iload_2
    //   80: iload 29
    //   82: if_icmpge +129 -> 211
    //   85: aload_3
    //   86: iconst_0
    //   87: invokeinterface 79 2 0
    //   92: checkcast 81	android/support/v7/internal/widget/g
    //   95: astore 30
    //   97: aload 9
    //   99: aconst_null
    //   100: ldc 83
    //   102: invokeinterface 71 3 0
    //   107: pop
    //   108: aload 9
    //   110: aconst_null
    //   111: ldc 85
    //   113: aload 30
    //   115: getfield 88	android/support/v7/internal/widget/g:a	Landroid/content/ComponentName;
    //   118: invokevirtual 94	android/content/ComponentName:flattenToString	()Ljava/lang/String;
    //   121: invokeinterface 98 4 0
    //   126: pop
    //   127: aload 9
    //   129: aconst_null
    //   130: ldc 100
    //   132: aload 30
    //   134: getfield 104	android/support/v7/internal/widget/g:b	J
    //   137: invokestatic 107	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   140: invokeinterface 98 4 0
    //   145: pop
    //   146: aload 9
    //   148: aconst_null
    //   149: ldc 109
    //   151: aload 30
    //   153: getfield 113	android/support/v7/internal/widget/g:c	F
    //   156: invokestatic 116	java/lang/String:valueOf	(F)Ljava/lang/String;
    //   159: invokeinterface 98 4 0
    //   164: pop
    //   165: aload 9
    //   167: aconst_null
    //   168: ldc 83
    //   170: invokeinterface 119 3 0
    //   175: pop
    //   176: iinc 2 1
    //   179: goto -100 -> 79
    //   182: astore 5
    //   184: invokestatic 122	android/support/v7/internal/widget/d:d	()Ljava/lang/String;
    //   187: pop
    //   188: new 124	java/lang/StringBuilder
    //   191: dup
    //   192: invokespecial 125	java/lang/StringBuilder:<init>	()V
    //   195: ldc 127
    //   197: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: aload 4
    //   202: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   208: pop
    //   209: aconst_null
    //   210: areturn
    //   211: aload 9
    //   213: aconst_null
    //   214: ldc 67
    //   216: invokeinterface 119 3 0
    //   221: pop
    //   222: aload 9
    //   224: invokeinterface 137 1 0
    //   229: aload_0
    //   230: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   233: iconst_1
    //   234: invokestatic 140	android/support/v7/internal/widget/d:a	(Landroid/support/v7/internal/widget/d;Z)Z
    //   237: pop
    //   238: aload 8
    //   240: ifnull -31 -> 209
    //   243: aload 8
    //   245: invokevirtual 145	java/io/FileOutputStream:close	()V
    //   248: aconst_null
    //   249: areturn
    //   250: astore 38
    //   252: aconst_null
    //   253: areturn
    //   254: astore 23
    //   256: invokestatic 122	android/support/v7/internal/widget/d:d	()Ljava/lang/String;
    //   259: pop
    //   260: new 124	java/lang/StringBuilder
    //   263: dup
    //   264: invokespecial 125	java/lang/StringBuilder:<init>	()V
    //   267: ldc 127
    //   269: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: aload_0
    //   273: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   276: invokestatic 148	android/support/v7/internal/widget/d:b	(Landroid/support/v7/internal/widget/d;)Ljava/lang/String;
    //   279: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   285: pop
    //   286: aload_0
    //   287: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   290: iconst_1
    //   291: invokestatic 140	android/support/v7/internal/widget/d:a	(Landroid/support/v7/internal/widget/d;Z)Z
    //   294: pop
    //   295: aload 8
    //   297: ifnull -88 -> 209
    //   300: aload 8
    //   302: invokevirtual 145	java/io/FileOutputStream:close	()V
    //   305: aconst_null
    //   306: areturn
    //   307: astore 27
    //   309: aconst_null
    //   310: areturn
    //   311: astore 18
    //   313: invokestatic 122	android/support/v7/internal/widget/d:d	()Ljava/lang/String;
    //   316: pop
    //   317: new 124	java/lang/StringBuilder
    //   320: dup
    //   321: invokespecial 125	java/lang/StringBuilder:<init>	()V
    //   324: ldc 127
    //   326: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: aload_0
    //   330: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   333: invokestatic 148	android/support/v7/internal/widget/d:b	(Landroid/support/v7/internal/widget/d;)Ljava/lang/String;
    //   336: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   342: pop
    //   343: aload_0
    //   344: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   347: iconst_1
    //   348: invokestatic 140	android/support/v7/internal/widget/d:a	(Landroid/support/v7/internal/widget/d;Z)Z
    //   351: pop
    //   352: aload 8
    //   354: ifnull -145 -> 209
    //   357: aload 8
    //   359: invokevirtual 145	java/io/FileOutputStream:close	()V
    //   362: aconst_null
    //   363: areturn
    //   364: astore 22
    //   366: aconst_null
    //   367: areturn
    //   368: astore 13
    //   370: invokestatic 122	android/support/v7/internal/widget/d:d	()Ljava/lang/String;
    //   373: pop
    //   374: new 124	java/lang/StringBuilder
    //   377: dup
    //   378: invokespecial 125	java/lang/StringBuilder:<init>	()V
    //   381: ldc 127
    //   383: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: aload_0
    //   387: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   390: invokestatic 148	android/support/v7/internal/widget/d:b	(Landroid/support/v7/internal/widget/d;)Ljava/lang/String;
    //   393: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   399: pop
    //   400: aload_0
    //   401: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   404: iconst_1
    //   405: invokestatic 140	android/support/v7/internal/widget/d:a	(Landroid/support/v7/internal/widget/d;Z)Z
    //   408: pop
    //   409: aload 8
    //   411: ifnull -202 -> 209
    //   414: aload 8
    //   416: invokevirtual 145	java/io/FileOutputStream:close	()V
    //   419: aconst_null
    //   420: areturn
    //   421: astore 17
    //   423: aconst_null
    //   424: areturn
    //   425: astore 10
    //   427: aload_0
    //   428: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   431: iconst_1
    //   432: invokestatic 140	android/support/v7/internal/widget/d:a	(Landroid/support/v7/internal/widget/d;Z)Z
    //   435: pop
    //   436: aload 8
    //   438: ifnull +8 -> 446
    //   441: aload 8
    //   443: invokevirtual 145	java/io/FileOutputStream:close	()V
    //   446: aload 10
    //   448: athrow
    //   449: astore 12
    //   451: goto -5 -> 446
    //
    // Exception table:
    //   from	to	target	type
    //   17	32	182	java/io/FileNotFoundException
    //   243	248	250	java/io/IOException
    //   37	79	254	java/lang/IllegalArgumentException
    //   85	176	254	java/lang/IllegalArgumentException
    //   211	229	254	java/lang/IllegalArgumentException
    //   300	305	307	java/io/IOException
    //   37	79	311	java/lang/IllegalStateException
    //   85	176	311	java/lang/IllegalStateException
    //   211	229	311	java/lang/IllegalStateException
    //   357	362	364	java/io/IOException
    //   37	79	368	java/io/IOException
    //   85	176	368	java/io/IOException
    //   211	229	368	java/io/IOException
    //   414	419	421	java/io/IOException
    //   37	79	425	finally
    //   85	176	425	finally
    //   211	229	425	finally
    //   256	286	425	finally
    //   313	343	425	finally
    //   370	400	425	finally
    //   441	446	449	java/io/IOException
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.i
 * JD-Core Version:    0.6.2
 */