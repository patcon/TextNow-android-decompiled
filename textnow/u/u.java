package textnow.u;

public final class u extends c
{
  public u(String paramString)
  {
    super(paramString);
  }

  public final String a()
  {
    return "";
  }

  // ERROR //
  public final org.apache.http.entity.mime.content.ContentBody b(android.content.Context paramContext)
  {
    // Byte code:
    //   0: new 18	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 21	java/lang/StringBuilder:<init>	()V
    //   7: ldc 23
    //   9: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12: aload_0
    //   13: getfield 30	textnow/u/u:a	Ljava/lang/String;
    //   16: invokevirtual 27	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: invokevirtual 33	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   22: pop
    //   23: aload_1
    //   24: invokevirtual 39	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   27: aload_0
    //   28: getfield 30	textnow/u/u:a	Ljava/lang/String;
    //   31: invokestatic 45	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   34: invokevirtual 51	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   37: astore 8
    //   39: aload 8
    //   41: astore_3
    //   42: new 53	java/io/ByteArrayOutputStream
    //   45: dup
    //   46: invokespecial 54	java/io/ByteArrayOutputStream:<init>	()V
    //   49: astore 5
    //   51: aload_3
    //   52: aload 5
    //   54: invokestatic 59	textnow/q/n:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   57: aload 5
    //   59: invokevirtual 63	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   62: astore 10
    //   64: aload_3
    //   65: invokestatic 66	textnow/q/n:a	(Ljava/io/InputStream;)V
    //   68: aload 5
    //   70: invokestatic 69	textnow/q/n:a	(Ljava/io/OutputStream;)V
    //   73: aconst_null
    //   74: astore 11
    //   76: aload 10
    //   78: ifnull +96 -> 174
    //   81: aload 10
    //   83: arraylength
    //   84: istore 12
    //   86: aconst_null
    //   87: astore 11
    //   89: iload 12
    //   91: ifle +83 -> 174
    //   94: new 71	android/graphics/BitmapFactory$Options
    //   97: dup
    //   98: invokespecial 72	android/graphics/BitmapFactory$Options:<init>	()V
    //   101: astore 13
    //   103: aload 13
    //   105: iconst_1
    //   106: putfield 76	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   109: aload 10
    //   111: iconst_0
    //   112: aload 10
    //   114: arraylength
    //   115: aload 13
    //   117: invokestatic 82	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   120: pop
    //   121: aload 13
    //   123: getfield 86	android/graphics/BitmapFactory$Options:outWidth	I
    //   126: istore 15
    //   128: aload 13
    //   130: getfield 89	android/graphics/BitmapFactory$Options:outHeight	I
    //   133: istore 16
    //   135: aload 10
    //   137: arraylength
    //   138: ldc 90
    //   140: if_icmpge +76 -> 216
    //   143: iload 15
    //   145: sipush 1024
    //   148: if_icmpgt +68 -> 216
    //   151: iload 16
    //   153: sipush 1024
    //   156: if_icmpgt +60 -> 216
    //   159: new 92	org/apache/http/entity/mime/content/ByteArrayBody
    //   162: dup
    //   163: aload 10
    //   165: ldc 94
    //   167: ldc 96
    //   169: invokespecial 99	org/apache/http/entity/mime/content/ByteArrayBody:<init>	([BLjava/lang/String;Ljava/lang/String;)V
    //   172: astore 11
    //   174: aload 11
    //   176: areturn
    //   177: astore 6
    //   179: aconst_null
    //   180: astore 5
    //   182: aconst_null
    //   183: astore_3
    //   184: aload_3
    //   185: invokestatic 66	textnow/q/n:a	(Ljava/io/InputStream;)V
    //   188: aload 5
    //   190: invokestatic 69	textnow/q/n:a	(Ljava/io/OutputStream;)V
    //   193: aconst_null
    //   194: areturn
    //   195: astore_2
    //   196: aconst_null
    //   197: astore_3
    //   198: aload_2
    //   199: astore 4
    //   201: aconst_null
    //   202: astore 5
    //   204: aload_3
    //   205: invokestatic 66	textnow/q/n:a	(Ljava/io/InputStream;)V
    //   208: aload 5
    //   210: invokestatic 69	textnow/q/n:a	(Ljava/io/OutputStream;)V
    //   213: aload 4
    //   215: athrow
    //   216: aload 10
    //   218: sipush 1024
    //   221: invokestatic 104	textnow/q/f:a	([BI)Landroid/graphics/Bitmap;
    //   224: astore 17
    //   226: aconst_null
    //   227: astore 11
    //   229: aload 17
    //   231: ifnull -57 -> 174
    //   234: new 53	java/io/ByteArrayOutputStream
    //   237: dup
    //   238: invokespecial 54	java/io/ByteArrayOutputStream:<init>	()V
    //   241: astore 18
    //   243: aload 17
    //   245: getstatic 110	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   248: bipush 75
    //   250: aload 18
    //   252: invokevirtual 116	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   255: pop
    //   256: new 92	org/apache/http/entity/mime/content/ByteArrayBody
    //   259: dup
    //   260: aload 18
    //   262: invokevirtual 63	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   265: ldc 94
    //   267: ldc 96
    //   269: invokespecial 99	org/apache/http/entity/mime/content/ByteArrayBody:<init>	([BLjava/lang/String;Ljava/lang/String;)V
    //   272: areturn
    //   273: astore 21
    //   275: aload 21
    //   277: astore 4
    //   279: aconst_null
    //   280: astore 5
    //   282: goto -78 -> 204
    //   285: astore 4
    //   287: goto -83 -> 204
    //   290: astore 20
    //   292: aconst_null
    //   293: astore 5
    //   295: goto -111 -> 184
    //   298: astore 9
    //   300: goto -116 -> 184
    //
    // Exception table:
    //   from	to	target	type
    //   0	39	177	java/lang/Exception
    //   0	39	195	finally
    //   42	51	273	finally
    //   51	64	285	finally
    //   42	51	290	java/lang/Exception
    //   51	64	298	java/lang/Exception
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.u.u
 * JD-Core Version:    0.6.2
 */