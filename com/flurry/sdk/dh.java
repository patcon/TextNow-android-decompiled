package com.flurry.sdk;

public class dh
{
  private static final String b = dh.class.getSimpleName();
  byte[] a;

  // ERROR //
  public dh(di paramdi)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 24	java/lang/Object:<init>	()V
    //   4: new 26	java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial 27	java/io/ByteArrayOutputStream:<init>	()V
    //   11: astore_2
    //   12: new 29	java/io/DataOutputStream
    //   15: dup
    //   16: aload_2
    //   17: invokespecial 32	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   20: astore_3
    //   21: aload_3
    //   22: iconst_3
    //   23: invokevirtual 36	java/io/DataOutputStream:writeShort	(I)V
    //   26: aload_3
    //   27: aload_1
    //   28: invokevirtual 40	com/flurry/sdk/di:a	()Ljava/lang/String;
    //   31: invokevirtual 44	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   34: aload_3
    //   35: aload_1
    //   36: invokevirtual 47	com/flurry/sdk/di:b	()J
    //   39: invokevirtual 51	java/io/DataOutputStream:writeLong	(J)V
    //   42: aload_3
    //   43: aload_1
    //   44: invokevirtual 54	com/flurry/sdk/di:c	()J
    //   47: invokevirtual 51	java/io/DataOutputStream:writeLong	(J)V
    //   50: aload_3
    //   51: aload_1
    //   52: invokevirtual 57	com/flurry/sdk/di:d	()J
    //   55: invokevirtual 51	java/io/DataOutputStream:writeLong	(J)V
    //   58: aload_1
    //   59: invokevirtual 61	com/flurry/sdk/di:e	()Ljava/util/Map;
    //   62: astore 7
    //   64: aload 7
    //   66: ifnonnull +251 -> 317
    //   69: aload_3
    //   70: iconst_0
    //   71: invokevirtual 36	java/io/DataOutputStream:writeShort	(I)V
    //   74: aload_3
    //   75: aload_1
    //   76: invokevirtual 64	com/flurry/sdk/di:f	()Ljava/lang/String;
    //   79: invokevirtual 44	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   82: aload_3
    //   83: aload_1
    //   84: invokevirtual 67	com/flurry/sdk/di:g	()Ljava/lang/String;
    //   87: invokevirtual 44	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   90: aload_3
    //   91: aload_1
    //   92: invokevirtual 71	com/flurry/sdk/di:h	()I
    //   95: invokevirtual 74	java/io/DataOutputStream:writeByte	(I)V
    //   98: aload_3
    //   99: aload_1
    //   100: invokevirtual 77	com/flurry/sdk/di:i	()Ljava/lang/String;
    //   103: invokevirtual 44	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   106: aload_1
    //   107: invokevirtual 81	com/flurry/sdk/di:j	()Landroid/location/Location;
    //   110: ifnonnull +322 -> 432
    //   113: aload_3
    //   114: iconst_0
    //   115: invokevirtual 85	java/io/DataOutputStream:writeBoolean	(Z)V
    //   118: aload_3
    //   119: aload_1
    //   120: invokevirtual 88	com/flurry/sdk/di:k	()I
    //   123: invokevirtual 91	java/io/DataOutputStream:writeInt	(I)V
    //   126: aload_3
    //   127: iconst_m1
    //   128: invokevirtual 74	java/io/DataOutputStream:writeByte	(I)V
    //   131: aload_3
    //   132: iconst_m1
    //   133: invokevirtual 74	java/io/DataOutputStream:writeByte	(I)V
    //   136: aload_3
    //   137: aload_1
    //   138: invokevirtual 95	com/flurry/sdk/di:l	()B
    //   141: invokevirtual 74	java/io/DataOutputStream:writeByte	(I)V
    //   144: aload_1
    //   145: invokevirtual 99	com/flurry/sdk/di:m	()Ljava/lang/Long;
    //   148: ifnonnull +333 -> 481
    //   151: aload_3
    //   152: iconst_0
    //   153: invokevirtual 85	java/io/DataOutputStream:writeBoolean	(Z)V
    //   156: aload_1
    //   157: invokevirtual 102	com/flurry/sdk/di:n	()Ljava/util/Map;
    //   160: astore 8
    //   162: aload 8
    //   164: ifnonnull +336 -> 500
    //   167: aload_3
    //   168: iconst_0
    //   169: invokevirtual 36	java/io/DataOutputStream:writeShort	(I)V
    //   172: aload_1
    //   173: invokevirtual 106	com/flurry/sdk/di:o	()Ljava/util/List;
    //   176: astore 9
    //   178: aload 9
    //   180: ifnonnull +401 -> 581
    //   183: aload_3
    //   184: iconst_0
    //   185: invokevirtual 36	java/io/DataOutputStream:writeShort	(I)V
    //   188: aload_3
    //   189: aload_1
    //   190: invokevirtual 110	com/flurry/sdk/di:p	()Z
    //   193: invokevirtual 85	java/io/DataOutputStream:writeBoolean	(Z)V
    //   196: aload_1
    //   197: invokevirtual 113	com/flurry/sdk/di:r	()Ljava/util/List;
    //   200: astore 10
    //   202: aload 10
    //   204: ifnull +482 -> 686
    //   207: iconst_0
    //   208: istore 13
    //   210: iconst_0
    //   211: istore 14
    //   213: iconst_0
    //   214: istore 15
    //   216: iload 13
    //   218: aload 10
    //   220: invokeinterface 118 1 0
    //   225: if_icmpge +454 -> 679
    //   228: iload 14
    //   230: aload 10
    //   232: iload 13
    //   234: invokeinterface 122 2 0
    //   239: checkcast 124	com/flurry/sdk/da
    //   242: invokevirtual 126	com/flurry/sdk/da:a	()I
    //   245: iadd
    //   246: istore 14
    //   248: iload 14
    //   250: ldc 127
    //   252: if_icmple +445 -> 697
    //   255: iconst_5
    //   256: getstatic 18	com/flurry/sdk/dh:b	Ljava/lang/String;
    //   259: ldc 129
    //   261: invokestatic 134	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   264: iload 15
    //   266: istore 11
    //   268: aload_3
    //   269: aload_1
    //   270: invokevirtual 137	com/flurry/sdk/di:q	()I
    //   273: invokevirtual 91	java/io/DataOutputStream:writeInt	(I)V
    //   276: aload_3
    //   277: iload 11
    //   279: invokevirtual 36	java/io/DataOutputStream:writeShort	(I)V
    //   282: iconst_0
    //   283: istore 12
    //   285: iload 12
    //   287: iload 11
    //   289: if_icmpge +342 -> 631
    //   292: aload_3
    //   293: aload 10
    //   295: iload 12
    //   297: invokeinterface 122 2 0
    //   302: checkcast 124	com/flurry/sdk/da
    //   305: invokevirtual 140	com/flurry/sdk/da:b	()[B
    //   308: invokevirtual 144	java/io/DataOutputStream:write	([B)V
    //   311: iinc 12 1
    //   314: goto -29 -> 285
    //   317: aload_3
    //   318: aload 7
    //   320: invokeinterface 147 1 0
    //   325: invokevirtual 36	java/io/DataOutputStream:writeShort	(I)V
    //   328: aload 7
    //   330: invokeinterface 151 1 0
    //   335: invokeinterface 157 1 0
    //   340: astore 19
    //   342: aload 19
    //   344: invokeinterface 162 1 0
    //   349: ifeq -275 -> 74
    //   352: aload 19
    //   354: invokeinterface 166 1 0
    //   359: checkcast 168	java/util/Map$Entry
    //   362: astore 20
    //   364: aload_3
    //   365: aload 20
    //   367: invokeinterface 171 1 0
    //   372: checkcast 173	java/lang/String
    //   375: invokevirtual 44	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   378: aload_3
    //   379: aload 20
    //   381: invokeinterface 176 1 0
    //   386: checkcast 173	java/lang/String
    //   389: invokevirtual 44	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   392: aload_3
    //   393: iconst_0
    //   394: invokevirtual 74	java/io/DataOutputStream:writeByte	(I)V
    //   397: goto -55 -> 342
    //   400: astore 5
    //   402: aload_3
    //   403: astore 6
    //   405: bipush 6
    //   407: getstatic 18	com/flurry/sdk/dh:b	Ljava/lang/String;
    //   410: ldc 178
    //   412: aload 5
    //   414: invokestatic 181	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   417: aload 5
    //   419: athrow
    //   420: astore 4
    //   422: aload 6
    //   424: astore_3
    //   425: aload_3
    //   426: invokestatic 186	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   429: aload 4
    //   431: athrow
    //   432: aload_3
    //   433: iconst_1
    //   434: invokevirtual 85	java/io/DataOutputStream:writeBoolean	(Z)V
    //   437: aload_3
    //   438: aload_0
    //   439: aload_1
    //   440: invokevirtual 81	com/flurry/sdk/di:j	()Landroid/location/Location;
    //   443: invokevirtual 192	android/location/Location:getLatitude	()D
    //   446: invokevirtual 195	com/flurry/sdk/dh:a	(D)D
    //   449: invokevirtual 199	java/io/DataOutputStream:writeDouble	(D)V
    //   452: aload_3
    //   453: aload_0
    //   454: aload_1
    //   455: invokevirtual 81	com/flurry/sdk/di:j	()Landroid/location/Location;
    //   458: invokevirtual 202	android/location/Location:getLongitude	()D
    //   461: invokevirtual 195	com/flurry/sdk/dh:a	(D)D
    //   464: invokevirtual 199	java/io/DataOutputStream:writeDouble	(D)V
    //   467: aload_3
    //   468: aload_1
    //   469: invokevirtual 81	com/flurry/sdk/di:j	()Landroid/location/Location;
    //   472: invokevirtual 206	android/location/Location:getAccuracy	()F
    //   475: invokevirtual 210	java/io/DataOutputStream:writeFloat	(F)V
    //   478: goto -360 -> 118
    //   481: aload_3
    //   482: iconst_1
    //   483: invokevirtual 85	java/io/DataOutputStream:writeBoolean	(Z)V
    //   486: aload_3
    //   487: aload_1
    //   488: invokevirtual 99	com/flurry/sdk/di:m	()Ljava/lang/Long;
    //   491: invokevirtual 215	java/lang/Long:longValue	()J
    //   494: invokevirtual 51	java/io/DataOutputStream:writeLong	(J)V
    //   497: goto -341 -> 156
    //   500: aload_3
    //   501: aload 8
    //   503: invokeinterface 147 1 0
    //   508: invokevirtual 36	java/io/DataOutputStream:writeShort	(I)V
    //   511: aload 8
    //   513: invokeinterface 151 1 0
    //   518: invokeinterface 157 1 0
    //   523: astore 17
    //   525: aload 17
    //   527: invokeinterface 162 1 0
    //   532: ifeq -360 -> 172
    //   535: aload 17
    //   537: invokeinterface 166 1 0
    //   542: checkcast 168	java/util/Map$Entry
    //   545: astore 18
    //   547: aload_3
    //   548: aload 18
    //   550: invokeinterface 171 1 0
    //   555: checkcast 173	java/lang/String
    //   558: invokevirtual 44	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   561: aload_3
    //   562: aload 18
    //   564: invokeinterface 176 1 0
    //   569: checkcast 217	com/flurry/sdk/cx$a
    //   572: getfield 220	com/flurry/sdk/cx$a:a	I
    //   575: invokevirtual 91	java/io/DataOutputStream:writeInt	(I)V
    //   578: goto -53 -> 525
    //   581: aload_3
    //   582: aload 9
    //   584: invokeinterface 118 1 0
    //   589: invokevirtual 36	java/io/DataOutputStream:writeShort	(I)V
    //   592: aload 9
    //   594: invokeinterface 221 1 0
    //   599: astore 16
    //   601: aload 16
    //   603: invokeinterface 162 1 0
    //   608: ifeq -420 -> 188
    //   611: aload_3
    //   612: aload 16
    //   614: invokeinterface 166 1 0
    //   619: checkcast 223	com/flurry/sdk/db
    //   622: invokevirtual 225	com/flurry/sdk/db:e	()[B
    //   625: invokevirtual 144	java/io/DataOutputStream:write	([B)V
    //   628: goto -27 -> 601
    //   631: aload_3
    //   632: iconst_m1
    //   633: invokevirtual 91	java/io/DataOutputStream:writeInt	(I)V
    //   636: aload_3
    //   637: iconst_0
    //   638: invokevirtual 36	java/io/DataOutputStream:writeShort	(I)V
    //   641: aload_3
    //   642: iconst_0
    //   643: invokevirtual 36	java/io/DataOutputStream:writeShort	(I)V
    //   646: aload_3
    //   647: iconst_0
    //   648: invokevirtual 36	java/io/DataOutputStream:writeShort	(I)V
    //   651: aload_0
    //   652: aload_2
    //   653: invokevirtual 228	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   656: putfield 230	com/flurry/sdk/dh:a	[B
    //   659: aload_3
    //   660: invokestatic 186	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   663: return
    //   664: astore 4
    //   666: aconst_null
    //   667: astore_3
    //   668: goto -243 -> 425
    //   671: astore 5
    //   673: aconst_null
    //   674: astore 6
    //   676: goto -271 -> 405
    //   679: iload 15
    //   681: istore 11
    //   683: goto -415 -> 268
    //   686: iconst_0
    //   687: istore 11
    //   689: goto -421 -> 268
    //   692: astore 4
    //   694: goto -269 -> 425
    //   697: iinc 15 1
    //   700: iinc 13 1
    //   703: goto -487 -> 216
    //
    // Exception table:
    //   from	to	target	type
    //   21	64	400	java/io/IOException
    //   69	74	400	java/io/IOException
    //   74	118	400	java/io/IOException
    //   118	156	400	java/io/IOException
    //   156	162	400	java/io/IOException
    //   167	172	400	java/io/IOException
    //   172	178	400	java/io/IOException
    //   183	188	400	java/io/IOException
    //   188	202	400	java/io/IOException
    //   216	248	400	java/io/IOException
    //   255	264	400	java/io/IOException
    //   268	282	400	java/io/IOException
    //   292	311	400	java/io/IOException
    //   317	342	400	java/io/IOException
    //   342	397	400	java/io/IOException
    //   432	478	400	java/io/IOException
    //   481	497	400	java/io/IOException
    //   500	525	400	java/io/IOException
    //   525	578	400	java/io/IOException
    //   581	601	400	java/io/IOException
    //   601	628	400	java/io/IOException
    //   631	659	400	java/io/IOException
    //   405	420	420	finally
    //   4	21	664	finally
    //   4	21	671	java/io/IOException
    //   21	64	692	finally
    //   69	74	692	finally
    //   74	118	692	finally
    //   118	156	692	finally
    //   156	162	692	finally
    //   167	172	692	finally
    //   172	178	692	finally
    //   183	188	692	finally
    //   188	202	692	finally
    //   216	248	692	finally
    //   255	264	692	finally
    //   268	282	692	finally
    //   292	311	692	finally
    //   317	342	692	finally
    //   342	397	692	finally
    //   432	478	692	finally
    //   481	497	692	finally
    //   500	525	692	finally
    //   525	578	692	finally
    //   581	601	692	finally
    //   601	628	692	finally
    //   631	659	692	finally
  }

  public dh(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }

  double a(double paramDouble)
  {
    return Math.round(paramDouble * 1000.0D) / 1000.0D;
  }

  public byte[] a()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.dh
 * JD-Core Version:    0.6.2
 */